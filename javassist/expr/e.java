package javassist.expr;

import javassist.E;
import javassist.bytecode.T;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.compiler.d;
import javassist.compiler.f;
import javassist.compiler.m;
import javassist.k;
import javassist.l;
import javassist.o;
import javassist.w;

public class e extends c {
    static class a implements m {
        l a;
        int b;
        int c;
        int d;

        a(l l0, int v, int v1, int v2) {
            this.a = l0;
            this.c = v2;
            this.b = v;
            this.d = v1;
        }

        @Override  // javassist.compiler.m
        public void a(f f0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            f0.q0(this.a);
        }

        @Override  // javassist.compiler.m
        public void b(javassist.compiler.e e0, j j0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            int v;
            if(a0 != null && !e0.D1(a0)) {
                throw new javassist.compiler.c("$proceed() cannot take a parameter for field reading");
            }
            if(e.A(this.b)) {
                v = 0;
            }
            else {
                j0.k(this.c);
                v = -1;
            }
            int v1 = this.a instanceof w ? v + ((w)this.a).V0() : v + 1;
            j0.a(this.b);
            j0.G(this.d);
            j0.K0(v1);
            e0.N1(this.a);
        }
    }

    static class b implements m {
        l a;
        int b;
        int c;
        int d;

        b(l l0, int v, int v1, int v2) {
            this.a = l0;
            this.c = v2;
            this.b = v;
            this.d = v1;
        }

        @Override  // javassist.compiler.m
        public void a(f f0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            f0.F(a0, new int[1], new int[1], new String[1]);
            f0.q0(l.m);
            f0.j0();
        }

        @Override  // javassist.compiler.m
        public void b(javassist.compiler.e e0, j j0, javassist.compiler.ast.a a0) throws javassist.compiler.c {
            int v;
            if(e0.j1(a0) != 1) {
                throw new javassist.compiler.c("$proceed() cannot take more than one parameter for field writing");
            }
            if(e.A(this.b)) {
                v = 0;
            }
            else {
                j0.k(this.c);
                v = -1;
            }
            e0.W0(a0, new int[1], new int[1], new String[1]);
            e0.B1(this.a);
            int v1 = this.a instanceof w ? v - ((w)this.a).V0() : v - 1;
            j0.a(this.b);
            j0.G(this.d);
            j0.K0(v1);
            e0.N1(l.m);
            e0.s1();
        }
    }

    int i;

    protected e(int v, q q0, l l0, T t0, int v1) {
        super(v, q0, l0, t0);
        this.i = v1;
    }

    static boolean A(int v) {
        return v == 0xB2 || v == 0xB3;
    }

    public boolean B() {
        return this.i == 0xB3 || this.i == 0xB5;
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
    public void k(String s) throws javassist.b {
        int v4;
        l l1;
        l[] arr_l;
        this.c.t();
        t t0 = this.d();
        int v = this.a;
        int v1 = this.b.T(v + 1);
        d d0 = new d(this.c);
        p p0 = this.b.i();
        try {
            l l0 = javassist.bytecode.w.y(t0.J(v1), this.c.w());
            boolean z = this.y();
            if(z) {
                arr_l = new l[0];
                l1 = l0;
            }
            else {
                arr_l = new l[]{l0};
                l1 = l.m;
            }
            int v2 = p0.D();
            d0.m(t0.G(v1), arr_l, true, v2, this.s());
            boolean z1 = c.b(l1, s);
            if(z) {
                z1 = true;
            }
            int v3 = d0.q(l1, z1);
            if(z) {
                v4 = v2;
                d0.p(new a(l1, this.i, v1, v4));
            }
            else {
                v4 = v2;
                d0.t(l0);
                d0.p(new b(arr_l[0], this.i, v1, v4));
            }
            j j0 = d0.h();
            c.p(arr_l, this.z(), v4, j0);
            d0.k(p0, v);
            if(z1) {
                if(l1 == l.m) {
                    j0.s0(1);
                    j0.n(v3);
                }
                else {
                    j0.q(l1);
                    j0.C0(v3, l1);
                }
            }
            d0.g(s);
            if(z) {
                j0.j0(v3, l1);
            }
            this.m(v, j0, 3);
            return;
        }
        catch(javassist.compiler.c c0) {
        }
        catch(E e0) {
            throw new javassist.b(e0);
        }
        catch(javassist.bytecode.e unused_ex) {
            throw new javassist.b("broken method");
        }
        throw new javassist.b(c0);
    }

    @Override  // javassist.expr.c
    public k r() {
        return super.r();
    }

    public String t() {
        return this.d().G(this.b.T(this.a + 1));
    }

    private l u() throws E {
        return this.c.w().s(this.t());
    }

    public o v() throws E {
        l l0 = this.u();
        int v = this.b.T(this.a + 1);
        t t0 = this.d();
        return l0.P(t0.H(v), t0.J(v));
    }

    public String w() {
        return this.d().H(this.b.T(this.a + 1));
    }

    public String x() {
        return this.d().J(this.b.T(this.a + 1));
    }

    public boolean y() {
        return this.i == 0xB2 || this.i == 180;
    }

    public boolean z() {
        return e.A(this.i);
    }
}

