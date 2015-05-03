from antlr4 import *
from Z3proofLexer import Z3proofLexer
from Z3proofParser import Z3proofParser
from Z3proofFormatter import Z3proofFormatter

import sys


def main(argv):
    inp = FileStream(argv[1])
    lexer = Z3proofLexer(inp)
    stream = CommonTokenStream(lexer)
    parser = Z3proofParser(stream)
    tree = parser.proof()

if __name__ == '__main__':
    main(sys.argv)
