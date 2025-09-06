package androidx.media3.exoplayer.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource.MediaPeriodId;
import androidx.media3.exoplayer.source.chunk.MediaChunk;
import androidx.media3.exoplayer.source.chunk.MediaChunkIterator;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.N3;
import com.google.common.collect.O2.a;
import com.google.common.collect.O2;
import com.google.common.collect.p3;
import com.google.common.collect.y3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final class AdaptationCheckpoint {
        public final long a;
        public final long b;

        public AdaptationCheckpoint(long v, long v1) {
            this.a = v;
            this.b = v1;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof AdaptationCheckpoint ? this.a == ((AdaptationCheckpoint)object0).a && this.b == ((AdaptationCheckpoint)object0).b : false;
        }

        @Override
        public int hashCode() {
            return ((int)this.a) * 0x1F + ((int)this.b);
        }
    }

    public static class Factory implements androidx.media3.exoplayer.trackselection.ExoTrackSelection.Factory {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final float f;
        private final float g;
        private final Clock h;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public Factory(int v, int v1, int v2, float f) {
            this(v, v1, v2, 0x4FF, 0x2CF, f, 0.75f, Clock.a);
        }

        public Factory(int v, int v1, int v2, float f, float f1, Clock clock0) {
            this(v, v1, v2, 0x4FF, 0x2CF, f, f1, clock0);
        }

        public Factory(int v, int v1, int v2, int v3, int v4, float f) {
            this(v, v1, v2, v3, v4, f, 0.75f, Clock.a);
        }

        public Factory(int v, int v1, int v2, int v3, int v4, float f, float f1, Clock clock0) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = f;
            this.g = f1;
            this.h = clock0;
        }

        @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection$Factory
        public final ExoTrackSelection[] a(Definition[] arr_exoTrackSelection$Definition, BandwidthMeter bandwidthMeter0, MediaPeriodId mediaSource$MediaPeriodId0, Timeline timeline0) {
            FixedTrackSelection fixedTrackSelection0;
            O2 o20 = AdaptiveTrackSelection.C(arr_exoTrackSelection$Definition);
            ExoTrackSelection[] arr_exoTrackSelection = new ExoTrackSelection[arr_exoTrackSelection$Definition.length];
            for(int v = 0; v < arr_exoTrackSelection$Definition.length; ++v) {
                Definition exoTrackSelection$Definition0 = arr_exoTrackSelection$Definition[v];
                if(exoTrackSelection$Definition0 != null) {
                    int[] arr_v = exoTrackSelection$Definition0.b;
                    if(arr_v.length != 0) {
                        if(arr_v.length == 1) {
                            fixedTrackSelection0 = new FixedTrackSelection(exoTrackSelection$Definition0.a, arr_v[0], exoTrackSelection$Definition0.c);
                        }
                        else {
                            Object object0 = o20.get(v);
                            fixedTrackSelection0 = this.b(exoTrackSelection$Definition0.a, arr_v, exoTrackSelection$Definition0.c, bandwidthMeter0, ((O2)object0));
                        }
                        arr_exoTrackSelection[v] = fixedTrackSelection0;
                    }
                }
            }
            return arr_exoTrackSelection;
        }

        protected AdaptiveTrackSelection b(TrackGroup trackGroup0, int[] arr_v, int v, BandwidthMeter bandwidthMeter0, O2 o20) {
            return new AdaptiveTrackSelection(trackGroup0, arr_v, v, bandwidthMeter0, ((long)this.a), ((long)this.b), ((long)this.c), this.d, this.e, this.f, this.g, o20, this.h);
        }
    }

    public static final int A = 10000;
    public static final int B = 25000;
    public static final int C = 25000;
    public static final int D = 0x4FF;
    public static final int E = 0x2CF;
    public static final float F = 0.7f;
    public static final float G = 0.75f;
    private static final long H = 1000L;
    private final BandwidthMeter j;
    private final long k;
    private final long l;
    private final long m;
    private final int n;
    private final int o;
    private final float p;
    private final float q;
    private final O2 r;
    private final Clock s;
    private float t;
    private int u;
    private int v;
    private long w;
    @Nullable
    private MediaChunk x;
    private long y;
    private static final String z = "AdaptiveTrackSelection";

    protected AdaptiveTrackSelection(TrackGroup trackGroup0, int[] arr_v, int v, BandwidthMeter bandwidthMeter0, long v1, long v2, long v3, int v4, int v5, float f, float f1, List list0, Clock clock0) {
        super(trackGroup0, arr_v, v);
        long v6;
        if(v3 < v1) {
            Log.n("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            v6 = v1;
        }
        else {
            v6 = v3;
        }
        this.j = bandwidthMeter0;
        this.k = v1 * 1000L;
        this.l = v2 * 1000L;
        this.m = v6 * 1000L;
        this.n = v4;
        this.o = v5;
        this.p = f;
        this.q = f1;
        this.r = O2.r(list0);
        this.s = clock0;
        this.t = 1.0f;
        this.v = 0;
        this.w = 0x8000000000000001L;
        this.y = 0xFFFFFFFF80000001L;
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup0, int[] arr_v, BandwidthMeter bandwidthMeter0) {
        this(trackGroup0, arr_v, 0, bandwidthMeter0, 10000L, 25000L, 25000L, 0x4FF, 0x2CF, 0.7f, 0.75f, O2.A(), Clock.a);
    }

    protected boolean A(Format format0, int v, long v1) {
        return ((long)v) <= v1;
    }

    private int B(long v, long v1) {
        long v2 = this.D(v1);
        int v4 = 0;
        for(int v3 = 0; v3 < this.d; ++v3) {
            if(v == 0x8000000000000000L || !this.b(v3, v)) {
                Format format0 = this.q(v3);
                if(this.A(format0, format0.i, v2)) {
                    return v3;
                }
                v4 = v3;
            }
        }
        return v4;
    }

    private static O2 C(Definition[] arr_exoTrackSelection$Definition) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_exoTrackSelection$Definition.length; ++v1) {
            Definition exoTrackSelection$Definition0 = arr_exoTrackSelection$Definition[v1];
            if(exoTrackSelection$Definition0 == null || exoTrackSelection$Definition0.b.length <= 1) {
                arrayList0.add(null);
            }
            else {
                a o2$a0 = O2.n();
                o2$a0.j(new AdaptationCheckpoint(0L, 0L));
                arrayList0.add(o2$a0);
            }
        }
        long[][] arr2_v = AdaptiveTrackSelection.H(arr_exoTrackSelection$Definition);
        int[] arr_v = new int[arr2_v.length];
        long[] arr_v1 = new long[arr2_v.length];
        for(int v2 = 0; v2 < arr2_v.length; ++v2) {
            long[] arr_v2 = arr2_v[v2];
            arr_v1[v2] = arr_v2.length == 0 ? 0L : arr_v2[0];
        }
        AdaptiveTrackSelection.z(arrayList0, arr_v1);
        O2 o20 = AdaptiveTrackSelection.I(arr2_v);
        for(int v3 = 0; v3 < o20.size(); ++v3) {
            int v4 = (int)(((Integer)o20.get(v3)));
            int v5 = arr_v[v4] + 1;
            arr_v[v4] = v5;
            arr_v1[v4] = arr2_v[v4][v5];
            AdaptiveTrackSelection.z(arrayList0, arr_v1);
        }
        for(int v6 = 0; v6 < arr_exoTrackSelection$Definition.length; ++v6) {
            if(arrayList0.get(v6) != null) {
                arr_v1[v6] *= 2L;
            }
        }
        AdaptiveTrackSelection.z(arrayList0, arr_v1);
        a o2$a1 = O2.n();
        for(int v = 0; v < arrayList0.size(); ++v) {
            a o2$a2 = (a)arrayList0.get(v);
            o2$a1.j((o2$a2 == null ? O2.A() : o2$a2.n()));
        }
        return o2$a1.n();
    }

    private long D(long v) {
        long v1 = this.J(v);
        if(this.r.isEmpty()) {
            return v1;
        }
        int v2;
        for(v2 = 1; v2 < this.r.size() - 1 && ((AdaptationCheckpoint)this.r.get(v2)).a < v1; ++v2) {
        }
        AdaptationCheckpoint adaptiveTrackSelection$AdaptationCheckpoint0 = (AdaptationCheckpoint)this.r.get(v2 - 1);
        AdaptationCheckpoint adaptiveTrackSelection$AdaptationCheckpoint1 = (AdaptationCheckpoint)this.r.get(v2);
        return adaptiveTrackSelection$AdaptationCheckpoint0.b + ((long)(((float)(v1 - adaptiveTrackSelection$AdaptationCheckpoint0.a)) / ((float)(adaptiveTrackSelection$AdaptationCheckpoint1.a - adaptiveTrackSelection$AdaptationCheckpoint0.a)) * ((float)(adaptiveTrackSelection$AdaptationCheckpoint1.b - adaptiveTrackSelection$AdaptationCheckpoint0.b))));
    }

    private long E(List list0) {
        if(list0.isEmpty()) {
            return 0x8000000000000001L;
        }
        MediaChunk mediaChunk0 = (MediaChunk)p3.w(list0);
        long v = mediaChunk0.g;
        if(v != 0x8000000000000001L) {
            return mediaChunk0.h == 0x8000000000000001L ? 0x8000000000000001L : mediaChunk0.h - v;
        }
        return 0x8000000000000001L;
    }

    protected long F() {
        return this.m;
    }

    private long G(MediaChunkIterator[] arr_mediaChunkIterator, List list0) {
        if(this.u < arr_mediaChunkIterator.length && arr_mediaChunkIterator[this.u].next()) {
            MediaChunkIterator mediaChunkIterator0 = arr_mediaChunkIterator[this.u];
            return mediaChunkIterator0.a() - mediaChunkIterator0.c();
        }
        for(int v = 0; v < arr_mediaChunkIterator.length; ++v) {
            MediaChunkIterator mediaChunkIterator1 = arr_mediaChunkIterator[v];
            if(mediaChunkIterator1.next()) {
                return mediaChunkIterator1.a() - mediaChunkIterator1.c();
            }
        }
        return this.E(list0);
    }

    private static long[][] H(Definition[] arr_exoTrackSelection$Definition) {
        long[][] arr2_v = new long[arr_exoTrackSelection$Definition.length][];
        for(int v = 0; v < arr_exoTrackSelection$Definition.length; ++v) {
            Definition exoTrackSelection$Definition0 = arr_exoTrackSelection$Definition[v];
            if(exoTrackSelection$Definition0 == null) {
                arr2_v[v] = new long[0];
            }
            else {
                arr2_v[v] = new long[exoTrackSelection$Definition0.b.length];
                for(int v1 = 0; true; ++v1) {
                    int[] arr_v = exoTrackSelection$Definition0.b;
                    if(v1 >= arr_v.length) {
                        break;
                    }
                    long v2 = (long)exoTrackSelection$Definition0.a.c(arr_v[v1]).i;
                    long[] arr_v1 = arr2_v[v];
                    if(v2 == -1L) {
                        v2 = 0L;
                    }
                    arr_v1[v1] = v2;
                }
                Arrays.sort(arr2_v[v]);
            }
        }
        return arr2_v;
    }

    private static O2 I(long[][] arr2_v) {
        y3 y30 = N3.h().a().j();
        for(int v = 0; v < arr2_v.length; ++v) {
            long[] arr_v = arr2_v[v];
            if(arr_v.length > 1) {
                double[] arr_f = new double[arr_v.length];
                for(int v1 = 0; true; ++v1) {
                    long[] arr_v1 = arr2_v[v];
                    double f = 0.0;
                    if(v1 >= arr_v1.length) {
                        break;
                    }
                    long v2 = arr_v1[v1];
                    if(v2 != -1L) {
                        f = Math.log(v2);
                    }
                    arr_f[v1] = f;
                }
                int v3 = arr_v.length - 1;
                double f1 = arr_f[v3] - arr_f[0];
                int v4 = 0;
                while(v4 < v3) {
                    double f2 = arr_f[v4];
                    ++v4;
                    y30.put(((double)(f1 == 0.0 ? 1.0 : ((f2 + arr_f[v4]) * 0.5 - arr_f[0]) / f1)), v);
                }
            }
        }
        return O2.r(y30.values());
    }

    private long J(long v) {
        long v1 = this.j.d();
        this.y = v1;
        long v2 = (long)(((float)v1) * this.p);
        long v3 = this.j.b();
        return v3 == 0x8000000000000001L || v == 0x8000000000000001L ? ((long)(((float)v2) / this.t)) : ((long)(((float)v2) * Math.max(((float)v) / this.t - ((float)v3), 0.0f) / ((float)v)));
    }

    private long K(long v, long v1) {
        if(v == 0x8000000000000001L) {
            return this.k;
        }
        if(v1 != 0x8000000000000001L) {
            v -= v1;
        }
        return Math.min(((long)(((float)v) * this.q)), this.k);
    }

    // 去混淆评级： 低(20)
    protected boolean L(long v, List list0) {
        return this.w == 0x8000000000000001L || v - this.w >= 1000L || !list0.isEmpty() && !((MediaChunk)p3.w(list0)).equals(this.x);
    }

    @Override  // androidx.media3.exoplayer.trackselection.BaseTrackSelection
    public long a() {
        return this.y;
    }

    @Override  // androidx.media3.exoplayer.trackselection.BaseTrackSelection
    @CallSuper
    public void c() {
        this.x = null;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int d() {
        return this.u;
    }

    @Override  // androidx.media3.exoplayer.trackselection.BaseTrackSelection
    @CallSuper
    public void k() {
        this.w = 0x8000000000000001L;
        this.x = null;
    }

    @Override  // androidx.media3.exoplayer.trackselection.BaseTrackSelection
    public int l(long v, List list0) {
        long v1 = this.s.elapsedRealtime();
        if(!this.L(v1, list0)) {
            return list0.size();
        }
        this.w = v1;
        this.x = list0.isEmpty() ? null : ((MediaChunk)p3.w(list0));
        if(list0.isEmpty()) {
            return 0;
        }
        int v3 = list0.size();
        long v4 = this.F();
        if(Util.D0(((MediaChunk)list0.get(v3 - 1)).g - v, this.t) < v4) {
            return v3;
        }
        Format format0 = this.q(this.B(v1, this.E(list0)));
        for(int v2 = 0; v2 < v3; ++v2) {
            MediaChunk mediaChunk0 = (MediaChunk)list0.get(v2);
            if(Util.D0(mediaChunk0.g - v, this.t) >= v4 && mediaChunk0.d.i < format0.i && (mediaChunk0.d.u != -1 && mediaChunk0.d.u <= this.o && (mediaChunk0.d.t != -1 && mediaChunk0.d.t <= this.n && mediaChunk0.d.u < format0.u))) {
                return v2;
            }
        }
        return v3;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void r(long v, long v1, long v2, List list0, MediaChunkIterator[] arr_mediaChunkIterator) {
        long v3 = this.s.elapsedRealtime();
        long v4 = this.G(arr_mediaChunkIterator, list0);
        int v5 = this.v;
        if(v5 == 0) {
            this.v = 1;
            this.u = this.B(v3, v4);
            return;
        }
        int v6 = this.u;
        int v7 = list0.isEmpty() ? -1 : this.p(((MediaChunk)p3.w(list0)).d);
        if(v7 != -1) {
            v5 = ((MediaChunk)p3.w(list0)).e;
            v6 = v7;
        }
        int v8 = this.B(v3, v4);
        if(v8 != v6 && !this.b(v6, v3)) {
            Format format0 = this.q(v6);
            Format format1 = this.q(v8);
            long v9 = this.K(v2, v4);
            if(format1.i > format0.i && v1 < v9 || format1.i < format0.i && v1 >= this.l) {
                v8 = v6;
            }
        }
        if(v8 != v6) {
            v5 = 3;
        }
        this.v = v5;
        this.u = v8;
    }

    @Override  // androidx.media3.exoplayer.trackselection.BaseTrackSelection
    public void s(float f) {
        this.t = f;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    @Nullable
    public Object t() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public int v() {
        return this.v;
    }

    private static void z(List list0, long[] arr_v) {
        long v = 0L;
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            v += arr_v[v2];
        }
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            a o2$a0 = (a)list0.get(v1);
            if(o2$a0 != null) {
                o2$a0.j(new AdaptationCheckpoint(v, arr_v[v1]));
            }
        }
    }
}

