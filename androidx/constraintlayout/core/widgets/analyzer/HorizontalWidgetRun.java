package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;

public class HorizontalWidgetRun extends WidgetRun {
    private static int[] k;

    static {
        HorizontalWidgetRun.k = new int[2];
    }

    public HorizontalWidgetRun(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
        this.h.e = Type.d;
        this.i.e = Type.e;
        this.f = 0;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void a(Dependency dependency0) {
        int v;
        if(androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun.1.a[this.j.ordinal()] == 3) {
            this.q(dependency0, this.b.Q, this.b.S, 0);
            return;
        }
        if(!this.e.j && this.d == DimensionBehaviour.c) {
            ConstraintWidget constraintWidget0 = this.b;
            switch(constraintWidget0.w) {
                case 2: {
                    ConstraintWidget constraintWidget1 = constraintWidget0.U();
                    if(constraintWidget1 != null) {
                        DimensionDependency dimensionDependency0 = constraintWidget1.e.e;
                        if(dimensionDependency0.j) {
                            this.e.e(((int)(((float)dimensionDependency0.g) * this.b.B + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(constraintWidget0.x == 0 || constraintWidget0.x == 3) {
                        DependencyNode dependencyNode0 = constraintWidget0.f.h;
                        DependencyNode dependencyNode1 = constraintWidget0.f.i;
                        boolean z = constraintWidget0.Q.f != null;
                        boolean z1 = constraintWidget0.R.f != null;
                        boolean z2 = constraintWidget0.S.f != null;
                        boolean z3 = constraintWidget0.T.f != null;
                        int v1 = constraintWidget0.B();
                        if(z && z1 && z2 && z3) {
                            float f = this.b.A();
                            if(dependencyNode0.j && dependencyNode1.j) {
                                DependencyNode dependencyNode2 = this.h;
                                if(dependencyNode2.c && this.i.c) {
                                    int v2 = ((DependencyNode)dependencyNode2.l.get(0)).g + this.h.f;
                                    int v3 = ((DependencyNode)this.i.l.get(0)).g;
                                    this.u(HorizontalWidgetRun.k, v2, v3 - this.i.f, dependencyNode0.g + dependencyNode0.f, dependencyNode1.g - dependencyNode1.f, f, v1);
                                    this.e.e(HorizontalWidgetRun.k[0]);
                                    this.b.f.e.e(HorizontalWidgetRun.k[1]);
                                }
                                return;
                            }
                            DependencyNode dependencyNode3 = this.h;
                            if(dependencyNode3.j) {
                                DependencyNode dependencyNode4 = this.i;
                                if(dependencyNode4.j) {
                                    if(dependencyNode0.c && dependencyNode1.c) {
                                        int v4 = dependencyNode3.g + dependencyNode3.f;
                                        int v5 = dependencyNode4.g - dependencyNode4.f;
                                        int v6 = ((DependencyNode)dependencyNode0.l.get(0)).g + dependencyNode0.f;
                                        int v7 = ((DependencyNode)dependencyNode1.l.get(0)).g;
                                        this.u(HorizontalWidgetRun.k, v4, v5, v6, v7 - dependencyNode1.f, f, v1);
                                        this.e.e(HorizontalWidgetRun.k[0]);
                                        this.b.f.e.e(HorizontalWidgetRun.k[1]);
                                        goto label_56;
                                    }
                                    return;
                                }
                            }
                        label_56:
                            DependencyNode dependencyNode5 = this.h;
                            if(dependencyNode5.c && this.i.c && dependencyNode0.c && dependencyNode1.c) {
                                int v8 = ((DependencyNode)dependencyNode5.l.get(0)).g + this.h.f;
                                int v9 = ((DependencyNode)this.i.l.get(0)).g - this.i.f;
                                int v10 = ((DependencyNode)dependencyNode0.l.get(0)).g + dependencyNode0.f;
                                int v11 = ((DependencyNode)dependencyNode1.l.get(0)).g;
                                this.u(HorizontalWidgetRun.k, v8, v9, v10, v11 - dependencyNode1.f, f, v1);
                                this.e.e(HorizontalWidgetRun.k[0]);
                                this.b.f.e.e(HorizontalWidgetRun.k[1]);
                                break;
                            }
                            return;
                        }
                        else if(z && z2) {
                            if(!this.h.c || !this.i.c) {
                                return;
                            }
                            float f1 = this.b.A();
                            int v12 = ((DependencyNode)this.h.l.get(0)).g + this.h.f;
                            int v13 = ((DependencyNode)this.i.l.get(0)).g - this.i.f;
                            switch(v1) {
                                case -1: 
                                case 0: {
                                    int v14 = this.g(v13 - v12, 0);
                                    int v15 = (int)(((float)v14) * f1 + 0.5f);
                                    int v16 = this.g(v15, 1);
                                    if(v15 != v16) {
                                        v14 = (int)(((float)v16) / f1 + 0.5f);
                                    }
                                    this.e.e(v14);
                                    this.b.f.e.e(v16);
                                    break;
                                }
                                case 1: {
                                    int v17 = this.g(v13 - v12, 0);
                                    int v18 = (int)(((float)v17) / f1 + 0.5f);
                                    int v19 = this.g(v18, 1);
                                    if(v18 != v19) {
                                        v17 = (int)(((float)v19) * f1 + 0.5f);
                                    }
                                    this.e.e(v17);
                                    this.b.f.e.e(v19);
                                    break;
                                }
                            }
                        }
                        else if(z1 && z3) {
                            if(!dependencyNode0.c || !dependencyNode1.c) {
                                return;
                            }
                            float f2 = this.b.A();
                            int v20 = ((DependencyNode)dependencyNode0.l.get(0)).g + dependencyNode0.f;
                            int v21 = ((DependencyNode)dependencyNode1.l.get(0)).g - dependencyNode1.f;
                            switch(v1) {
                                case 0: {
                                    int v25 = this.g(v21 - v20, 1);
                                    int v26 = (int)(((float)v25) * f2 + 0.5f);
                                    int v27 = this.g(v26, 0);
                                    if(v26 != v27) {
                                        v25 = (int)(((float)v27) / f2 + 0.5f);
                                    }
                                    this.e.e(v27);
                                    this.b.f.e.e(v25);
                                    break;
                                }
                                case -1: 
                                case 1: {
                                    int v22 = this.g(v21 - v20, 1);
                                    int v23 = (int)(((float)v22) / f2 + 0.5f);
                                    int v24 = this.g(v23, 0);
                                    if(v23 != v24) {
                                        v22 = (int)(((float)v24) * f2 + 0.5f);
                                    }
                                    this.e.e(v24);
                                    this.b.f.e.e(v22);
                                }
                            }
                        }
                    }
                    else {
                        switch(constraintWidget0.B()) {
                            case -1: {
                                v = (int)(((float)this.b.f.e.g) * this.b.A() + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(((float)this.b.f.e.g) / this.b.A() + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(((float)this.b.f.e.g) * this.b.A() + 0.5f);
                                break;
                            }
                            default: {
                                v = 0;
                            }
                        }
                        this.e.e(v);
                    }
                }
            }
        }
        if(!this.h.c || (!this.i.c || this.h.j && this.i.j && this.e.j)) {
            return;
        }
        if(!this.e.j && this.d == DimensionBehaviour.c && (this.b.w == 0 && !this.b.B0())) {
            DependencyNode dependencyNode6 = (DependencyNode)this.h.l.get(0);
            DependencyNode dependencyNode7 = (DependencyNode)this.i.l.get(0);
            int v28 = dependencyNode6.g + this.h.f;
            int v29 = dependencyNode7.g + this.i.f;
            this.h.e(v28);
            this.i.e(v29);
            this.e.e(v29 - v28);
            return;
        }
        if(!this.e.j && this.d == DimensionBehaviour.c && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            DependencyNode dependencyNode8 = (DependencyNode)this.h.l.get(0);
            int v30 = Math.min(((DependencyNode)this.i.l.get(0)).g + this.i.f - (dependencyNode8.g + this.h.f), this.e.m);
            int v31 = this.b.A;
            this.e.e((v31 <= 0 ? Math.max(this.b.z, v30) : Math.min(v31, Math.max(this.b.z, v30))));
        }
        if(!this.e.j) {
            return;
        }
        DependencyNode dependencyNode9 = (DependencyNode)this.h.l.get(0);
        DependencyNode dependencyNode10 = (DependencyNode)this.i.l.get(0);
        int v32 = dependencyNode9.g + this.h.f;
        int v33 = dependencyNode10.g + this.i.f;
        float f3 = this.b.E();
        if(dependencyNode9 == dependencyNode10) {
            v32 = dependencyNode9.g;
            v33 = dependencyNode10.g;
            f3 = 0.5f;
        }
        this.h.e(((int)(((float)v32) + 0.5f + ((float)(v33 - v32 - this.e.g)) * f3)));
        this.i.e(this.h.g + this.e.g);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget0 = this.b;
        if(constraintWidget0.a) {
            this.e.e(constraintWidget0.m0());
        }
        if(this.e.j) {
            DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.d;
            if(this.d == constraintWidget$DimensionBehaviour2) {
                ConstraintWidget constraintWidget2 = this.b.U();
                if(constraintWidget2 != null && (constraintWidget2.H() == DimensionBehaviour.a || constraintWidget2.H() == constraintWidget$DimensionBehaviour2)) {
                    this.b(this.h, constraintWidget2.e.h, this.b.Q.g());
                    this.b(this.i, constraintWidget2.e.i, -this.b.S.g());
                    return;
                }
            }
        }
        else {
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.b.H();
            this.d = constraintWidget$DimensionBehaviour0;
            if(constraintWidget$DimensionBehaviour0 != DimensionBehaviour.c) {
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.d;
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour1) {
                    ConstraintWidget constraintWidget1 = this.b.U();
                    if(constraintWidget1 != null && (constraintWidget1.H() == DimensionBehaviour.a || constraintWidget1.H() == constraintWidget$DimensionBehaviour1)) {
                        int v = constraintWidget1.m0();
                        int v1 = this.b.Q.g();
                        int v2 = this.b.S.g();
                        this.b(this.h, constraintWidget1.e.h, this.b.Q.g());
                        this.b(this.i, constraintWidget1.e.i, -this.b.S.g());
                        this.e.e(v - v1 - v2);
                        return;
                    }
                }
                if(this.d == DimensionBehaviour.a) {
                    this.e.e(this.b.m0());
                }
            }
        }
        DimensionDependency dimensionDependency0 = this.e;
        if(dimensionDependency0.j) {
            ConstraintWidget constraintWidget3 = this.b;
            if(constraintWidget3.a) {
                ConstraintAnchor[] arr_constraintAnchor = constraintWidget3.Y;
                ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[0];
                ConstraintAnchor constraintAnchor1 = constraintAnchor0.f;
                if(constraintAnchor1 != null && arr_constraintAnchor[1].f != null) {
                    if(constraintWidget3.B0()) {
                        this.h.f = this.b.Y[0].g();
                        this.i.f = -this.b.Y[1].g();
                        return;
                    }
                    DependencyNode dependencyNode0 = this.h(this.b.Y[0]);
                    if(dependencyNode0 != null) {
                        this.b(this.h, dependencyNode0, this.b.Y[0].g());
                    }
                    DependencyNode dependencyNode1 = this.h(this.b.Y[1]);
                    if(dependencyNode1 != null) {
                        this.b(this.i, dependencyNode1, -this.b.Y[1].g());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if(constraintAnchor1 == null) {
                    ConstraintAnchor constraintAnchor2 = arr_constraintAnchor[1];
                    if(constraintAnchor2.f != null) {
                        DependencyNode dependencyNode3 = this.h(constraintAnchor2);
                        if(dependencyNode3 != null) {
                            this.b(this.i, dependencyNode3, -this.b.Y[1].g());
                            this.b(this.h, this.i, -this.e.g);
                        }
                    }
                    else if(!(constraintWidget3 instanceof Helper) && constraintWidget3.U() != null && this.b.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.g).f == null) {
                        this.b(this.h, this.b.U().e.h, this.b.o0());
                        this.b(this.i, this.h, this.e.g);
                    }
                }
                else {
                    DependencyNode dependencyNode2 = this.h(constraintAnchor0);
                    if(dependencyNode2 != null) {
                        this.b(this.h, dependencyNode2, this.b.Y[0].g());
                        this.b(this.i, this.h, this.e.g);
                    }
                }
            }
            else {
                goto label_66;
            }
        }
        else {
        label_66:
            if(this.d == DimensionBehaviour.c) {
                ConstraintWidget constraintWidget4 = this.b;
                switch(constraintWidget4.w) {
                    case 2: {
                        ConstraintWidget constraintWidget5 = constraintWidget4.U();
                        if(constraintWidget5 != null) {
                            DimensionDependency dimensionDependency1 = constraintWidget5.f.e;
                            this.e.l.add(dimensionDependency1);
                            dimensionDependency1.k.add(this.e);
                            this.e.b = true;
                            this.e.k.add(this.h);
                            this.e.k.add(this.i);
                        }
                        break;
                    }
                    case 3: {
                        if(constraintWidget4.x == 3) {
                            this.h.a = this;
                            this.i.a = this;
                            constraintWidget4.f.h.a = this;
                            constraintWidget4.f.i.a = this;
                            dimensionDependency0.a = this;
                            if(constraintWidget4.D0()) {
                                this.e.l.add(this.b.f.e);
                                this.b.f.e.k.add(this.e);
                                this.b.f.e.a = this;
                                this.e.l.add(this.b.f.h);
                                this.e.l.add(this.b.f.i);
                                this.b.f.h.k.add(this.e);
                                this.b.f.i.k.add(this.e);
                            }
                            else if(this.b.B0()) {
                                this.b.f.e.l.add(this.e);
                                this.e.k.add(this.b.f.e);
                            }
                            else {
                                this.b.f.e.l.add(this.e);
                            }
                        }
                        else {
                            DimensionDependency dimensionDependency2 = constraintWidget4.f.e;
                            dimensionDependency0.l.add(dimensionDependency2);
                            dimensionDependency2.k.add(this.e);
                            this.b.f.h.k.add(this.e);
                            this.b.f.i.k.add(this.e);
                            this.e.b = true;
                            this.e.k.add(this.h);
                            this.e.k.add(this.i);
                            this.h.l.add(this.e);
                            this.i.l.add(this.e);
                        }
                    }
                }
            }
            ConstraintWidget constraintWidget6 = this.b;
            ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget6.Y;
            ConstraintAnchor constraintAnchor3 = arr_constraintAnchor1[0];
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
            if(constraintAnchor4 != null && arr_constraintAnchor1[1].f != null) {
                if(constraintWidget6.B0()) {
                    this.h.f = this.b.Y[0].g();
                    this.i.f = -this.b.Y[1].g();
                    return;
                }
                DependencyNode dependencyNode4 = this.h(this.b.Y[0]);
                DependencyNode dependencyNode5 = this.h(this.b.Y[1]);
                if(dependencyNode4 != null) {
                    dependencyNode4.b(this);
                }
                if(dependencyNode5 != null) {
                    dependencyNode5.b(this);
                }
                this.j = RunType.d;
                return;
            }
            if(constraintAnchor4 == null) {
                ConstraintAnchor constraintAnchor5 = arr_constraintAnchor1[1];
                if(constraintAnchor5.f != null) {
                    DependencyNode dependencyNode7 = this.h(constraintAnchor5);
                    if(dependencyNode7 != null) {
                        this.b(this.i, dependencyNode7, -this.b.Y[1].g());
                        this.c(this.h, this.i, -1, this.e);
                    }
                }
                else if(!(constraintWidget6 instanceof Helper) && constraintWidget6.U() != null) {
                    this.b(this.h, this.b.U().e.h, this.b.o0());
                    this.c(this.i, this.h, 1, this.e);
                }
            }
            else {
                DependencyNode dependencyNode6 = this.h(constraintAnchor3);
                if(dependencyNode6 != null) {
                    this.b(this.h, dependencyNode6, this.b.Y[0].g());
                    this.c(this.i, this.h, 1, this.e);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode0 = this.h;
        if(dependencyNode0.j) {
            this.b.g2(dependencyNode0.g);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return this.d != DimensionBehaviour.c || this.b.w == 0;
    }

    @Override
    public String toString() {
        return "HorizontalRun " + this.b.y();
    }

    private void u(int[] arr_v, int v, int v1, int v2, int v3, float f, int v4) {
        int v5 = v1 - v;
        int v6 = v3 - v2;
        switch(v4) {
            case -1: {
                int v7 = (int)(((float)v6) * f + 0.5f);
                int v8 = (int)(((float)v5) / f + 0.5f);
                if(v7 <= v5) {
                    arr_v[0] = v7;
                    arr_v[1] = v6;
                    return;
                }
                if(v8 <= v6) {
                    arr_v[0] = v5;
                    arr_v[1] = v8;
                }
                return;
            }
            case 0: {
                arr_v[0] = (int)(((float)v6) * f + 0.5f);
                arr_v[1] = v6;
                return;
            }
            case 1: {
                arr_v[0] = v5;
                arr_v[1] = (int)(((float)v5) * f + 0.5f);
            }
        }
    }
}

