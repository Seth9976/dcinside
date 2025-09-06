package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class w extends a {
    static class com.beloo.widget.chipslayoutmanager.layouter.w.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.w.a w$a0) {
        }

        @NonNull
        public w B() {
            return new w(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private boolean w;

    private w(b w$b0) {
        super(w$b0);
    }

    w(b w$b0, com.beloo.widget.chipslayoutmanager.layouter.w.a w$a0) {
        this(w$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.g - this.L(), this.f, this.g, this.J() + this.f);
        this.g = rect0.left;
        this.e = Math.max(this.e, rect0.bottom);
        return rect0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int M() {
        return this.u();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int P() {
        return this.o() - this.g;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int Q() {
        return this.C();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean T(View view0) {
        int v = this.N().v0(view0);
        int v1 = this.N().u0(view0);
        return this.e <= v && v1 > this.g;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.g = this.o();
        this.f = this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public void Z(View view0) {
        this.f = this.N().v0(view0);
        this.g = this.N().r0(view0);
        this.e = Math.max(this.e, this.N().p0(view0));
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

