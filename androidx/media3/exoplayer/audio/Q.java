package androidx.media3.exoplayer.audio;

public final class q implements Runnable {
    public final EventDispatcher a;
    public final Exception b;

    public q(EventDispatcher audioRendererEventListener$EventDispatcher0, Exception exception0) {
        this.a = audioRendererEventListener$EventDispatcher0;
        this.b = exception0;
    }

    @Override
    public final void run() {
        this.a.v(this.b);
    }
}

