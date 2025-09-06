package com.beloo.widget.chipslayoutmanager.layouter;

import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;

class s extends a implements h {
    static class com.beloo.widget.chipslayoutmanager.layouter.s.a {
    }

    public static final class b extends com.beloo.widget.chipslayoutmanager.layouter.a.a {
        private b() {
        }

        b(com.beloo.widget.chipslayoutmanager.layouter.s.a s$a0) {
        }

        @NonNull
        public s B() {
            return new s(this, null);
        }

        @Override  // com.beloo.widget.chipslayoutmanager.layouter.a$a
        @NonNull
        public a t() {
            return this.B();
        }
    }

    private s(b s$b0) {
        super(s$b0);
    }

    s(b s$b0, com.beloo.widget.chipslayoutmanager.layouter.s.a s$a0) {
        this(s$b0);
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    Rect H(View view0) {
        Rect rect0 = new Rect(this.g - this.L(), this.e - this.J(), this.g, this.e);
        this.g = rect0.left;
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
        int v = this.N().p0(view0);
        int v1 = this.N().u0(view0);
        return this.f >= v && v1 > this.g;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    boolean V() {
        return true;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void Y() {
        this.g = this.o();
        this.e = this.f;
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    public void Z(View view0) {
        if(this.g == this.o() || this.g - this.L() >= this.d()) {
            this.g = this.N().r0(view0);
        }
        else {
            this.g = this.o();
            this.e = this.f;
        }
        this.f = Math.min(this.f, this.N().v0(view0));
    }

    @Override  // com.beloo.widget.chipslayoutmanager.layouter.a
    void a0() {
        int v = this.g - this.d();
        this.h = 0;
        for(Object object0: this.d) {
            ((Rect)((Pair)object0).first).left -= v;
            int v1 = ((Rect)((Pair)object0).first).right - v;
            ((Rect)((Pair)object0).first).right = v1;
            this.h = Math.max(v1, this.h);
            this.f = Math.min(this.f, ((Rect)((Pair)object0).first).top);
            this.e = Math.max(this.e, ((Rect)((Pair)object0).first).bottom);
        }
    }

    public static b d0() {
        return new b(null);
    }
}

