package io.reactivex.internal.schedulers;

public final class l extends a implements Runnable {
    private static final long f = 0x1924F211B909B42FL;

    public l(Runnable runnable0) {
        super(runnable0);
    }

    @Override  // io.reactivex.internal.schedulers.a
    public Runnable b() {
        return super.b();
    }

    @Override
    public void run() {
        try {
            this.b = Thread.currentThread();
            this.a.run();
            this.b = null;
        }
        catch(Throwable throwable0) {
            this.b = null;
            this.lazySet(a.d);
            io.reactivex.plugins.a.Y(throwable0);
        }
    }
}

