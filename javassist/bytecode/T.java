package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javassist.l;

public final class t {
    public static final int A = 6;
    public static final int B = 7;
    public static final int C = 8;
    public static final int D = 9;
    P a;
    int b;
    int c;
    Map d;
    public static final int e = 7;
    public static final int f = 9;
    public static final int g = 10;
    public static final int h = 11;
    public static final int i = 8;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 12;
    public static final int o = 1;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    public static final l u = null;
    public static final int v = 1;
    public static final int w = 2;
    public static final int x = 3;
    public static final int y = 4;
    public static final int z = 5;

    static {
    }

    public t(DataInputStream dataInputStream0) throws IOException {
        this.d = null;
        this.c = 0;
        this.w0(dataInputStream0);
    }

    public t(String s) {
        this.a = new P();
        this.d = null;
        this.b = 0;
        this.m(null);
        this.c = this.a(s);
    }

    public String A(int v) {
        n n0 = (n)this.U(v);
        return n0 == null ? null : w.A(this.p0(n0.b));
    }

    void A0(int v) {
        this.c = v;
    }

    public String B(int v) {
        n n0 = (n)this.U(v);
        if(n0 == null) {
            return null;
        }
        String s = this.p0(n0.b);
        return s.charAt(0) == 91 ? s : w.n(s);
    }

    public void B0(DataOutputStream dataOutputStream0) throws IOException {
        dataOutputStream0.writeShort(this.b);
        P p0 = this.a;
        int v = this.b;
        for(int v1 = 1; v1 < v; ++v1) {
            p0.c(v1).g(dataOutputStream0);
        }
    }

    public String C() {
        return this.A(this.c);
    }

    public Set D() {
        Set set0 = new HashSet();
        P p0 = this.a;
        int v = this.b;
        for(int v1 = 1; v1 < v; ++v1) {
            String s = p0.c(v1).b(this);
            if(s != null) {
                set0.add(s);
            }
        }
        return set0;
    }

    public double E(int v) {
        return ((x)this.U(v)).b;
    }

    public int F(int v) {
        return ((E)this.U(v)).b;
    }

    public String G(int v) {
        E e0 = (E)this.U(v);
        return e0 == null ? null : this.A(e0.b);
    }

