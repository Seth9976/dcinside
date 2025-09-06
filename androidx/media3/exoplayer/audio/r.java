package androidx.media3.exoplayer.audio;

public final class r implements Runnable {
    public final EventDispatcher a;
    public final Exception b;

    public r(EventDispatcher audioRendererEventListener$EventDispatcher0, Exception exception0) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = exception0;
    }

    @Override
    public final void run() {
        this.a.w(this.b);
    }
}

