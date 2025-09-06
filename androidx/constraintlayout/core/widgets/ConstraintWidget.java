package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.analyzer.ChainRun;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ConstraintWidget {
    public static enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT;

        private static DimensionBehaviour[] a() [...] // Inlined contents
    }

    public int A;
    int A0;
    public static float A1 = 0.5f;
    public float B;
    int B0;
    public int C;
    boolean C0;
    public int D;
    boolean D0;
    public float E;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    int H;
    boolean H0;
    float I;
    boolean I0;
    private int[] J;
    int J0;
    public float K;
    int K0;
    private boolean L;
    boolean L0;
    private boolean M;
    boolean M0;
    private boolean N;
    public float[] N0;
    private int O;
    protected ConstraintWidget[] O0;
    private int P;
    protected ConstraintWidget[] P0;
    public ConstraintAnchor Q;
    ConstraintWidget Q0;
    public ConstraintAnchor R;
    ConstraintWidget R0;
    public ConstraintAnchor S;
    public int S0;
    public ConstraintAnchor T;
    public int T0;
    public ConstraintAnchor U;
    private static final boolean U0 = false;
    ConstraintAnchor V;
    private static final boolean V0 = false;
    ConstraintAnchor W;
    protected static final int W0 = 1;
    public ConstraintAnchor X;
    protected static final int X0 = 2;
    public ConstraintAnchor[] Y;
    private static final boolean Y0 = false;
    protected ArrayList Z;
    public static final int Z0 = 0;
    public boolean a;
    private boolean[] a0;
    public static final int a1 = 1;
    public WidgetRun[] b;
    public DimensionBehaviour[] b0;
    public static final int b1 = 2;
    public ChainRun c;
    public ConstraintWidget c0;
    public static final int c1 = 3;
    public ChainRun d;
    int d0;
    public static final int d1 = 4;
    public HorizontalWidgetRun e;
    int e0;
    public static final int e1 = -1;
    public VerticalWidgetRun f;
    public float f0;
    public static final int f1 = 0;
    public boolean[] g;
    protected int g0;
    public static final int g1 = 1;
    boolean h;
    protected int h0;
    public static final int h1 = 2;
    private boolean i;
    protected int i0;
    public static final int i1 = 0;
    private boolean j;
    int j0;
    public static final int j1 = 4;
    private boolean k;
    int k0;
    public static final int k1 = 8;
    private int l;
    protected int l0;
    public static final int l1 = 0;
    private int m;
    protected int m0;
    public static final int m1 = 1;
    public WidgetFrame n;
    int n0;
    public static final int n1 = 2;
    public String o;
    protected int o0;
    public static final int o1 = 0;
    private boolean p;
    protected int p0;
    public static final int p1 = 1;
    private boolean q;
    float q0;
    public static final int q1 = 2;
    private boolean r;
    float r0;
    public static final int r1 = 3;
    private boolean s;
    private Object s0;
    private static final int s1 = -2;
    public int t;
    private int t0;
    public static final int t1 = 0;
    public int u;
    private int u0;
    public static final int u1 = 1;
    private int v;
    private boolean v0;
    public static final int v1 = 2;
    public int w;
    private String w0;
    public static final int w1 = 3;
    public int x;
    private String x0;
    public static final int x1 = 4;
    public int[] y;
    int y0;
    static final int y1 = 0;
    public int z;
    int z0;
    static final int z1 = 1;

    static {
    }

    public ConstraintWidget() {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new WidgetFrame(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.K = NaNf;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, Type.b);
        this.R = new ConstraintAnchor(this, Type.c);
        this.S = new ConstraintAnchor(this, Type.d);
        this.T = new ConstraintAnchor(this, Type.e);
        this.U = new ConstraintAnchor(this, Type.f);
        this.V = new ConstraintAnchor(this, Type.h);
        this.W = new ConstraintAnchor(this, Type.i);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.g);
        this.X = constraintAnchor0;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor0};
        this.Z = new ArrayList();
        this.a0 = new boolean[2];
        this.b0 = new DimensionBehaviour[]{DimensionBehaviour.a, DimensionBehaviour.a};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = ConstraintWidget.A1;
        this.r0 = ConstraintWidget.A1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.d();
    }

    public ConstraintWidget(int v, int v1) {
        this(0, 0, v, v1);
    }

    public ConstraintWidget(int v, int v1, int v2, int v3) {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new WidgetFrame(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.K = NaNf;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, Type.b);
        this.R = new ConstraintAnchor(this, Type.c);
        this.S = new ConstraintAnchor(this, Type.d);
        this.T = new ConstraintAnchor(this, Type.e);
        this.U = new ConstraintAnchor(this, Type.f);
        this.V = new ConstraintAnchor(this, Type.h);
        this.W = new ConstraintAnchor(this, Type.i);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.g);
        this.X = constraintAnchor0;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor0};
        this.Z = new ArrayList();
        this.a0 = new boolean[2];
        this.b0 = new DimensionBehaviour[]{DimensionBehaviour.a, DimensionBehaviour.a};
        this.c0 = null;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = ConstraintWidget.A1;
        this.r0 = ConstraintWidget.A1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.h0 = v;
        this.i0 = v1;
        this.d0 = v2;
        this.e0 = v3;
        this.d();
    }

    public ConstraintWidget(String s) {
        this.a = false;
        this.b = new WidgetRun[2];
        this.e = null;
        this.f = null;
        this.g = new boolean[]{true, true};
        this.h = false;
        this.i = true;
        this.j = false;
        this.k = true;
        this.l = -1;
        this.m = -1;
        this.n = new WidgetFrame(this);
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = new int[2];
        this.z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.C = 0;
        this.D = 0;
        this.E = 1.0f;
        this.H = -1;
        this.I = 1.0f;
        this.J = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.K = NaNf;
        this.L = false;
        this.N = false;
        this.O = 0;
        this.P = 0;
        this.Q = new ConstraintAnchor(this, Type.b);
        this.R = new ConstraintAnchor(this, Type.c);
        this.S = new ConstraintAnchor(this, Type.d);
        this.T = new ConstraintAnchor(this, Type.e);
        this.U = new ConstraintAnchor(this, Type.f);
        this.V = new ConstraintAnchor(this, Type.h);
        this.W = new ConstraintAnchor(this, Type.i);
        ConstraintAnchor constraintAnchor0 = new ConstraintAnchor(this, Type.g);
        this.X = constraintAnchor0;
        this.Y = new ConstraintAnchor[]{this.Q, this.S, this.R, this.T, this.U, constraintAnchor0};
        this.Z = new ArrayList();
        this.a0 = new boolean[2];
        this.b0 = new DimensionBehaviour[]{DimensionBehaviour.a, DimensionBehaviour.a};
        this.c0 = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.q0 = ConstraintWidget.A1;
        this.r0 = ConstraintWidget.A1;
        this.t0 = 0;
        this.u0 = 0;
        this.v0 = false;
        this.w0 = null;
        this.x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new ConstraintWidget[]{null, null};
        this.P0 = new ConstraintWidget[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        this.d();
        this.k1(s);
    }

    public ConstraintWidget(String s, int v, int v1) {
        this(v, v1);
        this.k1(s);
    }

    public ConstraintWidget(String s, int v, int v1, int v2, int v3) {
        this(v, v1, v2, v3);
        this.k1(s);
    }

    public float A() {
        return this.f0;
    }

    public boolean A0(int v) {
        return this.a0[v];
    }

    public void A1(boolean z) {
        this.G = z;
    }

    public int B() {
        return this.g0;
    }

    public boolean B0() {
        ConstraintAnchor constraintAnchor0 = this.Q.f;
        if(constraintAnchor0 == null || constraintAnchor0.f != this.Q) {
            ConstraintAnchor constraintAnchor1 = this.S.f;
            return constraintAnchor1 != null && constraintAnchor1.f == this.S;
        }
        return true;
    }

    public void B1(float f) {
        this.q0 = f;
    }

    public boolean C() {
        return this.L;
    }

    public boolean C0() {
        return this.M;
    }

    public void C1(int v) {
        this.J0 = v;
    }

    public int D() {
        return this.u0 == 8 ? 0 : this.e0;
    }

    public boolean D0() {
        ConstraintAnchor constraintAnchor0 = this.R.f;
        if(constraintAnchor0 == null || constraintAnchor0.f != this.R) {
            ConstraintAnchor constraintAnchor1 = this.T.f;
            return constraintAnchor1 != null && constraintAnchor1.f == this.T;
        }
        return true;
    }

    public void D1(int v, int v1) {
        this.h0 = v;
        int v2 = v1 - v;
        this.d0 = v2;
        int v3 = this.o0;
        if(v2 < v3) {
            this.d0 = v3;
        }
    }

    public float E() {
        return this.q0;
    }

    public boolean E0() {
        return this.N;
    }

    public void E1(DimensionBehaviour constraintWidget$DimensionBehaviour0) {
        this.b0[0] = constraintWidget$DimensionBehaviour0;
    }

    public ConstraintWidget F() {
        if(this.B0()) {
            ConstraintWidget constraintWidget0 = this;
            ConstraintWidget constraintWidget1 = null;
            while(constraintWidget1 == null && constraintWidget0 != null) {
                ConstraintAnchor constraintAnchor0 = constraintWidget0.r(Type.b);
                ConstraintAnchor constraintAnchor1 = constraintAnchor0 == null ? null : constraintAnchor0.k();
                ConstraintWidget constraintWidget2 = constraintAnchor1 == null ? null : constraintAnchor1.i();
                if(constraintWidget2 == this.U()) {
                    return constraintWidget0;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget2 == null ? null : constraintWidget2.r(Type.d).k();
                if(constraintAnchor2 != null && constraintAnchor2.i() != constraintWidget0) {
                    constraintWidget1 = constraintWidget0;
                }
                else {
                    constraintWidget0 = constraintWidget2;
                }
            }
            return constraintWidget1;
        }
        return null;
    }

    public boolean F0() {
        return this.i && this.u0 != 8;
    }

    public void F1(int v, int v1, int v2, float f) {
        this.w = v;
        this.z = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.A = v2;
        this.B = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.w = 2;
        }
    }

    public int G() {
        return this.J0;
    }

    // 去混淆评级： 低(30)
    public boolean G0() {
        return this.p || this.Q.o() && this.S.o();
    }

    public void G1(float f) {
        this.N0[0] = f;
    }

    public DimensionBehaviour H() {
        return this.b0[0];
    }

    // 去混淆评级： 低(30)
    public boolean H0() {
        return this.q || this.R.o() && this.T.o();
    }

    protected void H1(int v, boolean z) {
        this.a0[v] = z;
    }

    public int I() {
        int v = this.Q == null ? 0 : this.Q.g;
        return this.S == null ? v : v + this.S.g;
    }

    public boolean I0() {
        return this.c0 == null;
    }

    public void I1(boolean z) {
        this.M = z;
    }

    public int J() {
        return this.O;
    }

    public boolean J0() {
        return this.x == 0 && this.f0 == 0.0f && this.C == 0 && this.D == 0 && this.b0[1] == DimensionBehaviour.c;
    }

    public void J1(boolean z) {
        this.N = z;
    }

    public int K() {
        return this.P;
    }

    public boolean K0() {
        return this.w == 0 && this.f0 == 0.0f && this.z == 0 && this.A == 0 && this.b0[0] == DimensionBehaviour.c;
    }

    public void K1(int v, int v1) {
        this.O = v;
        this.P = v1;
        this.O1(false);
    }

    public int L() {
        return this.o0();
    }

    public boolean L0() {
        return this.s;
    }

    public void L1(int v, int v1) {
        if(v1 == 0) {
            this.d2(v);
            return;
        }
        if(v1 == 1) {
            this.z1(v);
        }
    }

    public int M(int v) {
        if(v == 0) {
            return this.m0();
        }
        return v == 1 ? this.D() : 0;
    }

    public boolean M0() {
        return this.F;
    }

    public void M1(int v) {
        this.J[1] = v;
    }

    public int N() {
        return this.J[1];
    }

    public void N0() {
        this.r = true;
    }

    public void N1(int v) {
        this.J[0] = v;
    }

    public int O() {
        return this.J[0];
    }

    public void O0() {
        this.s = true;
    }

    public void O1(boolean z) {
        this.i = z;
    }

    public int P() {
        return this.p0;
    }

    public boolean P0(int v) {
        return this.b0[v] == DimensionBehaviour.c && this.b0[(v == 0 ? 1 : 0)] == DimensionBehaviour.c;
    }

    public void P1(int v) {
        if(v < 0) {
            this.p0 = 0;
            return;
        }
        this.p0 = v;
    }

    public int Q() {
        return this.o0;
    }

    public boolean Q0() {
        return this.b0[0] == DimensionBehaviour.c && this.b0[1] == DimensionBehaviour.c;
    }

    public void Q1(int v) {
        if(v < 0) {
            this.o0 = 0;
            return;
        }
        this.o0 = v;
    }

    public ConstraintWidget R(int v) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.S.f;
            return constraintAnchor0 == null || constraintAnchor0.f != this.S ? null : constraintAnchor0.d;
        }
        if(v == 1) {
            ConstraintAnchor constraintAnchor1 = this.T.f;
            return constraintAnchor1 == null || constraintAnchor1.f != this.T ? null : constraintAnchor1.d;
        }
        return null;
    }

    public void R0() {
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.c0 = null;
        this.K = NaNf;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.0f;
        this.g0 = -1;
        this.h0 = 0;
        this.i0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        this.p0 = 0;
        this.q0 = ConstraintWidget.A1;
        this.r0 = ConstraintWidget.A1;
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.b0;
        arr_constraintWidget$DimensionBehaviour[0] = DimensionBehaviour.a;
        arr_constraintWidget$DimensionBehaviour[1] = DimensionBehaviour.a;
        this.s0 = null;
        this.t0 = 0;
        this.u0 = 0;
        this.x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] arr_f = this.N0;
        arr_f[0] = -1.0f;
        arr_f[1] = -1.0f;
        this.t = -1;
        this.u = -1;
        int[] arr_v = this.J;
        arr_v[0] = 0x7FFFFFFF;
        arr_v[1] = 0x7FFFFFFF;
        this.w = 0;
        this.x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = 0x7FFFFFFF;
        this.D = 0x7FFFFFFF;
        this.z = 0;
        this.C = 0;
        this.h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] arr_z = this.g;
        arr_z[0] = true;
        arr_z[1] = true;
        this.N = false;
        boolean[] arr_z1 = this.a0;
        arr_z1[0] = false;
        arr_z1[1] = false;
        this.i = true;
        int[] arr_v1 = this.y;
        arr_v1[0] = 0;
        arr_v1[1] = 0;
        this.l = -1;
        this.m = -1;
    }

    public void R1(int v, int v1) {
        this.l0 = v;
        this.m0 = v1;
    }

    public int S() {
        int v = this.e0;
        if(this.b0[1] == DimensionBehaviour.c) {
            if(this.x == 1) {
                v = Math.max(this.C, v);
                return this.D <= 0 || this.D >= v ? v : this.D;
            }
            v = this.C;
            if(v > 0) {
                this.e0 = v;
                return this.D <= 0 || this.D >= v ? v : this.D;
            }
            return this.D <= 0 || this.D >= 0 ? 0 : this.D;
        }
        return v;
    }

    public void S0() {
        this.U0();
        this.W1(ConstraintWidget.A1);
        this.B1(ConstraintWidget.A1);
    }

    public void S1(int v, int v1) {
        this.h0 = v;
        this.i0 = v1;
    }

    public int T() {
        int v = this.d0;
        if(this.b0[0] == DimensionBehaviour.c) {
            if(this.w == 1) {
                v = Math.max(this.z, v);
                return this.A <= 0 || this.A >= v ? v : this.A;
            }
            v = this.z;
            if(v > 0) {
                this.d0 = v;
                return this.A <= 0 || this.A >= v ? v : this.A;
            }
            return this.A <= 0 || this.A >= 0 ? 0 : this.A;
        }
        return v;
    }

    public void T0(ConstraintAnchor constraintAnchor0) {
        ConstraintAnchor constraintAnchor1 = this.r(Type.b);
        ConstraintAnchor constraintAnchor2 = this.r(Type.d);
        ConstraintAnchor constraintAnchor3 = this.r(Type.c);
        ConstraintAnchor constraintAnchor4 = this.r(Type.e);
        ConstraintAnchor constraintAnchor5 = this.r(Type.g);
        ConstraintAnchor constraintAnchor6 = this.r(Type.h);
        ConstraintAnchor constraintAnchor7 = this.r(Type.i);
        if(constraintAnchor0 == constraintAnchor5) {
            if(constraintAnchor1.p() && constraintAnchor2.p() && constraintAnchor1.k() == constraintAnchor2.k()) {
                constraintAnchor1.x();
                constraintAnchor2.x();
            }
            if(constraintAnchor3.p() && constraintAnchor4.p() && constraintAnchor3.k() == constraintAnchor4.k()) {
                constraintAnchor3.x();
                constraintAnchor4.x();
            }
            this.q0 = 0.5f;
            this.r0 = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor6) {
            if(constraintAnchor1.p() && constraintAnchor2.p() && constraintAnchor1.k().i() == constraintAnchor2.k().i()) {
                constraintAnchor1.x();
                constraintAnchor2.x();
            }
            this.q0 = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor7) {
            if(constraintAnchor3.p() && constraintAnchor4.p() && constraintAnchor3.k().i() == constraintAnchor4.k().i()) {
                constraintAnchor3.x();
                constraintAnchor4.x();
            }
            this.r0 = 0.5f;
        }
        else if(constraintAnchor0 == constraintAnchor1 || constraintAnchor0 == constraintAnchor2) {
            if(constraintAnchor1.p() && constraintAnchor1.k() == constraintAnchor2.k()) {
                constraintAnchor5.x();
            }
        }
        else if((constraintAnchor0 == constraintAnchor3 || constraintAnchor0 == constraintAnchor4) && constraintAnchor3.p() && constraintAnchor3.k() == constraintAnchor4.k()) {
            constraintAnchor5.x();
        }
        constraintAnchor0.x();
    }

    public void T1(ConstraintWidget constraintWidget0) {
        this.c0 = constraintWidget0;
    }

    public ConstraintWidget U() {
        return this.c0;
    }

    public void U0() {
        int v = this.Z.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintAnchor)this.Z.get(v1)).x();
        }
    }

    void U1(int v, int v1) {
        if(v1 == 0) {
            this.j0 = v;
            return;
        }
        if(v1 == 1) {
            this.k0 = v;
        }
    }

    public ConstraintWidget V(int v) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.Q.f;
            return constraintAnchor0 == null || constraintAnchor0.f != this.Q ? null : constraintAnchor0.d;
        }
        if(v == 1) {
            ConstraintAnchor constraintAnchor1 = this.R.f;
            return constraintAnchor1 == null || constraintAnchor1.f != this.R ? null : constraintAnchor1.d;
        }
        return null;
    }

    public void V0() {
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        int v1 = this.Z.size();
        for(int v = 0; v < v1; ++v) {
            ((ConstraintAnchor)this.Z.get(v)).y();
        }
    }

    public void V1(String s) {
        this.x0 = s;
    }

    int W(int v) {
        if(v == 0) {
            return this.j0;
        }
        return v == 1 ? this.k0 : 0;
    }

    public void W0(Cache cache0) {
        this.Q.z(cache0);
        this.R.z(cache0);
        this.S.z(cache0);
        this.T.z(cache0);
        this.U.z(cache0);
        this.X.z(cache0);
        this.V.z(cache0);
        this.W.z(cache0);
    }

    public void W1(float f) {
        this.r0 = f;
    }

    public int X() {
        return this.o0() + this.d0;
    }

    public void X0() {
        this.r = false;
        this.s = false;
    }

    public void X1(int v) {
        this.K0 = v;
    }

    protected int Y() {
        return this.h0 + this.l0;
    }

    public StringBuilder Y0(StringBuilder stringBuilder0) {
        stringBuilder0.append("{\n");
        this.Z0(stringBuilder0, "left", this.Q);
        this.Z0(stringBuilder0, "top", this.R);
        this.Z0(stringBuilder0, "right", this.S);
        this.Z0(stringBuilder0, "bottom", this.T);
        this.Z0(stringBuilder0, "baseline", this.U);
        this.Z0(stringBuilder0, "centerX", this.V);
        this.Z0(stringBuilder0, "centerY", this.W);
        this.d1(stringBuilder0, this.X, this.K);
        this.f1(stringBuilder0, "width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.N0[0]);
        this.f1(stringBuilder0, "height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.N0[1]);
        this.e1(stringBuilder0, "dimensionRatio", this.f0, this.g0);
        this.a1(stringBuilder0, "horizontalBias", this.q0, ConstraintWidget.A1);
        this.a1(stringBuilder0, "verticalBias", this.r0, ConstraintWidget.A1);
        stringBuilder0.append("}\n");
        return stringBuilder0;
    }

    public void Y1(int v, int v1) {
        this.i0 = v;
        int v2 = v1 - v;
        this.e0 = v2;
        int v3 = this.p0;
        if(v2 < v3) {
            this.e0 = v3;
        }
    }

    protected int Z() {
        return this.i0 + this.m0;
    }

    private void Z0(StringBuilder stringBuilder0, String s, ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0.f == null) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" : [ \'");
        stringBuilder0.append(constraintAnchor0.f);
        stringBuilder0.append("\',");
        stringBuilder0.append(constraintAnchor0.g);
        stringBuilder0.append(",");
        stringBuilder0.append(constraintAnchor0.h);
        stringBuilder0.append(",");
        stringBuilder0.append(" ] ,\n");
    }

    public void Z1(DimensionBehaviour constraintWidget$DimensionBehaviour0) {
        this.b0[1] = constraintWidget$DimensionBehaviour0;
    }

    public WidgetRun a0(int v) {
        if(v == 0) {
            return this.e;
        }
        return v == 1 ? this.f : null;
    }

    private void a1(StringBuilder stringBuilder0, String s, float f, float f1) {
        if(f == f1) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :   ");
        stringBuilder0.append(f);
        stringBuilder0.append(",\n");
    }

    public void a2(int v, int v1, int v2, float f) {
        this.x = v;
        this.C = v1;
        if(v2 == 0x7FFFFFFF) {
            v2 = 0;
        }
        this.D = v2;
        this.E = f;
        if(f > 0.0f && f < 1.0f && v == 0) {
            this.x = 2;
        }
    }

    public void b0(StringBuilder stringBuilder0) {
        stringBuilder0.append("  " + this.o + ":{\n");
        stringBuilder0.append("    actualWidth:" + this.d0);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualHeight:" + this.e0);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualLeft:" + this.h0);
        stringBuilder0.append("\n");
        stringBuilder0.append("    actualTop:" + this.i0);
        stringBuilder0.append("\n");
        this.d0(stringBuilder0, "left", this.Q);
        this.d0(stringBuilder0, "top", this.R);
        this.d0(stringBuilder0, "right", this.S);
        this.d0(stringBuilder0, "bottom", this.T);
        this.d0(stringBuilder0, "baseline", this.U);
        this.d0(stringBuilder0, "centerX", this.V);
        this.d0(stringBuilder0, "centerY", this.W);
        this.c0(stringBuilder0, "    width", this.d0, this.o0, this.J[0], this.l, this.z, this.w, this.B, this.b0[0], this.N0[0]);
        this.c0(stringBuilder0, "    height", this.e0, this.p0, this.J[1], this.m, this.C, this.x, this.E, this.b0[1], this.N0[1]);
        this.e1(stringBuilder0, "    dimensionRatio", this.f0, this.g0);
        this.a1(stringBuilder0, "    horizontalBias", this.q0, ConstraintWidget.A1);
        this.a1(stringBuilder0, "    verticalBias", this.r0, ConstraintWidget.A1);
        this.b1(stringBuilder0, "    horizontalChainStyle", this.J0, 0);
        this.b1(stringBuilder0, "    verticalChainStyle", this.K0, 0);
        stringBuilder0.append("  }");
    }

    private void b1(StringBuilder stringBuilder0, String s, int v, int v1) {
        if(v == v1) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :   ");
        stringBuilder0.append(v);
        stringBuilder0.append(",\n");
    }

    public void b2(float f) {
        this.N0[1] = f;
    }

    private void c0(StringBuilder stringBuilder0, String s, int v, int v1, int v2, int v3, int v4, int v5, float f, DimensionBehaviour constraintWidget$DimensionBehaviour0, float f1) {
        stringBuilder0.append(s);
        stringBuilder0.append(" :  {\n");
        this.c1(stringBuilder0, "      behavior", constraintWidget$DimensionBehaviour0.toString(), "FIXED");
        this.b1(stringBuilder0, "      size", v, 0);
        this.b1(stringBuilder0, "      min", v1, 0);
        this.b1(stringBuilder0, "      max", v2, 0x7FFFFFFF);
        this.b1(stringBuilder0, "      matchMin", v4, 0);
        this.b1(stringBuilder0, "      matchDef", v5, 0);
        this.a1(stringBuilder0, "      matchPercent", f, 1.0f);
        stringBuilder0.append("    },\n");
    }

    private void c1(StringBuilder stringBuilder0, String s, String s1, String s2) {
        if(s2.equals(s1)) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :   ");
        stringBuilder0.append(s1);
        stringBuilder0.append(",\n");
    }

    public void c2(int v) {
        this.u0 = v;
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    private void d0(StringBuilder stringBuilder0, String s, ConstraintAnchor constraintAnchor0) {
        if(constraintAnchor0.f == null) {
            return;
        }
        stringBuilder0.append("    ");
        stringBuilder0.append(s);
        stringBuilder0.append(" : [ \'");
        stringBuilder0.append(constraintAnchor0.f);
        stringBuilder0.append("\'");
        if(constraintAnchor0.h != 0x80000000 || constraintAnchor0.g != 0) {
            stringBuilder0.append(",");
            stringBuilder0.append(constraintAnchor0.g);
            if(constraintAnchor0.h != 0x80000000) {
                stringBuilder0.append(",");
                stringBuilder0.append(constraintAnchor0.h);
                stringBuilder0.append(",");
            }
        }
        stringBuilder0.append(" ] ,\n");
    }

    private void d1(StringBuilder stringBuilder0, ConstraintAnchor constraintAnchor0, float f) {
        if(constraintAnchor0.f != null && !Float.isNaN(f)) {
            stringBuilder0.append("circle : [ \'");
            stringBuilder0.append(constraintAnchor0.f);
            stringBuilder0.append("\',");
            stringBuilder0.append(constraintAnchor0.g);
            stringBuilder0.append(",");
            stringBuilder0.append(f);
            stringBuilder0.append(",");
            stringBuilder0.append(" ] ,\n");
        }
    }

    public void d2(int v) {
        this.d0 = v;
        int v1 = this.o0;
        if(v < v1) {
            this.d0 = v1;
        }
    }

    public void e(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, HashSet hashSet0, int v, boolean z) {
        if(z) {
            if(!hashSet0.contains(this)) {
                return;
            }
            Optimizer.a(constraintWidgetContainer0, linearSystem0, this);
            hashSet0.remove(this);
            this.g(linearSystem0, constraintWidgetContainer0.T2(0x40));
        }
        if(v == 0) {
            HashSet hashSet1 = this.Q.e();
            if(hashSet1 != null) {
                for(Object object0: hashSet1) {
                    ((ConstraintAnchor)object0).d.e(constraintWidgetContainer0, linearSystem0, hashSet0, 0, true);
                }
            }
            HashSet hashSet2 = this.S.e();
            if(hashSet2 != null) {
                for(Object object1: hashSet2) {
                    ((ConstraintAnchor)object1).d.e(constraintWidgetContainer0, linearSystem0, hashSet0, 0, true);
                }
            }
        }
        else {
            HashSet hashSet3 = this.R.e();
            if(hashSet3 != null) {
                for(Object object2: hashSet3) {
                    ((ConstraintAnchor)object2).d.e(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
            HashSet hashSet4 = this.T.e();
            if(hashSet4 != null) {
                for(Object object3: hashSet4) {
                    ((ConstraintAnchor)object3).d.e(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
            HashSet hashSet5 = this.U.e();
            if(hashSet5 != null) {
                for(Object object4: hashSet5) {
                    ((ConstraintAnchor)object4).d.e(constraintWidgetContainer0, linearSystem0, hashSet0, v, true);
                }
            }
        }
    }

    public int e0() {
        return this.p0();
    }

    private void e1(StringBuilder stringBuilder0, String s, float f, int v) {
        if(f == 0.0f) {
            return;
        }
        stringBuilder0.append(s);
        stringBuilder0.append(" :  [");
        stringBuilder0.append(f);
        stringBuilder0.append(",");
        stringBuilder0.append(v);
        stringBuilder0.append("");
        stringBuilder0.append("],\n");
    }

    public void e2(boolean z) {
        this.F = z;
    }

    // 去混淆评级： 低(20)
    boolean f() [...] // 潜在的解密器

    public String f0() {
        return this.x0;
    }

    private void f1(StringBuilder stringBuilder0, String s, int v, int v1, int v2, int v3, int v4, int v5, float f, float f1) {
        stringBuilder0.append(s);
        stringBuilder0.append(" :  {\n");
        this.b1(stringBuilder0, "size", v, 0x80000000);
        this.b1(stringBuilder0, "min", v1, 0);
        this.b1(stringBuilder0, "max", v2, 0x7FFFFFFF);
        this.b1(stringBuilder0, "matchMin", v4, 0);
        this.b1(stringBuilder0, "matchDef", v5, 0);
        this.b1(stringBuilder0, "matchPercent", v5, 1);
        this.a1(stringBuilder0, "matchConstraintPercent", f, 1.0f);
        this.a1(stringBuilder0, "weight", f1, 1.0f);
        this.b1(stringBuilder0, "override", v3, 1);
        stringBuilder0.append("},\n");
    }

    public void f2(int v) {
        if(v >= 0 && v <= 3) {
            this.v = v;
        }
    }

    public void g(LinearSystem linearSystem0, boolean z) {
        int v12;
        int v11;
        boolean z19;
        DimensionBehaviour constraintWidget$DimensionBehaviour5;
        DimensionBehaviour constraintWidget$DimensionBehaviour4;
        boolean z18;
        boolean z17;
        int v10;
        boolean z10;
        int v9;
        int v8;
        int v7;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6;
        boolean z4;
        boolean z3;
        SolverVariable solverVariable0 = linearSystem0.s(this.Q);
        SolverVariable solverVariable1 = linearSystem0.s(this.S);
        SolverVariable solverVariable2 = linearSystem0.s(this.R);
        SolverVariable solverVariable3 = linearSystem0.s(this.T);
        SolverVariable solverVariable4 = linearSystem0.s(this.U);
        ConstraintWidget constraintWidget0 = this.c0;
        if(constraintWidget0 == null) {
            z4 = false;
        label_21:
            z3 = false;
        }
        else {
            boolean z1 = constraintWidget0.b0[0] == DimensionBehaviour.b;
            boolean z2 = constraintWidget0 != null && constraintWidget0.b0[1] == DimensionBehaviour.b;
            switch(this.v) {
                case 1: {
                    z4 = z1;
                    goto label_21;
                }
                case 2: {
                    z3 = z2;
                    z4 = false;
                    break;
                }
                case 3: {
                    z4 = false;
                    goto label_21;
                }
                default: {
                    z3 = z2;
                    z4 = z1;
                }
            }
        }
        if(this.u0 == 8 && !this.v0 && !this.s0() && (!this.a0[0] && !this.a0[1])) {
            return;
        }
        boolean z5 = this.p;
        if(z5 || this.q) {
            if(z5) {
                linearSystem0.f(solverVariable0, this.h0);
                linearSystem0.f(solverVariable1, this.h0 + this.d0);
                if(z4) {
                    ConstraintWidget constraintWidget1 = this.c0;
                    if(constraintWidget1 != null) {
                        if(this.k) {
                            ((ConstraintWidgetContainer)constraintWidget1).v2(this.Q);
                            ((ConstraintWidgetContainer)constraintWidget1).u2(this.S);
                        }
                        else {
                            linearSystem0.h(linearSystem0.s(constraintWidget1.S), solverVariable1, 0, 5);
                        }
                    }
                }
            }
            if(this.q) {
                linearSystem0.f(solverVariable2, this.i0);
                linearSystem0.f(solverVariable3, this.i0 + this.e0);
                if(this.U.n()) {
                    linearSystem0.f(solverVariable4, this.i0 + this.n0);
                }
                if(z3) {
                    ConstraintWidget constraintWidget2 = this.c0;
                    if(constraintWidget2 != null) {
                        if(this.k) {
                            ((ConstraintWidgetContainer)constraintWidget2).A2(this.R);
                            ((ConstraintWidgetContainer)constraintWidget2).z2(this.T);
                        }
                        else {
                            linearSystem0.h(linearSystem0.s(constraintWidget2.T), solverVariable3, 0, 5);
                        }
                    }
                }
            }
            if(this.p && this.q) {
                this.p = false;
                this.q = false;
                return;
            }
        }
        Metrics metrics0 = LinearSystem.C;
        if(metrics0 != null) {
            ++metrics0.F;
        }
        if(z) {
            HorizontalWidgetRun horizontalWidgetRun0 = this.e;
            if(horizontalWidgetRun0 != null) {
                VerticalWidgetRun verticalWidgetRun0 = this.f;
                if(verticalWidgetRun0 != null) {
                    DependencyNode dependencyNode0 = horizontalWidgetRun0.h;
                    if(dependencyNode0.j && horizontalWidgetRun0.i.j && verticalWidgetRun0.h.j && verticalWidgetRun0.i.j) {
                        if(metrics0 != null) {
                            ++metrics0.w;
                        }
                        linearSystem0.f(solverVariable0, dependencyNode0.g);
                        linearSystem0.f(solverVariable1, this.e.i.g);
                        linearSystem0.f(solverVariable2, this.f.h.g);
                        linearSystem0.f(solverVariable3, this.f.i.g);
                        linearSystem0.f(solverVariable4, this.f.k.g);
                        if(this.c0 != null) {
                            if(z4 && this.g[0] && !this.B0()) {
                                linearSystem0.h(linearSystem0.s(this.c0.S), solverVariable1, 0, 8);
                            }
                            if(z3 && this.g[1] && !this.D0()) {
                                linearSystem0.h(linearSystem0.s(this.c0.T), solverVariable3, 0, 8);
                            }
                        }
                        this.p = false;
                        this.q = false;
                        return;
                    }
                }
            }
        }
        if(metrics0 != null) {
            ++metrics0.x;
        }
        if(this.c0 == null) {
            z9 = false;
            z8 = false;
        }
        else {
            if(this.x0(0)) {
                ((ConstraintWidgetContainer)this.c0).r2(this, 0);
                z6 = true;
            }
            else {
                z6 = this.B0();
            }
            if(this.x0(1)) {
                ((ConstraintWidgetContainer)this.c0).r2(this, 1);
                z7 = true;
            }
            else {
                z7 = this.D0();
            }
            if(!z6 && z4 && this.u0 != 8 && this.Q.f == null && this.S.f == null) {
                linearSystem0.h(linearSystem0.s(this.c0.S), solverVariable1, 0, 1);
            }
            if(!z7 && z3 && this.u0 != 8 && this.R.f == null && this.T.f == null && this.U == null) {
                linearSystem0.h(linearSystem0.s(this.c0.T), solverVariable3, 0, 1);
            }
            z8 = z6;
            z9 = z7;
        }
        int v = this.d0;
        int v1 = v < this.o0 ? this.o0 : v;
        int v2 = this.e0;
        int v3 = v2 < this.p0 ? this.p0 : v2;
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.b0;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.c;
        DimensionBehaviour constraintWidget$DimensionBehaviour2 = arr_constraintWidget$DimensionBehaviour[1];
        int v4 = this.g0;
        this.H = v4;
        float f = this.f0;
        this.I = f;
        int v5 = this.w;
        int v6 = this.x;
        if(f <= 0.0f || this.u0 == 8) {
            v10 = v5;
            v8 = v6;
            v7 = v1;
            v9 = v3;
            z10 = false;
        }
        else {
            if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && v5 == 0) {
                v5 = 3;
            }
            if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1 && v6 == 0) {
                v6 = 3;
            }
            if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1 && v5 == 3 && v6 == 3) {
                this.i2(z4, z3, constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour1, constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour1);
                goto label_149;
            }
            else if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1 && v5 == 3) {
                this.H = 0;
                v7 = (int)(f * ((float)v2));
                if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour1) {
                    v10 = 3;
                    v8 = v6;
                    v9 = v3;
                    z10 = true;
                }
                else {
                    v8 = v6;
                    v9 = v3;
                    z10 = false;
                    v10 = 4;
                }
            }
            else if(constraintWidget$DimensionBehaviour2 != constraintWidget$DimensionBehaviour1 || v6 != 3) {
            label_149:
                v10 = v5;
                v8 = v6;
                v7 = v1;
                v9 = v3;
                z10 = true;
            }
            else {
                this.H = 1;
                if(v4 == -1) {
                    this.I = 1.0f / f;
                }
                v9 = (int)(this.I * ((float)v));
                v10 = v5;
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
                    v8 = 3;
                    v7 = v1;
                    z10 = true;
                }
                else {
                    v7 = v1;
                    z10 = false;
                    v8 = 4;
                }
            }
        }
        int[] arr_v = this.y;
        arr_v[0] = v10;
        arr_v[1] = v8;
        this.h = z10;
        boolean z11 = z10 && (this.H == -1 || this.H == 0);
        boolean z12 = z10 && (this.H == -1 || this.H == 1);
        DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.b;
        boolean z13 = this.b0[0] == constraintWidget$DimensionBehaviour3 && this instanceof ConstraintWidgetContainer;
        boolean z14 = this.X.p();
        boolean[] arr_z = this.a0;
        boolean z15 = arr_z[0];
        boolean z16 = arr_z[1];
        if(this.t == 2 || this.p) {
            z17 = z4;
            z18 = z3;
            constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
            constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
            z19 = z10;
        }
        else if(z) {
            HorizontalWidgetRun horizontalWidgetRun1 = this.e;
            if(horizontalWidgetRun1 != null) {
                DependencyNode dependencyNode1 = horizontalWidgetRun1.h;
                if(dependencyNode1.j && horizontalWidgetRun1.i.j) {
                    linearSystem0.f(solverVariable0, dependencyNode1.g);
                    linearSystem0.f(solverVariable1, this.e.i.g);
                    if(this.c0 != null && z4 && this.g[0] && !this.B0()) {
                        linearSystem0.h(linearSystem0.s(this.c0.S), solverVariable1, 0, 8);
                    }
                    z17 = z4;
                    z18 = z3;
                    constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
                    constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
                    z19 = z10;
                    goto label_202;
                }
            }
            goto label_188;
        }
        else {
        label_188:
            SolverVariable solverVariable5 = this.c0 == null ? null : linearSystem0.s(this.c0.S);
            SolverVariable solverVariable6 = this.c0 == null ? null : linearSystem0.s(this.c0.Q);
            z17 = z4;
            z18 = z3;
            constraintWidget$DimensionBehaviour4 = constraintWidget$DimensionBehaviour1;
            constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour3;
            z19 = z10;
            this.i(linearSystem0, true, z4, z3, this.g[0], solverVariable6, solverVariable5, this.b0[0], z13, this.Q, this.S, this.h0, (z13 ? 0 : v7), this.o0, this.J[0], this.q0, z11, this.b0[1] == constraintWidget$DimensionBehaviour1, z8, z9, z15, v10, v8, this.z, this.A, this.B, !z14);
        }
    label_202:
        if(z) {
            VerticalWidgetRun verticalWidgetRun1 = this.f;
            if(verticalWidgetRun1 == null) {
                v11 = 1;
            }
            else {
                DependencyNode dependencyNode2 = verticalWidgetRun1.h;
                if(!dependencyNode2.j || !verticalWidgetRun1.i.j) {
                    v11 = 1;
                }
                else {
                    linearSystem0.f(solverVariable2, dependencyNode2.g);
                    linearSystem0.f(solverVariable3, this.f.i.g);
                    linearSystem0.f(solverVariable4, this.f.k.g);
                    ConstraintWidget constraintWidget3 = this.c0;
                    if(constraintWidget3 != null && !z9 && z18 && this.g[1]) {
                        linearSystem0.h(linearSystem0.s(constraintWidget3.T), solverVariable3, 0, 8);
                    }
                    v11 = 0;
                }
            }
        }
        else {
            v11 = 1;
        }
        if((this.u == 2 ? 0 : v11) != 0 && !this.q) {
            boolean z20 = this.b0[1] == constraintWidget$DimensionBehaviour5 && this instanceof ConstraintWidgetContainer;
            if(z20) {
                v9 = 0;
            }
            SolverVariable solverVariable7 = this.c0 == null ? null : linearSystem0.s(this.c0.T);
            SolverVariable solverVariable8 = this.c0 == null ? null : linearSystem0.s(this.c0.R);
            if(this.n0 <= 0 && this.u0 != 8) {
            label_237:
                v12 = !z14;
            }
            else {
                ConstraintAnchor constraintAnchor0 = this.U;
                if(constraintAnchor0.f == null) {
                    if(this.u0 == 8) {
                        linearSystem0.e(solverVariable4, solverVariable2, constraintAnchor0.g(), 8);
                    }
                    else {
                        linearSystem0.e(solverVariable4, solverVariable2, this.t(), 8);
                    }
                    goto label_237;
                }
                else {
                    linearSystem0.e(solverVariable4, solverVariable2, this.t(), 8);
                    linearSystem0.e(solverVariable4, linearSystem0.s(this.U.f), this.U.g(), 8);
                    if(z18) {
                        linearSystem0.h(solverVariable7, linearSystem0.s(this.T), 0, 5);
                    }
                    v12 = 0;
                }
            }
            this.i(linearSystem0, false, z18, z17, this.g[1], solverVariable8, solverVariable7, this.b0[1], z20, this.R, this.T, this.i0, v9, this.p0, this.J[1], this.r0, z12, this.b0[0] == constraintWidget$DimensionBehaviour4, z9, z8, z16, v8, v10, this.C, this.D, this.E, ((boolean)v12));
        }
        if(z19) {
            if(this.H == 1) {
                linearSystem0.k(solverVariable3, solverVariable2, solverVariable1, solverVariable0, this.I, 8);
            }
            else {
                linearSystem0.k(solverVariable1, solverVariable0, solverVariable3, solverVariable2, this.I, 8);
            }
        }
        if(this.X.p()) {
            linearSystem0.b(this, this.X.k().i(), ((float)Math.toRadians(this.K + 90.0f)), this.X.g());
        }
        this.p = false;
        this.q = false;
        Metrics metrics1 = LinearSystem.C;
        if(metrics1 != null) {
            metrics1.S = (long)linearSystem0.K();
            LinearSystem.C.T = (long)linearSystem0.L();
        }
    }

    public float g0() {
        return this.r0;
    }

    public void g1(boolean z) {
        this.v0 = z;
    }

    public void g2(int v) {
        this.h0 = v;
    }

    public boolean h() {
        return this.u0 != 8;
    }

    public ConstraintWidget h0() {
        if(this.D0()) {
            ConstraintWidget constraintWidget0 = this;
            ConstraintWidget constraintWidget1 = null;
            while(constraintWidget1 == null && constraintWidget0 != null) {
                ConstraintAnchor constraintAnchor0 = constraintWidget0.r(Type.c);
                ConstraintAnchor constraintAnchor1 = constraintAnchor0 == null ? null : constraintAnchor0.k();
                ConstraintWidget constraintWidget2 = constraintAnchor1 == null ? null : constraintAnchor1.i();
                if(constraintWidget2 == this.U()) {
                    return constraintWidget0;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget2 == null ? null : constraintWidget2.r(Type.e).k();
                if(constraintAnchor2 != null && constraintAnchor2.i() != constraintWidget0) {
                    constraintWidget1 = constraintWidget0;
                }
                else {
                    constraintWidget0 = constraintWidget2;
                }
            }
            return constraintWidget1;
        }
        return null;
    }

    public void h1(int v) {
        this.n0 = v;
        this.L = v > 0;
    }

    public void h2(int v) {
        this.i0 = v;
    }

    private void i(LinearSystem linearSystem0, boolean z, boolean z1, boolean z2, boolean z3, SolverVariable solverVariable0, SolverVariable solverVariable1, DimensionBehaviour constraintWidget$DimensionBehaviour0, boolean z4, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v, int v1, int v2, int v3, float f, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int v4, int v5, int v6, int v7, float f1, boolean z10) {
        int v49;
        int v46;
        ConstraintWidget constraintWidget6;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget4;
        int v45;
        int v44;
        int v43;
        int v42;
        int v41;
        int v39;
        int v38;
        int v37;
        int v36;
        int v35;
        int v34;
        int v33;
        boolean z16;
        int v32;
        int v31;
        int v30;
        int v29;
        int v27;
        boolean z15;
        int v26;
        int v25;
        SolverVariable solverVariable7;
        SolverVariable solverVariable6;
        int v22;
        int v21;
        int v20;
        int v19;
        boolean z14;
        boolean z13;
        int v18;
        int v17;
        int v16;
        int v14;
        int v12;
        SolverVariable solverVariable2 = linearSystem0.s(constraintAnchor0);
        SolverVariable solverVariable3 = linearSystem0.s(constraintAnchor1);
        SolverVariable solverVariable4 = linearSystem0.s(constraintAnchor0.k());
        SolverVariable solverVariable5 = linearSystem0.s(constraintAnchor1.k());
        if(LinearSystem.J() != null) {
            Metrics metrics0 = LinearSystem.J();
            ++metrics0.C;
        }
        int v8 = constraintAnchor0.p();
        boolean z11 = constraintAnchor1.p();
        boolean z12 = this.X.p();
        int v9 = z11 ? v8 + 1 : v8;
        if(z12) {
            ++v9;
        }
        int v10 = z5 ? 3 : v4;
        int v11 = constraintWidget$DimensionBehaviour0.ordinal();
        if(v11 == 0 || v11 == 1 || v11 != 2) {
            v12 = 0;
        }
        else if(v10 != 4) {
            v12 = 1;
        }
        else {
            v12 = 0;
        }
        int v13 = this.l;
        if(v13 == -1 || !z) {
            v13 = v1;
            v14 = v12;
        }
        else {
            this.l = -1;
            v14 = 0;
        }
        int v15 = this.m;
        if(v15 == -1 || z) {
            v16 = v14;
        }
        else {
            this.m = -1;
            v13 = v15;
            v16 = 0;
        }
        if(this.u0 == 8) {
            v17 = 0;
            v18 = 0;
        }
        else {
            v18 = v16;
            v17 = v13;
        }
        if(!z10) {
            z13 = z11;
        }
        else if(v8 == 0 && !z11 && !z12) {
            linearSystem0.f(solverVariable2, v);
            z13 = z11;
        }
        else if(v8 == 0 || z11) {
            z13 = z11;
        }
        else {
            z13 = false;
            linearSystem0.e(solverVariable2, solverVariable4, constraintAnchor0.g(), 8);
        }
        if(v18 == 0) {
            if(z4) {
                linearSystem0.e(solverVariable3, solverVariable2, 0, 3);
                if(v2 > 0) {
                    linearSystem0.h(solverVariable3, solverVariable2, v2, 8);
                }
                if(v3 < 0x7FFFFFFF) {
                    linearSystem0.j(solverVariable3, solverVariable2, v3, 8);
                }
            }
            else {
                linearSystem0.e(solverVariable3, solverVariable2, v17, 8);
            }
            z14 = z3;
            v19 = v6;
            v20 = v7;
            v21 = v9;
            v22 = 0;
        }
        else if(v9 == 2 || z5 || v10 != 0 && v10 != 1) {
            int v23 = v6 == -2 ? v17 : v6;
            v20 = v7 == -2 ? v17 : v7;
            if(v17 > 0 && v10 != 1) {
                v17 = 0;
            }
            if(v23 > 0) {
                linearSystem0.h(solverVariable3, solverVariable2, v23, 8);
                v17 = Math.max(v17, v23);
            }
            if(v20 > 0) {
                if(!z1 || v10 != 1) {
                    linearSystem0.j(solverVariable3, solverVariable2, v20, 8);
                }
                v17 = Math.min(v17, v20);
            }
            if(v10 == 1) {
                if(z1) {
                    linearSystem0.e(solverVariable3, solverVariable2, v17, 8);
                }
                else {
                    if(!z7) {
                    }
                    linearSystem0.e(solverVariable3, solverVariable2, v17, 5);
                    linearSystem0.j(solverVariable3, solverVariable2, v17, 8);
                }
                z14 = z3;
                v21 = v9;
                v22 = v18;
                v19 = v23;
            }
            else if(v10 == 2) {
                Type constraintAnchor$Type0 = Type.c;
                if(constraintAnchor0.l() == constraintAnchor$Type0 || constraintAnchor0.l() == Type.e) {
                    solverVariable6 = linearSystem0.s(this.c0.r(constraintAnchor$Type0));
                    solverVariable7 = linearSystem0.s(this.c0.r(Type.e));
                }
                else {
                    solverVariable6 = linearSystem0.s(this.c0.r(Type.b));
                    solverVariable7 = linearSystem0.s(this.c0.r(Type.d));
                }
                int v24 = v18;
                v21 = v9;
                linearSystem0.d(linearSystem0.t().n(solverVariable3, solverVariable2, solverVariable7, solverVariable6, f1));
                if(z1) {
                    v24 = 0;
                }
                v19 = v23;
                v22 = v24;
                z14 = z3;
            }
            else {
                v21 = v9;
                v19 = v23;
                v22 = v18;
                z14 = true;
            }
        }
        else {
            linearSystem0.e(solverVariable3, solverVariable2, (v7 <= 0 ? Math.max(v6, v17) : Math.min(v7, Math.max(v6, v17))), 8);
            z14 = z3;
            v19 = v6;
            v20 = v7;
            v21 = v9;
            v22 = 0;
        }
        if(z10) {
            if(z7) {
                v25 = v21;
                goto label_356;
            }
            if(v8 == 0 && !z13 && !z12) {
            label_338:
                v27 = 0;
                z15 = z1;
                v26 = 5;
            }
            else if(v8 != 0 && !z13) {
                v26 = !z1 || !(constraintAnchor0.f.d instanceof Barrier) ? 5 : 8;
                z15 = z1;
                v27 = 0;
            }
            else {
                if(v8 == 0 && z13) {
                    linearSystem0.e(solverVariable3, solverVariable5, -constraintAnchor1.g(), 8);
                    if(!z1) {
                    }
                    else if(this.j && solverVariable2.g) {
                        ConstraintWidget constraintWidget0 = this.c0;
                        if(constraintWidget0 == null) {
                            linearSystem0.h(solverVariable2, solverVariable0, 0, 5);
                        }
                        else if(z) {
                            ((ConstraintWidgetContainer)constraintWidget0).v2(constraintAnchor0);
                        }
                        else {
                            ((ConstraintWidgetContainer)constraintWidget0).A2(constraintAnchor0);
                        }
                    }
                    else {
                        linearSystem0.h(solverVariable2, solverVariable0, 0, 5);
                    }
                    goto label_338;
                }
                else if(v8 == 0 || !z13) {
                    goto label_338;
                }
                else {
                    ConstraintWidget constraintWidget1 = constraintAnchor0.f.d;
                    ConstraintWidget constraintWidget2 = constraintAnchor1.f.d;
                    ConstraintWidget constraintWidget3 = this.U();
                    int v28 = 6;
                    if(v22 == 0) {
                        v36 = v10;
                        if(solverVariable4.g && solverVariable5.g) {
                            linearSystem0.c(solverVariable2, solverVariable4, constraintAnchor0.g(), f, solverVariable5, solverVariable3, constraintAnchor1.g(), 8);
                            if(z1 && z14) {
                                int v40 = constraintAnchor1.f == null ? 0 : constraintAnchor1.g();
                                if(solverVariable5 != solverVariable1) {
                                    linearSystem0.h(solverVariable1, solverVariable3, v40, 5);
                                }
                            }
                            return;
                        }
                    label_260:
                        v38 = 6;
                        v37 = 5;
                    label_262:
                        v35 = 4;
                    label_263:
                        v34 = 1;
                        z16 = true;
                        v33 = 0;
                    }
                    else if(v10 == 0) {
                        if(v20 != 0 || v19 != 0) {
                            v29 = 5;
                            v30 = 5;
                            v31 = 1;
                            v32 = 0;
                            z16 = true;
                        }
                        else {
                            if(solverVariable4.g && solverVariable5.g) {
                                linearSystem0.e(solverVariable2, solverVariable4, constraintAnchor0.g(), 8);
                                linearSystem0.e(solverVariable3, solverVariable5, -constraintAnchor1.g(), 8);
                                return;
                            }
                            v29 = 8;
                            v30 = 8;
                            v31 = 0;
                            v32 = 1;
                            z16 = false;
                        }
                        if(constraintWidget1 instanceof Barrier || constraintWidget2 instanceof Barrier) {
                            v36 = 0;
                            v33 = v32;
                            v37 = v29;
                            v34 = v31;
                            v38 = 6;
                            v35 = 4;
                        }
                        else {
                            v33 = v32;
                            v34 = v31;
                            v35 = v30;
                            v36 = 0;
                            v37 = v29;
                            v38 = 6;
                        }
                    }
                    else {
                        v36 = 3;
                        switch(v10) {
                            case 1: {
                                v36 = 1;
                                v38 = 6;
                                v37 = 8;
                                goto label_262;
                            }
                            case 2: {
                                if(constraintWidget1 instanceof Barrier || constraintWidget2 instanceof Barrier) {
                                    v36 = 2;
                                    goto label_260;
                                }
                                else {
                                    v36 = 2;
                                    v38 = 6;
                                    v37 = 5;
                                    v35 = 5;
                                    goto label_263;
                                }
                                break;
                            }
                            case 3: {
                                if(this.H == -1) {
                                    if(!z8) {
                                        v38 = 8;
                                    }
                                    else if(z1) {
                                        v38 = 5;
                                    }
                                    else {
                                        v38 = 4;
                                    }
                                    v37 = 8;
                                    v35 = 5;
                                    v34 = 1;
                                    z16 = true;
                                    v33 = 1;
                                    break;
                                }
                                else if(z5) {
                                    if(v5 == 1 || v5 == 2) {
                                        v29 = 5;
                                        v39 = 4;
                                    }
                                    else {
                                        v29 = 8;
                                        v39 = 5;
                                    }
                                    v35 = v39;
                                    v34 = 1;
                                    z16 = true;
                                    v33 = 1;
                                    v37 = v29;
                                    v38 = 6;
                                }
                                else {
                                    if(v20 > 0) {
                                        v38 = 6;
                                        v37 = 5;
                                        v35 = 5;
                                    }
                                    else if(v20 != 0 || v19 != 0) {
                                        v38 = 6;
                                        v37 = 5;
                                        v35 = 4;
                                    }
                                    else if(!z8) {
                                        v38 = 6;
                                        v37 = 5;
                                        v35 = 8;
                                    }
                                    else {
                                        v37 = constraintWidget1 == constraintWidget3 || constraintWidget2 == constraintWidget3 ? 5 : 4;
                                        v38 = 6;
                                        v35 = 4;
                                    }
                                    v34 = 1;
                                    z16 = true;
                                    v33 = 1;
                                }
                                break;
                            }
                            default: {
                                v36 = v10;
                                v38 = 6;
                                v37 = 5;
                                v35 = 4;
                                v34 = 0;
                                z16 = false;
                                v33 = 0;
                            }
                        }
                    }
                    if(!z16 || solverVariable4 != solverVariable5 || constraintWidget1 == constraintWidget3) {
                        v41 = 1;
                    }
                    else {
                        z16 = false;
                        v41 = 0;
                    }
                    if(v34 == 0) {
                        constraintWidget5 = constraintWidget2;
                        v45 = v36;
                        constraintWidget4 = constraintWidget3;
                        z15 = z1;
                    }
                    else {
                        if(v22 != 0 || z6 || z8 || solverVariable4 != solverVariable0 || solverVariable5 != solverVariable1) {
                            z15 = z1;
                            v43 = v38;
                            v44 = v41;
                            v42 = v37;
                        }
                        else {
                            z15 = false;
                            v42 = 8;
                            v43 = 8;
                            v44 = 0;
                        }
                        v45 = v36;
                        constraintWidget4 = constraintWidget3;
                        constraintWidget5 = constraintWidget2;
                        linearSystem0.c(solverVariable2, solverVariable4, constraintAnchor0.g(), f, solverVariable5, solverVariable3, constraintAnchor1.g(), v43);
                        v37 = v42;
                        v41 = v44;
                    }
                    if(this.u0 == 8 && !constraintAnchor1.n()) {
                        return;
                    }
                    if(z16) {
                        if(z15 && solverVariable4 != solverVariable5 && v22 == 0 && (constraintWidget1 instanceof Barrier || constraintWidget5 instanceof Barrier)) {
                            v37 = 6;
                        }
                        linearSystem0.h(solverVariable2, solverVariable4, constraintAnchor0.g(), v37);
                        linearSystem0.j(solverVariable3, solverVariable5, -constraintAnchor1.g(), v37);
                    }
                    if(!z15 || !z9 || constraintWidget1 instanceof Barrier || constraintWidget5 instanceof Barrier) {
                        constraintWidget6 = constraintWidget4;
                        v46 = v35;
                    }
                    else {
                        constraintWidget6 = constraintWidget4;
                        if(constraintWidget5 == constraintWidget6) {
                            v46 = v35;
                        }
                        else {
                            v37 = 6;
                            v46 = 6;
                            v41 = 1;
                        }
                    }
                    if(v41 != 0) {
                        if(v33 != 0 && (!z8 || z2)) {
                            if(constraintWidget1 != constraintWidget6 && constraintWidget5 != constraintWidget6) {
                                v28 = v46;
                            }
                            if(constraintWidget1 instanceof Guideline || constraintWidget5 instanceof Guideline) {
                                v28 = 5;
                            }
                            if(constraintWidget1 instanceof Barrier || constraintWidget5 instanceof Barrier) {
                                v28 = 5;
                            }
                            v46 = Math.max((z8 ? 5 : v28), v46);
                        }
                        if(z15) {
                            v46 = !z5 || z8 || constraintWidget1 != constraintWidget6 && constraintWidget5 != constraintWidget6 ? Math.min(v37, v46) : 4;
                        }
                        linearSystem0.e(solverVariable2, solverVariable4, constraintAnchor0.g(), v46);
                        linearSystem0.e(solverVariable3, solverVariable5, -constraintAnchor1.g(), v46);
                    }
                    if(z15) {
                        int v47 = solverVariable0 == solverVariable4 ? constraintAnchor0.g() : 0;
                        if(solverVariable4 != solverVariable0) {
                            linearSystem0.h(solverVariable2, solverVariable0, v47, 5);
                        }
                    }
                    if(!z15 || v22 == 0 || v2 != 0 || v19 != 0) {
                        v27 = 0;
                    }
                    else if(v22 != 0 && v45 == 3) {
                        v27 = 0;
                        linearSystem0.h(solverVariable3, solverVariable2, 0, 8);
                    }
                    else {
                        v27 = 0;
                        linearSystem0.h(solverVariable3, solverVariable2, 0, 5);
                    }
                }
                v26 = 5;
            }
            if(z15 && z14) {
                if(constraintAnchor1.f != null) {
                    v27 = constraintAnchor1.g();
                }
                if(solverVariable5 != solverVariable1) {
                    if(this.j && solverVariable3.g) {
                        ConstraintWidget constraintWidget7 = this.c0;
                        if(constraintWidget7 != null) {
                            if(z) {
                                ((ConstraintWidgetContainer)constraintWidget7).u2(constraintAnchor1);
                                return;
                            }
                            ((ConstraintWidgetContainer)constraintWidget7).z2(constraintAnchor1);
                            return;
                        }
                    }
                    linearSystem0.h(solverVariable1, solverVariable3, v27, v26);
                }
            }
            return;
        }
        else {
            v25 = v21;
        }
    label_356:
        if(v25 < 2 && z1 && z14) {
            linearSystem0.h(solverVariable2, solverVariable0, 0, 8);
            int v48 = z || this.U.f == null ? 1 : 0;
            if(z) {
                v49 = v48;
            }
            else {
                ConstraintAnchor constraintAnchor2 = this.U.f;
                if(constraintAnchor2 == null) {
                    v49 = v48;
                }
                else if(constraintAnchor2.d.f0 != 0.0f && (constraintAnchor2.d.b0[0] == DimensionBehaviour.c && constraintAnchor2.d.b0[1] == DimensionBehaviour.c)) {
                    v49 = 1;
                }
                else {
                    v49 = 0;
                }
            }
            if(v49 != 0) {
                linearSystem0.h(solverVariable1, solverVariable3, 0, 8);
            }
        }
    }

    public int i0() {
        return this.K0;
    }

    public void i1(Object object0) {
        this.s0 = object0;
    }

    public void i2(boolean z, boolean z1, boolean z2, boolean z3) {
        if(this.H == -1) {
            if(z2 && !z3) {
                this.H = 0;
            }
            else if(!z2 && z3) {
                this.H = 1;
                if(this.g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if(this.H == 0 && (!this.R.p() || !this.T.p())) {
            this.H = 1;
        }
        else if(this.H == 1 && (!this.Q.p() || !this.S.p())) {
            this.H = 0;
        }
        if(this.H == -1 && (!this.R.p() || !this.T.p() || !this.Q.p() || !this.S.p())) {
            if(this.R.p() && this.T.p()) {
                this.H = 0;
            }
            else if(this.Q.p() && this.S.p()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if(this.H == -1) {
            int v = this.z;
            if(v > 0 && this.C == 0) {
                this.H = 0;
                return;
            }
            if(v == 0 && this.C > 0) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public void j(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1) {
        this.k(constraintAnchor$Type0, constraintWidget0, constraintAnchor$Type1, 0);
    }

    public DimensionBehaviour j0() {
        return this.b0[1];
    }

    public void j1(int v) {
        if(v >= 0) {
            this.t0 = v;
            return;
        }
        this.t0 = 0;
    }

    public void j2(boolean z, boolean z1) {
        int v = z & this.e.m();
        int v1 = z1 & this.f.m();
        int v2 = this.e.h.g;
        int v3 = this.f.h.g;
        int v4 = this.e.i.g;
        int v5 = this.f.i.g;
        if(v4 - v2 < 0 || v5 - v3 < 0 || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF) || (v4 == 0x80000000 || v4 == 0x7FFFFFFF) || (v5 == 0x80000000 || v5 == 0x7FFFFFFF)) {
            v4 = 0;
            v2 = 0;
            v5 = 0;
            v3 = 0;
        }
        int v6 = v4 - v2;
        int v7 = v5 - v3;
        if(v != 0) {
            this.h0 = v2;
        }
        if(v1 != 0) {
            this.i0 = v3;
        }
        if(this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        if(v != 0) {
            if(this.b0[0] == DimensionBehaviour.a) {
                int v8 = this.d0;
                if(v6 < v8) {
                    v6 = v8;
                }
            }
            this.d0 = v6;
            int v9 = this.o0;
            if(v6 < v9) {
                this.d0 = v9;
            }
        }
        if(v1 != 0) {
            if(this.b0[1] == DimensionBehaviour.a) {
                int v10 = this.e0;
                if(v7 < v10) {
                    v7 = v10;
                }
            }
            this.e0 = v7;
            int v11 = this.p0;
            if(v7 < v11) {
                this.e0 = v11;
            }
        }
    }

    public void k(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1, int v) {
        boolean z1;
        Type constraintAnchor$Type2 = Type.g;
        if(constraintAnchor$Type0 != constraintAnchor$Type2) {
            Type constraintAnchor$Type9 = Type.h;
            if(constraintAnchor$Type0 == constraintAnchor$Type9) {
                Type constraintAnchor$Type10 = Type.b;
                if(constraintAnchor$Type1 == constraintAnchor$Type10 || constraintAnchor$Type1 == Type.d) {
                    ConstraintAnchor constraintAnchor4 = this.r(constraintAnchor$Type10);
                    ConstraintAnchor constraintAnchor5 = constraintWidget0.r(constraintAnchor$Type1);
                    ConstraintAnchor constraintAnchor6 = this.r(Type.d);
                    constraintAnchor4.a(constraintAnchor5, 0);
                    constraintAnchor6.a(constraintAnchor5, 0);
                    this.r(constraintAnchor$Type9).a(constraintAnchor5, 0);
                    return;
                }
            }
            Type constraintAnchor$Type11 = Type.i;
            if(constraintAnchor$Type0 == constraintAnchor$Type11) {
                Type constraintAnchor$Type12 = Type.c;
                if(constraintAnchor$Type1 == constraintAnchor$Type12 || constraintAnchor$Type1 == Type.e) {
                    ConstraintAnchor constraintAnchor7 = constraintWidget0.r(constraintAnchor$Type1);
                    this.r(constraintAnchor$Type12).a(constraintAnchor7, 0);
                    this.r(Type.e).a(constraintAnchor7, 0);
                    this.r(constraintAnchor$Type11).a(constraintAnchor7, 0);
                    return;
                }
            }
            if(constraintAnchor$Type0 == constraintAnchor$Type9 && constraintAnchor$Type1 == constraintAnchor$Type9) {
                this.r(Type.b).a(constraintWidget0.r(Type.b), 0);
                this.r(Type.d).a(constraintWidget0.r(Type.d), 0);
                this.r(constraintAnchor$Type9).a(constraintWidget0.r(constraintAnchor$Type1), 0);
                return;
            }
            if(constraintAnchor$Type0 == constraintAnchor$Type11 && constraintAnchor$Type1 == constraintAnchor$Type11) {
                this.r(Type.c).a(constraintWidget0.r(Type.c), 0);
                this.r(Type.e).a(constraintWidget0.r(Type.e), 0);
                this.r(constraintAnchor$Type11).a(constraintWidget0.r(constraintAnchor$Type1), 0);
                return;
            }
            ConstraintAnchor constraintAnchor8 = this.r(constraintAnchor$Type0);
            ConstraintAnchor constraintAnchor9 = constraintWidget0.r(constraintAnchor$Type1);
            if(constraintAnchor8.v(constraintAnchor9)) {
                Type constraintAnchor$Type13 = Type.f;
                if(constraintAnchor$Type0 == constraintAnchor$Type13) {
                    ConstraintAnchor constraintAnchor10 = this.r(Type.c);
                    ConstraintAnchor constraintAnchor11 = this.r(Type.e);
                    if(constraintAnchor10 != null) {
                        constraintAnchor10.x();
                    }
                    if(constraintAnchor11 != null) {
                        constraintAnchor11.x();
                    }
                }
                else if(constraintAnchor$Type0 == Type.c || constraintAnchor$Type0 == Type.e) {
                    ConstraintAnchor constraintAnchor15 = this.r(constraintAnchor$Type13);
                    if(constraintAnchor15 != null) {
                        constraintAnchor15.x();
                    }
                    ConstraintAnchor constraintAnchor16 = this.r(constraintAnchor$Type2);
                    if(constraintAnchor16.k() != constraintAnchor9) {
                        constraintAnchor16.x();
                    }
                    ConstraintAnchor constraintAnchor17 = this.r(constraintAnchor$Type0).h();
                    ConstraintAnchor constraintAnchor18 = this.r(constraintAnchor$Type11);
                    if(constraintAnchor18.p()) {
                        constraintAnchor17.x();
                        constraintAnchor18.x();
                    }
                }
                else if(constraintAnchor$Type0 == Type.b || constraintAnchor$Type0 == Type.d) {
                    ConstraintAnchor constraintAnchor12 = this.r(constraintAnchor$Type2);
                    if(constraintAnchor12.k() != constraintAnchor9) {
                        constraintAnchor12.x();
                    }
                    ConstraintAnchor constraintAnchor13 = this.r(constraintAnchor$Type0).h();
                    ConstraintAnchor constraintAnchor14 = this.r(constraintAnchor$Type9);
                    if(constraintAnchor14.p()) {
                        constraintAnchor13.x();
                        constraintAnchor14.x();
                    }
                }
                constraintAnchor8.a(constraintAnchor9, v);
            }
        }
        else if(constraintAnchor$Type1 == constraintAnchor$Type2) {
            Type constraintAnchor$Type3 = Type.b;
            ConstraintAnchor constraintAnchor0 = this.r(constraintAnchor$Type3);
            Type constraintAnchor$Type4 = Type.d;
            ConstraintAnchor constraintAnchor1 = this.r(constraintAnchor$Type4);
            Type constraintAnchor$Type5 = Type.c;
            ConstraintAnchor constraintAnchor2 = this.r(constraintAnchor$Type5);
            Type constraintAnchor$Type6 = Type.e;
            ConstraintAnchor constraintAnchor3 = this.r(constraintAnchor$Type6);
            boolean z = true;
            if((constraintAnchor0 == null || !constraintAnchor0.p()) && (constraintAnchor1 == null || !constraintAnchor1.p())) {
                this.k(constraintAnchor$Type3, constraintWidget0, constraintAnchor$Type3, 0);
                this.k(constraintAnchor$Type4, constraintWidget0, constraintAnchor$Type4, 0);
                z1 = true;
            }
            else {
                z1 = false;
            }
            if((constraintAnchor2 == null || !constraintAnchor2.p()) && (constraintAnchor3 == null || !constraintAnchor3.p())) {
                this.k(constraintAnchor$Type5, constraintWidget0, constraintAnchor$Type5, 0);
                this.k(constraintAnchor$Type6, constraintWidget0, constraintAnchor$Type6, 0);
            }
            else {
                z = false;
            }
            if(z1 && z) {
                this.r(constraintAnchor$Type2).a(constraintWidget0.r(constraintAnchor$Type2), 0);
                return;
            }
            if(z1) {
                this.r(Type.h).a(constraintWidget0.r(Type.h), 0);
                return;
            }
            if(z) {
                this.r(Type.i).a(constraintWidget0.r(Type.i), 0);
            }
        }
        else {
            Type constraintAnchor$Type7 = Type.b;
            if(constraintAnchor$Type1 == constraintAnchor$Type7 || constraintAnchor$Type1 == Type.d) {
                this.k(constraintAnchor$Type7, constraintWidget0, constraintAnchor$Type1, 0);
                this.k(Type.d, constraintWidget0, constraintAnchor$Type1, 0);
                this.r(constraintAnchor$Type2).a(constraintWidget0.r(constraintAnchor$Type1), 0);
                return;
            }
            Type constraintAnchor$Type8 = Type.c;
            if(constraintAnchor$Type1 == constraintAnchor$Type8 || constraintAnchor$Type1 == Type.e) {
                this.k(constraintAnchor$Type8, constraintWidget0, constraintAnchor$Type1, 0);
                this.k(Type.e, constraintWidget0, constraintAnchor$Type1, 0);
                this.r(constraintAnchor$Type2).a(constraintWidget0.r(constraintAnchor$Type1), 0);
            }
        }
    }

    public int k0() {
        int v = this.Q == null ? 0 : this.R.g;
        return this.S == null ? v : v + this.T.g;
    }

    public void k1(String s) {
        this.w0 = s;
    }

    public void k2(LinearSystem linearSystem0, boolean z) {
        int v = linearSystem0.M(this.Q);
        int v1 = linearSystem0.M(this.R);
        int v2 = linearSystem0.M(this.S);
        int v3 = linearSystem0.M(this.T);
        if(z) {
            HorizontalWidgetRun horizontalWidgetRun0 = this.e;
            if(horizontalWidgetRun0 != null) {
                DependencyNode dependencyNode0 = horizontalWidgetRun0.h;
                if(dependencyNode0.j) {
                    DependencyNode dependencyNode1 = horizontalWidgetRun0.i;
                    if(dependencyNode1.j) {
                        v = dependencyNode0.g;
                        v2 = dependencyNode1.g;
                    }
                }
            }
        }
        if(z) {
            VerticalWidgetRun verticalWidgetRun0 = this.f;
            if(verticalWidgetRun0 != null) {
                DependencyNode dependencyNode2 = verticalWidgetRun0.h;
                if(dependencyNode2.j) {
                    DependencyNode dependencyNode3 = verticalWidgetRun0.i;
                    if(dependencyNode3.j) {
                        v1 = dependencyNode2.g;
                        v3 = dependencyNode3.g;
                    }
                }
            }
        }
        if(v2 - v < 0 || v3 - v1 < 0 || (v == 0x80000000 || v == 0x7FFFFFFF) || (v1 == 0x80000000 || v1 == 0x7FFFFFFF) || (v2 == 0x80000000 || v2 == 0x7FFFFFFF) || (v3 == 0x80000000 || v3 == 0x7FFFFFFF)) {
            v = 0;
            v3 = 0;
            v1 = 0;
            v2 = 0;
        }
        this.w1(v, v1, v2, v3);
    }

    public void l(ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v) {
        if(constraintAnchor0.i() == this) {
            this.k(constraintAnchor0.l(), constraintAnchor1.i(), constraintAnchor1.l(), v);
        }
    }

    public int l0() {
        return this.u0;
    }

    public void l1(LinearSystem linearSystem0, String s) {
        this.w0 = s;
        SolverVariable solverVariable0 = linearSystem0.s(this.Q);
        SolverVariable solverVariable1 = linearSystem0.s(this.R);
        SolverVariable solverVariable2 = linearSystem0.s(this.S);
        SolverVariable solverVariable3 = linearSystem0.s(this.T);
        solverVariable0.j(s + ".left");
        solverVariable1.j(s + ".top");
        solverVariable2.j(s + ".right");
        solverVariable3.j(s + ".bottom");
        linearSystem0.s(this.U).j(s + ".baseline");
    }

    public void m(ConstraintWidget constraintWidget0, float f, int v) {
        this.v0(Type.g, constraintWidget0, Type.g, v, 0);
        this.K = f;
    }

    public int m0() {
        return this.u0 == 8 ? 0 : this.d0;
    }

    public void m1(int v, int v1) {
        this.d0 = v;
        int v2 = this.o0;
        if(v < v2) {
            this.d0 = v2;
        }
        this.e0 = v1;
        int v3 = this.p0;
        if(v1 < v3) {
            this.e0 = v3;
        }
    }

    public void n(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        this.t = constraintWidget0.t;
        this.u = constraintWidget0.u;
        this.w = constraintWidget0.w;
        this.x = constraintWidget0.x;
        int[] arr_v = this.y;
        int[] arr_v1 = constraintWidget0.y;
        arr_v[0] = arr_v1[0];
        arr_v[1] = arr_v1[1];
        this.z = constraintWidget0.z;
        this.A = constraintWidget0.A;
        this.C = constraintWidget0.C;
        this.D = constraintWidget0.D;
        this.E = constraintWidget0.E;
        this.F = constraintWidget0.F;
        this.G = constraintWidget0.G;
        this.H = constraintWidget0.H;
        this.I = constraintWidget0.I;
        this.J = Arrays.copyOf(constraintWidget0.J, constraintWidget0.J.length);
        this.K = constraintWidget0.K;
        this.L = constraintWidget0.L;
        this.M = constraintWidget0.M;
        this.Q.x();
        this.R.x();
        this.S.x();
        this.T.x();
        this.U.x();
        this.V.x();
        this.W.x();
        this.X.x();
        this.b0 = (DimensionBehaviour[])Arrays.copyOf(this.b0, 2);
        ConstraintWidget constraintWidget1 = null;
        this.c0 = this.c0 == null ? null : ((ConstraintWidget)hashMap0.get(constraintWidget0.c0));
        this.d0 = constraintWidget0.d0;
        this.e0 = constraintWidget0.e0;
        this.f0 = constraintWidget0.f0;
        this.g0 = constraintWidget0.g0;
        this.h0 = constraintWidget0.h0;
        this.i0 = constraintWidget0.i0;
        this.j0 = constraintWidget0.j0;
        this.k0 = constraintWidget0.k0;
        this.l0 = constraintWidget0.l0;
        this.m0 = constraintWidget0.m0;
        this.n0 = constraintWidget0.n0;
        this.o0 = constraintWidget0.o0;
        this.p0 = constraintWidget0.p0;
        this.q0 = constraintWidget0.q0;
        this.r0 = constraintWidget0.r0;
        this.s0 = constraintWidget0.s0;
        this.t0 = constraintWidget0.t0;
        this.u0 = constraintWidget0.u0;
        this.v0 = constraintWidget0.v0;
        this.w0 = constraintWidget0.w0;
        this.x0 = constraintWidget0.x0;
        this.y0 = constraintWidget0.y0;
        this.z0 = constraintWidget0.z0;
        this.A0 = constraintWidget0.A0;
        this.B0 = constraintWidget0.B0;
        this.C0 = constraintWidget0.C0;
        this.D0 = constraintWidget0.D0;
        this.E0 = constraintWidget0.E0;
        this.F0 = constraintWidget0.F0;
        this.G0 = constraintWidget0.G0;
        this.H0 = constraintWidget0.H0;
        this.J0 = constraintWidget0.J0;
        this.K0 = constraintWidget0.K0;
        this.L0 = constraintWidget0.L0;
        this.M0 = constraintWidget0.M0;
        float[] arr_f = this.N0;
        float[] arr_f1 = constraintWidget0.N0;
        arr_f[0] = arr_f1[0];
        arr_f[1] = arr_f1[1];
        ConstraintWidget[] arr_constraintWidget = this.O0;
        ConstraintWidget[] arr_constraintWidget1 = constraintWidget0.O0;
        arr_constraintWidget[0] = arr_constraintWidget1[0];
        arr_constraintWidget[1] = arr_constraintWidget1[1];
        ConstraintWidget[] arr_constraintWidget2 = this.P0;
        ConstraintWidget[] arr_constraintWidget3 = constraintWidget0.P0;
        arr_constraintWidget2[0] = arr_constraintWidget3[0];
        arr_constraintWidget2[1] = arr_constraintWidget3[1];
        this.Q0 = constraintWidget0.Q0 == null ? null : ((ConstraintWidget)hashMap0.get(constraintWidget0.Q0));
        ConstraintWidget constraintWidget2 = constraintWidget0.R0;
        if(constraintWidget2 != null) {
            constraintWidget1 = (ConstraintWidget)hashMap0.get(constraintWidget2);
        }
        this.R0 = constraintWidget1;
    }

    public int n0() {
        return this.v;
    }

    public void n1(float f, int v) {
        this.f0 = f;
        this.g0 = v;
    }

    public void o(LinearSystem linearSystem0) {
        linearSystem0.s(this.Q);
        linearSystem0.s(this.R);
        linearSystem0.s(this.S);
        linearSystem0.s(this.T);
        if(this.n0 > 0) {
            linearSystem0.s(this.U);
        }
    }

    public int o0() {
        return this.c0 == null || !(this.c0 instanceof ConstraintWidgetContainer) ? this.h0 : ((ConstraintWidgetContainer)this.c0).J1 + this.h0;
    }

    public void o1(String s) {
        float f2;
        if(s != null && s.length() != 0) {
            int v = s.length();
            int v1 = s.indexOf(44);
            int v2 = 0;
            int v3 = -1;
            if(v1 > 0 && v1 < v - 1) {
                String s1 = s.substring(0, v1);
                if(!s1.equalsIgnoreCase("W")) {
                    v2 = s1.equalsIgnoreCase("H") ? 1 : -1;
                }
                v3 = v2;
                v2 = v1 + 1;
            }
            int v4 = s.indexOf(58);
            if(v4 < 0 || v4 >= v - 1) {
                String s4 = s.substring(v2);
                if(s4.length() > 0) {
                    try {
                        f2 = Float.parseFloat(s4);
                        goto label_29;
                    label_28:
                        f2 = 0.0f;
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
                else {
                    goto label_28;
                }
            }
            else {
                String s2 = s.substring(v2, v4);
                String s3 = s.substring(v4 + 1);
                if(s2.length() <= 0 || s3.length() <= 0) {
                    goto label_28;
                }
                else {
                    try {
                        float f = Float.parseFloat(s2);
                        float f1 = Float.parseFloat(s3);
                        if(f <= 0.0f || f1 <= 0.0f) {
                            goto label_28;
                        }
                        else if(v3 == 1) {
                            f2 = Math.abs(f1 / f);
                        }
                        else {
                            f2 = Math.abs(f / f1);
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        goto label_28;
                    }
                }
            }
        label_29:
            if(f2 > 0.0f) {
                this.f0 = f2;
                this.g0 = v3;
            }
            return;
        }
        this.f0 = 0.0f;
    }

    public void p() {
        this.i = true;
    }

    public int p0() {
        return this.c0 == null || !(this.c0 instanceof ConstraintWidgetContainer) ? this.i0 : ((ConstraintWidgetContainer)this.c0).K1 + this.i0;
    }

    public void p1(int v) {
        if(!this.L) {
            return;
        }
        int v1 = v - this.n0;
        int v2 = this.e0 + v1;
        this.i0 = v1;
        this.R.A(v1);
        this.T.A(v2);
        this.U.A(v);
        this.q = true;
    }

    public void q() {
        if(this.e == null) {
            this.e = new HorizontalWidgetRun(this);
        }
        if(this.f == null) {
            this.f = new VerticalWidgetRun(this);
        }
    }

    public boolean q0() {
        return this.L;
    }

    public void q1(int v, int v1, int v2, int v3, int v4, int v5) {
        this.w1(v, v1, v2, v3);
        this.h1(v4);
        if(v5 == 0) {
            this.p = true;
            this.q = false;
            return;
        }
        if(v5 == 1) {
            this.p = false;
            this.q = true;
            return;
        }
        if(v5 == 2) {
            this.p = true;
            this.q = true;
            return;
        }
        this.p = false;
        this.q = false;
    }

    public ConstraintAnchor r(Type constraintAnchor$Type0) {
        switch(constraintAnchor$Type0) {
            case 1: {
                return this.Q;
            }
            case 2: {
                return this.R;
            }
            case 3: {
                return this.S;
            }
            case 4: {
                return this.T;
            }
            case 5: {
                return this.U;
            }
            case 6: {
                return this.X;
            }
            case 7: {
                return this.V;
            }
            case 8: {
                return this.W;
            }
            case 9: {
                return null;
            }
            default: {
                throw new AssertionError(constraintAnchor$Type0.name());
            }
        }
    }

    public boolean r0(int v) {
        return v == 0 ? (this.Q.f == null ? 0 : 1) + (this.S.f == null ? 0 : 1) < 2 : (this.R.f == null ? 0 : 1) + (this.T.f == null ? 0 : 1) + (this.U.f == null ? 0 : 1) < 2;
    }

    public void r1(int v, int v1) {
        if(this.p) {
            return;
        }
        this.Q.A(v);
        this.S.A(v1);
        this.h0 = v;
        this.d0 = v1 - v;
        this.p = true;
    }

    public ArrayList s() {
        return this.Z;
    }

    public boolean s0() {
        int v = this.Z.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(((ConstraintAnchor)this.Z.get(v1)).n()) {
                return true;
            }
        }
        return false;
    }

    public void s1(int v) {
        this.Q.A(v);
        this.h0 = v;
    }

    public int t() {
        return this.n0;
    }

    public boolean t0() {
        return this.l != -1 || this.m != -1;
    }

    public void t1(int v) {
        this.R.A(v);
        this.i0 = v;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = "";
        stringBuilder0.append((this.x0 == null ? "" : "type: " + this.x0 + " "));
        if(this.w0 != null) {
            s = "id: " + this.w0 + " ";
        }
        stringBuilder0.append(s);
        stringBuilder0.append("(");
        stringBuilder0.append(this.h0);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.i0);
        stringBuilder0.append(") - (");
        stringBuilder0.append(this.d0);
        stringBuilder0.append(" x ");
        stringBuilder0.append(this.e0);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    public float u(int v) {
        if(v == 0) {
            return this.q0;
        }
        return v == 1 ? this.r0 : -1.0f;
    }

    public boolean u0(int v, int v1) {
        if(v == 0) {
            ConstraintAnchor constraintAnchor0 = this.Q.f;
            if(constraintAnchor0 != null && constraintAnchor0.o()) {
                ConstraintAnchor constraintAnchor1 = this.S.f;
                return constraintAnchor1 != null && constraintAnchor1.o() && this.S.f.f() - this.S.g() - (this.Q.f.f() + this.Q.g()) >= v1;
            }
        }
        else {
            ConstraintAnchor constraintAnchor2 = this.R.f;
            if(constraintAnchor2 != null && constraintAnchor2.o()) {
                ConstraintAnchor constraintAnchor3 = this.T.f;
                return constraintAnchor3 != null && constraintAnchor3.o() && this.T.f.f() - this.T.g() - (this.R.f.f() + this.R.g()) >= v1;
            }
        }
        return false;
    }

    public void u1(int v, int v1) {
        if(this.q) {
            return;
        }
        this.R.A(v);
        this.T.A(v1);
        this.i0 = v;
        this.e0 = v1 - v;
        if(this.L) {
            this.U.A(v + this.n0);
        }
        this.q = true;
    }

    public int v() {
        return this.p0() + this.e0;
    }

    public void v0(Type constraintAnchor$Type0, ConstraintWidget constraintWidget0, Type constraintAnchor$Type1, int v, int v1) {
        this.r(constraintAnchor$Type0).b(constraintWidget0.r(constraintAnchor$Type1), v, v1, true);
    }

    public void v1(int v, int v1, int v2) {
        if(v2 == 0) {
            this.D1(v, v1);
            return;
        }
        if(v2 == 1) {
            this.Y1(v, v1);
        }
    }

    public Object w() {
        return this.s0;
    }

    public boolean w0() {
        return this.v0;
    }

    public void w1(int v, int v1, int v2, int v3) {
        int v4 = v2 - v;
        int v5 = v3 - v1;
        this.h0 = v;
        this.i0 = v1;
        if(this.u0 == 8) {
            this.d0 = 0;
            this.e0 = 0;
            return;
        }
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.b0;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.a;
        if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
            int v6 = this.d0;
            if(v4 < v6) {
                v4 = v6;
            }
        }
        if(arr_constraintWidget$DimensionBehaviour[1] == constraintWidget$DimensionBehaviour1) {
            int v7 = this.e0;
            if(v5 < v7) {
                v5 = v7;
            }
        }
        this.d0 = v4;
        this.e0 = v5;
        int v8 = this.p0;
        if(v5 < v8) {
            this.e0 = v8;
        }
        int v9 = this.o0;
        if(v4 < v9) {
            this.d0 = v9;
        }
        int v10 = this.A;
        if(v10 > 0 && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c) {
            this.d0 = Math.min(this.d0, v10);
        }
        int v11 = this.D;
        if(v11 > 0 && this.b0[1] == DimensionBehaviour.c) {
            this.e0 = Math.min(this.e0, v11);
        }
        int v12 = this.d0;
        if(v4 != v12) {
            this.l = v12;
        }
        int v13 = this.e0;
        if(v5 != v13) {
            this.m = v13;
        }
    }

    public int x() {
        return this.t0;
    }

    private boolean x0(int v) {
        ConstraintAnchor[] arr_constraintAnchor = this.Y;
        ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[v * 2];
        if(constraintAnchor0.f != null && constraintAnchor0.f.f != constraintAnchor0) {
            ConstraintAnchor constraintAnchor1 = arr_constraintAnchor[v * 2 + 1];
            return constraintAnchor1.f != null && constraintAnchor1.f.f == constraintAnchor1;
        }
        return false;
    }

    public void x1(Type constraintAnchor$Type0, int v) {
        switch(constraintAnchor$Type0) {
            case 1: {
                this.Q.h = v;
                return;
            }
            case 2: {
                this.R.h = v;
                return;
            }
            case 3: {
                this.S.h = v;
                return;
            }
            case 4: {
                this.T.h = v;
                return;
            }
            case 5: {
                this.U.h = v;
            }
        }
    }

    public String y() {
        return this.w0;
    }

    public boolean y0() {
        return this.G;
    }

    public void y1(boolean z) {
        this.L = z;
    }

    public DimensionBehaviour z(int v) {
        if(v == 0) {
            return this.H();
        }
        return v == 1 ? this.j0() : null;
    }

    public boolean z0() {
        return this.r;
    }

    public void z1(int v) {
        this.e0 = v;
        int v1 = this.p0;
        if(v < v1) {
            this.e0 = v1;
        }
    }
}

