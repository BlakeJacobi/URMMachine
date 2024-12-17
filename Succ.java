package mygrammar;
/**
   Successor instruction subclass
 * @author Blake Jacobi ID:  21152074
 **/


public class Succ extends Instruction{

    private final int registerIndex;

    public Succ(int registerIndex){
        this.registerIndex = registerIndex - 1;
    }

    public int getRegister() {
        return registerIndex;
    }

    @Override
    public String toString() {
        String output = "Succ(" + (this.registerIndex + 1)+ ")";
        return output;
    }
}
