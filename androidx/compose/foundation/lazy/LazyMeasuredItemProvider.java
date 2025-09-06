package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.w;
import y4.l;

public final class LazyMeasuredItemProvider {
    @l
    private final LazyListItemProvider a;
    @l
    private final LazyLayoutMeasureScope b;
    @l
    private final MeasuredItemFactory c;
    private final long d;

    private LazyMeasuredItemProvider(long v, boolean z, LazyListItemProvider lazyListItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, MeasuredItemFactory measuredItemFactory0) {
        this.a = lazyListItemProvider0;
        this.b = lazyLayoutMeasureScope0;
        this.c = measuredItemFactory0;
        this.d = ConstraintsKt.b(0, (z ? Constraints.p(v) : 0x7FFFFFFF), 0, (z ? 0x7FFFFFFF : Constraints.o(v)), 5, null);
    }

    @ExperimentalFoundationApi
    public LazyMeasuredItemProvider(long v, boolean z, LazyListItemProvider lazyListItemProvider0, LazyLayoutMeasureScope lazyLayoutMeasureScope0, MeasuredItemFactory measuredItemFactory0, w w0) {
        this(v, z, lazyListItemProvider0, lazyLayoutMeasureScope0, measuredItemFactory0);
    }

    @l
    public final LazyMeasuredItem a(int v) {
        Object object0 = this.a.D(v);
        List list0 = this.b.i0(v, this.d);
        return this.c.a(v, object0, list0);
    }

    public final long b() {
        return this.d;
    }

    @l
    public final Map c() {
        return this.a.G();
    }
}

