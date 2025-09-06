package androidx.work.impl;

import java.util.concurrent.Callable;

public final class p implements Callable {
    public final WorkerWrapper a;

    public p(WorkerWrapper workerWrapper0) {
        this.a = workerWrapper0;
    }

    @Override
    public final Object call() {
        return WorkerWrapper.A(this.a);
    }
}

