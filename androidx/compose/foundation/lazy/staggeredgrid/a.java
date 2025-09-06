package androidx.compose.foundation.lazy.staggeredgrid;

import A3.p;
import A3.q;
import kotlin.jvm.functions.Function1;

public final class a {
    public static void a(LazyStaggeredGridScope lazyStaggeredGridScope0, Object object0, Object object1, StaggeredGridItemSpan staggeredGridItemSpan0, p p0, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        if((v & 4) != 0) {
            staggeredGridItemSpan0 = null;
        }
        lazyStaggeredGridScope0.a(object0, object1, staggeredGridItemSpan0, p0);
    }

    public static void b(LazyStaggeredGridScope lazyStaggeredGridScope0, int v, Function1 function10, Function1 function11, Function1 function12, q q0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 4) != 0) {
            function11 = LazyStaggeredGridScope.items.1.e;
        }
        lazyStaggeredGridScope0.b(v, ((v1 & 2) == 0 ? function10 : null), function11, ((v1 & 8) == 0 ? function12 : null), q0);
    }
}

