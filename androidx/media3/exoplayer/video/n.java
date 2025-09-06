package androidx.media3.exoplayer.video;

public final class n implements Runnable {
    public final EventDispatcher a;
    public final String b;
    public final long c;
    public final long d;

    public n(EventDispatcher videoRendererEventListener$EventDispatcher0, String s, long v, long v1) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = s;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final void run() {
        this.a.q(this.b, this.c, this.d);
    }
}

