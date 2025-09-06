package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.NetworkTypeObserver.Listener;

public final class f implements Listener {
    public final DefaultBandwidthMeter a;

    public f(DefaultBandwidthMeter defaultBandwidthMeter0) {
        this.a = defaultBandwidthMeter0;
    }

    @Override  // androidx.media3.common.util.NetworkTypeObserver$Listener
    public final void a(int v) {
        this.a.q(v);
    }
}

