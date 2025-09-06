package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.w;
import y4.l;

public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    @l
    private final int[] a;
    @l
    private final int[] b;
    private final float c;
    @l
    private final MeasureResult d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    @l
    private final List i;
    private final long j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    @l
    private final Orientation p;

    private LazyStaggeredGridMeasureResult(int[] arr_v, int[] arr_v1, float f, MeasureResult measureResult0, boolean z, boolean z1, boolean z2, int v, List list0, long v1, int v2, int v3, int v4, int v5, int v6) {
        this.a = arr_v;
        this.b = arr_v1;
        this.c = f;
        this.d = measureResult0;
        this.e = z;
        this.f = z1;
        this.g = z2;
        this.h = v;
        this.i = list0;
        this.j = v1;
        this.k = v2;
        this.l = v3;
        this.m = v4;
        this.n = v5;
        this.o = v6;
        this.p = z2 ? Orientation.a : Orientation.b;
    }

    public LazyStaggeredGridMeasureResult(int[] arr_v, int[] arr_v1, float f, MeasureResult measureResult0, boolean z, boolean z1, boolean z2, int v, List list0, long v1, int v2, int v3, int v4, int v5, int v6, w w0) {
        this(arr_v, arr_v1, f, measureResult0, z, z1, z2, v, list0, v1, v2, v3, v4, v5, v6);
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public long a() {
        return this.j;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int b() {
        return this.n;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int c() {
        return this.h;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int d() {
        return this.o;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int e() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public List f() {
        return this.i;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int g() {
        return this.l;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.d.getHeight();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.p;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.d.getWidth();
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int h() {
        return this.m;
    }

    public final boolean i() {
        return this.f;
    }

    public final boolean j() {
        return this.e;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @l
    public Map k() {
        return this.d.k();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void l() {
        this.d.l();
    }

    public final float m() {
        return this.c;
    }

    @l
    public final int[] n() {
        return this.a;
    }

    @l
    public final int[] o() {
        return this.b;
    }

    @l
    public final MeasureResult p() {
        return this.d;
    }

    public final boolean q() {
        return this.g;
    }
}

