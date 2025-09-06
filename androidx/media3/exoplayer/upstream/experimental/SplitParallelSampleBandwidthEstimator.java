package androidx.media3.exoplayer.upstream.experimental;

import O1.a;
import android.os.Handler;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher;
import androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener;

@UnstableApi
public class SplitParallelSampleBandwidthEstimator implements BandwidthEstimator {
    public static class Builder {
        private BandwidthStatistic a;
        private int b;
        private long c;
        private Clock d;

        public Builder() {
            this.a = new SlidingWeightedAverageBandwidthStatistic();
            this.d = Clock.a;
        }

        public SplitParallelSampleBandwidthEstimator e() {
            return new SplitParallelSampleBandwidthEstimator(this, null);
        }

        @a
        public Builder f(BandwidthStatistic bandwidthStatistic0) {
            Assertions.g(bandwidthStatistic0);
            this.a = bandwidthStatistic0;
            return this;
        }

        @a
        @VisibleForTesting
        Builder g(Clock clock0) {
            this.d = clock0;
            return this;
        }

        @a
        public Builder h(long v) {
            Assertions.a(v >= 0L);
            this.c = v;
            return this;
        }

        @a
        public Builder i(int v) {
            Assertions.a(v >= 0);
            this.b = v;
            return this;
        }
    }

    private final BandwidthStatistic b;
    private final int c;
    private final long d;
    private final Clock e;
    private final EventDispatcher f;
    private int g;
    private long h;
    private long i;
    private long j;
    private long k;
    private int l;
    private long m;

    private SplitParallelSampleBandwidthEstimator(Builder splitParallelSampleBandwidthEstimator$Builder0) {
        this.b = splitParallelSampleBandwidthEstimator$Builder0.a;
        this.c = splitParallelSampleBandwidthEstimator$Builder0.b;
        this.d = splitParallelSampleBandwidthEstimator$Builder0.c;
        this.e = splitParallelSampleBandwidthEstimator$Builder0.d;
        this.f = new EventDispatcher();
        this.j = 0x8000000000000000L;
        this.k = 0x8000000000000000L;
    }

    SplitParallelSampleBandwidthEstimator(Builder splitParallelSampleBandwidthEstimator$Builder0, androidx.media3.exoplayer.upstream.experimental.SplitParallelSampleBandwidthEstimator.1 splitParallelSampleBandwidthEstimator$10) {
        this(splitParallelSampleBandwidthEstimator$Builder0);
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void a(EventListener bandwidthMeter$EventListener0) {
        this.f.e(bandwidthMeter$EventListener0);
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public long b() {
        return this.j;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void c(Handler handler0, EventListener bandwidthMeter$EventListener0) {
        this.f.b(handler0, bandwidthMeter$EventListener0);
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void d(DataSource dataSource0) {
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void e(DataSource dataSource0) {
        Assertions.i(this.g > 0);
        long v = this.e.elapsedRealtime();
        long v1 = (long)(((int)(v - this.h)));
        if(v1 > 0L) {
            this.b.a(this.i, 1000L * v1);
            int v2 = this.l + 1;
            this.l = v2;
            if(v2 > this.c && this.m > this.d) {
                this.j = this.b.b();
            }
            this.i(((int)v1), this.i, this.j);
            this.h = v;
            this.i = 0L;
        }
        --this.g;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void f(DataSource dataSource0, int v) {
        this.i += (long)v;
        this.m += (long)v;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void g(long v) {
        long v1 = this.e.elapsedRealtime();
        this.i((this.g <= 0 ? 0 : ((int)(v1 - this.h))), this.i, v);
        this.b.reset();
        this.j = 0x8000000000000000L;
        this.h = v1;
        this.i = 0L;
        this.l = 0;
        this.m = 0L;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthEstimator
    public void h(DataSource dataSource0) {
        if(this.g == 0) {
            this.h = this.e.elapsedRealtime();
        }
        ++this.g;
    }

    private void i(int v, long v1, long v2) {
        if(v2 != 0x8000000000000000L && (v != 0 || v1 != 0L || v2 != this.k)) {
            this.k = v2;
            this.f.c(v, v1, v2);
        }
    }

    class androidx.media3.exoplayer.upstream.experimental.SplitParallelSampleBandwidthEstimator.1 {
    }

}

