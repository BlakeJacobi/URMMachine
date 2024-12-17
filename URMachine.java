package mygrammar;
/**
 * URMachine class, register and instruction arraylist instance variables. Execute method which taken an instruction as input
 * and performs a certain operation on the register based on the instruction type. Run method which executes instructions while
 * there are more left to execute. setInstructions method to be used by the MyURMVisitor class when it instantiates an URM object.
 * ensureRegisterSize method to dynamically extend the register list based on instruction parameters.
 * @author Blake Jacobi ID:  21152074
 **/

import java.util.ArrayList;
import java.util.Iterator;

public class URMachine {

    public ArrayList<Integer> registers;
    public ArrayList<Instruction> instructions;
    public int currentInstructionIndex;


    public URMachine() {
        this.registers = new ArrayList<Integer>(); //initially creates an empty arrayList
        this.instructions = new ArrayList<Instruction>();
    }

    public URMachine(int[] config)
    {
        this.registers = new ArrayList<Integer>(config.length);

        for (int j : config) {
            registers.add(j);
        }

        this.instructions = new ArrayList<Instruction>();
    }

    public void addInstruction(Instruction instruction)
    {
        this.instructions.add(instruction);
    }


    public void execute(Instruction instruction)
    {
        if(instruction instanceof Zero zeroInstruction) //pattern matching (only works on Java 16+)
        {
            int registerIndex =  zeroInstruction.getRegisterIndex();
            ensureRegisterSize(registerIndex);
            this.registers.set(registerIndex , 0);
            this.currentInstructionIndex ++;
        }
        if(instruction instanceof Succ succInstruction)
        {
            int registerIndex = succInstruction.getRegister() ;
            ensureRegisterSize(registerIndex);
            this.registers.set(registerIndex, registers.get(registerIndex) + 1); //increment the value stored at register
            this.currentInstructionIndex ++;
        }
        if(instruction instanceof Jump jumpInstruction)
        {
            int m = jumpInstruction.getRegisterIndex();
            int n = jumpInstruction.getRegisterIndex2();
            int q = jumpInstruction.getJumpIndex();
            ensureRegisterSize(Math.max(m -1, n -1));
            if(this.registers.get(m - 1).equals(this.registers.get(n - 1)))
            {
                this.currentInstructionIndex = q - 1; //- 1 to account for indexing starting at R1
            }
            else
            {
                this.currentInstructionIndex++;
            }

        }
        if(instruction instanceof Transfer transferInstruction)
        {
            int m = transferInstruction.getRegisterIndex1();
            int n = transferInstruction.getRegisterIndex2();
            ensureRegisterSize(Math.max(m - 1, n - 1));
            this.registers.set(n - 1, this.registers.get(m -1));
            this.currentInstructionIndex ++;
        }
    }

    private void ensureRegisterSize(int index) {
        // Extend the registers list if the index is greater than the current size
        while (registers.size() <= index) {
            registers.add(0); // Add a new register initialized to 0
        }
    }

    public void run()
    {
        //idea: while current instruction.next is not null: this. current instruction.execute()
        while(currentInstructionIndex < instructions.size())
        {
            System.out.println(this);
            execute(instructions.get(currentInstructionIndex));
        }

        System.out.println(this); //Print out final register configuration
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Current register configuration:\n");

        // Use index-based access for ArrayList
        for (int i = 0; i < registers.size(); i++) {
            output.append("R").append(i + 1).append(": ").append(registers.get(i)).append("    ");
        }

        output.append("\n");

        // Safely check if the currentInstructionIndex is valid
        if (currentInstructionIndex < instructions.size()) {
            output.append("Next instruction: ").append(instructions.get(currentInstructionIndex)).append("\n");
        } else {
            output.append("All instructions executed.\n");
        }
        return output.toString();
    }


    public void setInstructions(ArrayList<Instruction> instructions)
    {
        this.instructions = instructions;
    }
}
