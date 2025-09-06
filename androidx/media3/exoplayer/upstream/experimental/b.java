package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.Clock;
import java.util.Deque;

public final class b implements SampleEvictionFunction {
    public final long a;
    public final Clock b;

    public b(long v, Clock clock0) {
        this.a = v;
        this.b = clock0;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.SlidingWeightedAverageBandwidthStatistic$SampleEvictionFunction
    public final boolean a(Deque deque0) {
        return SlidingWeightedAverageBandwidthStatistic.h(this.a, this.b, deque0);
    }
}

