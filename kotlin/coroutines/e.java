package kotlin.coroutines;

import A3.o;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@h0(version = "1.3")
public interface e extends b {
    public static final class a {
        public static Object a(@l e e0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return kotlin.coroutines.g.b.a.a(e0, object0, o0);
        }

        @m
        public static b b(@l e e0, @l c g$c0) {
            L.p(g$c0, "key");
            if(g$c0 instanceof kotlin.coroutines.b) {
                if(((kotlin.coroutines.b)g$c0).a(e0.getKey())) {
                    b g$b0 = ((kotlin.coroutines.b)g$c0).b(e0);
                    return g$b0 instanceof b ? g$b0 : null;
                }
                return null;
            }
            if(e.z8 == g$c0) {
                L.n(e0, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return e0;
            }
            return null;
        }

        @l
        public static g c(@l e e0, @l c g$c0) {
            L.p(g$c0, "key");
            if(g$c0 instanceof kotlin.coroutines.b) {
                return ((kotlin.coroutines.b)g$c0).a(e0.getKey()) && ((kotlin.coroutines.b)g$c0).b(e0) != null ? i.a : e0;
            }
            return e.z8 == g$c0 ? i.a : e0;
        }

        @l
        public static g d(@l e e0, @l g g0) {
            L.p(g0, "context");
            return kotlin.coroutines.g.b.a.d(e0, g0);
        }

        public static void e(@l e e0, @l d d0) {
            L.p(d0, "continuation");
        }
    }

    public static final class kotlin.coroutines.e.b implements c {
        static final kotlin.coroutines.e.b a;

        static {
            kotlin.coroutines.e.b.a = new kotlin.coroutines.e.b();
        }
    }

    @l
    public static final kotlin.coroutines.e.b z8;

    static {
        e.z8 = kotlin.coroutines.e.b.a;
    }

    @l
    d f0(@l d arg1);

    @Override  // kotlin.coroutines.g$b
    @m
    b get(@l c arg1);

    void i(@l d arg1);

    @Override  // kotlin.coroutines.g$b
    @l
    g minusKey(@l c arg1);
}

