package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.SlidingPercentile;
import androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@UnstableApi
public final class PercentileTimeToFirstByteEstimator implements TimeToFirstByteEstimator {
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
    private final SlidingPercentile b;
    private final float c;
    private final Clock d;
    private boolean e;
    public static final int f = 10;
    public static final float g = 0.5f;
    private static final int h = 10;

    public PercentileTimeToFirstByteEstimator() {
        this(10, 0.5f);
    }

    public PercentileTimeToFirstByteEstimator(int v, float f) {
        this(v, f, Clock.a);
    }

    @VisibleForTesting
    PercentileTimeToFirstByteEstimator(int v, float f, Clock clock0) {
        Assertions.a(v > 0 && f > 0.0f && f <= 1.0f);
        this.c = f;
        this.d = clock0;
        this.a = new FixedSizeLinkedHashMap(10);
        this.b = new SlidingPercentile(v);
        this.e = true;
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void a(DataSpec dataSpec0) {
        Long long0 = (Long)this.a.remove(dataSpec0);
        if(long0 == null) {
            return;
        }
        long v = Util.F1(this.d.elapsedRealtime());
        this.b.c(1, ((float)(v - ((long)long0))));
        this.e = false;
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public long b() {
        return this.e ? 0x8000000000000001L : ((long)this.b.f(this.c));
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void c(DataSpec dataSpec0) {
        this.a.remove(dataSpec0);
        Long long0 = Util.F1(this.d.elapsedRealtime());
        this.a.put(dataSpec0, long0);
    }

    @Override  // androidx.media3.exoplayer.upstream.TimeToFirstByteEstimator
    public void reset() {
        this.b.i();
        this.e = true;
    }
}

