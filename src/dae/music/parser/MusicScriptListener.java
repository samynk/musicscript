// Generated from MusicScript.g4 by ANTLR 4.5.3

    package dae.music.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusicScriptParser}.
 */
public interface MusicScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(MusicScriptParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(MusicScriptParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(MusicScriptParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(MusicScriptParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#voice}.
	 * @param ctx the parse tree
	 */
	void enterVoice(MusicScriptParser.VoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#voice}.
	 * @param ctx the parse tree
	 */
	void exitVoice(MusicScriptParser.VoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#measure}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(MusicScriptParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#measure}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(MusicScriptParser.MeasureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(MusicScriptParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(MusicScriptParser.NoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#notegroup}.
	 * @param ctx the parse tree
	 */
	void enterNotegroup(MusicScriptParser.NotegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#notegroup}.
	 * @param ctx the parse tree
	 */
	void exitNotegroup(MusicScriptParser.NotegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#lyrics}.
	 * @param ctx the parse tree
	 */
	void enterLyrics(MusicScriptParser.LyricsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#lyrics}.
	 * @param ctx the parse tree
	 */
	void exitLyrics(MusicScriptParser.LyricsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#alteration}.
	 * @param ctx the parse tree
	 */
	void enterAlteration(MusicScriptParser.AlterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#alteration}.
	 * @param ctx the parse tree
	 */
	void exitAlteration(MusicScriptParser.AlterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#octave}.
	 * @param ctx the parse tree
	 */
	void enterOctave(MusicScriptParser.OctaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#octave}.
	 * @param ctx the parse tree
	 */
	void exitOctave(MusicScriptParser.OctaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(MusicScriptParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(MusicScriptParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(MusicScriptParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(MusicScriptParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#clef}.
	 * @param ctx the parse tree
	 */
	void enterClef(MusicScriptParser.ClefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#clef}.
	 * @param ctx the parse tree
	 */
	void exitClef(MusicScriptParser.ClefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#fifths}.
	 * @param ctx the parse tree
	 */
	void enterFifths(MusicScriptParser.FifthsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#fifths}.
	 * @param ctx the parse tree
	 */
	void exitFifths(MusicScriptParser.FifthsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicScriptParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(MusicScriptParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicScriptParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(MusicScriptParser.TimeContext ctx);
}