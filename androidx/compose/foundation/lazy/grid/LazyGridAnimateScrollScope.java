package androidx.compose.foundation.lazy.grid;

import A3.o;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.c;
import androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nLazyGridAnimateScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,122:1\n116#2,2:123\n33#2,6:125\n118#2:131\n*S KotlinDebug\n*F\n+ 1 LazyGridAnimateScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope\n*L\n42#1:123,2\n42#1:125,6\n42#1:131\n*E\n"})
public final class LazyGridAnimateScrollScope implements LazyAnimateScrollScope {
    @l
    private final LazyGridState a;

    public LazyGridAnimateScrollScope(@l LazyGridState lazyGridState0) {
        L.p(lazyGridState0, "state");
        super();
        this.a = lazyGridState0;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public float a(int v, int v1) {
        List list0 = this.a.r().f();
        int v2 = this.a.B();
        int v3 = this.i(list0, this.a.C());
        int v4 = 1;
        boolean z = v < this.c();
        int v5 = this.c();
        if(z) {
            v4 = -1;
        }
        return ((float)(v3 * ((v - v5 + (v2 - 1) * v4) / v2))) + ((float)(v1 >= 0 ? Math.min(Math.abs(v1), v3) : -Math.min(Math.abs(v1), v3))) - ((float)this.h());
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
        this.a.Q(v, v1);
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int e() {
        LazyGridItemInfo lazyGridItemInfo0 = (LazyGridItemInfo)u.v3(this.a.r().f());
        return lazyGridItemInfo0 == null ? 0 : lazyGridItemInfo0.getIndex();
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    @m
    public Integer f(int v) {
        Object object0;
        List list0 = this.a.r().f();
        int v1 = list0.size();
        for(int v2 = 0; true; ++v2) {
            object0 = null;
            if(v2 >= v1) {
                break;
            }
            Object object1 = list0.get(v2);
            if(((LazyGridItemInfo)object1).getIndex() == v) {
                object0 = object1;
                break;
            }
        }
        if(((LazyGridItemInfo)object0) != null) {
            return this.a.C() ? IntOffset.o(((LazyGridItemInfo)object0).b()) : IntOffset.m(((LazyGridItemInfo)object0).b());
        }
        return null;
    }

    @Override  // androidx.compose.foundation.lazy.layout.LazyAnimateScrollScope
    public int g() {
        return this.a.B() * 100;
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

    private final int i(List list0, boolean z) {
        androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope.calculateLineAverageMainAxisSize.lineOf.1 lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$10 = new Function1(list0) {
            final boolean e;
            final List f;

            {
                this.e = z;
                this.f = list0;
                super(1);
            }

            // 去混淆评级： 低(20)
            @l
            public final Integer a(int v) {
                return this.e ? ((LazyGridItemInfo)this.f.get(v)).c() : ((LazyGridItemInfo)this.f.get(v)).getColumn();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).intValue());
            }
        };
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        while(v < list0.size()) {
            int v3 = ((Number)lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$10.invoke(v)).intValue();
            if(v3 == -1) {
                ++v;
            }
            else {
                int v4 = 0;
                while(v < list0.size() && ((Number)lazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$10.invoke(v)).intValue() == v3) {
                    v4 = Math.max(v4, (z ? IntSize.j(((LazyGridItemInfo)list0.get(v)).a()) : IntSize.m(((LazyGridItemInfo)list0.get(v)).a())));
                    ++v;
                }
                v1 += v4;
                ++v2;
            }
        }
        return v1 / v2;
    }
}

