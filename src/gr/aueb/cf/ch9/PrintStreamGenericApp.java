package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("/Users/nikospolizopoulos/Desktop/f1.txt");

        printMessage(ps,"Hello world");
        printMessage(System.out, "Hello Coding Factory");
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
