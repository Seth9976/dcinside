package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,1097:1\n1088#1:1102\n1086#1:1103\n33#2,4:1098\n38#2:1105\n86#3:1104\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem\n*L\n1074#1:1102\n1075#1:1103\n1072#1:1098,4\n1072#1:1105\n1081#1:1104\n*E\n"})
final class LazyStaggeredGridPositionedItem implements LazyStaggeredGridItemInfo {
    private final long a;
    private final int b;
    private final int c;
    @l
    private final Object d;
    private final long e;
    @l
    private final List f;
    private final boolean g;
    private final int h;

    private LazyStaggeredGridPositionedItem(long v, int v1, int v2, Object object0, long v3, List list0, boolean z, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = object0;
        this.e = v3;
        this.f = list0;
        this.g = z;
        this.h = v4;
    }

    public LazyStaggeredGridPositionedItem(long v, int v1, int v2, Object object0, long v3, List list0, boolean z, int v4, w w0) {
        this(v, v1, v2, object0, v3, list0, z, v4);
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public long a() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public long b() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int c() {
        return this.c;
    }

    // 去混淆评级： 低(40)
    private final long d(long v, Function1 function10) {
        return IntOffsetKt.a((this.g ? ((int)(v >> 0x20)) : ((Number)function10.invoke(((int)(v >> 0x20)))).intValue()), (this.g ? ((Number)function10.invoke(((int)(v & 0xFFFFFFFFL)))).intValue() : ((int)(v & 0xFFFFFFFFL))));
    }

    // 去混淆评级： 低(20)
    private final int e(Placeable placeable0) {
        return this.g ? placeable0.K1() : placeable0.N1();
    }

    public final void f(@l PlacementScope placeable$PlacementScope0, @l LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext0) {
        long v3;
        L.p(placeable$PlacementScope0, "scope");
        L.p(lazyStaggeredGridMeasureContext0, "context");
        List list0 = this.f;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)list0.get(v1);
            if(lazyStaggeredGridMeasureContext0.o()) {
                long v2 = this.b();
                v3 = IntOffsetKt.a((this.g ? ((int)(v2 >> 0x20)) : this.h - ((int)(v2 >> 0x20)) - (this.g ? placeable0.K1() : placeable0.N1())), (this.g ? this.h - ((int)(v2 & 0xFFFFFFFFL)) - (this.g ? placeable0.K1() : placeable0.N1()) : ((int)(v2 & 0xFFFFFFFFL))));
            }
            else {
                v3 = this.b();
            }
            long v4 = lazyStaggeredGridMeasureContext0.d();
            PlacementScope.B(placeable$PlacementScope0, placeable0, IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(v4 >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(v4 & 0xFFFFFFFFL))), 0.0f, null, 6, null);
        }
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    public int getIndex() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo
    @l
    public Object getKey() {
        return this.d;
    }

    @Override
    @l
    public String toString() {
        return super.toString();
    }
}

