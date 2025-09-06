package kotlinx.serialization.modules;

import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

public final class h {
    @l
    public static final f a() {
        return j.a();
    }

    @l
    public static final f b(@l Function1 function10) {
        L.p(function10, "builderAction");
        g g0 = new g();
        function10.invoke(g0);
        return g0.g();
    }

    public static final void c(g g0, i i0) {
        L.p(g0, "<this>");
        L.p(i0, "serializer");
        L.y(4, "T");
        g0.d(m0.d(Object.class), i0);
    }

    public static final void d(@l g g0, @l d d0, @m i i0, @l Function1 function10) {
        L.p(g0, "<this>");
        L.p(d0, "baseClass");
        L.p(function10, "builderAction");
        b b0 = new b(d0, i0);
        function10.invoke(b0);
        b0.a(g0);
    }

    public static void e(g g0, d d0, i i0, Function1 function10, int v, Object object0) {
        public static final class a extends N implements Function1 {
            public static final a e;

            static {
                a.e = new a();
            }

            public a() {
                super(1);
            }

            public final void a(@l b b0) {
                L.p(b0, "$this$null");
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((b)object0));
                return S0.a;
            }
        }

        if((v & 2) != 0) {
            i0 = null;
        }
        if((v & 4) != 0) {
            function10 = a.e;
        }
        L.p(g0, "<this>");
        L.p(d0, "baseClass");
        L.p(function10, "builderAction");
        b b0 = new b(d0, i0);
        function10.invoke(b0);
        b0.a(g0);
    }

    @l
    public static final f f(@l d d0, @l i i0) {
        L.p(d0, "kClass");
        L.p(i0, "serializer");
        g g0 = new g();
        g0.d(d0, i0);
        return g0.g();
    }

    public static final f g(i i0) {
        L.p(i0, "serializer");
        L.y(4, "T");
        return h.f(m0.d(Object.class), i0);
    }
}

