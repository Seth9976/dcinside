package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.ArrayRow;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;

public class Chain {
    private static final boolean a = false;
    public static final boolean b = false;

    // This method was un-flattened
    static void a(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, int v, int v1, ChainHead chainHead0) {
        ConstraintWidget constraintWidget22;
        ConstraintWidget constraintWidget21;
        SolverVariable solverVariable14;
        SolverVariable solverVariable13;
        ConstraintWidget constraintWidget20;
        ConstraintAnchor constraintAnchor16;
        ConstraintWidget constraintWidget13;
        ConstraintWidget constraintWidget15;
        ConstraintWidget constraintWidget14;
        SolverVariable solverVariable9;
        ConstraintAnchor constraintAnchor14;
        int v7;
        ArrayList arrayList1;
        boolean z3;
        boolean z2;
        boolean z1;
        ConstraintWidget constraintWidget0 = chainHead0.a;
        ConstraintWidget constraintWidget1 = chainHead0.c;
        ConstraintWidget constraintWidget2 = chainHead0.b;
        ConstraintWidget constraintWidget3 = chainHead0.d;
        ConstraintWidget constraintWidget4 = chainHead0.e;
        float f = chainHead0.k;
        boolean z = constraintWidgetContainer0.b0[v] == DimensionBehaviour.b;
        if(v == 0) {
            z1 = constraintWidget4.J0 == 0;
            z2 = constraintWidget4.J0 == 1;
            z3 = constraintWidget4.J0 == 2;
        }
        else {
            z1 = constraintWidget4.K0 == 0;
            z2 = constraintWidget4.K0 == 1;
            z3 = constraintWidget4.K0 == 2;
        }
        ConstraintWidget constraintWidget5 = constraintWidget0;
        ConstraintWidget constraintWidget6;
        for(constraintWidget6 = null; true; constraintWidget6 = null) {
            ConstraintAnchor constraintAnchor0 = constraintWidget5.Y[v1];
            int v2 = z3 ? 1 : 4;
            int v3 = constraintAnchor0.g();
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = DimensionBehaviour.c;
            boolean z4 = constraintWidget5.b0[v] == constraintWidget$DimensionBehaviour0 && constraintWidget5.y[v] == 0;
            ConstraintAnchor constraintAnchor1 = constraintAnchor0.f;
            if(constraintAnchor1 != null && constraintWidget5 != constraintWidget0) {
                v3 += constraintAnchor1.g();
            }
            if(z3 && constraintWidget5 != constraintWidget0 && constraintWidget5 != constraintWidget2) {
                v2 = 8;
            }
            ConstraintAnchor constraintAnchor2 = constraintAnchor0.f;
            if(constraintAnchor2 != null) {
                if(constraintWidget5 == constraintWidget2) {
                    linearSystem0.h(constraintAnchor0.i, constraintAnchor2.i, v3, 6);
                }
                else {
                    linearSystem0.h(constraintAnchor0.i, constraintAnchor2.i, v3, 8);
                }
                if(z4 && !z3) {
                    v2 = 5;
                }
                int v4 = constraintWidget5 != constraintWidget2 || !z3 || !constraintWidget5.A0(v) ? v2 : 5;
                linearSystem0.e(constraintAnchor0.i, constraintAnchor0.f.i, v3, v4);
            }
            if(z) {
                if(constraintWidget5.l0() != 8 && constraintWidget5.b0[v] == constraintWidget$DimensionBehaviour0) {
                    linearSystem0.h(constraintWidget5.Y[v1 + 1].i, constraintWidget5.Y[v1].i, 0, 5);
                }
                linearSystem0.h(constraintWidget5.Y[v1].i, constraintWidgetContainer0.Y[v1].i, 0, 8);
            }
            ConstraintAnchor constraintAnchor3 = constraintWidget5.Y[v1 + 1].f;
            if(constraintAnchor3 != null) {
                ConstraintWidget constraintWidget7 = constraintAnchor3.d;
                ConstraintAnchor constraintAnchor4 = constraintWidget7.Y[v1].f;
                if(constraintAnchor4 != null && constraintAnchor4.d == constraintWidget5) {
                    constraintWidget6 = constraintWidget7;
                }
            }
            if(constraintWidget6 == null) {
                break;
            }
            constraintWidget5 = constraintWidget6;
        }
        constraintWidget6 = null;
        if(constraintWidget3 != null && constraintWidget1.Y[v1 + 1].f != null) {
            ConstraintAnchor constraintAnchor5 = constraintWidget3.Y[v1 + 1];
            if(constraintWidget3.b0[v] != DimensionBehaviour.c || constraintWidget3.y[v] != 0 || z3) {
            label_62:
                if(z3) {
                    ConstraintAnchor constraintAnchor7 = constraintAnchor5.f;
                    if(constraintAnchor7.d == constraintWidgetContainer0) {
                        linearSystem0.e(constraintAnchor5.i, constraintAnchor7.i, -constraintAnchor5.g(), 4);
                    }
                }
            }
            else {
                ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
                if(constraintAnchor6.d == constraintWidgetContainer0) {
                    linearSystem0.e(constraintAnchor5.i, constraintAnchor6.i, -constraintAnchor5.g(), 5);
                    goto label_66;
                }
                goto label_62;
            }
        label_66:
            linearSystem0.j(constraintAnchor5.i, constraintWidget1.Y[v1 + 1].f.i, -constraintAnchor5.g(), 6);
        }
        if(z) {
            SolverVariable solverVariable0 = constraintWidgetContainer0.Y[v1 + 1].i;
            ConstraintAnchor constraintAnchor8 = constraintWidget1.Y[v1 + 1];
            linearSystem0.h(solverVariable0, constraintAnchor8.i, constraintAnchor8.g(), 8);
        }
        ArrayList arrayList0 = chainHead0.h;
        if(arrayList0 != null) {
            int v5 = arrayList0.size();
            if(v5 > 1) {
                float f1 = !chainHead0.r || chainHead0.t ? f : ((float)chainHead0.j);
                ConstraintWidget constraintWidget8 = null;
                int v6 = 0;
                float f2 = 0.0f;
                while(v6 < v5) {
                    ConstraintWidget constraintWidget9 = (ConstraintWidget)arrayList0.get(v6);
                    float f3 = constraintWidget9.N0[v];
                    if(f3 < 0.0f) {
                        if(chainHead0.t) {
                            linearSystem0.e(constraintWidget9.Y[v1 + 1].i, constraintWidget9.Y[v1].i, 0, 4);
                            arrayList1 = arrayList0;
                            v7 = v5;
                            goto label_111;
                        }
                        else {
                            f3 = 1.0f;
                        }
                    }
                    if(f3 == 0.0f) {
                        linearSystem0.e(constraintWidget9.Y[v1 + 1].i, constraintWidget9.Y[v1].i, 0, 8);
                        arrayList1 = arrayList0;
                        v7 = v5;
                    }
                    else {
                        if(constraintWidget8 == null) {
                            arrayList1 = arrayList0;
                            v7 = v5;
                        }
                        else {
                            ConstraintAnchor[] arr_constraintAnchor = constraintWidget8.Y;
                            SolverVariable solverVariable1 = arr_constraintAnchor[v1].i;
                            SolverVariable solverVariable2 = arr_constraintAnchor[v1 + 1].i;
                            ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget9.Y;
                            arrayList1 = arrayList0;
                            SolverVariable solverVariable3 = arr_constraintAnchor1[v1].i;
                            SolverVariable solverVariable4 = arr_constraintAnchor1[v1 + 1].i;
                            v7 = v5;
                            ArrayRow arrayRow0 = linearSystem0.t();
                            arrayRow0.p(f2, f1, f3, solverVariable1, solverVariable2, solverVariable3, solverVariable4);
                            linearSystem0.d(arrayRow0);
                        }
                        constraintWidget8 = constraintWidget9;
                        f2 = f3;
                    }
                label_111:
                    ++v6;
                    v5 = v7;
                    arrayList0 = arrayList1;
                }
            }
        }
        if(constraintWidget2 != null && (constraintWidget2 == constraintWidget3 || z3)) {
            ConstraintAnchor constraintAnchor9 = constraintWidget0.Y[v1];
            ConstraintAnchor constraintAnchor10 = constraintWidget1.Y[v1 + 1];
            SolverVariable solverVariable5 = constraintAnchor9.f == null ? null : constraintAnchor9.f.i;
            SolverVariable solverVariable6 = constraintAnchor10.f == null ? null : constraintAnchor10.f.i;
            ConstraintAnchor constraintAnchor11 = constraintWidget2.Y[v1];
            if(constraintWidget3 != null) {
                constraintAnchor10 = constraintWidget3.Y[v1 + 1];
            }
            if(solverVariable5 != null && solverVariable6 != null) {
                float f4 = v == 0 ? constraintWidget4.q0 : constraintWidget4.r0;
                int v8 = constraintAnchor11.g();
                int v9 = constraintAnchor10.g();
                linearSystem0.c(constraintAnchor11.i, solverVariable5, v8, f4, solverVariable6, constraintAnchor10.i, v9, 7);
            }
        }
        else if(z1 && constraintWidget2 != null) {
            boolean z5 = chainHead0.j > 0 && chainHead0.i == chainHead0.j;
            ConstraintWidget constraintWidget10 = constraintWidget2;
            ConstraintWidget constraintWidget11 = constraintWidget10;
            while(constraintWidget11 != null) {
                ConstraintWidget constraintWidget12;
                for(constraintWidget12 = constraintWidget11.P0[v]; constraintWidget12 != null && constraintWidget12.l0() == 8; constraintWidget12 = constraintWidget12.P0[v]) {
                }
                if(constraintWidget12 != null || constraintWidget11 == constraintWidget3) {
                    ConstraintAnchor constraintAnchor12 = constraintWidget11.Y[v1];
                    SolverVariable solverVariable7 = constraintAnchor12.i;
                    SolverVariable solverVariable8 = constraintAnchor12.f == null ? null : constraintAnchor12.f.i;
                    if(constraintWidget10 != constraintWidget11) {
                        solverVariable8 = constraintWidget10.Y[v1 + 1].i;
                    }
                    else if(constraintWidget11 == constraintWidget2) {
                        ConstraintAnchor constraintAnchor13 = constraintWidget0.Y[v1].f;
                        solverVariable8 = constraintAnchor13 == null ? null : constraintAnchor13.i;
                    }
                    int v10 = constraintAnchor12.g();
                    int v11 = constraintWidget11.Y[v1 + 1].g();
                    if(constraintWidget12 == null) {
                        constraintAnchor14 = constraintWidget1.Y[v1 + 1].f;
                        if(constraintAnchor14 == null) {
                            constraintWidget14 = null;
                            solverVariable9 = null;
                        }
                        else {
                            solverVariable9 = constraintAnchor14.i;
                            constraintWidget14 = null;
                        }
                    }
                    else {
                        constraintAnchor14 = constraintWidget12.Y[v1];
                        solverVariable9 = constraintAnchor14.i;
                        constraintWidget14 = constraintWidget12;
                    }
                    SolverVariable solverVariable10 = constraintWidget11.Y[v1 + 1].i;
                    if(constraintAnchor14 != null) {
                        v11 += constraintAnchor14.g();
                    }
                    int v12 = v10 + constraintWidget10.Y[v1 + 1].g();
                    if(solverVariable7 == null || solverVariable8 == null || solverVariable9 == null || solverVariable10 == null) {
                        constraintWidget13 = constraintWidget14;
                    }
                    else {
                        if(constraintWidget11 == constraintWidget2) {
                            v12 = constraintWidget2.Y[v1].g();
                        }
                        constraintWidget13 = constraintWidget14;
                        constraintWidget15 = constraintWidget10;
                        linearSystem0.c(solverVariable7, solverVariable8, v12, 0.5f, solverVariable9, solverVariable10, (constraintWidget11 == constraintWidget3 ? constraintWidget3.Y[v1 + 1].g() : v11), (z5 ? 8 : 5));
                        goto label_177;
                    }
                }
                else {
                    constraintWidget13 = null;
                }
                constraintWidget15 = constraintWidget10;
            label_177:
                if(constraintWidget11.l0() == 8) {
                    constraintWidget11 = constraintWidget15;
                }
                constraintWidget10 = constraintWidget11;
                constraintWidget11 = constraintWidget13;
            }
        }
        else if(z2 && constraintWidget2 != null) {
            boolean z6 = chainHead0.j > 0 && chainHead0.i == chainHead0.j;
            ConstraintWidget constraintWidget16 = constraintWidget2;
            for(ConstraintWidget constraintWidget17 = constraintWidget16; constraintWidget17 != null; constraintWidget17 = constraintWidget18) {
                ConstraintWidget constraintWidget18;
                for(constraintWidget18 = constraintWidget17.P0[v]; constraintWidget18 != null && constraintWidget18.l0() == 8; constraintWidget18 = constraintWidget18.P0[v]) {
                }
                if(constraintWidget17 == constraintWidget2 || constraintWidget17 == constraintWidget3 || constraintWidget18 == null) {
                    constraintWidget22 = constraintWidget16;
                }
                else {
                    ConstraintWidget constraintWidget19 = constraintWidget18 == constraintWidget3 ? null : constraintWidget18;
                    ConstraintAnchor constraintAnchor15 = constraintWidget17.Y[v1];
                    SolverVariable solverVariable11 = constraintAnchor15.i;
                    SolverVariable solverVariable12 = constraintWidget16.Y[v1 + 1].i;
                    int v13 = constraintAnchor15.g();
                    int v14 = constraintWidget17.Y[v1 + 1].g();
                    if(constraintWidget19 == null) {
                        constraintWidget20 = null;
                        constraintAnchor16 = constraintWidget3.Y[v1];
                        solverVariable14 = constraintAnchor16 == null ? null : constraintAnchor16.i;
                        solverVariable13 = constraintWidget17.Y[v1 + 1].i;
                    }
                    else {
                        constraintAnchor16 = constraintWidget19.Y[v1];
                        constraintWidget20 = constraintWidget19;
                        solverVariable13 = constraintAnchor16.f == null ? null : constraintAnchor16.f.i;
                        solverVariable14 = constraintAnchor16.i;
                    }
                    if(constraintAnchor16 != null) {
                        v14 += constraintAnchor16.g();
                    }
                    int v15 = constraintWidget16.Y[v1 + 1].g() + v13;
                    if(solverVariable11 == null || solverVariable12 == null || solverVariable14 == null || solverVariable13 == null) {
                        constraintWidget21 = constraintWidget20;
                        constraintWidget22 = constraintWidget16;
                    }
                    else {
                        constraintWidget21 = constraintWidget20;
                        constraintWidget22 = constraintWidget16;
                        linearSystem0.c(solverVariable11, solverVariable12, v15, 0.5f, solverVariable14, solverVariable13, v14, (z6 ? 8 : 4));
                    }
                    constraintWidget18 = constraintWidget21;
                }
                constraintWidget16 = constraintWidget17.l0() == 8 ? constraintWidget22 : constraintWidget17;
            }
            ConstraintAnchor constraintAnchor17 = constraintWidget2.Y[v1];
            ConstraintAnchor constraintAnchor18 = constraintWidget0.Y[v1].f;
            ConstraintAnchor constraintAnchor19 = constraintWidget3.Y[v1 + 1];
            ConstraintAnchor constraintAnchor20 = constraintWidget1.Y[v1 + 1].f;
            if(constraintAnchor18 != null) {
                if(constraintWidget2 != constraintWidget3) {
                    linearSystem0.e(constraintAnchor17.i, constraintAnchor18.i, constraintAnchor17.g(), 5);
                }
                else if(constraintAnchor20 != null) {
                    linearSystem0.c(constraintAnchor17.i, constraintAnchor18.i, constraintAnchor17.g(), 0.5f, constraintAnchor19.i, constraintAnchor20.i, constraintAnchor19.g(), 5);
                }
            }
            if(constraintAnchor20 != null && constraintWidget2 != constraintWidget3) {
                linearSystem0.e(constraintAnchor19.i, constraintAnchor20.i, -constraintAnchor19.g(), 5);
            }
        }
        if((z1 || z2) && constraintWidget2 != null && constraintWidget2 != constraintWidget3) {
            ConstraintAnchor[] arr_constraintAnchor2 = constraintWidget2.Y;
            ConstraintAnchor constraintAnchor21 = arr_constraintAnchor2[v1];
            if(constraintWidget3 == null) {
                constraintWidget3 = constraintWidget2;
            }
            ConstraintAnchor constraintAnchor22 = constraintWidget3.Y[v1 + 1];
            SolverVariable solverVariable15 = constraintAnchor21.f == null ? null : constraintAnchor21.f.i;
            SolverVariable solverVariable16 = constraintAnchor22.f == null ? null : constraintAnchor22.f.i;
            if(constraintWidget1 != constraintWidget3) {
                ConstraintAnchor constraintAnchor23 = constraintWidget1.Y[v1 + 1].f;
                if(constraintAnchor23 != null) {
                    constraintWidget6 = constraintAnchor23.i;
                }
                solverVariable16 = constraintWidget6;
            }
            if(constraintWidget2 == constraintWidget3) {
                constraintAnchor22 = arr_constraintAnchor2[v1 + 1];
            }
            if(solverVariable15 != null && solverVariable16 != null) {
                int v16 = constraintAnchor21.g();
                int v17 = constraintWidget3.Y[v1 + 1].g();
                linearSystem0.c(constraintAnchor21.i, solverVariable15, v16, 0.5f, solverVariable16, constraintAnchor22.i, v17, 5);
            }
        }
    }

    public static void b(ConstraintWidgetContainer constraintWidgetContainer0, LinearSystem linearSystem0, ArrayList arrayList0, int v) {
        int v3;
        ChainHead[] arr_chainHead;
        int v2;
        if(v == 0) {
            v2 = constraintWidgetContainer0.N1;
            arr_chainHead = constraintWidgetContainer0.Q1;
            v3 = 0;
        }
        else {
            v2 = constraintWidgetContainer0.O1;
            arr_chainHead = constraintWidgetContainer0.P1;
            v3 = 2;
        }
        for(int v1 = 0; v1 < v2; ++v1) {
            ChainHead chainHead0 = arr_chainHead[v1];
            chainHead0.a();
            if(arrayList0 == null || arrayList0.contains(chainHead0.a)) {
                Chain.a(constraintWidgetContainer0, linearSystem0, v, v3, chainHead0);
            }
        }
    }
}

