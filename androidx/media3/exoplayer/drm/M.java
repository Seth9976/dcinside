package androidx.media3.exoplayer.drm;

public final class m implements Runnable {
    public final EventDispatcher a;
    public final DrmSessionEventListener b;

    public m(EventDispatcher drmSessionEventListener$EventDispatcher0, DrmSessionEventListener drmSessionEventListener0) {
        this.a = drmSessionEventListener$EventDispatcher0;
        this.b = drmSessionEventListener0;
    }

    @Override
    public final void run() {
        this.a.p(this.b);
    }
}

