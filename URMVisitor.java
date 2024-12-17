// Generated from C:/Users/bjac9/IdeaProjects/URMachine/URM.g4 by ANTLR 4.13.2
package mygrammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link URMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface URMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link URMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(URMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(URMParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(URMParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#jumpInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpInstr(URMParser.JumpInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#succInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuccInstr(URMParser.SuccInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#transferInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransferInstr(URMParser.TransferInstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link URMParser#zeroInstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZeroInstr(URMParser.ZeroInstrContext ctx);
}