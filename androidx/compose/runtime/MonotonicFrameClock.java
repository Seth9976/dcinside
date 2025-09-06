package androidx.compose.runtime;

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

public interface MonotonicFrameClock extends b {
    public static final class DefaultImpls {
        public static Object a(@l MonotonicFrameClock monotonicFrameClock0, Object object0, @l o o0) {
            L.p(o0, "operation");
            return a.a(monotonicFrameClock0, object0, o0);
        }

        @m
        public static b b(@l MonotonicFrameClock monotonicFrameClock0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.b(monotonicFrameClock0, g$c0);
        }

        @Deprecated
        @l
        public static c c(@l MonotonicFrameClock monotonicFrameClock0) {
            return androidx.compose.runtime.c.a(monotonicFrameClock0);
        }

        @l
        public static g d(@l MonotonicFrameClock monotonicFrameClock0, @l c g$c0) {
            L.p(g$c0, "key");
            return a.c(monotonicFrameClock0, g$c0);
        }

        @l
        public static g e(@l MonotonicFrameClock monotonicFrameClock0, @l g g0) {
            L.p(g0, "context");
            return a.d(monotonicFrameClock0, g0);
        }
    }

    public static final class Key implements c {
        static final Key a;

        static {
            Key.a = new Key();
        }
    }

    @l
    public static final Key k0;

    static {
        MonotonicFrameClock.k0 = Key.a;
    }

    @Override  // kotlin.coroutines.g$b
    @l
    c getKey();

    @m
    Object s(@l Function1 arg1, @l d arg2);
}

