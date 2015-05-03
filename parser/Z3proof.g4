/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Z3proof;

GOAL : 'goal';

proof : LEFT_PAREN GOAL rules? RIGHT_PAREN EOF;      

rules : LEFT_PAREN ruleList RIGHT_PAREN | ruleList;

ASSERT : 'asserted';
APPLY_DEF : 'apply-def';
COMMUTATIVITY : 'commutativity';
MONOTONICITY : 'monotonicity';
DEF_AXIOM : 'def-axiom';
DER : 'der';
DISTRIBUTIVITY : 'distributivity';
AND_ELIM : 'and-elim';
NOT_OR_ELIM : 'not-or-elim';
ELIM_UNUSED : 'elim-unused';
HYPOTHESIS : 'hypothesis';
IFF_FALSE : 'iff-false';
IFF_TRUE : 'iff-true';
IFF_OTHER : 'iff~';
QUANT_INST : 'quant-inst';
QUANT_INTRO : 'quant-intro';
INTRO_DEF : 'intro-def';
LEMMA : 'lemma';
NNF_NEG : 'nnf-neg';
NNF_POS : 'nnf-pos';
MP : 'mp';
MP_OTHER : 'mp~';
PULL_QUANT : 'pull-quant';
PUSH_QUANT : 'push-quant';
REFLEXIVITY : 'refl';
REWRITE : 'rewrite';
SKOLEM : 'sk';
SYMMETRY : 'symm';
TH_LEMMA : 'th-lemma';
TRANSITIVITY : 'trans';
TRUE_AXIOM : 'true-axiom';
UNIT_RESOLUTION : 'unit-resolution';

proof_rule : ASSERT
    | APPLY_DEF
    | COMMUTATIVITY
    | MONOTONICITY
    | DEF_AXIOM
    | DER
    | DISTRIBUTIVITY
    | AND_ELIM
    | NOT_OR_ELIM
    | ELIM_UNUSED
    | HYPOTHESIS
    | IFF_FALSE
    | IFF_TRUE
    | IFF_OTHER
    | QUANT_INST
    | QUANT_INTRO
    | INTRO_DEF
    | LEMMA 
    | NNF_NEG
    | NNF_POS
    | MP
    | MP_OTHER
    | PULL_QUANT
    | PUSH_QUANT
    | REFLEXIVITY
    | REWRITE
    | SKOLEM
    | SYMMETRY
    | TH_LEMMA
    | TRANSITIVITY
    | TRUE_AXIOM
    | UNIT_RESOLUTION;

ruleList : proof_rule ( COMMA proof_rule )*; 

LEFT_PAREN : '(';
RIGHT_PAREN : ')';
COMMA : ',';

LOWERCASE : [a-z];
UPPERCASE : [A-Z];
ALPHA : [a-zA-Z];
ALPHANUMERIC : [a-zA-Z0-9];

DIGIT : [0-9];

INTEGER : '0' | [1-9] DIGIT*;

FLOAT : DIGIT+ '.' DIGIT+;

NUMERICAL_LITERAL : FLOAT | INTEGER;

BOOLEAN_LITERAL : 'True' | 'False';

LITERAL : '-'? NUMERICAL_LITERAL | BOOLEAN_LITERAL;

ARITHMETIC_OPERATOR : '+' | '*' | '-' | '/';

COMPARISON_OPERATOR : '>' | '<' | '>=' | '<=' | '!=' | '==';
        
WHITESPACE : ' ' | '\t' | '\r'? '\n';

IDENTIFIER : ALPHA+ ALPHANUMERIC*;

expression : expression ARITHMETIC_OPERATOR expression
    | expression COMPARISON_OPERATOR expression
    | 'And' LEFT_PAREN expression COMMA expression ( COMMA expression )* RIGHT_PAREN // At least 2-ary
    | 'Or' LEFT_PAREN expression COMMA expression ( COMMA expression )* RIGHT_PAREN // At least 2-ary
    | 'Implies' LEFT_PAREN expression COMMA expression RIGHT_PAREN // 2-ary
    | 'If' LEFT_PAREN expression COMMA expression COMMA expression RIGHT_PAREN // 3-ary
    | IDENTIFIER
    | LITERAL
    | IDENTIFIER arguments; // Function call

argumentList : expression ( COMMA expression )*; 

arguments : LEFT_PAREN argumentList? RIGHT_PAREN;
