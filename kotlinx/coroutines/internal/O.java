package kotlinx.coroutines.internal;

import A3.a;
import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.E0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.J;
import kotlinx.coroutines.m1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.w1;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 2 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n293#1,5:321\n298#1,12:327\n310#1:383\n297#1:385\n298#1,12:387\n310#1:416\n213#2,7:314\n220#2:342\n239#2,8:343\n221#2:351\n251#2:352\n252#2,2:363\n254#2:367\n223#2:368\n225#2:384\n1#3:326\n1#3:386\n1#3:417\n196#4,3:339\n199#4,14:369\n196#4,17:399\n196#4,17:418\n103#5,10:353\n114#5,2:365\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n*L\n278#1:321,5\n278#1:327,12\n278#1:383\n283#1:385\n283#1:387,12\n283#1:416\n278#1:314,7\n278#1:342\n278#1:343,8\n278#1:351\n278#1:352\n278#1:363,2\n278#1:367\n278#1:368\n278#1:384\n278#1:326\n283#1:386\n278#1:339,3\n278#1:369,14\n283#1:399,17\n309#1:418,17\n278#1:353,10\n278#1:365,2\n*E\n"})
public final class o {
    @l
    private static final V a;
    @l
    @f
    public static final V b;

    static {
        o.a = new V("UNDEFINED");
        o.b = new V("REUSABLE_CLAIMED");
    }

    private static final boolean b(n n0, Object object0, int v, boolean z, a a0) {
        o0 o00 = m1.a.b();
        if(z && o00.p2()) {
            return false;
        }
        if(o00.o2()) {
            n0.f = object0;
            n0.c = v;
            o00.d2(n0);
            return true;
        }
        o00.g2(true);
        try {
            a0.invoke();
            while(o00.A2()) {
            }
        }
        catch(Throwable throwable0) {
            n0.h(throwable0, null);
        }
        finally {
            o00.u1(true);
        }
        return false;
    }

    static boolean c(n n0, Object object0, int v, boolean z, a a0, int v1, Object object1) {
        if((v1 & 4) != 0) {
            z = false;
        }
        o0 o00 = m1.a.b();
        if(z && o00.p2()) {
            return false;
        }
        if(o00.o2()) {
            n0.f = object0;
            n0.c = v;
            o00.d2(n0);
            return true;
        }
        o00.g2(true);
        try {
            a0.invoke();
            while(o00.A2()) {
            }
        }
        catch(Throwable throwable0) {
            n0.h(throwable0, null);
        }
        finally {
            o00.u1(true);
        }
        return false;
    }

    @E0
    public static final void d(@l d d0, @l Object object0, @m Function1 function10) {
        Object object2;
        g g2;
        if(d0 instanceof n) {
            n n0 = (n)d0;
            Object object1 = G.b(object0, function10);
            g g0 = n0.getContext();
            if(n0.d.i1(g0)) {
                n0.f = object1;
                n0.c = 1;
                g g1 = n0.getContext();
                n0.d.b1(g1, n0);
                return;
            }
            o0 o00 = m1.a.b();
            if(o00.o2()) {
                n0.f = object1;
                n0.c = 1;
                o00.d2(n0);
                return;
            }
            o00.g2(true);
            try {
                I0 i00 = (I0)n0.getContext().get(I0.B8);
                if(i00 == null || i00.isActive()) {
                    g2 = n0.e.getContext();
                    object2 = b0.c(g2, n0.g);
                    w1 w10 = object2 == b0.a ? null : J.g(n0.e, g2, object2);
                    goto label_26;
                }
                else {
                    CancellationException cancellationException0 = i00.L0();
                    n0.b(object1, cancellationException0);
                    n0.resumeWith(e0.b(f0.a(cancellationException0)));
                }
                goto label_40;
            }
            catch(Throwable throwable0) {
                goto label_43;
            }
            try {
            label_26:
                n0.e.resumeWith(object0);
                goto label_35;
            }
            catch(Throwable throwable1) {
                try {
                    if(w10 == null) {
                        b0.a(g2, object2);
                    }
                    else if(w10.Q1()) {
                        b0.a(g2, object2);
                    }
                    throw throwable1;
                label_35:
                    if(w10 == null) {
                        b0.a(g2, object2);
                    }
                    else if(w10.Q1()) {
                        b0.a(g2, object2);
                    }
                    while(true) {
                    label_40:
                        if(!o00.A2()) {
                            goto label_48;
                        }
                    }
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_43:
                n0.h(throwable0, null);
            }
            catch(Throwable throwable2) {
                o00.u1(true);
                throw throwable2;
            }
        label_48:
            o00.u1(true);
            return;
        }
        d0.resumeWith(object0);
    }

    public static void e(d d0, Object object0, Function1 function10, int v, Object object1) {
        if((v & 2) != 0) {
            function10 = null;
        }
        o.d(d0, object0, function10);
    }

    public static final boolean f(@l n n0) {
        S0 s00 = S0.a;
        o0 o00 = m1.a.b();
        if(!o00.p2()) {
            if(o00.o2()) {
                n0.f = s00;
                n0.c = 1;
                o00.d2(n0);
                return true;
            }
            o00.g2(true);
            try {
                n0.run();
                while(o00.A2()) {
                }
            }
            catch(Throwable throwable0) {
                n0.h(throwable0, null);
            }
            finally {
                o00.u1(true);
            }
            return false;
        }
        return false;
    }
}

