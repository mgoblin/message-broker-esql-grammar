grammar Esql;

options {
  language = Java;
  output = AST;
  backtrack=true;
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
	FCALL;
}
// End AST node names

module	:	schema_stat	
	;

//Statement
statement	:	(var_decl | set_stat | if_stat | ret_stat | beginend_stat | while_stat | 
			 attach_stat | detach_stat | call_stat | case_stat | create_stat | 
			 func_decl_stat | handler_stat |  | delete_stat | eval_stat |
			 for_stat | insert_stat | iterate_stat | leave_stat | log_stat | loop_stat | 
			 move_stat | pass_stat |  propagate_stat | module_stat | repeat_stat | 
			 resignal_stat | throw_stat | upd_stat) ';'!
		;
		
/*
-------------------------------------------
	attach statement
-------------------------------------------
*/
attach_stat	: 	ATTACH dynamic_ref = expression TO field_ref = expression
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
  schema_name	:	 expression
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
  label		:	IDENTIFIER;
// End begin ... end statement
		
/*
-------------------------------------------
	call statement
-------------------------------------------
*/
call_stat	: 	CALL fcall_expr qualifiers? (INTO expression)?
		->	^(CALL fcall_expr ^(INTO expression)? qualifiers?)
		;			
fragment
  routine_name	: 	IDENTIFIER
  		;
fragment  		
  qualifiers	:	in_sch | ext_sch
		;  
fragment
  in_sch	:	(IN^ expression)
  		;
fragment
  ext_sch	:	(EXTERNAL SCHEMA^ expression)
  		; 		 		
fragment  		
  params	:	expression ('\,'! expression)*
		; 
// End of call statement	

/*
-------------------------------------------
	case statement
-------------------------------------------
*/
case_stat	:	CASE (case_expr = expression)?
			  (WHEN wexpr THEN then_sts)*
			  (ELSE elsestatement+)?
			END CASE  
		->	^(CASE ^(COND $case_expr)? ^(WHEN wexpr then_sts)* ^(ELSE elsestatement*)?)
		;
fragment
  wexpr		:	expression
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
			trg = expression 
			(AS alias = expression)? 
			(DOMAIN dexpr = expression)? props_clause
		->	^(CREATE qualifier $trg ^(AS $alias)? ^(DOMAIN $dexpr)? ^(PROPS props_clause)?)	
		;
fragment
  props_clause	:	values_clause | from_clause | parse_clause
  		;	
fragment
  qualifier	:	FIELD | ((PREVIOUSSIBLING | NEXTSIBLING | FIRSTCHILD | LASTCHILD) OF!)
		;
fragment
  from_clause	:	FROM expression
  		;
fragment
  parse_clause	:	PARSE '(' params? ')'
  		->	^(PARSE params?)
  		;		
fragment
  values_clause	:	REPEAT	| ident_clause | type_clause (VALUE expression)?
  		;
fragment
  ident_clause	:	IDENTITY^ expression 
  		;
fragment
  type_clause	:	(TYPE expression)? (NAMESPACE expression | '*')? (NAME expression)?
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
		
module_type	:	'COMPUTE' | DATABASE | 'FILTER';
	
module_name 	:	IDENTIFIER;

// End module declarationrepeat_stat

/*
-------------------------------------------------------
	Function and procedure declaration
-------------------------------------------------------propagate_stat
*/
func_decl_stat	:	CREATE func_type func_name '(' params_decl? ')' (RETURNS type)? (LANGUAGE language)?
			  (beginend_stat | external)?
		-> ^(func_type ^(func_name ^(PARAMS params_decl)? ^(RETURNS type)? ^(LANGUAGE language)? ^(BODY beginend_stat)? ^(BODY external)? ))		
		;
fragment
  func_name	: 	IDENTIFIER
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
  param_name	:	IDENTIFIER
  		;
fragment
  language	:	ESQL | DATABASE | JAVA
  		;	  		
fragment
  external	:	EXTERNAL NAME expression
  		->	^(EXTERNAL expression)
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
const_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? CONSTANT type expression
		->	^(CONSTANT ^(var_name type var_modifier?))+ ^(INIT var_name expression)+	
		;				

var_ctor_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? type expression
		->	^(VAR ^(var_name type var_modifier?))+ ^(INIT var_name expression)+
		;
		
var_ns_decl	:	DECLARE var_name ('\,' var_name)* var_modifier? (NAMESPACE | NAME) expression
		->	^(NS ^(var_name var_modifier?))+ ^(INIT var_name expression)+ 
		;		
		
fragment 
  var_modifier	:	SHARED | EXTERNAL
		;						
fragment
  var_name	: 	IDENTIFIER
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
  state_item	:	SQLSTATE^ (VALUE^ | LIKE^)? QUOTEDSTRING (ESCAPE^ QUOTEDSTRING)?
  		;  		  			
			
