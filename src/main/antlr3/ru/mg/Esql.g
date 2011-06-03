grammar Esql;

options {
  language = Java;
  output = AST;
}

module	:	statement+;

//Statement
statement	:	(var_decl | set_stat | if_stat | ret_stat | beginend_stat | while_stat | 
			 attach_stat | detach_stat | call_stat | case_stat | create_stat | 
			 func_decl_stat) ';'!
		;
		
/*
----------------------------------------------
	DECLARE statements
----------------------------------------------	
*/
var_decl	:	var_only_decl | const_decl| var_ns_decl | var_ctor_decl 
		;
		
var_only_decl	:	DECLARE var_name (',' var_name)* var_modifier? type
		->	^(VAR ^(var_name type var_modifier?))+
		;
const_decl	:	DECLARE var_name (',' var_name)* var_modifier? CONSTANT type expr
		->	^(CONSTANT ^(var_name type var_modifier?))+ ^(INIT var_name expr)+	
		;				

var_ctor_decl	:	DECLARE var_name (',' var_name)* var_modifier? type expr
		->	^(VAR ^(var_name type var_modifier?))+ ^(INIT var_name expr)+
		;
		
var_ns_decl	:	DECLARE var_name (',' var_name)* var_modifier? (NAMESPACE | NAME) expr
		->	^(NS ^(var_name var_modifier?))+ ^(INIT var_name expr)+ 
		;		
		
fragment 
  var_modifier	:	SHARED | EXTERNAL
		;						
fragment
  var_name	: 	ID | LITERAL
		;
// End of variable declarations	


/*
-------------------------------------------
	SET statement
-------------------------------------------
*/
set_stat	:	SET eq_expr
		->	^(SET eq_expr)
		;
// End of set statement		
		
/*
-------------------------------------------
	If statement
-------------------------------------------
*/			

if_stat		:	IF ifexpr THEN 
			  statement*
			(ELSEIF elifexpr THEN
			  elifstatement*)*
			(ELSE elsestatement*)?
			END IF
		
		->	^(IF ^(COND ifexpr statement*) ^(COND elifexpr elifstatement*)* ^(ELSE elsestatement*)?)				 
		;
fragment
  ifexpr	:	expr;
fragment 
  elifexpr	:	expr;
fragment
  elifstatement	:	statement;
fragment
  elsestatement	:	statement;
// End of if statement
	
// return statement
ret_stat	:	RETURN^ expr? ;	

/*
-------------------------------------------
	begin ... end statement
-------------------------------------------
*/
beginend_stat	:	(label ':')? BEGIN (NOT? ATOMIC)?
			  statement*
			END label?
		->	^(BEGIN 
			  ^(PROPS ^(LABEL label)? ^(ATOMICITY NOT? ATOMIC)? )? 
			  statement*)
		;
fragment
  label		:	ID;
// End begin ... end statement

// While statement
while_stat	:	WHILE expr DO
			  statement*
			END WHILE
		->	^(WHILE ^(COND expr) statement*)  
		;
		
/*
-------------------------------------------
	attach and detatch statements
-------------------------------------------
*/
attach_stat	: 	ATTACH dynamic_ref TO field_ref 
			AS sibling
		->	^(ATTACH dynamic_ref field_ref sibling)	
		;
detach_stat	:	DETACH^ expr;

fragment 
  dynamic_ref	:	expr;
fragment
  field_ref	:	expr;
fragment
  sibling	:	(FIRSTCHILD | LASTCHILD | PREVIOUSSIBLING | NEXTSIBLING);  
  
// End of attach and detatch statements	

/*
-------------------------------------------
	call statement
-------------------------------------------
*/
call_stat	: 	CALL dot_expr '(' params? ')' qualifiers? (INTO target)?
		->	^(CALL dot_expr ^(PARAMS params)? qualifiers?)
		;			
fragment
  routine_name	: 	ID
  		;
fragment  		
  qualifiers	:	in_sch | ext_sch
		;  
fragment
  in_sch	:	(IN^ dbschema)
  		;
fragment
  ext_sch	:	(EXTERNAL SCHEMA^ dbschema)
  		; 		 		
fragment
  dbschema	:	expr;  			  		
fragment  		
  params	:	param (',' param)*
		;  		  		
fragment
  param		:	expr
		;
fragment
  target	:	expr;			
				
// End of call statement	

/*
-------------------------------------------
	case statement
-------------------------------------------
*/
case_stat	:	CASE case_expr?
			  (WHEN when_expr THEN then_sts)*
			  (ELSE elsestatement+)?
			END CASE  
		->	^(CASE ^(COND case_expr)? ^(WHEN when_expr then_sts)* ^(ELSE elsestatement*)?)
		;
