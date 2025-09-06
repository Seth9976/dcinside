package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

public abstract class WidgetRun implements Dependency {
    static enum RunType {
        NONE,
        START,
        END,
        CENTER;

        private static RunType[] a() [...] // Inlined contents
    }

    public int a;
    ConstraintWidget b;
    RunGroup c;
    protected DimensionBehaviour d;
    DimensionDependency e;
    public int f;
    boolean g;
    public DependencyNode h;
    public DependencyNode i;
    protected RunType j;

    public WidgetRun(ConstraintWidget constraintWidget0) {
        this.e = new DimensionDependency(this);
        this.f = 0;
        this.g = false;
        this.h = new DependencyNode(this);
        this.i = new DependencyNode(this);
        this.j = RunType.a;
        this.b = constraintWidget0;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void a(Dependency dependency0) {
    }

    protected final void b(DependencyNode dependencyNode0, DependencyNode dependencyNode1, int v) {
        dependencyNode0.l.add(dependencyNode1);
        dependencyNode0.f = v;
        dependencyNode1.k.add(dependencyNode0);
    }

    protected final void c(DependencyNode dependencyNode0, DependencyNode dependencyNode1, int v, DimensionDependency dimensionDependency0) {
        dependencyNode0.l.add(dependencyNode1);
        dependencyNode0.l.add(this.e);
        dependencyNode0.h = v;
        dependencyNode0.i = dimensionDependency0;
        dependencyNode1.k.add(dependencyNode0);
        dimensionDependency0.k.add(dependencyNode0);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int v, int v1) {
        int v3;
        if(v1 == 0) {
            int v2 = this.b.A;
            v3 = v2 <= 0 ? Math.max(this.b.z, v) : Math.min(v2, v);
            return v3 == v ? v : v3;
        }
        int v4 = this.b.D;
        v3 = v4 <= 0 ? Math.max(this.b.C, v) : Math.min(v4, v);
        return v3 == v ? v : v3;
    }

    protected final DependencyNode h(ConstraintAnchor constraintAnchor0) {
        ConstraintAnchor constraintAnchor1 = constraintAnchor0.f;
        if(constraintAnchor1 == null) {
            return null;
        }
        ConstraintWidget constraintWidget0 = constraintAnchor1.d;
        switch(constraintAnchor1.e) {
            case 1: {
                return constraintWidget0.e.h;
            }
            case 2: {
                return constraintWidget0.e.i;
            }
            case 3: {
                return constraintWidget0.f.h;
            }
            case 4: {
                return constraintWidget0.f.k;
            }
            case 5: {
                return constraintWidget0.f.i;
            }
            default: {
                return null;
            }
        }
    }

    protected final DependencyNode i(ConstraintAnchor constraintAnchor0, int v) {
        ConstraintAnchor constraintAnchor1 = constraintAnchor0.f;
        if(constraintAnchor1 == null) {
            return null;
        }
        ConstraintWidget constraintWidget0 = constraintAnchor1.d;
        HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidget0.e : constraintWidget0.f;
        switch(constraintAnchor1.e) {
            case 1: 
            case 3: {
                return horizontalWidgetRun0.h;
            }
            case 2: 
            case 5: {
                return horizontalWidgetRun0.i;
            }
            default: {
                return null;
            }
        }
    }

    // 去混淆评级： 低(20)
    public long j() {
        return this.e.j ? ((long)this.e.g) : 0L;
    }

    public boolean k() {
        int v = this.h.l.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(((DependencyNode)this.h.l.get(v1)).d != this) {
                ++v2;
            }
        }
        int v3 = this.i.l.size();
        for(int v4 = 0; v4 < v3; ++v4) {
            if(((DependencyNode)this.i.l.get(v4)).d != this) {
                ++v2;
            }
        }
        return v2 >= 2;
    }

    public boolean l() {
        return this.e.j;
    }

    public boolean m() {
        return this.g;
    }

    abstract void n();

    private void o(int v, int v1) {
        switch(this.a) {
            case 0: {
                this.e.e(this.g(v1, v));
                return;
            }
            case 1: {
                int v2 = Math.min(this.g(this.e.m, v), v1);
                this.e.e(v2);
                return;
            }
            case 2: {
                ConstraintWidget constraintWidget0 = this.b.U();
                if(constraintWidget0 != null) {
                    HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidget0.e : constraintWidget0.f;
                    DimensionDependency dimensionDependency0 = horizontalWidgetRun0.e;
                    if(dimensionDependency0.j) {
                        this.e.e(this.g(((int)(((float)dimensionDependency0.g) * (v == 0 ? this.b.B : this.b.E) + 0.5f)), v));
                        return;
                    }
                }
                break;
            }
            case 3: {
                ConstraintWidget constraintWidget1 = this.b;
                HorizontalWidgetRun horizontalWidgetRun1 = constraintWidget1.e;
                if(horizontalWidgetRun1.d != DimensionBehaviour.c || horizontalWidgetRun1.a != 3 || (constraintWidget1.f.d != DimensionBehaviour.c || constraintWidget1.f.a != 3)) {
                    if(v == 0) {
                        horizontalWidgetRun1 = constraintWidget1.f;
                    }
                    if(horizontalWidgetRun1.e.j) {
                        float f = constraintWidget1.A();
                        this.e.e((v == 1 ? ((int)(((float)horizontalWidgetRun1.e.g) / f + 0.5f)) : ((int)(f * ((float)horizontalWidgetRun1.e.g) + 0.5f))));
                        return;
                    }
                }
                break;
            }
        }
    }

    abstract boolean p();

    protected void q(Dependency dependency0, ConstraintAnchor constraintAnchor0, ConstraintAnchor constraintAnchor1, int v) {
        DependencyNode dependencyNode0 = this.h(constraintAnchor0);
        DependencyNode dependencyNode1 = this.h(constraintAnchor1);
        if(dependencyNode0.j && dependencyNode1.j) {
            int v1 = dependencyNode0.g + constraintAnchor0.g();
            int v2 = dependencyNode1.g - constraintAnchor1.g();
            int v3 = v2 - v1;
            if(!this.e.j && this.d == DimensionBehaviour.c) {
                this.o(v, v3);
            }
            DimensionDependency dimensionDependency0 = this.e;
            if(!dimensionDependency0.j) {
                return;
            }
            if(dimensionDependency0.g == v3) {
                this.h.e(v1);
                this.i.e(v2);
                return;
            }
            float f = v == 0 ? this.b.E() : this.b.g0();
            if(dependencyNode0 == dependencyNode1) {
                v1 = dependencyNode0.g;
                v2 = dependencyNode1.g;
                f = 0.5f;
            }
            this.h.e(((int)(((float)v1) + 0.5f + ((float)(v2 - v1 - this.e.g)) * f)));
            this.i.e(this.h.g + this.e.g);
        }
    }

    protected void r(Dependency dependency0) {
    }

    protected void s(Dependency dependency0) {
    }

    public long t(int v) {
        DimensionDependency dimensionDependency0 = this.e;
        if(dimensionDependency0.j) {
            long v1 = (long)dimensionDependency0.g;
            if(this.k()) {
                return v1 + ((long)(this.h.f - this.i.f));
            }
            return v == 0 ? v1 + ((long)this.h.f) : v1 - ((long)this.i.f);
        }
        return 0L;
    }
}

