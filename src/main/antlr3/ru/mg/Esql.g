grammar Esql;

options {
  language = Java;
  output = AST;
}

/*
-------------------------------
  AST node names
-------------------------------
*/
tokens {
	COND;				
	INIT;		
	VAR;		
	NS;		
	PROPS;		
	ATOMICITY;	
	PARAMS;		
	BODY;
	ESQL_FUNCTION_CALL;
	
}
// End AST node names

module	:	schema_stat	
	;

//Statement
statement	:	(var_decl | set_stat | if_stat | ret_stat | beginend_stat | while_stat | 
			 attach_stat | detach_stat | call_stat | case_stat | create_stat | 
			 func_decl_stat | handler_stat | delete_from_stat | delete_stat | eval_stat |
			 for_stat | insert_stat | iterate_stat | leave_stat | log_stat | loop_stat | 
			 move_stat | pass_stat |  propagate_stat | module_stat | repeat_stat | 
			 resignal_stat | throw_stat | upd_stat) ';'!
		;
		
/*
-------------------------------------------
	attach statement
-------------------------------------------
*/
attach_stat	: 	ATTACH dynamic_ref = expr TO field_ref = expr
			AS sibling
		->	^(ATTACH $dynamic_ref $field_ref sibling)	
		;
fragment
  sibling	:	(FIRSTCHILD | LASTCHILD | PREVIOUSSIBLING | NEXTSIBLING);  
  
// End of attach and detatch statements	

/*
-------------------------------------------
	BROKER SCHEMA statement
-------------------------------------------
*/
schema_stat	:	(BROKER SCHEMA schema_name)? (PATH schema_path ';'!)? esql_contents
		;
fragment
  schema_name	:	ID ('.'^ ID)*
  		;
fragment
  schema_path	:	schema_name ('\,' schema_name)* -> schema_name+	
  		;
fragment
  esql_contents	:	((func_decl_stat | var_decl | module_stat) ';'!)+
  		;  		  				  		
// End of BROKER SCHEMA statement

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
		
/*
-------------------------------------------
	call statement
-------------------------------------------
*/
call_stat	: 	CALL dot_expr '(' params? ')' qualifiers? (INTO expr)?
		->	^(CALL dot_expr ^(PARAMS params)? ^(INTO expr)? qualifiers?)
		;			
fragment
  routine_name	: 	ID
  		;
fragment  		
  qualifiers	:	in_sch | ext_sch
		;  
fragment
  in_sch	:	(IN^ expr)
  		;
fragment
  ext_sch	:	(EXTERNAL SCHEMA^ expr)
  		; 		 		
fragment  		
  params	:	expr
		; 
// End of call statement	

/*
-------------------------------------------
	case statement
-------------------------------------------
*/
case_stat	:	CASE (case_expr = expr)?
			  (WHEN wexpr THEN then_sts)*
			  (ELSE elsestatement+)?
			END CASE  
		->	^(CASE ^(COND $case_expr)? ^(WHEN wexpr then_sts)* ^(ELSE elsestatement*)?)
		;
fragment
  wexpr		:	expr
  		;
fragment
  then_sts	:	statement+;  
  
// End of case statement

/*
-------------------------------------------
	create statement
-------------------------------------------
*/
create_stat	:	CREATE qualifier 
			trg = expr 
			(AS alias = expr)? 
			(DOMAIN dexpr = expr)? props_clause
		->	^(CREATE qualifier $trg ^(AS $alias)? ^(DOMAIN $dexpr)? ^(PROPS props_clause)?)	
		;
fragment
  props_clause	:	values_clause | from_clause | parse_clause
  		;	
fragment
  qualifier	:	FIELD | ((PREVIOUSSIBLING | NEXTSIBLING | FIRSTCHILD | LASTCHILD) OF!)
		;
fragment
  from_clause	:	FROM expr
  		;
