package androidx.compose.foundation.lazy.grid;

import A3.o;
import A3.p;
import A3.q;
import kotlin.jvm.functions.Function1;

public final class b {
    public static void a(LazyGridScope lazyGridScope0, Object object0, Function1 function10, Object object1, p p0, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            object1 = null;
        }
        lazyGridScope0.b(object0, function10, object1, p0);
    }

    public static void b(LazyGridScope lazyGridScope0, int v, Function1 function10, o o0, Function1 function11, q q0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 8) != 0) {
            function11 = LazyGridScope.items.1.e;
        }
        lazyGridScope0.a(v, ((v1 & 2) == 0 ? function10 : null), ((v1 & 4) == 0 ? o0 : null), function11, q0);
    }
}

