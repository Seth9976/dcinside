package androidx.media3.exoplayer.source.ads;

import androidx.media3.common.AdPlaybackState;

public final class f implements Runnable {
    public final ComponentListener a;
    public final AdPlaybackState b;

    public f(ComponentListener adsMediaSource$ComponentListener0, AdPlaybackState adPlaybackState0) {
        this.a = adsMediaSource$ComponentListener0;
        this.b = adPlaybackState0;
    }

    @Override
    public final void run() {
        this.a.e(this.b);
    }
}

