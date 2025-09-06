package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
final class c1 extends a {
    static class com.google.common.util.concurrent.c1.a {
    }

    static final class b implements Runnable {
        @o3.a
        c1 a;

        b(c1 c10) {
            this.a = c10;
        }

        @Override
        public void run() {
            c1 c10 = this.a;
            if(c10 == null) {
                return;
            }
            t0 t00 = c10.i;
            if(t00 == null) {
                return;
            }
            this.a = null;
            if(t00.isDone()) {
                c10.D(t00);
                return;
            }
            try {
                ScheduledFuture scheduledFuture0 = c10.j;
                c10.j = null;
                String s = "Timed out";
                if(scheduledFuture0 != null) {
                    try {
                        long v1 = Math.abs(scheduledFuture0.getDelay(TimeUnit.MILLISECONDS));
                        if(v1 > 10L) {
                            s = "Timed out (timeout delayed by " + v1 + " ms after scheduled time)";
                        }
                        goto label_23;
                    }
                    catch(Throwable throwable0) {
                    }
                    c10.C(new com.google.common.util.concurrent.c1.c("Timed out", null));
                    throw throwable0;
                }
            label_23:
                c10.C(new com.google.common.util.concurrent.c1.c(s + ": " + t00, null));
            }
            finally {
                t00.cancel(true);
            }
        }
    }

    static final class com.google.common.util.concurrent.c1.c extends TimeoutException {
        private com.google.common.util.concurrent.c1.c(String s) {
            super(s);
        }

        com.google.common.util.concurrent.c1.c(String s, com.google.common.util.concurrent.c1.a c1$a0) {
            this(s);
        }

        @Override
        public Throwable fillInStackTrace() {
            synchronized(this) {
                this.setStackTrace(new StackTraceElement[0]);
                return this;
            }
        }
    }

    @o3.a
    private t0 i;
    @o3.a
    private ScheduledFuture j;

    private c1(t0 t00) {
        this.i = (t0)H.E(t00);
    }

    static t0 Q(t0 t00, long v, TimeUnit timeUnit0, ScheduledExecutorService scheduledExecutorService0) {
        t0 t01 = new c1(t00);
        b c1$b0 = new b(((c1)t01));
        t01.j = scheduledExecutorService0.schedule(c1$b0, v, timeUnit0);
        t00.addListener(c1$b0, C0.c());
        return t01;
    }

    @Override  // com.google.common.util.concurrent.f
    protected void m() {
        this.x(this.i);
        ScheduledFuture scheduledFuture0 = this.j;
        if(scheduledFuture0 != null) {
            scheduledFuture0.cancel(false);
        }
        this.i = null;
        this.j = null;
    }

    @Override  // com.google.common.util.concurrent.f
    @o3.a
    protected String y() {
        t0 t00 = this.i;
        ScheduledFuture scheduledFuture0 = this.j;
        if(t00 != null) {
            String s = "inputFuture=[" + t00 + "]";
            if(scheduledFuture0 != null) {
                long v = scheduledFuture0.getDelay(TimeUnit.MILLISECONDS);
                return v <= 0L ? s : s + ", remaining delay=[" + v + " ms]";
            }
            return s;
        }
        return null;
    }
}

