package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

public class Guideline extends ConstraintWidget {
    protected float B1;
    protected int C1;
    protected int D1;
    protected boolean E1;
    private ConstraintAnchor F1;
    private int G1;
    private int H1;
    private boolean I1;
    public static final int J1 = 0;
    public static final int K1 = 1;
    public static final int L1 = 0;
    public static final int M1 = 1;
    public static final int N1 = 2;
    public static final int O1 = -1;

    public Guideline() {
        this.B1 = -1.0f;
        this.C1 = -1;
        this.D1 = -1;
        this.E1 = true;
        this.F1 = this.R;
        this.G1 = 0;
        this.H1 = 0;
        this.Z.clear();
        this.Z.add(this.F1);
        for(int v = 0; v < this.Y.length; ++v) {
            this.Y[v] = this.F1;
        }
    }

    public void A2(float f) {
        if(f > -1.0f) {
            this.B1 = f;
            this.C1 = -1;
            this.D1 = -1;
        }
    }

    public void B2(int v) {
        this.A2(((float)v) / 100.0f);
    }

    public void C2(int v) {
        this.H1 = v;
    }

    public void D2(int v) {
        if(this.G1 == v) {
            return;
        }
        this.G1 = v;
        this.Z.clear();
        this.F1 = this.G1 == 1 ? this.Q : this.R;
        this.Z.add(this.F1);
        for(int v1 = 0; v1 < this.Y.length; ++v1) {
            this.Y[v1] = this.F1;
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.I1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.I1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String f0() {
        return "Guideline";
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(LinearSystem linearSystem0, boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)this.U();
        if(constraintWidgetContainer0 == null) {
            return;
        }
        ConstraintAnchor constraintAnchor0 = constraintWidgetContainer0.r(Type.b);
        ConstraintAnchor constraintAnchor1 = constraintWidgetContainer0.r(Type.d);
        int v = 1;
        int v1 = this.c0 == null || this.c0.b0[0] != DimensionBehaviour.b ? 0 : 1;
        if(this.G1 == 0) {
            constraintAnchor0 = constraintWidgetContainer0.r(Type.c);
            constraintAnchor1 = constraintWidgetContainer0.r(Type.e);
            if(this.c0 == null || this.c0.b0[1] != DimensionBehaviour.b) {
                v = 0;
            }
            v1 = v;
        }
        if(this.I1 && this.F1.o()) {
            SolverVariable solverVariable0 = linearSystem0.s(this.F1);
            linearSystem0.f(solverVariable0, this.F1.f());
            if(this.C1 == -1) {
                if(this.D1 != -1 && v1 != 0) {
                    SolverVariable solverVariable1 = linearSystem0.s(constraintAnchor1);
                    linearSystem0.h(solverVariable0, linearSystem0.s(constraintAnchor0), 0, 5);
                    linearSystem0.h(solverVariable1, solverVariable0, 0, 5);
                }
            }
            else if(v1 != 0) {
                linearSystem0.h(linearSystem0.s(constraintAnchor1), solverVariable0, 0, 5);
            }
            this.I1 = false;
            return;
        }
        if(this.C1 != -1) {
            SolverVariable solverVariable2 = linearSystem0.s(this.F1);
            linearSystem0.e(solverVariable2, linearSystem0.s(constraintAnchor0), this.C1, 8);
            if(v1 != 0) {
                linearSystem0.h(linearSystem0.s(constraintAnchor1), solverVariable2, 0, 5);
            }
        }
        else if(this.D1 != -1) {
            SolverVariable solverVariable3 = linearSystem0.s(this.F1);
            SolverVariable solverVariable4 = linearSystem0.s(constraintAnchor1);
            linearSystem0.e(solverVariable3, solverVariable4, -this.D1, 8);
            if(v1 != 0) {
                linearSystem0.h(solverVariable3, linearSystem0.s(constraintAnchor0), 0, 5);
                linearSystem0.h(solverVariable4, solverVariable3, 0, 5);
            }
        }
        else if(this.B1 != -1.0f) {
            linearSystem0.d(LinearSystem.u(linearSystem0, linearSystem0.s(this.F1), linearSystem0.s(constraintAnchor1), this.B1));
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k2(LinearSystem linearSystem0, boolean z) {
        if(this.U() == null) {
            return;
        }
        int v = linearSystem0.M(this.F1);
        if(this.G1 == 1) {
            this.g2(v);
            this.h2(0);
            this.z1(this.U().D());
            this.d2(0);
            return;
        }
        this.g2(0);
        this.h2(v);
        this.d2(this.U().m0());
        this.z1(0);
    }

    public void l2() {
        if(this.C1 != -1) {
            this.v2();
            return;
        }
        if(this.B1 != -1.0f) {
            this.u2();
            return;
        }
        if(this.D1 != -1) {
            this.t2();
        }
    }

    public ConstraintAnchor m2() {
        return this.F1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.n(constraintWidget0, hashMap0);
        this.B1 = ((Guideline)constraintWidget0).B1;
        this.C1 = ((Guideline)constraintWidget0).C1;
        this.D1 = ((Guideline)constraintWidget0).D1;
        this.E1 = ((Guideline)constraintWidget0).E1;
        this.D2(((Guideline)constraintWidget0).G1);
    }

    public int n2() {
        return this.H1;
    }

    public int o2() {
        return this.G1;
    }

    public int p2() {
        return this.C1;
    }

    public int q2() {
        if(this.B1 != -1.0f) {
            return 0;
        }
        if(this.C1 != -1) {
            return 1;
        }
        return this.D1 == -1 ? -1 : 2;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public ConstraintAnchor r(Type constraintAnchor$Type0) {
        switch(constraintAnchor$Type0) {
            case 1: 
            case 2: {
                return this.G1 == 1 ? this.F1 : null;
            }
            case 3: 
            case 4: {
                return this.G1 == 0 ? this.F1 : null;
            }
            default: {
                return null;
            }
        }
    }

    public int r2() {
        return this.D1;
    }

    public float s2() {
        return this.B1;
    }

    void t2() {
        int v = this.o0();
        if(this.G1 == 0) {
            v = this.p0();
        }
        this.y2(v);
    }

    void u2() {
        int v = this.U().m0() - this.o0();
        if(this.G1 == 0) {
            v = this.U().D() - this.p0();
        }
        this.z2(v);
    }

    void v2() {
        float f = ((float)this.o0()) / ((float)this.U().m0());
        if(this.G1 == 0) {
            f = ((float)this.p0()) / ((float)this.U().D());
        }
        this.A2(f);
    }

    public boolean w2() {
        return this.B1 != -1.0f && this.C1 == -1 && this.D1 == -1;
    }

    public void x2(int v) {
        this.F1.A(v);
        this.I1 = true;
    }

    public void y2(int v) {
        if(v > -1) {
            this.B1 = -1.0f;
            this.C1 = v;
            this.D1 = -1;
        }
    }

    public void z2(int v) {
        if(v > -1) {
            this.B1 = -1.0f;
            this.C1 = -1;
            this.D1 = v;
        }
    }
}

