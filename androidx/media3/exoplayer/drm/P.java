package androidx.media3.exoplayer.drm;

public final class p implements Runnable {
    public final EventDispatcher a;
    public final DrmSessionEventListener b;

    public p(EventDispatcher drmSessionEventListener$EventDispatcher0, DrmSessionEventListener drmSessionEventListener0) {
        this.a = drmSessionEventListener$EventDispatcher0;
        this.b = drmSessionEventListener0;
    }

    @Override
    public final void run() {
        this.a.s(this.b);
    }
}

