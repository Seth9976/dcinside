package androidx.media3.exoplayer.audio;

public final class u implements Runnable {
    public final EventDispatcher a;
    public final String b;
    public final long c;
    public final long d;

    public u(EventDispatcher audioRendererEventListener$EventDispatcher0, String s, long v, long v1) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = s;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final void run() {
        this.a.z(this.b, this.c, this.d);
    }
}

