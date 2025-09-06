package javassist.compiler;

import javassist.E;
import javassist.bytecode.j;
import javassist.compiler.ast.a;
import javassist.compiler.ast.k;
import javassist.compiler.ast.p;
import javassist.compiler.ast.t;
import javassist.compiler.ast.v;
import javassist.g;
import javassist.l;
import javassist.w;

public class e extends i {
    String C;
    String D;
    l[] E;
    private int F;
    private boolean G;
    private String H;
    private l I;
    l J;
    String K;
    private String L;
    String M;
    m N;
    public static final String O = "$sig";
    public static final String P = "$type";
    public static final String Q = "$class";
    public static final String X = "$w";
    public static final String Y = "$cflow";

    public e(j j0, l l0, g g0) {
        super(j0, l0, g0);
        this.C = null;
        this.D = null;
        this.E = null;
        this.F = 0;
        this.G = false;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.N = null;
        this.N0(new f(l0, g0, this));
    }

    protected void A1(l l0, j j0) throws c {
        if(l0 == l.m) {
            this.s1();
            return;
        }
        if(this.i == 344) {
            throw new c("invalid type for " + this.K);
        }
        if(l0 instanceof w) {
            String s = ((w)l0).a1();
            j0.o(s);
            j0.Z(s, ((w)l0).Y0(), ((w)l0).X0());
            this.N1(l0);
            return;
        }
        j0.p(l0);
        this.N1(l0);
    }

    public void B1(l l0) throws c {
        if(this.j == 0 && !b.F0(this.i)) {
            if(!(l0 instanceof w)) {
                throw new c("type mismatch");
            }
            this.N(this.i, javassist.compiler.j.b(((w)l0).W0()));
        }
    }

    private int C1() {
        return this.F + this.G;
    }

    public boolean D1(a a0) {
        if(this.E != null && a0 != null && a0.q() == null) {
            javassist.compiler.ast.b b0 = a0.i();
            return b0 instanceof p && ((p)b0).g().equals(this.D);
        }
        return false;
    }

    private static void E1(StringBuffer stringBuffer0, javassist.compiler.ast.b b0) throws c {
        if(b0 instanceof v) {
            stringBuffer0.append(((v)b0).g());
            return;
        }
        if(!(b0 instanceof k) || ((k)b0).r() != 46) {
            throw new c("bad $cflow");
        }
        e.E1(stringBuffer0, ((k)b0).w());
        stringBuffer0.append('.');
        e.E1(stringBuffer0, ((k)b0).x());
    }

    public int F1(l[] arr_l, boolean z, String s, String s1, String s2, n n0) throws c {
        return this.G1(arr_l, z, s, s1, s2, !z, 0, this.x0(), n0);
    }

    public int G1(l[] arr_l, boolean z, String s, String s1, String s2, boolean z1, int v, String s3, n n0) throws c {
        this.E = arr_l;
        this.C = s1;
        this.D = s2;
        this.F = v;
        this.G = z1;
        if(s3 != null) {
            this.H = javassist.compiler.j.l(s3);
        }
        this.e = z;
        if(z1) {
            n0.a(s + "0", new javassist.compiler.ast.i(307, javassist.compiler.j.k(s3), 0, v, new v(s + "0")));
            ++v;
        }
        int v1 = 0;
        while(v1 < arr_l.length) {
            l l0 = arr_l[v1];
            ++v1;
            v += this.J1(l0, s + v1, v, n0);
        }
        if(this.u0() < v) {
            this.M0(v);
        }
        return v;
    }

    @Override  // javassist.compiler.i
    protected void H(k k0, int v, javassist.compiler.ast.b b0, javassist.compiler.ast.b b1, boolean z) throws c {
        if(!(b0 instanceof p) || !((p)b0).g().equals(this.C)) {
            super.H(k0, v, b0, b1, z);
        }
        else {
            if(v != 61) {
                throw new c("bad operator for " + this.C);
            }
            b1.a(this);
            if(this.j != 1 || this.i != 307) {
                throw new c("invalid type for " + this.C);
            }
            this.t1(this.E, this.a);
            if(!z) {
                this.a.s0(87);
            }
        }
    }

    public int H1(l l0, String s, String s1, n n0) throws c {
        this.J = l0;
        this.K = s;
        this.L = s1;
        if(s1 == null) {
            return -1;
        }
        int v = this.u0();
        this.M0(this.J1(l0, s1, v, n0) + v);
        return v;
    }

    public void I1(l l0) {
        this.I = l0;
    }

    private int J1(l l0, String s, int v, n n0) throws c {
        if(l0 == l.m) {
            this.i = 307;
            this.j = 0;
            this.k = "java/lang/Object";
        }
        else {
            this.N1(l0);
        }
        n0.a(s, new javassist.compiler.ast.i(this.i, this.k, this.j, v, new v(s)));
        return b.B0(this.i, this.j) ? 2 : 1;
    }

