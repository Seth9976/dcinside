package javassist.expr;

import javassist.E;
import javassist.b;
import javassist.bytecode.T;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.compiler.d;
import javassist.g;
import javassist.k;
import javassist.l;

public class h extends c {
    protected h(int v, q q0, l l0, T t0) {
        super(v, q0, l0, t0);
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
        boolean z;
        l[] arr_l1;
        int v6;
        l l1;
        int v3;
        String s5;
        String s4;
        String s3;
        this.c.t();
        t t0 = this.d();
        int v = this.a;
        int v1 = this.b.T(v + 1);
        int v2 = this.b.f(v);
        if(v2 == 0xB9) {
            String s1 = t0.N(v1);
            String s2 = t0.O(v1);
            s3 = t0.Q(v1);
            s4 = s1;
            s5 = s2;
            v3 = 5;
        }
        else {
            if(v2 != 0xB7 && v2 != 0xB8 && v2 != 0xB6) {
                throw new b("not method invocation");
            }
            String s6 = t0.d0(v1);
            String s7 = t0.e0(v1);
            s3 = t0.g0(v1);
            s4 = s6;
            s5 = s7;
            v3 = 3;
        }
        d d0 = new d(this.c);
        g g0 = this.c.w();
        p p0 = this.b.i();
        try {
            l[] arr_l = w.i(s3, g0);
            l l0 = w.j(s3, g0);
            int v4 = p0.D();
            d0.m(s4, arr_l, true, v4, this.s());
            int v5 = d0.q(l0, true);
            if(v2 == 0xB8) {
                d0.s(s4, s5);
                l1 = l0;
            }
            else if(v2 == 0xB7) {
                l1 = l0;
                d0.r("$0", s4, s5, s3, v1);
            }
            else {
                l1 = l0;
                d0.o("$0", s5);
            }
            c.b(l1, s);
            j j0 = d0.h();
            if(v2 == 0xB8) {
                v6 = v4;
                arr_l1 = arr_l;
                z = true;
            }
            else {
                z = false;
                v6 = v4;
                arr_l1 = arr_l;
            }
            c.p(arr_l1, z, v6, j0);
            d0.k(p0, v);
            if(l1 != l.m) {
                j0.q(l1);
                j0.C0(v5, l1);
            }
            d0.g(s);
            if(l1 != l.m) {
                j0.j0(v5, l1);
            }
            this.m(v, j0, v3);
            return;
        }
        catch(javassist.compiler.c c0) {
        }
        catch(E e0) {
            throw new b(e0);
        }
        catch(e unused_ex) {
            throw new b("broken method");
        }
        throw new b(c0);
    }

    @Override  // javassist.expr.c
    public k r() {
        return super.r();
    }

    public String t() {
        t t0 = this.d();
        int v = this.a;
        int v1 = this.b.f(v);
        int v2 = this.b.T(v + 1);
        String s = v1 == 0xB9 ? t0.N(v2) : t0.d0(v2);
        return s.charAt(0) == 91 ? w.w(s) : s;
    }

    protected l u() throws E {
        return this.c.w().s(this.t());
    }

    public javassist.q v() throws E {
        return this.u().U(this.w(), this.y());
    }

    public String w() {
        t t0 = this.d();
        return t0.p0(t0.j0(this.x(t0)));
    }

    private int x(t t0) {
        int v = this.a;
        int v1 = this.b.f(v);
        int v2 = this.b.T(v + 1);
        return v1 == 0xB9 ? t0.P(v2) : t0.f0(v2);
    }

    public String y() {
        t t0 = this.d();
        return t0.p0(t0.i0(this.x(t0)));
    }

    public boolean z() {
        return this.b.f(this.a) == 0xB7 && !this.r().f().X().equals(this.t());
    }
}

