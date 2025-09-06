package javassist.expr;

import javassist.E;
import javassist.b;
import javassist.bytecode.A;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.compiler.d;
import javassist.k;
import javassist.l;

public class f extends c {
    private A i;
    private int j;
    private static String k = "$1";

    static {
    }

    protected f(A a0, int v, q q0, l l0, T t0) {
        super(a0.g(v), q0, l0, t0);
        this.i = a0;
        this.j = v;
    }

    @Override  // javassist.expr.c
    public String f() {
        return super.f();
    }

    @Override  // javassist.expr.c
    public int g() {
        return super.g();
    }

    @Override  // javassist.expr.c
    public l[] j() {
        return super.j();
    }

    @Override  // javassist.expr.c
    public void k(String s) throws b {
        throw new RuntimeException("not implemented yet");
    }

    @Override  // javassist.expr.c
    public k r() {
        return super.r();
    }

    public l t() throws E {
        int v = this.i.d(this.j);
        if(v == 0) {
            return null;
        }
        String s = this.d().A(v);
        return this.c.w().R(s);
    }

    public void u(String s) throws b {
        this.e = true;
        p p0 = this.b.i();
        d d0 = new d(this.c);
        j j0 = d0.h();
        j0.S0(1);
        j0.P0(p0.D());
        try {
            l l0 = this.t();
            int v = d0.u(l0, "$1");
            d0.q(l0, false);
            j0.n(v);
            d0.g(s);
            j0.k(v);
            int v1 = this.i.g(this.j);
            j0.s0(0xA7);
            j0.G(v1 - this.b.j() - j0.D0() + 1);
            this.g = j0.I0();
            this.f = j0.H0();
            int v2 = this.b.b(j0.E0());
            this.b.c(j0.G0(), v2);
            this.i.l(this.j, v2);
        }
        catch(E e0) {
            throw new b(e0);
        }
        catch(javassist.compiler.c c0) {
            throw new b(c0);
        }
    }

    public boolean v() {
        return this.i.d(this.j) == 0;
    }
}

