package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,196:1\n33#2,6:197\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n66#1:197,6\n*E\n"})
public final class LazyGridMeasuredItem {
    private final int a;
    @l
    private final Object b;
    private final boolean c;
    private final int d;
    private final int e;
    private final boolean f;
    @l
    private final LayoutDirection g;
    private final int h;
    private final int i;
    @l
    private final List j;
    @l
    private final LazyGridItemPlacementAnimator k;
    private final long l;
    private final int m;
    private final int n;

    private LazyGridMeasuredItem(int v, Object object0, boolean z, int v1, int v2, boolean z1, LayoutDirection layoutDirection0, int v3, int v4, List list0, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, long v5) {
        this.a = v;
        this.b = object0;
        this.c = z;
        this.d = v1;
        this.e = v2;
        this.f = z1;
        this.g = layoutDirection0;
        this.h = v3;
        this.i = v4;
        this.j = list0;
        this.k = lazyGridItemPlacementAnimator0;
        this.l = v5;
        int v6 = list0.size();
        int v8 = 0;
        for(int v7 = 0; v7 < v6; ++v7) {
            Placeable placeable0 = (Placeable)list0.get(v7);
            v8 = Math.max(v8, (this.c ? placeable0.K1() : placeable0.N1()));
        }
        this.m = v8;
        this.n = s.u(v8 + this.e, 0);
    }

    public LazyGridMeasuredItem(int v, Object object0, boolean z, int v1, int v2, boolean z1, LayoutDirection layoutDirection0, int v3, int v4, List list0, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, long v5, w w0) {
        this(v, object0, z, v1, v2, z1, layoutDirection0, v3, v4, list0, lazyGridItemPlacementAnimator0, v5);
    }

    public final int a() {
        return this.d;
    }

    public final int b() {
        return this.a;
    }

    @l
    public final Object c() {
        return this.b;
    }

    public final int d() {
        return this.m;
    }

    public final int e() {
        return this.n;
    }

    public final int f() {
        return this.e;
    }

    @l
    public final List g() {
        return this.j;
    }

    // 去混淆评级： 低(22)
    @l
    public final LazyGridPositionedItem h(int v, int v1, int v2, int v3, int v4, int v5) {
        int v6 = this.c ? v3 : v2;
        int v7 = !this.c || this.g != LayoutDirection.b ? v1 : (this.c ? v2 : v3) - v1 - this.d;
        long v8 = this.c ? IntOffsetKt.a(v7, v) : IntOffsetKt.a(v, v7);
        return this.c ? new LazyGridPositionedItem(v8, this.a, this.b, v4, v5, IntSizeKt.a(this.d, this.m), -this.h, v6 + this.i, this.c, this.j, this.k, this.l, v6, this.f, null) : new LazyGridPositionedItem(v8, this.a, this.b, v4, v5, IntSizeKt.a(this.m, this.d), -this.h, v6 + this.i, this.c, this.j, this.k, this.l, v6, this.f, null);
    }
}

