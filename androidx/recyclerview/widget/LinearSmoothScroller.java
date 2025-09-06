package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class LinearSmoothScroller extends SmoothScroller {
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    @SuppressLint({"UnknownNullness"})
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m;
    private float n;
    protected int o;
    protected int p;
    private static final boolean q = false;
    private static final float r = 25.0f;
    private static final int s = 10000;
    public static final int t = -1;
    public static final int u = 1;
    public static final int v = 0;
    private static final float w = 1.2f;

    @SuppressLint({"UnknownNullness"})
    public LinearSmoothScroller(Context context0) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context0.getResources().getDisplayMetrics();
    }

    protected int A() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            float f = pointF0.x;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    private float B() {
        if(!this.m) {
            this.n = this.w(this.l);
            this.m = true;
        }
        return this.n;
    }

    protected int C() {
        PointF pointF0 = this.k;
        if(pointF0 != null) {
            float f = pointF0.y;
            if(f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    protected void D(Action recyclerView$SmoothScroller$Action0) {
        PointF pointF0 = this.a(this.f());
        if(pointF0 != null && (pointF0.x != 0.0f || pointF0.y != 0.0f)) {
            this.j(pointF0);
            this.k = pointF0;
            this.o = (int)(pointF0.x * 10000.0f);
            this.p = (int)(pointF0.y * 10000.0f);
            int v = this.y(10000);
            recyclerView$SmoothScroller$Action0.l(((int)(((float)this.o) * 1.2f)), ((int)(((float)this.p) * 1.2f)), ((int)(((float)v) * 1.2f)), this.i);
            return;
        }
        recyclerView$SmoothScroller$Action0.f(this.f());
        this.s();
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    @SuppressLint({"UnknownNullness"})
    protected void m(int v, int v1, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        if(this.c() == 0) {
            this.s();
            return;
        }
        this.o = this.z(this.o, v);
        int v2 = this.z(this.p, v1);
        this.p = v2;
        if(this.o == 0 && v2 == 0) {
            this.D(recyclerView$SmoothScroller$Action0);
        }
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    protected void n() {
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    protected void o() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$SmoothScroller
    @SuppressLint({"UnknownNullness"})
    protected void p(View view0, State recyclerView$State0, Action recyclerView$SmoothScroller$Action0) {
        int v = this.u(view0, this.A());
        int v1 = this.v(view0, this.C());
        int v2 = this.x(((int)Math.sqrt(v * v + v1 * v1)));
        if(v2 > 0) {
            recyclerView$SmoothScroller$Action0.l(-v, -v1, v2, this.j);
        }
    }

    public int t(int v, int v1, int v2, int v3, int v4) {
        switch(v4) {
            case -1: {
                return v2 - v;
            }
            case 0: {
                int v5 = v2 - v;
                if(v5 > 0) {
                    return v5;
                }
                int v6 = v3 - v1;
                return v6 >= 0 ? 0 : v6;
            }
            default: {
                if(v4 != 1) {
                    throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
                }
                return v3 - v1;
            }
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int u(View view0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.e();
        if(recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.G()) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            return this.t(recyclerView$LayoutManager0.r0(view0) - recyclerView$LayoutParams0.leftMargin, recyclerView$LayoutManager0.u0(view0) + recyclerView$LayoutParams0.rightMargin, recyclerView$LayoutManager0.G0(), recyclerView$LayoutManager0.R0() - recyclerView$LayoutManager0.H0(), v);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    public int v(View view0, int v) {
        LayoutManager recyclerView$LayoutManager0 = this.e();
        if(recyclerView$LayoutManager0 != null && recyclerView$LayoutManager0.H()) {
            LayoutParams recyclerView$LayoutParams0 = (LayoutParams)view0.getLayoutParams();
            return this.t(recyclerView$LayoutManager0.v0(view0) - recyclerView$LayoutParams0.topMargin, recyclerView$LayoutManager0.p0(view0) + recyclerView$LayoutParams0.bottomMargin, recyclerView$LayoutManager0.J0(), recyclerView$LayoutManager0.x0() - recyclerView$LayoutManager0.E0(), v);
        }
        return 0;
    }

    @SuppressLint({"UnknownNullness"})
    protected float w(DisplayMetrics displayMetrics0) {
        return 25.0f / ((float)displayMetrics0.densityDpi);
    }

    protected int x(int v) {
        return (int)Math.ceil(((double)this.y(v)) / 0.3356);
    }

    protected int y(int v) {
        return (int)Math.ceil(((float)Math.abs(v)) * this.B());
    }

    private int z(int v, int v1) {
        int v2 = v - v1;
        return v * v2 > 0 ? v2 : 0;
    }
}

