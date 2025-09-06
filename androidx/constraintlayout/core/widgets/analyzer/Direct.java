package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ChainHead;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import java.util.ArrayList;

public class Direct {
    private static final boolean a = false;
    private static final boolean b = false;
    private static Measure c = null;
    private static final boolean d = true;
    private static int e;
    private static int f;

    static {
        Direct.c = new Measure();
        Direct.e = 0;
        Direct.f = 0;
    }

    private static boolean a(int v, ConstraintWidget constraintWidget0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.H();
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidget0.j0();
        if(constraintWidget0.U() != null) {
            ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)constraintWidget0.U();
        }
        boolean z = constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a || constraintWidget0.G0() || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b || (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c && constraintWidget0.w == 0 && constraintWidget0.f0 == 0.0f && constraintWidget0.r0(0) || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c && constraintWidget0.w == 1 && constraintWidget0.u0(0, constraintWidget0.m0()));
        boolean z1 = constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a || constraintWidget0.H0() || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b || (constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c && constraintWidget0.x == 0 && constraintWidget0.f0 == 0.0f && constraintWidget0.r0(1) || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c && constraintWidget0.x == 1 && constraintWidget0.u0(1, constraintWidget0.D()));
        return constraintWidget0.f0 <= 0.0f || !z && !z1 ? z && z1 : true;
    }

    private static void b(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, boolean z) {
        boolean z4;
        boolean z2;
        if(constraintWidget0.z0()) {
            return;
        }
        ++Direct.e;
        if(!(constraintWidget0 instanceof ConstraintWidgetContainer) && constraintWidget0.F0() && Direct.a(v + 1, constraintWidget0)) {
            ConstraintWidgetContainer.S2(v + 1, constraintWidget0, basicMeasure$Measurer0, new Measure(), Measure.k);
        }
        ConstraintAnchor constraintAnchor0 = constraintWidget0.r(Type.b);
        ConstraintAnchor constraintAnchor1 = constraintWidget0.r(Type.d);
        int v1 = constraintAnchor0.f();
        int v2 = constraintAnchor1.f();
        if(constraintAnchor0.e() != null && constraintAnchor0.o()) {
            for(Object object0: constraintAnchor0.e()) {
                ConstraintAnchor constraintAnchor2 = (ConstraintAnchor)object0;
                ConstraintWidget constraintWidget1 = constraintAnchor2.d;
                boolean z1 = Direct.a(v + 1, constraintWidget1);
                if(constraintWidget1.F0() && z1) {
                    ConstraintWidgetContainer.S2(v + 1, constraintWidget1, basicMeasure$Measurer0, new Measure(), Measure.k);
                }
                if(constraintAnchor2 == constraintWidget1.Q) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget1.S.f;
                    if(constraintAnchor3 != null && constraintAnchor3.o()) {
                        z2 = true;
                    }
                }
                else {
                    if(constraintAnchor2 == constraintWidget1.S) {
                        ConstraintAnchor constraintAnchor4 = constraintWidget1.Q.f;
                        if(constraintAnchor4 != null && constraintAnchor4.o()) {
                            z2 = true;
                            goto label_29;
                        }
                    }
                    z2 = false;
                }
            label_29:
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.c;
                if(constraintWidget1.H() == constraintWidget$DimensionBehaviour0 && !z1) {
                    if(constraintWidget1.H() != constraintWidget$DimensionBehaviour0 || constraintWidget1.A < 0 || constraintWidget1.z < 0 || constraintWidget1.l0() != 8 && (constraintWidget1.w != 0 || constraintWidget1.A() != 0.0f) || constraintWidget1.B0() || constraintWidget1.E0() || !z2 || constraintWidget1.B0()) {
                        continue;
                    }
                    Direct.g(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget1, z);
                }
                else if(!constraintWidget1.F0()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget1.Q;
                    if(constraintAnchor2 == constraintAnchor5 && constraintWidget1.S.f == null) {
                        int v3 = constraintAnchor5.g();
                        constraintWidget1.r1(v3 + v1, constraintWidget1.m0() + (v3 + v1));
                        Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
                    }
                    else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget1.S;
                        if(constraintAnchor2 == constraintAnchor6 && constraintAnchor5.f == null) {
                            int v4 = constraintAnchor6.g();
                            constraintWidget1.r1(v1 - v4 - constraintWidget1.m0(), v1 - v4);
                            Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
                        }
                        else if(z2 && !constraintWidget1.B0()) {
                            Direct.f(v + 1, basicMeasure$Measurer0, constraintWidget1, z);
                        }
                    }
                }
            }
        }
        if(constraintWidget0 instanceof Guideline) {
            return;
        }
        if(constraintAnchor1.e() != null && constraintAnchor1.o()) {
            for(Object object1: constraintAnchor1.e()) {
                ConstraintAnchor constraintAnchor7 = (ConstraintAnchor)object1;
                ConstraintWidget constraintWidget2 = constraintAnchor7.d;
                boolean z3 = Direct.a(v + 1, constraintWidget2);
                if(constraintWidget2.F0() && z3) {
                    ConstraintWidgetContainer.S2(v + 1, constraintWidget2, basicMeasure$Measurer0, new Measure(), Measure.k);
                }
                if(constraintAnchor7 == constraintWidget2.Q) {
                    ConstraintAnchor constraintAnchor8 = constraintWidget2.S.f;
                    if(constraintAnchor8 != null && constraintAnchor8.o()) {
                        z4 = true;
                    }
                }
                else {
                    if(constraintAnchor7 == constraintWidget2.S) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget2.Q.f;
                        if(constraintAnchor9 != null && constraintAnchor9.o()) {
                            z4 = true;
                            goto label_72;
                        }
                    }
                    z4 = false;
                }
            label_72:
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.c;
                if(constraintWidget2.H() == constraintWidget$DimensionBehaviour1 && !z3) {
                    if(constraintWidget2.H() != constraintWidget$DimensionBehaviour1 || constraintWidget2.A < 0 || constraintWidget2.z < 0 || constraintWidget2.l0() != 8 && (constraintWidget2.w != 0 || constraintWidget2.A() != 0.0f) || constraintWidget2.B0() || constraintWidget2.E0() || !z4 || constraintWidget2.B0()) {
                        continue;
                    }
                    Direct.g(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget2, z);
                }
                else if(!constraintWidget2.F0()) {
                    ConstraintAnchor constraintAnchor10 = constraintWidget2.Q;
                    if(constraintAnchor7 == constraintAnchor10 && constraintWidget2.S.f == null) {
                        int v5 = constraintAnchor10.g();
                        constraintWidget2.r1(v5 + v2, constraintWidget2.m0() + (v5 + v2));
                        Direct.b(v + 1, constraintWidget2, basicMeasure$Measurer0, z);
                    }
                    else {
                        ConstraintAnchor constraintAnchor11 = constraintWidget2.S;
                        if(constraintAnchor7 == constraintAnchor11 && constraintAnchor10.f == null) {
                            int v6 = constraintAnchor11.g();
                            constraintWidget2.r1(v2 - v6 - constraintWidget2.m0(), v2 - v6);
                            Direct.b(v + 1, constraintWidget2, basicMeasure$Measurer0, z);
                        }
                        else if(z4 && !constraintWidget2.B0()) {
                            Direct.f(v + 1, basicMeasure$Measurer0, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        constraintWidget0.N0();
    }

    public static String c(int v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v1 = 0; v1 < v; ++v1) {
            stringBuilder0.append("  ");
        }
        stringBuilder0.append("+-(" + v + ") ");
        return stringBuilder0.toString();
    }

    private static void d(int v, Barrier barrier0, Measurer basicMeasure$Measurer0, int v1, boolean z) {
        if(barrier0.n2()) {
            if(v1 == 0) {
                Direct.b(v + 1, barrier0, basicMeasure$Measurer0, z);
                return;
            }
            Direct.k(v + 1, barrier0, basicMeasure$Measurer0);
        }
    }

    // This method was un-flattened
    public static boolean e(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, int v, int v1, ChainHead chainHead0, boolean z, boolean z1, boolean z2) {
        ConstraintWidget constraintWidget8;
        int v12;
        if(z2) {
            return false;
        }
        if(v == 0) {
            if(!constraintWidgetContainer0.G0()) {
                return false;
            }
        }
        else if(!constraintWidgetContainer0.H0()) {
            return false;
        }
        boolean z3 = constraintWidgetContainer0.P2();
        ConstraintWidget constraintWidget0 = chainHead0.c();
        ConstraintWidget constraintWidget1 = chainHead0.e();
        ConstraintWidget constraintWidget2 = chainHead0.i();
        ConstraintWidget constraintWidget3 = chainHead0.f();
        ConstraintAnchor constraintAnchor0 = constraintWidget0.Y[v1];
        ConstraintAnchor constraintAnchor1 = chainHead0.g().Y[v1 + 1];
        if(constraintAnchor0.f != null && constraintAnchor1.f != null && constraintAnchor0.f.o() && constraintAnchor1.f.o() && constraintWidget1 != null && constraintWidget2 != null) {
            int v2 = constraintAnchor0.f.f() + constraintWidget1.Y[v1].g();
            int v3 = constraintAnchor1.f.f() - constraintWidget2.Y[v1 + 1].g();
            int v4 = v3 - v2;
            if(v4 <= 0) {
                return false;
            }
            Measure basicMeasure$Measure0 = new Measure();
            ConstraintWidget constraintWidget4 = constraintWidget0;
            int v5 = 0;
            int v6 = 0;
            int v7 = 0;
            for(ConstraintWidget constraintWidget5 = null; true; constraintWidget5 = null) {
                if(!Direct.a(1, constraintWidget4)) {
                    return false;
                }
                if(constraintWidget4.b0[v] == DimensionBehaviour.c) {
                    return false;
                }
                if(constraintWidget4.F0()) {
                    ConstraintWidgetContainer.S2(1, constraintWidget4, constraintWidgetContainer0.H2(), basicMeasure$Measure0, Measure.k);
                }
                v7 = v7 + constraintWidget4.Y[v1].g() + (v == 0 ? constraintWidget4.m0() : constraintWidget4.D()) + constraintWidget4.Y[v1 + 1].g();
                ++v6;
                if(constraintWidget4.l0() != 8) {
                    ++v5;
                }
                ConstraintAnchor constraintAnchor2 = constraintWidget4.Y[v1 + 1].f;
                if(constraintAnchor2 != null) {
                    ConstraintWidget constraintWidget6 = constraintAnchor2.d;
                    ConstraintAnchor constraintAnchor3 = constraintWidget6.Y[v1].f;
                    if(constraintAnchor3 != null && constraintAnchor3.d == constraintWidget4) {
                        constraintWidget5 = constraintWidget6;
                    }
                }
                if(constraintWidget5 == null) {
                    break;
                }
                constraintWidget4 = constraintWidget5;
            }
            if(v5 == 0) {
                return false;
            }
            if(v5 != v6) {
                return false;
            }
            if(v4 < v7) {
                return false;
            }
            int v8 = v4 - v7;
            if(z) {
                v8 /= v5 + 1;
            }
            else if(z1 && v5 > 2) {
                v8 = v8 / v5 - 1;
            }
            if(v5 == 1) {
                int v9 = (int)(((float)v2) + 0.5f + ((float)v8) * (v == 0 ? constraintWidget3.E() : constraintWidget3.g0()));
                if(v == 0) {
                    constraintWidget1.r1(v9, constraintWidget1.m0() + v9);
                }
                else {
                    constraintWidget1.u1(v9, constraintWidget1.D() + v9);
                }
                Direct.b(1, constraintWidget1, constraintWidgetContainer0.H2(), z3);
                return true;
            }
            if(z) {
                int v10 = v2 + v8;
                ConstraintWidget constraintWidget7 = constraintWidget0;
                boolean z4 = false;
                while(!z4) {
                    if(constraintWidget7.l0() != 8) {
                        int v11 = v10 + constraintWidget7.Y[v1].g();
                        if(v == 0) {
                            constraintWidget7.r1(v11, constraintWidget7.m0() + v11);
                            Direct.b(1, constraintWidget7, constraintWidgetContainer0.H2(), z3);
                            v12 = constraintWidget7.m0();
                        }
                        else {
                            constraintWidget7.u1(v11, constraintWidget7.D() + v11);
                            Direct.k(1, constraintWidget7, constraintWidgetContainer0.H2());
                            v12 = constraintWidget7.D();
                        }
                        v10 = v11 + v12 + constraintWidget7.Y[v1 + 1].g() + v8;
                    }
                    else if(v == 0) {
                        constraintWidget7.r1(v10, v10);
                        Direct.b(1, constraintWidget7, constraintWidgetContainer0.H2(), z3);
                    }
                    else {
                        constraintWidget7.u1(v10, v10);
                        Direct.k(1, constraintWidget7, constraintWidgetContainer0.H2());
                    }
                    constraintWidget7.g(linearSystem0, false);
                    ConstraintAnchor constraintAnchor4 = constraintWidget7.Y[v1 + 1].f;
                    if(constraintAnchor4 == null) {
                        constraintWidget8 = null;
                    }
                    else {
                        constraintWidget8 = constraintAnchor4.d;
                        ConstraintAnchor constraintAnchor5 = constraintWidget8.Y[v1].f;
                        if(constraintAnchor5 == null || constraintAnchor5.d != constraintWidget7) {
                            constraintWidget8 = null;
                        }
                    }
                    if(constraintWidget8 == null) {
                        z4 = true;
                    }
                    else {
                        constraintWidget7 = constraintWidget8;
                    }
                }
                return true;
            }
            if(z1) {
                if(v5 == 2) {
                    if(v == 0) {
                        constraintWidget1.r1(v2, constraintWidget1.m0() + v2);
                        constraintWidget2.r1(v3 - constraintWidget2.m0(), v3);
                        Direct.b(1, constraintWidget1, constraintWidgetContainer0.H2(), z3);
                        Direct.b(1, constraintWidget2, constraintWidgetContainer0.H2(), z3);
                        return true;
                    }
                    constraintWidget1.u1(v2, constraintWidget1.D() + v2);
                    constraintWidget2.u1(v3 - constraintWidget2.D(), v3);
                    Direct.k(1, constraintWidget1, constraintWidgetContainer0.H2());
                    Direct.k(1, constraintWidget2, constraintWidgetContainer0.H2());
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    private static void f(int v, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget0, boolean z) {
        float f = constraintWidget0.E();
        int v1 = constraintWidget0.Q.f.f();
        int v2 = constraintWidget0.S.f.f();
        int v3 = constraintWidget0.Q.g();
        int v4 = constraintWidget0.S.g();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = constraintWidget0.m0();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        int v7 = ((int)(v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f)) + v1;
        constraintWidget0.r1(v7, (v1 <= v2 ? v7 + v5 : v7 - v5));
        Direct.b(v + 1, constraintWidget0, basicMeasure$Measurer0, z);
    }

    private static void g(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget1, boolean z) {
        float f = constraintWidget1.E();
        int v1 = constraintWidget1.Q.f.f() + constraintWidget1.Q.g();
        int v2 = constraintWidget1.S.f.f() - constraintWidget1.S.g();
        if(v2 >= v1) {
            int v3 = constraintWidget1.m0();
            if(constraintWidget1.l0() != 8) {
                int v4 = constraintWidget1.w;
                if(v4 == 2) {
                    v3 = (int)(constraintWidget1.E() * 0.5f * ((float)(constraintWidget0 instanceof ConstraintWidgetContainer ? constraintWidget0.m0() : constraintWidget0.U().m0())));
                }
                else if(v4 == 0) {
                    v3 = v2 - v1;
                }
                v3 = Math.max(constraintWidget1.z, v3);
                int v5 = constraintWidget1.A;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
            int v6 = v1 + ((int)(f * ((float)(v2 - v1 - v3)) + 0.5f));
            constraintWidget1.r1(v6, v3 + v6);
            Direct.b(v + 1, constraintWidget1, basicMeasure$Measurer0, z);
        }
    }

    private static void h(int v, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget0) {
        float f = constraintWidget0.g0();
        int v1 = constraintWidget0.R.f.f();
        int v2 = constraintWidget0.T.f.f();
        int v3 = constraintWidget0.R.g();
        int v4 = constraintWidget0.T.g();
        if(v1 == v2) {
            f = 0.5f;
        }
        else {
            v1 = v3 + v1;
            v2 -= v4;
        }
        int v5 = constraintWidget0.D();
        int v6 = v1 <= v2 ? v2 - v1 - v5 : v1 - v2 - v5;
        float f1 = v6 <= 0 ? f * ((float)v6) : f * ((float)v6) + 0.5f;
        int v7 = v1 + ((int)f1);
        int v8 = v7 + v5;
        if(v1 > v2) {
            v7 = v1 - ((int)f1);
            v8 = v7 - v5;
        }
        constraintWidget0.u1(v7, v8);
        Direct.k(v + 1, constraintWidget0, basicMeasure$Measurer0);
    }

    private static void i(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0, ConstraintWidget constraintWidget1) {
        float f = constraintWidget1.g0();
        int v1 = constraintWidget1.R.f.f() + constraintWidget1.R.g();
        int v2 = constraintWidget1.T.f.f() - constraintWidget1.T.g();
        if(v2 >= v1) {
            int v3 = constraintWidget1.D();
            if(constraintWidget1.l0() != 8) {
                int v4 = constraintWidget1.x;
                if(v4 == 2) {
                    v3 = (int)(f * 0.5f * ((float)(constraintWidget0 instanceof ConstraintWidgetContainer ? constraintWidget0.D() : constraintWidget0.U().D())));
                }
                else if(v4 == 0) {
                    v3 = v2 - v1;
                }
                v3 = Math.max(constraintWidget1.C, v3);
                int v5 = constraintWidget1.D;
                if(v5 > 0) {
                    v3 = Math.min(v5, v3);
                }
            }
            int v6 = v1 + ((int)(f * ((float)(v2 - v1 - v3)) + 0.5f));
            constraintWidget1.u1(v6, v3 + v6);
            Direct.k(v + 1, constraintWidget1, basicMeasure$Measurer0);
        }
    }

    public static void j(ConstraintWidgetContainer constraintWidgetContainer0, Measurer basicMeasure$Measurer0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidgetContainer0.H();
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = constraintWidgetContainer0.j0();
        Direct.e = 0;
        Direct.f = 0;
        constraintWidgetContainer0.V0();
        ArrayList arrayList0 = constraintWidgetContainer0.m2();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintWidget)arrayList0.get(v1)).V0();
        }
        boolean z = constraintWidgetContainer0.P2();
        if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a) {
            constraintWidgetContainer0.r1(0, constraintWidgetContainer0.m0());
        }
        else {
            constraintWidgetContainer0.s1(0);
        }
        boolean z1 = false;
        boolean z2 = false;
        for(int v2 = 0; v2 < v; ++v2) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v2);
            if(!(constraintWidget0 instanceof Guideline)) {
                if(constraintWidget0 instanceof Barrier && ((Barrier)constraintWidget0).s2() == 0) {
                    z2 = true;
                }
            }
            else if(((Guideline)constraintWidget0).o2() == 1) {
                if(((Guideline)constraintWidget0).p2() != -1) {
                    ((Guideline)constraintWidget0).x2(((Guideline)constraintWidget0).p2());
                }
                else if(((Guideline)constraintWidget0).r2() != -1 && constraintWidgetContainer0.G0()) {
                    ((Guideline)constraintWidget0).x2(constraintWidgetContainer0.m0() - ((Guideline)constraintWidget0).r2());
                }
                else if(constraintWidgetContainer0.G0()) {
                    ((Guideline)constraintWidget0).x2(((int)(((Guideline)constraintWidget0).s2() * ((float)constraintWidgetContainer0.m0()) + 0.5f)));
                }
                z1 = true;
            }
        }
        if(z1) {
            for(int v3 = 0; v3 < v; ++v3) {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)arrayList0.get(v3);
                if(constraintWidget1 instanceof Guideline && ((Guideline)constraintWidget1).o2() == 1) {
                    Direct.b(0, ((Guideline)constraintWidget1), basicMeasure$Measurer0, z);
                }
            }
        }
        Direct.b(0, constraintWidgetContainer0, basicMeasure$Measurer0, z);
        if(z2) {
            for(int v4 = 0; v4 < v; ++v4) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget)arrayList0.get(v4);
                if(constraintWidget2 instanceof Barrier && ((Barrier)constraintWidget2).s2() == 0) {
                    Direct.d(0, ((Barrier)constraintWidget2), basicMeasure$Measurer0, 0, z);
                }
            }
        }
        if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a) {
            constraintWidgetContainer0.u1(0, constraintWidgetContainer0.D());
        }
        else {
            constraintWidgetContainer0.t1(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for(int v5 = 0; v5 < v; ++v5) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget)arrayList0.get(v5);
            if(!(constraintWidget3 instanceof Guideline)) {
                if(constraintWidget3 instanceof Barrier && ((Barrier)constraintWidget3).s2() == 1) {
                    z4 = true;
                }
            }
            else if(((Guideline)constraintWidget3).o2() == 0) {
                if(((Guideline)constraintWidget3).p2() != -1) {
                    ((Guideline)constraintWidget3).x2(((Guideline)constraintWidget3).p2());
                }
                else if(((Guideline)constraintWidget3).r2() != -1 && constraintWidgetContainer0.H0()) {
                    ((Guideline)constraintWidget3).x2(constraintWidgetContainer0.D() - ((Guideline)constraintWidget3).r2());
                }
                else if(constraintWidgetContainer0.H0()) {
                    ((Guideline)constraintWidget3).x2(((int)(((Guideline)constraintWidget3).s2() * ((float)constraintWidgetContainer0.D()) + 0.5f)));
                }
                z3 = true;
            }
        }
        if(z3) {
            for(int v6 = 0; v6 < v; ++v6) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget)arrayList0.get(v6);
                if(constraintWidget4 instanceof Guideline && ((Guideline)constraintWidget4).o2() == 0) {
                    Direct.k(1, ((Guideline)constraintWidget4), basicMeasure$Measurer0);
                }
            }
        }
        Direct.k(0, constraintWidgetContainer0, basicMeasure$Measurer0);
        if(z4) {
            for(int v7 = 0; v7 < v; ++v7) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget)arrayList0.get(v7);
                if(constraintWidget5 instanceof Barrier && ((Barrier)constraintWidget5).s2() == 1) {
                    Direct.d(0, ((Barrier)constraintWidget5), basicMeasure$Measurer0, 1, z);
                }
            }
        }
        for(int v8 = 0; v8 < v; ++v8) {
            ConstraintWidget constraintWidget6 = (ConstraintWidget)arrayList0.get(v8);
            if(constraintWidget6.F0() && Direct.a(0, constraintWidget6)) {
                ConstraintWidgetContainer.S2(0, constraintWidget6, basicMeasure$Measurer0, Direct.c, Measure.k);
                if(!(constraintWidget6 instanceof Guideline)) {
                    Direct.b(0, constraintWidget6, basicMeasure$Measurer0, z);
                    Direct.k(0, constraintWidget6, basicMeasure$Measurer0);
                }
                else if(((Guideline)constraintWidget6).o2() == 0) {
                    Direct.k(0, constraintWidget6, basicMeasure$Measurer0);
                }
                else {
                    Direct.b(0, constraintWidget6, basicMeasure$Measurer0, z);
                }
            }
        }
    }

    private static void k(int v, ConstraintWidget constraintWidget0, Measurer basicMeasure$Measurer0) {
        boolean z3;
        boolean z1;
        if(constraintWidget0.L0()) {
            return;
        }
        ++Direct.f;
        if(!(constraintWidget0 instanceof ConstraintWidgetContainer) && constraintWidget0.F0() && Direct.a(v + 1, constraintWidget0)) {
            ConstraintWidgetContainer.S2(v + 1, constraintWidget0, basicMeasure$Measurer0, new Measure(), Measure.k);
        }
        ConstraintAnchor constraintAnchor0 = constraintWidget0.r(Type.c);
        ConstraintAnchor constraintAnchor1 = constraintWidget0.r(Type.e);
        int v1 = constraintAnchor0.f();
        int v2 = constraintAnchor1.f();
        if(constraintAnchor0.e() != null && constraintAnchor0.o()) {
            for(Object object0: constraintAnchor0.e()) {
                ConstraintAnchor constraintAnchor2 = (ConstraintAnchor)object0;
                ConstraintWidget constraintWidget1 = constraintAnchor2.d;
                boolean z = Direct.a(v + 1, constraintWidget1);
                if(constraintWidget1.F0() && z) {
                    ConstraintWidgetContainer.S2(v + 1, constraintWidget1, basicMeasure$Measurer0, new Measure(), Measure.k);
                }
                if(constraintAnchor2 == constraintWidget1.R) {
                    ConstraintAnchor constraintAnchor3 = constraintWidget1.T.f;
                    if(constraintAnchor3 != null && constraintAnchor3.o()) {
                        z1 = true;
                    }
                }
                else {
                    if(constraintAnchor2 == constraintWidget1.T) {
                        ConstraintAnchor constraintAnchor4 = constraintWidget1.R.f;
                        if(constraintAnchor4 != null && constraintAnchor4.o()) {
                            z1 = true;
                            goto label_29;
                        }
                    }
                    z1 = false;
                }
            label_29:
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.c;
                if(constraintWidget1.j0() == constraintWidget$DimensionBehaviour0 && !z) {
                    if(constraintWidget1.j0() != constraintWidget$DimensionBehaviour0 || constraintWidget1.D < 0 || constraintWidget1.C < 0 || constraintWidget1.l0() != 8 && (constraintWidget1.x != 0 || constraintWidget1.A() != 0.0f) || constraintWidget1.D0() || constraintWidget1.E0() || !z1 || constraintWidget1.D0()) {
                        continue;
                    }
                    Direct.i(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget1);
                }
                else if(!constraintWidget1.F0()) {
                    ConstraintAnchor constraintAnchor5 = constraintWidget1.R;
                    if(constraintAnchor2 == constraintAnchor5 && constraintWidget1.T.f == null) {
                        int v3 = constraintAnchor5.g();
                        constraintWidget1.u1(v3 + v1, constraintWidget1.D() + (v3 + v1));
                        Direct.k(v + 1, constraintWidget1, basicMeasure$Measurer0);
                    }
                    else {
                        ConstraintAnchor constraintAnchor6 = constraintWidget1.T;
                        if(constraintAnchor2 == constraintAnchor6 && constraintAnchor5.f == null) {
                            int v4 = constraintAnchor6.g();
                            constraintWidget1.u1(v1 - v4 - constraintWidget1.D(), v1 - v4);
                            Direct.k(v + 1, constraintWidget1, basicMeasure$Measurer0);
                        }
                        else if(z1 && !constraintWidget1.D0()) {
                            Direct.h(v + 1, basicMeasure$Measurer0, constraintWidget1);
                        }
                    }
                }
            }
        }
        if(constraintWidget0 instanceof Guideline) {
            return;
        }
        if(constraintAnchor1.e() != null && constraintAnchor1.o()) {
            for(Object object1: constraintAnchor1.e()) {
                ConstraintAnchor constraintAnchor7 = (ConstraintAnchor)object1;
                ConstraintWidget constraintWidget2 = constraintAnchor7.d;
                boolean z2 = Direct.a(v + 1, constraintWidget2);
                if(constraintWidget2.F0() && z2) {
                    ConstraintWidgetContainer.S2(v + 1, constraintWidget2, basicMeasure$Measurer0, new Measure(), Measure.k);
                }
                if(constraintAnchor7 == constraintWidget2.R) {
                    ConstraintAnchor constraintAnchor8 = constraintWidget2.T.f;
                    if(constraintAnchor8 != null && constraintAnchor8.o()) {
                        z3 = true;
                    }
                }
                else {
                    if(constraintAnchor7 == constraintWidget2.T) {
                        ConstraintAnchor constraintAnchor9 = constraintWidget2.R.f;
                        if(constraintAnchor9 != null && constraintAnchor9.o()) {
                            z3 = true;
                            goto label_72;
                        }
                    }
                    z3 = false;
                }
            label_72:
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.c;
                if(constraintWidget2.j0() == constraintWidget$DimensionBehaviour1 && !z2) {
                    if(constraintWidget2.j0() != constraintWidget$DimensionBehaviour1 || constraintWidget2.D < 0 || constraintWidget2.C < 0 || constraintWidget2.l0() != 8 && (constraintWidget2.x != 0 || constraintWidget2.A() != 0.0f) || constraintWidget2.D0() || constraintWidget2.E0() || !z3 || constraintWidget2.D0()) {
                        continue;
                    }
                    Direct.i(v + 1, constraintWidget0, basicMeasure$Measurer0, constraintWidget2);
                }
                else if(!constraintWidget2.F0()) {
                    ConstraintAnchor constraintAnchor10 = constraintWidget2.R;
                    if(constraintAnchor7 == constraintAnchor10 && constraintWidget2.T.f == null) {
                        int v5 = constraintAnchor10.g();
                        constraintWidget2.u1(v5 + v2, constraintWidget2.D() + (v5 + v2));
                        Direct.k(v + 1, constraintWidget2, basicMeasure$Measurer0);
                    }
                    else {
                        ConstraintAnchor constraintAnchor11 = constraintWidget2.T;
                        if(constraintAnchor7 == constraintAnchor11 && constraintAnchor10.f == null) {
                            int v6 = constraintAnchor11.g();
                            constraintWidget2.u1(v2 - v6 - constraintWidget2.D(), v2 - v6);
                            Direct.k(v + 1, constraintWidget2, basicMeasure$Measurer0);
                        }
                        else if(z3 && !constraintWidget2.D0()) {
                            Direct.h(v + 1, basicMeasure$Measurer0, constraintWidget2);
                        }
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchor12 = constraintWidget0.r(Type.f);
        if(constraintAnchor12.e() != null && constraintAnchor12.o()) {
            int v7 = constraintAnchor12.f();
            for(Object object2: constraintAnchor12.e()) {
                ConstraintAnchor constraintAnchor13 = (ConstraintAnchor)object2;
                ConstraintWidget constraintWidget3 = constraintAnchor13.d;
                boolean z4 = Direct.a(v + 1, constraintWidget3);
                if(constraintWidget3.F0() && z4) {
                    ConstraintWidgetContainer.S2(v + 1, constraintWidget3, basicMeasure$Measurer0, new Measure(), Measure.k);
                }
                if((constraintWidget3.j0() != DimensionBehaviour.c || z4) && !constraintWidget3.F0() && constraintAnchor13 == constraintWidget3.U) {
                    constraintWidget3.p1(constraintAnchor13.g() + v7);
                    Direct.k(v + 1, constraintWidget3, basicMeasure$Measurer0);
                }
            }
        }
        constraintWidget0.O0();
    }
}

