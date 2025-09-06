package androidx.media3.exoplayer.upstream.experimental;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.Deque;

@UnstableApi
public class SlidingWeightedAverageBandwidthStatistic implements BandwidthStatistic {
    public static class Sample {
        public final long a;
        public final double b;
        public final long c;

        public Sample(long v, double f, long v1) {
            this.a = v;
            this.b = f;
            this.c = v1;
        }
    }

    public interface SampleEvictionFunction {
        boolean a(Deque arg1);
    }

    private final ArrayDeque a;
    private final SampleEvictionFunction b;
    private final Clock c;
    private double d;
    private double e;
    public static final int f = 10;

    public SlidingWeightedAverageBandwidthStatistic() {
        this(SlidingWeightedAverageBandwidthStatistic.g(10L));
    }

    public SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction slidingWeightedAverageBandwidthStatistic$SampleEvictionFunction0) {
        this(slidingWeightedAverageBandwidthStatistic$SampleEvictionFunction0, Clock.a);
    }

    @VisibleForTesting
    SlidingWeightedAverageBandwidthStatistic(SampleEvictionFunction slidingWeightedAverageBandwidthStatistic$SampleEvictionFunction0, Clock clock0) {
        this.a = new ArrayDeque();
        this.b = slidingWeightedAverageBandwidthStatistic$SampleEvictionFunction0;
        this.c = clock0;
    }

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void a(long v, long v1) {
        while(this.b.a(this.a)) {
            Sample slidingWeightedAverageBandwidthStatistic$Sample0 = (Sample)this.a.remove();
            this.d -= ((double)slidingWeightedAverageBandwidthStatistic$Sample0.a) * slidingWeightedAverageBandwidthStatistic$Sample0.b;
            this.e -= slidingWeightedAverageBandwidthStatistic$Sample0.b;
        }
        Sample slidingWeightedAverageBandwidthStatistic$Sample1 = new Sample(v * 8000000L / v1, Math.sqrt(v), this.c.elapsedRealtime());
        this.a.add(slidingWeightedAverageBandwidthStatistic$Sample1);
        this.d += ((double)slidingWeightedAverageBandwidthStatistic$Sample1.a) * slidingWeightedAverageBandwidthStatistic$Sample1.b;
        this.e += slidingWeightedAverageBandwidthStatistic$Sample1.b;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long b() {
        return this.a.isEmpty() ? 0x8000000000000000L : ((long)(this.d / this.e));
    }

    public static SampleEvictionFunction e(long v) {
        return SlidingWeightedAverageBandwidthStatistic.f(v, Clock.a);
    }

    @VisibleForTesting
    static SampleEvictionFunction f(long v, Clock clock0) {
        return (Deque deque0) -> // 去混淆评级： 低(20)
        (deque0.isEmpty() ? false : ((Sample)Util.o(((Sample)deque0.peek()))).c + v < clock0.elapsedRealtime());
    }

    public static SampleEvictionFunction g(long v) {
        return (Deque deque0) -> ((long)deque0.size()) >= v;
    }

    // 去混淆评级： 低(20)
    // 检测为 Lambda 实现
    private static boolean h(long v, Clock clock0, Deque deque0) [...]

    // 检测为 Lambda 实现
    private static boolean i(long v, Deque deque0) [...]

    @Override  // androidx.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.a.clear();
        this.d = 0.0;
        this.e = 0.0;
    }
}

