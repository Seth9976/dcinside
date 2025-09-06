package kotlinx.coroutines;

import A3.o;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
final class j {
    public static final Object a(@l g g0, @l o o0) throws InterruptedException {
        g g2;
        o0 o00;
        Thread thread0 = Thread.currentThread();
        e e0 = (e)g0.get(e.z8);
        if(e0 == null) {
            o00 = m1.a.b();
            g g1 = g0.plus(o00);
            g2 = J.e(() -> i.a, g1);
        }
        else {
            if(e0 instanceof o0) {
                o0 o01 = (o0)e0;
            }
            o00 = m1.a.a();
            g2 = J.e(() -> i.a, g0);
        }
        kotlinx.coroutines.g g3 = new kotlinx.coroutines.g(g2, thread0, o00);
        g3.P1(Q.a, g3, o0);
        return g3.Q1();
    }

    public static Object b(g g0, o o0, int v, Object object0) throws InterruptedException {
        if((v & 1) != 0) {
            g0 = i.a;
        }
        return kotlinx.coroutines.i.f(g0, o0);
    }
}

