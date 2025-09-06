package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class u extends a {
    static class com.beloo.widget.chipslayoutmanager.layouter.u.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.u.a u$a0) {
        }

        @NonNull
        public u B() {
            return new u(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private u(b u$b0) {
        super(u$b0);
    }

    u(b u$b0, com.beloo.widget.chipslayoutmanager.layouter.u.a u$a0) {
        this(u$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.g - this.L(), this.e - this.J(), this.g, this.e);
        this.e = rect0.top;
        return rect0;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int M() {
        return this.S();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int P() {
        return this.e - this.m();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public int Q() {
        return this.R();
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean T(View view0) {
        int v = this.N().p0(view0);
        int v1 = this.N().u0(view0);
        return this.h >= v1 && v > this.e;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return true;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.e = this.A();
        this.g = this.h;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Z(View view0) {
        if(this.e == this.A() || this.e - this.J() >= this.m()) {
            this.e = this.N().v0(view0);
        }
        else {
            this.e = this.A();
            this.g = this.h;
        }
        this.h = Math.min(this.h, this.N().r0(view0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void a0() {
        int v = this.e - this.m();
        this.e = 0;
        for(Object object0: this.d) {
            ((Rect)((Pair)object0).first).top -= v;
            int v1 = ((Rect)((Pair)object0).first).bottom - v;
            ((Rect)((Pair)object0).first).bottom = v1;
            this.e = Math.max(this.e, v1);
            this.h = Math.min(this.h, ((Rect)((Pair)object0).first).left);
            this.g = Math.max(this.g, ((Rect)((Pair)object0).first).right);
        }
    }

    public static b d0() {
        return new b(null);
    }
}

