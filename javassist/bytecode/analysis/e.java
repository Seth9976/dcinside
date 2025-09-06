package javassist.bytecode.analysis;

import java.io.PrintStream;
import javassist.D;
import javassist.E;
import javassist.bytecode.H;
import javassist.bytecode.T;
import javassist.bytecode.p;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.l;
import javassist.q;

public final class e {
    private final PrintStream a;

    public e(PrintStream printStream0) {
        this.a = printStream0;
    }

    private void a(int v) {
        while(v > 0) {
            this.a.print(' ');
            --v;
        }
    }

    private String b(q q0) {
        try {
            return D.v(q0.h()) + " " + q0.b0().X() + " " + q0.i() + w.E(q0.j()) + ";";
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
    }

    public void c(l l0) {
        q[] arr_q = l0.J();
        for(int v = 0; v < arr_q.length; ++v) {
            this.e(arr_q[v]);
        }
    }

    public static void d(l l0, PrintStream printStream0) {
        new e(printStream0).c(l0);
    }

    public void e(q q0) {
        int v1;
        d[] arr_d;
        this.a.println("\n" + this.b(q0));
        T t0 = q0.D();
        t t1 = t0.g();
        p p0 = t0.f();
        if(p0 == null) {
            return;
        }
        try {
            arr_d = new a().a(q0.f(), t0);
        }
        catch(javassist.bytecode.e e0) {
            throw new RuntimeException(e0);
        }
        int v = String.valueOf(p0.A()).length();
        javassist.bytecode.q q1 = p0.G();
        while(q1.l()) {
            try {
                v1 = q1.J();
            }
            catch(javassist.bytecode.e e1) {
                throw new RuntimeException(e1);
            }
            this.a.println(v1 + ": " + H.d(q1, v1, t1));
            this.a(v + 3);
            d d0 = arr_d[v1];
            if(d0 == null) {
                this.a.println("--DEAD CODE--");
            }
            else {
                this.g(d0);
                this.a(v + 3);
                this.f(d0);
            }
        }
    }

    private void f(d d0) {
        this.a.print("locals [");
        int v = d0.i();
        for(int v1 = 0; v1 < v; ++v1) {
            if(v1 > 0) {
                this.a.print(", ");
            }
            k k0 = d0.d(v1);
            this.a.print((k0 == null ? "empty" : k0.toString()));
        }
        this.a.println("]");
    }

    private void g(d d0) {
        this.a.print("stack [");
        int v = d0.f();
        for(int v1 = 0; v1 <= v; ++v1) {
            if(v1 > 0) {
                this.a.print(", ");
            }
            k k0 = d0.e(v1);
            this.a.print(k0);
        }
        this.a.println("]");
    }
}

