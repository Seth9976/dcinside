package androidx.compose.foundation.lazy;

import A3.p;
import A3.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

public final class LazyListScope.-CC {
    @k(level = m.c, message = "Use the non deprecated overload")
    public static void a(LazyListScope lazyListScope0, Object object0, p p0) {
        L.p(p0, "content");
        lazyListScope0.d(object0, null, p0);
    }

    public static void b(LazyListScope lazyListScope0, @y4.m Object object0, @y4.m Object object1, @l p p0) {
        L.p(p0, "content");
        throw new IllegalStateException("The method is not implemented");
    }

    @k(level = m.c, message = "Use the non deprecated overload")
    public static void c(LazyListScope lazyListScope0, int v, Function1 function10, q q0) {
        L.p(q0, "itemContent");
        lazyListScope0.a(v, function10, LazyListScope.items.2.e, q0);
    }

    public static void d(LazyListScope lazyListScope0, int v, @y4.m Function1 function10, @l Function1 function11, @l q q0) {
        L.p(function11, "contentType");
        L.p(q0, "itemContent");
        throw new IllegalStateException("The method is not implemented");
    }

    public static void i(LazyListScope lazyListScope0, Object object0, p p0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        lazyListScope0.c(object0, p0);
    }

    public static void j(LazyListScope lazyListScope0, Object object0, Object object1, p p0, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        lazyListScope0.d(object0, object1, p0);
    }

    public static void k(LazyListScope lazyListScope0, int v, Function1 function10, q q0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 2) != 0) {
            function10 = null;
        }
        lazyListScope0.b(v, function10, q0);
    }

    public static void l(LazyListScope lazyListScope0, int v, Function1 function10, Function1 function11, q q0, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        if((v1 & 2) != 0) {
            function10 = null;
        }
        if((v1 & 4) != 0) {
            function11 = LazyListScope.items.1.e;
        }
        lazyListScope0.a(v, function10, function11, q0);
    }

    public static void m(LazyListScope lazyListScope0, Object object0, Object object1, p p0, int v, Object object2) {
        if(object2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
        if((v & 1) != 0) {
            object0 = null;
        }
        if((v & 2) != 0) {
            object1 = null;
        }
        lazyListScope0.e(object0, object1, p0);
    }
}

