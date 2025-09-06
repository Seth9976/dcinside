package javassist.expr;

import javassist.E;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.d;
import javassist.compiler.e;
import javassist.compiler.f;
import javassist.compiler.m;
import javassist.g;
import javassist.k;
import javassist.l;
import javassist.n;

public class j extends c {
    static class a implements m {
        l a;
        int b;
        int c;

        a(l l0, int v, int v1) {
            this.a = l0;
            this.b = v;
            this.c = v1;
        }

        @Override  // javassist.compiler.m
        public void a(f f0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            f0.G(this.a, "<init>", a0);
            f0.q0(this.a);
        }

        @Override  // javassist.compiler.m
        public void b(e e0, javassist.bytecode.j j0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            j0.s0(0xBB);
            j0.G(this.b);
            j0.s0(89);
            e0.X0(this.a, "<init>", a0, false, true, -1, null);
            e0.N1(this.a);
        }
    }

    String i;
    int j;

    protected j(int v, q q0, l l0, T t0, String s, int v1) {
        super(v, q0, l0, t0);
        this.i = s;
        this.j = v1;
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
        this.c.t();
        int v = this.j;
        int v1 = this.b.T(v + 1);
        int v2 = this.t();
        int v3 = v + v2;
        while(v < v3) {
            this.b.Y(0, v);
            ++v;
        }
        t t0 = this.d();
        int v4 = this.a;
        int v5 = this.b.T(v4 + 1);
        String s1 = t0.g0(v5);
        d d0 = new d(this.c);
        g g0 = this.c.w();
        p p0 = this.b.i();
        try {
            l[] arr_l = w.i(s1, g0);
            l l0 = g0.s(this.i);
            int v6 = p0.D();
            d0.m(this.i, arr_l, true, v6, this.s());
            int v7 = d0.q(l0, true);
            d0.p(new a(l0, v1, v5));
            c.b(l0, s);
            javassist.bytecode.j j0 = d0.h();
            c.p(arr_l, true, v6, j0);
            d0.k(p0, v4);
            j0.q(l0);
            j0.C0(v7, l0);
            d0.g(s);
            if(v2 > 3) {
                j0.k(v7);
            }
            this.m(v4, j0, 3);
        }
        catch(javassist.compiler.c c0) {
            throw new b(c0);
        }
        catch(E e0) {
            throw new b(e0);
        }
        catch(javassist.bytecode.e unused_ex) {
            throw new b("broken method");
        }
    }

    @Override  // javassist.expr.c
    public k r() {
        return super.r();
    }

    private int t() throws b {
        int v = this.b.f(this.j + 3);
        if(v == 89) {
            return this.b.f(this.j + 4) != 94 || this.b.f(this.j + 5) != 88 ? 4 : 6;
        }
        return v != 90 || this.b.f(this.j + 4) != 0x5F ? 3 : 5;
    }

    public String u() {
        return this.i;
    }

    public n v() throws E {
        String s = this.d().g0(this.b.T(this.a + 1));
        return this.w().y(s);
    }

    private l w() throws E {
        return this.c.w().s(this.i);
    }

    public String x() {
        return this.d().g0(this.b.T(this.a + 1));
    }
}