    public int K1(l l0, String s, n n0) throws c {
        if(s == null) {
            return -1;
        }
        int v = this.u0();
        this.M0(this.J1(l0, s, v, n0) + v);
        return v;
    }

    public void L1(String s, String s1, int v, n n0) throws c {
        String s2;
        int v1 = 0;
        int v2;
        while((v2 = s.charAt(v1)) == 91) {
            ++v1;
        }
        int v3 = javassist.compiler.j.b(((char)v2));
        if(v3 != 307) {
            s2 = null;
        }
        else if(v1 == 0) {
            s2 = s.substring(1, s.length() - 1);
        }
        else {
            s2 = s.substring(v1 + 1, s.length() - 1);
        }
        n0.a(s1, new javassist.compiler.ast.i(v3, s2, v1, v, new v(s1)));
    }

    public void M1(m m0, String s) {
        this.M = s;
        this.N = m0;
    }

    public void N1(l l0) throws c {
        this.O1(l0, 0);
    }

    private void O1(l l0, int v) throws c {
        if(l0.p0()) {
            this.i = javassist.compiler.j.b(((w)l0).W0());
            this.j = v;
            this.k = null;
            return;
        }
        if(l0.k0()) {
            try {
                this.O1(l0.x(), v + 1);
                return;
            }
            catch(E unused_ex) {
                throw new c("undefined type: " + l0.X());
            }
        }
        this.i = 307;
        this.j = v;
        this.k = javassist.compiler.j.k(l0.X());
    }

    @Override  // javassist.compiler.b
    protected void Q(t t0) throws c {
        javassist.compiler.ast.b b0 = t0.b();
        if(b0 != null && this.J == l.m) {
            this.h0(b0);
            if(b.B0(this.i, this.j)) {
                this.a.s0(88);
            }
            else if(this.i != 344) {
                this.a.s0(87);
            }
            b0 = null;
        }
        this.R(b0);
    }

    @Override  // javassist.compiler.i
    public void W0(a a0, int[] arr_v, int[] arr_v1, String[] arr_s) throws c {
        l[] arr_l = this.E;
        String s = this.D;
        int v = 0;
        while(a0 != null) {
            javassist.compiler.ast.b b0 = a0.i();
            if(!(b0 instanceof p) || !((p)b0).g().equals(s)) {
                b0.a(this);
                arr_v[v] = this.i;
                arr_v1[v] = this.j;
                arr_s[v] = this.k;
                ++v;
            }
            else if(arr_l != null) {
                int v1 = this.C1();
                for(int v2 = 0; v2 < arr_l.length; ++v2) {
                    l l0 = arr_l[v2];
                    v1 += this.a.j0(v1, l0);
                    this.N1(l0);
                    arr_v[v] = this.i;
                    arr_v1[v] = this.j;
                    arr_s[v] = this.k;
                    ++v;
                }
            }
            a0 = a0.q();
        }
    }

    @Override  // javassist.compiler.i
    public void e(javassist.compiler.ast.f f0) throws c {
        javassist.compiler.ast.b b0 = f0.w();
        if(b0 instanceof p) {
            String s = ((p)b0).g();
            if(this.N != null && s.equals(this.M)) {
                this.N.b(this, this.a, ((a)f0.x()));
                return;
            }
            if(s.equals("$cflow")) {
                this.w1(((a)f0.x()));
                return;
            }
        }
        super.e(f0);
    }

    @Override  // javassist.compiler.b
    public void f(javassist.compiler.ast.g g0) throws c {
        a a0 = g0.s();
        if(a0 != null && g0.r() == 0) {
            javassist.compiler.ast.b b0 = a0.i();
            if(b0 instanceof v && a0.q() == null) {
                String s = ((v)b0).g();
                if(s.equals(this.K)) {
                    this.u1(g0);
                    return;
                }
                if(s.equals("$w")) {
                    this.v1(g0);
                    return;
                }
            }
        }
        super.f(g0);
    }

    @Override  // javassist.compiler.i
    public int j1(a a0) {
        String s = this.D;
        int v = 0;
        while(a0 != null) {
            javassist.compiler.ast.b b0 = a0.i();
            if(!(b0 instanceof p) || !((p)b0).g().equals(s)) {
                ++v;
            }
            else {
                l[] arr_l = this.E;
                if(arr_l != null) {
                    v += arr_l.length;
                }
            }
            a0 = a0.q();
        }
        return v;
    }

