package androidx.media3.exoplayer.source.ads;

import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import java.io.IOException;

public final class d implements Runnable {
    public final AdPrepareListener a;
    public final MediaPeriodId b;
    public final IOException c;

    public d(AdPrepareListener adsMediaSource$AdPrepareListener0, MediaPeriodId mediaSource$MediaPeriodId0, IOException iOException0) {
        this.a = adsMediaSource$AdPrepareListener0;
        this.b = mediaSource$MediaPeriodId0;
        this.c = iOException0;
    }

    @Override
    public final void run() {
        this.a.f(this.b, this.c);
    }
}

