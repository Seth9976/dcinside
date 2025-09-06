package androidx.work.impl;

import java.util.concurrent.Callable;

public final class q implements Callable {
    public final Resolution a;
    public final WorkerWrapper b;

    public q(Resolution workerWrapper$Resolution0, WorkerWrapper workerWrapper0) {
        this.a = workerWrapper$Resolution0;
        this.b = workerWrapper0;
    }

    @Override
    public final Object call() {
        return androidx.work.impl.WorkerWrapper.launch.1.f(this.a, this.b);
    }
}

