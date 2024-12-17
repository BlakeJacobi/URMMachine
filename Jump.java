package mygrammar;
/**
 * Jump instruction subclass
 * @author Blake Jacobi ID:  21152074
 **/


public class Jump extends Instruction {

    private final int registerIndex1; //m
    private final int registerIndex2; //n
    private final int jumpIndex; //q
    public Jump(int registerIndex1, int registerIndex2, int jumpIndex) {
        this.registerIndex1 = registerIndex1;
        this.registerIndex2 = registerIndex2;
        this.jumpIndex = jumpIndex;

    }
    public int getRegisterIndex() {
        return registerIndex1;
    }

    public int getRegisterIndex2() {
        return registerIndex2;
    }

    public int getJumpIndex() {
        return jumpIndex;
    }

    @Override
    public String toString() {
        String output = "Jump(" + this.registerIndex1 + ", " + this.registerIndex2 + ", " + this.jumpIndex + ")";
        return output;
    }

}
