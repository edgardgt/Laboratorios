// Generated from Lab02.g by ANTLR 4.1

  package laboratorios.lab02;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lab02Parser}.
 */
public interface Lab02Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Lab02Parser#posint}.
	 * @param ctx the parse tree
	 */
	void enterPosint(@NotNull Lab02Parser.PosintContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lab02Parser#posint}.
	 * @param ctx the parse tree
	 */
	void exitPosint(@NotNull Lab02Parser.PosintContext ctx);

	/**
	 * Enter a parse tree produced by {@link Lab02Parser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull Lab02Parser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lab02Parser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull Lab02Parser.NumeroContext ctx);
}