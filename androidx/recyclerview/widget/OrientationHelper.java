package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class OrientationHelper {
    protected final LayoutManager a;
    private int b;
    final Rect c;
    private static final int d = 0x80000000;
    public static final int e = 0;
    public static final int f = 1;

    private OrientationHelper(LayoutManager recyclerView$LayoutManager0) {
        this.b = 0x80000000;
        this.c = new Rect();
        this.a = recyclerView$LayoutManager0;
    }

    OrientationHelper(LayoutManager recyclerView$LayoutManager0, androidx.recyclerview.widget.OrientationHelper.1 orientationHelper$10) {
        this(recyclerView$LayoutManager0);
    }

    public static OrientationHelper a(LayoutManager recyclerView$LayoutManager0) {
        return new OrientationHelper(recyclerView$LayoutManager0) {
            {
                super(recyclerView$LayoutManager0, null);
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int d(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.u0(view0) + recyclerView$LayoutParams0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int e(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.t0(view0) + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int f(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.s0(view0) + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int g(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.r0(view0) - recyclerView$LayoutParams0.leftMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int h() {
                return this.a.R0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int i() {
                int v = this.a.H0();
                return this.a.R0() - v;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int j() {
                return this.a.H0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int l() {
                return this.a.S0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int m() {
                return this.a.y0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int n() {
                return this.a.G0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int o() {
                int v = this.a.G0();
                int v1 = this.a.H0();
                return this.a.R0() - v - v1;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int q(View view0) {
                this.a.Q0(view0, true, this.c);
                return this.c.right;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int r(View view0) {
                this.a.Q0(view0, true, this.c);
                return this.c.left;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public void s(View view0, int v) {
                view0.offsetLeftAndRight(v);
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public void t(int v) {
                this.a.m1(v);
            }
        };
    }

    public static OrientationHelper b(LayoutManager recyclerView$LayoutManager0, int v) {
        switch(v) {
            case 0: {
                return OrientationHelper.a(recyclerView$LayoutManager0);
            }
            case 1: {
                return OrientationHelper.c(recyclerView$LayoutManager0);
            }
            default: {
                throw new IllegalArgumentException("invalid orientation");
            }
        }
    }

    public static OrientationHelper c(LayoutManager recyclerView$LayoutManager0) {
        return new OrientationHelper(recyclerView$LayoutManager0) {
            {
                super(recyclerView$LayoutManager0, null);
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int d(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.p0(view0) + recyclerView$LayoutParams0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int e(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.s0(view0) + recyclerView$LayoutParams0.topMargin + recyclerView$LayoutParams0.bottomMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int f(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.t0(view0) + recyclerView$LayoutParams0.leftMargin + recyclerView$LayoutParams0.rightMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int g(View view0) {
                LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
                return this.a.v0(view0) - recyclerView$LayoutParams0.topMargin;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int h() {
                return this.a.x0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int i() {
                int v = this.a.E0();
                return this.a.x0() - v;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int j() {
                return this.a.E0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int l() {
                return this.a.y0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int m() {
                return this.a.S0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int n() {
                return this.a.J0();
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int o() {
                int v = this.a.J0();
                int v1 = this.a.E0();
                return this.a.x0() - v - v1;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int q(View view0) {
                this.a.Q0(view0, true, this.c);
                return this.c.bottom;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public int r(View view0) {
                this.a.Q0(view0, true, this.c);
                return this.c.top;
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public void s(View view0, int v) {
                view0.offsetTopAndBottom(v);
            }

            @Override  // androidx.recyclerview.widget.OrientationHelper
            public void t(int v) {
                this.a.n1(v);
            }
        };
    }

    public abstract int d(View arg1);

    public abstract int e(View arg1);

    public abstract int f(View arg1);

    public abstract int g(View arg1);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public LayoutManager k() {
        return this.a;
    }

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public int p() {
        return 0x80000000 == this.b ? 0 : this.o() - this.b;
    }

    public abstract int q(View arg1);

    public abstract int r(View arg1);

    public abstract void s(View arg1, int arg2);

    public abstract void t(int arg1);

    public void u() {
        this.b = this.o();
    }
}

