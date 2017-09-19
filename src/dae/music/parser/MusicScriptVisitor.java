// Generated from MusicScript.g4 by ANTLR 4.5.3

    package dae.music.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MusicScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MusicScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(MusicScriptParser.ScoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart(MusicScriptParser.PartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#voice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoice(MusicScriptParser.VoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#measure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasure(MusicScriptParser.MeasureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#note}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNote(MusicScriptParser.NoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#notegroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotegroup(MusicScriptParser.NotegroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#lyrics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLyrics(MusicScriptParser.LyricsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#alteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlteration(MusicScriptParser.AlterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave(MusicScriptParser.OctaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration(MusicScriptParser.DurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(MusicScriptParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#clef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClef(MusicScriptParser.ClefContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#fifths}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFifths(MusicScriptParser.FifthsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MusicScriptParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(MusicScriptParser.TimeContext ctx);
}