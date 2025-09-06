package androidx.compose.ui.platform;

import A3.o;
import kotlin.coroutines.d;
import kotlin.coroutines.g.b.a;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface InfiniteAnimationPolicy extends b {
    public static final class DefaultImpls {
        public static Object a(@l InfiniteAnimationPolicy infiniteAnimationPolicy0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return a.a(infiniteAnimationPolicy0, object0, o0);
        }

        @m
        public static b b(@l InfiniteAnimationPolicy infiniteAnimationPolicy0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.b(infiniteAnimationPolicy0, g$c0);
        }

        @Deprecated
        @l
        public static c c(@l InfiniteAnimationPolicy infiniteAnimationPolicy0) {
            return u.a(infiniteAnimationPolicy0);
        }

        @l
        public static g d(@l InfiniteAnimationPolicy infiniteAnimationPolicy0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.c(infiniteAnimationPolicy0, g$c0);
        }

        @l
        public static g e(@l InfiniteAnimationPolicy infiniteAnimationPolicy0, @l g g0) {
            L.p(g0, "context");
            return a.d(infiniteAnimationPolicy0, g0);
        }
    }

    public static final class Key implements c {
        static final Key a;

        static {
            Key.a = new Key();
        }
    }

    @l
    public static final Key r0;

    static {
        InfiniteAnimationPolicy.r0 = Key.a;
    }

    @m
    Object R(@l Function1 arg1, @l d arg2);

    @Override  // kotlin.coroutines.g$b
    @l
    c getKey();
}

