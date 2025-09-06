package androidx.media3.exoplayer.video;

public final class s implements Runnable {
    public final EventDispatcher a;
    public final Exception b;

    public s(EventDispatcher videoRendererEventListener$EventDispatcher0, Exception exception0) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = exception0;
    }

    @Override
    public final void run() {
        this.a.y(this.b);
    }
}

