package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.u0;
import y4.m;

final class g extends u0 implements Executor, l {
    @y4.l
    private final e c;
    private final int d;
    @m
    private final String e;
    private final int f;
    @y4.l
    private final ConcurrentLinkedQueue g;
    private static final AtomicIntegerFieldUpdater h;
    private volatile int inFlightTasks$volatile;

    static {
        g.h = AtomicIntegerFieldUpdater.newUpdater(g.class, "inFlightTasks$volatile");
    }

    public g(@y4.l e e0, int v, @m String s, int v1) {
        this.c = e0;
        this.d = v;
        this.e = s;
        this.f = v1;
        this.g = new ConcurrentLinkedQueue();
    }

    private final void J1(Runnable runnable0, boolean z) {
        do {
            if(g.h.incrementAndGet(this) <= this.d) {
                this.c.e2(runnable0, this, z);
                return;
            }
            this.g.add(runnable0);
            if(g.h.decrementAndGet(this) >= this.d) {
                return;
            }
            runnable0 = (Runnable)this.g.poll();
        }
        while(runnable0 != null);
    }

    private final int Q1() {
        return this.inFlightTasks$volatile;
    }

    @Override  // kotlinx.coroutines.K
    public void b1(@y4.l kotlin.coroutines.g g0, @y4.l Runnable runnable0) {
        this.J1(runnable0, false);
    }

    @Override  // kotlinx.coroutines.u0
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override  // kotlinx.coroutines.scheduling.l
    public int d0() {
        return this.f;
    }

    private final void e2(int v) {
        this.inFlightTasks$volatile = v;
    }

    @Override
    public void execute(@y4.l Runnable runnable0) {
        this.J1(runnable0, false);
    }

    @Override  // kotlinx.coroutines.K
    public void h1(@y4.l kotlin.coroutines.g g0, @y4.l Runnable runnable0) {
        this.J1(runnable0, true);
    }

    @Override  // kotlinx.coroutines.scheduling.l
    public void t() {
        Runnable runnable0 = (Runnable)this.g.poll();
        if(runnable0 != null) {
            this.c.e2(runnable0, this, true);
            return;
        }
        g.h.decrementAndGet(this);
        Runnable runnable1 = (Runnable)this.g.poll();
        if(runnable1 == null) {
            return;
        }
        this.J1(runnable1, true);
    }

    // 去混淆评级： 中等(50)
    @Override  // kotlinx.coroutines.K
    @y4.l
    public String toString() {
        return this.e == null ? "K@48feeee9[dispatcher = " + this.c + ']' : this.e;
    }

    @Override  // kotlinx.coroutines.u0
    @y4.l
    public Executor u1() {
        return this;
    }
}

