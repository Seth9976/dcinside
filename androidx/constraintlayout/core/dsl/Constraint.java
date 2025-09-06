package androidx.constraintlayout.core.dsl;

import java.util.HashMap;
import java.util.Map;

public class Constraint {
    public class Anchor {
        final Side a;
        Anchor b;
        int c;
        int d;
        final Constraint e;

        Anchor(Side constraint$Side0) {
            this.b = null;
            this.d = 0x80000000;
            this.a = constraint$Side0;
        }

        public void a(StringBuilder stringBuilder0) {
            if(this.b != null) {
                stringBuilder0.append(this.a.toString().toLowerCase());
                stringBuilder0.append(":");
                stringBuilder0.append(this);
                stringBuilder0.append(",\n");
            }
        }

        public String b() {
            return Constraint.this.a;
        }

        Constraint c() {
            return Constraint.this;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder("[");
            if(this.b != null) {
                stringBuilder0.append("\'");
                stringBuilder0.append(this.b.b());
                stringBuilder0.append("\',");
                stringBuilder0.append("\'");
                stringBuilder0.append(this.b.a.toString().toLowerCase());
                stringBuilder0.append("\'");
            }
            if(this.c != 0) {
                stringBuilder0.append(",");
                stringBuilder0.append(this.c);
            }
            if(this.d != 0x80000000) {
                if(this.c == 0) {
                    stringBuilder0.append(",0,");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(this.d);
            }
            stringBuilder0.append("]");
            return stringBuilder0.toString();
        }
    }

    public static enum Behaviour {
        SPREAD,
        WRAP,
        PERCENT,
        RATIO,
        RESOLVED;

        private static Behaviour[] a() [...] // Inlined contents
    }

    public static enum ChainMode {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        private static ChainMode[] a() [...] // Inlined contents
    }

    public class HAnchor extends Anchor {
        final Constraint f;

        HAnchor(HSide constraint$HSide0) {
            super(Side.valueOf(constraint$HSide0.name()));
        }
    }

    public static enum HSide {
        LEFT,
        RIGHT,
        START,
        END;

        private static HSide[] a() [...] // Inlined contents
    }

    public static enum Side {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        START,
        END,
        BASELINE;

        private static Side[] a() [...] // Inlined contents
    }

    public class VAnchor extends Anchor {
        final Constraint f;

        VAnchor(VSide constraint$VSide0) {
            super(Side.valueOf(constraint$VSide0.name()));
        }
    }

    public static enum VSide {
        TOP,
        BOTTOM,
        BASELINE;

        private static VSide[] a() [...] // Inlined contents
    }

    private int A;
    private int B;
    private int C;
    private int D;
    private float E;
    private float F;
    private String[] G;
    private boolean H;
    private boolean I;
    public static final Constraint J;
    static int K;
    static Map L;
    private final String a;
    String b;
    String c;
    private HAnchor d;
    private HAnchor e;
    private VAnchor f;
    private VAnchor g;
    private HAnchor h;
    private HAnchor i;
    private VAnchor j;
    private int k;
    private int l;
    private float m;
    private float n;
    private String o;
    private String p;
    private int q;
    private float r;
    private int s;
    private int t;
    private float u;
    private float v;
    private ChainMode w;
    private ChainMode x;
    private Behaviour y;
    private Behaviour z;

    static {
        Constraint.J = new Constraint("parent");
        Constraint.K = 0x80000000;
        HashMap hashMap0 = new HashMap();
        Constraint.L = hashMap0;
        hashMap0.put(ChainMode.a, "spread");
        Constraint.L.put(ChainMode.b, "spread_inside");
        Constraint.L.put(ChainMode.c, "packed");
    }

