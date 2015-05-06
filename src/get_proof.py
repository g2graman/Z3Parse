from z3 import *
from z3util import *
import re


identifier_pattern = re.compile('[a-z][a-zA-z]*')

symbols = {'->': Implies, '-->': Implies, 'implies': Implies, '&': And,
           'and': And, '^': And, 'v': Or, 'or': Or, '|': Or, '!': Not,
           '~': Not, 'not': Not, 'A': ForAll, 'E': Exists, 'forall': ForAll,
           'exists': Exists}


def is_connective_or_quantifier(tok, symbols=symbols):
    return tok in symbols.keys()


def is_identifier(tok, r=identifier_pattern):
    return bool(r.match(tok))


# formulas = []
s = raw_input('formula> ')
while(s != ''):
    tokens = s.split()
    for tok in tokens:
        print(tok)
        print(is_identifier(tok), is_connective_or_quantifier(tok))
    # formulas.append(s)
    s = raw_input('formula> ')

'''
set_param(proof=True)
p, q = Bools('p q')

prop_right = symbols['->'](
    symbols['!'](symbols['^'](p, q)), symbols['v'](symbols['!'](p), symbols['!'](q)))
# prop_right = Implies(Not(And(p, q)), Or(Not(p), Not(q)))
prop_left = Implies(And(Not(p), Not(q)), Not(And(p, q)))

print(get_vars(prop_right))

s1 = Solver()
s2 = Solver()
s1.add(Not(prop_left))
s1.add(Not(prop_right))
s2.add(prop_left)
s2.add(prop_right)


if(s1.check() == unsat):
    s = str(s1.proof())
else:
    while s2.check() == unsat:
        print s2.model()
        s2.add(Or(p != s2.model()[p], q != s2.model()[q]))

print(s)'''
