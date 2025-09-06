package javassist.bytecode;

import javassist.l;

public class j extends i implements Cloneable, c0 {
    t c;
    int d;
    int e;
    A f;
    private int g;
    public static final l h;

    static {
        j.h = t.u;
    }

    public j(t t0) {
        this(t0, 0, 0);
    }

    public j(t t0, int v, int v1) {
        this.c = t0;
        this.d = v;
        this.e = v1;
        this.f = new A(t0);
        this.g = 0;
    }

    public void A(String s, String s1, String s2) {
        this.a(180);
        int v = this.c.a(s);
        this.G(this.c.f(v, s1, s2));
        this.K0(w.e(s2) - 1);
    }

    public void A0(int v) {
        if(v < 0x100) {
            this.s0(0xA9);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(0xA9);
        this.G(v);
    }

    public void B(l l0, String s, String s1) {
        this.a(180);
        int v = this.c.b(l0);
        this.G(this.c.f(v, s, s1));
        this.K0(w.e(s1) - 1);
    }

    public void B0(l l0) {
        if(l0 == null) {
            this.s0(0xB1);
            return;
        }
        if(l0.p0()) {
            this.s0(((javassist.w)l0).Z0());
            return;
        }
        this.s0(0xB0);
    }

    public void C(String s, String s1, String s2) {
        this.a(0xB2);
        int v = this.c.a(s);
        this.G(this.c.f(v, s1, s2));
        this.K0(w.e(s2));
    }

    public int C0(int v, l l0) {
        if(l0.p0()) {
            if(l0 != l.e && l0 != l.f && l0 != l.g && l0 != l.h && l0 != l.i) {
                if(l0 == l.j) {
                    this.l0(v);
                    return 2;
                }
                if(l0 == l.k) {
                    this.z(v);
                    return 1;
                }
                if(l0 != l.l) {
                    throw new RuntimeException("void type?");
                }
                this.t(v);
                return 2;
            }
            this.c0(v);
            return 1;
        }
        this.n(v);
        return 1;
    }

    public void D(l l0, String s, String s1) {
        this.a(0xB2);
        int v = this.c.b(l0);
        this.G(this.c.f(v, s, s1));
        this.K0(w.e(s1));
    }

    public int D0() {
        return this.f();
    }

    public void E(int v) {
        if(v < 6 && -2 < v) {
            this.s0(v + 3);
            return;
        }
        if(v <= 0x7F && 0xFFFFFF80 <= v) {
            this.s0(16);
            this.a(v);
            return;
        }
        if(v <= 0x7FFF && 0xFFFF8000 <= v) {
            this.s0(17);
            this.a(v >> 8);
            this.a(v);
            return;
        }
        this.e0(this.c.h(v));
    }

    // 去混淆评级： 低(20)
    public byte[] E0() {
        return new byte[0];
    }

    public void F(int v) {
        if(v < 4) {
            this.s0(v + 26);
            return;
        }
        if(v < 0x100) {
            this.s0(21);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(21);
        this.G(v);
    }

    public t F0() {
        return this.c;
    }

    public void G(int v) {
        this.b(v >> 8, v);
    }

    public A G0() {
        return this.f;
    }

    public void H(String s) {
        this.s0(0xC1);
        this.G(this.c.a(s));
    }

    public int H0() {
        return this.e;
    }

    public void I(int v, String s, String s1) {
        int v1 = this.c.u(s, s1);
        int v2 = this.c.k(v, v1);
        this.a(0xBA);
        this.G(v2);
        this.b(0, 0);
        this.K0(w.e(s1));
    }

    public int I0() {
        return this.d;
    }

    public void J(int v, String s, String s1, int v1) {
        this.a(0xB9);
        this.G(this.c.j(v, s, s1));
        this.a(v1);
        this.a(0);
        this.K0(w.e(s1) - 1);
    }

    public int J0() {
        return this.g;
    }

    public void K(String s, String s1, String s2, int v) {
        this.J(this.c.a(s), s1, s2, v);
    }

    public void K0(int v) {
        this.S0(this.g + v);
    }

    public void L(l l0, String s, String s1, int v) {
        this.J(this.c.b(l0), s, s1, v);
    }

    public void L0(int v) {
        this.e += v;
    }

    public void M(l l0, String s, l l1, l[] arr_l, int v) {
        this.L(l0, s, w.q(l1, arr_l), v);
    }

    public int M0() {
        return this.f();
    }

    public void N(int v, String s) {
        this.a(0xB7);
        this.G(v);
        this.K0(w.e(s) - 1);
    }

    public int N0(int v) {
        return (this.g(v) << 8) + (this.g(v + 1) & 0xFF);
    }

    public void O(int v, String s, String s1) {
        this.S(false, v, s, s1);
    }

    public int O0(int v) {
        return (this.N0(v) << 16) + (this.N0(v + 2) & 0xFFFF);
    }

    public void P(String s, String s1, String s2) {
        this.S(false, this.c.a(s), s1, s2);
    }

    public void P0(int v) {
        this.e = v;
    }

    public void Q(l l0, String s, String s1) {
        this.S((l0 == null ? false : l0.n0()), this.c.b(l0), s, s1);
    }

    public void Q0(boolean z, l[] arr_l, int v) {
        if(!z) {
            ++v;
        }
        if(arr_l != null) {
            l l0 = l.l;
            l l1 = l.j;
            for(int v1 = 0; v1 < arr_l.length; ++v1) {
                l l2 = arr_l[v1];
                v = l2 == l0 || l2 == l1 ? v + 2 : v + 1;
            }
        }
        this.e = v;
    }

    public void R(l l0, String s, l l1, l[] arr_l) {
        this.Q(l0, s, w.q(l1, arr_l));
    }

    public void R0(int v) {
        this.d = v;
    }

    public void S(boolean z, int v, String s, String s1) {
        this.N((z ? this.c.j(v, s, s1) : this.c.r(v, s, s1)), s1);
    }

    public void S0(int v) {
        this.g = v;
        if(v > this.d) {
            this.d = v;
        }
    }

    public void T(int v, String s, String s1) {
        this.U(v, s, s1, false);
    }

    public p T0() {
        return new p(this.c, this.d, this.e, this.E0(), this.f);
    }

    private void U(int v, String s, String s1, boolean z) {
        this.a(0xB8);
        this.G((z ? this.c.j(v, s, s1) : this.c.r(v, s, s1)));
        this.K0(w.e(s1));
    }

    public void U0(int v, int v1) {
        this.h(v, v1 >> 8);
        this.h(v + 1, v1);
    }

    public void V(String s, String s1, String s2) {
        this.T(this.c.a(s), s1, s2);
    }

    public void V0(int v, int v1) {
        this.U0(v, v1 >> 16);
        this.U0(v + 2, v1);
    }

    public void W(l l0, String s, String s1) {
        this.U(this.c.b(l0), s, s1, (l0 == j.h ? false : l0.n0()));
    }

    public void X(l l0, String s, l l1, l[] arr_l) {
        this.W(l0, s, w.q(l1, arr_l));
    }

    public void Y(int v, String s, String s1) {
        this.a(0xB6);
        this.G(this.c.r(v, s, s1));
        this.K0(w.e(s1) - 1);
    }

    public void Z(String s, String s1, String s2) {
        this.Y(this.c.a(s), s1, s2);
    }

    @Override  // javassist.bytecode.i
    public void a(int v) {
        super.a(v);
    }

    public void a0(l l0, String s, String s1) {
        this.Y(this.c.b(l0), s, s1);
    }

    @Override  // javassist.bytecode.i
    public void b(int v, int v1) {
        super.b(v, v1);
    }

    public void b0(l l0, String s, l l1, l[] arr_l) {
        this.a0(l0, s, w.q(l1, arr_l));
    }

    @Override  // javassist.bytecode.i
    public void c(int v, int v1, int v2, int v3) {
        super.c(v, v1, v2, v3);
    }

    public void c0(int v) {
        if(v < 4) {
            this.s0(v + 59);
            return;
        }
        if(v < 0x100) {
            this.s0(54);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(54);
        this.G(v);
    }

    @Override  // javassist.bytecode.i
    public Object clone() {
        try {
            j j0 = (j)super.clone();
            j0.f = (A)this.f.clone();
            return j0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
    }

    @Override  // javassist.bytecode.i
    public void d(int v) {
        super.d(v);
    }

    public void d0(long v) {
        if(v != 0L && v != 1L) {
            this.h0(v);
            return;
        }
        this.s0(((int)v) + 9);
    }

    public void e0(int v) {
        if(v > 0xFF) {
            this.s0(19);
            this.G(v);
            return;
        }
        this.s0(18);
        this.a(v);
    }

    public void f0(String s) {
        this.e0(this.c.w(s));
    }

    @Override  // javassist.bytecode.i
    public int g(int v) {
        return super.g(v);
    }

    public void g0(double f) {
        this.s0(20);
        this.G(this.c.d(f));
    }

    @Override  // javassist.bytecode.i
    public void h(int v, int v1) {
        super.h(v, v1);
    }

    public void h0(long v) {
        this.s0(20);
        this.G(this.c.n(v));
    }

    public void i0(int v) {
        if(v < 4) {
            this.s0(v + 30);
            return;
        }
        if(v < 0x100) {
            this.s0(22);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(22);
        this.G(v);
    }

    public void j(int v) {
        this.c(v >> 24, v >> 16, v >> 8, v);
    }

    public int j0(int v, l l0) {
        if(l0.p0()) {
            if(l0 != l.e && l0 != l.f && l0 != l.g && l0 != l.h && l0 != l.i) {
                if(l0 == l.j) {
                    this.i0(v);
                    return 2;
                }
                if(l0 == l.k) {
                    this.y(v);
                    return 1;
                }
                if(l0 != l.l) {
                    throw new RuntimeException("void type?");
                }
                this.s(v);
                return 2;
            }
            this.F(v);
            return 1;
        }
        this.k(v);
        return 1;
    }

    public void k(int v) {
        if(v < 4) {
            this.s0(v + 42);
            return;
        }
        if(v < 0x100) {
            this.s0(25);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(25);
        this.G(v);
    }

    public int k0(l[] arr_l, int v) {
        if(arr_l != null) {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_l.length; ++v1) {
                v2 += this.j0(v2 + v, arr_l[v1]);
            }
            return v2;
        }
        return 0;
    }

    public void l(String s) {
        this.s0(0xBD);
        this.G(this.c.a(s));
    }

    public void l0(int v) {
        if(v < 4) {
            this.s0(v + 0x3F);
            return;
        }
        if(v < 0x100) {
            this.s0(55);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(55);
        this.G(v);
    }

    public void m(l l0, int v) {
        this.E(v);
        this.s0(0xBD);
        this.G(this.c.b(l0));
    }

    public int m0(String s, int v) {
        this.a(0xC5);
        this.G(this.c.a(s));
        this.a(v);
        this.K0(1 - v);
        return v;
    }

    public void n(int v) {
        if(v < 4) {
            this.s0(v + 75);
            return;
        }
        if(v < 0x100) {
            this.s0(58);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(58);
        this.G(v);
    }

    public int n0(l l0, int v) {
        this.a(0xC5);
        this.G(this.c.b(l0));
        this.a(v);
        this.K0(1 - v);
        return v;
    }

    public void o(String s) {
        this.s0(0xC0);
        this.G(this.c.a(s));
    }

    public int o0(l l0, int[] arr_v) {
        for(int v = 0; v < arr_v.length; ++v) {
            this.E(arr_v[v]);
        }
        this.K0(arr_v.length);
        return this.n0(l0, arr_v.length);
    }

    public void p(l l0) {
        this.s0(0xC0);
        this.G(this.c.b(l0));
    }

    public void p0(String s) {
        this.s0(0xBB);
        this.G(this.c.a(s));
    }

    public void q(l l0) {
        if(l0.p0()) {
            if(l0 == l.j) {
                this.s0(9);
                return;
            }
            if(l0 == l.k) {
                this.s0(11);
                return;
            }
            if(l0 == l.l) {
                this.s0(14);
                return;
            }
            if(l0 == l.m) {
                throw new RuntimeException("void type?");
            }
            this.s0(3);
            return;
        }
        this.s0(1);
    }

    public void q0(l l0) {
        this.s0(0xBB);
        this.G(this.c.b(l0));
    }

    public void r(double f) {
        if(f != 0.0 && f != 1.0) {
            this.g0(f);
            return;
        }
        this.s0(((int)f) + 14);
    }

    public void r0(int v, int v1) {
        this.E(v1);
        this.s0(0xBC);
        this.a(v);
    }

    public void s(int v) {
        if(v < 4) {
            this.s0(v + 38);
            return;
        }
        if(v < 0x100) {
            this.s0(24);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(24);
        this.G(v);
    }

    public void s0(int v) {
        this.a(v);
        this.K0(c0.M6[v]);
    }

    public void t(int v) {
        if(v < 4) {
            this.s0(v + 71);
            return;
        }
        if(v < 0x100) {
            this.s0(57);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(57);
        this.G(v);
    }

    public void t0(String s) {
        this.C("java.lang.System", "err", "Ljava/io/PrintStream;");
        this.f0(s);
        this.Z("java.io.PrintStream", "println", "(Ljava/lang/String;)V");
    }

    public void u(int v, int v1, int v2, int v3) {
        this.f.a(v, v1, v2, v3);
    }

    public void u0(String s, String s1, String s2) {
        this.w0(null, s, s1, s2);
    }

    public void v(int v, int v1, int v2, String s) {
        this.u(v, v1, v2, this.c.a(s));
    }

    public void v0(l l0, String s, String s1) {
        this.w0(l0, null, s, s1);
    }

    public void w(int v, int v1, int v2, l l0) {
        this.u(v, v1, v2, this.c.b(l0));
    }

    private void w0(l l0, String s, String s1, String s2) {
        this.a(0xB5);
        int v = s == null ? this.c.b(l0) : this.c.a(s);
        this.G(this.c.f(v, s1, s2));
        this.K0(-1 - w.e(s2));
    }

    public void x(float f) {
        if(f != 0 && f != 0x3F800000 && f != 2.0f) {
            this.e0(this.c.g(f));
            return;
        }
        this.s0(((int)f) + 11);
    }

    public void x0(String s, String s1, String s2) {
        this.z0(null, s, s1, s2);
    }

    public void y(int v) {
        if(v < 4) {
            this.s0(v + 34);
            return;
        }
        if(v < 0x100) {
            this.s0(23);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(23);
        this.G(v);
    }

    public void y0(l l0, String s, String s1) {
        this.z0(l0, null, s, s1);
    }

    public void z(int v) {
        if(v < 4) {
            this.s0(v + 67);
            return;
        }
        if(v < 0x100) {
            this.s0(56);
            this.a(v);
            return;
        }
        this.s0(0xC4);
        this.s0(56);
        this.G(v);
    }

    private void z0(l l0, String s, String s1, String s2) {
        this.a(0xB3);
        int v = s == null ? this.c.b(l0) : this.c.a(s);
        this.G(this.c.f(v, s1, s2));
        this.K0(-w.e(s2));
    }
}

