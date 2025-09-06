package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

class HelperReferences extends WidgetRun {
    HelperReferences(ConstraintWidget constraintWidget0) {
        super(constraintWidget0);
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void a(Dependency dependency0) {
        Barrier barrier0 = (Barrier)this.b;
        int v = barrier0.q2();
        int v1 = 0;
        int v2 = -1;
        for(Object object0: this.h.l) {
            int v3 = ((DependencyNode)object0).g;
            if(v2 == -1 || v3 < v2) {
                v2 = v3;
            }
            if(v1 < v3) {
                v1 = v3;
            }
        }
        if(v != 0 && v != 2) {
            this.h.e(v1 + barrier0.r2());
            return;
        }
        this.h.e(v2 + barrier0.r2());
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        ConstraintWidget constraintWidget0 = this.b;
        if(constraintWidget0 instanceof Barrier) {
            this.h.b = true;
            boolean z = ((Barrier)constraintWidget0).p2();
            int v = 0;
            switch(((Barrier)constraintWidget0).q2()) {
                case 0: {
                    this.h.e = Type.d;
                    while(v < ((Barrier)constraintWidget0).C1) {
                        ConstraintWidget constraintWidget4 = ((Barrier)constraintWidget0).B1[v];
                        if(z || constraintWidget4.l0() != 8) {
                            DependencyNode dependencyNode3 = constraintWidget4.e.h;
                            dependencyNode3.k.add(this.h);
                            this.h.l.add(dependencyNode3);
                        }
                        ++v;
                    }
                    this.u(this.b.e.h);
                    this.u(this.b.e.i);
                    break;
                }
                case 1: {
                    this.h.e = Type.e;
                    while(v < ((Barrier)constraintWidget0).C1) {
                        ConstraintWidget constraintWidget1 = ((Barrier)constraintWidget0).B1[v];
                        if(z || constraintWidget1.l0() != 8) {
                            DependencyNode dependencyNode0 = constraintWidget1.e.i;
                            dependencyNode0.k.add(this.h);
                            this.h.l.add(dependencyNode0);
                        }
                        ++v;
                    }
                    this.u(this.b.e.h);
                    this.u(this.b.e.i);
                    return;
                }
                case 2: {
                    this.h.e = Type.f;
                    while(v < ((Barrier)constraintWidget0).C1) {
                        ConstraintWidget constraintWidget2 = ((Barrier)constraintWidget0).B1[v];
                        if(z || constraintWidget2.l0() != 8) {
                            DependencyNode dependencyNode1 = constraintWidget2.f.h;
                            dependencyNode1.k.add(this.h);
                            this.h.l.add(dependencyNode1);
                        }
                        ++v;
                    }
                    this.u(this.b.f.h);
                    this.u(this.b.f.i);
                    return;
                }
                case 3: {
                    this.h.e = Type.g;
                    while(v < ((Barrier)constraintWidget0).C1) {
                        ConstraintWidget constraintWidget3 = ((Barrier)constraintWidget0).B1[v];
                        if(z || constraintWidget3.l0() != 8) {
                            DependencyNode dependencyNode2 = constraintWidget3.f.i;
                            dependencyNode2.k.add(this.h);
                            this.h.l.add(dependencyNode2);
                        }
                        ++v;
                    }
                    this.u(this.b.f.h);
                    this.u(this.b.f.i);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        ConstraintWidget constraintWidget0 = this.b;
        if(constraintWidget0 instanceof Barrier) {
            switch(((Barrier)constraintWidget0).q2()) {
                case 0: 
                case 1: {
                    this.b.g2(this.h.g);
                    break;
                }
                default: {
                    this.b.h2(this.h.g);
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        this.h.c();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.h.j = false;
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

