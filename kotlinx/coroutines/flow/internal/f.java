package kotlinx.coroutines.flow.internal;

import A3.o;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.internal.b0;
import y4.l;
import y4.m;

@s0({"SMAP\nChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,241:1\n91#2,5:242\n*S KotlinDebug\n*F\n+ 1 ChannelFlow.kt\nkotlinx/coroutines/flow/internal/ChannelFlowKt\n*L\n222#1:242,5\n*E\n"})
public final class f {
    @l
    public static final e b(@l i i0) {
        e e0 = i0 instanceof e ? ((e)i0) : null;
        return e0 == null ? new kotlinx.coroutines.flow.internal.i(i0, null, 0, null, 14, null) : e0;
    }

    @m
    public static final Object c(@l g g0, Object object0, @l Object object1, @l o o0, @l d d0) {
        Object object3;
        Object object2 = b0.c(g0, object1);
        try {
            z z0 = new z(d0, g0);
            object3 = o0 instanceof a ? ((o)v0.q(o0, 2)).invoke(object0, z0) : b.i(o0, object0, z0);
        }
        finally {
            b0.a(g0, object2);
        }
        if(object3 == b.l()) {
            h.c(d0);
        }
        return object3;
    }

    public static Object d(g g0, Object object0, Object object1, o o0, d d0, int v, Object object2) {
        if((v & 4) != 0) {
            object1 = b0.b(g0);
        }
        return f.c(g0, object0, object1, o0, d0);
    }

    private static final j e(j j0, g g0) {
        return !(j0 instanceof y ? true : j0 instanceof t) ? new B(j0, g0) : j0;
    }
}