    public Constraint(String s) {
        this.b = null;
        this.c = null;
        this.d = new HAnchor(this, HSide.a);
        this.e = new HAnchor(this, HSide.b);
        this.f = new VAnchor(this, VSide.a);
        this.g = new VAnchor(this, VSide.b);
        this.h = new HAnchor(this, HSide.c);
        this.i = new HAnchor(this, HSide.d);
        this.j = new VAnchor(this, VSide.c);
        this.k = Constraint.K;
        this.l = Constraint.K;
        this.m = NaNf;
        this.n = NaNf;
        this.o = null;
        this.p = null;
        this.q = 0x80000000;
        this.r = NaNf;
        this.s = 0x80000000;
        this.t = 0x80000000;
        this.u = NaNf;
        this.v = NaNf;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = Constraint.K;
        this.B = Constraint.K;
        this.C = Constraint.K;
        this.D = Constraint.K;
        this.E = NaNf;
        this.F = NaNf;
        this.G = null;
        this.H = false;
        this.I = false;
        this.a = s;
    }

    public ChainMode A() {
        return this.x;
    }

    public void A0(int v) {
        this.A = v;
    }

    public float B() {
        return this.u;
    }

    public void B0(int v) {
        this.C = v;
    }

    public int C() {
        return this.k;
    }

    public void C0(float f) {
        this.E = f;
    }

    public Behaviour D() {
        return this.y;
    }

    public int E() {
        return this.A;
    }

    public int F() {
        return this.C;
    }

    public float G() {
        return this.E;
    }

    public boolean H() {
        return this.I;
    }

    public boolean I() {
        return this.H;
    }

    public void J(VAnchor constraint$VAnchor0) {
        this.K(constraint$VAnchor0, 0);
    }

    public void K(VAnchor constraint$VAnchor0, int v) {
        this.L(constraint$VAnchor0, v, 0x80000000);
    }

    public void L(VAnchor constraint$VAnchor0, int v, int v1) {
        this.j.b = constraint$VAnchor0;
        this.j.c = v;
        this.j.d = v1;
    }

    public void M(VAnchor constraint$VAnchor0) {
        this.N(constraint$VAnchor0, 0);
    }

    public void N(VAnchor constraint$VAnchor0, int v) {
        this.O(constraint$VAnchor0, v, 0x80000000);
    }

    public void O(VAnchor constraint$VAnchor0, int v, int v1) {
        this.g.b = constraint$VAnchor0;
        this.g.c = v;
        this.g.d = v1;
    }

    public void P(HAnchor constraint$HAnchor0) {
        this.Q(constraint$HAnchor0, 0);
    }

    public void Q(HAnchor constraint$HAnchor0, int v) {
        this.R(constraint$HAnchor0, v, 0x80000000);
    }

    public void R(HAnchor constraint$HAnchor0, int v, int v1) {
        this.i.b = constraint$HAnchor0;
        this.i.c = v;
        this.i.d = v1;
    }

    public void S(HAnchor constraint$HAnchor0) {
        this.T(constraint$HAnchor0, 0);
    }

    public void T(HAnchor constraint$HAnchor0, int v) {
        this.U(constraint$HAnchor0, v, 0x80000000);
    }

    public void U(HAnchor constraint$HAnchor0, int v, int v1) {
        this.d.b = constraint$HAnchor0;
        this.d.c = v;
        this.d.d = v1;
    }

    public void V(HAnchor constraint$HAnchor0) {
        this.W(constraint$HAnchor0, 0);
    }

    public void W(HAnchor constraint$HAnchor0, int v) {
        this.X(constraint$HAnchor0, v, 0x80000000);
    }

    public void X(HAnchor constraint$HAnchor0, int v, int v1) {
        this.e.b = constraint$HAnchor0;
        this.e.c = v;
        this.e.d = v1;
    }

    public void Y(HAnchor constraint$HAnchor0) {
        this.Z(constraint$HAnchor0, 0);
    }

    public void Z(HAnchor constraint$HAnchor0, int v) {
        this.a0(constraint$HAnchor0, v, 0x80000000);
    }

    public void a0(HAnchor constraint$HAnchor0, int v, int v1) {
        this.h.b = constraint$HAnchor0;
        this.h.c = v;
        this.h.d = v1;
    }

