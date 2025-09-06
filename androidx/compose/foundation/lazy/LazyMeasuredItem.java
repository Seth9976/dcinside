package androidx.compose.foundation.lazy;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,6:194\n33#2,6:200\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n*L\n72#1:194,6\n93#1:200,6\n*E\n"})
public final class LazyMeasuredItem {
    private final int a;
    @l
    private final List b;
    private final boolean c;
    @m
    private final Horizontal d;
    @m
    private final Vertical e;
    @l
    private final LayoutDirection f;
    private final boolean g;
    private final int h;
    private final int i;
    @l
    private final LazyListItemPlacementAnimator j;
    private final int k;
    private final long l;
    @l
    private final Object m;
    private final int n;
    private final int o;
    private final int p;

    private LazyMeasuredItem(int v, List list0, boolean z, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, LayoutDirection layoutDirection0, boolean z1, int v1, int v2, LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, int v3, long v4, Object object0) {
        this.a = v;
        this.b = list0;
        this.c = z;
        this.d = alignment$Horizontal0;
        this.e = alignment$Vertical0;
        this.f = layoutDirection0;
        this.g = z1;
        this.h = v1;
        this.i = v2;
        this.j = lazyListItemPlacementAnimator0;
        this.k = v3;
        this.l = v4;
        this.m = object0;
        int v5 = list0.size();
        int v7 = 0;
        int v8 = 0;
        for(int v6 = 0; v6 < v5; ++v6) {
            Placeable placeable0 = (Placeable)list0.get(v6);
            v7 += (this.c ? placeable0.K1() : placeable0.N1());
            v8 = Math.max(v8, (this.c ? placeable0.N1() : placeable0.K1()));
        }
        this.n = v7;
        this.o = s.u(v7 + this.k, 0);
        this.p = v8;
    }

    @ExperimentalFoundationApi
    public LazyMeasuredItem(int v, List list0, boolean z, Horizontal alignment$Horizontal0, Vertical alignment$Vertical0, LayoutDirection layoutDirection0, boolean z1, int v1, int v2, LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, int v3, long v4, Object object0, w w0) {
        this(v, list0, z, alignment$Horizontal0, alignment$Vertical0, layoutDirection0, z1, v1, v2, lazyListItemPlacementAnimator0, v3, v4, object0);
    }

    public final int a() {
        return this.p;
    }

    public final int b() {
        return this.a;
    }

    @l
    public final Object c() {
        return this.m;
    }

    public final int d() {
        return this.n;
    }

    public final int e() {
        return this.o;
    }

    @l
    public final LazyListPositionedItem f(int v, int v1, int v2) {
        long v7;
        ArrayList arrayList0 = new ArrayList();
        int v3 = this.c ? v2 : v1;
        List list0 = this.b;
        int v4 = list0.size();
        int v6 = v;
        for(int v5 = 0; v5 < v4; ++v5) {
            Placeable placeable0 = (Placeable)list0.get(v5);
            if(this.c) {
                Horizontal alignment$Horizontal0 = this.d;
                if(alignment$Horizontal0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                v7 = IntOffsetKt.a(alignment$Horizontal0.a(placeable0.N1(), v1, this.f), v6);
            }
            else {
                Vertical alignment$Vertical0 = this.e;
                if(alignment$Vertical0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                v7 = IntOffsetKt.a(v6, alignment$Vertical0.a(placeable0.K1(), v2));
            }
            v6 += (this.c ? placeable0.K1() : placeable0.N1());
            arrayList0.add(new LazyListPlaceableWrapper(v7, placeable0, null));
        }
        return new LazyListPositionedItem(v, this.a, this.m, this.n, -this.h, v3 + this.i, this.c, arrayList0, this.j, this.l, this.g, v3, null);
    }
}

