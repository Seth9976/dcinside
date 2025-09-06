package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyMeasuredLineProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredLineProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyMeasuredLineProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class LazyMeasuredLineProvider {
    private final boolean a;
    @l
    private final List b;
    private final int c;
    private final int d;
    private final int e;
    @l
    private final LazyMeasuredItemProvider f;
    @l
    private final LazyGridSpanLayoutProvider g;
    @l
    private final MeasuredLineFactory h;

    public LazyMeasuredLineProvider(boolean z, @l List list0, int v, int v1, int v2, @l LazyMeasuredItemProvider lazyMeasuredItemProvider0, @l LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider0, @l MeasuredLineFactory measuredLineFactory0) {
        L.p(list0, "slotSizesSums");
        L.p(lazyMeasuredItemProvider0, "measuredItemProvider");
        L.p(lazyGridSpanLayoutProvider0, "spanLayoutProvider");
        L.p(measuredLineFactory0, "measuredLineFactory");
        super();
        this.a = z;
        this.b = list0;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = lazyMeasuredItemProvider0;
        this.g = lazyGridSpanLayoutProvider0;
        this.h = measuredLineFactory0;
    }

    public final long a(int v, int v1) {
        int v2 = s.u(((Number)this.b.get(v + v1 - 1)).intValue() - (v == 0 ? 0 : ((Number)this.b.get(v - 1)).intValue()) + this.c * (v1 - 1), 0);
        return this.a ? Constraints.b.e(v2) : Constraints.b.d(v2);
    }

    @l
    public final LazyGridMeasuredLine b(int v) {
        LineConfiguration lazyGridSpanLayoutProvider$LineConfiguration0 = this.g.c(v);
        int v1 = lazyGridSpanLayoutProvider$LineConfiguration0.b().size();
        int v3 = v1 == 0 || lazyGridSpanLayoutProvider$LineConfiguration0.a() + v1 == this.d ? 0 : this.e;
        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = new LazyGridMeasuredItem[v1];
        int v4 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            int v5 = GridItemSpan.f(((GridItemSpan)lazyGridSpanLayoutProvider$LineConfiguration0.b().get(v2)).i());
            long v6 = this.a(v4, v5);
            v4 += v5;
            arr_lazyGridMeasuredItem[v2] = this.f.a(lazyGridSpanLayoutProvider$LineConfiguration0.a() + v2, v3, v6);
        }
        return this.h.a(v, arr_lazyGridMeasuredItem, lazyGridSpanLayoutProvider$LineConfiguration0.b(), v3);
    }

    @l
    public final Map c() {
        return this.f.c();
    }

    public final long d(int v) {
        return this.a(0, this.g.i(v, this.g.e()));
    }
}

