package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import y4.l;
import z3.i;

public class z extends q0 {
    @l
    private q0 a;

    public z(@l q0 q00) {
        L.p(q00, "delegate");
        super();
        this.a = q00;
    }

    @l
    @i(name = "delegate")
    public final q0 a() {
        return this.a;
    }

    @l
    public final z b(@l q0 q00) {
        L.p(q00, "delegate");
        this.a = q00;
        return this;
    }

    public final void c(q0 q00) {
        L.p(q00, "<set-?>");
        this.a = q00;
    }

    @Override  // okio.q0
    @l
    public q0 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override  // okio.q0
    @l
    public q0 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override  // okio.q0
    public long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override  // okio.q0
    @l
    public q0 deadlineNanoTime(long v) {
        return this.a.deadlineNanoTime(v);
    }

    @Override  // okio.q0
    public boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override  // okio.q0
    public void throwIfReached() throws IOException {
        this.a.throwIfReached();
    }

    @Override  // okio.q0
    @l
    public q0 timeout(long v, @l TimeUnit timeUnit0) {
        L.p(timeUnit0, "unit");
        return this.a.timeout(v, timeUnit0);
    }

    @Override  // okio.q0
    public long timeoutNanos() {
        return this.a.timeoutNanos();
    }
}

