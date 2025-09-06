package androidx.work;

import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements Runnable {
    public final AtomicBoolean a;

    public c(AtomicBoolean atomicBoolean0) {
        this.a = atomicBoolean0;
    }

    @Override
    public final void run() {
        ListenableFutureKt.h(this.a);
    }
}