    @Override  // javassist.compiler.i
    public void o(p p0) throws c {
        String s = p0.g();
        if(s.equals(this.C)) {
            e.z1(this.a, this.E, this.C1());
            this.i = 307;
            this.j = 1;
            this.k = "java/lang/Object";
            return;
        }
        if(s.equals("$sig")) {
            this.a.f0(javassist.bytecode.w.q(this.J, this.E));
            this.a.V("javassist/runtime/Desc", "getParams", "(Ljava/lang/String;)[Ljava/lang/Class;");
            this.i = 307;
            this.j = 1;
            this.k = "java/lang/Class";
            return;
        }
        if(s.equals("$type")) {
            l l0 = this.I;
            if(l0 == null) {
                throw new c("$type is not available");
            }
            this.a.f0(javassist.bytecode.w.o(l0));
            this.x1("getType");
            return;
        }
        if(s.equals("$class")) {
            String s1 = this.H;
            if(s1 == null) {
                throw new c("$class is not available");
            }
            this.a.f0(s1);
            this.x1("getClazz");
            return;
        }
        super.o(p0);
    }

    public void s1() {
        if(this.i == 344) {
            this.a.s0(1);
            this.i = 307;
            this.j = 0;
            this.k = "java/lang/Object";
        }
    }

    protected void t1(l[] arr_l, j j0) throws c {
        if(arr_l == null) {
            return;
        }
        int v = this.C1();
        for(int v1 = 0; v1 < arr_l.length; ++v1) {
            j0.s0(89);
            j0.E(v1);
            j0.s0(50);
            this.A1(arr_l[v1], j0);
            j0.C0(v, arr_l[v1]);
            v += (b.B0(this.i, this.j) ? 2 : 1);
        }
    }

    protected void u1(javassist.compiler.ast.g g0) throws c {
        g0.u().a(this);
        if(this.i != 344 && !b.F0(this.i) && this.j <= 0) {
            l l0 = this.J;
            if(!(l0 instanceof w)) {
                throw new c("invalid cast");
            }
            int v = javassist.compiler.j.b(((w)l0).W0());
            this.N(this.i, v);
            this.i = v;
            this.j = 0;
            this.k = null;
            return;
        }
        this.A1(this.J, this.a);
    }

    protected void v1(javassist.compiler.ast.g g0) throws c {
        g0.u().a(this);
        if(!b.F0(this.i)) {
            int v = this.j;
            if(v <= 0) {
                l l0 = this.y.m(this.i, v, this.k);
                if(l0 instanceof w) {
                    String s = ((w)l0).a1();
                    this.a.p0(s);
                    this.a.s0(89);
                    if(((w)l0).V0() > 1) {
                        this.a.s0(94);
                    }
                    else {
                        this.a.s0(93);
                    }
                    this.a.s0(88);
                    this.a.P(s, "<init>", "(" + ((w)l0).W0() + ")V");
                    this.i = 307;
                    this.j = 0;
                    this.k = "java/lang/Object";
                }
            }
        }
    }

    protected void w1(a a0) throws c {
        StringBuffer stringBuffer0 = new StringBuffer();
        if(a0 == null || a0.q() != null) {
            throw new c("bad $cflow");
        }
        e.E1(stringBuffer0, a0.i());
        String s = stringBuffer0.toString();
        Object[] arr_object = this.y.d().u0(s);
        if(arr_object == null) {
            throw new c("no such $cflow: " + s);
        }
        this.a.C(((String)arr_object[0]), ((String)arr_object[1]), "Ljavassist/runtime/Cflow;");
        this.a.Z("javassist.runtime.Cflow", "value", "()I");
        this.i = 324;
        this.j = 0;
        this.k = null;
    }

    private void x1(String s) {
        this.a.V("javassist/runtime/Desc", s, "(Ljava/lang/String;)Ljava/lang/Class;");
        this.i = 307;
        this.j = 0;
        this.k = "java/lang/Class";
    }

    void y1(javassist.compiler.ast.b b0, int v, String s, a a0) throws c {
        b0.a(this);
        int v1 = this.j1(a0);
        this.W0(a0, new int[v1], new int[v1], new String[v1]);
        this.a.N(v, s);
        this.q1(s, false, false);
        this.s1();
    }

    public static int z1(j j0, l[] arr_l, int v) {
        if(arr_l == null) {
            j0.E(0);
            j0.l("java.lang.Object");
            return 1;
        }
        j0.E(arr_l.length);
        j0.l("java.lang.Object");
        for(int v1 = 0; v1 < arr_l.length; ++v1) {
            j0.s0(89);
            j0.E(v1);
            if(arr_l[v1].p0()) {
                w w0 = (w)arr_l[v1];
                String s = w0.a1();
                j0.p0(s);
                j0.s0(89);
                v += j0.j0(v, w0);
                j0.P(s, "<init>", javassist.bytecode.w.q(l.m, new l[]{w0}));
            }
            else {
                j0.k(v);
                ++v;
            }
            j0.s0(83);
        }
        return 8;
    }
}

