package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class ExponentialWeightedAverageStatistic implements BandwidthStatistic {
    private final double a;
    private long b;
    public static final double c = 0.9999;

    public ExponentialWeightedAverageStatistic() {
        this(0.9999);
    }

    public ExponentialWeightedAverageStatistic(double f) {
        this.a = f;
        this.b = 0x8000000000000000L;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void a(long v, long v1) {
        long v2 = 8000000L * v / v1;
        if(this.b == 0x8000000000000000L) {
            this.b = v2;
            return;
        }
        double f = Math.pow(this.a, Math.sqrt(v));
        this.b = (long)(((double)this.b) * f + (1.0 - f) * ((double)v2));
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long b() {
        return this.b;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.b = 0x8000000000000000L;
    }
}

