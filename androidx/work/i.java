package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

public final class i implements Runnable {
    public final AtomicBoolean a;

    public i(AtomicBoolean atomicBoolean0) {
        this.a = atomicBoolean0;
    }

    @Override
    public final void run() {
        WorkerKt.g(this.a);
    }
}

