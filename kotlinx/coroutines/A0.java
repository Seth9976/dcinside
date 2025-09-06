package kotlinx.coroutines;

import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,159:1\n318#2,11:160\n318#2,11:171\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/DelayKt\n*L\n103#1:160,11\n123#1:171,11\n*E\n"})
public final class a0 {
    @m
    public static final Object a(@l d d0) {
        @f(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {0xA0}, m = "awaitCancellation", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {
            Object k;
            int l;

            a(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.k = object0;
                this.l |= 0x80000000;
                return a0.a(this);
            }
        }

        a a0$a0;
        if(d0 instanceof a) {
            a0$a0 = (a)d0;
            int v = a0$a0.l;
            if((v & 0x80000000) == 0) {
                a0$a0 = new a(d0);
            }
            else {
                a0$a0.l = v ^ 0x80000000;
            }
        }
        else {
            a0$a0 = new a(d0);
        }
        Object object0 = a0$a0.k;
        Object object1 = b.l();
        switch(a0$a0.l) {
            case 0: {
                f0.n(object0);
                a0$a0.l = 1;
                p p0 = new p(b.e(a0$a0), 1);
                p0.c0();
                Object object2 = p0.x();
                if(object2 == b.l()) {
                    h.c(a0$a0);
                }
                if(object2 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        throw new y();
    }

    @m
    public static final Object b(long v, @l d d0) {
        if(v <= 0L) {
            return S0.a;
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        if(v < 0x7FFFFFFFFFFFFFFFL) {
            a0.d(p0.getContext()).v(v, p0);
        }
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0 == b.l() ? object0 : S0.a;
    }

    @m
    public static final Object c(long v, @l d d0) {
        Object object0 = a0.b(a0.e(v), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @l
    public static final Z d(@l g g0) {
        kotlin.coroutines.g.b g$b0 = g0.get(e.z8);
        Z z0 = g$b0 instanceof Z ? ((Z)g$b0) : null;
        return z0 == null ? W.a() : z0;
    }

    // 去混淆评级： 低(30)
    public static final long e(long v) {
        return kotlin.time.e.f0(v) ? kotlin.time.e.L(kotlin.time.e.h0(v, kotlin.time.g.n0(0xF423FL, kotlin.time.h.b))) : 0L;
    }
}

