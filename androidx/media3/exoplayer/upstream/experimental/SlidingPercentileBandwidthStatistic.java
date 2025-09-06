package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.TreeSet;

@UnstableApi
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    static class Sample implements Comparable {
        private final long a;
        private final double b;

        public Sample(long v, double f) {
            this.a = v;
            this.b = f;
        }

        public int c(Sample slidingPercentileBandwidthStatistic$Sample0) {
            return Util.u(this.a, slidingPercentileBandwidthStatistic$Sample0.a);
        }

        @Override
        public int compareTo(Object object0) {
            return this.c(((Sample)object0));
        }
    }

    private final int a;
    private final double b;
    private final ArrayDeque c;
    private final TreeSet d;
    private double e;
    private long f;
    public static final int g = 10;
    public static final double h = 0.5;

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5);
    }

    public SlidingPercentileBandwidthStatistic(int v, double f) {
        Assertions.a(f >= 0.0 && f <= 1.0);
        this.a = v;
        this.b = f;
        this.c = new ArrayDeque();
        this.d = new TreeSet();
        this.f = 0x8000000000000000L;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void a(long v, long v1) {
        while(this.c.size() >= this.a) {
            Sample slidingPercentileBandwidthStatistic$Sample0 = (Sample)this.c.remove();
            this.d.remove(slidingPercentileBandwidthStatistic$Sample0);
            this.e -= slidingPercentileBandwidthStatistic$Sample0.b;
        }
        double f = Math.sqrt(v);
        Sample slidingPercentileBandwidthStatistic$Sample1 = new Sample(v * 8000000L / v1, f);
        this.c.add(slidingPercentileBandwidthStatistic$Sample1);
        this.d.add(slidingPercentileBandwidthStatistic$Sample1);
        this.e += f;
        this.f = this.c();
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long b() {
        return this.f;
    }

    private long c() {
        if(this.c.isEmpty()) {
            return 0x8000000000000000L;
        }
        double f = this.e * this.b;
        double f1 = 0.0;
        long v = 0L;
        double f2 = 0.0;
        for(Object object0: this.d) {
            Sample slidingPercentileBandwidthStatistic$Sample0 = (Sample)object0;
            double f3 = f1 + slidingPercentileBandwidthStatistic$Sample0.b / 2.0;
            if(f3 >= f) {
                return v == 0L ? slidingPercentileBandwidthStatistic$Sample0.a : v + ((long)(((double)(slidingPercentileBandwidthStatistic$Sample0.a - v)) * (f - f2) / (f3 - f2)));
            }
            v = slidingPercentileBandwidthStatistic$Sample0.a;
            f1 = slidingPercentileBandwidthStatistic$Sample0.b / 2.0 + f3;
            f2 = f3;
        }
        return v;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.c.clear();
        this.d.clear();
        this.e = 0.0;
        this.f = 0x8000000000000000L;
    }
}

