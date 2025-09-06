package com.google.common.util.concurrent;

import J1.b;
import com.google.common.base.H;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

@b
@N
class o0 implements t0 {
    static final class a extends j {
        @o3.a
        static final a i;

        static {
            a.i = f.d ? null : new a();
        }

        a() {
            this.cancel(false);
        }
    }

    static final class com.google.common.util.concurrent.o0.b extends j {
        com.google.common.util.concurrent.o0.b(Throwable throwable0) {
            this.C(throwable0);
        }
    }

    @F0
    private final Object a;
    static final t0 b;
    private static final s0 c;

    static {
        o0.b = new o0(null);
        o0.c = new s0(o0.class);
    }

    o0(@F0 Object object0) {
        this.a = object0;
    }

    @Override  // com.google.common.util.concurrent.t0
    public void addListener(Runnable runnable0, Executor executor0) {
        H.F(runnable0, "Runnable was null.");
        H.F(executor0, "Executor was null.");
        try {
            executor0.execute(runnable0);
        }
        catch(Exception exception0) {
            o0.c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, exception0);
        }
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override
    @F0
    public Object get() {
        return this.a;
    }

    @Override
    @F0
    public Object get(long v, TimeUnit timeUnit0) throws ExecutionException {
        H.E(timeUnit0);
        return this.get();
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.a + "]]";
    }
}

