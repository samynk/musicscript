// Generated from MusicScript.g4 by ANTLR 4.5.3

    package dae.music.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MusicScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCORE=1, PART=2, VOICE=3, MEASURE=4, DURATION=5, LBRACE=6, RBRACE=7, SC=8, 
		CLEF=9, FIFTHS=10, TIME=11, LYRICS=12, NOTE=13, NOTEGROUPSTART=14, NOTEGROUPEND=15, 
		PLUS=16, MINUS=17, EQUAL=18, INT=19, DIGIT=20, STRING=21, BOOLEAN=22, 
		ID=23, LINES=24;
	public static final int
		RULE_score = 0, RULE_part = 1, RULE_voice = 2, RULE_measure = 3, RULE_note = 4, 
		RULE_notegroup = 5, RULE_lyrics = 6, RULE_alteration = 7, RULE_octave = 8, 
		RULE_duration = 9, RULE_property = 10, RULE_clef = 11, RULE_fifths = 12, 
		RULE_time = 13;
	public static final String[] ruleNames = {
		"score", "part", "voice", "measure", "note", "notegroup", "lyrics", "alteration", 
		"octave", "duration", "property", "clef", "fifths", "time"
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

	@Override
	public String getGrammarFileName() { return "MusicScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MusicScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode SCORE() { return getToken(MusicScriptParser.SCORE, 0); }
		public TerminalNode ID() { return getToken(MusicScriptParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MusicScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MusicScriptParser.RBRACE, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<PartContext> part() {
			return getRuleContexts(PartContext.class);
		}
		public PartContext part(int i) {
			return getRuleContext(PartContext.class,i);
		}
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitScore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_score);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(SCORE);
			setState(29);
			match(ID);
			setState(30);
			match(LBRACE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(31);
				property();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PART) {
				{
				{
				setState(37);
				part();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(RBRACE);
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

	public static class PartContext extends ParserRuleContext {
		public TerminalNode PART() { return getToken(MusicScriptParser.PART, 0); }
		public TerminalNode ID() { return getToken(MusicScriptParser.ID, 0); }
		public TerminalNode LBRACE() { return getToken(MusicScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MusicScriptParser.RBRACE, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<VoiceContext> voice() {
			return getRuleContexts(VoiceContext.class);
		}
		public VoiceContext voice(int i) {
			return getRuleContext(VoiceContext.class,i);
		}
		public PartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartContext part() throws RecognitionException {
		PartContext _localctx = new PartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PART);
			setState(46);
			match(ID);
			setState(47);
			match(LBRACE);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(48);
				property();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOICE) {
				{
				{
				setState(54);
				voice();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RBRACE);
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

	public static class VoiceContext extends ParserRuleContext {
		public TerminalNode VOICE() { return getToken(MusicScriptParser.VOICE, 0); }
		public TerminalNode INT() { return getToken(MusicScriptParser.INT, 0); }
		public TerminalNode LBRACE() { return getToken(MusicScriptParser.LBRACE, 0); }
		public List<TerminalNode> MEASURE() { return getTokens(MusicScriptParser.MEASURE); }
		public TerminalNode MEASURE(int i) {
			return getToken(MusicScriptParser.MEASURE, i);
		}
		public TerminalNode RBRACE() { return getToken(MusicScriptParser.RBRACE, 0); }
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitVoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitVoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_voice);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(VOICE);
			setState(63);
			match(INT);
			setState(64);
			match(LBRACE);
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(65);
					match(MEASURE);
					setState(66);
					measure();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(71);
			match(MEASURE);
			setState(72);
			match(RBRACE);
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

	public static class MeasureContext extends ParserRuleContext {
		public ClefContext clef() {
			return getRuleContext(ClefContext.class,0);
		}
		public FifthsContext fifths() {
			return getRuleContext(FifthsContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NotegroupContext> notegroup() {
			return getRuleContexts(NotegroupContext.class);
		}
		public NotegroupContext notegroup(int i) {
			return getRuleContext(NotegroupContext.class,i);
		}
		public List<LyricsContext> lyrics() {
			return getRuleContexts(LyricsContext.class);
		}
		public LyricsContext lyrics(int i) {
			return getRuleContext(LyricsContext.class,i);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitMeasure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitMeasure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_measure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if (_la==CLEF) {
				{
				setState(74);
				clef();
				}
			}

			setState(78);
			_la = _input.LA(1);
			if (_la==FIFTHS) {
				{
				setState(77);
				fifths();
				}
			}

			setState(81);
			_la = _input.LA(1);
			if (_la==TIME) {
				{
				setState(80);
				time();
				}
			}

			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << NOTEGROUPSTART) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL))) != 0)) {
				{
				setState(85);
				switch (_input.LA(1)) {
				case NOTE:
				case PLUS:
				case MINUS:
				case EQUAL:
					{
					setState(83);
					note();
					}
					break;
				case NOTEGROUPSTART:
					{
					setState(84);
					notegroup();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRICS) {
				{
				{
				setState(90);
				lyrics();
				}
				}
				setState(95);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(MusicScriptParser.NOTE, 0); }
		public AlterationContext alteration() {
			return getRuleContext(AlterationContext.class,0);
		}
		public OctaveContext octave() {
			return getRuleContext(OctaveContext.class,0);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitNote(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << EQUAL))) != 0)) {
				{
				setState(96);
				alteration();
				}
			}

			setState(99);
			match(NOTE);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(100);
				octave();
				}
				break;
			}
			setState(104);
			_la = _input.LA(1);
			if (_la==DURATION) {
				{
				setState(103);
				duration();
				}
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

	public static class NotegroupContext extends ParserRuleContext {
		public TerminalNode NOTEGROUPSTART() { return getToken(MusicScriptParser.NOTEGROUPSTART, 0); }
		public TerminalNode NOTEGROUPEND() { return getToken(MusicScriptParser.NOTEGROUPEND, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public NotegroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notegroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterNotegroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitNotegroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitNotegroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotegroupContext notegroup() throws RecognitionException {
		NotegroupContext _localctx = new NotegroupContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_notegroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(NOTEGROUPSTART);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOTE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL))) != 0)) {
				{
				{
				setState(107);
				note();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(NOTEGROUPEND);
			setState(115);
			_la = _input.LA(1);
			if (_la==DURATION) {
				{
				setState(114);
				duration();
				}
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

	public static class LyricsContext extends ParserRuleContext {
		public TerminalNode LYRICS() { return getToken(MusicScriptParser.LYRICS, 0); }
		public TerminalNode STRING() { return getToken(MusicScriptParser.STRING, 0); }
		public LyricsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterLyrics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitLyrics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitLyrics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LyricsContext lyrics() throws RecognitionException {
		LyricsContext _localctx = new LyricsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lyrics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LYRICS);
			setState(118);
			match(STRING);
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

	public static class AlterationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MusicScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MusicScriptParser.MINUS, 0); }
		public TerminalNode EQUAL() { return getToken(MusicScriptParser.EQUAL, 0); }
		public AlterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterAlteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitAlteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitAlteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterationContext alteration() throws RecognitionException {
		AlterationContext _localctx = new AlterationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alteration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << EQUAL))) != 0)) ) {
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

	public static class OctaveContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MusicScriptParser.INT, 0); }
		public TerminalNode PLUS() { return getToken(MusicScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MusicScriptParser.MINUS, 0); }
		public OctaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterOctave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitOctave(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitOctave(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OctaveContext octave() throws RecognitionException {
		OctaveContext _localctx = new OctaveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_octave);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(123);
			match(INT);
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

	public static class DurationContext extends ParserRuleContext {
		public TerminalNode DURATION() { return getToken(MusicScriptParser.DURATION, 0); }
		public TerminalNode INT() { return getToken(MusicScriptParser.INT, 0); }
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitDuration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitDuration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DURATION);
			setState(126);
			match(INT);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MusicScriptParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(MusicScriptParser.EQUAL, 0); }
		public TerminalNode SC() { return getToken(MusicScriptParser.SC, 0); }
		public TerminalNode STRING() { return getToken(MusicScriptParser.STRING, 0); }
		public TerminalNode INT() { return getToken(MusicScriptParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(MusicScriptParser.BOOLEAN, 0); }
		public TerminalNode PLUS() { return getToken(MusicScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MusicScriptParser.MINUS, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
			setState(129);
			match(EQUAL);
			setState(136);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(130);
				match(STRING);
				}
				break;
			case PLUS:
			case MINUS:
			case INT:
				{
				setState(132);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(134);
				match(INT);
				}
				break;
			case BOOLEAN:
				{
				setState(135);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138);
			match(SC);
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

	public static class ClefContext extends ParserRuleContext {
		public TerminalNode CLEF() { return getToken(MusicScriptParser.CLEF, 0); }
		public TerminalNode ID() { return getToken(MusicScriptParser.ID, 0); }
		public ClefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterClef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitClef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitClef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClefContext clef() throws RecognitionException {
		ClefContext _localctx = new ClefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CLEF);
			setState(141);
			match(ID);
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

	public static class FifthsContext extends ParserRuleContext {
		public TerminalNode FIFTHS() { return getToken(MusicScriptParser.FIFTHS, 0); }
		public TerminalNode INT() { return getToken(MusicScriptParser.INT, 0); }
		public TerminalNode PLUS() { return getToken(MusicScriptParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MusicScriptParser.MINUS, 0); }
		public FifthsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fifths; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterFifths(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitFifths(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitFifths(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FifthsContext fifths() throws RecognitionException {
		FifthsContext _localctx = new FifthsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fifths);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(FIFTHS);
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(145);
			match(INT);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(MusicScriptParser.TIME, 0); }
		public List<TerminalNode> INT() { return getTokens(MusicScriptParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MusicScriptParser.INT, i);
		}
		public TerminalNode DURATION() { return getToken(MusicScriptParser.DURATION, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MusicScriptListener ) ((MusicScriptListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MusicScriptVisitor ) return ((MusicScriptVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(TIME);
			setState(148);
			match(INT);
			setState(149);
			match(DURATION);
			setState(150);
			match(INT);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u009b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\64"+
		"\n\3\f\3\16\3\67\13\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\6\4F\n\4\r\4\16\4G\3\4\3\4\3\4\3\5\5\5N\n\5\3\5\5\5Q\n\5\3\5"+
		"\5\5T\n\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\6\5\6d\n\6\3\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\7\3\7\7\7o\n\7\f\7\16\7"+
		"r\13\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u0087\n\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\2\4\3\2\22\24\3\2\22\23\u009f\2\36\3\2\2\2"+
		"\4/\3\2\2\2\6@\3\2\2\2\bM\3\2\2\2\nc\3\2\2\2\fl\3\2\2\2\16w\3\2\2\2\20"+
		"z\3\2\2\2\22|\3\2\2\2\24\177\3\2\2\2\26\u0082\3\2\2\2\30\u008e\3\2\2\2"+
		"\32\u0091\3\2\2\2\34\u0095\3\2\2\2\36\37\7\3\2\2\37 \7\31\2\2 $\7\b\2"+
		"\2!#\5\26\f\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3"+
		"\2\2\2\')\5\4\3\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,"+
		"*\3\2\2\2-.\7\t\2\2.\3\3\2\2\2/\60\7\4\2\2\60\61\7\31\2\2\61\65\7\b\2"+
		"\2\62\64\5\26\f\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2"+
		"\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\6\4\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2"+
		";<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\t\2\2?\5\3\2\2\2@A\7\5\2\2AB\7\25\2"+
		"\2BE\7\b\2\2CD\7\6\2\2DF\5\b\5\2EC\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2HI\3\2\2\2IJ\7\6\2\2JK\7\t\2\2K\7\3\2\2\2LN\5\30\r\2ML\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OQ\5\32\16\2PO\3\2\2\2PQ\3\2\2\2QS\3\2\2\2RT\5\34\17\2S"+
		"R\3\2\2\2ST\3\2\2\2TY\3\2\2\2UX\5\n\6\2VX\5\f\7\2WU\3\2\2\2WV\3\2\2\2"+
		"X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z_\3\2\2\2[Y\3\2\2\2\\^\5\16\b\2]\\\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3\2\2\2bd\5\20\t\2cb\3"+
		"\2\2\2cd\3\2\2\2de\3\2\2\2eg\7\17\2\2fh\5\22\n\2gf\3\2\2\2gh\3\2\2\2h"+
		"j\3\2\2\2ik\5\24\13\2ji\3\2\2\2jk\3\2\2\2k\13\3\2\2\2lp\7\20\2\2mo\5\n"+
		"\6\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\21"+
		"\2\2tv\5\24\13\2ut\3\2\2\2uv\3\2\2\2v\r\3\2\2\2wx\7\16\2\2xy\7\27\2\2"+
		"y\17\3\2\2\2z{\t\2\2\2{\21\3\2\2\2|}\t\3\2\2}~\7\25\2\2~\23\3\2\2\2\177"+
		"\u0080\7\7\2\2\u0080\u0081\7\25\2\2\u0081\25\3\2\2\2\u0082\u0083\7\31"+
		"\2\2\u0083\u008a\7\24\2\2\u0084\u008b\7\27\2\2\u0085\u0087\t\3\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\7\25"+
		"\2\2\u0089\u008b\7\30\2\2\u008a\u0084\3\2\2\2\u008a\u0086\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\n\2\2\u008d\27\3\2\2"+
		"\2\u008e\u008f\7\13\2\2\u008f\u0090\7\31\2\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7\f\2\2\u0092\u0093\t\3\2\2\u0093\u0094\7\25\2\2\u0094\33\3\2\2\2\u0095"+
		"\u0096\7\r\2\2\u0096\u0097\7\25\2\2\u0097\u0098\7\7\2\2\u0098\u0099\7"+
		"\25\2\2\u0099\35\3\2\2\2\24$*\65;GMPSWY_cgjpu\u0086\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}