package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nMonotonicFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n1#1,120:1\n66#1:121\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.kt\nandroidx/compose/runtime/MonotonicFrameClockKt\n*L\n108#1:121\n*E\n"})
public final class MonotonicFrameClockKt {
    @l
    public static final MonotonicFrameClock a(@l g g0) {
        L.p(g0, "<this>");
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)g0.get(MonotonicFrameClock.k0);
        if(monotonicFrameClock0 == null) {
            throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        }
        return monotonicFrameClock0;
    }

    @ExperimentalComposeApi
    public static void b(g g0) {
    }

    @m
    public static final Object c(@l MonotonicFrameClock monotonicFrameClock0, @l Function1 function10, @l d d0) {
        return monotonicFrameClock0.s(new Function1(function10) {
            final Function1 e;

            {
                this.e = function10;
                super(1);
            }

            public final Object a(long v) {
                return this.e.invoke(((long)(v / 1000000L)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Number)object0).longValue());
            }
        }, d0);
    }

    @m
    public static final Object d(@l Function1 function10, @l d d0) {
        return MonotonicFrameClockKt.a(d0.getContext()).s(new androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis.2(function10), d0);
    }

    private static final Object e(MonotonicFrameClock monotonicFrameClock0, Function1 function10, d d0) {
        return monotonicFrameClock0.s(new androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis.2(function10), d0);
    }

    @m
    public static final Object f(@l Function1 function10, @l d d0) {
        return MonotonicFrameClockKt.a(d0.getContext()).s(function10, d0);
    }
}

