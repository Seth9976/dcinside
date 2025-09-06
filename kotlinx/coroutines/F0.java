package kotlinx.coroutines;

import A3.a;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.internal.n;
import y4.l;

@s0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,218:1\n196#1,17:236\n1#2:219\n251#3:220\n252#3,2:231\n254#3:235\n103#4,10:221\n114#4,2:233\n57#5,2:253\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n186#1:236,17\n174#1:220\n174#1:231,2\n174#1:235\n174#1:221,10\n174#1:233,2\n216#1:253,2\n*E\n"})
public final class f0 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = -1;

    public static final void a(@l e0 e00, int v) {
        d d0 = e00.e();
        if(v != 4 && d0 instanceof n && f0.c(v) == f0.c(e00.c)) {
            K k0 = ((n)d0).d;
            g g0 = d0.getContext();
            if(k0.i1(g0)) {
                k0.b1(g0, e00);
                return;
            }
            f0.f(e00);
            return;
        }
        f0.e(e00, d0, v == 4);
    }

    @b0
    public static void b() {
    }

    public static final boolean c(int v) {
        return v == 1 || v == 2;
    }

    public static final boolean d(int v) {
        return v == 2;
    }

    public static final void e(@l e0 e00, @l d d0, boolean z) {
        Object object0 = e00.i();
        Throwable throwable0 = e00.f(object0);
        Object object1 = throwable0 == null ? e00.g(object0) : kotlin.f0.a(throwable0);
        if(z) {
            L.n(d0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            n n0 = (n)d0;
            g g0 = n0.e.getContext();
            Object object2 = kotlinx.coroutines.internal.b0.c(g0, n0.g);
            w1 w10 = object2 == kotlinx.coroutines.internal.b0.a ? null : J.g(n0.e, g0, object2);
            try {
                n0.e.resumeWith(object1);
            }
            catch(Throwable throwable1) {
                if(w10 == null || w10.Q1()) {
                    kotlinx.coroutines.internal.b0.a(g0, object2);
                }
                throw throwable1;
            }
            if(w10 == null || w10.Q1()) {
                kotlinx.coroutines.internal.b0.a(g0, object2);
            }
        }
        else {
            d0.resumeWith(object1);
        }
    }

    private static final void f(e0 e00) {
        o0 o00 = m1.a.b();
        if(o00.o2()) {
            o00.d2(e00);
            return;
        }
        o00.g2(true);
        try {
            f0.e(e00, e00.e(), true);
            while(o00.A2()) {
            }
        }
        catch(Throwable throwable0) {
            e00.h(throwable0, null);
        }
        finally {
            o00.u1(true);
        }
    }

    public static final void g(@l d d0, @l Throwable throwable0) {
        d0.resumeWith(kotlin.e0.b(kotlin.f0.a(throwable0)));
    }

    public static final void h(@l e0 e00, @l o0 o00, @l a a0) {
        o00.g2(true);
        try {
            a0.invoke();
            while(o00.A2()) {
            }
        }
        catch(Throwable throwable0) {
            e00.h(throwable0, null);
        }
        finally {
            o00.u1(true);
        }
    }
}

