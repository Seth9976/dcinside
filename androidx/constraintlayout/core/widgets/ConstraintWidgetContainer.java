package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.core.widgets.analyzer.DependencyGraph;
import androidx.constraintlayout.core.widgets.analyzer.Direct;
import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ConstraintWidgetContainer extends WidgetContainer {
    BasicMeasure C1;
    public DependencyGraph D1;
    private int E1;
    protected Measurer F1;
    private boolean G1;
    public Metrics H1;
    protected LinearSystem I1;
    int J1;
    int K1;
    int L1;
    int M1;
    public int N1;
    public int O1;
    ChainHead[] P1;
    ChainHead[] Q1;
    public boolean R1;
    public boolean S1;
    public boolean T1;
    public int U1;
    public int V1;
    private int W1;
    public boolean X1;
    private boolean Y1;
    private boolean Z1;
    int a2;
    private WeakReference b2;
    private WeakReference c2;
    private WeakReference d2;
    private WeakReference e2;
    HashSet f2;
    public Measure g2;
    private static final int h2 = 8;
    private static final boolean i2 = false;
    private static final boolean j2 = false;
    static final boolean k2 = false;
    static int l2;

    static {
    }

    public ConstraintWidgetContainer() {
        this.C1 = new BasicMeasure(this);
        this.D1 = new DependencyGraph(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new LinearSystem();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new ChainHead[4];
        this.Q1 = new ChainHead[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0x101;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet();
        this.g2 = new Measure();
    }

    public ConstraintWidgetContainer(int v, int v1) {
        super(v, v1);
        this.C1 = new BasicMeasure(this);
        this.D1 = new DependencyGraph(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new LinearSystem();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new ChainHead[4];
        this.Q1 = new ChainHead[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0x101;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet();
        this.g2 = new Measure();
    }

    public ConstraintWidgetContainer(int v, int v1, int v2, int v3) {
        super(v, v1, v2, v3);
        this.C1 = new BasicMeasure(this);
        this.D1 = new DependencyGraph(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new LinearSystem();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new ChainHead[4];
        this.Q1 = new ChainHead[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0x101;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet();
        this.g2 = new Measure();
    }

    public ConstraintWidgetContainer(String s, int v, int v1) {
        super(v, v1);
        this.C1 = new BasicMeasure(this);
        this.D1 = new DependencyGraph(this);
        this.F1 = null;
        this.G1 = false;
        this.I1 = new LinearSystem();
        this.N1 = 0;
        this.O1 = 0;
        this.P1 = new ChainHead[4];
        this.Q1 = new ChainHead[4];
        this.R1 = false;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0;
        this.V1 = 0;
        this.W1 = 0x101;
        this.X1 = false;
        this.Y1 = false;
        this.Z1 = false;
        this.a2 = 0;
        this.b2 = null;
        this.c2 = null;
        this.d2 = null;
        this.e2 = null;
        this.f2 = new HashSet();
        this.g2 = new Measure();
        this.k1(s);
    }

    void A2(ConstraintAnchor constraintAnchor0) {
        if(this.b2 == null || this.b2.get() == null || constraintAnchor0.f() > ((ConstraintAnchor)this.b2.get()).f()) {
            this.b2 = new WeakReference(constraintAnchor0);
        }
    }

    public void B2() {
        this.D1.f(this.H(), this.j0());
    }

    public boolean C2(boolean z) {
        return this.D1.g(z);
    }

    public boolean D2(boolean z) {
        return this.D1.h(z);
    }

    public boolean E2(boolean z, int v) {
        return this.D1.i(z, v);
    }

    public void F2(Metrics metrics0) {
        this.H1 = metrics0;
        this.I1.D(metrics0);
    }

    public ArrayList G2() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.B1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v1);
            if(constraintWidget0 instanceof Guideline && ((Guideline)constraintWidget0).o2() == 0) {
                arrayList0.add(((Guideline)constraintWidget0));
            }
        }
        return arrayList0;
    }

    public Measurer H2() {
        return this.F1;
    }

    public int I2() {
        return this.W1;
    }

    public LinearSystem J2() {
        return this.I1;
    }

    public ArrayList K2() {
        ArrayList arrayList0 = new ArrayList();
        int v = this.B1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v1);
            if(constraintWidget0 instanceof Guideline && ((Guideline)constraintWidget0).o2() == 1) {
                arrayList0.add(((Guideline)constraintWidget0));
            }
        }
        return arrayList0;
    }

    public boolean L2() [...] // 潜在的解密器

    public void M2() {
        this.D1.o();
    }

    public void N2() {
        this.D1.p();
    }

    public boolean O2() {
        return this.Z1;
    }

    public boolean P2() {
        return this.G1;
    }

    public boolean Q2() {
        return this.Y1;
    }

    @Override  // androidx.constraintlayout.core.widgets.WidgetContainer
    public void R0() {
        this.I1.W();
        this.J1 = 0;
        this.L1 = 0;
        this.K1 = 0;
        this.M1 = 0;
        this.X1 = false;
        super.R0();
    }

    public long R2(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        this.J1 = v7;
        this.K1 = v8;
        return this.C1.d(this, v, v7, v8, v1, v2, v3, v4, v5, v6);
    }

    public static boolean S2(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, Measure basicMeasure$Measure0, int v1) {
        int v3;
        int v2;
        if(basicMeasure$Measurer0 == null) {
            return false;
        }
        if(constraintWidget0.l0() != 8 && !(constraintWidget0 instanceof Guideline) && !(constraintWidget0 instanceof Barrier)) {
            basicMeasure$Measure0.a = constraintWidget0.H();
            basicMeasure$Measure0.b = constraintWidget0.j0();
            basicMeasure$Measure0.c = constraintWidget0.m0();
            basicMeasure$Measure0.d = constraintWidget0.D();
            basicMeasure$Measure0.i = false;
            basicMeasure$Measure0.j = v1;
            boolean z = basicMeasure$Measure0.a == DimensionBehaviour.c;
            boolean z1 = basicMeasure$Measure0.b == DimensionBehaviour.c;
            boolean z2 = z && constraintWidget0.f0 > 0.0f;
            boolean z3 = z1 && constraintWidget0.f0 > 0.0f;
            if(z && constraintWidget0.r0(0) && constraintWidget0.w == 0 && !z2) {
                basicMeasure$Measure0.a = DimensionBehaviour.b;
                if(z1 && constraintWidget0.x == 0) {
                    basicMeasure$Measure0.a = DimensionBehaviour.a;
                }
                z = false;
            }
            if(z1 && constraintWidget0.r0(1) && constraintWidget0.x == 0 && !z3) {
                basicMeasure$Measure0.b = DimensionBehaviour.b;
                if(z && constraintWidget0.w == 0) {
                    basicMeasure$Measure0.b = DimensionBehaviour.a;
                }
                z1 = false;
            }
            if(constraintWidget0.G0()) {
                basicMeasure$Measure0.a = DimensionBehaviour.a;
                z = false;
            }
            if(constraintWidget0.H0()) {
                basicMeasure$Measure0.b = DimensionBehaviour.a;
                z1 = false;
            }
            if(z2) {
                if(constraintWidget0.y[0] == 4) {
                    basicMeasure$Measure0.a = DimensionBehaviour.a;
                }
                else if(!z1) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.a;
                    if(basicMeasure$Measure0.b == constraintWidget$DimensionBehaviour0) {
                        v2 = basicMeasure$Measure0.d;
                    }
                    else {
                        basicMeasure$Measure0.a = DimensionBehaviour.b;
                        basicMeasure$Measurer0.b(constraintWidget0, basicMeasure$Measure0);
                        v2 = basicMeasure$Measure0.f;
                    }
                    basicMeasure$Measure0.a = constraintWidget$DimensionBehaviour0;
                    basicMeasure$Measure0.c = (int)(constraintWidget0.A() * ((float)v2));
                }
            }
            if(z3) {
                if(constraintWidget0.y[1] == 4) {
                    basicMeasure$Measure0.b = DimensionBehaviour.a;
                }
                else if(!z) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.a;
                    if(basicMeasure$Measure0.a == constraintWidget$DimensionBehaviour1) {
                        v3 = basicMeasure$Measure0.c;
                    }
                    else {
                        basicMeasure$Measure0.b = DimensionBehaviour.b;
                        basicMeasure$Measurer0.b(constraintWidget0, basicMeasure$Measure0);
                        v3 = basicMeasure$Measure0.e;
                    }
                    basicMeasure$Measure0.b = constraintWidget$DimensionBehaviour1;
                    basicMeasure$Measure0.d = constraintWidget0.B() == -1 ? ((int)(((float)v3) / constraintWidget0.A())) : ((int)(constraintWidget0.A() * ((float)v3)));
                }
            }
            basicMeasure$Measurer0.b(constraintWidget0, basicMeasure$Measure0);
            constraintWidget0.d2(basicMeasure$Measure0.e);
            constraintWidget0.z1(basicMeasure$Measure0.f);
            constraintWidget0.y1(basicMeasure$Measure0.h);
            constraintWidget0.h1(basicMeasure$Measure0.g);
            basicMeasure$Measure0.j = Measure.k;
            return basicMeasure$Measure0.i;
        }
        basicMeasure$Measure0.e = 0;
        basicMeasure$Measure0.f = 0;
        return false;
    }

    public boolean T2(int v) {
        return (this.W1 & v) == v;
    }

    private void U2() {
        this.N1 = 0;
        this.O1 = 0;
    }

    public void V2(Measurer basicMeasure$Measurer0) {
        this.F1 = basicMeasure$Measurer0;
        this.D1.u(basicMeasure$Measurer0);
    }

    public void W2(int v) {
        this.W1 = v;
        LinearSystem.w = this.T2(0x200);
    }

    public void X2(int v, int v1, int v2, int v3) {
        this.J1 = v;
        this.K1 = v1;
        this.L1 = v2;
        this.M1 = v3;
    }

    public void Y2(int v) {
        this.E1 = v;
    }

    public void Z2(boolean z) {
        this.G1 = z;
    }

    public boolean a3(LinearSystem linearSystem0, boolean[] arr_z) {
        arr_z[2] = false;
        boolean z = this.T2(0x40);
        this.k2(linearSystem0, z);
        int v1 = this.B1.size();
        boolean z1 = false;
        for(int v = 0; v < v1; ++v) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v);
            constraintWidget0.k2(linearSystem0, z);
            if(constraintWidget0.t0()) {
                z1 = true;
            }
        }
        return z1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void b0(StringBuilder stringBuilder0) {
        stringBuilder0.append(this.o + ":{\n");
        stringBuilder0.append("  actualWidth:" + this.d0);
        stringBuilder0.append("\n");
        stringBuilder0.append("  actualHeight:" + this.e0);
        stringBuilder0.append("\n");
        for(Object object0: this.m2()) {
            ((ConstraintWidget)object0).b0(stringBuilder0);
            stringBuilder0.append(",\n");
        }
        stringBuilder0.append("}");
    }

    public void b3() {
        this.C1.e(this);
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "ConstraintLayout";
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void j2(boolean z, boolean z1) {
        super.j2(z, z1);
        int v = this.B1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintWidget)this.B1.get(v1)).j2(z, z1);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.WidgetContainer
    public void o2() {
        boolean z6;
        int v19;
        boolean z5;
        boolean z4;
        int v6;
        int v5;
        int v4;
        this.h0 = 0;
        this.i0 = 0;
        this.Y1 = false;
        this.Z1 = false;
        int v = this.B1.size();
        int v1 = Math.max(0, this.m0());
        int v2 = Math.max(0, this.D());
        DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = this.b0;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[1];
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[0];
        Metrics metrics0 = this.H1;
        if(metrics0 != null) {
            ++metrics0.K;
        }
        if(this.E1 == 0 && Optimizer.b(this.W1, 1)) {
            Direct.j(this, this.H2());
            for(int v3 = 0; v3 < v; ++v3) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v3);
                if(constraintWidget0.F0() && !(constraintWidget0 instanceof Guideline) && !(constraintWidget0 instanceof Barrier) && !(constraintWidget0 instanceof VirtualLayout) && !constraintWidget0.E0()) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget0.z(0);
                    DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidget0.z(1);
                    if(constraintWidget$DimensionBehaviour2 != DimensionBehaviour.c || constraintWidget0.w == 1 || constraintWidget$DimensionBehaviour3 != DimensionBehaviour.c || constraintWidget0.x == 1) {
                        Measure basicMeasure$Measure0 = new Measure();
                        ConstraintWidgetContainer.S2(0, constraintWidget0, this.F1, basicMeasure$Measure0, Measure.k);
                    }
                }
            }
        }
        if(v > 2) {
            DimensionBehaviour constraintWidget$DimensionBehaviour4 = DimensionBehaviour.b;
            if((constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4 || constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) && Optimizer.b(this.W1, 0x400) && Grouping.c(this, this.H2())) {
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4) {
                    if(v1 >= this.m0() || v1 <= 0) {
                        v1 = this.m0();
                    }
                    else {
                        this.d2(v1);
                        this.Y1 = true;
                    }
                }
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) {
                    if(v2 >= this.D() || v2 <= 0) {
                        v2 = this.D();
                    }
                    else {
                        this.z1(v2);
                        this.Z1 = true;
                    }
                }
                v4 = v2;
                v5 = v1;
                v6 = 1;
                goto label_48;
            }
            goto label_45;
        }
        else {
        label_45:
            v4 = v2;
            v5 = v1;
            v6 = 0;
        }
    label_48:
        boolean z = this.T2(0x40) || this.T2(0x80);
        LinearSystem linearSystem0 = this.I1;
        linearSystem0.i = false;
        linearSystem0.j = false;
        if(this.W1 != 0 && z) {
            linearSystem0.j = true;
        }
        ArrayList arrayList0 = this.B1;
        boolean z1 = this.H() == DimensionBehaviour.b || this.j0() == DimensionBehaviour.b;
        this.U2();
        for(int v7 = 0; v7 < v; ++v7) {
            ConstraintWidget constraintWidget1 = (ConstraintWidget)this.B1.get(v7);
            if(constraintWidget1 instanceof WidgetContainer) {
                ((WidgetContainer)constraintWidget1).o2();
            }
        }
        boolean z2 = this.T2(0x40);
        int v8 = v6;
        boolean z3 = true;
        for(int v9 = 0; z3; ++v9) {
            try {
                this.I1.W();
                this.U2();
                this.o(this.I1);
                for(int v10 = 0; v10 < v; ++v10) {
                    ((ConstraintWidget)this.B1.get(v10)).o(this.I1);
                }
                z3 = this.s2(this.I1);
                if(this.b2 != null && this.b2.get() != null) {
                    this.x2(((ConstraintAnchor)this.b2.get()), this.I1.s(this.R));
                    this.b2 = null;
                }
                if(this.d2 != null && this.d2.get() != null) {
                    this.w2(((ConstraintAnchor)this.d2.get()), this.I1.s(this.T));
                    this.d2 = null;
                }
                if(this.c2 != null && this.c2.get() != null) {
                    this.x2(((ConstraintAnchor)this.c2.get()), this.I1.s(this.Q));
                    this.c2 = null;
                }
                if(this.e2 != null && this.e2.get() != null) {
                    this.w2(((ConstraintAnchor)this.e2.get()), this.I1.s(this.S));
                    this.e2 = null;
                }
                if(z3) {
                    this.I1.R();
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
                System.out.println("EXCEPTION : " + exception0);
            }
            if(z3) {
                z4 = this.a3(this.I1, Optimizer.n);
            }
            else {
                this.k2(this.I1, z2);
                for(int v11 = 0; v11 < v; ++v11) {
                    ((ConstraintWidget)this.B1.get(v11)).k2(this.I1, z2);
                }
                z4 = false;
            }
            if(!z1 || v9 + 1 >= 8 || !Optimizer.n[2]) {
                z5 = z4;
            }
            else {
                int v13 = 0;
                int v14 = 0;
                for(int v12 = 0; v12 < v; ++v12) {
                    ConstraintWidget constraintWidget2 = (ConstraintWidget)this.B1.get(v12);
                    v14 = Math.max(v14, constraintWidget2.h0 + constraintWidget2.m0());
                    v13 = Math.max(v13, constraintWidget2.i0 + constraintWidget2.D());
                }
                z5 = z4;
                int v15 = Math.max(this.o0, v14);
                int v16 = Math.max(this.p0, v13);
                DimensionBehaviour constraintWidget$DimensionBehaviour5 = DimensionBehaviour.b;
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour5 && this.m0() < v15) {
                    this.d2(v15);
                    this.b0[0] = constraintWidget$DimensionBehaviour5;
                    v8 = 1;
                    z5 = true;
                }
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour5 && this.D() < v16) {
                    this.z1(v16);
                    this.b0[1] = constraintWidget$DimensionBehaviour5;
                    v8 = 1;
                    z5 = true;
                }
            }
            int v17 = Math.max(this.o0, this.m0());
            if(v17 > this.m0()) {
                this.d2(v17);
                this.b0[0] = DimensionBehaviour.a;
                v8 = 1;
                z5 = true;
            }
            int v18 = Math.max(this.p0, this.D());
            if(v18 > this.D()) {
                this.z1(v18);
                this.b0[1] = DimensionBehaviour.a;
                v19 = 1;
                z5 = true;
            }
            else {
                v19 = v8;
            }
            if(v19 == 0) {
                DimensionBehaviour constraintWidget$DimensionBehaviour6 = DimensionBehaviour.b;
                if(this.b0[0] == constraintWidget$DimensionBehaviour6 && v5 > 0 && this.m0() > v5) {
                    this.Y1 = true;
                    this.b0[0] = DimensionBehaviour.a;
                    this.d2(v5);
                    v19 = 1;
                    z5 = true;
                }
                if(this.b0[1] == constraintWidget$DimensionBehaviour6 && v4 > 0 && this.D() > v4) {
                    this.Z1 = true;
                    this.b0[1] = DimensionBehaviour.a;
                    this.z1(v4);
                    z6 = true;
                    v8 = 1;
                }
            }
            else {
                v8 = v19;
                z6 = z5;
            }
            z3 = v9 + 1 <= 8 ? z6 : false;
        }
        this.B1 = arrayList0;
        if(v8 != 0) {
            DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour1 = this.b0;
            arr_constraintWidget$DimensionBehaviour1[0] = constraintWidget$DimensionBehaviour1;
            arr_constraintWidget$DimensionBehaviour1[1] = constraintWidget$DimensionBehaviour0;
        }
        this.W0(this.I1.E());
    }

    void r2(ConstraintWidget constraintWidget0, int v) {
        if(v == 0) {
            this.t2(constraintWidget0);
            return;
        }
        if(v == 1) {
            this.y2(constraintWidget0);
        }
    }

    public boolean s2(LinearSystem linearSystem0) {
        boolean z = this.T2(0x40);
        this.g(linearSystem0, z);
        int v = this.B1.size();
        boolean z1 = false;
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v1);
            constraintWidget0.H1(0, false);
            constraintWidget0.H1(1, false);
            if(constraintWidget0 instanceof Barrier) {
                z1 = true;
            }
        }
        if(z1) {
            for(int v2 = 0; v2 < v; ++v2) {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)this.B1.get(v2);
                if(constraintWidget1 instanceof Barrier) {
                    ((Barrier)constraintWidget1).t2();
                }
            }
        }
        this.f2.clear();
        for(int v3 = 0; v3 < v; ++v3) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget)this.B1.get(v3);
        }
        while(this.f2.size() > 0) {
            int v4 = this.f2.size();
            for(Object object0: this.f2) {
                VirtualLayout virtualLayout0 = (VirtualLayout)(((ConstraintWidget)object0));
                if(virtualLayout0.p2(this.f2)) {
                    virtualLayout0.g(linearSystem0, z);
                    this.f2.remove(virtualLayout0);
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v4 == this.f2.size()) {
                for(Object object1: this.f2) {
                    ((ConstraintWidget)object1).g(linearSystem0, z);
                }
                this.f2.clear();
            }
        }
        if(LinearSystem.w) {
            HashSet hashSet0 = new HashSet();
            for(int v5 = 0; v5 < v; ++v5) {
                hashSet0.add(((ConstraintWidget)this.B1.get(v5)));
            }
            this.e(this, linearSystem0, hashSet0, (this.H() == DimensionBehaviour.b ? 0 : 1), false);
            for(Object object2: hashSet0) {
                Optimizer.a(this, linearSystem0, ((ConstraintWidget)object2));
                ((ConstraintWidget)object2).g(linearSystem0, z);
            }
        }
        else {
            for(int v6 = 0; v6 < v; ++v6) {
                ConstraintWidget constraintWidget3 = (ConstraintWidget)this.B1.get(v6);
                if(constraintWidget3 instanceof ConstraintWidgetContainer) {
                    DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget3.b0;
                    DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.b;
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget3.E1(DimensionBehaviour.a);
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget3.Z1(DimensionBehaviour.a);
                    }
                    constraintWidget3.g(linearSystem0, z);
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget3.E1(constraintWidget$DimensionBehaviour0);
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget3.Z1(constraintWidget$DimensionBehaviour1);
                    }
                }
                else {
                    Optimizer.a(this, linearSystem0, constraintWidget3);
                    constraintWidget3.g(linearSystem0, z);
                }
            }
        }
        if(this.N1 > 0) {
            Chain.b(this, linearSystem0, null, 0);
        }
        if(this.O1 > 0) {
            Chain.b(this, linearSystem0, null, 1);
        }
        return true;
    }

    private void t2(ConstraintWidget constraintWidget0) {
        ChainHead[] arr_chainHead = this.Q1;
        if(this.N1 + 1 >= arr_chainHead.length) {
            this.Q1 = (ChainHead[])Arrays.copyOf(arr_chainHead, arr_chainHead.length * 2);
        }
        ChainHead[] arr_chainHead1 = this.Q1;
        int v = this.N1;
        arr_chainHead1[v] = new ChainHead(constraintWidget0, 0, this.P2());
        ++this.N1;
    }

    public void u2(ConstraintAnchor constraintAnchor0) {
        if(this.e2 == null || this.e2.get() == null || constraintAnchor0.f() > ((ConstraintAnchor)this.e2.get()).f()) {
            this.e2 = new WeakReference(constraintAnchor0);
        }
    }

    public void v2(ConstraintAnchor constraintAnchor0) {
        if(this.c2 == null || this.c2.get() == null || constraintAnchor0.f() > ((ConstraintAnchor)this.c2.get()).f()) {
            this.c2 = new WeakReference(constraintAnchor0);
        }
    }

    private void w2(ConstraintAnchor constraintAnchor0, SolverVariable solverVariable0) {
        SolverVariable solverVariable1 = this.I1.s(constraintAnchor0);
        this.I1.h(solverVariable0, solverVariable1, 0, 5);
    }

    private void x2(ConstraintAnchor constraintAnchor0, SolverVariable solverVariable0) {
        SolverVariable solverVariable1 = this.I1.s(constraintAnchor0);
        this.I1.h(solverVariable1, solverVariable0, 0, 5);
    }

    private void y2(ConstraintWidget constraintWidget0) {
        ChainHead[] arr_chainHead = this.P1;
        if(this.O1 + 1 >= arr_chainHead.length) {
            this.P1 = (ChainHead[])Arrays.copyOf(arr_chainHead, arr_chainHead.length * 2);
        }
        ChainHead[] arr_chainHead1 = this.P1;
        int v = this.O1;
        arr_chainHead1[v] = new ChainHead(constraintWidget0, 1, this.P2());
        ++this.O1;
    }

    void z2(ConstraintAnchor constraintAnchor0) {
        if(this.d2 == null || this.d2.get() == null || constraintAnchor0.f() > ((ConstraintAnchor)this.d2.get()).f()) {
            this.d2 = new WeakReference(constraintAnchor0);
        }
    }
}

