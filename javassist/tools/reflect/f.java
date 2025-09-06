package javassist.tools.reflect;

import java.io.PrintStream;
import javassist.g;
import javassist.l;

public class f {
    private static void a(PrintStream printStream0) {
        printStream0.println("Usage: java javassist.tools.reflect.Compiler");
        printStream0.println("            (<class> [-m <metaobject>] [-c <class metaobject>])+");
    }

    public static void b(String[] arr_s) throws Exception {
        if(arr_s.length == 0) {
            f.a(System.err);
            return;
        }
        e[] arr_e = new e[arr_s.length];
        int v = f.c(arr_s, arr_e);
        if(v < 1) {
            System.err.println("bad parameter.");
            return;
        }
        f.d(arr_e, v);
    }

    private static int c(String[] arr_s, e[] arr_e) {
        int v1 = -1;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(s.equals("-m")) {
                if(v1 >= 0) {
                    ++v;
                    if(v <= arr_s.length) {
                        arr_e[v1].b = arr_s[v];
                        continue;
                    }
                }
                return -1;
            }
            else if(s.equals("-c")) {
                if(v1 >= 0) {
                    ++v;
                    if(v <= arr_s.length) {
                        arr_e[v1].c = arr_s[v];
                        continue;
                    }
                }
                return -1;
            }
            else {
                if(s.charAt(0) == 45) {
                    return -1;
                }
                e e0 = new e();
                e0.a = s;
                e0.b = null;
                e0.c = null;
                ++v1;
                arr_e[v1] = e0;
            }
        }
        return v1 + 1;
    }

    private static void d(e[] arr_e, int v) throws Exception {
        j j0 = new j();
        g g0 = g.T();
        j0.a(g0);
        for(int v2 = 0; v2 < v; ++v2) {
            l l0 = g0.s(arr_e[v2].a);
            e e0 = arr_e[v2];
            String s = e0.b;
            if(s != null || e0.c != null) {
                if(s == null) {
                    s = "javassist.tools.reflect.Metaobject";
                }
                String s1 = e0.c == null ? "javassist.tools.reflect.ClassMetaobject" : e0.c;
                if(!j0.g(l0, g0.s(s), g0.s(s1))) {
                    System.err.println("Warning: " + l0.X() + " is reflective.  It was not changed.");
                }
                System.err.println(l0.X() + ": " + s + ", " + s1);
            }
            else {
                System.err.println(l0.X() + ": not reflective");
            }
        }
        for(int v1 = 0; v1 < v; ++v1) {
            j0.b(g0, arr_e[v1].a);
            g0.s(arr_e[v1].a).S0();
        }
    }
}

