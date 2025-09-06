package androidx.work.impl.background.systemalarm;

public final class b implements Runnable {
    public final DelayMetCommandHandler a;

    public b(DelayMetCommandHandler delayMetCommandHandler0) {
        this.a = delayMetCommandHandler0;
    }

    @Override
    public final void run() {
        this.a.h();
    }
}

