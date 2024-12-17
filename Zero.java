package mygrammar;

/**
 * Zero instruction subclass
 * @author Blake Jacobi ID:  21152074
 **/

public class Zero extends Instruction{

    private final int registerIndex;

    public Zero(int registerIndex)
    {
        this.registerIndex = registerIndex - 1;
        //this.instructionIndex = instructionIndex;
    }

    public int getRegisterIndex() {
        return registerIndex;
    }

    @Override
    public String toString() {
        String output = "Zero(" + (this.registerIndex + 1) + ")";
        return output;
    }
}
