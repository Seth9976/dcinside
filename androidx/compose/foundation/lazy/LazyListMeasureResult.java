package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    @m
    private final LazyMeasuredItem a;
    private final int b;
    private final boolean c;
    private final float d;
    @l
    private final List e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    @l
    private final Orientation j;
    private final int k;
    private final int l;
    private final MeasureResult m;

    public LazyListMeasureResult(@m LazyMeasuredItem lazyMeasuredItem0, int v, boolean z, float f, @l MeasureResult measureResult0, @l List list0, int v1, int v2, int v3, boolean z1, @l Orientation orientation0, int v4, int v5) {
        L.p(measureResult0, "measureResult");
        L.p(list0, "visibleItemsInfo");
        L.p(orientation0, "orientation");
        super();
        this.a = lazyMeasuredItem0;
        this.b = v;
        this.c = z;
        this.d = f;
        this.e = list0;
        this.f = v1;
        this.g = v2;
        this.h = v3;
        this.i = z1;
        this.j = orientation0;
        this.k = v4;
        this.l = v5;
        this.m = measureResult0;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public long a() {
        return IntSizeKt.a(this.getWidth(), this.getHeight());
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int b() {
        return this.k;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int c() {
        return this.h;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int d() {
        return this.l;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int e() {
        return this.f;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public List f() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int g() {
        return this.g;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.m.getHeight();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    @l
    public Orientation getOrientation() {
        return this.j;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.m.getWidth();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int h() {
        return -this.e();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.c;
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    @l
    public Map k() {
        return this.m.k();
    }

    @Override  // androidx.compose.ui.layout.MeasureResult
    public void l() {
        this.m.l();
    }

    public final float m() {
        return this.d;
    }

    @m
    public final LazyMeasuredItem n() {
        return this.a;
    }

    public final int o() {
        return this.b;
    }
}

