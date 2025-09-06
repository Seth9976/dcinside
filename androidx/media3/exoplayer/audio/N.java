package androidx.media3.exoplayer.audio;

public final class n implements Runnable {
    public final EventDispatcher a;
    public final int b;
    public final long c;
    public final long d;

    public n(EventDispatcher audioRendererEventListener$EventDispatcher0, int v, long v1, long v2) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final void run() {
        this.a.G(this.b, this.c, this.d);
    }
}