fragment
  parse_clause	:	PARSE '(' expr ')'
  		->	^(PARSE expr)
  		;		
fragment
  values_clause	:	REPEAT	| ident_clause | type_clause (VALUE expr)?
  		;
fragment
  ident_clause	:	IDENTITY^ dot_expr 
  		;
fragment
  type_clause	:	(TYPE expr)? (NAMESPACE expr)? (NAME expr)?
  		;  		  		  		    		  		  		  		
  				
// End of create statement

/* 
---------------------------------
	Module declaration
---------------------------------
*/	
module_stat	:	CREATE module_type MODULE module_name 
				statement*
			END MODULE 
			
		-> 	^(MODULE module_name module_type statement*)
		;	
		
module_type	:	'COMPUTE' | 'DATABASE' | 'FILTER';
	
module_name 	:	ID;

// End module declarationrepeat_stat

/*
-------------------------------------------------------
	Function and procedure declaration
-------------------------------------------------------propagate_stat
*/
func_decl_stat	:	CREATE func_type func_name '(' params_decl? ')' (RETURNS type)? (LANGUAGE language)?
			  statement?	 
		-> ^(func_type ^(func_name ^(PARAMS params_decl)? ^(RETURNS type)? ^(LANGUAGE language)? ^(BODY statement)?))		
		;
fragment
  func_name	: 	ID
  		;
fragment
  func_type	:	FUNCTION | PROCEDURE
  		;
fragment
  params_decl	:	param_decl ('\,' param_decl)*
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

/*
----------------------------------------------
	DECLARE statements
----------------------------------------------	
*/
var_decl	:	var_only_decl | const_decl| var_ns_decl | var_ctor_decl 
		;
		
var_only_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? type
		->	^(VAR ^(var_name type var_modifier?))+
		;
const_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? CONSTANT type expr
		->	^(CONSTANT ^(var_name type var_modifier?))+ ^(INIT var_name expr)+	
		;				

var_ctor_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? type expr
		->	^(VAR ^(var_name type var_modifier?))+ ^(INIT var_name expr)+
		;
		
var_ns_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? (NAMESPACE | NAME) expr
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
	DECLARE HANDLER statement
-------------------------------------------
*/
handler_stat	:	DECLARE handler_type HANDLER FOR states statement
		->	^(HANDLER handler_type ^(FOR states) ^(BODY statement))
		;
fragment 
  handler_type	:	CONTINUE | EXIT
  		;			
fragment 
  states	: 	state_item ('\,' state_item)* 
		-> 	state_item+
		;
fragment 
  state_item	:	SQLSTATE^ (VALUE^ | LIKE^)? LITERAL (ESCAPE^ LITERAL)?
  		;  		  			
			
// End of DECLARE HANDLER statement

/*
-------------------------------------------
	DELETE FROM statement
-------------------------------------------
*/
delete_from_stat:	DELETE FROM table_ref (AS ID)? where_clause?
		->	^(DELETE table_ref ^(AS ID)? where_clause?)
		;
fragment
  table_ref	:	DATABASE ('.' data_source_clause)+
  		->	^(DATABASE data_source_clause+)
  		;
fragment
  data_source_clause
  		:	ID | ('{'! expr '}'!)
  		;
fragment
  where_clause	:	WHERE^ expr
  		;  		 		  				 
// End of delete from statement

/*
-------------------------------------------
	DELETE statement
-------------------------------------------
*/
delete_stat	:	DELETE^ qualifier expr
		;
/*
-------------------------------------------
	DETACH statement
-------------------------------------------
*/		
detach_stat	:	DETACH^ expr;

/*
-------------------------------------------
	DETACH statement
-------------------------------------------
*/		
eval_stat	:	EVAL^ '('! expr ')'!
		;
		
/*
-------------------------------------------
	For statement
-------------------------------------------
*/
for_stat	:	FOR expr AS alias = expr DO
			  statement+
			END FOR
		->	^(FOR expr ^(AS $alias) statement+)
		;							
		
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