fragment
  case_expr	:	expr;
fragment
  when_expr  	:	expr;
fragment
  then_sts	:	statement+;  
  
// End of case statement


/*
-------------------------------------------
	create statement
-------------------------------------------
*/
create_stat	:	CREATE field_clause 
			expr (AS alias)? (DOMAIN dexpr)? props?
		->	^(CREATE field_clause ^(AS alias)? ^(DOMAIN dexpr) ^(PROPS props)?)	
		;
		
fragment 
  props		:	(repeat_clause | from_clause | parse_clause);			
fragment
  field_clause	:	(FIELD | (PREVIOUSSIBLING | NEXTSIBLING | FIRSTCHILD | LASTCHILD) OF!)
  		;					
fragment
  alias		:	expr
  		;
fragment
  dexpr		:	expr
   		; 
fragment
  repeat_clause	:	REPEAT (VALUE expr)?
  		;
fragment
  from_clause	:	FROM^ expr
  		;
fragment
  parse_clause	:	PARSE '(' expr (',' expr)* ')'
  		->	^(PARSE expr*)
  		;    		  		  		  		
  				
// End of create statement

/*
-------------------------------------------------------
	Function and procedure declaration
-------------------------------------------------------
*/
func_decl_stat	:	CREATE func_type func_name '(' params_decl? ')' (RETURNS ret_type)? (LANGUAGE language)?
			  statement?	 
		-> ^(func_type ^(func_name ^(PARAMS params_decl)? ^(RETURNS ret_type)? ^(LANGUAGE language)? ^(BODY statement)?))		
		;
fragment
  func_name	: 	ID
  		;
fragment
  func_type	:	FUNCTION | PROCEDURE
  		;
fragment
  ret_type	:	type
  		; 
fragment
  params_decl	:	param_decl (',' param_decl)*
		->	(param_decl)*
		;
fragment
  param_decl	:	param_modifier? param_name CONSTANT? type
		->	^(type param_name param_modifier?)
		;     
fragment
  param_modifier	
  		:	IN | OUT | INOUT
  		;
fragment
  param_name	:	ID
  		;
fragment
  language	:	ESQL | DATABASE | JAVA
  		;	  		


// Expression
expr	:	dot_expr;

dot_expr:	logic_expr ('.'^ logic_expr)*;
	
logic_expr	
	:	eq_expr (BINARY_LOGICAL_OP^ eq_expr)*;
	
eq_expr	:	sc_expr	(EQ_OP^ sc_expr)*;

sc_expr	:	concat_expr (SIMPLE_COMPARE_OP^ concat_expr)*;

concat_expr	
	:	add_expr (CONCAT_OP^ add_expr)*;

add_expr
	:	mult_expr ( (PLUS_OP^ | MINUS_OP^) mult_expr )*;

mult_expr
	:	ulogic_expr ( (MULT_OP^ | DIV_OP^) ulogic_expr)*;

ulogic_expr	
	:	NOT^? arr_expr;
	
arr_expr:	atom ('['^ atom)* (']'!)*;	

	
atom	:	ID | MINUS_OP^? INT | STRING | BOOL | NULL | LITERAL | '('! expr ')'!;

// Simple comparison operators
SIMPLE_COMPARE_OP
	:	'>' | '<' | '>=' | '<=' | '<>';
EQ_OP	:	'=';	

// Complex comparison operators
CC_OP 	:	'BETWEEN';

// Logical binary operators
BINARY_LOGICAL_OP : 'AND' | 'OR';

PLUS_OP	:	'+';
MINUS_OP:	'-';
MULT_OP	:	'*';
DIV_OP	:	'/';

CONCAT_OP
	:	'||';
	
/*
-------------------------------
  AST node names
-------------------------------
*/
COND		:	'COND';
LABEL		:	'LABEL';
INIT		:	':=';
VAR		:	'VAR';
NS		:	'NS';
PROPS		:	'PROPS';
ATOMICITY	:	'ATOM PROP';
PARAMS		:	'PARAMS';
BODY		:	'BODY';
// End AST node names
	
// ESQL types
type		:	T_BOOL | T_BOOLEAN | T_DATE | T_TIME | T_GMTTIME | T_TIMESTAMP | T_GMTTIMESTAMP | T_CHAR | T_CHARACTER 
		| 	T_DEC | T_DECIMAL | T_FLOAT | T_INT | T_INTEGER  | T_ROW | T_BLOB | T_BIT | REFERENCE | T_REF
		;
