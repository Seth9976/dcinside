package androidx.media3.exoplayer.video;

public final class q implements Runnable {
    public final EventDispatcher a;
    public final Object b;
    public final long c;

    public q(EventDispatcher videoRendererEventListener$EventDispatcher0, Object object0, long v) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = object0;
        this.c = v;
    }

    @Override
    public final void run() {
        this.a.w(this.b, this.c);
    }
}

