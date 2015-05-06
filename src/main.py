from antlr4 import *
from Z3inputLexer import Z3inputLexer
from Z3inputParser import Z3inputParser
from Z3inputFormatter import Z3inputFormatter

import sys


def main(argv):
    inp = FileStream(argv[1])
    lexer = Z3inputLexer(inp)
    stream = CommonTokenStream(lexer)
    parser = Z3inputParser(stream)
    tree = parser.start_rule()
    formatter = Z3inputFormatter()

    walker = ParseTreeWalker()
    walker.walk(formatter, tree)

    print(formatter)

if __name__ == '__main__':
    main(sys.argv)
