package androidx.media3.exoplayer.upstream.experimental;

import java.util.Deque;

public final class c implements SampleEvictionFunction {
    public final long a;

    public c(long v) {
        this.a = v;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$SampleEvictionFunction
    public final boolean a(Deque deque0) {
        return SlidingWeightedAverageBandwidthStatistic.i(this.a, deque0);
    }
}

