package kotlinx.coroutines;

import A3.o;
import M3.b;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.b0;
import y4.l;
import y4.m;

@s0({"SMAP\nBuilders.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n+ 2 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,269:1\n91#2,5:270\n*S KotlinDebug\n*F\n+ 1 Builders.common.kt\nkotlinx/coroutines/BuildersKt__Builders_commonKt\n*L\n162#1:270,5\n*E\n"})
final class k {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;

    @l
    public static final X a(@l O o0, @l g g0, @l Q q0, @l o o1) {
        X x0 = new Y(J.e(o0, g0), true);
        ((a)x0).P1(q0, x0, o1);
        return x0;
    }

    public static X b(O o0, g g0, Q q0, o o1, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        if((v & 2) != 0) {
            q0 = Q.a;
        }
        return kotlinx.coroutines.i.a(o0, g0, q0, o1);
    }

    @m
    public static final Object c(@l K k0, @l o o0, @l d d0) {
        return kotlinx.coroutines.i.h(k0, o0, d0);
    }

    private static final Object d(K k0, o o0, d d0) {
        return kotlinx.coroutines.i.h(k0, o0, d0);
    }

    @l
    public static final I0 e(@l O o0, @l g g0, @l Q q0, @l o o1) {
        I0 i00 = new g1(J.e(o0, g0), true);
        ((a)i00).P1(q0, i00, o1);
        return i00;
    }

    public static I0 f(O o0, g g0, Q q0, o o1, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        if((v & 2) != 0) {
            q0 = Q.a;
        }
        return kotlinx.coroutines.i.d(o0, g0, q0, o1);
    }

    @m
    public static final Object g(@l g g0, @l o o0, @l d d0) {
        Object object2;
        Object object0;
        g g1 = d0.getContext();
        g g2 = J.d(g1, g0);
        M0.z(g2);
        if(g2 == g1) {
            kotlinx.coroutines.internal.Q q0 = new kotlinx.coroutines.internal.Q(g2, d0);
            object0 = b.d(q0, q0, o0);
        }
        else if(L.g(g2.get(e.z8), g1.get(e.z8))) {
            w1 w10 = new w1(g2, d0);
            g g3 = w10.getContext();
            Object object1 = b0.c(g3, null);
            try {
                object2 = b.d(w10, w10, o0);
            }
            finally {
                b0.a(g3, object1);
            }
            object0 = object2;
        }
        else {
            d0 d00 = new d0(g2, d0);
            M3.a.f(o0, d00, d00, null, 4, null);
            object0 = d00.Q1();
        }
        if(object0 == kotlin.coroutines.intrinsics.b.l()) {
            h.c(d0);
        }
        return object0;
    }
}

