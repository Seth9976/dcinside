package androidx.media3.exoplayer.video;

public final class r implements Runnable {
    public final EventDispatcher a;
    public final long b;
    public final int c;

    public r(EventDispatcher videoRendererEventListener$EventDispatcher0, long v, int v1) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        this.a.x(this.b, this.c);
    }
}