// End of DECLARE HANDLER statement

/*
-------------------------------------------
	DELETE FROM statement
-------------------------------------------
*/
delete_from_stat:	DELETE FROM table_ref (AS IDENTIFIER)? where_clause?
		->	^(DELETE table_ref ^(AS IDENTIFIER)? where_clause?)
		;
fragment
  table_ref	:	DATABASE^ ('.'! expr)+
  		;
fragment
  where_clause	:	WHERE^ expression
  		;  		 		  				 
// End of delete from statement

/*
-------------------------------------------
	DELETE statement
-------------------------------------------
*/
delete_stat	:	DELETE^ qualifier expression
		;
/*
-------------------------------------------
	DETACH statement
-------------------------------------------
*/		
detach_stat	:	DETACH^ expression;

/*
-------------------------------------------
	DETACH statement
-------------------------------------------
*/		
eval_stat	:	EVAL^ '('! expression ')'!
		;
		
/*
-------------------------------------------
	For statement
-------------------------------------------
*/
for_stat	:	FOR expression AS alias = expression DO
			  statement+
			END FOR
		->	^(FOR expression ^(AS $alias) statement+)
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
  ifexpr	:	expression;
fragment 
  elifexpr	:	expression;
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
insert_stat	:	INSERT INTO table_ref columns=value VALUES val=value
		->	^(INSERT table_ref ^(PARAMS $columns) ^(VALUES $val)) 
		;
fragment
  value		:	'('! params ')'!
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
  log_options	:	(SEVERITY expression)? (CATALOG expression)? (MESSAGE expression)?
  		; 
// End of LOG statement

/*ID
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
move_stat	:	MOVE^ trg=expression to_clause
		;
fragment
  to_clause	:	(TO^ expression) | PARENT^ | (sibling^ (type_clause | ident_clause | REPEAT^ TYPE? NAME?))
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
  db_clause	:	expression (TO table_ref)? (VALUES values)?
  		->	expression ^(TO table_ref)? ^(VALUES values)?
  		;
fragment
  values	:	expression
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
  propagate_to	:	TO (TERMINAL term= expression) | (LABEL lbl = expression)
  		->	^(TO (TERMINAL $term)? (LABEL $lbl)? )
  		;
fragment
  msg_src	:	(ENVIRONMENT^ expression)? (MESSAGE^ expression)? (EXCEPTION^ expression)? (FINALIZE | DELETE (DEFAULT | NONE)?)?
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
			UNTIL expression
			END REPEAT
		->	^(REPEAT expression statement*)	
		;
		
l_repeat	:	label ':' 
			REPEAT
			  statement*
			UNTIL expression
			END REPEAT label
		-> 	^(REPEAT ^(PROPS label) expression statement*)
		;		  		
// End of  REPEATE statement		  		 		

// Resignal statement
resignal_stat	:	RESIGNAL^
		;  			
  					
// return statement
ret_stat	:	RETURN^ expression? ;	

/*
-------------------------------------------
	SET statement
-------------------------------------------
*/
set_stat	:	SET expression
		->	^(SET expression)
		;
// End of set statement	

/*
-------------------------------------------
	THROW statement
-------------------------------------------
*/
throw_stat	:	THROW USER? EXCEPTION (SEVERITY severity = expression)? (CATALOG catalog = expression)? (MESSAGE msg = expression)? 
			throw_values?
		->	^(THROW ^(PROPS USER? ^(SEVERITY $severity)? ^(CATALOG $catalog)? ^(MESSAGE $msg)? ) throw_values?)	
		;
fragment 
  throw_values	:	VALUES '(' params  ')'
  		->	^(VALUES params)
  		;			
// End THROW statement
/*
-------------------------------------------
	UPDATE statement
-------------------------------------------
*/
upd_stat	:	UPDATE table_ref (AS alias=expression)?
			  SET column_clause+
			(WHERE where_expr=expression)?
		->	^(UPDATE table_ref ^(AS $alias)? ^(SET column_clause+) ^(WHERE $where_expr)?)	
		;
fragment
  column_clause	:	column_name '=' expression
  		->	^(INIT column_name expression)
  		;
fragment
  column_name	:	IDENTIFIER
  		;  					
// End of UPDATE statement				

// While statement
while_stat	:	s_while | l_while
		;
fragment
  s_while	:	WHILE expression DO
			  statement*
			END WHILE
		->	^(WHILE ^(COND expression) statement*)  
		;
fragment 
  l_while	:	label ':' WHILE expression DO
			  statement*
			END WHILE label
		->	^(WHILE ^(PROPS label) ^(COND expression) statement*)  
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
	:	EXTRACT	'(' extract_part FROM expression ')'
	->	^(ESQL_FUNCTION_CALL ^(EXTRACT extract_part expression))
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
	