    protected void b(StringBuilder stringBuilder0, String s, float f) {
        if(Float.isNaN(f)) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(":");
        stringBuilder0.append(f);
        stringBuilder0.append(",\n");
    }

    public void b0(VAnchor constraint$VAnchor0) {
        this.c0(constraint$VAnchor0, 0);
    }

    public String c(String[] arr_s) {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        for(int v = 0; v < arr_s.length; ++v) {
            stringBuilder0.append((v == 0 ? "\'" : ",\'"));
            stringBuilder0.append(arr_s[v]);
            stringBuilder0.append("\'");
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public void c0(VAnchor constraint$VAnchor0, int v) {
        this.d0(constraint$VAnchor0, v, 0x80000000);
    }

    public VAnchor d() {
        return this.j;
    }

    public void d0(VAnchor constraint$VAnchor0, int v, int v1) {
        this.f.b = constraint$VAnchor0;
        this.f.c = v;
        this.f.d = v1;
    }

    public VAnchor e() {
        return this.g;
    }

    public void e0(float f) {
        this.r = f;
    }

    public float f() {
        return this.r;
    }

    public void f0(String s) {
        this.p = s;
    }

    public String g() {
        return this.p;
    }

    public void g0(int v) {
        this.q = v;
    }

    public int h() {
        return this.q;
    }

    public void h0(boolean z) {
        this.I = z;
    }

    public String i() {
        return this.o;
    }

    public void i0(boolean z) {
        this.H = z;
    }

    public int j() {
        return this.s;
    }

    public void j0(String s) {
        this.o = s;
    }

    public int k() {
        return this.t;
    }

    public void k0(int v) {
        this.s = v;
    }

    public HAnchor l() {
        return this.i;
    }

    public void l0(int v) {
        this.t = v;
    }

    public int m() {
        return this.l;
    }

    public void m0(int v) {
        this.l = v;
    }

    public Behaviour n() {
        return this.z;
    }

    public void n0(Behaviour constraint$Behaviour0) {
        this.z = constraint$Behaviour0;
    }

    public int o() {
        return this.B;
    }

    public void o0(int v) {
        this.B = v;
    }

    public int p() {
        return this.D;
    }

    public void p0(int v) {
        this.D = v;
    }

    public float q() {
        return this.F;
    }

    public void q0(float f) {
        this.F = f;
    }

    public float r() {
        return this.m;
    }

    public void r0(float f) {
        this.m = f;
    }

    public ChainMode s() {
        return this.w;
    }

    public void s0(ChainMode constraint$ChainMode0) {
        this.w = constraint$ChainMode0;
    }

    public float t() {
        return this.v;
    }

    public void t0(float f) {
        this.v = f;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.a + ":{\n");
        this.d.a(stringBuilder0);
        this.e.a(stringBuilder0);
        this.f.a(stringBuilder0);
        this.g.a(stringBuilder0);
        this.h.a(stringBuilder0);
        this.i.a(stringBuilder0);
        this.j.a(stringBuilder0);
        if(this.k != Constraint.K) {
            stringBuilder0.append("width:");
            stringBuilder0.append(this.k);
            stringBuilder0.append(",\n");
        }
        if(this.l != Constraint.K) {
            stringBuilder0.append("height:");
            stringBuilder0.append(this.l);
            stringBuilder0.append(",\n");
        }
        this.b(stringBuilder0, "horizontalBias", this.m);
        this.b(stringBuilder0, "verticalBias", this.n);
        if(this.o != null) {
            stringBuilder0.append("dimensionRatio:\'");
            stringBuilder0.append(this.o);
            stringBuilder0.append("\',\n");
        }
        if(this.p != null && (!Float.isNaN(this.r) || this.q != 0x80000000)) {
            stringBuilder0.append("circular:[\'");
            stringBuilder0.append(this.p);
            stringBuilder0.append("\'");
            if(!Float.isNaN(this.r)) {
                stringBuilder0.append(",");
                stringBuilder0.append(this.r);
            }
            if(this.q != 0x80000000) {
                if(Float.isNaN(this.r)) {
                    stringBuilder0.append(",0,");
                }
                else {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(this.q);
            }
            stringBuilder0.append("],\n");
        }
        this.b(stringBuilder0, "verticalWeight", this.u);
        this.b(stringBuilder0, "horizontalWeight", this.v);
        if(this.w != null) {
            stringBuilder0.append("horizontalChainStyle:\'");
            stringBuilder0.append(((String)Constraint.L.get(this.w)));
            stringBuilder0.append("\',\n");
        }
        if(this.x != null) {
            stringBuilder0.append("verticalChainStyle:\'");
            stringBuilder0.append(((String)Constraint.L.get(this.x)));
            stringBuilder0.append("\',\n");
        }
        if(this.y != null) {
            if(this.A != Constraint.K || this.C != Constraint.K) {
                stringBuilder0.append("width:{value:\'");
                stringBuilder0.append(this.y.toString().toLowerCase());
                stringBuilder0.append("\'");
                if(this.A != Constraint.K) {
                    stringBuilder0.append(",max:");
                    stringBuilder0.append(this.A);
                }
                if(this.C != Constraint.K) {
                    stringBuilder0.append(",min:");
                    stringBuilder0.append(this.C);
                }
                stringBuilder0.append("},\n");
            }
            else {
                stringBuilder0.append("width:\'");
                stringBuilder0.append(this.y.toString().toLowerCase());
                stringBuilder0.append("\',\n");
            }
        }
        if(this.z != null) {
            if(this.B != Constraint.K || this.D != Constraint.K) {
                stringBuilder0.append("height:{value:\'");
                stringBuilder0.append(this.z.toString().toLowerCase());
                stringBuilder0.append("\'");
                if(this.B != Constraint.K) {
                    stringBuilder0.append(",max:");
                    stringBuilder0.append(this.B);
                }
                if(this.D != Constraint.K) {
                    stringBuilder0.append(",min:");
                    stringBuilder0.append(this.D);
                }
                stringBuilder0.append("},\n");
            }
            else {
                stringBuilder0.append("height:\'");
                stringBuilder0.append(this.z.toString().toLowerCase());
                stringBuilder0.append("\',\n");
            }
        }
        if(!Double.isNaN(this.E)) {
            stringBuilder0.append("width:\'");
            stringBuilder0.append(((int)this.E));
            stringBuilder0.append("%\',\n");
        }
        if(!Double.isNaN(this.F)) {
            stringBuilder0.append("height:\'");
            stringBuilder0.append(((int)this.F));
            stringBuilder0.append("%\',\n");
        }
        if(this.G != null) {
            stringBuilder0.append("referenceIds:");
            stringBuilder0.append(this.c(this.G));
            stringBuilder0.append(",\n");
        }
        if(this.H) {
            stringBuilder0.append("constrainedWidth:");
            stringBuilder0.append(this.H);
            stringBuilder0.append(",\n");
        }
        if(this.I) {
            stringBuilder0.append("constrainedHeight:");
            stringBuilder0.append(this.I);
            stringBuilder0.append(",\n");
        }
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }

    public HAnchor u() {
        return this.d;
    }

    public void u0(String[] arr_s) {
        this.G = arr_s;
    }

    public String[] v() {
        return this.G;
    }

    public void v0(float f) {
        this.n = f;
    }

    public HAnchor w() {
        return this.e;
    }

    public void w0(ChainMode constraint$ChainMode0) {
        this.x = constraint$ChainMode0;
    }

    public HAnchor x() {
        return this.h;
    }

    public void x0(float f) {
        this.u = f;
    }

    public VAnchor y() {
        return this.f;
    }

    public void y0(int v) {
        this.k = v;
    }

    public float z() {
        return this.n;
    }

    public void z0(Behaviour constraint$Behaviour0) {
        this.y = constraint$Behaviour0;
    }
}

