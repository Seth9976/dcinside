package androidx.media3.exoplayer.source.preload;

public final class f implements Runnable {
    public final PreloadMediaSource a;

    public f(PreloadMediaSource preloadMediaSource0) {
        this.a = preloadMediaSource0;
    }

    @Override
    public final void run() {
        this.a.g1();
    }
}

