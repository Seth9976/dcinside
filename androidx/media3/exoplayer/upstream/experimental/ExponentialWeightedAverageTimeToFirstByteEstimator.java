package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@UnstableApi
public final class ExponentialWeightedAverageTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
    static class FixedSizeLinkedHashMap extends LinkedHashMap {
        private final int a;

        public FixedSizeLinkedHashMap(int v) {
            this.a = v;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry map$Entry0) {
            return this.size() > this.a;
        }
    }

    private final LinkedHashMap a;
    private final double b;
    private final Clock c;
    private long d;
    public static final double e = 0.85;
    private static final int f = 10;

    public ExponentialWeightedAverageTimeToFirstByteEstimator() {
        this(0.85, Clock.a);
    }

    public ExponentialWeightedAverageTimeToFirstByteEstimator(double f) {
        this(f, Clock.a);
    }

    @VisibleForTesting
    ExponentialWeightedAverageTimeToFirstByteEstimator(double f, Clock clock0) {
        this.b = f;
        this.c = clock0;
        this.a = new FixedSizeLinkedHashMap(10);
        this.d = 0x8000000000000001L;
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void a(DataSpec dataSpec0) {
        Long long0 = (Long)this.a.remove(dataSpec0);
        if(long0 == null) {
            return;
        }
        long v = Util.F1(this.c.elapsedRealtime()) - ((long)long0);
        long v1 = this.d;
        if(v1 == 0x8000000000000001L) {
            this.d = v;
            return;
        }
        this.d = (long)(((double)v1) * this.b + (1.0 - this.b) * ((double)v));
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long b() {
        return this.d;
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void c(DataSpec dataSpec0) {
        this.a.remove(dataSpec0);
        Long long0 = Util.F1(this.c.elapsedRealtime());
        this.a.put(dataSpec0, long0);
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.d = 0x8000000000000001L;
    }
}

