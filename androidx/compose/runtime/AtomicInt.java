package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;
import y4.l;

public final class AtomicInt {
    @l
    private final AtomicInteger a;

    public AtomicInt(int v) {
        this.a = new AtomicInteger(v);
    }

    public final int a(int v) {
        return this.a.addAndGet(v);
    }

    public final int b() {
        return this.a.get();
    }

    @l
    public final AtomicInteger c() {
        return this.a;
    }

    public final void d(int v) {
        this.a.set(v);
    }
}

