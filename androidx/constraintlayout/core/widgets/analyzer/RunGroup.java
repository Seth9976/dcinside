package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

class RunGroup {
    public int a;
    public boolean b;
    WidgetRun c;
    WidgetRun d;
    ArrayList e;
    int f;
    int g;
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static int k;

    RunGroup(WidgetRun widgetRun0, int v) {
        this.a = 0;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = new ArrayList();
        this.f = RunGroup.k;
        ++RunGroup.k;
        this.c = widgetRun0;
        this.d = widgetRun0;
        this.g = v;
    }

    public void a(WidgetRun widgetRun0) {
        this.e.add(widgetRun0);
        this.d = widgetRun0;
    }

    public long b(ConstraintWidgetContainer constraintWidgetContainer0, int v) {
        WidgetRun widgetRun0 = this.c;
        long v1 = 0L;
        if(widgetRun0 instanceof ChainRun) {
            if(((ChainRun)widgetRun0).f != v) {
                return 0L;
            }
        }
        else if(v == 0) {
            if(!(widgetRun0 instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        }
        else if(!(widgetRun0 instanceof VerticalWidgetRun)) {
            return 0L;
        }
        HorizontalWidgetRun horizontalWidgetRun0 = v == 0 ? constraintWidgetContainer0.e : constraintWidgetContainer0.f;
        DependencyNode dependencyNode0 = horizontalWidgetRun0.h;
        HorizontalWidgetRun horizontalWidgetRun1 = v == 0 ? constraintWidgetContainer0.e : constraintWidgetContainer0.f;
        DependencyNode dependencyNode1 = horizontalWidgetRun1.i;
        boolean z = widgetRun0.h.l.contains(dependencyNode0);
        boolean z1 = this.c.i.l.contains(dependencyNode1);
        long v2 = this.c.j();
        if(z && z1) {
            long v3 = this.f(this.c.h, 0L);
            long v4 = this.e(this.c.i, 0L);
            long v5 = v3 - v2;
            WidgetRun widgetRun1 = this.c;
            int v6 = widgetRun1.i.f;
            if(v5 >= ((long)(-v6))) {
                v5 += (long)v6;
            }
            int v7 = widgetRun1.h.f;
            long v8 = -v4 - v2 - ((long)v7);
            float f = widgetRun1.b.u(v);
            if(f > 0.0f) {
                v1 = (long)(((float)(v8 < ((long)v7) ? -v4 - v2 - ((long)v7) : v8 - ((long)v7))) / f + ((float)v5) / (1.0f - f));
            }
            return ((long)this.c.h.f) + (((long)(((float)v1) * f + 0.5f)) + v2 + ((long)(((float)v1) * (1.0f - f) + 0.5f))) - ((long)this.c.i.f);
        }
        if(z) {
            return Math.max(this.f(this.c.h, ((long)this.c.h.f)), ((long)this.c.h.f) + v2);
        }
        if(z1) {
            return Math.max(-this.e(this.c.i, ((long)this.c.i.f)), ((long)(-this.c.i.f)) + v2);
        }
        int v9 = this.c.i.f;
        return ((long)this.c.h.f) + this.c.j() - ((long)v9);
    }

    private boolean c(WidgetRun widgetRun0, int v) {
        if(!widgetRun0.b.g[v]) {
            return false;
        }
        for(Object object0: widgetRun0.h.k) {
            Dependency dependency0 = (Dependency)object0;
            if(dependency0 instanceof DependencyNode) {
                WidgetRun widgetRun1 = ((DependencyNode)dependency0).d;
                if(widgetRun1 != widgetRun0 && ((DependencyNode)dependency0) == widgetRun1.h) {
                    if(widgetRun0 instanceof ChainRun) {
                        for(Object object1: ((ChainRun)widgetRun0).k) {
                            this.c(((WidgetRun)object1), v);
                        }
                    }
                    else if(!(widgetRun0 instanceof HelperReferences)) {
                        widgetRun0.b.g[v] = false;
                    }
                    this.c(((DependencyNode)dependency0).d, v);
                }
            }
        }
        for(Object object2: widgetRun0.i.k) {
            Dependency dependency1 = (Dependency)object2;
            if(dependency1 instanceof DependencyNode) {
                WidgetRun widgetRun2 = ((DependencyNode)dependency1).d;
                if(widgetRun2 != widgetRun0 && ((DependencyNode)dependency1) == widgetRun2.h) {
                    if(widgetRun0 instanceof ChainRun) {
                        for(Object object3: ((ChainRun)widgetRun0).k) {
                            this.c(((WidgetRun)object3), v);
                        }
                    }
                    else if(!(widgetRun0 instanceof HelperReferences)) {
                        widgetRun0.b.g[v] = false;
                    }
                    this.c(((DependencyNode)dependency1).d, v);
                }
            }
        }
        return false;
    }

    public void d(boolean z, boolean z1) {
        if(z) {
            WidgetRun widgetRun0 = this.c;
            if(widgetRun0 instanceof HorizontalWidgetRun) {
                this.c(widgetRun0, 0);
            }
        }
        if(z1) {
            WidgetRun widgetRun1 = this.c;
            if(widgetRun1 instanceof VerticalWidgetRun) {
                this.c(widgetRun1, 1);
            }
        }
    }

    private long e(DependencyNode dependencyNode0, long v) {
        WidgetRun widgetRun0 = dependencyNode0.d;
        if(widgetRun0 instanceof HelperReferences) {
            return v;
        }
        int v1 = dependencyNode0.k.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            Dependency dependency0 = (Dependency)dependencyNode0.k.get(v2);
            if(dependency0 instanceof DependencyNode && ((DependencyNode)dependency0).d != widgetRun0) {
                v3 = Math.min(v3, this.e(((DependencyNode)dependency0), ((long)((DependencyNode)dependency0).f) + v));
            }
        }
        if(dependencyNode0 == widgetRun0.i) {
            long v4 = v - widgetRun0.j();
            return Math.min(Math.min(v3, this.e(widgetRun0.h, v4)), v4 - ((long)widgetRun0.h.f));
        }
        return v3;
    }

    private long f(DependencyNode dependencyNode0, long v) {
        WidgetRun widgetRun0 = dependencyNode0.d;
        if(widgetRun0 instanceof HelperReferences) {
            return v;
        }
        int v1 = dependencyNode0.k.size();
        long v3 = v;
        for(int v2 = 0; v2 < v1; ++v2) {
            Dependency dependency0 = (Dependency)dependencyNode0.k.get(v2);
            if(dependency0 instanceof DependencyNode && ((DependencyNode)dependency0).d != widgetRun0) {
                v3 = Math.max(v3, this.f(((DependencyNode)dependency0), ((long)((DependencyNode)dependency0).f) + v));
            }
        }
        if(dependencyNode0 == widgetRun0.h) {
            long v4 = v + widgetRun0.j();
            return Math.max(Math.max(v3, this.f(widgetRun0.i, v4)), v4 - ((long)widgetRun0.i.f));
        }
        return v3;
    }
}

