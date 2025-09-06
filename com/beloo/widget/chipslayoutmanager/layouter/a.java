package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class A extends a {
    static class com.beloo.widget.chipslayoutmanager.layouter.A.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.A.a a$a0) {
        }

        @NonNull
        public A B() {
            return new A(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private boolean w;

    private A(b a$b0) {
        super(a$b0);
    }

    A(b a$b0, com.beloo.widget.chipslayoutmanager.layouter.A.a a$a0) {
        this(a$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.h, this.f, this.L() + this.h, this.f + this.J());
        this.e = rect0.bottom;
        this.f = rect0.bottom;
        this.g = Math.max(this.g, rect0.right);
        return rect0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int M() {
        return this.S();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int P() {
        return this.f - this.m();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int Q() {
        return this.R();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean T(View view0) {
        int v = this.N().r0(view0);
        int v1 = this.N().v0(view0);
        return this.g <= v && v1 < this.f;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.h = this.S();
        this.f = this.m();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Z(View view0) {
        this.f = this.N().p0(view0);
        this.h = this.N().r0(view0);
        this.g = Math.max(this.g, this.N().u0(view0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void a0() {
        if(!this.d.isEmpty()) {
            if(!this.w) {
                this.w = true;
                this.I().l(this.N().K0(((View)((Pair)this.d.get(0)).second)));
            }
            this.I().g(this.d);
        }
    }

    public static b d0() {
        return new b(null);
    }
}

