/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Z3input;

start_rule : formulaList? EOF;

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
LITERAL : MINUS? NUMERICAL_LITERAL | BOOLEAN_LITERAL;

COMPARISON_OPERATOR : '>' | '<' | '>=' | '<=' | '!=' | '==';
WHITESPACE: [ \t\n\r]+ -> skip;
IDENTIFIER : [a-uw-zB-DF-Z]+ ([a-zA-Z0-9]? [a-uw-zB-DF-Z])*; // omits 'v', 'A', 'E' and cannot end in those characters

IMPLIES : '->' | '-->' | 'implies';
AND : '&' | 'and' | '^';
OR : 'or' | 'v' | '|';
NOT : '~' | '!' | 'not';
QUANTIFIER : 'A' | 'E' | 'forall' | 'exists';
      
formulaList : formula ( SEMICOLON formula )*; 
argumentList : expression ( COMMA expression )*; 

formula : NOT? BOOLEAN_LITERAL
		| compareExpn
		| formula IMPLIES LEFT_PAREN formula RIGHT_PAREN
		| NOT LEFT_PAREN formula RIGHT_PAREN ( OR LEFT_PAREN formula RIGHT_PAREN )?
		| formula OR formula ( OR formula )*
		| formula AND formula ( AND formula )*
		| QUANTIFIER '.' LEFT_PAREN formula RIGHT_PAREN
		| IDENTIFIER ( LEFT_PAREN argumentList? RIGHT_PAREN )?;

expression : boolConjunction | expression OR boolConjunction;
boolConjunction : boolNegation | boolConjunction AND boolNegation;
boolNegation : compareExpn | NOT boolNegation;

compareExpn : arithExpn COMPARISON_OPERATOR arithExpn;
arithExpn : term | arithExpn  PLUS  term |	arithExpn  MINUS term;

term : factor |	term TIMES factor | term DIVIDE factor;
factor : primary | MINUS factor;

primary : LITERAL 
		| IDENTIFIER ( LEFT_PAREN argumentList? RIGHT_PAREN )? 
		| LEFT_PAREN expression RIGHT_PAREN;
