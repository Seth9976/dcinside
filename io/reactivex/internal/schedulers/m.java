package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

public final class m extends a implements Callable {
    private static final long f = 0x1924F211B909B42FL;

    public m(Runnable runnable0) {
        super(runnable0);
    }

    @Override  // io.reactivex.internal.schedulers.a
    public Runnable b() {
        return super.b();
    }

    @Override
    public Object call() throws Exception {
        return this.d();
    }

    public Void d() throws Exception {
        try {
            this.b = Thread.currentThread();
            this.a.run();
            return null;
        }
        finally {
            this.lazySet(a.d);
            this.b = null;
        }
    }
}

