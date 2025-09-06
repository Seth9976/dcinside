package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.f;

@s0({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class q0 {
    public static final class a extends q0 {
        @Override  // okio.q0
        @l
        public q0 deadlineNanoTime(long v) {
            return this;
        }

        @Override  // okio.q0
        public void throwIfReached() {
        }

        @Override  // okio.q0
        @l
        public q0 timeout(long v, @l TimeUnit timeUnit0) {
            L.p(timeUnit0, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        public final long a(long v, long v1) {
            return v != 0L && (v1 == 0L || v < v1) ? v : v1;
        }
    }

    @l
    public static final b Companion;
    @l
    @f
    public static final q0 NONE;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    static {
        q0.Companion = new b(null);
        q0.NONE = new a();
    }

    public final void awaitSignal(@l Condition condition0) throws InterruptedIOException {
        L.p(condition0, "condition");
        try {
            boolean z = this.hasDeadline();
            long v = this.timeoutNanos();
            long v1 = 0L;
            if(!z && v == 0L) {
                condition0.await();
                return;
            }
            long v2 = System.nanoTime();
            if(z && v != 0L) {
                v = Math.min(v, this.deadlineNanoTime() - v2);
            }
            else if(z) {
                v = this.deadlineNanoTime() - v2;
            }
            if(v > 0L) {
                condition0.await(v, TimeUnit.NANOSECONDS);
                v1 = System.nanoTime() - v2;
            }
            if(v1 >= v) {
                throw new InterruptedIOException("timeout");
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    @l
    public q0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    @l
    public q0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    @l
    public final q0 deadline(long v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        if(v <= 0L) {
            throw new IllegalArgumentException(("duration <= 0: " + v).toString());
        }
        return this.deadlineNanoTime(System.nanoTime() + timeUnit0.toNanos(v));
    }

    public long deadlineNanoTime() {
        if(!this.hasDeadline) {
            throw new IllegalStateException("No deadline");
        }
        return this.deadlineNanoTime;
    }

    @l
    public q0 deadlineNanoTime(long v) {
        this.hasDeadline = true;
        this.deadlineNanoTime = v;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final Object intersectWith(@l q0 q00, @l A3.a a0) {
        Object object1;
        Object object0;
        L.p(q00, "other");
        L.p(a0, "block");
        long v = this.timeoutNanos();
        long v1 = q00.timeoutNanos();
        long v2 = this.timeoutNanos();
        TimeUnit timeUnit0 = TimeUnit.NANOSECONDS;
        this.timeout(q0.Companion.a(v1, v2), timeUnit0);
        if(this.hasDeadline()) {
            long v3 = this.deadlineNanoTime();
            if(q00.hasDeadline()) {
                this.deadlineNanoTime(Math.min(this.deadlineNanoTime(), q00.deadlineNanoTime()));
            }
            try {
                object0 = a0.invoke();
            }
            catch(Throwable throwable0) {
                this.timeout(v, TimeUnit.NANOSECONDS);
                if(q00.hasDeadline()) {
                    this.deadlineNanoTime(v3);
                }
                throw throwable0;
            }
            this.timeout(v, timeUnit0);
            if(q00.hasDeadline()) {
                this.deadlineNanoTime(v3);
            }
            return object0;
        }
        if(q00.hasDeadline()) {
            this.deadlineNanoTime(q00.deadlineNanoTime());
        }
        try {
            object1 = a0.invoke();
        }
        catch(Throwable throwable1) {
            this.timeout(v, TimeUnit.NANOSECONDS);
            if(q00.hasDeadline()) {
                this.clearDeadline();
            }
            throw throwable1;
        }
        this.timeout(v, timeUnit0);
        if(q00.hasDeadline()) {
            this.clearDeadline();
        }
        return object1;
    }

    public void throwIfReached() throws IOException {
        if(Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if(this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0L) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @l
    public q0 timeout(long v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        if(v < 0L) {
            throw new IllegalArgumentException(("timeout < 0: " + v).toString());
        }
        this.timeoutNanos = timeUnit0.toNanos(v);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(@l Object object0) throws InterruptedIOException {
        L.p(object0, "monitor");
        try {
            boolean z = this.hasDeadline();
            long v = this.timeoutNanos();
            long v1 = 0L;
            if(!z && v == 0L) {
                object0.wait();
                return;
            }
            long v2 = System.nanoTime();
            if(z && v != 0L) {
                v = Math.min(v, this.deadlineNanoTime() - v2);
            }
            else if(z) {
                v = this.deadlineNanoTime() - v2;
            }
            if(v > 0L) {
                object0.wait(v / 1000000L, ((int)(v - 1000000L * (v / 1000000L))));
                v1 = System.nanoTime() - v2;
            }
            if(v1 >= v) {
                throw new InterruptedIOException("timeout");
            }
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}

