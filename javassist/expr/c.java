package javassist.expr;

import java.util.LinkedList;
import java.util.List;
import javassist.E;
import javassist.b;
import javassist.bytecode.A;
import javassist.bytecode.C;
import javassist.bytecode.T;
import javassist.bytecode.c0;
import javassist.bytecode.e;
import javassist.bytecode.j;
import javassist.bytecode.k;
import javassist.bytecode.p;
import javassist.bytecode.q;
import javassist.bytecode.t;
import javassist.g;
import javassist.l;
import javassist.w;

public abstract class c implements c0 {
    int a;
    q b;
    l c;
    T d;
    boolean e;
    int f;
    int g;
    static final String h = "java.lang.Object";

    protected c(int v, q q0, l l0, T t0) {
        this.a = v;
        this.b = q0;
        this.c = l0;
        this.d = t0;
    }

    private static void a(List list0, l l0) {
        if(list0.contains(l0)) {
            return;
        }
        list0.add(l0);
    }

    static final boolean b(l l0, String s) throws b {
        boolean z = s.indexOf("$_") >= 0;
        if(!z && l0 != l.m) {
            throw new b("the resulting value is not stored in $_");
        }
        return z;
    }

    protected final boolean c() {
        return this.e;
    }

    protected final t d() {
        return this.d.g();
    }

    public l e() {
        return this.c;
    }

    public String f() {
        k k0 = this.c.u();
        return k0 == null ? null : k0.v();
    }

    public int g() {
        return this.d.j(this.a);
    }

    public int h() {
        return this.a;
    }

    protected final int i() {
        return this.f;
    }

    public l[] j() {
        g g0 = this.c.w();
        t t0 = this.d.g();
        LinkedList linkedList0 = new LinkedList();
        try {
            A a0 = this.d.f().C();
            int v1 = this.a;
            int v2 = a0.p();
            for(int v3 = 0; v3 < v2; ++v3) {
                if(a0.q(v3) <= v1 && v1 < a0.f(v3)) {
                    int v4 = a0.d(v3);
                    if(v4 > 0) {
                        try {
                            c.a(linkedList0, g0.s(t0.A(v4)));
                        }
                        catch(E unused_ex) {
                        }
                    }
                }
            }
        }
        catch(NullPointerException unused_ex) {
        }
        C c0 = this.d.i();
        if(c0 != null) {
            String[] arr_s = c0.w();
            if(arr_s != null) {
                for(int v = 0; v < arr_s.length; ++v) {
                    try {
                        c.a(linkedList0, g0.s(arr_s[v]));
                    }
                    catch(E unused_ex) {
                    }
                }
            }
        }
        return (l[])linkedList0.toArray(new l[linkedList0.size()]);
    }

    public abstract void k(String arg1) throws b;

    public void l(String s, d d0) throws b {
        this.k(s);
        if(d0 != null) {
            this.n(d0, this.b);
        }
    }

    protected void m(int v, j j0, int v1) throws e {
        byte[] arr_b = j0.E0();
        this.e = true;
        int v2 = arr_b.length - v1;
        for(int v3 = 0; v3 < v1; ++v3) {
            this.b.Y(0, v + v3);
        }
        if(v2 > 0) {
            v = this.b.A(v, v2, false).a;
        }
        this.b.V(arr_b, v);
        this.b.o(j0.G0(), v);
        this.f = j0.H0();
        this.g = j0.I0();
    }

    protected void n(d d0, q q0) throws b {
        p p0 = q0.i();
        int v = p0.D();
        int v1 = p0.E();
        int v2 = this.i();
        p0.L(this.o());
        p0.K(v2);
        a d$a0 = new a(v2);
        int v3 = q0.j();
        int v4 = q0.E();
        q0.H(this.a);
        if(d0.b(this.c, this.d, d$a0, q0, v4)) {
            this.e = true;
        }
        q0.H(v4 + q0.j() - v3);
        p0.K(v);
        p0.L(v1);
        this.f = d$a0.b;
        this.g += d$a0.c;
    }

    protected final int o() {
        return this.g;
    }

    static final void p(l[] arr_l, boolean z, int v, j j0) {
        c.q(0, arr_l.length, arr_l, v + 1, j0);
        if(z) {
            j0.s0(1);
        }
        j0.n(v);
    }

    private static void q(int v, int v1, l[] arr_l, int v2, j j0) {
        if(v >= v1) {
            return;
        }
        l l0 = arr_l[v];
        c.q(v + 1, v1, arr_l, (l0 instanceof w ? ((w)l0).V0() : 1) + v2, j0);
        j0.C0(v2, l0);
    }

    public javassist.k r() {
        T t0 = this.d;
        javassist.k[] arr_k = this.c.A();
        for(int v = arr_k.length - 1; v >= 0; --v) {
            if(arr_k[v].D() == t0) {
                return arr_k[v];
            }
        }
        javassist.k k0 = this.c.v();
        if(k0 != null && k0.D() == t0) {
            return k0;
        }
        for(int v1 = arr_k.length - 1; v1 >= 0; --v1) {
            if(this.d.k().equals(arr_k[v1].D().k()) && this.d.h().equals(arr_k[v1].D().h())) {
                return arr_k[v1];
            }
        }
        throw new RuntimeException("fatal: not found");
    }

    protected final boolean s() {
        return (this.d.c() & 8) != 0;
    }
}

