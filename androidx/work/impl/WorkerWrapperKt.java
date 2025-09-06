package androidx.work.impl;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.DirectExecutor;
import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
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

@s0({"SMAP\nWorkerWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapperKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,607:1\n314#2,11:608\n*S KotlinDebug\n*F\n+ 1 WorkerWrapper.kt\nandroidx/work/impl/WorkerWrapperKt\n*L\n553#1:608,11\n*E\n"})
public final class WorkerWrapperKt {
    @l
    private static final String a;

    // 去混淆评级： 低(20)
    static {
        L.o("WM-WorkerWrapper", "tagWithPrefix(\"WorkerWrapper\")");
        WorkerWrapperKt.a = "WM-WorkerWrapper";
    }

    // 去混淆评级： 低(20)
    public static final String a() [...] // 潜在的解密器

    @RestrictTo({Scope.b})
    @m
    public static final Object d(@l t0 t00, @l ListenableWorker listenableWorker0, @l d d0) {
        try {
            if(t00.isDone()) {
                return WorkerWrapperKt.e(t00);
            }
        }
        catch(ExecutionException executionException0) {
            throw WorkerWrapperKt.f(executionException0);
        }
        p p0 = new p(b.e(d0), 1);
        p0.c0();
        t00.addListener(new ToContinuation(t00, p0), DirectExecutor.a);
        p0.K(new Function1(listenableWorker0, t00) {
            final ListenableWorker e;
            final t0 f;

            {
                this.e = listenableWorker0;
                this.f = t00;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(Throwable throwable0) {
                if(throwable0 instanceof WorkerStoppedException) {
                    int v = ((WorkerStoppedException)throwable0).a();
                    this.e.stop(v);
                }
                this.f.cancel(false);
            }
        });
        Object object0 = p0.x();
        if(object0 == b.l()) {
            h.c(d0);
        }
        return object0;
    }

    private static final Object e(Future future0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = future0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    private static final Throwable f(ExecutionException executionException0) {
        Throwable throwable0 = executionException0.getCause();
        L.m(throwable0);
        return throwable0;
    }
}