    public String H(int v) {
        E e0 = (E)this.U(v);
        if(e0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(e0.c);
        return z0 == null ? null : this.p0(z0.b);
    }

    public int I(int v) {
        return ((E)this.U(v)).c;
    }

    public String J(int v) {
        E e0 = (E)this.U(v);
        if(e0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(e0.c);
        return z0 == null ? null : this.p0(z0.c);
    }

    public float K(int v) {
        return ((F)this.U(v)).b;
    }

    public int L(int v) {
        return ((I)this.U(v)).b;
    }

    public int M(int v) {
        return ((Q)this.U(v)).b;
    }

    public String N(int v) {
        return this.A(((Q)this.U(v)).b);
    }

    public String O(int v) {
        Q q0 = (Q)this.U(v);
        if(q0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(q0.c);
        return z0 == null ? null : this.p0(z0.b);
    }

    public int P(int v) {
        return ((Q)this.U(v)).c;
    }

    public String Q(int v) {
        Q q0 = (Q)this.U(v);
        if(q0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(q0.c);
        return z0 == null ? null : this.p0(z0.c);
    }

    public int R(int v) {
        return ((K)this.U(v)).b;
    }

    public int S(int v) {
        return ((K)this.U(v)).c;
    }

    public String T(int v) {
        K k0 = (K)this.U(v);
        if(k0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(k0.c);
        return z0 == null ? null : this.p0(z0.c);
    }

    r U(int v) {
        return this.a.c(v);
    }

    public Object V(int v) {
        r r0 = this.U(v);
        if(r0 instanceof j0) {
            return this.m0(v);
        }
        if(r0 instanceof F) {
            return this.K(v);
        }
        if(r0 instanceof I) {
            return this.L(v);
        }
        if(r0 instanceof O) {
            return this.W(v);
        }
        return r0 instanceof x ? this.E(v) : null;
    }

    public long W(int v) {
        return ((O)this.U(v)).b;
    }

    public int X(int v) {
        return ((Q)this.U(v)).b;
    }

    public int Y(int v) {
        return ((Q)this.U(v)).c;
    }

    public int Z(int v) {
        return ((S)this.U(v)).c;
    }

    public int a(String s) {
        return this.l(new n(this.x(w.B(s)), this.b));
    }

    public int a0(int v) {
        return ((S)this.U(v)).b;
    }

    public int b(l l0) {
        if(l0 == t.u) {
            return this.c;
        }
        return l0.k0() ? this.a(w.C(l0)) : this.a(l0.X());
    }

    public int b0(int v) {
        return ((V)this.U(v)).b;
    }

    int c() {
        return this.m(new s(this.b));
    }

    public int c0(int v) {
        return ((Q)this.U(v)).b;
    }

    public int d(double f) {
        int v = this.l(new x(f, this.b));
        if(v == this.b - 1) {
            this.c();
        }
        return v;
    }

    public String d0(int v) {
        Q q0 = (Q)this.U(v);
        return q0 == null ? null : this.A(q0.b);
    }

    public int e(int v, int v1) {
        return this.l(new E(v, v1, this.b));
    }

    public String e0(int v) {
        Q q0 = (Q)this.U(v);
        if(q0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(q0.c);
        return z0 == null ? null : this.p0(z0.b);
    }

    public int f(int v, String s, String s1) {
        return this.e(v, this.u(s, s1));
    }

    public int f0(int v) {
        return ((Q)this.U(v)).c;
    }

    public int g(float f) {
        return this.l(new F(f, this.b));
    }

    public String g0(int v) {
        Q q0 = (Q)this.U(v);
        if(q0 == null) {
            return null;
        }
        Z z0 = (Z)this.U(q0.c);
        return z0 == null ? null : this.p0(z0.c);
    }

    public int h(int v) {
        return this.l(new I(v, this.b));
    }

    public String h0(int v) {
        return this.p0(((Y)this.U(v)).b);
    }

    public int i(int v, int v1) {
        return this.l(new J(v, v1, this.b));
    }

    public int i0(int v) {
        return ((Z)this.U(v)).c;
    }

    public int j(int v, String s, String s1) {
        return this.i(v, this.u(s, s1));
    }

    public int j0(int v) {
        return ((Z)this.U(v)).b;
    }

    public int k(int v, int v1) {
        return this.l(new K(v, v1, this.b));
    }

    public String k0(int v) {
        return this.p0(((d0)this.U(v)).b);
    }

    private int l(r r0) {
        if(this.d == null) {
            this.d = t.s0(this.a);
        }
        r r1 = (r)this.d.get(r0);
        if(r1 != null) {
            return r1.a;
        }
        this.a.a(r0);
        this.d.put(r0, r0);
        int v = this.b;
        this.b = v + 1;
        return v;
    }

    public int l0() {
        return this.b;
    }

    private int m(r r0) {
        this.a.a(r0);
        int v = this.b;
        this.b = v + 1;
        return v;
    }

    public String m0(int v) {
        return this.p0(((j0)this.U(v)).b);
    }

    public int n(long v) {
        int v1 = this.l(new O(v, this.b));
        if(v1 == this.b - 1) {
            this.c();
        }
        return v1;
    }

    public int n0(int v) {
        return this.U(v).c();
    }

    public int o(int v, int v1) {
        return this.l(new S(v, v1, this.b));
    }

    public int o0() {
        return this.c;
    }

    public int p(int v) {
        return this.l(new V(v, this.b));
    }

    public String p0(int v) {
        return ((m0)this.U(v)).b;
    }

    public int q(int v, int v1) {
        return this.l(new W(v, v1, this.b));
    }

    public int q0(String s, int v) {
        return this.r0(s, "<init>", v);
    }

    public int r(int v, String s, String s1) {
        return this.q(v, this.u(s, s1));
    }

    public int r0(String s, String s1, int v) {
        Q q0 = (Q)this.U(v);
        if(this.A(q0.b).equals(s)) {
            Z z0 = (Z)this.U(q0.c);
            return this.p0(z0.b).equals(s1) ? z0.c : 0;
        }
        return 0;
    }

    public int s(int v) {
        return this.l(new Y(v, this.b));
    }

    private static Map s0(P p0) {
        Map map0 = new HashMap();
        r r0;
        for(int v = 1; (r0 = p0.c(v)) != null; ++v) {
            map0.put(r0, r0);
        }
        return map0;
    }

    public int t(int v, int v1) {
        return this.l(new Z(v, v1, this.b));
    }

    public void t0() {
        this.u0(new PrintWriter(System.out, true));
    }

    public int u(String s, String s1) {
        return this.t(this.x(s), this.x(s1));
    }

    public void u0(PrintWriter printWriter0) {
        int v = this.b;
        for(int v1 = 1; v1 < v; ++v1) {
            printWriter0.print(v1);
            printWriter0.print(" ");
            this.a.c(v1).d(printWriter0);
        }
    }

    public int v(int v) {
        return this.l(new d0(v, this.b));
    }

    void v0() {
        this.d = null;
    }

    public int w(String s) {
        return this.l(new j0(this.x(s), this.b));
    }

    private void w0(DataInputStream dataInputStream0) throws IOException {
        int v = dataInputStream0.readUnsignedShort();
        this.a = new P(v);
        this.b = 0;
        this.m(null);
        while(v - 1 > 0) {
            switch(this.x0(dataInputStream0)) {
                case 5: 
                case 6: {
                    this.c();
                    v -= 2;
                    break;
                }
                default: {
                    --v;
                }
            }
        }
    }

    public int x(String s) {
        return this.l(new m0(s, this.b));
    }

    private int x0(DataInputStream dataInputStream0) throws IOException {
        m0 m00;
        int v = dataInputStream0.readUnsignedByte();
        switch(v) {
            case 1: {
                m00 = new m0(dataInputStream0, this.b);
                break;
            }
            case 3: {
                m00 = new I(dataInputStream0, this.b);
                break;
            }
            case 4: {
                m00 = new F(dataInputStream0, this.b);
                break;
            }
            case 5: {
                m00 = new O(dataInputStream0, this.b);
                break;
            }
            case 6: {
                m00 = new x(dataInputStream0, this.b);
                break;
            }
            case 7: {
                m00 = new n(dataInputStream0, this.b);
                break;
            }
            case 8: {
                m00 = new j0(dataInputStream0, this.b);
                break;
            }
            case 9: {
                m00 = new E(dataInputStream0, this.b);
                break;
            }
            case 10: {
                m00 = new W(dataInputStream0, this.b);
                break;
            }
            case 11: {
                m00 = new J(dataInputStream0, this.b);
                break;
            }
            case 12: {
                m00 = new Z(dataInputStream0, this.b);
                break;
            }
            case 15: {
                m00 = new S(dataInputStream0, this.b);
                break;
            }
            case 16: {
                m00 = new V(dataInputStream0, this.b);
                break;
            }
            case 18: {
                m00 = new K(dataInputStream0, this.b);
                break;
            }
            case 19: {
                m00 = new Y(dataInputStream0, this.b);
                break;
            }
            case 20: {
                m00 = new d0(dataInputStream0, this.b);
                break;
            }
            default: {
                throw new IOException("invalid constant type: " + v + " at " + this.b);
            }
        }
        this.m(m00);
        return v;
    }

    public int y(int v, t t0, Map map0) {
        return v == 0 ? 0 : this.U(v).a(this, t0, map0);
    }

    public void y0(String s, String s1) {
        P p0 = this.a;
        int v = this.b;
        for(int v1 = 1; v1 < v; ++v1) {
            p0.c(v1).e(this, s, s1, this.d);
        }
    }

    public String z(String s, String s1, int v) {
        Q q0 = (Q)this.U(v);
        Z z0 = (Z)this.U(q0.c);
        return !this.p0(z0.b).equals(s) || !this.p0(z0.c).equals(s1) ? null : this.A(q0.b);
    }

    public void z0(Map map0) {
        P p0 = this.a;
        int v = this.b;
        for(int v1 = 1; v1 < v; ++v1) {
            p0.c(v1).f(this, map0, this.d);
        }
    }
}

