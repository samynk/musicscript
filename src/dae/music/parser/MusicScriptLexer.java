// Generated from MusicScript.g4 by ANTLR 4.5.3

    package dae.music.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusicScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCORE=1, PART=2, VOICE=3, MEASURE=4, DURATION=5, LBRACE=6, RBRACE=7, SC=8, 
		CLEF=9, FIFTHS=10, TIME=11, LYRICS=12, NOTE=13, NOTEGROUPSTART=14, NOTEGROUPEND=15, 
		PLUS=16, MINUS=17, EQUAL=18, INT=19, DIGIT=20, STRING=21, BOOLEAN=22, 
		ID=23, LINES=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SCORE", "PART", "VOICE", "MEASURE", "DURATION", "LBRACE", "RBRACE", "SC", 
		"CLEF", "FIFTHS", "TIME", "LYRICS", "NOTE", "NOTEGROUPSTART", "NOTEGROUPEND", 
		"PLUS", "MINUS", "EQUAL", "INT", "DIGIT", "STRING", "BOOLEAN", "ID", "LINES"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'score'", "'part'", "'voice'", "'|'", "'/'", "'{'", "'}'", "';'", 
		"'&'", "'fifths'", "'%'", "'@'", null, "'['", "']'", "'+'", "'-'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCORE", "PART", "VOICE", "MEASURE", "DURATION", "LBRACE", "RBRACE", 
		"SC", "CLEF", "FIFTHS", "TIME", "LYRICS", "NOTE", "NOTEGROUPSTART", "NOTEGROUPEND", 
		"PLUS", "MINUS", "EQUAL", "INT", "DIGIT", "STRING", "BOOLEAN", "ID", "LINES"
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


	public MusicScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MusicScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00a4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16l\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24y\n\24\r\24\16\24z\3\24\5"+
		"\24~\n\24\3\25\3\25\3\26\3\26\7\26\u0084\n\26\f\26\16\26\u0087\13\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0094\n\27"+
		"\3\30\6\30\u0097\n\30\r\30\16\30\u0098\3\30\7\30\u009c\n\30\f\30\16\30"+
		"\u009f\13\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\3\2\t\6\2CITTcitt\3\2\62;\4\2))\60\60\3\2$$\4\2C\\c|\5"+
		"\2\62;C\\c|\5\2\13\f\17\17\"\"\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\59\3\2"+
		"\2\2\7>\3\2\2\2\tD\3\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2"+
		"\2\2\23N\3\2\2\2\25P\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33k\3\2\2\2\35m\3"+
		"\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2)\177\3\2\2"+
		"\2+\u0081\3\2\2\2-\u0093\3\2\2\2/\u0096\3\2\2\2\61\u00a0\3\2\2\2\63\64"+
		"\7u\2\2\64\65\7e\2\2\65\66\7q\2\2\66\67\7t\2\2\678\7g\2\28\4\3\2\2\29"+
		":\7r\2\2:;\7c\2\2;<\7t\2\2<=\7v\2\2=\6\3\2\2\2>?\7x\2\2?@\7q\2\2@A\7k"+
		"\2\2AB\7e\2\2BC\7g\2\2C\b\3\2\2\2DE\7~\2\2E\n\3\2\2\2FG\7\61\2\2G\f\3"+
		"\2\2\2HI\7}\2\2I\16\3\2\2\2JK\7\177\2\2K\20\3\2\2\2LM\7=\2\2M\22\3\2\2"+
		"\2NO\7(\2\2O\24\3\2\2\2PQ\7h\2\2QR\7k\2\2RS\7h\2\2ST\7v\2\2TU\7j\2\2U"+
		"V\7u\2\2V\26\3\2\2\2WX\7\'\2\2X\30\3\2\2\2YZ\7B\2\2Z\32\3\2\2\2[\\\7f"+
		"\2\2\\l\7q\2\2]^\7t\2\2^l\7g\2\2_`\7o\2\2`l\7k\2\2ab\7h\2\2bl\7c\2\2c"+
		"d\7u\2\2de\7q\2\2el\7n\2\2fg\7n\2\2gl\7c\2\2hi\7u\2\2il\7k\2\2jl\t\2\2"+
		"\2k[\3\2\2\2k]\3\2\2\2k_\3\2\2\2ka\3\2\2\2kc\3\2\2\2kf\3\2\2\2kh\3\2\2"+
		"\2kj\3\2\2\2l\34\3\2\2\2mn\7]\2\2n\36\3\2\2\2op\7_\2\2p \3\2\2\2qr\7-"+
		"\2\2r\"\3\2\2\2st\7/\2\2t$\3\2\2\2uv\7?\2\2v&\3\2\2\2wy\t\3\2\2xw\3\2"+
		"\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\t\4\2\2}|\3\2\2\2}~\3\2"+
		"\2\2~(\3\2\2\2\177\u0080\t\3\2\2\u0080*\3\2\2\2\u0081\u0085\t\5\2\2\u0082"+
		"\u0084\n\5\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\t\5\2\2\u0089,\3\2\2\2\u008a\u008b\7v\2\2\u008b\u008c\7t\2\2\u008c"+
		"\u008d\7w\2\2\u008d\u0094\7g\2\2\u008e\u008f\7h\2\2\u008f\u0090\7c\2\2"+
		"\u0090\u0091\7n\2\2\u0091\u0092\7u\2\2\u0092\u0094\7g\2\2\u0093\u008a"+
		"\3\2\2\2\u0093\u008e\3\2\2\2\u0094.\3\2\2\2\u0095\u0097\t\6\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009d\3\2\2\2\u009a\u009c\t\7\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\60\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a1\t\b\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\31\2\2\u00a3\62\3\2\2\2\13\2kz}\u0085\u0093\u0096\u0098\u009d\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}