// Numeric function
f_round	:	ROUND '(' src=expression '\,' precision=expression (MODE rounding_mode)? ')'
	->	^(ESQL_FUNCTION_CALL ROUND $src $precision rounding_mode)
	;
fragment
  rounding_mode	
  	:	'ROUND_UP' | 'ROUND_DOWN' | 'ROUND_CEILING' | 'ROUND_FLOOR' | 'ROUND_HALF_EVEN' | 'ROUND_HALF_DOWN'
  	;		
	
	
f_overlay
	:	OVERLAY '(' e1=expression 'PLACING' e2=expression FROM fexpr=expression (FOR forexpr=expression)? ')'
	->	^(ESQL_FUNCTION_CALL ^(OVERLAY $e1 $e2 ^(PROPS $fexpr $forexpr?)))
	;
f_position
	:	POSITION '(' search_expr=expression IN src_expr=colon_expr (FROM from_expr=expression)? (REPEAT repeat_expr=expression)? ')'
	-> 	^(ESQL_FUNCTION_CALL ^(POSITION $search_expr $src_expr ^(FROM $from_expr)? ^(REPEAT $repeat_expr)? ))
	;
f_substring
	:	SUBSTRING '(' sexpr=expression substring_pos (FOR end=expression)? ')'
	->	^(ESQL_FUNCTION_CALL SUBSTRING substring_pos $end?)
	;
fragment
  substring_pos
  	:	(FROM^ expression) | (BEFORE^ expression) | (AFTER^ expression)
  	;
f_trim	:	TRIM '(' trim_cause? expression')'
	->	^(ESQL_FUNCTION_CALL TRIM expression trim_cause?)
	;
fragment
  trim_cause
  	:	(expression | (BOTH | LEADING | TRAILING) expression?)? FROM
  	;
  	
// Field functions
f_asbitstream
	:	ASBITSTREAM '(' expression stream_options* ')'
	->	^(ESQL_FUNCTION_CALL ASBITSTREAM expression stream_options*)
	;
fragment
  stream_options
  	:	  OPTIONS^ expression 
  		| ENCODING^ expression 
  		| CCSID^ expression
  		| SET^ expression 
  		| TYPE^ expression
  		| FORMAT^ expression
  	;
  	
f_for	:	FOR (modificator=(ALL | ANY | SOME))? f_for_list '(' expr ')'
	->	^(ESQL_FUNCTION_CALL FOR ^(PROPS $modificator?) ^(PARAMS f_for_list) expr)
	;
fragment
  f_for_list	
  	:	f_for_list_element ('\,' f_for_list_element)*
  	->	f_for_list_element+
  	;
fragment
  f_for_list_element
  	:	expr (AS as_expr=expr)?
  	->	^(AS expr $as_expr)
  	;  		  			
	
	
// Complex functions
f_case	:	CASE case_clause (ELSE expr)? END
	->	^(ESQL_FUNCTION_CALL CASE case_clause ^(ELSE expr)?)
	;				
fragment
  case_clause
  	:	expression? (when_clause)+
  	;
fragment
  when_clause
  	:	WHEN test=expression THEN then=expression
  	->	^(WHEN $test $then)
  	;
  	
f_cast	:	CAST '(' params AS type (CCSID ccsid=expression)? (ENCODING encoding=expression)? (FORMAT format=expression)? (DEFAULT def=expression)? ')'
	-> 	^(ESQL_FUNCTION_CALL CAST params type ^(PROPS ^(CCSID $ccsid)? ^(ENCODING $encoding)? ^(FORMAT $format)? ^(DEFAULT $def)?))
	;
	
f_select:	SELECT select_clause select_from_clause where_clause?
	->	^(ESQL_FUNCTION_CALL SELECT select_clause select_from_clause where_clause?)
	;
fragment
  select_clause_i1	
  	:	e=expression e2=(AS^ expression | INSERT^)?
  	;
fragment 
  select_clause_i2
  	:	ITEM^ expression
  	;
fragment
  select_clause_aggregates
  	:	agg=(COUNT | MAX | MIN | SUM) '(' expression ')'
  	->	^($agg expression)
  	;
fragment
  select_item
  	:	select_clause_i1 | select_clause_i2 | select_clause_aggregates | '*'
  	;  	
fragment
  select_clause
  	:	select_item ('\,' select_item)*
  	->	select_item+
  	;
fragment
  select_from_clause
  	:	FROM^ from_list
  	;
fragment
  from_list
  	:	from_item ('\,' from_item)*
  	->	from_item+
  	;
fragment
  from_item
  	:	expression (AS^ expression)?	
  	;

f_row	:	T_ROW '(' from_list ')'
	->	^(ESQL_FUNCTION_CALL T_ROW from_list)
	;
