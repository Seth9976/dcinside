package androidx.concurrent.futures;

import A3.o;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.e0;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.I0.a;
import kotlinx.coroutines.K;
import kotlinx.coroutines.Q;
import kotlinx.coroutines.X;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;

public final class SuspendToFutureAdapter {
    static final class DeferredFuture implements t0, d {
        @l
        private final X a;
        @l
        private final ResolvableFuture b;

        public DeferredFuture(@l X x0) {
            this.a = x0;
            this.b = ResolvableFuture.w();
        }

        @Override  // com.google.common.util.concurrent.t0
        public void addListener(@l Runnable runnable0, @l Executor executor0) {
            this.b.addListener(runnable0, executor0);
        }

        @Override
        public boolean cancel(boolean z) {
            boolean z1 = this.b.cancel(z);
            if(z1) {
                a.b(this.a, null, 1, null);
            }
            return z1;
        }

        @Override
        public Object get() {
            return this.b.get();
        }

        @Override
        public Object get(long v, @l TimeUnit timeUnit0) {
            return this.b.get(v, timeUnit0);
        }

        @Override  // kotlin.coroutines.d
        @l
        public g getContext() {
            return SuspendToFutureAdapter.c;
        }

        @Override
        public boolean isCancelled() {
            return this.b.isCancelled();
        }

        @Override
        public boolean isDone() {
            return this.b.isDone();
        }

        @Override  // kotlin.coroutines.d
        public void resumeWith(@l Object object0) {
            Throwable throwable0 = e0.e(object0);
            if(throwable0 == null) {
                this.b.r(object0);
                return;
            }
            if(throwable0 instanceof CancellationException) {
                this.b.cancel(false);
                return;
            }
            this.b.s(throwable0);
        }
    }

    @l
    public static final SuspendToFutureAdapter a;
    @l
    private static final SuspendToFutureAdapter.GlobalListenableFutureScope.1 b;
    @l
    private static final K c;

    static {
        SuspendToFutureAdapter.a = new SuspendToFutureAdapter();
        SuspendToFutureAdapter.b = new SuspendToFutureAdapter.GlobalListenableFutureScope.1();
        SuspendToFutureAdapter.c = h0.g();
    }

    @l
    public final t0 b(@l g g0, boolean z, @l o o0) {
        X x0 = i.a(SuspendToFutureAdapter.b, g0, (z ? Q.d : Q.a), o0);
        t0 t00 = new DeferredFuture(x0);
        f.c(new H() {
            {
                super(1, object0, X.class, "await", "await(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @m
            public final Object a(@l d d0) {
                return ((X)this.receiver).o(d0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((d)object0));
            }
        }, ((d)t00)).resumeWith(S0.a);
        return t00;
    }

    public static t0 c(SuspendToFutureAdapter suspendToFutureAdapter0, g g0, boolean z, o o0, int v, Object object0) {
        if((v & 1) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if((v & 2) != 0) {
            z = true;
        }
        return suspendToFutureAdapter0.b(g0, z, o0);
    }
}