/*
-------------------------------------------
	Insert statement
-------------------------------------------
*/			
insert_stat	:	INSERT INTO table_ref '(' column_name ('\,' column_name)* ')' VALUES value
		->	^(INSERT table_ref ^(PARAMS column_name+) ^(VALUES value)) 
		;
fragment
  column_name	:	ID | LITERAL
  		;
fragment
  value		:	expr
  		;	  		
// End of insert statement

/*
-------------------------------------------
	Iterate and leave statements
-------------------------------------------
*/			
iterate_stat	:	ITERATE^ label
		;
leave_stat	:	LEAVE^ label
		;
		
/*
-------------------------------------------
	LOG statement
-------------------------------------------
*/
log_stat	:	LOG log_type log_kind? log_options (VALUES  value )?
		->	^(LOG ^(PROPS log_type log_options? log_kind?) ^(VALUES value)?)
		;	
fragment
  log_type	:	EVENT | (USER! TRACE)
  		;
fragment
  log_kind	:	FULL? EXCEPTION -> ^(EXCEPTION FULL?)
  		;  		
fragment
  log_options	:	(SEVERITY expr)? (CATALOG expr)? (MESSAGE expr)?
  		; 
// End of LOG statement

/*
-------------------------------------------
	LOOP statement
-------------------------------------------
*/
loop_stat	:	s_loop | l_loop
		;
fragment
  s_loop	:	LOOP 
  			  statement*
  			END LOOP
		->	^(LOOP statement*)  			
  		;
fragment
  l_loop	:	label ':' LOOP
  			  statement*
  			END LOOP label
  		-> 	^(LOOP ^(PROPS label) statement*)	  
  		;
// End of LOOP statement  		
  				 		 						  		
/*
-------------------------------------------
	MOVE statement
-------------------------------------------
*/
move_stat	:	MOVE^ trg = expr to_clause
		;
fragment
  to_clause	:	(TO^ expr) | PARENT^ | (sibling^ (type_clause | ident_clause | REPEAT^ TYPE? NAME?))
  		;
// End of MOVE statement

/*
-------------------------------------------
	PASSTHRU statement
-------------------------------------------
*/
pass_stat	:	PASSTHRU^  db_clause | ('('! values ')'!)
		;
fragment
  db_clause	:	expr (TO table_ref)? (VALUES values)?
  		->	expr ^(TO table_ref)? ^(VALUES values)?
  		;
fragment
  values	:	expr
  		;
// End of PASSTHRU statement

/*
-------------------------------------------
	PROPAGATE statement
-------------------------------------------
*/
propagate_stat	:	PROPAGATE (propagate_to msg_src)?
		->	^(PROPAGATE propagate_to? msg_src?)
		;
fragment
  propagate_to	:	TO (TERMINAL term= expr) | (LABEL lbl = expr)
  		->	^(TO (TERMINAL $term)? (LABEL $lbl)? )
  		;
fragment
  msg_src	:	(ENVIRONMENT^ expr)? (MESSAGE^ expr)? (EXCEPTION^ expr)? (FINALIZE | DELETE (DEFAULT | NONE)?)?
  		;
fragment
  controls	:	fin | del
  		;
fragment
  fin		:	FINALIZE^  (DEFAULT | NONE)?
  		;
fragment
  del		:	DELETE^ (DEFAULT | NONE)?
  		;
  		
/*
-------------------------------------------
	REPEAT statement
-------------------------------------------
*/
repeat_stat	:	s_repeat | l_repeat
		;
		
s_repeat	:	REPEAT
			  statement*
			UNTIL expr
			END REPEAT
		->	^(REPEAT expr statement*)	
		;
		
l_repeat	:	label ':' 
			REPEAT
			  statement*
			UNTIL expr
			END REPEAT label
		-> 	^(REPEAT ^(PROPS label) expr statement*)
		;		  		
