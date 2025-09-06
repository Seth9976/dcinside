package javassist.bytecode;

import java.io.PrintWriter;
import java.util.List;
import javassist.D;

public class l {
    public static void a(k k0) {
        l.b(k0, new PrintWriter(System.out, true));
    }

    public static void b(k k0, PrintWriter printWriter0) {
        printWriter0.println("major: " + k0.a + ", minor: " + k0.b + " modifiers: " + Integer.toHexString(k0.i()));
        printWriter0.println(D.v(k0.i() & -33) + " class " + k0.t() + " extends " + k0.y());
        String[] arr_s = k0.o();
        if(arr_s != null && arr_s.length > 0) {
            printWriter0.print("    implements ");
            printWriter0.print(arr_s[0]);
            for(int v = 1; v < arr_s.length; ++v) {
                printWriter0.print(", " + arr_s[v]);
            }
            printWriter0.println();
        }
        printWriter0.println();
        for(Object object0: k0.m()) {
            printWriter0.println(D.v(((javassist.bytecode.D)object0).c()) + " " + ((javassist.bytecode.D)object0).i() + "\t" + ((javassist.bytecode.D)object0).h());
            l.c(((javassist.bytecode.D)object0).e(), printWriter0, 'f');
        }
        printWriter0.println();
        for(Object object1: k0.r()) {
            printWriter0.println(D.v(a.k(((T)object1).c())) + " " + ((T)object1).k() + "\t" + ((T)object1).h());
            l.c(((T)object1).e(), printWriter0, 'm');
            printWriter0.println();
        }
        printWriter0.println();
        l.c(k0.k(), printWriter0, 'c');
    }

    static void c(List list0, PrintWriter printWriter0, char c) {
        String s1;
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            d d0 = (d)object0;
            if(d0 instanceof p) {
                printWriter0.println("attribute: " + d0.f() + ": " + d0.getClass().getName());
                printWriter0.println("max stack " + ((p)d0).E() + ", max locals " + ((p)d0).D() + ", " + ((p)d0).C().p() + " catch blocks");
                printWriter0.println("<code attribute begin>");
                l.c(((p)d0).y(), printWriter0, c);
                printWriter0.println("<code attribute end>");
            }
            else if(d0 instanceof c) {
                printWriter0.println("annnotation: " + d0.toString());
            }
            else if(d0 instanceof e0) {
                printWriter0.println("parameter annnotations: " + d0.toString());
            }
            else if(d0 instanceof i0) {
                printWriter0.println("<stack map table begin>");
                e.n(((i0)d0), printWriter0);
                printWriter0.println("<stack map table end>");
            }
            else if(d0 instanceof h0) {
                printWriter0.println("<stack map begin>");
                ((h0)d0).v(printWriter0);
                printWriter0.println("<stack map end>");
            }
            else if(d0 instanceof f0) {
                String s = ((f0)d0).v();
                printWriter0.println("signature: " + s);
                try {
                    if(c == 99) {
                        s1 = f0.J(s).toString();
                    }
                    else {
                        s1 = c == 109 ? f0.L(s).toString() : f0.K(s).toString();
                    }
                    printWriter0.println("           " + s1);
                }
                catch(javassist.bytecode.e unused_ex) {
                    printWriter0.println("           syntax error");
                }
            }
            else {
                printWriter0.println("attribute: " + d0.f() + " (" + d0.c().length + " byte): " + d0.getClass().getName());
            }
        }
    }
}