// ESQL keywords
AS	:	'AS';
ATOMIC	:	'ATOMIC';
ATTACH	:	'ATTACH';
BEGIN 	:	'BEGIN';
CALL	:	'CALL';
CASE	:	'CASE';
CATALOG :	'CATALOG';
CONSTANT:	'CONSTANT';
CONTINUE:	'CONTINUE';
CREATE	:	'CREATE';
DATABASE:	'DATABASE';
DECLARE	:	'DECLARE';
DELETE	:	'DELETE';
DETACH	:	'DETACH';
DO	:	'DO';
DOMAIN 	:	'DOMAIN';
ELSE	:	'ELSE';
ELSEIF	:	'ELSEIF';
END	:	'END';
ESCAPE 	:	'ESCAPE';
ESQL	:	'ESQL';
EVAL	:	'EVAL';
EVENT	:	'EVENT';
EXCEPTION
	:	'EXCEPTION';
EXIT	:	'EXIT';
EXTERNAL:	'EXTERNAL';
FOR	:	'FOR';
FIELD	:	'FIELD';
FIRSTCHILD
	:	'FIRSTCHILD';
FROM	:	'FROM';	
FULL	:	'FULL';
FUNCTION:	'FUNCTION';
JAVA	:	'JAVA';
HANDLER	:	'HANDLER';
IDENTITY:	'IDENTITY';
IF	:	'IF';
IN	:	'IN';
INSERT	:	'INSERT';
INTO	:	'INTO';
IS	:	'IS';
ITERATE	:	'ITERATE';
INOUT	:	'INOUT';
LANGUAGE:	'LANGUAGE';
LASTCHILD
	:	'LASTCHILD';
LEAVE	:	'LEAVE';
LIKE	:	'LIKE';
LOG	:	'LOG';
LOOP	:	'LOOP';
MESSAGE	:	'MESSAGE';
MODULE 	:	'MODULE';
MOVE	:	'MOVE';
NAME	:	'NAME';
NAMESPACE
	:	'NAMESPACE';
NEXTSIBLING
	:	'NEXTSIBLING';
NOT	:	'NOT';	
OF	:	'OF';
OPTIONS	:	'OPTIONS';
OUT	:	'OUT';
PARENT	:	'PARENT';
PARSE	:	'PARSE';
PASSTHRU:	'PASSTHRU';
PREVIOUSSIBLING
	:	'PREVIOUSSIBLING';
PROCEDURE
	:	'PROCEDURE';
PROPAGATE
	:	'PROPAGATE';
REFERENCE
	:	'REFERENCE TO';
REPEAT	:	'REPEAT';
RESIGNAL:	'RESIGNAL';
RETURNS	:	'RETURNS';
RETURN	:	'RETURN';
SCHEMA	:	'SCHEMA';
SET	:	'SET';
SEVERITY:	'SEVERITY';
SHARED	:	'SHARED';
TERMINAL:	'TERMINAL';
THEN	:	'THEN';
THROW	:	'THROW';
TRACE	:	'TRACE';
TO	:	'TO';
TYPE	:	'TYPE';
VALUE	:	'VALUE';
VALUES	:	'VALUES';
WHEN	:	'WHEN';
WHILE	:	'WHILE';
UNTIL	:	'UNTIL';
UPDATE	:	'UPDATE';
USER	:	'USER';

// ESQL data types
T_BIT	:	'BIT';
T_BLOB	:	'BLOB';
T_BOOL	:	'BOOL';	
T_BOOLEAN
	:	'BOOLEAN';
T_DATE	:	'DATE';
T_TIME	:	'TIME';
T_GMTTIME	:	'GMTTIME';
T_TIMESTAMP
	:	'TIMESTAMP';
T_GMTTIMESTAMP
	:	'GMTTIMESTAMP';
T_CHAR	:	'CHAR';
T_CHARACTER
	:	'CHARACTER';
T_DEC	:	'DEC';	
T_DECIMAL	
	:	'DECIMAL';
T_FLOAT	:	'FLOAT';
T_INT	:	'INT';
T_INTEGER	
	:	'INTEGER';
T_REF	:	'REF';	
	
T_ROW	:	'ROW';

// ESQL data types values
NULL	:	'NULL';
BOOL	:	'TRUE' | 'FALSE';
INT	:	('0'..'9')+;
STRING	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';
LITERAL	:	'\'' .+ '\'';

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

//Standard syntactic elements 

COMMENT
    :   '--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;



