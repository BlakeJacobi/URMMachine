package mygrammar;

/*
   Main class - for running the URM machine program. Initialise the lexer, parser, visitor and URMachine, then run URM machine
 * @author Blake Jacobi ID:  21152074
 */

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Here is my URM built from the sample program provided (URM simulation 3.a):
        String input = "config[9,7]\njump(1,2,6)\nsucc(2)\nsucc(3)\n jump(1,2,6)\n jump(1,1,2)\ntransfer(3,1)";
        URMLexer lexer = new URMLexer(CharStreams.fromString(input));
        URMParser parser = new URMParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();

        MyURMVisitor visitor = new MyURMVisitor();
        visitor.visit(tree);
        URMachine urMachine = visitor.getURMachine();

        urMachine.run();

        //urMachine2 is a test case of a program that doesn't terminate and loops infinitely (URM simulation 3.b)
        String input2 = "config[9,7]\njump(1,2,6)\nsucc(2)\nsucc(3)\nzero(8)\njump(1,2,6)\ntransfer(3,1)\nZERO(2)\nZero(3)\ntransfer(1,9)\njump(1,1,1)"; //final instruction will cause this program to loop infinitely
        URMLexer lexer2 = new URMLexer(CharStreams.fromString(input2));
        URMParser parser2 = new URMParser(new CommonTokenStream(lexer2));
        ParseTree tree2 = parser2.program();

        MyURMVisitor visitor2 = new MyURMVisitor();
        visitor2.visit(tree2);
        URMachine urMachine2 = visitor2.getURMachine();
        //comment out below line to see just 3.a without the infinite looping of 3.b.
        //urMachine2.run();

    }
}