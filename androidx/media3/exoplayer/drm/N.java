package androidx.media3.exoplayer.drm;

public final class n implements Runnable {
    public final EventDispatcher a;
    public final DrmSessionEventListener b;
    public final int c;

    public n(EventDispatcher drmSessionEventListener$EventDispatcher0, DrmSessionEventListener drmSessionEventListener0, int v) {
        this.a = drmSessionEventListener$EventDispatcher0;
        this.b = drmSessionEventListener0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.q(this.b, this.c);
    }
}

