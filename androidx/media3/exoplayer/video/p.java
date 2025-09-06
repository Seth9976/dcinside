package androidx.media3.exoplayer.video;

public final class p implements Runnable {
    public final EventDispatcher a;
    public final int b;
    public final long c;

    public p(EventDispatcher videoRendererEventListener$EventDispatcher0, int v, long v1) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final void run() {
        this.a.t(this.b, this.c);
    }
}

