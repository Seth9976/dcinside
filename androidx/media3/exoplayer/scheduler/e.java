package androidx.media3.exoplayer.scheduler;

public final class e implements Runnable {
    public final NetworkCallback a;

    public e(NetworkCallback requirementsWatcher$NetworkCallback0) {
        this.a = requirementsWatcher$NetworkCallback0;
    }

    @Override
    public final void run() {
        this.a.c();
    }
}

