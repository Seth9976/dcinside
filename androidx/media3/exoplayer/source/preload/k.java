package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;

public final class k implements Runnable {
    public final PreloadMediaPeriodCallback a;
    public final MediaPeriod b;

    public k(PreloadMediaPeriodCallback preloadMediaSource$PreloadMediaPeriodCallback0, MediaPeriod mediaPeriod0) {
        this.a = preloadMediaSource$PreloadMediaPeriodCallback0;
        this.b = mediaPeriod0;
    }

    @Override
    public final void run() {
        this.a.c(this.b);
    }
}