// End of  REPEATE statement		  		 		

// Resignal statement
resignal_stat	:	RESIGNAL^
		;  			
  					
// return statement
ret_stat	:	RETURN^ expr? ;	

/*
-------------------------------------------
	SET statement
-------------------------------------------
*/
set_stat	:	SET expr
		->	^(SET expr)
		;
// End of set statement	

/*
-------------------------------------------
	THROW statement
-------------------------------------------
*/
throw_stat	:	THROW USER? EXCEPTION (SEVERITY severity = expr)? (CATALOG catalog = expr)? (MESSAGE msg = expr)? 
			throw_values?
		->	^(THROW ^(PROPS USER? ^(SEVERITY $severity)? ^(CATALOG $catalog)? ^(MESSAGE $msg)? ) throw_values?)	
		;
fragment 
  throw_values	:	VALUES '(' expr  ')'
  		->	^(VALUES expr)
  		;			
// End THROW statement
/*
-------------------------------------------
	UPDATE statement
-------------------------------------------
*/
upd_stat	:	UPDATE table_ref (AS alias=expr)?
			  SET column_clause+
			(WHERE where_expr=expr)?
		->	^(UPDATE table_ref ^(AS $alias)? ^(SET column_clause+) ^(WHERE $where_expr)?)	
		;
fragment
  column_clause	:	column_name '=' expr
  		->	^(INIT column_name expr)
  		;			
// End of UPDATE statement				

// While statement
while_stat	:	s_while | l_while
		;
fragment
  s_while	:	WHILE expr DO
			  statement*
			END WHILE
		->	^(WHILE ^(COND expr) statement*)  
		;
fragment 
  l_while	:	label ':' WHILE expr DO
			  statement*
			END WHILE label
		->	^(WHILE ^(PROPS label) ^(COND expr) statement*)  
  		;
  		
// ESQL Functions

/*
-------------------------------------------
	ESQL Database state functions
-------------------------------------------
*/
f_sql_code
	:	 SQLCODE
	->	^(ESQL_FUNCTION_CALL SQLCODE)
	;
f_sql_err_text	
	:	SQLERRORTEXT
	->	^(ESQL_FUNCTION_CALL SQLERRORTEXT)
	;	
f_sql_nerror
	:	SQLNATIVEERROR
	->	^(ESQL_FUNCTION_CALL SQLNATIVEERROR)
	;
f_sql_state
	:	SQLSTATE
	->	^(ESQL_FUNCTION_CALL SQLSTATE)
	;
/*
-------------------------------------------
	ESQL datetime functions
-------------------------------------------
*/
f_extract
	:	EXTRACT	'(' extract_part FROM expr ')'
	->	^(ESQL_FUNCTION_CALL ^(EXTRACT extract_part expr))
	;

fragment
  extract_part
  	:	YEAR | MONTH | DAY | HOUR | MINUTE | SECOND | DAYS | DAYOFYEAR | DAYOFWEEK | MONTHS | 
  		QUARTEROFYEAR | QUARTERS | WEEKS | WEEKOFYEAR | WEEKOFMONTH | ISLEAPYEAR
  	;	
f_cur_date	
	:	CURRENT_DATE
	->	^(ESQL_FUNCTION_CALL CURRENT_DATE)
	;
f_cur_time
	:	CURRENT_TIME
	->	^(ESQL_FUNCTION_CALL CURRENT_TIME)
	;
f_cur_timestamp
	:	CURRENT_TIMESTAMP
	->	^(ESQL_FUNCTION_CALL CURRENT_TIMESTAMP)
	;
f_cur_gmt_date	
	:	CURRENT_GMTDATE			  	
	->	^(ESQL_FUNCTION_CALL CURRENT_GMTDATE)
	;
f_cur_gmt_time
	:	CURRENT_GMTTIME
	->	^(ESQL_FUNCTION_CALL CURRENT_GMTTIME)
	;
