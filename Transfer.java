package mygrammar;

/*
   Transfer instruction subclass
 * @author Blake Jacobi ID:  21152074
 */

public class Transfer extends Instruction{

    private final int registerIndex1; //m
    private final int registerIndex2; //n

    public Transfer(int registerIndex1, int registerIndex2)
    {
        this.registerIndex1 = registerIndex1;
        this.registerIndex2 = registerIndex2;
    }

    public int getRegisterIndex1() {
        return registerIndex1;
    }

    public int getRegisterIndex2() {
        return registerIndex2;
    }

    public String toString() {
        String output = "Transfer(" + this.registerIndex1 + ", " + this.registerIndex2 + ")";
        return output;
    }

}
