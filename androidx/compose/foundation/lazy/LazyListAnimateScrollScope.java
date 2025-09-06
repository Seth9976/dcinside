package androidx.compose.foundation.lazy;

import A3.o;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyListAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,65:1\n116#2,2:66\n33#2,6:68\n118#2:74\n132#2,3:75\n33#2,4:78\n135#2,2:82\n38#2:84\n137#2:85\n*S KotlinDebug\n*F\n+ 1 LazyListAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListAnimateScrollScope\n*L\n44#1:66,2\n44#1:68,6\n44#1:74\n54#1:75,3\n54#1:78,4\n54#1:82,2\n54#1:84\n54#1:85\n*E\n"})
public final class LazyListAnimateScrollScope implements LazyAnimateScrollScope {
    @l
    private final LazyListState a;
    private final int b;

    public LazyListAnimateScrollScope(@l LazyListState lazyListState0) {
        L.p(lazyListState0, "state");
        super();
        this.a = lazyListState0;
        this.b = 100;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float a(int v, int v1) {
        List list0 = this.a.r().f();
        int v2 = list0.size();
        int v4 = 0;
        for(int v3 = 0; v3 < v2; ++v3) {
            v4 += ((LazyListItemInfo)list0.get(v3)).getSize();
        }
        int v5 = v4 / list0.size();
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
        return this.a.n();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public void d(@l ScrollScope scrollScope0, int v, int v1) {
        L.p(scrollScope0, "<this>");
        this.a.M(v, v1);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int e() {
        LazyListItemInfo lazyListItemInfo0 = (LazyListItemInfo)u.v3(this.a.r().f());
        return lazyListItemInfo0 == null ? 0 : lazyListItemInfo0.getIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @m
    public Integer f(int v) {
        List list0 = this.a.r().f();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(((LazyListItemInfo)object0).getIndex() == v) {
                return ((LazyListItemInfo)object0) == null ? null : ((LazyListItemInfo)object0).getOffset();
            }
        }
        return null;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int g() {
        return this.b;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @l
    public Density getDensity() {
        return this.a.m();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int getItemCount() {
        return this.a.r().c();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int h() {
        return this.a.o();
    }
}

