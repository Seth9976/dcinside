package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;

@s0({"SMAP\nLazyGridMeasuredLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,97:1\n13579#2,2:98\n11425#2:100\n11536#2,4:101\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredLine.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredLine\n*L\n52#1:98,2\n75#1:100\n75#1:101,4\n*E\n"})
public final class LazyGridMeasuredLine {
    private final int a;
    @l
    private final LazyGridMeasuredItem[] b;
    @l
    private final List c;
    private final boolean d;
    private final int e;
    @l
    private final LayoutDirection f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;

    private LazyGridMeasuredLine(int v, LazyGridMeasuredItem[] arr_lazyGridMeasuredItem, List list0, boolean z, int v1, LayoutDirection layoutDirection0, int v2, int v3) {
        this.a = v;
        this.b = arr_lazyGridMeasuredItem;
        this.c = list0;
        this.d = z;
        this.e = v1;
        this.f = layoutDirection0;
        this.g = v2;
        this.h = v3;
        int v5 = 0;
        for(int v4 = 0; v4 < arr_lazyGridMeasuredItem.length; ++v4) {
            v5 = Math.max(v5, arr_lazyGridMeasuredItem[v4].d());
        }
        this.i = v5;
        this.j = s.u(v5 + this.g, 0);
    }

    public LazyGridMeasuredLine(int v, LazyGridMeasuredItem[] arr_lazyGridMeasuredItem, List list0, boolean z, int v1, LayoutDirection layoutDirection0, int v2, int v3, w w0) {
        this(v, arr_lazyGridMeasuredItem, list0, z, v1, layoutDirection0, v2, v3);
    }

    public final int a() {
        return this.a;
    }

    @l
    public final LazyGridMeasuredItem[] b() {
        return this.b;
    }

    public final int c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final boolean e() {
        return this.b.length == 0;
    }

    @l
    public final List f(int v, int v1, int v2) {
        LazyGridMeasuredItem[] arr_lazyGridMeasuredItem = this.b;
        List list0 = new ArrayList(arr_lazyGridMeasuredItem.length);
        int v3 = 0;
        int v5 = 0;
        int v6 = 0;
        for(int v4 = 0; v3 < arr_lazyGridMeasuredItem.length; ++v4) {
            LazyGridMeasuredItem lazyGridMeasuredItem0 = arr_lazyGridMeasuredItem[v3];
            int v7 = GridItemSpan.f(((GridItemSpan)this.c.get(v4)).i());
            int v8 = this.f == LayoutDirection.b ? this.e - v5 - v7 : v5;
            int v9 = this.d ? this.a : v8;
            if(!this.d) {
                v8 = this.a;
            }
            LazyGridPositionedItem lazyGridPositionedItem0 = lazyGridMeasuredItem0.h(v, v6, v1, v2, v9, v8);
            v6 += lazyGridMeasuredItem0.a() + this.h;
            v5 += v7;
            list0.add(lazyGridPositionedItem0);
            ++v3;
        }
        return list0;
    }
}