f_cur_gmt_timestamp
	:	CURRENT_GMTTIMESTAMP		
	->	^(ESQL_FUNCTION_CALL CURRENT_GMTTIMESTAMP)
	;
f_loc_timezone
	:	LOCAL_TIMEZONE	
	->	^(ESQL_FUNCTION_CALL LOCAL_TIMEZONE)
	;
	

// Expression
expr	:	is_expr;

is_expr	:	in_expr (IS^ NOT? (BOOL | 'INF' | '+INF' | '-INF' | 'INFINITY' | '+INFINITY' | '-INFINITY' | 'NAN' | 'NULL' | 'NUM' | 'NUMBER' | 'UNKNOWN'))?;  		

in_expr	:	exists_expr (NOT? IN^ lst_expr)*;

exists_expr
	:	EXISTS^? between_expr;	

between_expr	
	:	colon_expr (NOT? BETWEEN_OP^ (ASYMMETRIC | SYMMETRIC)? colon_expr)*;

colon_expr
	:	dot_expr (':'^ dot_expr)*;
	
dot_expr:	logic_expr ('.'^ logic_expr)*;
	
logic_expr:	eq_expr (BINARY_LOGICAL_OP^ eq_expr)*;
	
eq_expr	:	sc_expr	(EQ_OP^ sc_expr)*;

sc_expr	:	concat_expr (SIMPLE_COMPARE_OP^ concat_expr)*;

concat_expr	
	:	lst_expr (CONCAT_OP^ lst_expr)*;

lst_expr:	add_expr ('\,' add_expr)* -> add_expr+;		

add_expr
	:	mult_expr ( (PLUS_OP^ | MINUS_OP^) mult_expr )*;

mult_expr
	:	ulogic_expr ( (MULT_OP^ | DIV_OP^) ulogic_expr)*;

ulogic_expr	
	:	NOT^? arr_expr;
	
arr_expr:	atom ('['^ atom? ']'!)*;
	
atom	:	f_sql_code | f_sql_err_text| f_sql_nerror | f_sql_state | 
		f_extract | f_cur_date | f_cur_time | f_cur_timestamp | f_cur_gmt_date | f_cur_gmt_time | f_cur_gmt_timestamp | f_loc_timezone |
		ID | MINUS_OP^? INT | STRING | BOOL | NULL | LITERAL | '('! expr ')'!;


// Simple comparison operators
SIMPLE_COMPARE_OP
	:	'>' | '<' | '>=' | '<=' | '<>';
EQ_OP	:	'=';	

// Complex comparison operators
BETWEEN_OP 	:	'BETWEEN';

// Logical binary operators
BINARY_LOGICAL_OP : 'AND' | 'OR';

PLUS_OP	:	'+';
MINUS_OP:	'-';
MULT_OP	:	'*';
DIV_OP	:	'/';

CONCAT_OP
	:	'||';

	
// ESQL types
type		:	T_BOOL | T_BOOLEAN | T_DATE | T_TIME | T_GMTTIME | T_TIMESTAMP | T_GMTTIMESTAMP | T_CHAR | T_CHARACTER 
		| 	T_DEC | T_DECIMAL | T_FLOAT | T_INT | T_INTEGER  | T_ROW | T_BLOB | T_BIT | REFERENCE | T_REF | REF
		;
		
//ESQL functions
SQLCODE		:	'SQLCODE';
SQLERRORTEXT	:	'SQLERRORTEXT';
SQLNATIVEERROR	:	'SQLNATIVEERROR';
EXTRACT		:	'EXTRACT';
CURRENT_DATE	:	'CURRENT_DATE';
CURRENT_TIME	:	'CURRENT_TIME';
CURRENT_TIMESTAMP
	:		'CURRENT_TIMESTAMP';
CURRENT_GMTDATE :	'CURRENT_GMTDATE';
CURRENT_GMTTIME	:	'CURRENT_GMTTIME';
CURRENT_GMTTIMESTAMP
	:		'CURRENT_GMTTIMESTAMP';
