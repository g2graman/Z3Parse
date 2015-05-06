from antlr4 import *

# This class defines a complete listener for a parse tree produced by
# Z3inputParser.


class Z3inputFormatter(ParseTreeListener):

    # Enter a parse tree produced by Z3inputParser#start_rule.
    def enterStart_rule(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#start_rule.
    def exitStart_rule(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formulaList.
    def enterFormulaList(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaList.
    def exitFormulaList(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#argumentList.
    def enterArgumentList(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#argumentList.
    def exitArgumentList(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formula.
    def enterFormula(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formula.
    def exitFormula(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#expression.
    def enterExpression(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#expression.
    def exitExpression(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#boolConjunction.
    def enterBoolConjunction(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#boolConjunction.
    def exitBoolConjunction(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#boolNegation.
    def enterBoolNegation(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#boolNegation.
    def exitBoolNegation(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#compareExpn.
    def enterCompareExpn(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#compareExpn.
    def exitCompareExpn(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#arithExpn.
    def enterArithExpn(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#arithExpn.
    def exitArithExpn(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#term.
    def enterTerm(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#term.
    def exitTerm(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#factor.
    def enterFactor(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#factor.
    def exitFactor(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#primary.
    def enterPrimary(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#primary.
    def exitPrimary(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#constant.
    def enterConstant(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#constant.
    def exitConstant(self, ctx):
        pass
