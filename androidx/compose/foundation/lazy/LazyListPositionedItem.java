package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,193:1\n186#1:194\n86#2:195\n86#2:196\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListPositionedItem\n*L\n170#1:194\n177#1:195\n179#1:196\n*E\n"})
public final class LazyListPositionedItem implements LazyListItemInfo {
    private final int a;
    private final int b;
    @l
    private final Object c;
    private final int d;
    private final int e;
    private final int f;
    private final boolean g;
    @l
    private final List h;
    @l
    private final LazyListItemPlacementAnimator i;
    private final long j;
    private final boolean k;
    private final int l;
    private final boolean m;

    private LazyListPositionedItem(int v, int v1, Object object0, int v2, int v3, int v4, boolean z, List list0, LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, long v5, boolean z1, int v6) {
        this.a = v;
        this.b = v1;
        this.c = object0;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = z;
        this.h = list0;
        this.i = lazyListItemPlacementAnimator0;
        this.j = v5;
        this.k = z1;
        this.l = v6;
        int v7 = this.g();
        boolean z2 = false;
        for(int v8 = 0; v8 < v7; ++v8) {
            if(this.b(v8) != null) {
                z2 = true;
                break;
            }
        }
        this.m = z2;
    }

    public LazyListPositionedItem(int v, int v1, Object object0, int v2, int v3, int v4, boolean z, List list0, LazyListItemPlacementAnimator lazyListItemPlacementAnimator0, long v5, boolean z1, int v6, w w0) {
        this(v, v1, object0, v2, v3, v4, z, list0, lazyListItemPlacementAnimator0, v5, z1, v6);
    }

    // 去混淆评级： 低(40)
    private final long a(long v, Function1 function10) {
        return IntOffsetKt.a((this.g ? ((int)(v >> 0x20)) : ((Number)function10.invoke(((int)(v >> 0x20)))).intValue()), (this.g ? ((Number)function10.invoke(((int)(v & 0xFFFFFFFFL)))).intValue() : ((int)(v & 0xFFFFFFFFL))));
    }

    @m
    public final FiniteAnimationSpec b(int v) {
        Object object0 = ((LazyListPlaceableWrapper)this.h.get(v)).b().c();
        return object0 instanceof FiniteAnimationSpec ? ((FiniteAnimationSpec)object0) : null;
    }

    public final boolean c() {
        return this.m;
    }

    public final int d(int v) {
        return this.e(((LazyListPlaceableWrapper)this.h.get(v)).b());
    }

    // 去混淆评级： 低(20)
    private final int e(Placeable placeable0) {
        return this.g ? placeable0.K1() : placeable0.N1();
    }

    public final long f(int v) {
        return ((LazyListPlaceableWrapper)this.h.get(v)).a();
    }

    public final int g() {
        return this.h.size();
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getIndex() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    @l
    public Object getKey() {
        return this.c;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.a;
    }

    @Override  // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.d;
    }

    public final void h(@l PlacementScope placeable$PlacementScope0) {
        int v10;
        int v7;
        long v6;
        L.p(placeable$PlacementScope0, "scope");
        int v = this.g();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = ((LazyListPlaceableWrapper)this.h.get(v1)).b();
            int v2 = this.e(placeable0);
            int v3 = this.e - v2;
            int v4 = this.f;
            if(this.b(v1) == null) {
                v6 = this.f(v1);
            }
            else {
                long v5 = this.f(v1);
                v6 = this.i.d(this.getKey(), v1, v3, v4, v5);
            }
            if(this.k) {
                if(this.g) {
                    v7 = (int)(v6 >> 0x20);
                }
                else {
                    int v8 = this.e(placeable0);
                    v7 = this.l - ((int)(v6 >> 0x20)) - v8;
                }
                if(this.g) {
                    int v9 = this.e(placeable0);
                    v10 = this.l - ((int)(v6 & 0xFFFFFFFFL)) - v9;
                }
                else {
                    v10 = (int)(v6 & 0xFFFFFFFFL);
                }
                v6 = IntOffsetKt.a(v7, v10);
            }
            if(this.g) {
                PlacementScope.F(placeable$PlacementScope0, placeable0, IntOffsetKt.a(((int)(v6 >> 0x20)) + ((int)(this.j >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) + ((int)(this.j & 0xFFFFFFFFL))), 0.0f, null, 6, null);
            }
            else {
                PlacementScope.B(placeable$PlacementScope0, placeable0, IntOffsetKt.a(((int)(v6 >> 0x20)) + ((int)(this.j >> 0x20)), ((int)(v6 & 0xFFFFFFFFL)) + ((int)(this.j & 0xFFFFFFFFL))), 0.0f, null, 6, null);
            }
        }
    }
}

