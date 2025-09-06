package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.HashMap;

public class Barrier extends HelperWidget {
    private int D1;
    private boolean E1;
    private int F1;
    boolean G1;
    public static final int H1 = 0;
    public static final int I1 = 1;
    public static final int J1 = 2;
    public static final int K1 = 3;
    private static final boolean L1 = true;
    private static final boolean M1 = false;

    public Barrier() {
        this.D1 = 0;
        this.E1 = true;
        this.F1 = 0;
        this.G1 = false;
    }

    public Barrier(String s) {
        this.D1 = 0;
        this.E1 = true;
        this.F1 = 0;
        this.G1 = false;
        this.k1(s);
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean G0() {
        return this.G1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean H0() {
        return this.G1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void g(LinearSystem linearSystem0, boolean z) {
        boolean z1;
        ConstraintAnchor[] arr_constraintAnchor1;
        ConstraintAnchor[] arr_constraintAnchor = this.Y;
        arr_constraintAnchor[0] = this.Q;
        arr_constraintAnchor[2] = this.R;
        arr_constraintAnchor[1] = this.S;
        arr_constraintAnchor[3] = this.T;
        for(int v = 0; true; ++v) {
            arr_constraintAnchor1 = this.Y;
            if(v >= arr_constraintAnchor1.length) {
                break;
            }
            ConstraintAnchor constraintAnchor0 = arr_constraintAnchor1[v];
            constraintAnchor0.i = linearSystem0.s(constraintAnchor0);
        }
        int v1 = this.D1;
        if(v1 >= 0 && v1 < 4) {
            ConstraintAnchor constraintAnchor1 = arr_constraintAnchor1[v1];
            if(!this.G1) {
                this.n2();
            }
            if(this.G1) {
                this.G1 = false;
                int v2 = this.D1;
                if(v2 == 0 || v2 == 1) {
                    linearSystem0.f(this.Q.i, this.h0);
                    linearSystem0.f(this.S.i, this.h0);
                }
                else if(v2 == 2 || v2 == 3) {
                    linearSystem0.f(this.R.i, this.i0);
                    linearSystem0.f(this.T.i, this.i0);
                    return;
                }
                return;
            }
            for(int v3 = 0; true; ++v3) {
                z1 = false;
                if(v3 >= this.C1) {
                    break;
                }
                ConstraintWidget constraintWidget0 = this.B1[v3];
                if((this.E1 || constraintWidget0.h()) && ((this.D1 == 0 || this.D1 == 1) && constraintWidget0.H() == DimensionBehaviour.c && constraintWidget0.Q.f != null && constraintWidget0.S.f != null || (this.D1 == 2 || this.D1 == 3) && constraintWidget0.j0() == DimensionBehaviour.c && constraintWidget0.R.f != null && constraintWidget0.T.f != null)) {
                    z1 = true;
                    break;
                }
            }
            boolean z2 = this.Q.m() || this.S.m();
            boolean z3 = this.R.m() || this.T.m();
            int v4 = z1 || (this.D1 != 0 || !z2) && (this.D1 != 2 || !z3) && (this.D1 != 1 || !z2) && (this.D1 != 3 || !z3) ? 4 : 5;
            for(int v5 = 0; v5 < this.C1; ++v5) {
                ConstraintWidget constraintWidget1 = this.B1[v5];
                if(this.E1 || constraintWidget1.h()) {
                    SolverVariable solverVariable0 = linearSystem0.s(constraintWidget1.Y[this.D1]);
                    int v6 = this.D1;
                    ConstraintAnchor constraintAnchor2 = constraintWidget1.Y[v6];
                    constraintAnchor2.i = solverVariable0;
                    int v7 = constraintAnchor2.f == null || constraintAnchor2.f.d != this ? 0 : constraintAnchor2.g;
                    if(v6 == 0 || v6 == 2) {
                        linearSystem0.i(constraintAnchor1.i, solverVariable0, this.F1 - v7, z1);
                    }
                    else {
                        linearSystem0.g(constraintAnchor1.i, solverVariable0, this.F1 + v7, z1);
                    }
                    linearSystem0.e(constraintAnchor1.i, solverVariable0, this.F1 + v7, v4);
                }
            }
            int v8 = this.D1;
            if(v8 == 0) {
                linearSystem0.e(this.S.i, this.Q.i, 0, 8);
                linearSystem0.e(this.Q.i, this.c0.S.i, 0, 4);
                linearSystem0.e(this.Q.i, this.c0.Q.i, 0, 0);
                return;
            }
            if(v8 == 1) {
                linearSystem0.e(this.Q.i, this.S.i, 0, 8);
                linearSystem0.e(this.Q.i, this.c0.Q.i, 0, 4);
                linearSystem0.e(this.Q.i, this.c0.S.i, 0, 0);
                return;
            }
            if(v8 == 2) {
                linearSystem0.e(this.T.i, this.R.i, 0, 8);
                linearSystem0.e(this.R.i, this.c0.T.i, 0, 4);
                linearSystem0.e(this.R.i, this.c0.R.i, 0, 0);
                return;
            }
            if(v8 == 3) {
                linearSystem0.e(this.R.i, this.T.i, 0, 8);
                linearSystem0.e(this.R.i, this.c0.R.i, 0, 4);
                linearSystem0.e(this.R.i, this.c0.T.i, 0, 0);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean h() {
        return true;
    }

    @Override  // androidx.constraintlayout.core.widgets.HelperWidget
    public void n(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.n(constraintWidget0, hashMap0);
        this.D1 = ((Barrier)constraintWidget0).D1;
        this.E1 = ((Barrier)constraintWidget0).E1;
        this.F1 = ((Barrier)constraintWidget0).F1;
    }

    public boolean n2() {
        boolean z = true;
        for(int v1 = 0; true; ++v1) {
            int v2 = this.C1;
            if(v1 >= v2) {
                break;
            }
            ConstraintWidget constraintWidget0 = this.B1[v1];
            if(this.E1 || constraintWidget0.h()) {
                if((this.D1 == 0 || this.D1 == 1) && !constraintWidget0.G0()) {
                    z = false;
                }
                else if((this.D1 == 2 || this.D1 == 3) && !constraintWidget0.H0()) {
                    z = false;
                }
            }
        }
        if(z && v2 > 0) {
            int v3 = 0;
            boolean z1 = false;
            for(int v = 0; v < this.C1; ++v) {
                ConstraintWidget constraintWidget1 = this.B1[v];
                if(this.E1 || constraintWidget1.h()) {
                    if(!z1) {
                        int v4 = this.D1;
                        if(v4 == 0) {
                            v3 = constraintWidget1.r(Type.b).f();
                        }
                        else if(v4 == 1) {
                            v3 = constraintWidget1.r(Type.d).f();
                        }
                        else if(v4 == 2) {
                            v3 = constraintWidget1.r(Type.c).f();
                        }
                        else if(v4 == 3) {
                            v3 = constraintWidget1.r(Type.e).f();
                        }
                        z1 = true;
                    }
                    int v5 = this.D1;
                    if(v5 == 0) {
                        v3 = Math.min(v3, constraintWidget1.r(Type.b).f());
                    }
                    else if(v5 == 1) {
                        v3 = Math.max(v3, constraintWidget1.r(Type.d).f());
                    }
                    else if(v5 == 2) {
                        v3 = Math.min(v3, constraintWidget1.r(Type.c).f());
                    }
                    else if(v5 == 3) {
                        v3 = Math.max(v3, constraintWidget1.r(Type.e).f());
                    }
                }
            }
            int v6 = v3 + this.F1;
            if(this.D1 == 0 || this.D1 == 1) {
                this.r1(v6, v6);
            }
            else {
                this.u1(v6, v6);
            }
            this.G1 = true;
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean o2() {
        return this.E1;
    }

    public boolean p2() {
        return this.E1;
    }

    public int q2() {
        return this.D1;
    }

    public int r2() {
        return this.F1;
    }

    public int s2() {
        switch(this.D1) {
            case 0: 
            case 1: {
                return 0;
            }
            case 2: 
            case 3: {
                return 1;
            }
            default: {
                return -1;
            }
        }
    }

    protected void t2() {
        for(int v = 0; v < this.C1; ++v) {
            ConstraintWidget constraintWidget0 = this.B1[v];
            if(this.E1 || constraintWidget0.h()) {
                int v1 = this.D1;
                if(v1 == 0 || v1 == 1) {
                    constraintWidget0.H1(0, true);
                }
                else if(v1 == 2 || v1 == 3) {
                    constraintWidget0.H1(1, true);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        String s = "[Barrier] " + this.y() + " {";
        for(int v = 0; v < this.C1; ++v) {
            ConstraintWidget constraintWidget0 = this.B1[v];
            if(v > 0) {
                s = s + ", ";
            }
            s = s + constraintWidget0.y();
        }
        return s + "}";
    }

    public void u2(boolean z) {
        this.E1 = z;
    }

    public void v2(int v) {
        this.D1 = v;
    }

    public void w2(int v) {
        this.F1 = v;
    }
}

