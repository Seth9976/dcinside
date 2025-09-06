package androidx.compose.foundation.lazy.grid;

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

@s0({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,196:1\n194#1:197\n86#2:198\n86#2:199\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridPositionedItem\n*L\n178#1:197\n185#1:198\n187#1:199\n*E\n"})
public final class LazyGridPositionedItem implements LazyGridItemInfo {
    private final long d;
    private final int e;
    @l
    private final Object f;
    private final int g;
    private final int h;
    private final long i;
    private final int j;
    private final int k;
    private final boolean l;
    @l
    private final List m;
    @l
    private final LazyGridItemPlacementAnimator n;
    private final long o;
    private final int p;
    private final boolean q;
    private final boolean r;

    private LazyGridPositionedItem(long v, int v1, Object object0, int v2, int v3, long v4, int v5, int v6, boolean z, List list0, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, long v7, int v8, boolean z1) {
        this.d = v;
        this.e = v1;
        this.f = object0;
        this.g = v2;
        this.h = v3;
        this.i = v4;
        this.j = v5;
        this.k = v6;
        this.l = z;
        this.m = list0;
        this.n = lazyGridItemPlacementAnimator0;
        this.o = v7;
        this.p = v8;
        this.q = z1;
        int v9 = this.l();
        boolean z2 = false;
        for(int v10 = 0; v10 < v9; ++v10) {
            if(this.e(v10) != null) {
                z2 = true;
                break;
            }
        }
        this.r = z2;
    }

    public LazyGridPositionedItem(long v, int v1, Object object0, int v2, int v3, long v4, int v5, int v6, boolean z, List list0, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator0, long v7, int v8, boolean z1, w w0) {
        this(v, v1, object0, v2, v3, v4, v5, v6, z, list0, lazyGridItemPlacementAnimator0, v7, v8, z1);
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public long a() {
        return this.i;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public long b() {
        return this.d;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int c() {
        return this.g;
    }

    // 去混淆评级： 低(40)
    private final long d(long v, Function1 function10) {
        return IntOffsetKt.a((this.l ? ((int)(v >> 0x20)) : ((Number)function10.invoke(((int)(v >> 0x20)))).intValue()), (this.l ? ((Number)function10.invoke(((int)(v & 0xFFFFFFFFL)))).intValue() : ((int)(v & 0xFFFFFFFFL))));
    }

    @m
    public final FiniteAnimationSpec e(int v) {
        Object object0 = ((Placeable)this.m.get(v)).c();
        return object0 instanceof FiniteAnimationSpec ? ((FiniteAnimationSpec)object0) : null;
    }

    // 去混淆评级： 低(20)
    public final int f() {
        return this.l ? ((int)(this.b() >> 0x20)) : ((int)(this.b() & 0xFFFFFFFFL));
    }

    // 去混淆评级： 低(20)
    public final int g() {
        return this.l ? ((int)(this.a() >> 0x20)) : ((int)(this.a() & 0xFFFFFFFFL));
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getColumn() {
        return this.h;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    public int getIndex() {
        return this.e;
    }

    @Override  // androidx.compose.foundation.lazy.grid.LazyGridItemInfo
    @l
    public Object getKey() {
        return this.f;
    }

    public final boolean h() {
        return this.r;
    }

    // 去混淆评级： 低(20)
    public final int i() {
        return this.l ? ((int)(this.a() & 0xFFFFFFFFL)) : ((int)(this.a() >> 0x20));
    }

    public final int j(int v) {
        return this.k(((Placeable)this.m.get(v)));
    }

    // 去混淆评级： 低(20)
    private final int k(Placeable placeable0) {
        return this.l ? placeable0.K1() : placeable0.N1();
    }

    public final int l() {
        return this.m.size();
    }

    public final void m(@l PlacementScope placeable$PlacementScope0) {
        int v7;
        int v4;
        L.p(placeable$PlacementScope0, "scope");
        int v = this.l();
        for(int v1 = 0; v1 < v; ++v1) {
            Placeable placeable0 = (Placeable)this.m.get(v1);
            int v2 = this.k(placeable0);
            long v3 = this.e(v1) == null ? this.b() : this.n.d(this.getKey(), v1, this.j - v2, this.k, this.b());
            if(this.q) {
                if(this.l) {
                    v4 = (int)(v3 >> 0x20);
                }
                else {
                    int v5 = this.k(placeable0);
                    v4 = this.p - ((int)(v3 >> 0x20)) - v5;
                }
                if(this.l) {
                    int v6 = this.k(placeable0);
                    v7 = this.p - ((int)(v3 & 0xFFFFFFFFL)) - v6;
                }
                else {
                    v7 = (int)(v3 & 0xFFFFFFFFL);
                }
                v3 = IntOffsetKt.a(v4, v7);
            }
            if(this.l) {
                PlacementScope.F(placeable$PlacementScope0, placeable0, IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(this.o >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(this.o & 0xFFFFFFFFL))), 0.0f, null, 6, null);
            }
            else {
                PlacementScope.B(placeable$PlacementScope0, placeable0, IntOffsetKt.a(((int)(v3 >> 0x20)) + ((int)(this.o >> 0x20)), ((int)(v3 & 0xFFFFFFFFL)) + ((int)(this.o & 0xFFFFFFFFL))), 0.0f, null, 6, null);
            }
        }
    }
}

