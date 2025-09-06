package androidx.recyclerview.widget;

import android.view.View;

class ScrollbarHelper {
    static int a(State recyclerView$State0, OrientationHelper orientationHelper0, View view0, View view1, LayoutManager recyclerView$LayoutManager0, boolean z) {
        if(recyclerView$LayoutManager0.j0() != 0 && recyclerView$State0.d() != 0 && view0 != null && view1 != null) {
            if(!z) {
                return Math.abs(recyclerView$LayoutManager0.K0(view0) - recyclerView$LayoutManager0.K0(view1)) + 1;
            }
            int v = orientationHelper0.d(view1);
            int v1 = orientationHelper0.g(view0);
            return Math.min(orientationHelper0.o(), v - v1);
        }
        return 0;
    }

    static int b(State recyclerView$State0, OrientationHelper orientationHelper0, View view0, View view1, LayoutManager recyclerView$LayoutManager0, boolean z, boolean z1) {
        if(recyclerView$LayoutManager0.j0() != 0 && recyclerView$State0.d() != 0 && view0 != null && view1 != null) {
            int v = z1 ? Math.max(0, recyclerView$State0.d() - Math.max(recyclerView$LayoutManager0.K0(view0), recyclerView$LayoutManager0.K0(view1)) - 1) : Math.max(0, Math.min(recyclerView$LayoutManager0.K0(view0), recyclerView$LayoutManager0.K0(view1)));
            return z ? Math.round(((float)v) * (((float)Math.abs(orientationHelper0.d(view1) - orientationHelper0.g(view0))) / ((float)(Math.abs(recyclerView$LayoutManager0.K0(view0) - recyclerView$LayoutManager0.K0(view1)) + 1))) + ((float)(orientationHelper0.n() - orientationHelper0.g(view0)))) : v;
        }
        return 0;
    }

    static int c(State recyclerView$State0, OrientationHelper orientationHelper0, View view0, View view1, LayoutManager recyclerView$LayoutManager0, boolean z) {
        if(recyclerView$LayoutManager0.j0() != 0 && recyclerView$State0.d() != 0 && view0 != null && view1 != null) {
            return z ? ((int)(((float)(orientationHelper0.d(view1) - orientationHelper0.g(view0))) / ((float)(Math.abs(recyclerView$LayoutManager0.K0(view0) - recyclerView$LayoutManager0.K0(view1)) + 1)) * ((float)recyclerView$State0.d()))) : recyclerView$State0.d();
        }
        return 0;
    }
}

