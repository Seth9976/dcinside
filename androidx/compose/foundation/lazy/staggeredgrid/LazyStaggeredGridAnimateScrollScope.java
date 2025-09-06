package androidx.compose.foundation.lazy.staggeredgrid;

import A3.o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@ExperimentalFoundationApi
@s0({"SMAP\nLazyStaggeredGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,70:1\n132#2,3:71\n33#2,4:74\n135#2,2:78\n38#2:80\n137#2:81\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridAnimateScrollScope\n*L\n55#1:71,3\n55#1:74,4\n55#1:78,2\n55#1:80\n55#1:81\n*E\n"})
public final class LazyStaggeredGridAnimateScrollScope implements LazyAnimateScrollScope {
    @l
    private final LazyStaggeredGridState a;

    public LazyStaggeredGridAnimateScrollScope(@l LazyStaggeredGridState lazyStaggeredGridState0) {
        L.p(lazyStaggeredGridState0, "state");
        super();
        this.a = lazyStaggeredGridState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float a(int v, int v1) {
        List list0 = this.a.w().f();
        int v2 = list0.size();
        int v4 = 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = (LazyStaggeredGridItemInfo)list0.get(v3);
            v4 += (this.a.G() ? IntSize.j(lazyStaggeredGridItemInfo0.a()) : IntSize.m(lazyStaggeredGridItemInfo0.a()));
        }
        int v5 = v4 / (list0.size() * this.a.t());
        return ((float)(v5 * (v - this.c()))) + ((float)(v1 >= 0 ? Math.min(Math.abs(v1), v5) : -Math.min(Math.abs(v1), v5))) - ((float)this.h());
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @m
    public Object b(@l o o0, @l d d0) {
        Object object0 = c.e(this.a, null, o0, d0, 1, null);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int c() {
        return this.a.q();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void d(@l ScrollScope scrollScope0, int v, int v1) {
        L.p(scrollScope0, "<this>");
        this.a.T(scrollScope0, v, v1);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int e() {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = (LazyStaggeredGridItemInfo)u.v3(this.a.w().f());
        return lazyStaggeredGridItemInfo0 == null ? 0 : lazyStaggeredGridItemInfo0.getIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @m
    public Integer f(int v) {
        LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0 = LazyStaggeredGridMeasureResultKt.a(this.a.w(), v);
        if(lazyStaggeredGridItemInfo0 != null) {
            long v1 = lazyStaggeredGridItemInfo0.b();
            return this.a.G() ? ((int)(v1 & 0xFFFFFFFFL)) : ((int)(v1 >> 0x20));
        }
        return null;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int g() {
        return this.a.t() * 100;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @l
    public Density getDensity() {
        return this.a.p();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.a.w().c();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int h() {
        return this.a.r();
    }
}

