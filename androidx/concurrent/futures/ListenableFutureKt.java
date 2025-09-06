package androidx.concurrent.futures;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nandroidx/concurrent/futures/ListenableFutureKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,107:1\n314#2,11:108\n*S KotlinDebug\n*F\n+ 1 ListenableFuture.kt\nandroidx/concurrent/futures/ListenableFutureKt\n*L\n54#1:108,11\n*E\n"})
public final class ListenableFutureKt {
    @m
    public static final Object a(@l t0 t00, @l d d0) {
        try {
            if(t00.isDone()) {
                return AbstractResolvableFuture.j(t00);
            }
        }
        catch(ExecutionException executionException0) {
            throw ListenableFutureKt.b(executionException0);
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        t00.addListener(new ToContinuation(t00, p0), DirectExecutor.a);
        p0.K(new Function1(t00) {
            final t0 e;

            {
                this.e = t00;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                this.e.cancel(false);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    @l
    public static final Throwable b(@l ExecutionException executionException0) {
        Throwable throwable0 = executionException0.getCause();
        L.m(throwable0);
        return throwable0;
    }
}