LOCAL_TIMEZONE	:	'LOCAL_TIMEZONE';	

//DateTime parts
YEAR		:	'YEAR';
MONTH		:	'MONTH';
DAY		:	'DAY';
HOUR		:	'HOUR';
MINUTE		:	'MINUTE';
SECOND		:	'SECOND';
DAYS		:	'DAYS';
DAYOFYEAR	:	'DAYOFYEAR';
DAYOFWEEK	:	'DAYOFWEEK';
MONTHS		:	'MONTHS';
QUARTEROFYEAR	:	'QUARTEROFYEAR';
QUARTERS	:	'QUARTERS';
WEEKS		:	'WEEKS';
WEEKOFYEAR	:	'WEEKOFYEAR';
WEEKOFMONTH	:	'WEEKOFMONTH';
ISLEAPYEAR	:	'ISLEAPYEAR';

		
// ESQL keywords
AS	:	'AS';
ASYMMETRIC
	:	'ASYMMETRIC';
ATOMIC	:	'ATOMIC';
ATTACH	:	'ATTACH';
BEGIN 	:	'BEGIN';
BROKER	:	'BROKER';
CALL	:	'CALL';
CASE	:	'CASE';
CATALOG :	'CATALOG';
CONSTANT:	'CONSTANT';
CONTINUE:	'CONTINUE';
CREATE	:	'CREATE';
DATABASE:	'DATABASE';
DECLARE	:	'DECLARE';
DEFAULT	:	'DEFAULT';
DELETE	:	'DELETE';
DETACH	:	'DETACH';
DO	:	'DO';
DOMAIN 	:	'DOMAIN';
ELSE	:	'ELSE';
ELSEIF	:	'ELSEIF';
END	:	'END';
ENVIRONMENT
	:	'ENVIRONMENT';	
ESCAPE 	:	'ESCAPE';
ESQL	:	'ESQL';
EVAL	:	'EVAL';
EVENT	:	'EVENT';
EXCEPTION
	:	'EXCEPTION';
EXISTS	:	'EXISTS';	
EXIT	:	'EXIT';
EXTERNAL:	'EXTERNAL';
FOR	:	'FOR';
FIELD	:	'FIELD';
FINALIZE:	'FINALIZE';
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
LABEL	:	'LABEL';
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
NONE	:	'NONE';
NOT	:	'NOT';	
OF	:	'OF';
OPTIONS	:	'OPTIONS';
OUT	:	'OUT';
PARENT	:	'PARENT';
PARSE	:	'PARSE';
PASSTHRU:	'PASSTHRU';
PATH	:	'PATH';
PREVIOUSSIBLING
	:	'PREVIOUSSIBLING';
PROCEDURE
	:	'PROCEDURE';
PROPAGATE
	:	'PROPAGATE';
REFERENCE
	:	'REFERENCE';
REPEAT	:	'REPEAT';
RESIGNAL:	'RESIGNAL';
RETURNS	:	'RETURNS';
RETURN	:	'RETURN';
SCHEMA	:	'SCHEMA';
SET	:	'SET';
SEVERITY:	'SEVERITY';
SHARED	:	'SHARED';
SQLSTATE:	'SQLSTATE';
SYMMETRIC
	:	'SYMMETRIC';
TERMINAL:	'TERMINAL';
THEN	:	'THEN';
THROW	:	'THROW';
TRACE	:	'TRACE';
TO	:	'TO';
TYPE	:	'TYPE';
VALUE	:	'VALUE';
VALUES	:	'VALUES';
WHEN	:	'WHEN';
WHERE	:	'WHERE';
WHILE	:	'WHILE';
UNTIL	:	'UNTIL';
UPDATE	:	'UPDATE';
USER	:	'USER';

// ESQL data types
REF	:	'REFERENCE TO';
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



