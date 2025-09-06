package n3;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import javassist.bytecode.k;
import javassist.bytecode.l;

public class b {
    public static void a(String[] arr_s) throws Exception {
        if(arr_s.length != 1) {
            System.err.println("Usage: java Dump <class file name>");
            return;
        }
        k k0 = new k(new DataInputStream(new FileInputStream(arr_s[0])));
        PrintWriter printWriter0 = new PrintWriter(System.out, true);
        printWriter0.println("*** constant pool ***");
        k0.l().u0(printWriter0);
        printWriter0.println();
        printWriter0.println("*** members ***");
        l.b(k0, printWriter0);
    }
}

