// Generated from Z3proof.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Z3proofLexer extends Lexer {
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
    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
        "T__0", "T__1", "T__2", "T__3", "GOAL", "ASSERT", "APPLY_DEF", "COMMUTATIVITY",
        "MONOTONICITY", "DEF_AXIOM", "DER", "DISTRIBUTIVITY", "AND_ELIM", "NOT_OR_ELIM",
        "ELIM_UNUSED", "HYPOTHESIS", "IFF_FALSE", "IFF_TRUE", "IFF_OTHER", "QUANT_INST",
        "QUANT_INTRO", "INTRO_DEF", "LEMMA", "NNF_NEG", "NNF_POS", "MP", "MP_OTHER",
        "PULL_QUANT", "PUSH_QUANT", "REFLEXIVITY", "REWRITE", "SKOLEM", "SYMMETRY",
        "TH_LEMMA", "TRANSITIVITY", "TRUE_AXIOM", "UNIT_RESOLUTION", "LEFT_PAREN",
        "RIGHT_PAREN", "COMMA", "LOWERCASE", "UPPERCASE", "ALPHA", "ALPHANUMERIC",
        "DIGIT", "INTEGER", "FLOAT", "NUMERICAL_LITERAL", "BOOLEAN_LITERAL", "LITERAL",
        "ARITHMETIC_OPERATOR", "COMPARISON_OPERATOR", "WHITESPACE", "IDENTIFIER"
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


    public Z3proofLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    @Override
    public String getGrammarFileName() { return "Z3proof.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public String[] getModeNames() { return modeNames; }

    @Override
    public ATN getATN() { return _ATN; }

    public static final String _serializedATN =
        "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u01fd\b\1\4\2\t"+
        "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
        "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
        "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
        "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
        "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
        ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
        "\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
        "\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
        "\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
        "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
        "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
        "\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
        "\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
        "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
        "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
        "\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
        "\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
        "\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
        "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
        "\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
        "\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
        "\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
        "\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
        "\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3"+
        "\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3"+
        "%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
        "&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\7/\u01bc"+
        "\n/\f/\16/\u01bf\13/\5/\u01c1\n/\3\60\6\60\u01c4\n\60\r\60\16\60\u01c5"+
        "\3\60\3\60\6\60\u01ca\n\60\r\60\16\60\u01cb\3\61\3\61\5\61\u01d0\n\61"+
        "\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01db\n\62\3\63\5\63"+
        "\u01de\n\63\3\63\3\63\5\63\u01e2\n\63\3\64\3\64\3\65\3\65\3\65\3\65\3"+
        "\65\3\65\3\65\3\65\3\65\5\65\u01ef\n\65\3\66\3\66\3\67\6\67\u01f4\n\67"+
        "\r\67\16\67\u01f5\3\67\7\67\u01f9\n\67\f\67\16\67\u01fc\13\67\2\28\3\3"+
        "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
        "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
        "A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\13"+
        "\3\2c|\3\2C\\\4\2C\\c|\5\2\62;C\\c|\3\2\62;\3\2\63;\5\2,-//\61\61\4\2"+
        ">>@@\4\2\13\f\"\"\u020a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
        "\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
        "\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
        "\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
        "\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
        "\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
        "\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
        "Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
        "\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
        "\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7v\3\2\2\2\t~\3\2\2\2\13"+
        "\u0081\3\2\2\2\r\u0086\3\2\2\2\17\u008f\3\2\2\2\21\u0099\3\2\2\2\23\u00a7"+
        "\3\2\2\2\25\u00b4\3\2\2\2\27\u00be\3\2\2\2\31\u00c2\3\2\2\2\33\u00d1\3"+
        "\2\2\2\35\u00da\3\2\2\2\37\u00e6\3\2\2\2!\u00f2\3\2\2\2#\u00fd\3\2\2\2"+
        "%\u0107\3\2\2\2\'\u0110\3\2\2\2)\u0115\3\2\2\2+\u0120\3\2\2\2-\u012c\3"+
        "\2\2\2/\u0136\3\2\2\2\61\u013c\3\2\2\2\63\u0144\3\2\2\2\65\u014c\3\2\2"+
        "\2\67\u014f\3\2\2\29\u0153\3\2\2\2;\u015e\3\2\2\2=\u0169\3\2\2\2?\u016e"+
        "\3\2\2\2A\u0176\3\2\2\2C\u0179\3\2\2\2E\u017e\3\2\2\2G\u0187\3\2\2\2I"+
        "\u018d\3\2\2\2K\u0198\3\2\2\2M\u01a8\3\2\2\2O\u01aa\3\2\2\2Q\u01ac\3\2"+
        "\2\2S\u01ae\3\2\2\2U\u01b0\3\2\2\2W\u01b2\3\2\2\2Y\u01b4\3\2\2\2[\u01b6"+
        "\3\2\2\2]\u01c0\3\2\2\2_\u01c3\3\2\2\2a\u01cf\3\2\2\2c\u01da\3\2\2\2e"+
        "\u01e1\3\2\2\2g\u01e3\3\2\2\2i\u01ee\3\2\2\2k\u01f0\3\2\2\2m\u01f3\3\2"+
        "\2\2op\7C\2\2pq\7p\2\2qr\7f\2\2r\4\3\2\2\2st\7Q\2\2tu\7t\2\2u\6\3\2\2"+
        "\2vw\7K\2\2wx\7o\2\2xy\7r\2\2yz\7n\2\2z{\7k\2\2{|\7g\2\2|}\7u\2\2}\b\3"+
        "\2\2\2~\177\7K\2\2\177\u0080\7h\2\2\u0080\n\3\2\2\2\u0081\u0082\7i\2\2"+
        "\u0082\u0083\7q\2\2\u0083\u0084\7c\2\2\u0084\u0085\7n\2\2\u0085\f\3\2"+
        "\2\2\u0086\u0087\7c\2\2\u0087\u0088\7u\2\2\u0088\u0089\7u\2\2\u0089\u008a"+
        "\7g\2\2\u008a\u008b\7t\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d"+
        "\u008e\7f\2\2\u008e\16\3\2\2\2\u008f\u0090\7c\2\2\u0090\u0091\7r\2\2\u0091"+
        "\u0092\7r\2\2\u0092\u0093\7n\2\2\u0093\u0094\7{\2\2\u0094\u0095\7/\2\2"+
        "\u0095\u0096\7f\2\2\u0096\u0097\7g\2\2\u0097\u0098\7h\2\2\u0098\20\3\2"+
        "\2\2\u0099\u009a\7e\2\2\u009a\u009b\7q\2\2\u009b\u009c\7o\2\2\u009c\u009d"+
        "\7o\2\2\u009d\u009e\7w\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7c\2\2\u00a0"+
        "\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7k\2\2"+
        "\u00a4\u00a5\7v\2\2\u00a5\u00a6\7{\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7"+
        "o\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
        "\7v\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7k\2\2\u00af"+
        "\u00b0\7e\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7v\2\2\u00b2\u00b3\7{\2\2"+
        "\u00b3\24\3\2\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7"+
        "h\2\2\u00b7\u00b8\7/\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7z\2\2\u00ba\u00bb"+
        "\7k\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7o\2\2\u00bd\26\3\2\2\2\u00be\u00bf"+
        "\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\30\3\2\2\2\u00c2\u00c3"+
        "\7f\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7u\2\2\u00c5\u00c6\7v\2\2\u00c6"+
        "\u00c7\7t\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7w\2\2"+
        "\u00ca\u00cb\7v\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7x\2\2\u00cd\u00ce"+
        "\7k\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7{\2\2\u00d0\32\3\2\2\2\u00d1\u00d2"+
        "\7c\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5\7/\2\2\u00d5"+
        "\u00d6\7g\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7o\2\2"+
        "\u00d9\34\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7q\2\2\u00dc\u00dd\7"+
        "v\2\2\u00dd\u00de\7/\2\2\u00de\u00df\7q\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
        "\7/\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7k\2\2\u00e4"+
        "\u00e5\7o\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7n\2\2\u00e8"+
        "\u00e9\7k\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7/\2\2\u00eb\u00ec\7w\2\2"+
        "\u00ec\u00ed\7p\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7u\2\2\u00ef\u00f0"+
        "\7g\2\2\u00f0\u00f1\7f\2\2\u00f1 \3\2\2\2\u00f2\u00f3\7j\2\2\u00f3\u00f4"+
        "\7{\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7v\2\2\u00f7"+
        "\u00f8\7j\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7k\2\2"+
        "\u00fb\u00fc\7u\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\7k\2\2\u00fe\u00ff\7h"+
        "\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7/\2\2\u0101\u0102\7h\2\2\u0102\u0103"+
        "\7c\2\2\u0103\u0104\7n\2\2\u0104\u0105\7u\2\2\u0105\u0106\7g\2\2\u0106"+
        "$\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109\7h\2\2\u0109\u010a\7h\2\2\u010a"+
        "\u010b\7/\2\2\u010b\u010c\7v\2\2\u010c\u010d\7t\2\2\u010d\u010e\7w\2\2"+
        "\u010e\u010f\7g\2\2\u010f&\3\2\2\2\u0110\u0111\7k\2\2\u0111\u0112\7h\2"+
        "\2\u0112\u0113\7h\2\2\u0113\u0114\7\u0080\2\2\u0114(\3\2\2\2\u0115\u0116"+
        "\7s\2\2\u0116\u0117\7w\2\2\u0117\u0118\7c\2\2\u0118\u0119\7p\2\2\u0119"+
        "\u011a\7v\2\2\u011a\u011b\7/\2\2\u011b\u011c\7k\2\2\u011c\u011d\7p\2\2"+
        "\u011d\u011e\7u\2\2\u011e\u011f\7v\2\2\u011f*\3\2\2\2\u0120\u0121\7s\2"+
        "\2\u0121\u0122\7w\2\2\u0122\u0123\7c\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
        "\7v\2\2\u0125\u0126\7/\2\2\u0126\u0127\7k\2\2\u0127\u0128\7p\2\2\u0128"+
        "\u0129\7v\2\2\u0129\u012a\7t\2\2\u012a\u012b\7q\2\2\u012b,\3\2\2\2\u012c"+
        "\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7v\2\2\u012f\u0130\7t\2\2"+
        "\u0130\u0131\7q\2\2\u0131\u0132\7/\2\2\u0132\u0133\7f\2\2\u0133\u0134"+
        "\7g\2\2\u0134\u0135\7h\2\2\u0135.\3\2\2\2\u0136\u0137\7n\2\2\u0137\u0138"+
        "\7g\2\2\u0138\u0139\7o\2\2\u0139\u013a\7o\2\2\u013a\u013b\7c\2\2\u013b"+
        "\60\3\2\2\2\u013c\u013d\7p\2\2\u013d\u013e\7p\2\2\u013e\u013f\7h\2\2\u013f"+
        "\u0140\7/\2\2\u0140\u0141\7p\2\2\u0141\u0142\7g\2\2\u0142\u0143\7i\2\2"+
        "\u0143\62\3\2\2\2\u0144\u0145\7p\2\2\u0145\u0146\7p\2\2\u0146\u0147\7"+
        "h\2\2\u0147\u0148\7/\2\2\u0148\u0149\7r\2\2\u0149\u014a\7q\2\2\u014a\u014b"+
        "\7u\2\2\u014b\64\3\2\2\2\u014c\u014d\7o\2\2\u014d\u014e\7r\2\2\u014e\66"+
        "\3\2\2\2\u014f\u0150\7o\2\2\u0150\u0151\7r\2\2\u0151\u0152\7\u0080\2\2"+
        "\u01528\3\2\2\2\u0153\u0154\7r\2\2\u0154\u0155\7w\2\2\u0155\u0156\7n\2"+
        "\2\u0156\u0157\7n\2\2\u0157\u0158\7/\2\2\u0158\u0159\7s\2\2\u0159\u015a"+
        "\7w\2\2\u015a\u015b\7c\2\2\u015b\u015c\7p\2\2\u015c\u015d\7v\2\2\u015d"+
        ":\3\2\2\2\u015e\u015f\7r\2\2\u015f\u0160\7w\2\2\u0160\u0161\7u\2\2\u0161"+
        "\u0162\7j\2\2\u0162\u0163\7/\2\2\u0163\u0164\7s\2\2\u0164\u0165\7w\2\2"+
        "\u0165\u0166\7c\2\2\u0166\u0167\7p\2\2\u0167\u0168\7v\2\2\u0168<\3\2\2"+
        "\2\u0169\u016a\7t\2\2\u016a\u016b\7g\2\2\u016b\u016c\7h\2\2\u016c\u016d"+
        "\7n\2\2\u016d>\3\2\2\2\u016e\u016f\7t\2\2\u016f\u0170\7g\2\2\u0170\u0171"+
        "\7y\2\2\u0171\u0172\7t\2\2\u0172\u0173\7k\2\2\u0173\u0174\7v\2\2\u0174"+
        "\u0175\7g\2\2\u0175@\3\2\2\2\u0176\u0177\7u\2\2\u0177\u0178\7m\2\2\u0178"+
        "B\3\2\2\2\u0179\u017a\7u\2\2\u017a\u017b\7{\2\2\u017b\u017c\7o\2\2\u017c"+
        "\u017d\7o\2\2\u017dD\3\2\2\2\u017e\u017f\7v\2\2\u017f\u0180\7j\2\2\u0180"+
        "\u0181\7/\2\2\u0181\u0182\7n\2\2\u0182\u0183\7g\2\2\u0183\u0184\7o\2\2"+
        "\u0184\u0185\7o\2\2\u0185\u0186\7c\2\2\u0186F\3\2\2\2\u0187\u0188\7v\2"+
        "\2\u0188\u0189\7t\2\2\u0189\u018a\7c\2\2\u018a\u018b\7p\2\2\u018b\u018c"+
        "\7u\2\2\u018cH\3\2\2\2\u018d\u018e\7v\2\2\u018e\u018f\7t\2\2\u018f\u0190"+
        "\7w\2\2\u0190\u0191\7g\2\2\u0191\u0192\7/\2\2\u0192\u0193\7c\2\2\u0193"+
        "\u0194\7z\2\2\u0194\u0195\7k\2\2\u0195\u0196\7q\2\2\u0196\u0197\7o\2\2"+
        "\u0197J\3\2\2\2\u0198\u0199\7w\2\2\u0199\u019a\7p\2\2\u019a\u019b\7k\2"+
        "\2\u019b\u019c\7v\2\2\u019c\u019d\7/\2\2\u019d\u019e\7t\2\2\u019e\u019f"+
        "\7g\2\2\u019f\u01a0\7u\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7n\2\2\u01a2"+
        "\u01a3\7w\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7q\2\2"+
        "\u01a6\u01a7\7p\2\2\u01a7L\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9N\3\2\2\2\u01aa"+
        "\u01ab\7+\2\2\u01abP\3\2\2\2\u01ac\u01ad\7.\2\2\u01adR\3\2\2\2\u01ae\u01af"+
        "\t\2\2\2\u01afT\3\2\2\2\u01b0\u01b1\t\3\2\2\u01b1V\3\2\2\2\u01b2\u01b3"+
        "\t\4\2\2\u01b3X\3\2\2\2\u01b4\u01b5\t\5\2\2\u01b5Z\3\2\2\2\u01b6\u01b7"+
        "\t\6\2\2\u01b7\\\3\2\2\2\u01b8\u01c1\7\62\2\2\u01b9\u01bd\t\7\2\2\u01ba"+
        "\u01bc\5[.\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2"+
        "\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01b8"+
        "\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c1^\3\2\2\2\u01c2\u01c4\5[.\2\u01c3\u01c2"+
        "\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
        "\u01c7\3\2\2\2\u01c7\u01c9\7\60\2\2\u01c8\u01ca\5[.\2\u01c9\u01c8\3\2"+
        "\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
        "`\3\2\2\2\u01cd\u01d0\5_\60\2\u01ce\u01d0\5]/\2\u01cf\u01cd\3\2\2\2\u01cf"+
        "\u01ce\3\2\2\2\u01d0b\3\2\2\2\u01d1\u01d2\7V\2\2\u01d2\u01d3\7t\2\2\u01d3"+
        "\u01d4\7w\2\2\u01d4\u01db\7g\2\2\u01d5\u01d6\7H\2\2\u01d6\u01d7\7c\2\2"+
        "\u01d7\u01d8\7n\2\2\u01d8\u01d9\7u\2\2\u01d9\u01db\7g\2\2\u01da\u01d1"+
        "\3\2\2\2\u01da\u01d5\3\2\2\2\u01dbd\3\2\2\2\u01dc\u01de\7/\2\2\u01dd\u01dc"+
        "\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\5a\61\2\u01e0"+
        "\u01e2\5c\62\2\u01e1\u01dd\3\2\2\2\u01e1\u01e0\3\2\2\2\u01e2f\3\2\2\2"+
        "\u01e3\u01e4\t\b\2\2\u01e4h\3\2\2\2\u01e5\u01ef\t\t\2\2\u01e6\u01e7\7"+
        "@\2\2\u01e7\u01ef\7?\2\2\u01e8\u01e9\7>\2\2\u01e9\u01ef\7?\2\2\u01ea\u01eb"+
        "\7#\2\2\u01eb\u01ef\7?\2\2\u01ec\u01ed\7?\2\2\u01ed\u01ef\7?\2\2\u01ee"+
        "\u01e5\3\2\2\2\u01ee\u01e6\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01ea\3\2"+
        "\2\2\u01ee\u01ec\3\2\2\2\u01efj\3\2\2\2\u01f0\u01f1\t\n\2\2\u01f1l\3\2"+
        "\2\2\u01f2\u01f4\5W,\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3"+
        "\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fa\3\2\2\2\u01f7\u01f9\5Y-\2\u01f8"+
        "\u01f7\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
        "\2\2\u01fbn\3\2\2\2\u01fc\u01fa\3\2\2\2\16\2\u01bd\u01c0\u01c5\u01cb\u01cf"+
        "\u01da\u01dd\u01e1\u01ee\u01f5\u01fa\2";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}