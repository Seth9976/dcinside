package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 2 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1097:1\n217#1:1103\n880#2:1098\n879#2:1099\n878#2:1101\n880#2:1104\n879#2:1105\n878#2:1107\n62#3:1100\n55#3:1102\n62#3:1106\n55#3:1108\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n*L\n220#1:1103\n217#1:1098\n217#1:1099\n217#1:1101\n220#1:1104\n220#1:1105\n220#1:1107\n217#1:1100\n217#1:1102\n220#1:1106\n220#1:1108\n*E\n"})
final class LazyStaggeredGridMeasureContext {
    @l
    private final LazyStaggeredGridState a;
    @l
    private final LazyStaggeredGridItemProvider b;
    @l
    private final int[] c;
    private final long d;
    private final boolean e;
    @l
    private final LazyLayoutMeasureScope f;
    private final int g;
    private final long h;
    private final int i;
    private final int j;
    private final boolean k;
    private final int l;
    private final int m;
    @l
    private final LazyStaggeredGridMeasureProvider n;
    @l
    private final LazyStaggeredGridLaneInfo o;
    private final int p;

    private LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState0, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int[] arr_v, long v, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v1, long v2, int v3, int v4, boolean z1, int v5, int v6) {
        this.a = lazyStaggeredGridState0;
        this.b = lazyStaggeredGridItemProvider0;
        this.c = arr_v;
        this.d = v;
        this.e = z;
        this.f = lazyLayoutMeasureScope0;
        this.g = v1;
        this.h = v2;
        this.i = v3;
        this.j = v4;
        this.k = z1;
        this.l = v5;
        this.m = v6;
        this.n = new LazyStaggeredGridMeasureProvider(z, lazyStaggeredGridItemProvider0, lazyLayoutMeasureScope0, arr_v, v6, new MeasuredItemFactory() {
            @Override  // androidx.compose.foundation.lazy.staggeredgrid.MeasuredItemFactory
            @l
            public final LazyStaggeredGridMeasuredItem a(int v, int v1, int v2, @l Object object0, @l List list0) {
                L.p(object0, "key");
                L.p(list0, "placeables");
                return new LazyStaggeredGridMeasuredItem(v, object0, list0, this.a.t(), this.a.k(), v1, v2);
            }
        });
        this.o = lazyStaggeredGridState0.u();
        this.p = arr_v.length;
    }

    public LazyStaggeredGridMeasureContext(LazyStaggeredGridState lazyStaggeredGridState0, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int[] arr_v, long v, boolean z, LazyLayoutMeasureScope lazyLayoutMeasureScope0, int v1, long v2, int v3, int v4, boolean z1, int v5, int v6, w w0) {
        this(lazyStaggeredGridState0, lazyStaggeredGridItemProvider0, arr_v, v, z, lazyLayoutMeasureScope0, v1, v2, v3, v4, z1, v5, v6);
    }

    public final int a() {
        return this.j;
    }

    public final int b() {
        return this.i;
    }

    public final long c() {
        return this.d;
    }

    public final long d() {
        return this.h;
    }

    public final int e() {
        return this.m;
    }

    @l
    public final LazyStaggeredGridItemProvider f() {
        return this.b;
    }

    public final int g() {
        return this.p;
    }

    @l
    public final LazyStaggeredGridLaneInfo h() {
        return this.o;
    }

    public final int i(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20)) == 1 ? ((int)(v >> 0x20)) : -2;
    }

    public final int j() {
        return this.g;
    }

    public final int k() {
        return this.l;
    }

    @l
    public final LazyLayoutMeasureScope l() {
        return this.f;
    }

    @l
    public final LazyStaggeredGridMeasureProvider m() {
        return this.n;
    }

    @l
    public final int[] n() {
        return this.c;
    }

    public final boolean o() {
        return this.k;
    }

    public final long p(@l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int v, int v1) {
        L.p(lazyStaggeredGridItemProvider0, "$this$getSpanRange");
        boolean z = lazyStaggeredGridItemProvider0.a().b(v);
        int v2 = z ? this.p : 1;
        if(z) {
            v1 = 0;
        }
        return SpanRange.b(v1, v2);
    }

    @l
    public final LazyStaggeredGridState q() {
        return this.a;
    }

    public final boolean r(@l LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider0, int v) {
        L.p(lazyStaggeredGridItemProvider0, "<this>");
        return lazyStaggeredGridItemProvider0.a().b(v);
    }

    public final boolean s(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20)) != 1;
    }

    public final boolean t() {
        return this.e;
    }
}

