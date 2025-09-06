package androidx.media3.exoplayer.source.preload;

public final class e implements Runnable {
    public final PreloadMediaSource a;

    public e(PreloadMediaSource preloadMediaSource0) {
        this.a = preloadMediaSource0;
    }

    @Override
    public final void run() {
        this.a.j1();
    }
}

