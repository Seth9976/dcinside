package androidx.media3.exoplayer.video;

public final class w implements Runnable {
    public final EventDispatcher a;
    public final String b;

    public w(EventDispatcher videoRendererEventListener$EventDispatcher0, String s) {
        this.a = videoRendererEventListener$EventDispatcher0;
        this.b = s;
    }

    @Override
    public final void run() {
        this.a.r(this.b);
    }
}

