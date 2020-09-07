grammar MiniJaJa;

options {
	backtrack		= false;
	k				= 1;
	output 			= AST;
	ASTLabelType 	= CommonTree;
}

tokens {
	VAR;
	METH;
	PARAM;
	CST;
	VARS;
	BLOCK;
	VEC;
	CALL;
	TABLEAU;
	CLASSE;
	IDENT;
	DECLS;
	INSTRS;
	VIDE;
	AFFECTATION;
	INCREMENT;
	SOMME;
	TAB;
	RETOUR;
	SI;
	TANTQUE;
	APPELI;
	NBRE;
	LISTEXP;
	APPELE;
	PRINTS;
}

@header{package fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated;}

@lexer::header {package fr.femtost.disc.m1comp4.lexerParser.AntlrGenerated;}


axiom : fichier EOF-> fichier
;

fichier : classe* 
;

classe : 'class' ident '{'decls methmain'}' -> ^(CLASSE ident decls methmain)
;

ident : IDF -> ^(IDENT IDF)
;

decls : (decl ';')* -> ^(DECLS decl*)
;

decl : typemeth ident ((vexp -> ^(VAR ident typemeth vexp) | '[' exp ']' -> ^(TABLEAU ident typemeth exp)) | methode-> ^(METH typemeth ident  methode?)) | finalvar
;

varz 	:	 (vars ';')* -> ^(VARS vars*)
	;

vars : typemeth ident (vexp -> ^(VAR ident typemeth vexp) | '[' exp ']' -> ^(TABLEAU ident typemeth exp))
	| finalvar
;

finalvar : 'final' type ident vexp -> ^(CST type ident vexp)
;

vexp : '=' exp -> exp
	| -> VIDE
;

methode : '(' (type ident (',' type ident)*)?  ')' '{'varz instrs'}' -> ^(PARAM type ident)* varz? instrs?
;

methmain : 'main' '{'varz instrs'}' -> ^('main' varz? instrs?)
;

instrs :(instr ';')* -> ^(INSTRS instr*)
;

instr :  ident(  
			  ('=' exp -> ^(AFFECTATION ident exp)   |'++' -> ^(INCREMENT ident)|  '+=' exp -> ^(SOMME ident exp)) 
			  | '('listexp')' -> ^(APPELI ident listexp?)
 			  | '['exp']' ('=' exp -> ^(AFFECTATION ^(TAB ident exp) exp)|'++' -> ^(INCREMENT ^(TAB ident exp) )| '+=' exp -> ^(SOMME ^(TAB  ident exp) exp))
 			)
		| 'return' exp -> ^(RETOUR exp)
		| 'if' exp '{' instrs '}' ('else' '{' instrs '}' )? -> ^(SI exp instrs instrs?)
		| 'while' '('exp')' '{'instrs'}' -> ^(TANTQUE exp instrs?)
		| 'print' '('(exp-> ^('print' exp) | String -> ^(PRINTS String) ) ')'
;

/*instrop :	('['exp']')? instrop2 -> instrop2 //Ancien travail, à modifier
;

instrop2 : '=' exp -> ^('=' exp)
			| '+=' exp -> ^('+=' exp)
			| '++'
;*/

listexp : (exp (',' exp)*)? -> ^(LISTEXP exp*)
;

exp : ('!'^ exp1 | exp1) ('&&'^ exp1 | '||'^ exp1)*
;

exp1 : (exp2) ('=='^ exp2 | '>'^ exp2)*
;

exp2 : ('-'^ terme | terme) ('+'^ terme | '-'^ terme)*
;

terme : fact ('*'^ fact | '/'^ fact)*
;

fact : ident('['exp']' -> ^(TAB ident exp)| '(' listexp ')' -> ^(APPELE ident listexp) | -> ident)
		| BOOL
		| ent
		| '(' exp ')' -> exp
;

typemeth : VOID
			| type
;

type :TYPE
;

ent 	:	 INT -> ^(NBRE INT)
	;

VOID : 'void'
;

TYPE : 'int' | 'boolean'
;


BOOL : 'true' | 'false'
;

INT 			: '0'..'9'+
;

IDF 			: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* //Commence par une lettre (minuscule ou majuscule)
;

String : '"' (.)* '"'
;

COMMENT			: '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} //Commentaire sur plusieurs lignes
;

ILCOMMENT			:  '//' ~( '\r' | '\n' )* {$channel=HIDDEN;} //Inline comments
;

WS  			: ( ' '| '\t' | '\r' | '\n' ) {$channel=HIDDEN;} //Whitespace
;