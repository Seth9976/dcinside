package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DependencyGraph {
    private ConstraintWidgetContainer a;
    private boolean b;
    private boolean c;
    private ConstraintWidgetContainer d;
    private ArrayList e;
    private ArrayList f;
    private Measurer g;
    private Measure h;
    ArrayList i;
    private static final boolean j = true;
    private static final boolean k = false;

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer0) {
        this.b = true;
        this.c = true;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = null;
        this.h = new Measure();
        this.i = new ArrayList();
        this.a = constraintWidgetContainer0;
        this.d = constraintWidgetContainer0;
    }

    private void a(DependencyNode dependencyNode0, int v, int v1, DependencyNode dependencyNode1, ArrayList arrayList0, RunGroup runGroup0) {
        WidgetRun widgetRun0 = dependencyNode0.d;
        if(widgetRun0.c == null && (widgetRun0 != this.a.e && widgetRun0 != this.a.f)) {
            if(runGroup0 == null) {
                runGroup0 = new RunGroup(widgetRun0, v1);
                arrayList0.add(runGroup0);
            }
            widgetRun0.c = runGroup0;
            runGroup0.a(widgetRun0);
            for(Object object0: widgetRun0.h.k) {
                Dependency dependency0 = (Dependency)object0;
                if(dependency0 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency0), v, 0, dependencyNode1, arrayList0, runGroup0);
                }
            }
            for(Object object1: widgetRun0.i.k) {
                Dependency dependency1 = (Dependency)object1;
                if(dependency1 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency1), v, 1, dependencyNode1, arrayList0, runGroup0);
                }
            }
            if(v == 1 && widgetRun0 instanceof VerticalWidgetRun) {
                for(Object object2: ((VerticalWidgetRun)widgetRun0).k.k) {
                    Dependency dependency2 = (Dependency)object2;
                    if(dependency2 instanceof DependencyNode) {
                        this.a(((DependencyNode)dependency2), 1, 2, dependencyNode1, arrayList0, runGroup0);
                    }
                }
            }
            for(Object object3: widgetRun0.h.l) {
                if(((DependencyNode)object3) == dependencyNode1) {
                    runGroup0.b = true;
                }
                this.a(((DependencyNode)object3), v, 0, dependencyNode1, arrayList0, runGroup0);
            }
            for(Object object4: widgetRun0.i.l) {
                if(((DependencyNode)object4) == dependencyNode1) {
                    runGroup0.b = true;
                }
                this.a(((DependencyNode)object4), v, 1, dependencyNode1, arrayList0, runGroup0);
            }
            if(v == 1 && widgetRun0 instanceof VerticalWidgetRun) {
                for(Object object5: ((VerticalWidgetRun)widgetRun0).k.l) {
                    this.a(((DependencyNode)object5), 1, 2, dependencyNode1, arrayList0, runGroup0);
                }
            }
        }
    }

    private boolean b(ConstraintWidgetContainer constraintWidgetContainer0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour13;
        int v7;
        DimensionBehaviour constraintWidget$DimensionBehaviour12;
        int v5;
        for(Object object0: constraintWidgetContainer0.B1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.b0;
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
            DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
            if(constraintWidget0.l0() == 8) {
                constraintWidget0.a = true;
            }
            else {
                if(constraintWidget0.B < 1.0f && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c) {
                    constraintWidget0.w = 2;
                }
                if(constraintWidget0.E < 1.0f && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c) {
                    constraintWidget0.x = 2;
                }
                if(constraintWidget0.A() > 0.0f) {
                    DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.c;
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && (constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a)) {
                        constraintWidget0.w = 3;
                    }
                    else if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 && (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a)) {
                        constraintWidget0.x = 3;
                    }
                    else if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 && constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2) {
                        if(constraintWidget0.w == 0) {
                            constraintWidget0.w = 3;
                        }
                        if(constraintWidget0.x == 0) {
                            constraintWidget0.x = 3;
                        }
                    }
                }
                DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.c;
                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour3 && constraintWidget0.w == 1 && (constraintWidget0.Q.f == null || constraintWidget0.S.f == null)) {
                    constraintWidget$DimensionBehaviour0 = DimensionBehaviour.b;
                }
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour3 && constraintWidget0.x == 1 && (constraintWidget0.R.f == null || constraintWidget0.T.f == null)) {
                    constraintWidget$DimensionBehaviour1 = DimensionBehaviour.b;
                }
                constraintWidget0.e.d = constraintWidget$DimensionBehaviour0;
                int v = constraintWidget0.w;
                constraintWidget0.e.a = v;
                constraintWidget0.f.d = constraintWidget$DimensionBehaviour1;
                int v1 = constraintWidget0.x;
                constraintWidget0.f.a = v1;
                DimensionBehaviour constraintWidget$DimensionBehaviour4 = DimensionBehaviour.d;
                if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour4 && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.a && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.b || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour4 && constraintWidget$DimensionBehaviour1 != DimensionBehaviour.a && constraintWidget$DimensionBehaviour1 != DimensionBehaviour.b) {
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour3) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour5 = DimensionBehaviour.b;
                        if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a) {
                            if(v == 3) {
                                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour5) {
                                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour5, 0);
                                }
                                int v2 = constraintWidget0.D();
                                this.r(constraintWidget0, DimensionBehaviour.a, ((int)(((float)v2) * constraintWidget0.f0 + 0.5f)), DimensionBehaviour.a, v2);
                                constraintWidget0.e.e.e(constraintWidget0.m0());
                                constraintWidget0.f.e.e(constraintWidget0.D());
                                constraintWidget0.a = true;
                                continue;
                            }
                            else if(v == 1) {
                                this.r(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.e.e.m = constraintWidget0.m0();
                                continue;
                            }
                            else if(v == 2) {
                                DimensionBehaviour constraintWidget$DimensionBehaviour6 = constraintWidgetContainer0.b0[0];
                                DimensionBehaviour constraintWidget$DimensionBehaviour7 = DimensionBehaviour.a;
                                if(constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour7 || constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour4) {
                                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour7, ((int)(constraintWidget0.B * ((float)constraintWidgetContainer0.m0()) + 0.5f)), constraintWidget$DimensionBehaviour1, constraintWidget0.D());
                                    constraintWidget0.e.e.e(constraintWidget0.m0());
                                    constraintWidget0.f.e.e(constraintWidget0.D());
                                    constraintWidget0.a = true;
                                    continue;
                                }
                            }
                            else if(constraintWidget0.Y[0].f == null || constraintWidget0.Y[1].f == null) {
                                this.r(constraintWidget0, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.e.e.e(constraintWidget0.m0());
                                constraintWidget0.f.e.e(constraintWidget0.D());
                                constraintWidget0.a = true;
                                continue;
                            }
                        }
                    }
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour3) {
                        DimensionBehaviour constraintWidget$DimensionBehaviour8 = DimensionBehaviour.b;
                        if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour8 || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a) {
                            if(v1 == 3) {
                                if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour8) {
                                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour8, 0, constraintWidget$DimensionBehaviour8, 0);
                                }
                                int v3 = constraintWidget0.m0();
                                this.r(constraintWidget0, DimensionBehaviour.a, v3, DimensionBehaviour.a, ((int)(((float)v3) * (constraintWidget0.B() == -1 ? 1.0f / constraintWidget0.f0 : constraintWidget0.f0) + 0.5f)));
                                constraintWidget0.e.e.e(constraintWidget0.m0());
                                constraintWidget0.f.e.e(constraintWidget0.D());
                                constraintWidget0.a = true;
                                continue;
                            }
                            else if(v1 == 1) {
                                this.r(constraintWidget0, constraintWidget$DimensionBehaviour0, 0, constraintWidget$DimensionBehaviour8, 0);
                                constraintWidget0.f.e.m = constraintWidget0.D();
                                continue;
                            }
                            else if(v1 == 2) {
                                DimensionBehaviour constraintWidget$DimensionBehaviour9 = constraintWidgetContainer0.b0[1];
                                DimensionBehaviour constraintWidget$DimensionBehaviour10 = DimensionBehaviour.a;
                                if(constraintWidget$DimensionBehaviour9 == constraintWidget$DimensionBehaviour10 || constraintWidget$DimensionBehaviour9 == constraintWidget$DimensionBehaviour4) {
                                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour0, constraintWidget0.m0(), constraintWidget$DimensionBehaviour10, ((int)(constraintWidget0.E * ((float)constraintWidgetContainer0.D()) + 0.5f)));
                                    constraintWidget0.e.e.e(constraintWidget0.m0());
                                    constraintWidget0.f.e.e(constraintWidget0.D());
                                    constraintWidget0.a = true;
                                    continue;
                                }
                            }
                            else if(constraintWidget0.Y[2].f == null || constraintWidget0.Y[3].f == null) {
                                this.r(constraintWidget0, constraintWidget$DimensionBehaviour8, 0, constraintWidget$DimensionBehaviour1, 0);
                                constraintWidget0.e.e.e(constraintWidget0.m0());
                                constraintWidget0.f.e.e(constraintWidget0.D());
                                constraintWidget0.a = true;
                                continue;
                            }
                        }
                    }
                    if(constraintWidget$DimensionBehaviour0 != constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour1 != constraintWidget$DimensionBehaviour3) {
                        continue;
                    }
                    if(v == 1 || v1 == 1) {
                        this.r(constraintWidget0, DimensionBehaviour.b, 0, DimensionBehaviour.b, 0);
                        constraintWidget0.e.e.m = constraintWidget0.m0();
                        constraintWidget0.f.e.m = constraintWidget0.D();
                    }
                    else {
                        if(v1 != 2 || v != 2) {
                            continue;
                        }
                        DimensionBehaviour constraintWidget$DimensionBehaviour11 = DimensionBehaviour.a;
                        if(constraintWidgetContainer0.b0[0] != constraintWidget$DimensionBehaviour11 || constraintWidgetContainer0.b0[1] != constraintWidget$DimensionBehaviour11) {
                            continue;
                        }
                        this.r(constraintWidget0, constraintWidget$DimensionBehaviour11, ((int)(constraintWidget0.B * ((float)constraintWidgetContainer0.m0()) + 0.5f)), constraintWidget$DimensionBehaviour11, ((int)(constraintWidget0.E * ((float)constraintWidgetContainer0.D()) + 0.5f)));
                        constraintWidget0.e.e.e(constraintWidget0.m0());
                        constraintWidget0.f.e.e(constraintWidget0.D());
                        constraintWidget0.a = true;
                    }
                }
                else {
                    int v4 = constraintWidget0.m0();
                    if(constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour4) {
                        v5 = constraintWidgetContainer0.m0() - constraintWidget0.Q.g - constraintWidget0.S.g;
                        constraintWidget$DimensionBehaviour12 = DimensionBehaviour.a;
                    }
                    else {
                        v5 = v4;
                        constraintWidget$DimensionBehaviour12 = constraintWidget$DimensionBehaviour0;
                    }
                    int v6 = constraintWidget0.D();
                    if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour4) {
                        v7 = constraintWidgetContainer0.D() - constraintWidget0.R.g - constraintWidget0.T.g;
                        constraintWidget$DimensionBehaviour13 = DimensionBehaviour.a;
                    }
                    else {
                        v7 = v6;
                        constraintWidget$DimensionBehaviour13 = constraintWidget$DimensionBehaviour1;
                    }
                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour12, v5, constraintWidget$DimensionBehaviour13, v7);
                    constraintWidget0.e.e.e(constraintWidget0.m0());
                    constraintWidget0.f.e.e(constraintWidget0.D());
                    constraintWidget0.a = true;
                }
            }
        }
        return false;
    }

    public void c() {
        this.d(this.e);
        this.i.clear();
        RunGroup.k = 0;
        this.k(this.a.e, 0, this.i);
        this.k(this.a.f, 1, this.i);
        this.b = false;
    }

    public void d(ArrayList arrayList0) {
        arrayList0.clear();
        this.d.e.f();
        this.d.f.f();
        arrayList0.add(this.d.e);
        arrayList0.add(this.d.f);
        Collection collection0 = null;
        for(Object object0: this.d.B1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            if(constraintWidget0 instanceof Guideline) {
                arrayList0.add(new GuidelineReference(constraintWidget0));
            }
            else {
                if(constraintWidget0.B0()) {
                    if(constraintWidget0.c == null) {
                        constraintWidget0.c = new ChainRun(constraintWidget0, 0);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(constraintWidget0.c);
                }
                else {
                    arrayList0.add(constraintWidget0.e);
                }
                if(constraintWidget0.D0()) {
                    if(constraintWidget0.d == null) {
                        constraintWidget0.d = new ChainRun(constraintWidget0, 1);
                    }
                    if(collection0 == null) {
                        collection0 = new HashSet();
                    }
                    ((HashSet)collection0).add(constraintWidget0.d);
                }
                else {
                    arrayList0.add(constraintWidget0.f);
                }
                if(constraintWidget0 instanceof HelperWidget) {
                    arrayList0.add(new HelperReferences(constraintWidget0));
                }
            }
        }
        if(collection0 != null) {
            arrayList0.addAll(collection0);
        }
        for(Object object1: arrayList0) {
            ((WidgetRun)object1).f();
        }
        for(Object object2: arrayList0) {
            WidgetRun widgetRun0 = (WidgetRun)object2;
            if(widgetRun0.b != this.d) {
                widgetRun0.d();
            }
        }
    }

    private int e(ConstraintWidgetContainer constraintWidgetContainer0, int v) {
        int v1 = this.i.size();
        long v2 = 0L;
        for(int v3 = 0; v3 < v1; ++v3) {
            v2 = Math.max(v2, ((RunGroup)this.i.get(v3)).b(constraintWidgetContainer0, v));
        }
        return (int)v2;
    }

    public void f(DimensionBehaviour constraintWidget$DimensionBehaviour0, DimensionBehaviour constraintWidget$DimensionBehaviour1) {
        if(this.b) {
            this.c();
            boolean z = false;
            for(Object object0: this.a.B1) {
                boolean[] arr_z = ((ConstraintWidget)object0).g;
                arr_z[0] = true;
                arr_z[1] = true;
                if(((ConstraintWidget)object0) instanceof Barrier) {
                    z = true;
                }
            }
            if(!z) {
                for(Object object1: this.i) {
                    ((RunGroup)object1).d(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b, constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b);
                }
            }
        }
    }

    public boolean g(boolean z) {
        boolean z2;
        boolean z1 = false;
        if(this.b || this.c) {
            for(Object object0: this.a.B1) {
                ((ConstraintWidget)object0).q();
                ((ConstraintWidget)object0).a = false;
                ((ConstraintWidget)object0).e.n();
                ((ConstraintWidget)object0).f.n();
            }
            this.a.q();
            ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
            constraintWidgetContainer0.a = false;
            constraintWidgetContainer0.e.n();
            this.a.f.n();
            this.c = false;
        }
        if(this.b(this.d)) {
            return false;
        }
        this.a.g2(0);
        this.a.h2(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.a.z(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = this.a.z(1);
        if(this.b) {
            this.c();
        }
        int v = this.a.o0();
        int v1 = this.a.p0();
        this.a.e.h.e(v);
        this.a.f.h.e(v1);
        this.s();
        if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b) {
            if(z) {
                for(Object object1: this.e) {
                    if(!((WidgetRun)object1).p()) {
                        z = false;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(z && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b) {
                this.a.E1(DimensionBehaviour.a);
                this.a.d2(this.e(this.a, 0));
                this.a.e.e.e(this.a.m0());
            }
            if(z && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b) {
                this.a.Z1(DimensionBehaviour.a);
                this.a.z1(this.e(this.a, 1));
                this.a.f.e.e(this.a.D());
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer1 = this.a;
        DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidgetContainer1.b0[0];
        DimensionBehaviour constraintWidget$DimensionBehaviour3 = DimensionBehaviour.a;
        if(constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour2 == DimensionBehaviour.d) {
            int v2 = constraintWidgetContainer1.m0() + v;
            this.a.e.i.e(v2);
            this.a.e.e.e(v2 - v);
            this.s();
            ConstraintWidgetContainer constraintWidgetContainer2 = this.a;
            DimensionBehaviour constraintWidget$DimensionBehaviour4 = constraintWidgetContainer2.b0[1];
            if(constraintWidget$DimensionBehaviour4 == constraintWidget$DimensionBehaviour3 || constraintWidget$DimensionBehaviour4 == DimensionBehaviour.d) {
                int v3 = constraintWidgetContainer2.D() + v1;
                this.a.f.i.e(v3);
                this.a.f.e.e(v3 - v1);
            }
            this.s();
            z2 = true;
        }
        else {
            z2 = false;
        }
        for(Object object2: this.e) {
            WidgetRun widgetRun0 = (WidgetRun)object2;
            if(widgetRun0.b != this.a || widgetRun0.g) {
                widgetRun0.e();
            }
        }
        for(Object object3: this.e) {
            WidgetRun widgetRun1 = (WidgetRun)object3;
            if(!z2 && widgetRun1.b == this.a || widgetRun1.h.j && (widgetRun1.i.j || widgetRun1 instanceof GuidelineReference) && (widgetRun1.e.j || widgetRun1 instanceof ChainRun || widgetRun1 instanceof GuidelineReference)) {
                continue;
            }
            this.a.E1(constraintWidget$DimensionBehaviour0);
            this.a.Z1(constraintWidget$DimensionBehaviour1);
            return z1;
        }
        this.a.E1(constraintWidget$DimensionBehaviour0);
        this.a.Z1(constraintWidget$DimensionBehaviour1);
        return true;
    }

    public boolean h(boolean z) {
        if(this.b) {
            for(Object object0: this.a.B1) {
                ((ConstraintWidget)object0).q();
                ((ConstraintWidget)object0).a = false;
                ((ConstraintWidget)object0).e.e.j = false;
                ((ConstraintWidget)object0).e.g = false;
                ((ConstraintWidget)object0).e.n();
                ((ConstraintWidget)object0).f.e.j = false;
                ((ConstraintWidget)object0).f.g = false;
                ((ConstraintWidget)object0).f.n();
            }
            this.a.q();
            ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
            constraintWidgetContainer0.a = false;
            constraintWidgetContainer0.e.e.j = false;
            constraintWidgetContainer0.e.g = false;
            constraintWidgetContainer0.e.n();
            this.a.f.e.j = false;
            this.a.f.g = false;
            this.a.f.n();
            this.c();
        }
        if(this.b(this.d)) {
            return false;
        }
        this.a.g2(0);
        this.a.h2(0);
        this.a.e.h.e(0);
        this.a.f.h.e(0);
        return true;
    }

    public boolean i(boolean z, int v) {
        boolean z2;
        boolean z1 = false;
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = this.a.z(0);
        DimensionBehaviour constraintWidget$DimensionBehaviour1 = this.a.z(1);
        int v1 = this.a.o0();
        int v2 = this.a.p0();
        if(z && (constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b)) {
            for(Object object0: this.e) {
                if(((WidgetRun)object0).f == v && !((WidgetRun)object0).p()) {
                    z = false;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(v != 0) {
                if(z && constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b) {
                    this.a.Z1(DimensionBehaviour.a);
                    this.a.z1(this.e(this.a, 1));
                    this.a.f.e.e(this.a.D());
                }
            }
            else if(z && constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b) {
                this.a.E1(DimensionBehaviour.a);
                this.a.d2(this.e(this.a, 0));
                this.a.e.e.e(this.a.m0());
            }
        }
        if(v == 0) {
            ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
            DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidgetContainer0.b0[0];
            if(constraintWidget$DimensionBehaviour2 != DimensionBehaviour.a && constraintWidget$DimensionBehaviour2 != DimensionBehaviour.d) {
                z2 = false;
            }
            else {
                int v3 = constraintWidgetContainer0.m0() + v1;
                this.a.e.i.e(v3);
                this.a.e.e.e(v3 - v1);
                z2 = true;
            }
        }
        else {
            ConstraintWidgetContainer constraintWidgetContainer1 = this.a;
            DimensionBehaviour constraintWidget$DimensionBehaviour3 = constraintWidgetContainer1.b0[1];
            if(constraintWidget$DimensionBehaviour3 == DimensionBehaviour.a || constraintWidget$DimensionBehaviour3 == DimensionBehaviour.d) {
                int v4 = constraintWidgetContainer1.D() + v2;
                this.a.f.i.e(v4);
                this.a.f.e.e(v4 - v2);
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        this.s();
        for(Object object1: this.e) {
            WidgetRun widgetRun0 = (WidgetRun)object1;
            if(widgetRun0.f == v && (widgetRun0.b != this.a || widgetRun0.g)) {
                widgetRun0.e();
            }
        }
        for(Object object2: this.e) {
            WidgetRun widgetRun1 = (WidgetRun)object2;
            if(widgetRun1.f != v || !z2 && widgetRun1.b == this.a || widgetRun1.h.j && widgetRun1.i.j && (widgetRun1 instanceof ChainRun || widgetRun1.e.j)) {
                continue;
            }
            this.a.E1(constraintWidget$DimensionBehaviour0);
            this.a.Z1(constraintWidget$DimensionBehaviour1);
            return z1;
        }
        this.a.E1(constraintWidget$DimensionBehaviour0);
        this.a.Z1(constraintWidget$DimensionBehaviour1);
        return true;
    }

    private void j() {
        String s = "digraph {\n";
        for(Object object0: this.e) {
            s = this.m(((WidgetRun)object0), s);
        }
        System.out.println("content:<<\n" + (s + "\n}\n") + "\n>>");
    }

    private void k(WidgetRun widgetRun0, int v, ArrayList arrayList0) {
        for(Object object0: widgetRun0.h.k) {
            Dependency dependency0 = (Dependency)object0;
            if(dependency0 instanceof DependencyNode) {
                this.a(((DependencyNode)dependency0), v, 0, widgetRun0.i, arrayList0, null);
            }
            else if(dependency0 instanceof WidgetRun) {
                this.a(((WidgetRun)dependency0).h, v, 0, widgetRun0.i, arrayList0, null);
            }
        }
        for(Object object1: widgetRun0.i.k) {
            Dependency dependency1 = (Dependency)object1;
            if(dependency1 instanceof DependencyNode) {
                this.a(((DependencyNode)dependency1), v, 1, widgetRun0.h, arrayList0, null);
            }
            else if(dependency1 instanceof WidgetRun) {
                this.a(((WidgetRun)dependency1).i, v, 1, widgetRun0.h, arrayList0, null);
            }
        }
        if(v == 1) {
            for(Object object2: ((VerticalWidgetRun)widgetRun0).k.k) {
                Dependency dependency2 = (Dependency)object2;
                if(dependency2 instanceof DependencyNode) {
                    this.a(((DependencyNode)dependency2), 1, 2, null, arrayList0, null);
                }
            }
        }
    }

    private String l(ChainRun chainRun0, String s) {
        int v = chainRun0.f;
        StringBuilder stringBuilder0 = new StringBuilder("subgraph ");
        stringBuilder0.append("cluster_");
        stringBuilder0.append(chainRun0.b.y());
        if(v == 0) {
            stringBuilder0.append("_h");
        }
        else {
            stringBuilder0.append("_v");
        }
        stringBuilder0.append(" {\n");
        String s1 = "";
        for(Object object0: chainRun0.k) {
            stringBuilder0.append(((WidgetRun)object0).b.y());
            if(v == 0) {
                stringBuilder0.append("_HORIZONTAL");
            }
            else {
                stringBuilder0.append("_VERTICAL");
            }
            stringBuilder0.append(";\n");
            s1 = this.m(((WidgetRun)object0), s1);
        }
        stringBuilder0.append("}\n");
        return s + s1 + stringBuilder0;
    }

    private String m(WidgetRun widgetRun0, String s) {
        DependencyNode dependencyNode0 = widgetRun0.h;
        DependencyNode dependencyNode1 = widgetRun0.i;
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(!(widgetRun0 instanceof HelperReferences) && dependencyNode0.k.isEmpty() && dependencyNode1.k.isEmpty() && dependencyNode0.l.isEmpty() && dependencyNode1.l.isEmpty()) {
            return s;
        }
        stringBuilder0.append(this.t(widgetRun0));
        boolean z = this.q(dependencyNode0, dependencyNode1);
        String s1 = this.n(dependencyNode1, z, this.n(dependencyNode0, z, s));
        if(widgetRun0 instanceof VerticalWidgetRun) {
            s1 = this.n(((VerticalWidgetRun)widgetRun0).k, z, s1);
        }
        if(widgetRun0 instanceof HorizontalWidgetRun || widgetRun0 instanceof ChainRun && ((ChainRun)widgetRun0).f == 0) {
            DimensionBehaviour constraintWidget$DimensionBehaviour1 = widgetRun0.b.H();
            if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.a || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.b) {
                if(!dependencyNode0.l.isEmpty() && dependencyNode1.l.isEmpty()) {
                    stringBuilder0.append("\n");
                    stringBuilder0.append(dependencyNode1.d());
                    stringBuilder0.append(" -> ");
                    stringBuilder0.append(dependencyNode0.d());
                    stringBuilder0.append("\n");
                    return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
                }
                if(dependencyNode0.l.isEmpty() && !dependencyNode1.l.isEmpty()) {
                    stringBuilder0.append("\n");
                    stringBuilder0.append(dependencyNode0.d());
                    stringBuilder0.append(" -> ");
                    stringBuilder0.append(dependencyNode1.d());
                    stringBuilder0.append("\n");
                }
            }
            else if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c && widgetRun0.b.A() > 0.0f) {
                stringBuilder0.append("\n");
                stringBuilder0.append(widgetRun0.b.y());
                stringBuilder0.append("_HORIZONTAL -> ");
                stringBuilder0.append(widgetRun0.b.y());
                stringBuilder0.append("_VERTICAL;\n");
                return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
            }
        }
        else if(widgetRun0 instanceof VerticalWidgetRun || widgetRun0 instanceof ChainRun && ((ChainRun)widgetRun0).f == 1) {
            DimensionBehaviour constraintWidget$DimensionBehaviour0 = widgetRun0.b.j0();
            if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.a || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.b) {
                if(!dependencyNode0.l.isEmpty() && dependencyNode1.l.isEmpty()) {
                    stringBuilder0.append("\n");
                    stringBuilder0.append(dependencyNode1.d());
                    stringBuilder0.append(" -> ");
                    stringBuilder0.append(dependencyNode0.d());
                    stringBuilder0.append("\n");
                    return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
                }
                if(dependencyNode0.l.isEmpty() && !dependencyNode1.l.isEmpty()) {
                    stringBuilder0.append("\n");
                    stringBuilder0.append(dependencyNode0.d());
                    stringBuilder0.append(" -> ");
                    stringBuilder0.append(dependencyNode1.d());
                    stringBuilder0.append("\n");
                    return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
                }
            }
            else if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c && widgetRun0.b.A() > 0.0f) {
                stringBuilder0.append("\n");
                stringBuilder0.append(widgetRun0.b.y());
                stringBuilder0.append("_VERTICAL -> ");
                stringBuilder0.append(widgetRun0.b.y());
                stringBuilder0.append("_HORIZONTAL;\n");
                return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
            }
        }
        return widgetRun0 instanceof ChainRun ? this.l(((ChainRun)widgetRun0), s1) : stringBuilder0.toString();
    }

    private String n(DependencyNode dependencyNode0, boolean z, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        for(Object object0: dependencyNode0.l) {
            String s1 = "\n" + dependencyNode0.d() + " -> " + ((DependencyNode)object0).d();
            if(dependencyNode0.f > 0 || z || dependencyNode0.d instanceof HelperReferences) {
                String s2 = s1 + "[";
                if(dependencyNode0.f > 0) {
                    s2 = s2 + "label=\"" + dependencyNode0.f + "\"";
                    if(z) {
                        s2 = s2 + ",";
                    }
                }
                if(z) {
                    s2 = s2 + " style=dashed ";
                }
                if(dependencyNode0.d instanceof HelperReferences) {
                    s2 = s2 + " style=bold,color=gray ";
                }
                s1 = s2 + "]";
            }
            stringBuilder0.append(s1 + "\n");
        }
        return stringBuilder0.toString();
    }

    public void o() {
        this.b = true;
    }

    public void p() {
        this.c = true;
    }

    private boolean q(DependencyNode dependencyNode0, DependencyNode dependencyNode1) {
        int v = 0;
        for(Object object0: dependencyNode0.l) {
            if(((DependencyNode)object0) != dependencyNode1) {
                ++v;
            }
        }
        int v1 = 0;
        for(Object object1: dependencyNode1.l) {
            if(((DependencyNode)object1) != dependencyNode0) {
                ++v1;
            }
        }
        return v > 0 && v1 > 0;
    }

    private void r(ConstraintWidget constraintWidget0, DimensionBehaviour constraintWidget$DimensionBehaviour0, int v, DimensionBehaviour constraintWidget$DimensionBehaviour1, int v1) {
        this.h.a = constraintWidget$DimensionBehaviour0;
        this.h.b = constraintWidget$DimensionBehaviour1;
        this.h.c = v;
        this.h.d = v1;
        this.g.b(constraintWidget0, this.h);
        constraintWidget0.d2(this.h.e);
        constraintWidget0.z1(this.h.f);
        constraintWidget0.y1(this.h.h);
        constraintWidget0.h1(this.h.g);
    }

    public void s() {
        for(Object object0: this.a.B1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            if(!constraintWidget0.a) {
                DimensionBehaviour[] arr_constraintWidget$DimensionBehaviour = constraintWidget0.b0;
                boolean z = false;
                DimensionBehaviour constraintWidget$DimensionBehaviour0 = arr_constraintWidget$DimensionBehaviour[0];
                DimensionBehaviour constraintWidget$DimensionBehaviour1 = arr_constraintWidget$DimensionBehaviour[1];
                DimensionBehaviour constraintWidget$DimensionBehaviour2 = DimensionBehaviour.b;
                boolean z1 = constraintWidget$DimensionBehaviour0 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c && constraintWidget0.w == 1;
                if(constraintWidget$DimensionBehaviour1 == constraintWidget$DimensionBehaviour2 || constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c && constraintWidget0.x == 1) {
                    z = true;
                }
                DimensionDependency dimensionDependency0 = constraintWidget0.e.e;
                boolean z2 = dimensionDependency0.j;
                DimensionDependency dimensionDependency1 = constraintWidget0.f.e;
                boolean z3 = dimensionDependency1.j;
                if(z2 && z3) {
                    this.r(constraintWidget0, DimensionBehaviour.a, dimensionDependency0.g, DimensionBehaviour.a, dimensionDependency1.g);
                    constraintWidget0.a = true;
                }
                else if(z2 && z) {
                    this.r(constraintWidget0, DimensionBehaviour.a, dimensionDependency0.g, constraintWidget$DimensionBehaviour2, dimensionDependency1.g);
                    if(constraintWidget$DimensionBehaviour1 == DimensionBehaviour.c) {
                        constraintWidget0.f.e.m = constraintWidget0.D();
                    }
                    else {
                        constraintWidget0.f.e.e(constraintWidget0.D());
                        constraintWidget0.a = true;
                    }
                }
                else if(z3 && z1) {
                    this.r(constraintWidget0, constraintWidget$DimensionBehaviour2, dimensionDependency0.g, DimensionBehaviour.a, dimensionDependency1.g);
                    if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c) {
                        constraintWidget0.e.e.m = constraintWidget0.m0();
                    }
                    else {
                        constraintWidget0.e.e.e(constraintWidget0.m0());
                        constraintWidget0.a = true;
                    }
                }
                if(constraintWidget0.a) {
                    DimensionDependency dimensionDependency2 = constraintWidget0.f.l;
                    if(dimensionDependency2 != null) {
                        dimensionDependency2.e(constraintWidget0.t());
                    }
                }
            }
        }
    }

    private String t(WidgetRun widgetRun0) {
        String s = widgetRun0.b.y();
        StringBuilder stringBuilder0 = new StringBuilder(s);
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = widgetRun0 instanceof VerticalWidgetRun ? widgetRun0.b.j0() : widgetRun0.b.H();
        RunGroup runGroup0 = widgetRun0.c;
        if(widgetRun0 instanceof VerticalWidgetRun) {
            stringBuilder0.append("_VERTICAL");
        }
        else {
            stringBuilder0.append("_HORIZONTAL");
        }
        stringBuilder0.append(" [shape=none, label=<");
        stringBuilder0.append("<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">");
        stringBuilder0.append("  <TR>");
        if(widgetRun0 instanceof VerticalWidgetRun) {
            stringBuilder0.append("    <TD ");
            if(widgetRun0.h.j) {
                stringBuilder0.append(" BGCOLOR=\"green\"");
            }
            stringBuilder0.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        else {
            stringBuilder0.append("    <TD ");
            if(widgetRun0.h.j) {
                stringBuilder0.append(" BGCOLOR=\"green\"");
            }
            stringBuilder0.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        }
        stringBuilder0.append("    <TD BORDER=\"1\" ");
        boolean z = widgetRun0.e.j;
        if(z && !widgetRun0.b.a) {
            stringBuilder0.append(" BGCOLOR=\"green\" ");
        }
        else if(z) {
            stringBuilder0.append(" BGCOLOR=\"lightgray\" ");
        }
        else if(widgetRun0.b.a) {
            stringBuilder0.append(" BGCOLOR=\"yellow\" ");
        }
        if(constraintWidget$DimensionBehaviour0 == DimensionBehaviour.c) {
            stringBuilder0.append("style=\"dashed\"");
        }
        stringBuilder0.append(">");
        stringBuilder0.append(s);
        if(runGroup0 != null) {
            stringBuilder0.append(" [");
            stringBuilder0.append(runGroup0.f + 1);
            stringBuilder0.append("/");
            stringBuilder0.append(RunGroup.k);
            stringBuilder0.append("]");
        }
        stringBuilder0.append(" </TD>");
        if(widgetRun0 instanceof VerticalWidgetRun) {
            stringBuilder0.append("    <TD ");
            if(((VerticalWidgetRun)widgetRun0).k.j) {
                stringBuilder0.append(" BGCOLOR=\"green\"");
            }
            stringBuilder0.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            stringBuilder0.append("    <TD ");
            if(widgetRun0.i.j) {
                stringBuilder0.append(" BGCOLOR=\"green\"");
            }
            stringBuilder0.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        else {
            stringBuilder0.append("    <TD ");
            if(widgetRun0.i.j) {
                stringBuilder0.append(" BGCOLOR=\"green\"");
            }
            stringBuilder0.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        }
        stringBuilder0.append("  </TR></TABLE>");
        stringBuilder0.append(">];\n");
        return stringBuilder0.toString();
    }

    public void u(Measurer basicMeasure$Measurer0) {
        this.g = basicMeasure$Measurer0;
    }
}

