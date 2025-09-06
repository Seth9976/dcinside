package javassist.compiler;

import javassist.D;
import javassist.E;
import javassist.bytecode.M;
import javassist.bytecode.j;
import javassist.compiler.ast.a;
import javassist.compiler.ast.b;
import javassist.compiler.ast.i;
import javassist.compiler.ast.q;
import javassist.compiler.ast.t;
import javassist.compiler.ast.v;
import javassist.k;
import javassist.l;
import javassist.o;
import javassist.p;
import javassist.w;

public class d {
    public static class javassist.compiler.d.d extends o {
        private b e;

        javassist.compiler.d.d(l l0, String s, l l1) throws javassist.b {
            super(l0, s, l1);
            this.e = null;
        }

        protected void C(b b0) {
            this.e = b0;
        }

        @Override  // javassist.o
        protected b x() {
            return this.e;
        }
    }

    e a;
    n b;
    private j c;
    public static final String d = "$0";
    public static final String e = "$_";
    public static final String f = "$proceed";

    public d(j j0, l l0) {
        this.a = new e(j0, l0, l0.w());
        this.b = new n();
        this.c = j0;
    }

    public d(l l0) {
        this(new j(l0.u().l(), 0, 0), l0);
    }

    public p a(String s) throws c {
        javassist.compiler.l l0 = new javassist.compiler.l(new h(s));
        a a0 = l0.K(this.b);
        try {
            if(a0 instanceof javassist.compiler.ast.l) {
                return this.e(((javassist.compiler.ast.l)a0));
            }
            p p0 = this.f(l0, ((q)a0));
            l l1 = p0.f();
            ((k)p0).D().t(l1.w(), l1.u());
            return p0;
        }
        catch(javassist.bytecode.e e0) {
        }
        catch(javassist.b b0) {
            throw new c(b0.getMessage());
        }
        throw new c(e0.getMessage());
    }

    public j b(k k0, String s) throws c {
        l l0;
        try {
            int v = k0.h();
            this.n(k0.G(), D.l(v));
            if(k0 instanceof javassist.q) {
                this.a.r1(((javassist.q)k0));
                l0 = ((javassist.q)k0).b0();
            }
            else {
                l0 = l.m;
            }
            int v1 = 0;
            this.q(l0, false);
            boolean z = l0 == l.m;
            if(s == null) {
                d.i(this.c, l0);
                return this.c;
            }
            javassist.compiler.l l1 = new javassist.compiler.l(new h(s));
            t t0 = l1.U(new n(this.b));
            if(l1.c()) {
                throw new c("the method/constructor body must be surrounded by {}");
            }
            if(k0 instanceof javassist.n) {
                v1 = !((javassist.n)k0).e0();
            }
            this.a.M(t0, ((boolean)v1), z);
            return this.c;
        }
        catch(E e0) {
        }
        throw new c(e0.toString());
    }

    public void c(String s) throws c {
        this.d(d.j(s, this.b));
    }

    public void d(b b0) throws c {
        if(b0 != null) {
            this.a.h0(b0);
        }
    }

    private o e(javassist.compiler.ast.l l0) throws c, javassist.b {
        i i0 = l0.r();
        o o0 = new javassist.compiler.d.d(this.a.y.o(i0), i0.B().g(), this.a.k1());
        o0.q(javassist.compiler.j.g(l0.u()));
        if(l0.s() != null) {
            ((javassist.compiler.d.d)o0).C(l0.s());
        }
        return o0;
    }

    private k f(javassist.compiler.l l0, q q0) throws c {
        int v = javassist.compiler.j.g(q0.s());
        l[] arr_l = this.a.n1(q0);
        l[] arr_l1 = this.a.o1(q0);
        this.n(arr_l, D.l(v));
        q q1 = l0.N(this.b, q0);
        try {
            if(q1.y()) {
                k k0 = new javassist.n(arr_l, this.a.k1());
                k0.q(v);
                q1.a(this.a);
                k0.C().y(this.c.T0());
                k0.Z(arr_l1);
                return k0;
            }
            i i0 = q1.w();
            l l1 = this.a.y.o(i0);
            this.q(l1, false);
            k k1 = new javassist.q(l1, i0.B().g(), arr_l, this.a.k1());
            k1.q(v);
            this.a.r1(((javassist.q)k1));
            q1.a(this.a);
            if(q1.r() == null) {
                k1.q(v | 0x400);
            }
            else {
                k1.C().y(this.c.T0());
            }
            k1.Z(arr_l1);
            return k1;
        }
        catch(E e0) {
        }
        throw new c(e0.toString());
    }

    public void g(String s) throws c {
        javassist.compiler.l l0 = new javassist.compiler.l(new h(s));
        n n0 = new n(this.b);
        while(l0.c()) {
            t t0 = l0.U(n0);
            if(t0 != null) {
                t0.a(this.a);
            }
        }
    }

    public j h() {
        return this.c;
    }

    private static void i(j j0, l l0) {
        int v1;
        int v;
        if(l0 instanceof w) {
            v = ((w)l0).Z0();
            if(v == 0xAF) {
                v1 = 14;
            }
            else {
                switch(v) {
                    case 0xAD: {
                        v1 = 9;
                        break;
                    }
                    case 0xAE: {
                        v1 = 11;
                        break;
                    }
                    case 0xB1: {
                        v1 = 0;
                        break;
                    }
                    default: {
                        v1 = 3;
                    }
                }
            }
        }
        else {
            v = 0xB0;
            v1 = 1;
        }
        if(v1 != 0) {
            j0.s0(v1);
        }
        j0.s0(v);
    }

