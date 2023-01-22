grammar While;

options {output=AST;}
tokens{
	FONCTION;
	DEFINITION;
	INPUTSUB;
	INPUT;
	OUTPUT;
	COMMANDS;
	COMMAND;
	VARS;
	IF;
	FOR;
	WHILE;
	FOREACH;
	AFF;
	ELSE;
	CONS;
	LIST;
	HD;
	TL;
	SYM;
	COMP;
	EXPCOND;
	START;
	APPFUNC;
	RIGHTAFF;
	LEFTAFF;
	RIGHT;
	LEFT;
	THEN;
	NIL;
	PP;
}

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;


start	:	t1=program -> ^(START $t1);//
program	:	function (program)?;
function:	 'function' t1=Symbol ':' t2=definition -> ^(FONCTION $t1 $t2);
definition:	 'read' t1=input '%' t2=commands '%' 'write' t3=output -> ^(DEFINITION $t1? $t2 $t3);

input	:	t1=inputSub? -> ^(INPUT $t1?);
inputSub:	t1=variable (',' t2=inputSub)? -> $t1 $t2?;
output	:	t1=outputSub? -> ^(OUTPUT $t1?);
outputSub:	t1=variable (',' t2=outputSub)? -> $t1 $t2?;


commands:	t1=command(';' t2=commands) ? -> $t1 $t2?;

command	:	'nop'|
		(t1=vars ':=' t2=exprs)->^(AFF ^(LEFTAFF $t1) ^(RIGHTAFF $t2))|
		('if' t3=condition 'then' t4=commands ('else' t5=commands) 'fi')->^(IF  ^(EXPCOND $t3) ^(THEN $t4) ^(ELSE $t5)?) |
		('while' t6=condition 'do' t7=commands 'od') -> ^(WHILE ^(EXPCOND $t6) $t7)|
		('for' t8=conditionSimple 'do' t9=commands 'od') -> ^(FOR $t8 $t9)|
		('foreach' t10=variable 'in' t11=expression 'do' t12=commands 'od')-> ^(FOREACH $t10 $t11 $t12)|
		('pp(' expression ')'-> ^(PP expression));
		
vars	:	t1=variable (',' t2=vars) ? -> $t1 $t2?;
exprs	:	expression (',' exprs)? -> expression exprs?;

exprBase:	Nil->^(NIL)|
		variable|
		Symbol|
		'(' 'cons' lexpr ')'-> ^(CONS lexpr)|
		'(' 'list' t2=lexpr ')'-> ^(LIST $t2)|
		'(' 'hd' t3=exprBase ')'-> ^(HD $t3)|
		'(' 'tl' t4=exprBase ')'-> ^(TL $t4)|
		'(' t5=Symbol exprBase+ ')'->^(APPFUNC $t5 exprBase+);
		
expression 
	:	exprBase;

conditionSimple
	:	exprBase;
condition 
	:	exprBase ('=?' exprBase)? -> ^(LEFT exprBase) ^(RIGHT exprBase)?;
	
lexpr	:	exprBase*->exprBase*;
variable:	t1=Variable -> ^(VARS $t1);
Nil	:	'nil';
Variable:	'A'..'Z' ('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?') ? ;
Symbol 	:	'a'..'z' ('A'..'Z'|'a'..'z'|'0'..'9')*('!'|'?') ? ;


