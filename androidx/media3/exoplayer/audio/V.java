package androidx.media3.exoplayer.audio;

public final class v implements Runnable {
    public final EventDispatcher a;
    public final String b;

    public v(EventDispatcher audioRendererEventListener$EventDispatcher0, String s) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.A(this.b);
    }
}

