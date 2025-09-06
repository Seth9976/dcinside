package androidx.compose.foundation.lazy;

import A3.p;
import A3.q;
import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;
import y4.l;

@LazyScopeMarker
public interface LazyListScope {
    public static final class DefaultImpls {
        @Deprecated
        @k(level = m.c, message = "Use the non deprecated overload")
        public static void a(LazyListScope lazyListScope0, Object object0, p p0) {
            L.p(p0, "content");
            LazyListScope.-CC.a(lazyListScope0, object0, p0);
        }

        @Deprecated
        public static void b(@l LazyListScope lazyListScope0, @y4.m Object object0, @y4.m Object object1, @l p p0) {
            L.p(p0, "content");
            LazyListScope.-CC.b(lazyListScope0, object0, object1, p0);
        }

        public static void c(LazyListScope lazyListScope0, Object object0, p p0, int v, Object object1) {
            LazyListScope.-CC.i(lazyListScope0, object0, p0, v, object1);
        }

        public static void d(LazyListScope lazyListScope0, Object object0, Object object1, p p0, int v, Object object2) {
            LazyListScope.-CC.j(lazyListScope0, object0, object1, p0, v, object2);
        }

        @Deprecated
        @k(level = m.c, message = "Use the non deprecated overload")
        public static void e(LazyListScope lazyListScope0, int v, Function1 function10, q q0) {
            L.p(q0, "itemContent");
            LazyListScope.-CC.c(lazyListScope0, v, function10, q0);
        }

        @Deprecated
        public static void f(@l LazyListScope lazyListScope0, int v, @y4.m Function1 function10, @l Function1 function11, @l q q0) {
            L.p(function11, "contentType");
            L.p(q0, "itemContent");
            LazyListScope.-CC.d(lazyListScope0, v, function10, function11, q0);
        }

        public static void g(LazyListScope lazyListScope0, int v, Function1 function10, q q0, int v1, Object object0) {
            LazyListScope.-CC.k(lazyListScope0, v, function10, q0, v1, object0);
        }

        public static void h(LazyListScope lazyListScope0, int v, Function1 function10, Function1 function11, q q0, int v1, Object object0) {
            LazyListScope.-CC.l(lazyListScope0, v, function10, function11, q0, v1, object0);
        }

        public static void i(LazyListScope lazyListScope0, Object object0, Object object1, p p0, int v, Object object2) {
            LazyListScope.-CC.m(lazyListScope0, object0, object1, p0, v, object2);
        }
    }

    void a(int arg1, @y4.m Function1 arg2, @l Function1 arg3, @l q arg4);

    @k(level = m.c, message = "Use the non deprecated overload")
    void b(int arg1, Function1 arg2, q arg3);

    @k(level = m.c, message = "Use the non deprecated overload")
    void c(Object arg1, p arg2);

    void d(@y4.m Object arg1, @y4.m Object arg2, @l p arg3);

    @ExperimentalFoundationApi
    void e(@y4.m Object arg1, @y4.m Object arg2, @l p arg3);
}

