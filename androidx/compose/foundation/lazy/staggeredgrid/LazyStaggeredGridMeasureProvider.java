package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n878#2:1098\n880#2:1100\n879#2:1101\n878#2:1103\n880#2:1105\n879#2:1106\n878#2:1108\n55#3:1099\n62#3:1102\n55#3:1104\n62#3:1107\n55#3:1109\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider\n*L\n993#1:1098\n993#1:1100\n993#1:1101\n994#1:1103\n994#1:1105\n994#1:1106\n994#1:1108\n993#1:1099\n993#1:1102\n994#1:1104\n994#1:1107\n994#1:1109\n*E\n"})
final class LazyStaggeredGridMeasureProvider {
    private final boolean a;
    @l
    private final LazyLayoutItemProvider b;
    @l
    private final LazyLayoutMeasureScope c;
    @l
    private final int[] d;
    private final int e;
    @l
    private final MeasuredItemFactory f;

    public LazyStaggeredGridMeasureProvider(boolean z, @l LazyLayoutItemProvider lazyLayoutItemProvider0, @l LazyLayoutMeasureScope lazyLayoutMeasureScope0, @l int[] arr_v, int v, @l MeasuredItemFactory measuredItemFactory0) {
        L.p(lazyLayoutItemProvider0, "itemProvider");
        L.p(lazyLayoutMeasureScope0, "measureScope");
        L.p(arr_v, "resolvedSlotSums");
        L.p(measuredItemFactory0, "measuredItemFactory");
        super();
        this.a = z;
        this.b = lazyLayoutItemProvider0;
        this.c = lazyLayoutMeasureScope0;
        this.d = arr_v;
        this.e = v;
        this.f = measuredItemFactory0;
    }

    private final long a(int v, int v1) {
        int v2 = this.d[v + v1 - 1] - (v == 0 ? 0 : this.d[v - 1]) + this.e * (v1 - 1);
        return this.a ? Constraints.b.e(v2) : Constraints.b.d(v2);
    }

    @l
    public final LazyStaggeredGridMeasuredItem b(int v, long v1) {
        Object object0 = this.b.D(v);
        int v2 = ((int)(v1 & 0xFFFFFFFFL)) - ((int)(v1 >> 0x20));
        long v3 = this.a(((int)(v1 >> 0x20)), v2);
        List list0 = this.c.i0(v, v3);
        return this.f.a(v, ((int)(v1 >> 0x20)), v2, object0, list0);
    }
}

