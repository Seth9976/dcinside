package n3;

import java.io.PrintStream;
import javassist.bytecode.analysis.e;
import javassist.g;
import javassist.l;

public class c {
    public static void a(String[] arr_s) throws Exception {
        if(arr_s.length != 1) {
            System.err.println("Usage: java javassist.tools.framedump <fully-qualified class name>");
            return;
        }
        l l0 = g.T().s(arr_s[0]);
        PrintStream printStream0 = System.out;
        printStream0.println("Frame Dump of " + l0.X() + ":");
        e.d(l0, printStream0);
    }
}

