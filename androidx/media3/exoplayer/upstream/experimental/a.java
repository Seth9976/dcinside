package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.NetworkTypeObserver.Listener;

public final class a implements Listener {
    public final ExperimentalBandwidthMeter a;

    public a(ExperimentalBandwidthMeter experimentalBandwidthMeter0) {
        this.a = experimentalBandwidthMeter0;
    }

    @Override  // androidx.media3.common.util.NetworkTypeObserver$Listener
    public final void a(int v) {
        this.a.o(v);
    }
}

