package androidx.work.impl;

import java.util.concurrent.Callable;

public final class o implements Callable {
    public final WorkerWrapper a;

    public o(WorkerWrapper workerWrapper0) {
        this.a = workerWrapper0;
    }

    @Override
    public final Object call() {
        return WorkerWrapper.w(this.a);
    }
}

