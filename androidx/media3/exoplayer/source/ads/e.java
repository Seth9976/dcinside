package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;

public final class e implements Runnable {
    public final AdPrepareListener a;
    public final MediaPeriodId b;

    public e(AdPrepareListener adsMediaSource$AdPrepareListener0, MediaPeriodId mediaSource$MediaPeriodId0) {
        this.a = adsMediaSource$AdPrepareListener0;
        this.b = mediaSource$MediaPeriodId0;
    }

    @Override
    public final void run() {
        this.a.e(this.b);
    }
}

