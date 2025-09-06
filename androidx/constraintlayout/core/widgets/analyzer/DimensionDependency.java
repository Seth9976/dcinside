package androidx.constraintlayout.core.widgets.analyzer;

class DimensionDependency extends DependencyNode {
    public int m;

    DimensionDependency(WidgetRun widgetRun0) {
        super(widgetRun0);
        if(widgetRun0 instanceof HorizontalWidgetRun) {
            this.e = Type.b;
            return;
        }
        this.e = Type.c;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.DependencyNode
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
}

