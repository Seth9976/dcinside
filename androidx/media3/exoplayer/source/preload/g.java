package androidx.media3.exoplayer.source.preload;

public final class g implements Runnable {
    public final PreloadMediaSource a;
    public final long b;

    public g(PreloadMediaSource preloadMediaSource0, long v) {
        this.a = preloadMediaSource0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.i1(this.b);
    }
}

