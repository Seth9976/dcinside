package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class z extends a implements h {
    static class com.beloo.widget.chipslayoutmanager.layouter.z.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.z.a z$a0) {
        }

        @NonNull
        public z B() {
            return new z(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private static final String w = "z";

    static {
    }

    private z(b z$b0) {
        super(z$b0);
    }

    z(b z$b0, com.beloo.widget.chipslayoutmanager.layouter.z.a z$a0) {
        this(z$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.h, this.e - this.J(), this.h + this.L(), this.e);
        this.h = rect0.right;
        return rect0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int M() {
        return this.u();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int P() {
        return this.o() - this.h;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int Q() {
        return this.C();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean T(View view0) {
        int v = this.N().p0(view0);
        int v1 = this.N().r0(view0);
        return this.f >= v && v1 < this.h;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return true;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.h = this.d();
        this.e = this.f;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public void Z(View view0) {
        if(this.h == this.d() || this.h + this.L() <= this.o()) {
            this.h = this.N().u0(view0);
        }
        else {
            this.h = this.d();
            this.e = this.f;
        }
        this.f = Math.min(this.f, this.N().v0(view0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void a0() {
        int v = -(this.o() - this.h);
        this.h = this.d.size() <= 0 ? 0 : 0x7FFFFFFF;
        for(Object object0: this.d) {
            int v1 = ((Rect)((Pair)object0).first).left - v;
            ((Rect)((Pair)object0).first).left = v1;
            ((Rect)((Pair)object0).first).right -= v;
            this.h = Math.min(this.h, v1);
            this.f = Math.min(this.f, ((Rect)((Pair)object0).first).top);
            this.e = Math.max(this.e, ((Rect)((Pair)object0).first).bottom);
        }
    }

    public static b d0() {
        return new b(null);
    }
}