f_list	:	LIST '{' params '}'
	->	^(ESQL_FUNCTION_CALL LIST params)
	;
	
// Misc functions
f_passthru
	:	PASSTHRU '(' params pass_vals? ')'
	->	^(ESQL_FUNCTION_CALL PASSTHRU ^(PARAMS params) pass_vals?)
	;
fragment
  pass_vals
  	:	(TO table_ref)? (VALUES '(' params ')')?
  	->	^(TO table_ref)? ^(VALUES params)?
	;  	  	  	  	  	 

// Expression
expression	
	:	fcall_expr | expr;
	
fcall_expr
	:	expr '(' params? ')'
	->	^(FCALL expr ^(PARAMS params)?);	
	
expr	:	singular_expr;

singular_expr
	:	SINGULAR^? like_expr
	;	
	
like_expr
	:	is_expr (NOT? LIKE^ is_expr (ESCAPE^ is_expr)? )?;	
	
is_expr	:	in_expr (IS^ NOT? (BOOL | 'INF' | '+INF' | '-INF' | 'INFINITY' | '+INFINITY' | '-INFINITY' | 'NAN' | 'NULL' | 'NUM' | 'NUMBER' | 'UNKNOWN'))?;  		

in_expr	:	exists_expr (NOT? IN^ '('! expression ('\,'! expression)* ')'! )?;

exists_expr
	:	EXISTS^? between_expr;	

between_expr	
	:	eq_expr (NOT? BETWEEN_OP^ (ASYMMETRIC | SYMMETRIC)? eq_expr)*;

eq_expr	:	colon_expr (EQ_OP^ colon_expr)*;

colon_expr
	:	logic_expr (':'^ logic_expr)*;
	
logic_expr:	logic_not_expr (BINARY_LOGICAL_OP^ logic_not_expr)*;

logic_not_expr
	:	NOT^ logic_not_expr | sc_expr;

sc_expr	:	concat_expr (SIMPLE_COMPARE_OP^ concat_expr)*;

concat_expr	
	:	add_expr (CONCAT_OP^ add_expr)*;	

add_expr
	:	mult_expr ( (PLUS_OP^ | MINUS_OP^) mult_expr )*;

mult_expr
	:	dot_expr ( (MULT_OP^ | DIV_OP^) dot_expr)*;
	
dot_expr	
	:	arr_expr (DOT_OP^ arr_expr)*;
	
arr_expr:	unary_expr ('['^ aidx? ']'!)*;

fragment
  aidx	:	SIMPLE_COMPARE_OP | expression
  	;

unary_expr 
    	:  	MINUS_OP^ unary_expr |  '{'^ unary_expr '}'! | atom;
	
atom	:	  f_sql_code 
		| f_sql_err_text
		| f_sql_nerror 
		| f_sql_state 
		| f_extract 
		| f_cur_date 
		| f_cur_time 
		| f_cur_timestamp 
		| f_cur_gmt_date 
		| f_cur_gmt_time 
		| f_cur_gmt_timestamp 
		| f_loc_timezone
		| f_round 
		| f_overlay 
		| f_position 
		| f_substring 
		| f_trim
		| f_asbitstream
		| f_for
		| f_case
		| f_cast
		| f_select
		| f_row
		| f_list
		| f_passthru
		| IDENTIFIER
		| INTLITERAL 
		| STRINGLITERAL 
		| BOOL 
		| NULL 
		| QUOTEDSTRING
		| '*' 
		| '('! expr ')'!
		;

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
DOT_OP	:	'.';
	
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
ROUND		:	'ROUND';
OVERLAY		:	'OVERLAY';
POSITION	:	'POSITION';
SUBSTRING	:	'SUBSTRING';

BEFORE		:	'BEFORE';
AFTER		:	'AFTER';

TRIM		:	'TRIM';
BOTH		:	'BOTH';
LEADING		:	'LEADING';
TRAILING	:	'TRAILING';

ASBITSTREAM	:	'ASBITSTREAM';
ENCODING	:	'ENCODING';
CCSID		:	'CCSID';
FORMAT		:	'FORMAT';


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

// Round modes
MODE		:	'MODE';

// FOR modifiers
ALL		:	'ALL';
ANY		:	'ANY';
SOME		:	'SOME';

CAST		:	'CAST';
SELECT		:	'SELECT';
ITEM		:	'ITEM';
COUNT		:	'COUNT';
MAX		:	'MAX';
MIN		:	'MIN';
SUM		:	'SUM';

LIST		:	'LIST';

		
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
SINGULAR:	'SINGULAR';
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
INTLITERAL	
	:	('0'..'9')+;
STRINGLITERAL	:	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';
QUOTEDSTRING	:	'\'' .+ '\'';

IDENTIFIER  :	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
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



