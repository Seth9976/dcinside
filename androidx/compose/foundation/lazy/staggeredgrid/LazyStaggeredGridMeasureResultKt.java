package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class LazyStaggeredGridMeasureResultKt {
    @m
    public static final LazyStaggeredGridItemInfo a(@l LazyStaggeredGridLayoutInfo lazyStaggeredGridLayoutInfo0, int v) {
        L.p(lazyStaggeredGridLayoutInfo0, "<this>");
        if(lazyStaggeredGridLayoutInfo0.f().isEmpty()) {
            return null;
        }
        int v1 = ((LazyStaggeredGridItemInfo)u.B2(lazyStaggeredGridLayoutInfo0.f())).getIndex();
        if(v <= ((LazyStaggeredGridItemInfo)u.p3(lazyStaggeredGridLayoutInfo0.f())).getIndex() && v1 <= v) {
            int v2 = u.x(lazyStaggeredGridLayoutInfo0.f(), 0, 0, new Function1(v) {
                final int e;

                {
                    this.e = v;
                    super(1);
                }

                @l
                public final Integer a(@l LazyStaggeredGridItemInfo lazyStaggeredGridItemInfo0) {
                    L.p(lazyStaggeredGridItemInfo0, "it");
                    return (int)(lazyStaggeredGridItemInfo0.getIndex() - this.e);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((LazyStaggeredGridItemInfo)object0));
                }
            }, 3, null);
            return (LazyStaggeredGridItemInfo)u.W2(lazyStaggeredGridLayoutInfo0.f(), v2);
        }
        return null;
    }
}

