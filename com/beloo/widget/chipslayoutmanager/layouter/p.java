package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class p extends a {
    static class com.beloo.widget.chipslayoutmanager.layouter.p.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.p.a p$a0) {
        }

        @NonNull
        public p B() {
            return new p(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private boolean w;

    private p(b p$b0) {
        super(p$b0);
    }

    p(b p$b0, com.beloo.widget.chipslayoutmanager.layouter.p.a p$a0) {
        this(p$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.h, this.f, this.L() + this.h, this.f + this.J());
        this.h = rect0.right;
        this.e = Math.max(this.e, rect0.bottom);
        return rect0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int M() {
        return this.u();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int P() {
        return this.h - this.d();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int Q() {
        return this.C();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean T(View view0) {
        int v = this.N().v0(view0);
        int v1 = this.N().r0(view0);
        return this.e <= v && v1 < this.h;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return false;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.h = this.d();
        this.f = this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public void Z(View view0) {
        this.f = this.N().v0(view0);
        this.h = this.N().u0(view0);
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

