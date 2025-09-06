package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LinearSnapHelper extends SnapHelper {
    @Nullable
    private OrientationHelper e;
    @Nullable
    private OrientationHelper f;
    private static final float g = 1.0f;

    @Override  // androidx.recyclerview.widget.SnapHelper
    public int[] c(@NonNull LayoutManager recyclerView$LayoutManager0, @NonNull View view0) {
        int[] arr_v = new int[2];
        arr_v[0] = recyclerView$LayoutManager0.G() ? this.n(view0, this.q(recyclerView$LayoutManager0)) : 0;
        if(recyclerView$LayoutManager0.H()) {
            arr_v[1] = this.n(view0, this.r(recyclerView$LayoutManager0));
            return arr_v;
        }
        arr_v[1] = 0;
        return arr_v;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public View h(LayoutManager recyclerView$LayoutManager0) {
        if(recyclerView$LayoutManager0.H()) {
            return this.p(recyclerView$LayoutManager0, this.r(recyclerView$LayoutManager0));
        }
        return recyclerView$LayoutManager0.G() ? this.p(recyclerView$LayoutManager0, this.q(recyclerView$LayoutManager0)) : null;
    }

    @Override  // androidx.recyclerview.widget.SnapHelper
    public int i(LayoutManager recyclerView$LayoutManager0, int v, int v1) {
        int v6;
        int v5;
        if(!(recyclerView$LayoutManager0 instanceof ScrollVectorProvider)) {
            return -1;
        }
        int v2 = recyclerView$LayoutManager0.getItemCount();
        if(v2 == 0) {
            return -1;
        }
        View view0 = this.h(recyclerView$LayoutManager0);
        if(view0 == null) {
            return -1;
        }
        int v3 = recyclerView$LayoutManager0.K0(view0);
        if(v3 == -1) {
            return -1;
        }
        int v4 = 0;
        PointF pointF0 = ((ScrollVectorProvider)recyclerView$LayoutManager0).g(v2 - 1);
        if(pointF0 == null) {
            return -1;
        }
        if(recyclerView$LayoutManager0.G()) {
            v5 = this.o(recyclerView$LayoutManager0, this.q(recyclerView$LayoutManager0), v, 0);
            if(pointF0.x < 0.0f) {
                v5 = -v5;
            }
        }
        else {
            v5 = 0;
        }
        if(recyclerView$LayoutManager0.H()) {
            v6 = this.o(recyclerView$LayoutManager0, this.r(recyclerView$LayoutManager0), 0, v1);
            if(pointF0.y < 0.0f) {
                v6 = -v6;
            }
        }
        else {
            v6 = 0;
        }
        if(recyclerView$LayoutManager0.H()) {
            v5 = v6;
        }
        if(v5 == 0) {
            return -1;
        }
        int v7 = v3 + v5;
        if(v7 >= 0) {
            v4 = v7;
        }
        return v4 >= v2 ? v2 - 1 : v4;
    }

    private float m(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0) {
        int v = recyclerView$LayoutManager0.j0();
        if(v == 0) {
            return 1.0f;
        }
        View view0 = null;
        View view1 = null;
        int v1 = 0x7FFFFFFF;
        int v2 = 0x80000000;
        for(int v3 = 0; v3 < v; ++v3) {
            View view2 = recyclerView$LayoutManager0.i0(v3);
            int v4 = recyclerView$LayoutManager0.K0(view2);
            if(v4 != -1) {
                if(v4 < v1) {
                    view0 = view2;
                    v1 = v4;
                }
                if(v4 > v2) {
                    view1 = view2;
                    v2 = v4;
                }
            }
        }
        if(view0 != null && view1 != null) {
            int v5 = Math.min(orientationHelper0.g(view0), orientationHelper0.g(view1));
            int v6 = Math.max(orientationHelper0.d(view0), orientationHelper0.d(view1)) - v5;
            return v6 == 0 ? 1.0f : ((float)v6) * 1.0f / ((float)(v2 - v1 + 1));
        }
        return 1.0f;
    }

    private int n(@NonNull View view0, OrientationHelper orientationHelper0) {
        return orientationHelper0.g(view0) + orientationHelper0.e(view0) / 2 - (orientationHelper0.n() + orientationHelper0.o() / 2);
    }

    private int o(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0, int v, int v1) {
        int[] arr_v = this.d(v, v1);
        float f = this.m(recyclerView$LayoutManager0, orientationHelper0);
        if(f <= 0.0f) {
            return 0;
        }
        return Math.abs(arr_v[0]) <= Math.abs(arr_v[1]) ? Math.round(((float)arr_v[1]) / f) : Math.round(((float)arr_v[0]) / f);
    }

    @Nullable
    private View p(LayoutManager recyclerView$LayoutManager0, OrientationHelper orientationHelper0) {
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
    private OrientationHelper q(@NonNull LayoutManager recyclerView$LayoutManager0) {
        if(this.f == null || this.f.a != recyclerView$LayoutManager0) {
            this.f = OrientationHelper.a(recyclerView$LayoutManager0);
        }
        return this.f;
    }

    @NonNull
    private OrientationHelper r(@NonNull LayoutManager recyclerView$LayoutManager0) {
        if(this.e == null || this.e.a != recyclerView$LayoutManager0) {
            this.e = OrientationHelper.c(recyclerView$LayoutManager0);
        }
        return this.e;
    }
}

