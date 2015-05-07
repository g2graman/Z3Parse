/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Z3input;

startRule : formulaList? EOF;

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
COMMA : ',';
SEMICOLON : ';';

PLUS : '+';
MINUS : '-';
TIMES : '*';
DIVIDE : '/';

DIGIT : [0-9];
INTEGER : '0' | [1-9] DIGIT*;
FLOAT : DIGIT+ '.' DIGIT+;
NUMERICAL_LITERAL : FLOAT | INTEGER;
BOOLEAN_LITERAL : 'True' | 'False';

COMPARISON_OPERATOR : '>' | '<' | '>=' | '<=' | '!=' | '==';
WHITESPACE: [ \t\n\r]+ -> skip;
IDENTIFIER : [a-uw-zB-DF-Z]+ ([a-zA-Z0-9]? [a-uw-zB-DF-Z])*;
// omits 'v', 'A', 'E' from prefix and suffix

IMPLIES : '->' | '-->';
AND : '&' | '^';
OR : 'v' | '|';
NOT : '~' | '!';
QUANTIFIER : 'A' | 'E';

formulaList : formula (SEMICOLON formula)*; 
argumentList : expression (COMMA expression)*; 

formula            : (QUANTIFIER IDENTIFIER '.')? formulaImplication;
formulaImplication : formulaConjunction 
		   | formulaConjunction IMPLIES LEFT_PAREN formula RIGHT_PAREN;

formulaConjunction : formulaDisjunction (AND formulaConjunction)*;
formulaDisjunction : formulaNegation (OR formulaDisjunction)*;
formulaNegation    : formulaAtom | NOT LEFT_PAREN formulaNegation RIGHT_PAREN;
formulaAtom        : NOT? BOOLEAN_LITERAL 
		   | IDENTIFIER (LEFT_PAREN argumentList? RIGHT_PAREN)? 
		   | LEFT_PAREN formula RIGHT_PAREN 
		   | compareExpn;

expression : boolConjunction | expression OR boolConjunction;
boolConjunction : boolNegation | boolConjunction AND boolNegation;
boolNegation : compareExpn | NOT boolNegation;

compareExpn : arithExpn COMPARISON_OPERATOR arithExpn;
arithExpn : term | arithExpn PLUS term | arithExpn MINUS term;

term : factor |	term TIMES factor | term DIVIDE factor;
factor : primary | MINUS factor;

primary : MINUS? NUMERICAL_LITERAL
	| BOOLEAN_LITERAL
	| IDENTIFIER (LEFT_PAREN argumentList? RIGHT_PAREN)? 
	| LEFT_PAREN expression RIGHT_PAREN;
