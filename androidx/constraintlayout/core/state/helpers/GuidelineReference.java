package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.Reference;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Guideline;

public class GuidelineReference implements Reference, Facade {
    final State a;
    private int b;
    private Guideline c;
    private int d;
    private int e;
    private float f;
    private Object g;

    public GuidelineReference(State state0) {
        this.d = -1;
        this.e = -1;
        this.f = 0.0f;
        this.a = state0;
    }

    @Override  // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public ConstraintWidget a() {
        if(this.c == null) {
            this.c = new Guideline();
        }
        return this.c;
    }

    @Override  // androidx.constraintlayout.core.state.helpers.Facade, androidx.constraintlayout.core.state.Reference
    public void apply() {
        this.c.D2(this.b);
        int v = this.d;
        if(v != -1) {
            this.c.y2(v);
            return;
        }
        int v1 = this.e;
        if(v1 != -1) {
            this.c.z2(v1);
            return;
        }
        this.c.A2(this.f);
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void b(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 instanceof Guideline) {
            this.c = (Guideline)constraintWidget0;
            return;
        }
        this.c = null;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public void c(Object object0) {
        this.g = object0;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Facade d() {
        return null;
    }

    public GuidelineReference e(Object object0) {
        this.d = -1;
        this.e = this.a.g(object0);
        this.f = 0.0f;
        return this;
    }

    public int f() {
        return this.b;
    }

    public GuidelineReference g(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    @Override  // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.g;
    }

    public void h(int v) {
        this.b = v;
    }

    public GuidelineReference i(Object object0) {
        this.d = this.a.g(object0);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}

