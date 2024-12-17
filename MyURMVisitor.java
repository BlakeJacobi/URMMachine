package mygrammar;

/**
 * My URM visitor class, this class is for a visitor object, which visits each node of the parse tree to create
 * instructions which are then passed to the URMachine constructor, to create the program specific URMachine
 * @author Blake Jacobi ID:  21152074
 **/

import java.util.ArrayList;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyURMVisitor extends URMBaseVisitor<Object> {

    private URMachine urMachine;
    private ArrayList<Instruction> instructions;


    public MyURMVisitor() {
        this.instructions = new ArrayList<>();
    }

    @Override
    public Void visitProgram(URMParser.ProgramContext ctx) {
        // Initialize registers based on config
        if (ctx.config() != null) {
            int[] registers = visitConfig(ctx.config());
            urMachine = new URMachine(registers);
        } else {
            // Default if no config
            urMachine = new URMachine();
        }

        // Visit all instructions
        for (URMParser.InstructionContext instructionCtx : ctx.instruction()) {
            visitInstruction(instructionCtx);
        }

        // Add instructions to the URMachine
        urMachine.setInstructions(instructions);
        return null;
    }

    @Override
    public int[] visitConfig(URMParser.ConfigContext ctx) {
        ArrayList<Integer> registersList = new ArrayList<Integer>();
        for (TerminalNode numberNode : ctx.NUMBER()) {
            registersList.add(Integer.parseInt(numberNode.getText()));
        }
        // Convert to array
        return registersList.stream().mapToInt(i -> i).toArray();
    }

    @Override
    public Void visitJumpInstr(URMParser.JumpInstrContext ctx) {
        int m = Integer.parseInt(ctx.NUMBER(0).getText());
        int n = Integer.parseInt(ctx.NUMBER(1).getText());
        int q = Integer.parseInt(ctx.NUMBER(2).getText());
        instructions.add(new Jump(m, n, q)); // Create JumpInstruction object
        return null;
    }

    @Override
    public Void visitSuccInstr(URMParser.SuccInstrContext ctx) {
        int n = Integer.parseInt(ctx.NUMBER().getText());
        instructions.add(new Succ(n)); // Create SuccInstruction object
        return null;
    }

    @Override
    public Void visitTransferInstr(URMParser.TransferInstrContext ctx) {
        int m = Integer.parseInt(ctx.NUMBER(0).getText());
        int n = Integer.parseInt(ctx.NUMBER(1).getText());
        instructions.add(new Transfer(m, n)); // Create TransferInstruction object
        return null;
    }

    @Override
    public Void visitZeroInstr(URMParser.ZeroInstrContext ctx) {
        int n = Integer.parseInt(ctx.NUMBER().getText());
        instructions.add(new Zero(n)); // Create ZeroInstruction object
        return null;
    }

    public URMachine getURMachine() {
        return urMachine; // Return the constructed URMachine
    }
}