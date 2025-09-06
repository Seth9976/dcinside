package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.S0;
import kotlin.b0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.o;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.scheduling.k;
import y4.l;
import y4.m;
import z3.f;

@b0
@s0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,218:1\n1#2:219\n103#3,10:220\n114#3,2:234\n216#4:230\n217#4:233\n57#5,2:231\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n86#1:220,10\n86#1:234,2\n99#1:230\n99#1:233\n99#1:231,2\n*E\n"})
public abstract class e0 extends k {
    @f
    public int c;

    public e0(int v) {
        this.c = v;
    }

    public void b(@m Object object0, @l Throwable throwable0) {
    }

    @l
    public abstract d e();

    @m
    public Throwable f(@m Object object0) {
        C c0 = object0 instanceof C ? ((C)object0) : null;
        return c0 == null ? null : c0.a;
    }

    public Object g(@m Object object0) {
        return object0;
    }

    public final void h(@m Throwable throwable0, @m Throwable throwable1) {
        if(throwable0 == null && throwable1 == null) {
            return;
        }
        if(throwable0 != null && throwable1 != null) {
            o.a(throwable0, throwable1);
        }
        if(throwable0 == null) {
            throwable0 = throwable1;
        }
        L.m(throwable0);
        S s0 = new S("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to \'handleFatalException\' method and report this incident to maintainers", throwable0);
        kotlinx.coroutines.L.b(this.e().getContext(), s0);
    }

    @m
    public abstract Object i();

    @Override
    public final void run() {
        S0 s02;
        S0 s01;
        S0 s00;
        Object object0;
        g g0;
        d d1;
        kotlinx.coroutines.scheduling.l l0;
        try {
            l0 = this.b;
            d d0 = this.e();
            L.n(d0, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            d1 = ((n)d0).e;
            g0 = d1.getContext();
            object0 = kotlinx.coroutines.internal.b0.c(g0, ((n)d0).g);
            w1 w10 = object0 == kotlinx.coroutines.internal.b0.a ? null : J.g(d1, g0, object0);
        }
        catch(Throwable throwable0) {
            goto label_36;
        }
        try {
            g g1 = d1.getContext();
            Object object1 = this.i();
            Throwable throwable2 = this.f(object1);
            I0 i00 = throwable2 != null || !f0.c(this.c) ? null : ((I0)g1.get(I0.B8));
            if(i00 != null && !i00.isActive()) {
                CancellationException cancellationException0 = i00.L0();
                this.b(object1, cancellationException0);
                d1.resumeWith(kotlin.e0.b(kotlin.f0.a(cancellationException0)));
            }
            else if(throwable2 != null) {
                d1.resumeWith(kotlin.e0.b(kotlin.f0.a(throwable2)));
            }
            else {
                d1.resumeWith(kotlin.e0.b(this.g(object1)));
            }
            goto label_28;
        }
        catch(Throwable throwable1) {
        }
        try {
            if(w10 == null) {
                kotlinx.coroutines.internal.b0.a(g0, object0);
            }
            else if(w10.Q1()) {
                kotlinx.coroutines.internal.b0.a(g0, object0);
            }
            throw throwable1;
        label_28:
            s00 = S0.a;
            if(w10 == null) {
                kotlinx.coroutines.internal.b0.a(g0, object0);
            }
            else if(w10.Q1()) {
                kotlinx.coroutines.internal.b0.a(g0, object0);
            }
        }
        catch(Throwable throwable0) {
            try {
            label_36:
                l0.t();
                s01 = S0.a;
            }
            catch(Throwable throwable3) {
                s01 = kotlin.e0.b(kotlin.f0.a(throwable3));
            }
            this.h(throwable0, kotlin.e0.e(s01));
            return;
        }
        try {
            l0.t();
            s02 = s00;
        }
        catch(Throwable throwable4) {
            s02 = kotlin.e0.b(kotlin.f0.a(throwable4));
        }
        this.h(null, kotlin.e0.e(s02));
    }
}

