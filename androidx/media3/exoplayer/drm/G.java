package androidx.media3.exoplayer.drm;

public final class g implements Runnable {
    public final PreacquiredSessionReference a;

    public g(PreacquiredSessionReference defaultDrmSessionManager$PreacquiredSessionReference0) {
        this.a = defaultDrmSessionManager$PreacquiredSessionReference0;
    }

    @Override
    public final void run() {
        this.a.e();
    }
}

