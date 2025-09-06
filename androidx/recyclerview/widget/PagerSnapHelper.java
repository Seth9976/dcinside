package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class PagerSnapHelper extends SnapHelper {
    @Nullable
    private OrientationHelper e;
    @Nullable
    private OrientationHelper f;
    private static final int g = 100;

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public int[] c(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        int[] arr_v = new int[2];
        arr_v[0] = recyclerView$LayoutManager0.G() ? this.m(view0, this.o(recyclerView$LayoutManager0)) : 0;
        if(recyclerView$LayoutManager0.H()) {
            arr_v[1] = this.m(view0, this.q(recyclerView$LayoutManager0));
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @Nullable
    protected SmoothScroller e(@NonNull LayoutManager recyclerView$LayoutManager0) {
        return !(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) ? null : new LinearSmoothScroller(this.a.getContext()) {
            final PagerSnapHelper x;

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected void p(@NonNull View view0, @NonNull State recyclerView$State0, @NonNull Action recyclerView$SmoothScroller$Action0) {
                int[] arr_v = PagerSnapHelper.this.c(PagerSnapHelper.this.a.getLayoutManager(), view0);
                int v = arr_v[0];
                int v1 = arr_v[1];
                int v2 = this.x(Math.max(Math.abs(v), Math.abs(v1)));
                if(v2 > 0) {
                    recyclerView$SmoothScroller$Action0.l(v, v1, v2, this.j);
                }
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected float w(@NonNull DisplayMetrics displayMetrics0) {
                return 100.0f / ((float)displayMetrics0.densityDpi);
            }

            @Override  // androidx.recyclerview.widget.LinearSmoothScroller
            protected int y(int v) {
                return Math.min(100, super.y(v));
            }
        };
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    @Nullable
    public View h(LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0.H()) {
            return this.n(recyclerView$LayoutManager0, this.q(recyclerView$LayoutManager0));
        }
        return recyclerView$LayoutManager0.G() ? this.n(recyclerView$LayoutManager0, this.o(recyclerView$LayoutManager0)) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    @SuppressLint({"UnknownNullness"})
    public int i(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        OrientationHelper orientationHelper0 = this.p(recyclerView$LayoutManager0);
        if(orientationHelper0 == null) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.j0();
        View view0 = null;
        View view1 = null;
        int v4 = 0x80000000;
        int v5 = 0x7FFFFFFF;
        for(int v6 = 0; v6 < v3; ++v6) {
            View view2 = recyclerView$LayoutManager0.i0(v6);
            if(view2 != null) {
                int v7 = this.m(view2, orientationHelper0);
                if(v7 <= 0 && v7 > v4) {
                    view1 = view2;
                    v4 = v7;
                }
                if(v7 >= 0 && v7 < v5) {
                    view0 = view2;
                    v5 = v7;
                }
            }
        }
        boolean z = this.r(recyclerView$LayoutManager0, v, v1);
        if(z && view0 != null) {
            return recyclerView$LayoutManager0.K0(view0);
        }
        if(!z && view1 != null) {
            return recyclerView$LayoutManager0.K0(view1);
        }
        if(z) {
            view0 = view1;
        }
        if(view0 == null) {
            return -1;
        }
        int v8 = recyclerView$LayoutManager0.K0(view0) + (this.s(recyclerView$LayoutManager0) == z ? -1 : 1);
        return v8 < 0 || v8 >= v2 ? -1 : v8;
    }

    private int m(@NonNull View view0, OrientationHelper orientationHelper0) {
        return orientationHelper0.g(view0) + orientationHelper0.e(view0) / 2 - (orientationHelper0.n() + orientationHelper0.o() / 2);
    }

    @Nullable
    private View n(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0) {
        int v = recyclerView$LayoutManager0.j0();
        View view0 = null;
        if(v == 0) {
            return null;
        }
        int v1 = orientationHelper0.n();
        int v2 = orientationHelper0.o();
        int v3 = 0x7FFFFFFF;
        for(int v4 = 0; v4 < v; ++v4) {
            View view1 = recyclerView$LayoutManager0.i0(v4);
            int v5 = Math.abs(orientationHelper0.g(view1) + orientationHelper0.e(view1) / 2 - (v1 + v2 / 2));
            if(v5 < v3) {
                view0 = view1;
                v3 = v5;
            }
        }
        return view0;
    }

    @NonNull
    private OrientationHelper o(@NonNull LayoutManager recyclerView$LayoutManager0) {
        if(this.f == null || this.f.a != recyclerView$LayoutManager0) {
            this.f = OrientationHelper.a(recyclerView$LayoutManager0);
        }
        return this.f;
    }

    @Nullable
    private OrientationHelper p(LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0.H()) {
            return this.q(recyclerView$LayoutManager0);
        }
        return recyclerView$LayoutManager0.G() ? this.o(recyclerView$LayoutManager0) : null;
    }

    @NonNull
    private OrientationHelper q(@NonNull LayoutManager recyclerView$LayoutManager0) {
        if(this.e == null || this.e.a != recyclerView$LayoutManager0) {
            this.e = OrientationHelper.c(recyclerView$LayoutManager0);
        }
        return this.e;
    }

    // 去混淆评级： 低(20)
    private boolean r(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        return recyclerView$LayoutManager0.G() ? v > 0 : v1 > 0;
    }

    private boolean s(LayoutManager recyclerView$LayoutManager0) {
        int v = recyclerView$LayoutManager0.getItemCount();
        if(recyclerView$LayoutManager0 instanceof ScrollVectorProvider) {
            PointF pointF0 = ((ScrollVectorProvider)recyclerView$LayoutManager0).g(v - 1);
            return pointF0 != null && (pointF0.x < 0.0f || pointF0.y < 0.0f);
        }
        return false;
    }
}

