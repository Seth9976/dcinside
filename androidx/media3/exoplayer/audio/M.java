package androidx.media3.exoplayer.audio;

public final class m implements Runnable {
    public final EventDispatcher a;
    public final long b;

    public m(EventDispatcher audioRendererEventListener$EventDispatcher0, long v) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.E(this.b);
    }
}

