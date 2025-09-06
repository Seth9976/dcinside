package androidx.media3.exoplayer.source.preload;

import androidx.media3.exoplayer.source.MediaPeriod;

public final class j implements Runnable {
    public final PreloadMediaPeriodCallback a;
    public final MediaPeriod b;

    public j(PreloadMediaPeriodCallback preloadMediaSource$PreloadMediaPeriodCallback0, MediaPeriod mediaPeriod0) {
        this.a = preloadMediaSource$PreloadMediaPeriodCallback0;
        this.b = mediaPeriod0;
    }

    @Override
    public final void run() {
        this.a.d(this.b);
    }
}

