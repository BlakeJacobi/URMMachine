// Generated from C:/Users/bjac9/IdeaProjects/URMachine/URM.g4 by ANTLR 4.13.2
package mygrammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link URMParser}.
 */
public interface URMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link URMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(URMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(URMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(URMParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(URMParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(URMParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(URMParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#jumpInstr}.
	 * @param ctx the parse tree
	 */
	void enterJumpInstr(URMParser.JumpInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#jumpInstr}.
	 * @param ctx the parse tree
	 */
	void exitJumpInstr(URMParser.JumpInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#succInstr}.
	 * @param ctx the parse tree
	 */
	void enterSuccInstr(URMParser.SuccInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#succInstr}.
	 * @param ctx the parse tree
	 */
	void exitSuccInstr(URMParser.SuccInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#transferInstr}.
	 * @param ctx the parse tree
	 */
	void enterTransferInstr(URMParser.TransferInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#transferInstr}.
	 * @param ctx the parse tree
	 */
	void exitTransferInstr(URMParser.TransferInstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link URMParser#zeroInstr}.
	 * @param ctx the parse tree
	 */
	void enterZeroInstr(URMParser.ZeroInstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link URMParser#zeroInstr}.
	 * @param ctx the parse tree
	 */
	void exitZeroInstr(URMParser.ZeroInstrContext ctx);
}