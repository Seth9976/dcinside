package com.google.common.util.concurrent;

import J1.b;
import J1.c;
import J1.d;
import O1.f;
import com.google.common.base.H;
import com.google.common.base.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@b(emulated = true)
@f("Use FluentFuture.from(Futures.immediate*Future) or SettableFuture")
@N
public abstract class U extends m0 {
    static abstract class a extends U implements i {
        @Override  // com.google.common.util.concurrent.t0, com.google.common.util.concurrent.f
        public final void addListener(Runnable runnable0, Executor executor0) {
            super.addListener(runnable0, executor0);
        }

        @Override  // com.google.common.util.concurrent.f
        @O1.a
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override  // com.google.common.util.concurrent.f
        @O1.a
        @F0
        public final Object get() throws InterruptedException, ExecutionException {
            return super.get();
        }

        @Override  // com.google.common.util.concurrent.f
        @O1.a
        @F0
        public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
            return super.get(v, timeUnit0);
        }

        @Override  // com.google.common.util.concurrent.f
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override  // com.google.common.util.concurrent.f
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public final void F(e0 e00, Executor executor0) {
        h0.c(this, e00, executor0);
    }

    @d
    @com.google.common.util.concurrent.G0.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final U G(Class class0, t t0, Executor executor0) {
        return (U)h0.f(this, class0, t0, executor0);
    }

    @d
    @com.google.common.util.concurrent.G0.a("AVAILABLE but requires exceptionType to be Throwable.class")
    public final U H(Class class0, w w0, Executor executor0) {
        return (U)h0.g(this, class0, w0, executor0);
    }

    @Deprecated
    public static U I(U u0) {
        return (U)H.E(u0);
    }

    public static U J(t0 t00) {
        return t00 instanceof U ? ((U)t00) : new Z(t00);
    }

    public final U K(t t0, Executor executor0) {
        return (U)h0.B(this, t0, executor0);
    }

    public final U L(w w0, Executor executor0) {
        return (U)h0.C(this, w0, executor0);
    }

    @c
    @d
    public final U M(long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        return (U)h0.H(this, v, timeUnit0, scheduledExecutorService0);
    }
}

