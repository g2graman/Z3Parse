# Generated from java-escape by ANTLR 4.5
# encoding: utf-8
from __future__ import print_function
from antlr4 import *
from io import StringIO
package = globals().get("__package__", None)
ischild = len(package)>0 if package is not None else False
if ischild:
    from .Z3proofListener import Z3proofListener
else:
    from Z3proofListener import Z3proofListener
def serializedATN():
    with StringIO() as buf:
        buf.write(u"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3")
        buf.write(u"9\u009c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write(u"\7\4\b\t\b\3\2\3\2\3\2\5\2\24\n\2\3\2\3\2\3\2\3\3\3\3")
        buf.write(u"\3\3\3\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write(u"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write(u"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5")
        buf.write(u"\4A\n\4\3\5\3\5\3\5\7\5F\n\5\f\5\16\5I\13\5\3\6\3\6\3")
        buf.write(u"\6\3\6\3\6\3\6\3\6\3\6\7\6S\n\6\f\6\16\6V\13\6\3\6\3")
        buf.write(u"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6a\n\6\f\6\16\6d\13")
        buf.write(u"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3")
        buf.write(u"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3")
        buf.write(u"\6\3\6\5\6\u0081\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0089")
        buf.write(u"\n\6\f\6\16\6\u008c\13\6\3\7\3\7\3\7\7\7\u0091\n\7\f")
        buf.write(u"\7\16\7\u0094\13\7\3\b\3\b\5\b\u0098\n\b\3\b\3\b\3\b")
        buf.write(u"\2\3\n\t\2\4\6\b\n\f\16\2\2\u00c4\2\20\3\2\2\2\4\35\3")
        buf.write(u"\2\2\2\6@\3\2\2\2\bB\3\2\2\2\n\u0080\3\2\2\2\f\u008d")
        buf.write(u"\3\2\2\2\16\u0095\3\2\2\2\20\21\7)\2\2\21\23\7\b\2\2")
        buf.write(u"\22\24\5\4\3\2\23\22\3\2\2\2\23\24\3\2\2\2\24\25\3\2")
        buf.write(u"\2\2\25\26\7*\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\7")
        buf.write(u")\2\2\31\32\5\b\5\2\32\33\7*\2\2\33\36\3\2\2\2\34\36")
        buf.write(u"\5\b\5\2\35\30\3\2\2\2\35\34\3\2\2\2\36\5\3\2\2\2\37")
        buf.write(u"A\7\t\2\2 A\7\n\2\2!A\7\13\2\2\"A\7\f\2\2#A\7\r\2\2$")
        buf.write(u"A\7\16\2\2%A\7\17\2\2&A\7\20\2\2\'A\7\21\2\2(A\7\22\2")
        buf.write(u"\2)A\7\23\2\2*A\7\24\2\2+A\7\25\2\2,A\7\26\2\2-A\7\27")
        buf.write(u"\2\2.A\7\30\2\2/A\7\31\2\2\60A\7\32\2\2\61A\7\33\2\2")
        buf.write(u"\62A\7\34\2\2\63A\7\35\2\2\64A\7\36\2\2\65A\7\37\2\2")
        buf.write(u"\66A\7 \2\2\67A\7!\2\28A\7\"\2\29A\7#\2\2:A\7$\2\2;A")
        buf.write(u"\7%\2\2<A\7&\2\2=A\7\'\2\2>A\7(\2\2?A\5\n\6\2@\37\3\2")
        buf.write(u"\2\2@ \3\2\2\2@!\3\2\2\2@\"\3\2\2\2@#\3\2\2\2@$\3\2\2")
        buf.write(u"\2@%\3\2\2\2@&\3\2\2\2@\'\3\2\2\2@(\3\2\2\2@)\3\2\2\2")
        buf.write(u"@*\3\2\2\2@+\3\2\2\2@,\3\2\2\2@-\3\2\2\2@.\3\2\2\2@/")
        buf.write(u"\3\2\2\2@\60\3\2\2\2@\61\3\2\2\2@\62\3\2\2\2@\63\3\2")
        buf.write(u"\2\2@\64\3\2\2\2@\65\3\2\2\2@\66\3\2\2\2@\67\3\2\2\2")
        buf.write(u"@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=")
        buf.write(u"\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2BG\5\6\4\2CD\7")
        buf.write(u"+\2\2DF\5\6\4\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2")
        buf.write(u"\2H\t\3\2\2\2IG\3\2\2\2JK\b\6\1\2KL\7\3\2\2LM\7)\2\2")
        buf.write(u"MN\5\n\6\2NO\7+\2\2OT\5\n\6\2PQ\7+\2\2QS\5\n\6\2RP\3")
        buf.write(u"\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2")
        buf.write(u"\2\2WX\7*\2\2X\u0081\3\2\2\2YZ\7\4\2\2Z[\7)\2\2[\\\5")
        buf.write(u"\n\6\2\\]\7+\2\2]b\5\n\6\2^_\7+\2\2_a\5\n\6\2`^\3\2\2")
        buf.write(u"\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2")
        buf.write(u"ef\7*\2\2f\u0081\3\2\2\2gh\7\5\2\2hi\7)\2\2ij\5\n\6\2")
        buf.write(u"jk\7+\2\2kl\5\n\6\2lm\7*\2\2m\u0081\3\2\2\2no\7\6\2\2")
        buf.write(u"op\7)\2\2pq\5\n\6\2qr\7+\2\2rs\5\n\6\2st\7+\2\2tu\5\n")
        buf.write(u"\6\2uv\7*\2\2v\u0081\3\2\2\2wx\7\7\2\2xy\7)\2\2yz\5\n")
        buf.write(u"\6\2z{\7*\2\2{\u0081\3\2\2\2|\u0081\79\2\2}~\79\2\2~")
        buf.write(u"\u0081\5\16\b\2\177\u0081\7\65\2\2\u0080J\3\2\2\2\u0080")
        buf.write(u"Y\3\2\2\2\u0080g\3\2\2\2\u0080n\3\2\2\2\u0080w\3\2\2")
        buf.write(u"\2\u0080|\3\2\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081")
        buf.write(u"\u008a\3\2\2\2\u0082\u0083\f\f\2\2\u0083\u0084\7\66\2")
        buf.write(u"\2\u0084\u0089\5\n\6\r\u0085\u0086\f\13\2\2\u0086\u0087")
        buf.write(u"\7\67\2\2\u0087\u0089\5\n\6\f\u0088\u0082\3\2\2\2\u0088")
        buf.write(u"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2")
        buf.write(u"\2\u008a\u008b\3\2\2\2\u008b\13\3\2\2\2\u008c\u008a\3")
        buf.write(u"\2\2\2\u008d\u0092\5\n\6\2\u008e\u008f\7+\2\2\u008f\u0091")
        buf.write(u"\5\n\6\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092")
        buf.write(u"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\r\3\2\2\2\u0094")
        buf.write(u"\u0092\3\2\2\2\u0095\u0097\7)\2\2\u0096\u0098\5\f\7\2")
        buf.write(u"\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099")
        buf.write(u"\3\2\2\2\u0099\u009a\7*\2\2\u009a\17\3\2\2\2\r\23\35")
        buf.write(u"@GTb\u0080\u0088\u008a\u0092\u0097")
        return buf.getvalue()


class Z3proofParser ( Parser ):

    grammarFileName = "java-escape"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ u"<INVALID>", u"'And'", u"'Or'", u"'Implies'", u"'If'", 
                     u"'Not'", u"'goal'", u"'asserted'", u"'apply-def'", 
                     u"'commutativity'", u"'monotonicity'", u"'def-axiom'", 
                     u"'der'", u"'distributivity'", u"'and-elim'", u"'not-or-elim'", 
                     u"'elim-unused'", u"'hypothesis'", u"'iff-false'", 
                     u"'iff-true'", u"'iff~'", u"'quant-inst'", u"'quant-intro'", 
                     u"'intro-def'", u"'lemma'", u"'nnf-neg'", u"'nnf-pos'", 
                     u"'mp'", u"'mp~'", u"'pull-quant'", u"'push-quant'", 
                     u"'refl'", u"'rewrite'", u"'sk'", u"'symm'", u"'th-lemma'", 
                     u"'trans'", u"'true-axiom'", u"'unit-resolution'", 
                     u"'('", u"')'", u"','" ]

    symbolicNames = [ u"<INVALID>", u"<INVALID>", u"<INVALID>", u"<INVALID>", 
                      u"<INVALID>", u"<INVALID>", u"GOAL", u"ASSERT", u"APPLY_DEF", 
                      u"COMMUTATIVITY", u"MONOTONICITY", u"DEF_AXIOM", u"DER", 
                      u"DISTRIBUTIVITY", u"AND_ELIM", u"NOT_OR_ELIM", u"ELIM_UNUSED", 
                      u"HYPOTHESIS", u"IFF_FALSE", u"IFF_TRUE", u"IFF_OTHER", 
                      u"QUANT_INST", u"QUANT_INTRO", u"INTRO_DEF", u"LEMMA", 
                      u"NNF_NEG", u"NNF_POS", u"MP", u"MP_OTHER", u"PULL_QUANT", 
                      u"PUSH_QUANT", u"REFLEXIVITY", u"REWRITE", u"SKOLEM", 
                      u"SYMMETRY", u"TH_LEMMA", u"TRANSITIVITY", u"TRUE_AXIOM", 
                      u"UNIT_RESOLUTION", u"LEFT_PAREN", u"RIGHT_PAREN", 
                      u"COMMA", u"LOWERCASE", u"UPPERCASE", u"ALPHA", u"ALPHANUMERIC", 
                      u"DIGIT", u"INTEGER", u"FLOAT", u"NUMERICAL_LITERAL", 
                      u"BOOLEAN_LITERAL", u"LITERAL", u"ARITHMETIC_OPERATOR", 
                      u"COMPARISON_OPERATOR", u"WHITESPACE", u"IDENTIFIER" ]

    RULE_proof = 0
    RULE_rules = 1
    RULE_proof_rule = 2
    RULE_ruleList = 3
    RULE_expression = 4
    RULE_argumentList = 5
    RULE_arguments = 6

    ruleNames =  [ u"proof", u"rules", u"proof_rule", u"ruleList", u"expression", 
                   u"argumentList", u"arguments" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    GOAL=6
    ASSERT=7
    APPLY_DEF=8
    COMMUTATIVITY=9
    MONOTONICITY=10
    DEF_AXIOM=11
    DER=12
    DISTRIBUTIVITY=13
    AND_ELIM=14
    NOT_OR_ELIM=15
    ELIM_UNUSED=16
    HYPOTHESIS=17
    IFF_FALSE=18
    IFF_TRUE=19
    IFF_OTHER=20
    QUANT_INST=21
    QUANT_INTRO=22
    INTRO_DEF=23
    LEMMA=24
    NNF_NEG=25
    NNF_POS=26
    MP=27
    MP_OTHER=28
    PULL_QUANT=29
    PUSH_QUANT=30
    REFLEXIVITY=31
    REWRITE=32
    SKOLEM=33
    SYMMETRY=34
    TH_LEMMA=35
    TRANSITIVITY=36
    TRUE_AXIOM=37
    UNIT_RESOLUTION=38
    LEFT_PAREN=39
    RIGHT_PAREN=40
    COMMA=41
    LOWERCASE=42
    UPPERCASE=43
    ALPHA=44
    ALPHANUMERIC=45
    DIGIT=46
    INTEGER=47
    FLOAT=48
    NUMERICAL_LITERAL=49
    BOOLEAN_LITERAL=50
    LITERAL=51
    ARITHMETIC_OPERATOR=52
    COMPARISON_OPERATOR=53
    WHITESPACE=54
    IDENTIFIER=55

    def __init__(self, input):
        super(Z3proofParser, self).__init__(input)
        self.checkVersion("4.5")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ProofContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.ProofContext, self).__init__(parent, invokingState)
            self.parser = parser

        def LEFT_PAREN(self):
            return self.getToken(Z3proofParser.LEFT_PAREN, 0)

        def GOAL(self):
            return self.getToken(Z3proofParser.GOAL, 0)

        def RIGHT_PAREN(self):
            return self.getToken(Z3proofParser.RIGHT_PAREN, 0)

        def EOF(self):
            return self.getToken(Z3proofParser.EOF, 0)

        def rules(self):
            return self.getTypedRuleContext(Z3proofParser.RulesContext,0)


        def getRuleIndex(self):
            return Z3proofParser.RULE_proof

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterProof(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitProof(self)




    def proof(self):

        localctx = Z3proofParser.ProofContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_proof)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            self.match(Z3proofParser.LEFT_PAREN)
            self.state = 15
            self.match(Z3proofParser.GOAL)
            self.state = 17
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << Z3proofParser.T__0) | (1 << Z3proofParser.T__1) | (1 << Z3proofParser.T__2) | (1 << Z3proofParser.T__3) | (1 << Z3proofParser.T__4) | (1 << Z3proofParser.ASSERT) | (1 << Z3proofParser.APPLY_DEF) | (1 << Z3proofParser.COMMUTATIVITY) | (1 << Z3proofParser.MONOTONICITY) | (1 << Z3proofParser.DEF_AXIOM) | (1 << Z3proofParser.DER) | (1 << Z3proofParser.DISTRIBUTIVITY) | (1 << Z3proofParser.AND_ELIM) | (1 << Z3proofParser.NOT_OR_ELIM) | (1 << Z3proofParser.ELIM_UNUSED) | (1 << Z3proofParser.HYPOTHESIS) | (1 << Z3proofParser.IFF_FALSE) | (1 << Z3proofParser.IFF_TRUE) | (1 << Z3proofParser.IFF_OTHER) | (1 << Z3proofParser.QUANT_INST) | (1 << Z3proofParser.QUANT_INTRO) | (1 << Z3proofParser.INTRO_DEF) | (1 << Z3proofParser.LEMMA) | (1 << Z3proofParser.NNF_NEG) | (1 << Z3proofParser.NNF_POS) | (1 << Z3proofParser.MP) | (1 << Z3proofParser.MP_OTHER) | (1 << Z3proofParser.PULL_QUANT) | (1 << Z3proofParser.PUSH_QUANT) | (1 << Z3proofParser.REFLEXIVITY) | (1 << Z3proofParser.REWRITE) | (1 << Z3proofParser.SKOLEM) | (1 << Z3proofParser.SYMMETRY) | (1 << Z3proofParser.TH_LEMMA) | (1 << Z3proofParser.TRANSITIVITY) | (1 << Z3proofParser.TRUE_AXIOM) | (1 << Z3proofParser.UNIT_RESOLUTION) | (1 << Z3proofParser.LEFT_PAREN) | (1 << Z3proofParser.LITERAL) | (1 << Z3proofParser.IDENTIFIER))) != 0):
                self.state = 16
                self.rules()


            self.state = 19
            self.match(Z3proofParser.RIGHT_PAREN)
            self.state = 20
            self.match(Z3proofParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class RulesContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.RulesContext, self).__init__(parent, invokingState)
            self.parser = parser

        def LEFT_PAREN(self):
            return self.getToken(Z3proofParser.LEFT_PAREN, 0)

        def ruleList(self):
            return self.getTypedRuleContext(Z3proofParser.RuleListContext,0)


        def RIGHT_PAREN(self):
            return self.getToken(Z3proofParser.RIGHT_PAREN, 0)

        def getRuleIndex(self):
            return Z3proofParser.RULE_rules

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterRules(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitRules(self)




    def rules(self):

        localctx = Z3proofParser.RulesContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_rules)
        try:
            self.state = 27
            token = self._input.LA(1)
            if token in [Z3proofParser.LEFT_PAREN]:
                self.enterOuterAlt(localctx, 1)
                self.state = 22
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 23
                self.ruleList()
                self.state = 24
                self.match(Z3proofParser.RIGHT_PAREN)

            elif token in [Z3proofParser.T__0, Z3proofParser.T__1, Z3proofParser.T__2, Z3proofParser.T__3, Z3proofParser.T__4, Z3proofParser.ASSERT, Z3proofParser.APPLY_DEF, Z3proofParser.COMMUTATIVITY, Z3proofParser.MONOTONICITY, Z3proofParser.DEF_AXIOM, Z3proofParser.DER, Z3proofParser.DISTRIBUTIVITY, Z3proofParser.AND_ELIM, Z3proofParser.NOT_OR_ELIM, Z3proofParser.ELIM_UNUSED, Z3proofParser.HYPOTHESIS, Z3proofParser.IFF_FALSE, Z3proofParser.IFF_TRUE, Z3proofParser.IFF_OTHER, Z3proofParser.QUANT_INST, Z3proofParser.QUANT_INTRO, Z3proofParser.INTRO_DEF, Z3proofParser.LEMMA, Z3proofParser.NNF_NEG, Z3proofParser.NNF_POS, Z3proofParser.MP, Z3proofParser.MP_OTHER, Z3proofParser.PULL_QUANT, Z3proofParser.PUSH_QUANT, Z3proofParser.REFLEXIVITY, Z3proofParser.REWRITE, Z3proofParser.SKOLEM, Z3proofParser.SYMMETRY, Z3proofParser.TH_LEMMA, Z3proofParser.TRANSITIVITY, Z3proofParser.TRUE_AXIOM, Z3proofParser.UNIT_RESOLUTION, Z3proofParser.LITERAL, Z3proofParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 26
                self.ruleList()

            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Proof_ruleContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.Proof_ruleContext, self).__init__(parent, invokingState)
            self.parser = parser

        def ASSERT(self):
            return self.getToken(Z3proofParser.ASSERT, 0)

        def APPLY_DEF(self):
            return self.getToken(Z3proofParser.APPLY_DEF, 0)

        def COMMUTATIVITY(self):
            return self.getToken(Z3proofParser.COMMUTATIVITY, 0)

        def MONOTONICITY(self):
            return self.getToken(Z3proofParser.MONOTONICITY, 0)

        def DEF_AXIOM(self):
            return self.getToken(Z3proofParser.DEF_AXIOM, 0)

        def DER(self):
            return self.getToken(Z3proofParser.DER, 0)

        def DISTRIBUTIVITY(self):
            return self.getToken(Z3proofParser.DISTRIBUTIVITY, 0)

        def AND_ELIM(self):
            return self.getToken(Z3proofParser.AND_ELIM, 0)

        def NOT_OR_ELIM(self):
            return self.getToken(Z3proofParser.NOT_OR_ELIM, 0)

        def ELIM_UNUSED(self):
            return self.getToken(Z3proofParser.ELIM_UNUSED, 0)

        def HYPOTHESIS(self):
            return self.getToken(Z3proofParser.HYPOTHESIS, 0)

        def IFF_FALSE(self):
            return self.getToken(Z3proofParser.IFF_FALSE, 0)

        def IFF_TRUE(self):
            return self.getToken(Z3proofParser.IFF_TRUE, 0)

        def IFF_OTHER(self):
            return self.getToken(Z3proofParser.IFF_OTHER, 0)

        def QUANT_INST(self):
            return self.getToken(Z3proofParser.QUANT_INST, 0)

        def QUANT_INTRO(self):
            return self.getToken(Z3proofParser.QUANT_INTRO, 0)

        def INTRO_DEF(self):
            return self.getToken(Z3proofParser.INTRO_DEF, 0)

        def LEMMA(self):
            return self.getToken(Z3proofParser.LEMMA, 0)

        def NNF_NEG(self):
            return self.getToken(Z3proofParser.NNF_NEG, 0)

        def NNF_POS(self):
            return self.getToken(Z3proofParser.NNF_POS, 0)

        def MP(self):
            return self.getToken(Z3proofParser.MP, 0)

        def MP_OTHER(self):
            return self.getToken(Z3proofParser.MP_OTHER, 0)

        def PULL_QUANT(self):
            return self.getToken(Z3proofParser.PULL_QUANT, 0)

        def PUSH_QUANT(self):
            return self.getToken(Z3proofParser.PUSH_QUANT, 0)

        def REFLEXIVITY(self):
            return self.getToken(Z3proofParser.REFLEXIVITY, 0)

        def REWRITE(self):
            return self.getToken(Z3proofParser.REWRITE, 0)

        def SKOLEM(self):
            return self.getToken(Z3proofParser.SKOLEM, 0)

        def SYMMETRY(self):
            return self.getToken(Z3proofParser.SYMMETRY, 0)

        def TH_LEMMA(self):
            return self.getToken(Z3proofParser.TH_LEMMA, 0)

        def TRANSITIVITY(self):
            return self.getToken(Z3proofParser.TRANSITIVITY, 0)

        def TRUE_AXIOM(self):
            return self.getToken(Z3proofParser.TRUE_AXIOM, 0)

        def UNIT_RESOLUTION(self):
            return self.getToken(Z3proofParser.UNIT_RESOLUTION, 0)

        def expression(self):
            return self.getTypedRuleContext(Z3proofParser.ExpressionContext,0)


        def getRuleIndex(self):
            return Z3proofParser.RULE_proof_rule

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterProof_rule(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitProof_rule(self)




    def proof_rule(self):

        localctx = Z3proofParser.Proof_ruleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_proof_rule)
        try:
            self.state = 62
            token = self._input.LA(1)
            if token in [Z3proofParser.ASSERT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 29
                self.match(Z3proofParser.ASSERT)

            elif token in [Z3proofParser.APPLY_DEF]:
                self.enterOuterAlt(localctx, 2)
                self.state = 30
                self.match(Z3proofParser.APPLY_DEF)

            elif token in [Z3proofParser.COMMUTATIVITY]:
                self.enterOuterAlt(localctx, 3)
                self.state = 31
                self.match(Z3proofParser.COMMUTATIVITY)

            elif token in [Z3proofParser.MONOTONICITY]:
                self.enterOuterAlt(localctx, 4)
                self.state = 32
                self.match(Z3proofParser.MONOTONICITY)

            elif token in [Z3proofParser.DEF_AXIOM]:
                self.enterOuterAlt(localctx, 5)
                self.state = 33
                self.match(Z3proofParser.DEF_AXIOM)

            elif token in [Z3proofParser.DER]:
                self.enterOuterAlt(localctx, 6)
                self.state = 34
                self.match(Z3proofParser.DER)

            elif token in [Z3proofParser.DISTRIBUTIVITY]:
                self.enterOuterAlt(localctx, 7)
                self.state = 35
                self.match(Z3proofParser.DISTRIBUTIVITY)

            elif token in [Z3proofParser.AND_ELIM]:
                self.enterOuterAlt(localctx, 8)
                self.state = 36
                self.match(Z3proofParser.AND_ELIM)

            elif token in [Z3proofParser.NOT_OR_ELIM]:
                self.enterOuterAlt(localctx, 9)
                self.state = 37
                self.match(Z3proofParser.NOT_OR_ELIM)

            elif token in [Z3proofParser.ELIM_UNUSED]:
                self.enterOuterAlt(localctx, 10)
                self.state = 38
                self.match(Z3proofParser.ELIM_UNUSED)

            elif token in [Z3proofParser.HYPOTHESIS]:
                self.enterOuterAlt(localctx, 11)
                self.state = 39
                self.match(Z3proofParser.HYPOTHESIS)

            elif token in [Z3proofParser.IFF_FALSE]:
                self.enterOuterAlt(localctx, 12)
                self.state = 40
                self.match(Z3proofParser.IFF_FALSE)

            elif token in [Z3proofParser.IFF_TRUE]:
                self.enterOuterAlt(localctx, 13)
                self.state = 41
                self.match(Z3proofParser.IFF_TRUE)

            elif token in [Z3proofParser.IFF_OTHER]:
                self.enterOuterAlt(localctx, 14)
                self.state = 42
                self.match(Z3proofParser.IFF_OTHER)

            elif token in [Z3proofParser.QUANT_INST]:
                self.enterOuterAlt(localctx, 15)
                self.state = 43
                self.match(Z3proofParser.QUANT_INST)

            elif token in [Z3proofParser.QUANT_INTRO]:
                self.enterOuterAlt(localctx, 16)
                self.state = 44
                self.match(Z3proofParser.QUANT_INTRO)

            elif token in [Z3proofParser.INTRO_DEF]:
                self.enterOuterAlt(localctx, 17)
                self.state = 45
                self.match(Z3proofParser.INTRO_DEF)

            elif token in [Z3proofParser.LEMMA]:
                self.enterOuterAlt(localctx, 18)
                self.state = 46
                self.match(Z3proofParser.LEMMA)

            elif token in [Z3proofParser.NNF_NEG]:
                self.enterOuterAlt(localctx, 19)
                self.state = 47
                self.match(Z3proofParser.NNF_NEG)

            elif token in [Z3proofParser.NNF_POS]:
                self.enterOuterAlt(localctx, 20)
                self.state = 48
                self.match(Z3proofParser.NNF_POS)

            elif token in [Z3proofParser.MP]:
                self.enterOuterAlt(localctx, 21)
                self.state = 49
                self.match(Z3proofParser.MP)

            elif token in [Z3proofParser.MP_OTHER]:
                self.enterOuterAlt(localctx, 22)
                self.state = 50
                self.match(Z3proofParser.MP_OTHER)

            elif token in [Z3proofParser.PULL_QUANT]:
                self.enterOuterAlt(localctx, 23)
                self.state = 51
                self.match(Z3proofParser.PULL_QUANT)

            elif token in [Z3proofParser.PUSH_QUANT]:
                self.enterOuterAlt(localctx, 24)
                self.state = 52
                self.match(Z3proofParser.PUSH_QUANT)

            elif token in [Z3proofParser.REFLEXIVITY]:
                self.enterOuterAlt(localctx, 25)
                self.state = 53
                self.match(Z3proofParser.REFLEXIVITY)

            elif token in [Z3proofParser.REWRITE]:
                self.enterOuterAlt(localctx, 26)
                self.state = 54
                self.match(Z3proofParser.REWRITE)

            elif token in [Z3proofParser.SKOLEM]:
                self.enterOuterAlt(localctx, 27)
                self.state = 55
                self.match(Z3proofParser.SKOLEM)

            elif token in [Z3proofParser.SYMMETRY]:
                self.enterOuterAlt(localctx, 28)
                self.state = 56
                self.match(Z3proofParser.SYMMETRY)

            elif token in [Z3proofParser.TH_LEMMA]:
                self.enterOuterAlt(localctx, 29)
                self.state = 57
                self.match(Z3proofParser.TH_LEMMA)

            elif token in [Z3proofParser.TRANSITIVITY]:
                self.enterOuterAlt(localctx, 30)
                self.state = 58
                self.match(Z3proofParser.TRANSITIVITY)

            elif token in [Z3proofParser.TRUE_AXIOM]:
                self.enterOuterAlt(localctx, 31)
                self.state = 59
                self.match(Z3proofParser.TRUE_AXIOM)

            elif token in [Z3proofParser.UNIT_RESOLUTION]:
                self.enterOuterAlt(localctx, 32)
                self.state = 60
                self.match(Z3proofParser.UNIT_RESOLUTION)

            elif token in [Z3proofParser.T__0, Z3proofParser.T__1, Z3proofParser.T__2, Z3proofParser.T__3, Z3proofParser.T__4, Z3proofParser.LITERAL, Z3proofParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 33)
                self.state = 61
                self.expression(0)

            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class RuleListContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.RuleListContext, self).__init__(parent, invokingState)
            self.parser = parser

        def proof_rule(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(Z3proofParser.Proof_ruleContext)
            else:
                return self.getTypedRuleContext(Z3proofParser.Proof_ruleContext,i)


        def COMMA(self, i=None):
            if i is None:
                return self.getTokens(Z3proofParser.COMMA)
            else:
                return self.getToken(Z3proofParser.COMMA, i)

        def getRuleIndex(self):
            return Z3proofParser.RULE_ruleList

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterRuleList(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitRuleList(self)




    def ruleList(self):

        localctx = Z3proofParser.RuleListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_ruleList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 64
            self.proof_rule()
            self.state = 69
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==Z3proofParser.COMMA:
                self.state = 65
                self.match(Z3proofParser.COMMA)
                self.state = 66
                self.proof_rule()
                self.state = 71
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExpressionContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.ExpressionContext, self).__init__(parent, invokingState)
            self.parser = parser

        def LEFT_PAREN(self):
            return self.getToken(Z3proofParser.LEFT_PAREN, 0)

        def expression(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(Z3proofParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Z3proofParser.ExpressionContext,i)


        def COMMA(self, i=None):
            if i is None:
                return self.getTokens(Z3proofParser.COMMA)
            else:
                return self.getToken(Z3proofParser.COMMA, i)

        def RIGHT_PAREN(self):
            return self.getToken(Z3proofParser.RIGHT_PAREN, 0)

        def IDENTIFIER(self):
            return self.getToken(Z3proofParser.IDENTIFIER, 0)

        def arguments(self):
            return self.getTypedRuleContext(Z3proofParser.ArgumentsContext,0)


        def LITERAL(self):
            return self.getToken(Z3proofParser.LITERAL, 0)

        def ARITHMETIC_OPERATOR(self):
            return self.getToken(Z3proofParser.ARITHMETIC_OPERATOR, 0)

        def COMPARISON_OPERATOR(self):
            return self.getToken(Z3proofParser.COMPARISON_OPERATOR, 0)

        def getRuleIndex(self):
            return Z3proofParser.RULE_expression

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterExpression(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitExpression(self)



    def expression(self, _p=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = Z3proofParser.ExpressionContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 8
        self.enterRecursionRule(localctx, 8, self.RULE_expression, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.state = 73
                self.match(Z3proofParser.T__0)
                self.state = 74
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 75
                self.expression(0)
                self.state = 76
                self.match(Z3proofParser.COMMA)
                self.state = 77
                self.expression(0)
                self.state = 82
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==Z3proofParser.COMMA:
                    self.state = 78
                    self.match(Z3proofParser.COMMA)
                    self.state = 79
                    self.expression(0)
                    self.state = 84
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 85
                self.match(Z3proofParser.RIGHT_PAREN)
                pass

            elif la_ == 2:
                self.state = 87
                self.match(Z3proofParser.T__1)
                self.state = 88
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 89
                self.expression(0)
                self.state = 90
                self.match(Z3proofParser.COMMA)
                self.state = 91
                self.expression(0)
                self.state = 96
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==Z3proofParser.COMMA:
                    self.state = 92
                    self.match(Z3proofParser.COMMA)
                    self.state = 93
                    self.expression(0)
                    self.state = 98
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 99
                self.match(Z3proofParser.RIGHT_PAREN)
                pass

            elif la_ == 3:
                self.state = 101
                self.match(Z3proofParser.T__2)
                self.state = 102
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 103
                self.expression(0)
                self.state = 104
                self.match(Z3proofParser.COMMA)
                self.state = 105
                self.expression(0)
                self.state = 106
                self.match(Z3proofParser.RIGHT_PAREN)
                pass

            elif la_ == 4:
                self.state = 108
                self.match(Z3proofParser.T__3)
                self.state = 109
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 110
                self.expression(0)
                self.state = 111
                self.match(Z3proofParser.COMMA)
                self.state = 112
                self.expression(0)
                self.state = 113
                self.match(Z3proofParser.COMMA)
                self.state = 114
                self.expression(0)
                self.state = 115
                self.match(Z3proofParser.RIGHT_PAREN)
                pass

            elif la_ == 5:
                self.state = 117
                self.match(Z3proofParser.T__4)
                self.state = 118
                self.match(Z3proofParser.LEFT_PAREN)
                self.state = 119
                self.expression(0)
                self.state = 120
                self.match(Z3proofParser.RIGHT_PAREN)
                pass

            elif la_ == 6:
                self.state = 122
                self.match(Z3proofParser.IDENTIFIER)
                pass

            elif la_ == 7:
                self.state = 123
                self.match(Z3proofParser.IDENTIFIER)
                self.state = 124
                self.arguments()
                pass

            elif la_ == 8:
                self.state = 125
                self.match(Z3proofParser.LITERAL)
                pass


            self._ctx.stop = self._input.LT(-1)
            self.state = 136
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 134
                    la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
                    if la_ == 1:
                        localctx = Z3proofParser.ExpressionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 128
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 129
                        self.match(Z3proofParser.ARITHMETIC_OPERATOR)
                        self.state = 130
                        self.expression(11)
                        pass

                    elif la_ == 2:
                        localctx = Z3proofParser.ExpressionContext(self, _parentctx, _parentState)
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expression)
                        self.state = 131
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 132
                        self.match(Z3proofParser.COMPARISON_OPERATOR)
                        self.state = 133
                        self.expression(10)
                        pass

             
                self.state = 138
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx

    class ArgumentListContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.ArgumentListContext, self).__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i=None):
            if i is None:
                return self.getTypedRuleContexts(Z3proofParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(Z3proofParser.ExpressionContext,i)


        def COMMA(self, i=None):
            if i is None:
                return self.getTokens(Z3proofParser.COMMA)
            else:
                return self.getToken(Z3proofParser.COMMA, i)

        def getRuleIndex(self):
            return Z3proofParser.RULE_argumentList

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterArgumentList(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitArgumentList(self)




    def argumentList(self):

        localctx = Z3proofParser.ArgumentListContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_argumentList)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 139
            self.expression(0)
            self.state = 144
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==Z3proofParser.COMMA:
                self.state = 140
                self.match(Z3proofParser.COMMA)
                self.state = 141
                self.expression(0)
                self.state = 146
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ArgumentsContext(ParserRuleContext):

        def __init__(self, parser, parent=None, invokingState=-1):
            super(Z3proofParser.ArgumentsContext, self).__init__(parent, invokingState)
            self.parser = parser

        def LEFT_PAREN(self):
            return self.getToken(Z3proofParser.LEFT_PAREN, 0)

        def RIGHT_PAREN(self):
            return self.getToken(Z3proofParser.RIGHT_PAREN, 0)

        def argumentList(self):
            return self.getTypedRuleContext(Z3proofParser.ArgumentListContext,0)


        def getRuleIndex(self):
            return Z3proofParser.RULE_arguments

        def enterRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.enterArguments(self)

        def exitRule(self, listener):
            if isinstance( listener, Z3proofListener ):
                listener.exitArguments(self)




    def arguments(self):

        localctx = Z3proofParser.ArgumentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_arguments)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 147
            self.match(Z3proofParser.LEFT_PAREN)
            self.state = 149
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << Z3proofParser.T__0) | (1 << Z3proofParser.T__1) | (1 << Z3proofParser.T__2) | (1 << Z3proofParser.T__3) | (1 << Z3proofParser.T__4) | (1 << Z3proofParser.LITERAL) | (1 << Z3proofParser.IDENTIFIER))) != 0):
                self.state = 148
                self.argumentList()


            self.state = 151
            self.match(Z3proofParser.RIGHT_PAREN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx, ruleIndex, predIndex):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[4] = self.expression_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expression_sempred(self, localctx, predIndex):
            if predIndex == 0:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 9)
         