    public static b j(String s, n n0) throws c {
        return new javassist.compiler.l(new h(s)).B(n0);
    }

    public boolean k(javassist.bytecode.p p0, int v) throws c {
        M m0 = (M)p0.x("LocalVariableTable");
        if(m0 == null) {
            return false;
        }
        int v2 = m0.H();
        for(int v1 = 0; v1 < v2; ++v1) {
            int v3 = m0.G(v1);
            if(v3 <= v && v < v3 + m0.u(v1)) {
                this.a.L1(m0.v(v1), m0.I(v1), m0.x(v1), this.b);
            }
        }
        return true;
    }

    public boolean l(javassist.bytecode.p p0, int v) throws c {
        M m0 = (M)p0.x("LocalVariableTable");
        if(m0 == null) {
            return false;
        }
        int v2 = m0.H();
        for(int v1 = 0; v1 < v2; ++v1) {
            int v3 = m0.x(v1);
            if(v3 < v) {
                this.a.L1(m0.v(v1), m0.I(v1), v3, this.b);
            }
        }
        return true;
    }

    public int m(String s, l[] arr_l, boolean z, int v, boolean z1) throws c {
        return this.a.G1(arr_l, z1, "$", "$args", "$$", z, v, s, this.b);
    }

    public int n(l[] arr_l, boolean z) throws c {
        return this.a.F1(arr_l, z, "$", "$args", "$$", this.b);
    }

    public void o(String s, String s1) throws c {
        class javassist.compiler.d.a implements m {
            final String a;
            final b b;
            final d c;

            javassist.compiler.d.a(String s, b b0) {
                this.a = s;
                this.b = b0;
                super();
            }

            @Override  // javassist.compiler.m
            public void a(f f0, a a0) throws c {
                javassist.compiler.ast.p p0 = new javassist.compiler.ast.p(this.a);
                b b0 = this.b;
                if(b0 != null) {
                    p0 = javassist.compiler.ast.k.u(46, b0, p0);
                }
                javassist.compiler.ast.f.C(p0, a0).a(f0);
                f0.j0();
            }

            @Override  // javassist.compiler.m
            public void b(e e0, j j0, a a0) throws c {
                javassist.compiler.ast.p p0 = new javassist.compiler.ast.p(this.a);
                b b0 = this.b;
                if(b0 != null) {
                    p0 = javassist.compiler.ast.k.u(46, b0, p0);
                }
                e0.h0(javassist.compiler.ast.f.C(p0, a0));
                e0.s1();
            }
        }

        javassist.compiler.d.a d$a0 = new javassist.compiler.d.a(this, s1, new javassist.compiler.l(new h(s)).B(this.b));
        this.a.M1(d$a0, "$proceed");
    }

    public void p(m m0) {
        this.a.M1(m0, "$proceed");
    }

    public int q(l l0, boolean z) throws c {
        this.a.I1(l0);
        e e0 = this.a;
        return z ? e0.H1(l0, "$r", "$_", this.b) : e0.H1(l0, "$r", null, this.b);
    }

    public void r(String s, String s1, String s2, String s3, int v) throws c {
        class javassist.compiler.d.c implements m {
            final b a;
            final int b;
            final String c;
            final String d;
            final String e;
            final d f;

            javassist.compiler.d.c(b b0, int v, String s, String s1, String s2) {
                this.a = b0;
                this.b = v;
                this.c = s;
                this.d = s1;
                this.e = s2;
                super();
            }

            @Override  // javassist.compiler.m
            public void a(f f0, a a0) throws c {
                f0.n0(this.a, this.d, this.e, this.c, a0);
            }

            @Override  // javassist.compiler.m
            public void b(e e0, j j0, a a0) throws c {
                e0.y1(this.a, this.b, this.c, a0);
            }
        }

        javassist.compiler.d.c d$c0 = new javassist.compiler.d.c(this, new javassist.compiler.l(new h(s)).B(this.b), v, s3, s1, s2);
        this.a.M1(d$c0, "$proceed");
    }

    public void s(String s, String s1) throws c {
        class javassist.compiler.d.b implements m {
            final String a;
            final String b;
            final d c;

            javassist.compiler.d.b(String s, String s1) {
                this.a = s;
                this.b = s1;
                super();
            }

            @Override  // javassist.compiler.m
            public void a(f f0, a a0) throws c {
                javassist.compiler.ast.f.C(javassist.compiler.ast.k.u(35, new v(this.a), new javassist.compiler.ast.p(this.b)), a0).a(f0);
                f0.j0();
            }

            @Override  // javassist.compiler.m
            public void b(e e0, j j0, a a0) throws c {
                e0.h0(javassist.compiler.ast.f.C(javassist.compiler.ast.k.u(35, new v(this.a), new javassist.compiler.ast.p(this.b)), a0));
                e0.s1();
            }
        }

        javassist.compiler.d.b d$b0 = new javassist.compiler.d.b(this, s, s1);
        this.a.M1(d$b0, "$proceed");
    }

    public void t(l l0) {
        this.a.I1(l0);
    }

    public int u(l l0, String s) throws c {
        return this.a.K1(l0, s, this.b);
    }

    public void v(int v) {
        this.a.M0(v);
    }
}

