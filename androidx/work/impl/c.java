package androidx.work.impl;

import com.google.common.util.concurrent.t0;

public final class c implements Runnable {
    public final Processor a;
    public final t0 b;
    public final WorkerWrapper c;

    public c(Processor processor0, t0 t00, WorkerWrapper workerWrapper0) {
        this.a = processor0;
        this.b = t00;
        this.c = workerWrapper0;
    }

    @Override
    public final void run() {
        this.a.o(this.b, this.c);
    }
}

