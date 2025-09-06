package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

class GuidelineReference extends WidgetRun {
    GuidelineReference(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
        constraintWidget0.e.f();
        constraintWidget0.f.f();
        this.f = ((Guideline)constraintWidget0).o2();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void a(Dependency dependency0) {
        DependencyNode dependencyNode0 = this.h;
        if(!dependencyNode0.c) {
            return;
        }
        if(dependencyNode0.j) {
            return;
        }
        float f = (float)((DependencyNode)dependencyNode0.l.get(0)).g;
        float f1 = ((Guideline)this.b).s2();
        this.h.e(((int)(f * f1 + 0.5f)));
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        Guideline guideline0 = (Guideline)this.b;
        int v = guideline0.p2();
        int v1 = guideline0.r2();
        if(guideline0.o2() == 1) {
            if(v != -1) {
                this.h.l.add(this.b.c0.e.h);
                this.b.c0.e.h.k.add(this.h);
                this.h.f = v;
            }
            else if(v1 == -1) {
                this.h.b = true;
                this.h.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
            }
            else {
                this.h.l.add(this.b.c0.e.i);
                this.b.c0.e.i.k.add(this.h);
                this.h.f = -v1;
            }
            this.u(this.b.e.h);
            this.u(this.b.e.i);
            return;
        }
        if(v != -1) {
            this.h.l.add(this.b.c0.f.h);
            this.b.c0.f.h.k.add(this.h);
            this.h.f = v;
        }
        else if(v1 == -1) {
            this.h.b = true;
            this.h.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
        }
        else {
            this.h.l.add(this.b.c0.f.i);
            this.b.c0.f.i.k.add(this.h);
            this.h.f = -v1;
        }
        this.u(this.b.f.h);
        this.u(this.b.f.i);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        if(((Guideline)this.b).o2() == 1) {
            this.b.g2(this.h.g);
            return;
        }
        this.b.h2(this.h.g);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.h.c();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        return false;
    }

    private void u(DependencyNode dependencyNode0) {
        this.h.k.add(dependencyNode0);
        dependencyNode0.l.add(this.h);
    }
}

