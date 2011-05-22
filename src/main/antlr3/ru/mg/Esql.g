grammar Esql;

options {
  language = Java;
  output = AST;
  backtrack= true;
}

module	:	statement+ ';'!;

//Statement
statement	:	(var_decl | expr) ';'! 
		;
		
/*
----------------------------------------------
	Variable declaration statements
----------------------------------------------	
*/
var_decl	:	var_ns_decl//var_ctor_decl | var_only_decl | var_ns_decl
		;
		
/*var_only_decl	:	DECLARE var_name (',' var_name)* var_modifiers? type
		->	^(DECLARE ^(type var_name var_modifiers?))+
		;

var_ctor_decl	:	DECLARE var_name (',' var_name)* var_modifiers? type CONSTANT? expr
		->	^(DECLARE ^(type var_name var_modifiers?))+ ^(INIT var_name expr)+
		;
*/		
var_ns_decl	:	DECLARE var_name (',' var_name)* var_modifier? NAMESPACE expr
		->	^(NAMESPACE ^(var_name ^(INIT expr) var_modifier?))+ 
		;		
		
fragment 
  var_modifier	:	SHARED | EXTERNAL
		;						
fragment
  var_name	: 	ID | LITERAL
		;
// End of variable declarations		

// Expression
expr	:	logic_expr;


logic_expr	
	:	sc_expr (BINARY_LOGICAL_OP^ sc_expr)*;

sc_expr	:	concat_expr (SIMPLE_COMPARE_OP^ concat_expr)*;

concat_expr	
	:	add_expr (CONCAT_OP^ add_expr)*;

add_expr
	:	mult_expr ( (PLUS_OP^ | MINUS_OP^) mult_expr )*;

mult_expr
	:	ulogic_expr ( (MULT_OP^ | DIV_OP^) ulogic_expr)*;

ulogic_expr	
	:	UNARY_LOGICAL_OP^? atom;

	
atom	:	ID | MINUS_OP^? INT | STRING | BOOL | NULL | LITERAL | '('! expr ')'!;

// Simple comparison operators
SIMPLE_COMPARE_OP
	:	'>' | '<' | '>=' | '<=' | '=' | '<>';

// Complex comparison operators
CC_OP 	:	'BETWEEN';

// Logical binary operators
BINARY_LOGICAL_OP : 'AND' | 'OR';

// Logical unary operator
UNARY_LOGICAL_OP
	:	'NOT';

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
DEREF		:	'.';
LABEL		:	'LABEL';
INIT		:	':=';
FUNC_CALL	:	'FUNC_CALL';
// End AST node names
	
// ESQL types
type		:	BOOLEAN | DATE | TIME | GMTTIME | TIMESTAMP | GMTTIMESTAMP | CHAR | DECIMAL | FLOAT | INTEGER | REFERENCE | ROW
		;
// ESQL keywords
ATOMIC	:	'ATOMIC';
ATTACH	:	'ATTACH';
BEGIN 	:	'BEGIN';
CALL	:	'CALL';
CASE	:	'CASE';
CATALOG :	'CATALOG';
CONSTANT:	'CONSTANT';
CONTINUE:	'CONTINUE';
CREATE	:	'CREATE';
DECLARE	:	'DECLARE';
DELETE	:	'DELETE';
DETACH	:	'DETACH';
DO	:	'DO';
DOMAIN 	:	'DOMAIN';
ELSE	:	'ELSE';
ELSEIF	:	'ELSEIF';
END	:	'END';
ESCAPE 	:	'ESCAPE';
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
FULL	:	'FULL';
FUNCTION:	'FUNCTION';
HANDLER	:	'HANDLER';
IDENTITY:	'IDENTITY';
IF	:	'IF';
IN	:	'IN';
INSERT	:	'INSERT';
INTO	:	'INTO';
IS	:	'IS';
ITERATE	:	'ITERATE';
INOUT	:	'INOUT';
LASTCHILD
	:	'LASTCHILD';
LEAVE	:	'LEAVE';
LIKE	:	'LIKE';
LOG	:	'LOG';
LOOP	:	'LOOP';
MESSAGE	:	'MESSAGE';
MODULE 	:	'MODULE';
MOVE	:	'MOVE';
NAMESPACE
	:	'NAMESPACE';
NEXTSIBLING
	:	'NEXTSIBLING';
OF	:	'OF';
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
VALUE	:	'VALUE';
VALUES	:	'VALUES';
WHEN	:	'WHEN';
WHILE	:	'WHILE';
UNTIL	:	'UNTIL';
UPDATE	:	'UPDATE';
USER	:	'USER';

// ESQL data types
BOOLEAN	:	'BOOLEAN';
DATE	:	'DATE';
TIME	:	'TIME';
GMTTIME	:	'GMTTIME';
TIMESTAMP
	:	'TIMESTAMP';
GMTTIMESTAMP
	:	'GMTTIMESTAMP';
CHAR	:	'CHAR';
DECIMAL	:	'DECIMAL';
FLOAT	:	'FLOAT';
INTEGER	:	'INTEGER';
ROW	:	'ROW';

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



