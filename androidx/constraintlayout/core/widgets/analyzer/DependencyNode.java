package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

public class DependencyNode implements Dependency {
    static enum Type {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE;

        private static Type[] a() [...] // Inlined contents
    }

    public Dependency a;
    public boolean b;
    public boolean c;
    WidgetRun d;
    Type e;
    int f;
    public int g;
    int h;
    DimensionDependency i;
    public boolean j;
    List k;
    List l;

    public DependencyNode(WidgetRun widgetRun0) {
        this.a = null;
        this.b = false;
        this.c = false;
        this.e = Type.a;
        this.h = 1;
        this.i = null;
        this.j = false;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.d = widgetRun0;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void a(Dependency dependency0) {
        for(Object object0: this.l) {
            if(!((DependencyNode)object0).j) {
                return;
            }
            if(false) {
                break;
            }
        }
        this.c = true;
        Dependency dependency1 = this.a;
        if(dependency1 != null) {
            dependency1.a(this);
        }
        if(this.b) {
            this.d.a(this);
            return;
        }
        DependencyNode dependencyNode0 = null;
        int v = 0;
        for(Object object1: this.l) {
            DependencyNode dependencyNode1 = (DependencyNode)object1;
            if(!(dependencyNode1 instanceof DimensionDependency)) {
                ++v;
                dependencyNode0 = dependencyNode1;
            }
        }
        if(dependencyNode0 != null && v == 1 && dependencyNode0.j) {
            DimensionDependency dimensionDependency0 = this.i;
            if(dimensionDependency0 != null) {
                if(dimensionDependency0.j) {
                    this.f = this.h * dimensionDependency0.g;
                    goto label_30;
                }
                return;
            }
        label_30:
            this.e(dependencyNode0.g + this.f);
        }
        Dependency dependency2 = this.a;
        if(dependency2 != null) {
            dependency2.a(this);
        }
    }

    public void b(Dependency dependency0) {
        this.k.add(dependency0);
        if(this.j) {
            dependency0.a(dependency0);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public String d() {
        String s = this.d.b.y();
        return this.e == Type.d || this.e == Type.e ? s + "_HORIZONTAL" + ":" + this.e.name() : s + "_VERTICAL" + ":" + this.e.name();
    }

    public void e(int v) {
        if(this.j) {
            return;
        }
        this.j = true;
        this.g = v;
        for(Object object0: this.k) {
            ((Dependency)object0).a(((Dependency)object0));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.d.b.y());
        stringBuilder0.append(":");
        stringBuilder0.append(this.e);
        stringBuilder0.append("(");
        Integer integer0 = this.j ? this.g : "unresolved";
        stringBuilder0.append(integer0);
        stringBuilder0.append(") <t=");
        stringBuilder0.append(this.l.size());
        stringBuilder0.append(":d=");
        stringBuilder0.append(this.k.size());
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

