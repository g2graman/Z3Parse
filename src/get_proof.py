from z3 import *

set_param(proof=True)
p, q = Bools('p q')

# s = Solver()
prop_right = Implies(Not(And(p, q)), Or(Not(p), Not(q)))
prop_left = Implies(And(Not(p), Not(q)), Not(And(p, q)))

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


def convert(s):
    result = s.replace('\n', '').replace(' ', '').split(',')
    for i in range(len(result)):
        if(',' in result[i]):
            result[i] = convert(result[i])
    return result

print(convert(s))
