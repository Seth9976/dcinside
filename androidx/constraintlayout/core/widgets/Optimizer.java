package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;

public class Optimizer {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 0x20;
    public static final int h = 0x40;
    public static final int i = 0x80;
    public static final int j = 0x100;
    public static final int k = 0x200;
    public static final int l = 0x400;
    public static final int m = 0x101;
    static boolean[] n = null;
    static final int o = 0;
    static final int p = 1;
    static final int q = 2;

    static {
        Optimizer.n = new boolean[3];
    }

    static void a(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, ConstraintWidget constraintWidget0) {
        constraintWidget0.t = -1;
        constraintWidget0.u = -1;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.b;
        if(constraintWidgetContainer0.b0[0] != constraintWidget$DimensionBehaviour0 && constraintWidget0.b0[0] == DimensionBehaviour.d) {
            int v = constraintWidget0.Q.g;
            int v1 = constraintWidgetContainer0.m0() - constraintWidget0.S.g;
            ConstraintAnchor constraintAnchor0 = constraintWidget0.Q;
            constraintAnchor0.i = linearSystem0.s(constraintAnchor0);
            ConstraintAnchor constraintAnchor1 = constraintWidget0.S;
            constraintAnchor1.i = linearSystem0.s(constraintAnchor1);
            linearSystem0.f(constraintWidget0.Q.i, v);
            linearSystem0.f(constraintWidget0.S.i, v1);
            constraintWidget0.t = 2;
            constraintWidget0.D1(v, v1);
        }
        if(constraintWidgetContainer0.b0[1] != constraintWidget$DimensionBehaviour0 && constraintWidget0.b0[1] == DimensionBehaviour.d) {
            int v2 = constraintWidget0.R.g;
            int v3 = constraintWidgetContainer0.D() - constraintWidget0.T.g;
            ConstraintAnchor constraintAnchor2 = constraintWidget0.R;
            constraintAnchor2.i = linearSystem0.s(constraintAnchor2);
            ConstraintAnchor constraintAnchor3 = constraintWidget0.T;
            constraintAnchor3.i = linearSystem0.s(constraintAnchor3);
            linearSystem0.f(constraintWidget0.R.i, v2);
            linearSystem0.f(constraintWidget0.T.i, v3);
            if(constraintWidget0.n0 > 0 || constraintWidget0.l0() == 8) {
                ConstraintAnchor constraintAnchor4 = constraintWidget0.U;
                constraintAnchor4.i = linearSystem0.s(constraintAnchor4);
                linearSystem0.f(constraintWidget0.U.i, constraintWidget0.n0 + v2);
            }
            constraintWidget0.u = 2;
            constraintWidget0.Y1(v2, v3);
        }
    }

    public static final boolean b(int v, int v1) {
        return (v & v1) == v1;
    }
}

