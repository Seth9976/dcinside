package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measure;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.HashSet;

public class VirtualLayout extends HelperWidget {
    private int D1;
    private int E1;
    private int F1;
    private int G1;
    private int H1;
    private int I1;
    private int J1;
    private int K1;
    private boolean L1;
    private int M1;
    private int N1;
    protected Measure O1;
    Measurer P1;

    public VirtualLayout() {
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = 0;
        this.G1 = 0;
        this.H1 = 0;
        this.I1 = 0;
        this.J1 = 0;
        this.K1 = 0;
        this.L1 = false;
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = new Measure();
        this.P1 = null;
    }

    protected void A2(boolean z) {
        this.L1 = z;
    }

    public void B2(int v, int v1) {
        this.M1 = v;
        this.N1 = v1;
    }

    public void C2(int v) {
        this.F1 = v;
        this.D1 = v;
        this.G1 = v;
        this.E1 = v;
        this.H1 = v;
        this.I1 = v;
    }

    public void D2(int v) {
        this.E1 = v;
    }

    public void E2(int v) {
        this.I1 = v;
    }

    public void F2(int v) {
        this.F1 = v;
        this.J1 = v;
    }

    public void G2(int v) {
        this.G1 = v;
        this.K1 = v;
    }

    public void H2(int v) {
        this.H1 = v;
        this.J1 = v;
        this.K1 = v;
    }

    public void I2(int v) {
        this.D1 = v;
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void c(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.o2();
    }

    public void n2(boolean z) {
        int v = this.H1;
        if(v > 0 || this.I1 > 0) {
            if(z) {
                this.J1 = this.I1;
                this.K1 = v;
                return;
            }
            this.J1 = v;
            this.K1 = this.I1;
        }
    }

    public void o2() {
        for(int v = 0; v < this.C1; ++v) {
            ConstraintWidget constraintWidget0 = this.B1[v];
            if(constraintWidget0 != null) {
                constraintWidget0.J1(true);
            }
        }
    }

    public boolean p2(HashSet hashSet0) {
        for(int v = 0; v < this.C1; ++v) {
            if(hashSet0.contains(this.B1[v])) {
                return true;
            }
        }
        return false;
    }

    public int q2() {
        return this.N1;
    }

    public int r2() {
        return this.M1;
    }

    public int s2() {
        return this.E1;
    }

    public int t2() {
        return this.J1;
    }

    public int u2() {
        return this.K1;
    }

    public int v2() {
        return this.D1;
    }

    public void w2(int v, int v1, int v2, int v3) {
    }

    protected void x2(ConstraintWidget constraintWidget0, DimensionBehaviour constraintWidget$DimensionBehaviour0, int v, DimensionBehaviour constraintWidget$DimensionBehaviour1, int v1) {
        while(this.P1 == null && this.U() != null) {
            this.P1 = ((ConstraintWidgetContainer)this.U()).H2();
        }
        this.O1.a = constraintWidget$DimensionBehaviour0;
        this.O1.b = constraintWidget$DimensionBehaviour1;
        this.O1.c = v;
        this.O1.d = v1;
        this.P1.b(constraintWidget0, this.O1);
        constraintWidget0.d2(this.O1.e);
        constraintWidget0.z1(this.O1.f);
        constraintWidget0.y1(this.O1.h);
        constraintWidget0.h1(this.O1.g);
    }

    protected boolean y2() {
        Measurer basicMeasure$Measurer0 = this.c0 == null ? null : ((ConstraintWidgetContainer)this.c0).H2();
        if(basicMeasure$Measurer0 == null) {
            return false;
        }
        for(int v = 0; v < this.C1; ++v) {
            ConstraintWidget constraintWidget0 = this.B1[v];
            if(constraintWidget0 != null && !(constraintWidget0 instanceof Guideline)) {
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.z(0);
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.z(1);
                DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.c;
                if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour2 || constraintWidget0.w == 1 || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour2 || constraintWidget0.x == 1) {
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget$DimensionBehaviour0 = DimensionBehaviour.b;
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        constraintWidget$DimensionBehaviour1 = DimensionBehaviour.b;
                    }
                    this.O1.a = constraintWidget$DimensionBehaviour0;
                    this.O1.b = constraintWidget$DimensionBehaviour1;
                    this.O1.c = constraintWidget0.m0();
                    this.O1.d = constraintWidget0.D();
                    basicMeasure$Measurer0.b(constraintWidget0, this.O1);
                    constraintWidget0.d2(this.O1.e);
                    constraintWidget0.z1(this.O1.f);
                    constraintWidget0.h1(this.O1.g);
                }
            }
        }
        return true;
    }

    public boolean z2() {
        return this.L1;
    }
}

