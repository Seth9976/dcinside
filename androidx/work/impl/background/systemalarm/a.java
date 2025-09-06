package androidx.work.impl.background.systemalarm;

public final class a implements Runnable {
    public final DelayMetCommandHandler a;

    public a(DelayMetCommandHandler delayMetCommandHandler0) {
        this.a = delayMetCommandHandler0;
    }

    @Override
    public final void run() {
        this.a.i();
    }
}

