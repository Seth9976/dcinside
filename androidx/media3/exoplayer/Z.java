package androidx.media3.exoplayer;

import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.base.Q;

public final class z implements Q {
    public final BandwidthMeter a;

    public z(BandwidthMeter bandwidthMeter0) {
        this.a = bandwidthMeter0;
    }

    @Override  // com.google.common.base.Q
    public final Object get() {
        return Builder.t(this.a);
    }
}

