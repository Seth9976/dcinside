package androidx.media3.exoplayer.audio;

public final class t implements Runnable {
    public final EventDispatcher a;
    public final boolean b;

    public t(EventDispatcher audioRendererEventListener$EventDispatcher0, boolean z) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = z;
    }

    @Override
    public final void run() {
        this.a.F(this.b);
    }
}

