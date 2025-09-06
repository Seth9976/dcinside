package kotlinx.coroutines;

import A3.o;
import kotlin.coroutines.g.b;
import kotlin.coroutines.g.c;
import kotlin.coroutines.g;
import y4.l;
import y4.m;

public interface CoroutineExceptionHandler extends b {
    public static final class a {
        public static Object a(@l CoroutineExceptionHandler coroutineExceptionHandler0, Object object0, @l o o0) {
            return kotlin.coroutines.g.b.a.a(coroutineExceptionHandler0, object0, o0);
        }

        @m
        public static b b(@l CoroutineExceptionHandler coroutineExceptionHandler0, @l c g$c0) {
            return kotlin.coroutines.g.b.a.b(coroutineExceptionHandler0, g$c0);
        }

        @l
        public static g c(@l CoroutineExceptionHandler coroutineExceptionHandler0, @l c g$c0) {
            return kotlin.coroutines.g.b.a.c(coroutineExceptionHandler0, g$c0);
        }

        @l
        public static g d(@l CoroutineExceptionHandler coroutineExceptionHandler0, @l g g0) {
            return kotlin.coroutines.g.b.a.d(coroutineExceptionHandler0, g0);
        }
    }

    public static final class kotlinx.coroutines.CoroutineExceptionHandler.b implements c {
        static final kotlinx.coroutines.CoroutineExceptionHandler.b a;

        static {
            kotlinx.coroutines.CoroutineExceptionHandler.b.a = new kotlinx.coroutines.CoroutineExceptionHandler.b();
        }
    }

    @l
    public static final kotlinx.coroutines.CoroutineExceptionHandler.b A8;

    static {
        CoroutineExceptionHandler.A8 = kotlinx.coroutines.CoroutineExceptionHandler.b.a;
    }

    void handleException(@l g arg1, @l Throwable arg2);
}

