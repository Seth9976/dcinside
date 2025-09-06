package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.k;
import kotlinx.coroutines.internal.e;
import y4.l;
import y4.m;

public final class v0 extends u0 implements Z {
    @l
    private final Executor c;

    public v0(@l Executor executor0) {
        this.c = executor0;
        e.d(this.u1());
    }

    private final void J1(g g0, RejectedExecutionException rejectedExecutionException0) {
        M0.f(g0, t0.a("The task was rejected", rejectedExecutionException0));
    }

    private final ScheduledFuture Q1(ScheduledExecutorService scheduledExecutorService0, Runnable runnable0, g g0, long v) {
        try {
            return scheduledExecutorService0.schedule(runnable0, v, TimeUnit.MILLISECONDS);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            this.J1(g0, rejectedExecutionException0);
            return null;
        }
    }

    @Override  // kotlinx.coroutines.Z
    @l
    public k0 Y(long v, @l Runnable runnable0, @l g g0) {
        Executor executor0 = this.u1();
        ScheduledFuture scheduledFuture0 = null;
        ScheduledExecutorService scheduledExecutorService0 = executor0 instanceof ScheduledExecutorService ? ((ScheduledExecutorService)executor0) : null;
        if(scheduledExecutorService0 != null) {
            scheduledFuture0 = this.Q1(scheduledExecutorService0, runnable0, g0, v);
        }
        return scheduledFuture0 != null ? new j0(scheduledFuture0) : V.h.Y(v, runnable0, g0);
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@l g g0, @l Runnable runnable0) {
        Runnable runnable1;
        try {
            Executor executor0 = this.u1();
            b b0 = c.a;
            if(b0 == null) {
                runnable1 = runnable0;
            }
            else {
                runnable1 = b0.i(runnable0);
                if(runnable1 == null) {
                    runnable1 = runnable0;
                }
            }
            executor0.execute(runnable1);
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
            b b1 = c.a;
            if(b1 != null) {
                b1.f();
            }
            this.J1(g0, rejectedExecutionException0);
            h0.c().b1(g0, runnable0);
        }
    }

    @Override  // kotlinx.coroutines.u0
    public void close() {
        Executor executor0 = this.u1();
        ExecutorService executorService0 = executor0 instanceof ExecutorService ? ((ExecutorService)executor0) : null;
        if(executorService0 != null) {
            executorService0.shutdown();
        }
    }

    @Override
    public boolean equals(@m Object object0) {
        return object0 instanceof v0 && ((v0)object0).u1() == this.u1();
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.u1());
    }

    @Override  // kotlinx.coroutines.Z
    @k(level = kotlin.m.b, message = "Deprecated without replacement as an internal method never intended for public use")
    @m
    public Object l0(long v, @l d d0) {
        return a.a(this, v, d0);
    }

    @Override  // kotlinx.coroutines.K
    @l
    public String toString() {
        return this.u1().toString();
    }

    @Override  // kotlinx.coroutines.u0
    @l
    public Executor u1() {
        return this.c;
    }

    @Override  // kotlinx.coroutines.Z
    public void v(long v, @l o o0) {
        Executor executor0 = this.u1();
        ScheduledFuture scheduledFuture0 = null;
        ScheduledExecutorService scheduledExecutorService0 = executor0 instanceof ScheduledExecutorService ? ((ScheduledExecutorService)executor0) : null;
        if(scheduledExecutorService0 != null) {
            scheduledFuture0 = this.Q1(scheduledExecutorService0, new d1(this, o0), o0.getContext(), v);
        }
        if(scheduledFuture0 != null) {
            M0.w(o0, scheduledFuture0);
            return;
        }
        V.h.v(v, o0);
    }
}

