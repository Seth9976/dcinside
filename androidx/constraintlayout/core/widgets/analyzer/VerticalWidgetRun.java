package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;

public class VerticalWidgetRun extends WidgetRun {
    public DependencyNode k;
    DimensionDependency l;
    private static final boolean m = true;

    public VerticalWidgetRun(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
        DependencyNode dependencyNode0 = new DependencyNode(this);
        this.k = dependencyNode0;
        this.l = null;
        this.h.e = Type.f;
        this.i.e = Type.g;
        dependencyNode0.e = Type.h;
        this.f = 1;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void a(Dependency dependency0) {
        int v;
        if(androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun.1.a[this.j.ordinal()] == 3) {
            this.q(dependency0, this.b.R, this.b.T, 1);
            return;
        }
        if(this.e.c && !this.e.j && this.d == DimensionBehaviour.c) {
            ConstraintWidget constraintWidget0 = this.b;
            switch(constraintWidget0.x) {
                case 2: {
                    ConstraintWidget constraintWidget1 = constraintWidget0.U();
                    if(constraintWidget1 != null) {
                        DimensionDependency dimensionDependency0 = constraintWidget1.f.e;
                        if(dimensionDependency0.j) {
                            this.e.e(((int)(((float)dimensionDependency0.g) * this.b.E + 0.5f)));
                        }
                    }
                    break;
                }
                case 3: {
                    if(constraintWidget0.e.e.j) {
                        switch(constraintWidget0.B()) {
                            case -1: {
                                v = (int)(((float)this.b.e.e.g) / this.b.A() + 0.5f);
                                break;
                            }
                            case 0: {
                                v = (int)(((float)this.b.e.e.g) * this.b.A() + 0.5f);
                                break;
                            }
                            case 1: {
                                v = (int)(((float)this.b.e.e.g) / this.b.A() + 0.5f);
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
        if(!this.e.j && this.d == DimensionBehaviour.c && (this.b.w == 0 && !this.b.D0())) {
            DependencyNode dependencyNode0 = (DependencyNode)this.h.l.get(0);
            DependencyNode dependencyNode1 = (DependencyNode)this.i.l.get(0);
            int v1 = dependencyNode0.g + this.h.f;
            int v2 = dependencyNode1.g + this.i.f;
            this.h.e(v1);
            this.i.e(v2);
            this.e.e(v2 - v1);
            return;
        }
        if(!this.e.j && this.d == DimensionBehaviour.c && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
            DependencyNode dependencyNode2 = (DependencyNode)this.h.l.get(0);
            int v3 = ((DependencyNode)this.i.l.get(0)).g + this.i.f - (dependencyNode2.g + this.h.f);
            DimensionDependency dimensionDependency1 = this.e;
            int v4 = dimensionDependency1.m;
            if(v3 < v4) {
                dimensionDependency1.e(v3);
            }
            else {
                dimensionDependency1.e(v4);
            }
        }
        if(!this.e.j) {
            return;
        }
        if(this.h.l.size() > 0 && this.i.l.size() > 0) {
            DependencyNode dependencyNode3 = (DependencyNode)this.h.l.get(0);
            DependencyNode dependencyNode4 = (DependencyNode)this.i.l.get(0);
            int v5 = dependencyNode3.g + this.h.f;
            int v6 = dependencyNode4.g + this.i.f;
            float f = this.b.g0();
            if(dependencyNode3 == dependencyNode4) {
                v5 = dependencyNode3.g;
                v6 = dependencyNode4.g;
                f = 0.5f;
            }
            this.h.e(((int)(((float)v5) + 0.5f + ((float)(v6 - v5 - this.e.g)) * f)));
            this.i.e(this.h.g + this.e.g);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget0 = this.b;
        if(constraintWidget0.a) {
            this.e.e(constraintWidget0.D());
        }
        if(!this.e.j) {
            this.d = this.b.j0();
            if(this.b.q0()) {
                this.l = new BaselineDimensionDependency(this);
            }
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.d;
            if(constraintWidget$DimensionBehaviour0 != DimensionBehaviour.c) {
                if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.d) {
                    ConstraintWidget constraintWidget1 = this.b.U();
                    if(constraintWidget1 != null && constraintWidget1.j0() == DimensionBehaviour.a) {
                        int v = constraintWidget1.D();
                        int v1 = this.b.R.g();
                        int v2 = this.b.T.g();
                        this.b(this.h, constraintWidget1.f.h, this.b.R.g());
                        this.b(this.i, constraintWidget1.f.i, -this.b.T.g());
                        this.e.e(v - v1 - v2);
                        return;
                    }
                }
                if(this.d == DimensionBehaviour.a) {
                    this.e.e(this.b.D());
                }
            }
        }
        else if(this.d == DimensionBehaviour.d) {
            ConstraintWidget constraintWidget2 = this.b.U();
            if(constraintWidget2 != null && constraintWidget2.j0() == DimensionBehaviour.a) {
                this.b(this.h, constraintWidget2.f.h, this.b.R.g());
                this.b(this.i, constraintWidget2.f.i, -this.b.T.g());
                return;
            }
        }
        DimensionDependency dimensionDependency0 = this.e;
        boolean z = dimensionDependency0.j;
        if(z) {
            ConstraintWidget constraintWidget3 = this.b;
            if(constraintWidget3.a) {
                ConstraintAnchor[] arr_constraintAnchor = constraintWidget3.Y;
                ConstraintAnchor constraintAnchor0 = arr_constraintAnchor[2];
                ConstraintAnchor constraintAnchor1 = constraintAnchor0.f;
                if(constraintAnchor1 != null && arr_constraintAnchor[3].f != null) {
                    if(constraintWidget3.D0()) {
                        this.h.f = this.b.Y[2].g();
                        this.i.f = -this.b.Y[3].g();
                    }
                    else {
                        DependencyNode dependencyNode0 = this.h(this.b.Y[2]);
                        if(dependencyNode0 != null) {
                            this.b(this.h, dependencyNode0, this.b.Y[2].g());
                        }
                        DependencyNode dependencyNode1 = this.h(this.b.Y[3]);
                        if(dependencyNode1 != null) {
                            this.b(this.i, dependencyNode1, -this.b.Y[3].g());
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    if(this.b.q0()) {
                        this.b(this.k, this.h, this.b.t());
                    }
                }
                else if(constraintAnchor1 != null) {
                    DependencyNode dependencyNode2 = this.h(constraintAnchor0);
                    if(dependencyNode2 != null) {
                        this.b(this.h, dependencyNode2, this.b.Y[2].g());
                        this.b(this.i, this.h, this.e.g);
                        if(this.b.q0()) {
                            this.b(this.k, this.h, this.b.t());
                        }
                    }
                }
                else {
                    ConstraintAnchor constraintAnchor2 = arr_constraintAnchor[3];
                    if(constraintAnchor2.f == null) {
                        ConstraintAnchor constraintAnchor3 = arr_constraintAnchor[4];
                        if(constraintAnchor3.f != null) {
                            DependencyNode dependencyNode4 = this.h(constraintAnchor3);
                            if(dependencyNode4 != null) {
                                this.b(this.k, dependencyNode4, 0);
                                this.b(this.h, this.k, -this.b.t());
                                this.b(this.i, this.h, this.e.g);
                            }
                        }
                        else if(!(constraintWidget3 instanceof Helper) && constraintWidget3.U() != null && this.b.r(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.g).f == null) {
                            this.b(this.h, this.b.U().f.h, this.b.p0());
                            this.b(this.i, this.h, this.e.g);
                            if(this.b.q0()) {
                                this.b(this.k, this.h, this.b.t());
                            }
                        }
                    }
                    else {
                        DependencyNode dependencyNode3 = this.h(constraintAnchor2);
                        if(dependencyNode3 != null) {
                            this.b(this.i, dependencyNode3, -this.b.Y[3].g());
                            this.b(this.h, this.i, -this.e.g);
                        }
                        if(this.b.q0()) {
                            this.b(this.k, this.h, this.b.t());
                        }
                    }
                }
            }
            else {
                goto label_83;
            }
        }
        else {
        label_83:
            if(z || this.d != DimensionBehaviour.c) {
                dimensionDependency0.b(this);
            }
            else {
                ConstraintWidget constraintWidget4 = this.b;
                switch(constraintWidget4.x) {
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
                        if(!constraintWidget4.D0()) {
                            ConstraintWidget constraintWidget6 = this.b;
                            if(constraintWidget6.w != 3) {
                                DimensionDependency dimensionDependency2 = constraintWidget6.e.e;
                                this.e.l.add(dimensionDependency2);
                                dimensionDependency2.k.add(this.e);
                                this.e.b = true;
                                this.e.k.add(this.h);
                                this.e.k.add(this.i);
                            }
                        }
                    }
                }
            }
            ConstraintWidget constraintWidget7 = this.b;
            ConstraintAnchor[] arr_constraintAnchor1 = constraintWidget7.Y;
            ConstraintAnchor constraintAnchor4 = arr_constraintAnchor1[2];
            ConstraintAnchor constraintAnchor5 = constraintAnchor4.f;
            if(constraintAnchor5 != null && arr_constraintAnchor1[3].f != null) {
                if(constraintWidget7.D0()) {
                    this.h.f = this.b.Y[2].g();
                    this.i.f = -this.b.Y[3].g();
                }
                else {
                    DependencyNode dependencyNode5 = this.h(this.b.Y[2]);
                    DependencyNode dependencyNode6 = this.h(this.b.Y[3]);
                    if(dependencyNode5 != null) {
                        dependencyNode5.b(this);
                    }
                    if(dependencyNode6 != null) {
                        dependencyNode6.b(this);
                    }
                    this.j = RunType.d;
                }
                if(this.b.q0()) {
                    this.c(this.k, this.h, 1, this.l);
                }
            }
            else if(constraintAnchor5 == null) {
                ConstraintAnchor constraintAnchor6 = arr_constraintAnchor1[3];
                if(constraintAnchor6.f == null) {
                    ConstraintAnchor constraintAnchor7 = arr_constraintAnchor1[4];
                    if(constraintAnchor7.f != null) {
                        DependencyNode dependencyNode9 = this.h(constraintAnchor7);
                        if(dependencyNode9 != null) {
                            this.b(this.k, dependencyNode9, 0);
                            this.c(this.h, this.k, -1, this.l);
                            this.c(this.i, this.h, 1, this.e);
                        }
                    }
                    else if(!(constraintWidget7 instanceof Helper) && constraintWidget7.U() != null) {
                        this.b(this.h, this.b.U().f.h, this.b.p0());
                        this.c(this.i, this.h, 1, this.e);
                        if(this.b.q0()) {
                            this.c(this.k, this.h, 1, this.l);
                        }
                        DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.c;
                        if(this.d == constraintWidget$DimensionBehaviour2 && this.b.A() > 0.0f) {
                            HorizontalWidgetRun horizontalWidgetRun1 = this.b.e;
                            if(horizontalWidgetRun1.d == constraintWidget$DimensionBehaviour2) {
                                horizontalWidgetRun1.e.k.add(this.e);
                                this.e.l.add(this.b.e.e);
                                this.e.a = this;
                            }
                        }
                    }
                }
                else {
                    DependencyNode dependencyNode8 = this.h(constraintAnchor6);
                    if(dependencyNode8 != null) {
                        this.b(this.i, dependencyNode8, -this.b.Y[3].g());
                        this.c(this.h, this.i, -1, this.e);
                        if(this.b.q0()) {
                            this.c(this.k, this.h, 1, this.l);
                        }
                    }
                }
            }
            else {
                DependencyNode dependencyNode7 = this.h(constraintAnchor4);
                if(dependencyNode7 != null) {
                    this.b(this.h, dependencyNode7, this.b.Y[2].g());
                    this.c(this.i, this.h, 1, this.e);
                    if(this.b.q0()) {
                        this.c(this.k, this.h, 1, this.l);
                    }
                    DimensionBehaviour constraintWidget$DimensionBehaviour1 = DimensionBehaviour.c;
                    if(this.d == constraintWidget$DimensionBehaviour1 && this.b.A() > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun0 = this.b.e;
                        if(horizontalWidgetRun0.d == constraintWidget$DimensionBehaviour1) {
                            horizontalWidgetRun0.e.k.add(this.e);
                            this.e.l.add(this.b.e.e);
                            this.e.a = this;
                        }
                    }
                }
            }
            if(this.e.l.size() == 0) {
                this.e.c = true;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        DependencyNode dependencyNode0 = this.h;
        if(dependencyNode0.j) {
            this.b.h2(dependencyNode0.g);
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
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
        this.k.c();
        this.k.j = false;
        this.e.j = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return this.d != DimensionBehaviour.c || this.b.x == 0;
    }

    @Override
    public String toString() {
        return "VerticalRun " + this.b.y();
    }
}

