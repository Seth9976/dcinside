package androidx.media3.exoplayer.drm;

public final class k implements Runnable {
    public final EventDispatcher a;
    public final DrmSessionEventListener b;
    public final Exception c;

    public k(EventDispatcher drmSessionEventListener$EventDispatcher0, DrmSessionEventListener drmSessionEventListener0, Exception exception0) {
        this.a = drmSessionEventListener$EventDispatcher0;
        this.b = drmSessionEventListener0;
        this.c = exception0;
    }

    @Override
    public final void run() {
        this.a.r(this.b, this.c);
    }
}

