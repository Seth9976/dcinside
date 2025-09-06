package kotlin.coroutines;

import A3.o;
import kotlin.K;
import kotlin.S0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.e0;
import kotlin.f0;
import kotlin.h0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class f {
    @h0(version = "1.3")
    @kotlin.internal.f
    private static final d a(g g0, Function1 function10) {
        public static final class a implements d {
            final g a;
            final Function1 b;

            public a(g g0, Function1 function10) {
                this.a = g0;
                this.b = function10;
                super();
            }

            @Override  // kotlin.coroutines.d
            public g getContext() {
                return this.a;
            }

            @Override  // kotlin.coroutines.d
            public void resumeWith(Object object0) {
                e0 e00 = e0.a(object0);
                this.b.invoke(e00);
            }
        }

        L.p(g0, "context");
        L.p(function10, "resumeWith");
        return new a(g0, function10);
    }

    @h0(version = "1.3")
    @l
    public static final d b(@l o o0, Object object0, @l d d0) {
        L.p(o0, "<this>");
        L.p(d0, "completion");
        return new k(b.e(b.b(o0, object0, d0)), b.l());
    }

    @h0(version = "1.3")
    @l
    public static final d c(@l Function1 function10, @l d d0) {
        L.p(function10, "<this>");
        L.p(d0, "completion");
        return new k(b.e(b.c(function10, d0)), b.l());
    }

    private static final g d() {
        throw new K("Implemented as intrinsic");
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    public static void e() {
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final void f(d d0, Object object0) {
        L.p(d0, "<this>");
        d0.resumeWith(object0);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final void g(d d0, Throwable throwable0) {
        L.p(d0, "<this>");
        L.p(throwable0, "exception");
        d0.resumeWith(e0.b(f0.a(throwable0)));
    }

    @h0(version = "1.3")
    public static final void h(@l o o0, Object object0, @l d d0) {
        L.p(o0, "<this>");
        L.p(d0, "completion");
        b.e(b.b(o0, object0, d0)).resumeWith(S0.a);
    }

    @h0(version = "1.3")
    public static final void i(@l Function1 function10, @l d d0) {
        L.p(function10, "<this>");
        L.p(d0, "completion");
        b.e(b.c(function10, d0)).resumeWith(S0.a);
    }

    @h0(version = "1.3")
    @kotlin.internal.f
    private static final Object j(Function1 function10, d d0) {
        k k0 = new k(b.e(d0));
        function10.invoke(k0);
        Object object0 = k0.a();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

