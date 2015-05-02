// Generated from Z3proof.g4 by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Z3proofParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
    T__0=1, T__1=2, T__2=3, T__3=4, GOAL=5, ASSERT=6, APPLY_DEF=7, COMMUTATIVITY=8,
    MONOTONICITY=9, DEF_AXIOM=10, DER=11, DISTRIBUTIVITY=12, AND_ELIM=13,
    NOT_OR_ELIM=14, ELIM_UNUSED=15, HYPOTHESIS=16, IFF_FALSE=17, IFF_TRUE=18,
    IFF_OTHER=19, QUANT_INST=20, QUANT_INTRO=21, INTRO_DEF=22, LEMMA=23, NNF_NEG=24,
    NNF_POS=25, MP=26, MP_OTHER=27, PULL_QUANT=28, PUSH_QUANT=29, REFLEXIVITY=30,
    REWRITE=31, SKOLEM=32, SYMMETRY=33, TH_LEMMA=34, TRANSITIVITY=35, TRUE_AXIOM=36,
    UNIT_RESOLUTION=37, LEFT_PAREN=38, RIGHT_PAREN=39, COMMA=40, LOWERCASE=41,
    UPPERCASE=42, ALPHA=43, ALPHANUMERIC=44, DIGIT=45, INTEGER=46, FLOAT=47,
    NUMERICAL_LITERAL=48, BOOLEAN_LITERAL=49, LITERAL=50, ARITHMETIC_OPERATOR=51,
    COMPARISON_OPERATOR=52, WHITESPACE=53, IDENTIFIER=54;
    public static final int
    RULE_proof = 0, RULE_rules = 1, RULE_rule = 2, RULE_ruleList = 3, RULE_expression = 4,
    RULE_argumentList = 5, RULE_arguments = 6;
    public static final String[] ruleNames = {
        "proof", "rules", "rule", "ruleList", "expression", "argumentList", "arguments"
    };

    private static final String[] _LITERAL_NAMES = {
        null, "'And'", "'Or'", "'Implies'", "'If'", "'goal'", "'asserted'", "'apply-def'",
        "'commutativity'", "'monotonicity'", "'def-axiom'", "'der'", "'distributivity'",
        "'and-elim'", "'not-or-elim'", "'elim-unused'", "'hypothesis'", "'iff-false'",
        "'iff-true'", "'iff~'", "'quant-inst'", "'quant-intro'", "'intro-def'",
        "'lemma'", "'nnf-neg'", "'nnf-pos'", "'mp'", "'mp~'", "'pull-quant'",
        "'push-quant'", "'refl'", "'rewrite'", "'sk'", "'symm'", "'th-lemma'",
        "'trans'", "'true-axiom'", "'unit-resolution'", "'('", "')'", "','"
    };
    private static final String[] _SYMBOLIC_NAMES = {
        null, null, null, null, null, "GOAL", "ASSERT", "APPLY_DEF", "COMMUTATIVITY",
        "MONOTONICITY", "DEF_AXIOM", "DER", "DISTRIBUTIVITY", "AND_ELIM", "NOT_OR_ELIM",
        "ELIM_UNUSED", "HYPOTHESIS", "IFF_FALSE", "IFF_TRUE", "IFF_OTHER", "QUANT_INST",
        "QUANT_INTRO", "INTRO_DEF", "LEMMA", "NNF_NEG", "NNF_POS", "MP", "MP_OTHER",
        "PULL_QUANT", "PUSH_QUANT", "REFLEXIVITY", "REWRITE", "SKOLEM", "SYMMETRY",
        "TH_LEMMA", "TRANSITIVITY", "TRUE_AXIOM", "UNIT_RESOLUTION", "LEFT_PAREN",
        "RIGHT_PAREN", "COMMA", "LOWERCASE", "UPPERCASE", "ALPHA", "ALPHANUMERIC",
        "DIGIT", "INTEGER", "FLOAT", "NUMERICAL_LITERAL", "BOOLEAN_LITERAL", "LITERAL",
        "ARITHMETIC_OPERATOR", "COMPARISON_OPERATOR", "WHITESPACE", "IDENTIFIER"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() { return "Z3proof.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public Z3proofParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }
    public static class ProofContext extends ParserRuleContext {
        public TerminalNode LEFT_PAREN() { return getToken(Z3proofParser.LEFT_PAREN, 0); }
        public TerminalNode GOAL() { return getToken(Z3proofParser.GOAL, 0); }
        public TerminalNode RIGHT_PAREN() { return getToken(Z3proofParser.RIGHT_PAREN, 0); }
        public TerminalNode EOF() { return getToken(Z3proofParser.EOF, 0); }
        public RulesContext rules() {
            return getRuleContext(RulesContext.class,0);
        }
        public ProofContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_proof; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterProof(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitProof(this);
        }
    }

    public final ProofContext proof() throws RecognitionException {
        ProofContext _localctx = new ProofContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_proof);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(14);
                match(LEFT_PAREN);
                setState(15);
                match(GOAL);
                setState(17);
                _la = _input.LA(1);
                if (_la==LEFT_PAREN) {
                    {
                        setState(16);
                        rules();
                    }
                }

                setState(19);
                match(RIGHT_PAREN);
                setState(20);
                match(EOF);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RulesContext extends ParserRuleContext {
        public TerminalNode LEFT_PAREN() { return getToken(Z3proofParser.LEFT_PAREN, 0); }
        public TerminalNode RIGHT_PAREN() { return getToken(Z3proofParser.RIGHT_PAREN, 0); }
        public RuleListContext ruleList() {
            return getRuleContext(RuleListContext.class,0);
        }
        public RulesContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_rules; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterRules(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitRules(this);
        }
    }

    public final RulesContext rules() throws RecognitionException {
        RulesContext _localctx = new RulesContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_rules);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                match(LEFT_PAREN);
                setState(24);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << APPLY_DEF) | (1L << COMMUTATIVITY) | (1L << MONOTONICITY) | (1L << DEF_AXIOM) | (1L << DER) | (1L << DISTRIBUTIVITY) | (1L << AND_ELIM) | (1L << NOT_OR_ELIM) | (1L << ELIM_UNUSED) | (1L << HYPOTHESIS) | (1L << IFF_FALSE) | (1L << IFF_TRUE) | (1L << IFF_OTHER) | (1L << QUANT_INST) | (1L << QUANT_INTRO) | (1L << INTRO_DEF) | (1L << LEMMA) | (1L << NNF_NEG) | (1L << NNF_POS) | (1L << MP) | (1L << MP_OTHER) | (1L << PULL_QUANT) | (1L << PUSH_QUANT) | (1L << REFLEXIVITY) | (1L << REWRITE) | (1L << SKOLEM) | (1L << SYMMETRY) | (1L << TH_LEMMA) | (1L << TRANSITIVITY) | (1L << TRUE_AXIOM) | (1L << UNIT_RESOLUTION))) != 0)) {
                    {
                        setState(23);
                        ruleList();
                    }
                }

                setState(26);
                match(RIGHT_PAREN);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RuleContext extends ParserRuleContext {
        public TerminalNode ASSERT() { return getToken(Z3proofParser.ASSERT, 0); }
        public TerminalNode APPLY_DEF() { return getToken(Z3proofParser.APPLY_DEF, 0); }
        public TerminalNode COMMUTATIVITY() { return getToken(Z3proofParser.COMMUTATIVITY, 0); }
        public TerminalNode MONOTONICITY() { return getToken(Z3proofParser.MONOTONICITY, 0); }
        public TerminalNode DEF_AXIOM() { return getToken(Z3proofParser.DEF_AXIOM, 0); }
        public TerminalNode DER() { return getToken(Z3proofParser.DER, 0); }
        public TerminalNode DISTRIBUTIVITY() { return getToken(Z3proofParser.DISTRIBUTIVITY, 0); }
        public TerminalNode AND_ELIM() { return getToken(Z3proofParser.AND_ELIM, 0); }
        public TerminalNode NOT_OR_ELIM() { return getToken(Z3proofParser.NOT_OR_ELIM, 0); }
        public TerminalNode ELIM_UNUSED() { return getToken(Z3proofParser.ELIM_UNUSED, 0); }
        public TerminalNode HYPOTHESIS() { return getToken(Z3proofParser.HYPOTHESIS, 0); }
        public TerminalNode IFF_FALSE() { return getToken(Z3proofParser.IFF_FALSE, 0); }
        public TerminalNode IFF_TRUE() { return getToken(Z3proofParser.IFF_TRUE, 0); }
        public TerminalNode IFF_OTHER() { return getToken(Z3proofParser.IFF_OTHER, 0); }
        public TerminalNode QUANT_INST() { return getToken(Z3proofParser.QUANT_INST, 0); }
        public TerminalNode QUANT_INTRO() { return getToken(Z3proofParser.QUANT_INTRO, 0); }
        public TerminalNode INTRO_DEF() { return getToken(Z3proofParser.INTRO_DEF, 0); }
        public TerminalNode LEMMA() { return getToken(Z3proofParser.LEMMA, 0); }
        public TerminalNode NNF_NEG() { return getToken(Z3proofParser.NNF_NEG, 0); }
        public TerminalNode NNF_POS() { return getToken(Z3proofParser.NNF_POS, 0); }
        public TerminalNode MP() { return getToken(Z3proofParser.MP, 0); }
        public TerminalNode MP_OTHER() { return getToken(Z3proofParser.MP_OTHER, 0); }
        public TerminalNode PULL_QUANT() { return getToken(Z3proofParser.PULL_QUANT, 0); }
        public TerminalNode PUSH_QUANT() { return getToken(Z3proofParser.PUSH_QUANT, 0); }
        public TerminalNode REFLEXIVITY() { return getToken(Z3proofParser.REFLEXIVITY, 0); }
        public TerminalNode REWRITE() { return getToken(Z3proofParser.REWRITE, 0); }
        public TerminalNode SKOLEM() { return getToken(Z3proofParser.SKOLEM, 0); }
        public TerminalNode SYMMETRY() { return getToken(Z3proofParser.SYMMETRY, 0); }
        public TerminalNode TH_LEMMA() { return getToken(Z3proofParser.TH_LEMMA, 0); }
        public TerminalNode TRANSITIVITY() { return getToken(Z3proofParser.TRANSITIVITY, 0); }
        public TerminalNode TRUE_AXIOM() { return getToken(Z3proofParser.TRUE_AXIOM, 0); }
        public TerminalNode UNIT_RESOLUTION() { return getToken(Z3proofParser.UNIT_RESOLUTION, 0); }
        public RuleContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_rule; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterRule(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitRule(this);
        }
    }

    public final RuleContext rule() throws RecognitionException {
        RuleContext _localctx = new RuleContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_rule);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(28);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << APPLY_DEF) | (1L << COMMUTATIVITY) | (1L << MONOTONICITY) | (1L << DEF_AXIOM) | (1L << DER) | (1L << DISTRIBUTIVITY) | (1L << AND_ELIM) | (1L << NOT_OR_ELIM) | (1L << ELIM_UNUSED) | (1L << HYPOTHESIS) | (1L << IFF_FALSE) | (1L << IFF_TRUE) | (1L << IFF_OTHER) | (1L << QUANT_INST) | (1L << QUANT_INTRO) | (1L << INTRO_DEF) | (1L << LEMMA) | (1L << NNF_NEG) | (1L << NNF_POS) | (1L << MP) | (1L << MP_OTHER) | (1L << PULL_QUANT) | (1L << PUSH_QUANT) | (1L << REFLEXIVITY) | (1L << REWRITE) | (1L << SKOLEM) | (1L << SYMMETRY) | (1L << TH_LEMMA) | (1L << TRANSITIVITY) | (1L << TRUE_AXIOM) | (1L << UNIT_RESOLUTION))) != 0)) ) {
                    _errHandler.recoverInline(this);
                } else {
                    consume();
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RuleListContext extends ParserRuleContext {
        public List<RuleContext> rule() {
            return getRuleContexts(RuleContext.class);
        }
        public RuleContext rule(int i) {
            return getRuleContext(RuleContext.class,i);
        }
        public List<TerminalNode> COMMA() { return getTokens(Z3proofParser.COMMA); }
        public TerminalNode COMMA(int i) {
            return getToken(Z3proofParser.COMMA, i);
        }
        public RuleListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_ruleList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterRuleList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitRuleList(this);
        }
    }

    public final RuleListContext ruleList() throws RecognitionException {
        RuleListContext _localctx = new RuleListContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_ruleList);
        int _la;
        try {
            setState(45);
            switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(30);
                    rule();
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(31);
                                match(COMMA);
                                setState(32);
                                rule();
                            }
                        }
                        setState(37);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(38);
                    rule();
                    setState(42);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSERT) | (1L << APPLY_DEF) | (1L << COMMUTATIVITY) | (1L << MONOTONICITY) | (1L << DEF_AXIOM) | (1L << DER) | (1L << DISTRIBUTIVITY) | (1L << AND_ELIM) | (1L << NOT_OR_ELIM) | (1L << ELIM_UNUSED) | (1L << HYPOTHESIS) | (1L << IFF_FALSE) | (1L << IFF_TRUE) | (1L << IFF_OTHER) | (1L << QUANT_INST) | (1L << QUANT_INTRO) | (1L << INTRO_DEF) | (1L << LEMMA) | (1L << NNF_NEG) | (1L << NNF_POS) | (1L << MP) | (1L << MP_OTHER) | (1L << PULL_QUANT) | (1L << PUSH_QUANT) | (1L << REFLEXIVITY) | (1L << REWRITE) | (1L << SKOLEM) | (1L << SYMMETRY) | (1L << TH_LEMMA) | (1L << TRANSITIVITY) | (1L << TRUE_AXIOM) | (1L << UNIT_RESOLUTION))) != 0)) {
                        {
                            {
                                setState(39);
                                rule();
                            }
                        }
                        setState(44);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public TerminalNode LEFT_PAREN() { return getToken(Z3proofParser.LEFT_PAREN, 0); }
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public List<TerminalNode> COMMA() { return getTokens(Z3proofParser.COMMA); }
        public TerminalNode COMMA(int i) {
            return getToken(Z3proofParser.COMMA, i);
        }
        public TerminalNode RIGHT_PAREN() { return getToken(Z3proofParser.RIGHT_PAREN, 0); }
        public TerminalNode IDENTIFIER() { return getToken(Z3proofParser.IDENTIFIER, 0); }
        public TerminalNode LITERAL() { return getToken(Z3proofParser.LITERAL, 0); }
        public ArgumentsContext arguments() {
            return getRuleContext(ArgumentsContext.class,0);
        }
        public TerminalNode ARITHMETIC_OPERATOR() { return getToken(Z3proofParser.ARITHMETIC_OPERATOR, 0); }
        public TerminalNode COMPARISON_OPERATOR() { return getToken(Z3proofParser.COMPARISON_OPERATOR, 0); }
        public ExpressionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expression; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterExpression(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitExpression(this);
        }
    }

    public final ExpressionContext expression() throws RecognitionException {
        return expression(0);
    }

    private ExpressionContext expression(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
        ExpressionContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_expression, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                case 1:
                {
                    setState(48);
                    match(T__0);
                    setState(49);
                    match(LEFT_PAREN);
                    setState(50);
                    expression(0);
                    setState(51);
                    match(COMMA);
                    setState(52);
                    expression(0);
                    setState(57);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(53);
                                match(COMMA);
                                setState(54);
                                expression(0);
                            }
                        }
                        setState(59);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(60);
                    match(RIGHT_PAREN);
                }
                break;
                case 2:
                {
                    setState(62);
                    match(T__1);
                    setState(63);
                    match(LEFT_PAREN);
                    setState(64);
                    expression(0);
                    setState(65);
                    match(COMMA);
                    setState(66);
                    expression(0);
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==COMMA) {
                        {
                            {
                                setState(67);
                                match(COMMA);
                                setState(68);
                                expression(0);
                            }
                        }
                        setState(73);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(74);
                    match(RIGHT_PAREN);
                }
                break;
                case 3:
                {
                    setState(76);
                    match(T__2);
                    setState(77);
                    match(LEFT_PAREN);
                    setState(78);
                    expression(0);
                    setState(79);
                    match(COMMA);
                    setState(80);
                    expression(0);
                    setState(81);
                    match(RIGHT_PAREN);
                }
                break;
                case 4:
                {
                    setState(83);
                    match(T__3);
                    setState(84);
                    match(LEFT_PAREN);
                    setState(85);
                    expression(0);
                    setState(86);
                    match(COMMA);
                    setState(87);
                    expression(0);
                    setState(88);
                    match(COMMA);
                    setState(89);
                    expression(0);
                    setState(90);
                    match(RIGHT_PAREN);
                }
                break;
                case 5:
                {
                    setState(92);
                    match(IDENTIFIER);
                }
                break;
                case 6:
                {
                    setState(93);
                    match(LITERAL);
                }
                break;
                case 7:
                {
                    setState(94);
                    match(IDENTIFIER);
                    setState(95);
                    arguments();
                }
                break;
                }
                _ctx.stop = _input.LT(-1);
                setState(106);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(104);
                            switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                            case 1:
                            {
                                _localctx = new ExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(98);
                                if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                setState(99);
                                match(ARITHMETIC_OPERATOR);
                                setState(100);
                                expression(10);
                            }
                            break;
                            case 2:
                            {
                                _localctx = new ExpressionContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(101);
                                if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                setState(102);
                                match(COMPARISON_OPERATOR);
                                setState(103);
                                expression(9);
                            }
                            break;
                            }
                        }
                    }
                    setState(108);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,9,_ctx);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ArgumentListContext extends ParserRuleContext {
        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }
        public ExpressionContext expression(int i) {
            return getRuleContext(ExpressionContext.class,i);
        }
        public List<TerminalNode> COMMA() { return getTokens(Z3proofParser.COMMA); }
        public TerminalNode COMMA(int i) {
            return getToken(Z3proofParser.COMMA, i);
        }
        public ArgumentListContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_argumentList; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterArgumentList(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitArgumentList(this);
        }
    }

    public final ArgumentListContext argumentList() throws RecognitionException {
        ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_argumentList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(109);
                expression(0);
                setState(114);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==COMMA) {
                    {
                        {
                            setState(110);
                            match(COMMA);
                            setState(111);
                            expression(0);
                        }
                    }
                    setState(116);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArgumentsContext extends ParserRuleContext {
        public TerminalNode LEFT_PAREN() { return getToken(Z3proofParser.LEFT_PAREN, 0); }
        public TerminalNode RIGHT_PAREN() { return getToken(Z3proofParser.RIGHT_PAREN, 0); }
        public ArgumentListContext argumentList() {
            return getRuleContext(ArgumentListContext.class,0);
        }
        public ArgumentsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_arguments; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).enterArguments(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof Z3proofListener ) ((Z3proofListener)listener).exitArguments(this);
        }
    }

    public final ArgumentsContext arguments() throws RecognitionException {
        ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_arguments);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(LEFT_PAREN);
                setState(119);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << LITERAL) | (1L << IDENTIFIER))) != 0)) {
                    {
                        setState(118);
                        argumentList();
                    }
                }

                setState(121);
                match(RIGHT_PAREN);
            }
        }
        catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        }
        finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
        case 4:
            return expression_sempred((ExpressionContext)_localctx, predIndex);
        }
        return true;
    }
    private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
        switch (predIndex) {
        case 0:
            return precpred(_ctx, 9);
        case 1:
            return precpred(_ctx, 8);
        }
        return true;
    }

    public static final String _serializedATN =
        "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38~\4\2\t\2\4\3\t\3"+
        "\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\5\2\24\n\2\3\2\3"+
        "\2\3\2\3\3\3\3\5\3\33\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5$\n\5\f\5\16"+
        "\5\'\13\5\3\5\3\5\7\5+\n\5\f\5\16\5.\13\5\5\5\60\n\5\3\6\3\6\3\6\3\6\3"+
        "\6\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
        "\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
        "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n\6\3\6\3\6\3\6\3"+
        "\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\7\7s\n\7\f\7\16\7v\13\7"+
        "\3\b\3\b\5\bz\n\b\3\b\3\b\3\b\2\3\n\t\2\4\6\b\n\f\16\2\3\3\2\b\'\u0087"+
        "\2\20\3\2\2\2\4\30\3\2\2\2\6\36\3\2\2\2\b/\3\2\2\2\nb\3\2\2\2\fo\3\2\2"+
        "\2\16w\3\2\2\2\20\21\7(\2\2\21\23\7\7\2\2\22\24\5\4\3\2\23\22\3\2\2\2"+
        "\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7)\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30"+
        "\32\7(\2\2\31\33\5\b\5\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34"+
        "\35\7)\2\2\35\5\3\2\2\2\36\37\t\2\2\2\37\7\3\2\2\2 %\5\6\4\2!\"\7*\2\2"+
        "\"$\5\6\4\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\60\3\2\2\2\'%\3"+
        "\2\2\2(,\5\6\4\2)+\5\6\4\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60"+
        "\3\2\2\2.,\3\2\2\2/ \3\2\2\2/(\3\2\2\2\60\t\3\2\2\2\61\62\b\6\1\2\62\63"+
        "\7\3\2\2\63\64\7(\2\2\64\65\5\n\6\2\65\66\7*\2\2\66;\5\n\6\2\678\7*\2"+
        "\28:\5\n\6\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2"+
        "\2\2>?\7)\2\2?c\3\2\2\2@A\7\4\2\2AB\7(\2\2BC\5\n\6\2CD\7*\2\2DI\5\n\6"+
        "\2EF\7*\2\2FH\5\n\6\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
        "\2KI\3\2\2\2LM\7)\2\2Mc\3\2\2\2NO\7\5\2\2OP\7(\2\2PQ\5\n\6\2QR\7*\2\2"+
        "RS\5\n\6\2ST\7)\2\2Tc\3\2\2\2UV\7\6\2\2VW\7(\2\2WX\5\n\6\2XY\7*\2\2YZ"+
        "\5\n\6\2Z[\7*\2\2[\\\5\n\6\2\\]\7)\2\2]c\3\2\2\2^c\78\2\2_c\7\64\2\2`"+
        "a\78\2\2ac\5\16\b\2b\61\3\2\2\2b@\3\2\2\2bN\3\2\2\2bU\3\2\2\2b^\3\2\2"+
        "\2b_\3\2\2\2b`\3\2\2\2cl\3\2\2\2de\f\13\2\2ef\7\65\2\2fk\5\n\6\fgh\f\n"+
        "\2\2hi\7\66\2\2ik\5\n\6\13jd\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
        "\2\2\2m\13\3\2\2\2nl\3\2\2\2ot\5\n\6\2pq\7*\2\2qs\5\n\6\2rp\3\2\2\2sv"+
        "\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\r\3\2\2\2vt\3\2\2\2wy\7(\2\2xz\5\f\7\2y"+
        "x\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7)\2\2|\17\3\2\2\2\16\23\32%,/;Ibjlty";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}