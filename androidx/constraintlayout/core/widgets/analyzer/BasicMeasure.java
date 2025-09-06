package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.Optimizer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import java.util.ArrayList;

public class BasicMeasure {
    public static class Measure {
        public DimensionBehaviour a;
        public DimensionBehaviour b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public int j;
        public static int k = 0;
        public static int l = 1;
        public static int m = 2;

        static {
        }
    }

    public interface Measurer {
        void a();

        void b(ConstraintWidget arg1, Measure arg2);
    }

    private final ArrayList a;
    private Measure b;
    private ConstraintWidgetContainer c;
    private static final boolean d = false;
    private static final boolean e = false;
    private static final int f = 30;
    public static final int g = 0;
    public static final int h = 0x40000000;
    public static final int i = 0x80000000;
    public static final int j = -1;
    public static final int k = -2;
    public static final int l = -3;

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.a = new ArrayList();
        this.b = new Measure();
        this.c = constraintWidgetContainer0;
    }

    private boolean a(Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget0, int v) {
        this.b.a = constraintWidget0.H();
        this.b.b = constraintWidget0.j0();
        this.b.c = constraintWidget0.m0();
        this.b.d = constraintWidget0.D();
        Measure basicMeasure$Measure0 = this.b;
        basicMeasure$Measure0.i = false;
        basicMeasure$Measure0.j = v;
        boolean z = basicMeasure$Measure0.b == DimensionBehaviour.c && constraintWidget0.f0 > 0.0f;
        if(basicMeasure$Measure0.a == DimensionBehaviour.c && constraintWidget0.f0 > 0.0f && constraintWidget0.y[0] == 4) {
            basicMeasure$Measure0.a = DimensionBehaviour.a;
        }
        if(z && constraintWidget0.y[1] == 4) {
            basicMeasure$Measure0.b = DimensionBehaviour.a;
        }
        basicMeasure$Measurer0.b(constraintWidget0, basicMeasure$Measure0);
        constraintWidget0.d2(this.b.e);
        constraintWidget0.z1(this.b.f);
        constraintWidget0.y1(this.b.h);
        constraintWidget0.h1(this.b.g);
        this.b.j = Measure.k;
        return this.b.i;
    }

    private void b(ConstraintWidgetContainer constraintWidgetContainer0) {
        int v = constraintWidgetContainer0.B1.size();
        boolean z = constraintWidgetContainer0.T2(0x40);
        Measurer basicMeasure$Measurer0 = constraintWidgetContainer0.H2();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.B1.get(v1);
            if(!(constraintWidget0 instanceof Guideline) && !(constraintWidget0 instanceof Barrier) && !constraintWidget0.E0() && (!z || (constraintWidget0.e == null || (constraintWidget0.f == null || !constraintWidget0.e.e.j || !constraintWidget0.f.e.j)))) {
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.z(0);
                int v2 = 1;
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.z(1);
                DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.c;
                int v3 = constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 || constraintWidget0.w == 1 || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 || constraintWidget0.x == 1 ? 0 : 1;
                if(v3 != 0 || !constraintWidgetContainer0.T2(1) || constraintWidget0 instanceof VirtualLayout) {
                    v2 = v3;
                }
                else {
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && constraintWidget0.w == 0 && constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 && !constraintWidget0.B0()) {
                        v3 = 1;
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 && constraintWidget0.x == 0 && constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 && !constraintWidget0.B0()) {
                        v3 = 1;
                    }
                    if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 && constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 || constraintWidget0.f0 <= 0.0f) {
                        v2 = v3;
                    }
                }
                if(v2 == 0) {
                    this.a(basicMeasure$Measurer0, constraintWidget0, Measure.k);
                    Metrics metrics0 = constraintWidgetContainer0.H1;
                    if(metrics0 != null) {
                        ++metrics0.c;
                    }
                }
            }
        }
        basicMeasure$Measurer0.a();
    }

    private void c(ConstraintWidgetContainer constraintWidgetContainer0, String s, int v, int v1, int v2) {
        long v3 = constraintWidgetContainer0.H1 == null ? 0L : System.nanoTime();
        constraintWidgetContainer0.Q1(0);
        constraintWidgetContainer0.P1(0);
        constraintWidgetContainer0.d2(v1);
        constraintWidgetContainer0.z1(v2);
        constraintWidgetContainer0.Q1(constraintWidgetContainer0.Q());
        constraintWidgetContainer0.P1(constraintWidgetContainer0.P());
        this.c.Y2(v);
        this.c.o2();
        if(constraintWidgetContainer0.H1 != null) {
            ++constraintWidgetContainer0.H1.R;
            constraintWidgetContainer0.H1.b += System.nanoTime() - v3;
        }
    }

    public long d(ConstraintWidgetContainer constraintWidgetContainer0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8) {
        int v42;
        int v34;
        int v41;
        long v31;
        int v24;
        int v30;
        int v17;
        boolean z2;
        Measurer basicMeasure$Measurer0 = constraintWidgetContainer0.H2();
        int v9 = constraintWidgetContainer0.B1.size();
        int v10 = constraintWidgetContainer0.m0();
        int v11 = constraintWidgetContainer0.D();
        boolean z = Optimizer.b(v, 0x80);
        int v12 = z || Optimizer.b(v, 0x40) ? 1 : 0;
        if(v12 != 0) {
            int v13 = 0;
            while(v13 < v9) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.B1.get(v13);
                boolean z1 = constraintWidget0.H() == DimensionBehaviour.c && constraintWidget0.j0() == DimensionBehaviour.c && constraintWidget0.A() > 0.0f;
                if((!constraintWidget0.B0() || !z1) && ((!constraintWidget0.D0() || !z1) && !(constraintWidget0 instanceof VirtualLayout) && !constraintWidget0.B0() && !constraintWidget0.D0())) {
                    ++v13;
                }
                else {
                    v12 = 0;
                    if(true) {
                        break;
                    }
                }
            }
        }
        if(v12 != 0) {
            Metrics metrics0 = LinearSystem.C;
            if(metrics0 != null) {
                ++metrics0.e;
            }
        }
        int v14 = v12 & ((v3 != 0x40000000 || v5 != 0x40000000) && !z ? 0 : 1);
        if(v14 == 0) {
            z2 = false;
            v17 = 0;
        }
        else {
            int v15 = Math.min(constraintWidgetContainer0.O(), v4);
            int v16 = Math.min(constraintWidgetContainer0.N(), v6);
            if(v3 == 0x40000000 && constraintWidgetContainer0.m0() != v15) {
                constraintWidgetContainer0.d2(v15);
                constraintWidgetContainer0.M2();
            }
            if(v5 == 0x40000000 && constraintWidgetContainer0.D() != v16) {
                constraintWidgetContainer0.z1(v16);
                constraintWidgetContainer0.M2();
            }
            if(v3 != 0x40000000 || v5 != 0x40000000) {
                boolean z3 = constraintWidgetContainer0.D2(z);
                if(v3 == 0x40000000) {
                    z3 &= constraintWidgetContainer0.E2(z, 0);
                    v17 = 1;
                }
                else {
                    v17 = 0;
                }
                if(v5 == 0x40000000) {
                    z2 = constraintWidgetContainer0.E2(z, 1) & z3;
                    ++v17;
                }
                else {
                    z2 = z3;
                }
            }
            else {
                z2 = constraintWidgetContainer0.C2(z);
                v17 = 2;
            }
            if(z2) {
                constraintWidgetContainer0.j2(v3 == 0x40000000, v5 == 0x40000000);
            }
        }
        long v18 = 0L;
        if(!z2 || v17 != 2) {
            int v19 = constraintWidgetContainer0.I2();
            if(v9 > 0) {
                this.b(constraintWidgetContainer0);
            }
            if(constraintWidgetContainer0.H1 != null) {
                v18 = System.nanoTime();
            }
            this.e(constraintWidgetContainer0);
            int v20 = this.a.size();
            if(v9 > 0) {
                this.c(constraintWidgetContainer0, "First pass", 0, v10, v11);
            }
            if(v20 > 0) {
                boolean z4 = constraintWidgetContainer0.H() == DimensionBehaviour.b;
                boolean z5 = constraintWidgetContainer0.j0() == DimensionBehaviour.b;
                int v21 = Math.max(constraintWidgetContainer0.m0(), this.c.Q());
                int v22 = Math.max(constraintWidgetContainer0.D(), this.c.P());
                int v23 = 0;
                boolean z6 = false;
                while(v23 < v20) {
                    ConstraintWidget constraintWidget1 = (ConstraintWidget)this.a.get(v23);
                    if(constraintWidget1 instanceof VirtualLayout) {
                        int v25 = constraintWidget1.m0();
                        int v26 = constraintWidget1.D();
                        v24 = v19;
                        int v27 = z6 | this.a(basicMeasure$Measurer0, constraintWidget1, Measure.l);
                        Metrics metrics1 = constraintWidgetContainer0.H1;
                        if(metrics1 != null) {
                            ++metrics1.d;
                        }
                        int v28 = constraintWidget1.m0();
                        int v29 = constraintWidget1.D();
                        if(v28 == v25) {
                            v30 = v27;
                        }
                        else {
                            constraintWidget1.d2(v28);
                            if(z4 && constraintWidget1.X() > v21) {
                                v21 = Math.max(v21, constraintWidget1.X() + constraintWidget1.r(Type.d).g());
                            }
                            v30 = 1;
                        }
                        if(v29 != v26) {
                            constraintWidget1.z1(v29);
                            if(z5 && constraintWidget1.v() > v22) {
                                v22 = Math.max(v22, constraintWidget1.v() + constraintWidget1.r(Type.e).g());
                            }
                            v30 = 1;
                        }
                        z6 = v30 | ((VirtualLayout)constraintWidget1).z2();
                    }
                    else {
                        v24 = v19;
                    }
                    ++v23;
                    v19 = v24;
                }
                v31 = v18;
                int v32 = 0;
                while(v32 < 2) {
                    int v33 = 0;
                    while(v33 < v20) {
                        ConstraintWidget constraintWidget2 = (ConstraintWidget)this.a.get(v33);
                        if((!(constraintWidget2 instanceof Helper) || constraintWidget2 instanceof VirtualLayout) && !(constraintWidget2 instanceof Guideline) && constraintWidget2.l0() != 8 && (v14 == 0 || !constraintWidget2.e.e.j || !constraintWidget2.f.e.j) && !(constraintWidget2 instanceof VirtualLayout)) {
                            int v35 = constraintWidget2.m0();
                            int v36 = constraintWidget2.D();
                            int v37 = constraintWidget2.t();
                            boolean z7 = this.a(basicMeasure$Measurer0, constraintWidget2, (v32 == 1 ? Measure.m : Measure.l));
                            Metrics metrics2 = constraintWidgetContainer0.H1;
                            v34 = v14;
                            int v38 = z6 | z7;
                            if(metrics2 != null) {
                                ++metrics2.d;
                            }
                            int v39 = constraintWidget2.m0();
                            int v40 = constraintWidget2.D();
                            if(v39 == v35) {
                                v41 = v38;
                            }
                            else {
                                constraintWidget2.d2(v39);
                                if(z4 && constraintWidget2.X() > v21) {
                                    v21 = Math.max(v21, constraintWidget2.X() + constraintWidget2.r(Type.d).g());
                                }
                                v41 = 1;
                            }
                            if(v40 != v36) {
                                constraintWidget2.z1(v40);
                                if(z5 && constraintWidget2.v() > v22) {
                                    v22 = Math.max(v22, constraintWidget2.v() + constraintWidget2.r(Type.e).g());
                                }
                                v41 = 1;
                            }
                            z6 = !constraintWidget2.q0() || v37 == constraintWidget2.t() ? v41 : true;
                        }
                        else {
                            v34 = v14;
                        }
                        ++v33;
                        v14 = v34;
                    }
                    if(z6) {
                        ++v32;
                        this.c(constraintWidgetContainer0, "intermediate pass", v32, v10, v11);
                        z6 = false;
                        continue;
                    }
                    else {
                        v42 = v19;
                    }
                    constraintWidgetContainer0.W2(v42);
                    v18 = v31;
                    return constraintWidgetContainer0.H1 == null ? v18 : System.nanoTime() - v18;
                }
            }
            else {
                v31 = v18;
            }
            v42 = v19;
            constraintWidgetContainer0.W2(v42);
            v18 = v31;
        }
        return constraintWidgetContainer0.H1 == null ? v18 : System.nanoTime() - v18;
    }

    public void e(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.a.clear();
        int v = constraintWidgetContainer0.B1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.B1.get(v1);
            if(constraintWidget0.H() == DimensionBehaviour.c || constraintWidget0.j0() == DimensionBehaviour.c) {
                this.a.add(constraintWidget0);
            }
        }
        constraintWidgetContainer0.M2();
    }
}

