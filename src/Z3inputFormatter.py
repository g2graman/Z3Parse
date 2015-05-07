from antlr4 import *
from Z3inputListener import Z3inputListener

# This class defines a complete listener for a parse tree produced by
# Z3inputParser.


class Z3inputFormatter(Z3inputListener):

    # Constructor for Z3inputFormatter
    def __init__(self):
        self.translation = []

    def __str__(self):
        return ' '.join(self.translation)

    # Enter a parse tree produced by Z3inputParser#startRule.
    def enterStartRule(self, ctx):
        self.translation.append(ctx.getText())
        pass

    # Exit a parse tree produced by Z3inputParser#startRule.
    def exitStartRule(self, ctx):
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

    # Enter a parse tree produced by Z3inputParser#formulaImplication.
    def enterFormulaImplication(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaImplication.
    def exitFormulaImplication(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formulaConjunction.
    def enterFormulaConjunction(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaConjunction.
    def exitFormulaConjunction(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formulaDisjunction.
    def enterFormulaDisjunction(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaDisjunction.
    def exitFormulaDisjunction(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formulaNegation.
    def enterFormulaNegation(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaNegation.
    def exitFormulaNegation(self, ctx):
        pass

    # Enter a parse tree produced by Z3inputParser#formulaAtom.
    def enterFormulaAtom(self, ctx):
        pass

    # Exit a parse tree produced by Z3inputParser#formulaAtom.
    def exitFormulaAtom(self, ctx):
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
