package androidx.constraintlayout.core.widgets.analyzer;

class BaselineDimensionDependency extends DimensionDependency {
    BaselineDimensionDependency(WidgetRun widgetRun0) {
        super(widgetRun0);
    }

    public void f(DependencyNode dependencyNode0) {
        ((VerticalWidgetRun)this.d).k.f = this.d.b.t();
        this.j = true;
    }
}

