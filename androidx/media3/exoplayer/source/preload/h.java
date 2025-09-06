package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.Timeline;

public final class h implements Runnable {
    public final PreloadMediaSource a;
    public final Timeline b;

    public h(PreloadMediaSource preloadMediaSource0, Timeline timeline0) {
        this.a = preloadMediaSource0;
        this.b = timeline0;
    }

    @Override
    public final void run() {
        this.a.h1(this.b);
    }
}

