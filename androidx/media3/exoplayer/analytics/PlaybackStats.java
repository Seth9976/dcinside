package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.List;

@UnstableApi
public final class PlaybackStats {
    public static final class EventTimeAndException {
        public final EventTime a;
        public final Exception b;

        public EventTimeAndException(EventTime analyticsListener$EventTime0, Exception exception0) {
            this.a = analyticsListener$EventTime0;
            this.b = exception0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return EventTimeAndException.class == class0 && this.a.equals(((EventTimeAndException)object0).a) ? this.b.equals(((EventTimeAndException)object0).b) : false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b.hashCode();
        }
    }

    public static final class EventTimeAndFormat {
        public final EventTime a;
        @Nullable
        public final Format b;

        public EventTimeAndFormat(EventTime analyticsListener$EventTime0, @Nullable Format format0) {
            this.a = analyticsListener$EventTime0;
            this.b = format0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                if(EventTimeAndFormat.class != class0 || !this.a.equals(((EventTimeAndFormat)object0).a)) {
                    return false;
                }
                Format format0 = ((EventTimeAndFormat)object0).b;
                return this.b == null ? format0 == null : this.b.equals(format0);
            }
            return false;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final EventTime a;
        public final int b;

        public EventTimeAndPlaybackState(EventTime analyticsListener$EventTime0, int v) {
            this.a = analyticsListener$EventTime0;
            this.b = v;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null) {
                Class class0 = object0.getClass();
                return EventTimeAndPlaybackState.class == class0 && this.b == ((EventTimeAndPlaybackState)object0).b ? this.a.equals(((EventTimeAndPlaybackState)object0).a) : false;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() * 0x1F + this.b;
        }
    }

    public final int A;
    public final long B;
    public final int C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final int I;
    public final int J;
    public final int K;
    public final List L;
    public final List M;
    private final long[] N;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final int T = 5;
    public static final int U = 6;
    public static final int V = 7;
    public static final int W = 9;
    public static final int X = 10;
    public static final int Y = 11;
    public static final int Z = 12;
    public final int a;
    public static final int a0 = 13;
    public final List b;
    public static final int b0 = 14;
    public final List c;
    public static final int c0 = 15;
    public final long d;
    static final int d0 = 16;
    public final int e;
    public static final PlaybackStats e0;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final long o;
    public final int p;
    public final List q;
    public final List r;
    public final long s;
    public final long t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    static {
        PlaybackStats.e0 = PlaybackStats.W(new PlaybackStats[0]);
    }

    PlaybackStats(int v, long[] arr_v, List list0, List list1, long v1, int v2, int v3, int v4, int v5, long v6, int v7, int v8, int v9, int v10, int v11, long v12, int v13, List list2, List list3, long v14, long v15, long v16, long v17, long v18, long v19, int v20, int v21, int v22, long v23, int v24, long v25, long v26, long v27, long v28, long v29, int v30, int v31, int v32, List list4, List list5) {
        this.a = v;
        this.N = arr_v;
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = DesugarCollections.unmodifiableList(list1);
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = v5;
        this.i = v6;
        this.j = v7;
        this.k = v8;
        this.l = v9;
        this.m = v10;
        this.n = v11;
        this.o = v12;
        this.p = v13;
        this.q = DesugarCollections.unmodifiableList(list2);
        this.r = DesugarCollections.unmodifiableList(list3);
        this.s = v14;
        this.t = v15;
        this.u = v16;
        this.v = v17;
        this.w = v18;
        this.x = v19;
        this.y = v20;
        this.z = v21;
        this.A = v22;
        this.B = v23;
        this.C = v24;
        this.D = v25;
        this.E = v26;
        this.F = v27;
        this.G = v28;
        this.H = v29;
        this.I = v30;
        this.J = v31;
        this.K = v32;
        this.L = DesugarCollections.unmodifiableList(list4);
        this.M = DesugarCollections.unmodifiableList(list5);
    }

    public float A() {
        return 1.0f / this.e();
    }

    public float B() {
        return 1.0f / this.H();
    }

    public float C() {
        return 1.0f / this.K();
    }

    public int D() {
        return this.u == 0L ? -1 : ((int)(this.v / this.u));
    }

    public int E() {
        return this.s == 0L ? -1 : ((int)(this.t / this.s));
    }

    public long F() {
        return this.e == 0 ? 0x8000000000000001L : this.U() / ((long)this.e);
    }

    public long G(long v) {
        if(this.c.isEmpty()) {
            return 0x8000000000000001L;
        }
        int v1;
        for(v1 = 0; v1 < this.c.size() && ((long[])this.c.get(v1))[0] <= v; ++v1) {
        }
        if(v1 == 0) {
            return ((long[])this.c.get(0))[1];
        }
        if(v1 == this.c.size()) {
            return ((long[])this.c.get(this.c.size() - 1))[1];
        }
        long v2 = ((long[])this.c.get(v1 - 1))[0];
        long v3 = ((long[])this.c.get(v1 - 1))[1];
        long v4 = ((long[])this.c.get(v1))[0] - v2;
        return v4 == 0L ? v3 : v3 + ((long)(((float)(((long[])this.c.get(v1))[1] - v3)) * (((float)(v - v2)) / ((float)v4))));
    }

    public float H() {
        long v = this.R();
        return v == 0L ? 0.0f : ((float)this.K) * 1000.0f / ((float)v);
    }

    public int I(long v) {
        int v1 = 0;
        for(Object object0: this.b) {
            if(((EventTimeAndPlaybackState)object0).a.a > v) {
                break;
            }
            v1 = ((EventTimeAndPlaybackState)object0).b;
        }
        return v1;
    }

    public long J(int v) {
        return this.N[v];
    }

    public float K() {
        long v = this.R();
        return v == 0L ? 0.0f : ((float)this.n) * 1000.0f / ((float)v);
    }

    public float L() {
        long v = this.Q();
        return v == 0L ? 0.0f : ((float)this.S()) / ((float)v);
    }

    public float M() {
        long v = this.Q();
        return v == 0L ? 0.0f : ((float)this.T()) / ((float)v);
    }

    public long N() {
        long v = 0L;
        for(int v1 = 0; v1 < 16; ++v1) {
            v += this.N[v1];
        }
        return v;
    }

    public long O() {
        return this.J(2);
    }

    public long P() {
        return this.J(4) + this.J(7);
    }

    public long Q() {
        return this.R() + this.U();
    }

    public long R() {
        return this.J(3);
    }

    public long S() {
        return this.J(6);
    }

    public long T() {
        return this.J(5);
    }

    public long U() {
        return this.J(2) + this.J(6) + this.J(5);
    }

    public float V() {
        long v = this.Q();
        return v == 0L ? 0.0f : ((float)this.U()) / ((float)v);
    }

    public static PlaybackStats W(PlaybackStats[] arr_playbackStats) {
        long[] arr_v = new long[16];
        long v = 0L;
        long v1 = 0L;
        long v2 = 0L;
        long v3 = 0L;
        long v4 = 0L;
        long v5 = 0L;
        long v6 = 0L;
        long v7 = 0L;
        long v8 = 0L;
        long v9 = 0L;
        int v11 = 0;
        int v12 = -1;
        long v13 = 0x8000000000000001L;
        long v14 = 0x8000000000000001L;
        int v15 = 0;
        int v16 = 0;
        int v17 = 0;
        int v18 = 0;
        long v19 = 0x8000000000000001L;
        int v20 = 0;
        int v21 = 0;
        int v22 = 0;
        int v23 = 0;
        int v24 = 0;
        int v25 = 0;
        int v26 = 0;
        int v27 = 0;
        long v28 = -1L;
        int v29 = 0;
        long v30 = -1L;
        int v31 = 0;
        int v32 = 0;
        int v33 = 0;
        for(int v10 = 0; v10 < arr_playbackStats.length; ++v10) {
            PlaybackStats playbackStats0 = arr_playbackStats[v10];
            v11 += playbackStats0.a;
            for(int v34 = 0; v34 < 16; ++v34) {
                arr_v[v34] += playbackStats0.N[v34];
            }
            if(v14 == 0x8000000000000001L) {
                v14 = playbackStats0.d;
            }
            else {
                long v35 = playbackStats0.d;
                if(v35 != 0x8000000000000001L) {
                    v14 = Math.min(v14, v35);
                }
            }
            v15 += playbackStats0.e;
            v16 += playbackStats0.f;
            v17 += playbackStats0.g;
            v18 += playbackStats0.h;
            if(v19 == 0x8000000000000001L) {
                v19 = playbackStats0.i;
            }
            else {
                long v36 = playbackStats0.i;
                if(v36 != 0x8000000000000001L) {
                    v19 += v36;
                }
            }
            v20 += playbackStats0.j;
            v21 += playbackStats0.k;
            v22 += playbackStats0.l;
            v23 += playbackStats0.m;
            v24 += playbackStats0.n;
            if(v13 == 0x8000000000000001L) {
                v13 = playbackStats0.o;
            }
            else {
                long v37 = playbackStats0.o;
                if(v37 != 0x8000000000000001L) {
                    v13 = Math.max(v13, v37);
                }
            }
            v25 += playbackStats0.p;
            v += playbackStats0.s;
            v1 += playbackStats0.t;
            v2 += playbackStats0.u;
            v3 += playbackStats0.v;
            v4 += playbackStats0.w;
            v5 += playbackStats0.x;
            v26 += playbackStats0.y;
            v27 += playbackStats0.z;
            if(v12 == -1) {
                v12 = playbackStats0.A;
            }
            else {
                int v38 = playbackStats0.A;
                if(v38 != -1) {
                    v12 += v38;
                }
            }
            if(v28 == -1L) {
                v28 = playbackStats0.B;
            }
            else {
                long v39 = playbackStats0.B;
                if(v39 != -1L) {
                    v28 += v39;
                }
            }
            v29 += playbackStats0.C;
            if(v30 == -1L) {
                v30 = playbackStats0.D;
            }
            else {
                long v40 = playbackStats0.D;
                if(v40 != -1L) {
                    v30 += v40;
                }
            }
            v6 += playbackStats0.E;
            v7 += playbackStats0.F;
            v8 += playbackStats0.G;
            v9 += playbackStats0.H;
            v31 += playbackStats0.I;
            v32 += playbackStats0.J;
            v33 += playbackStats0.K;
        }
        return new PlaybackStats(v11, arr_v, Collections.emptyList(), Collections.emptyList(), v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v13, v25, Collections.emptyList(), Collections.emptyList(), v, v1, v2, v3, v4, v5, v26, v27, v12, v28, v29, v30, v6, v7, v8, v9, v31, v32, v33, Collections.emptyList(), Collections.emptyList());
    }

    public float a() {
        return this.e == 0 ? 0.0f : ((float)(this.f - (this.a - this.e))) / ((float)this.e);
    }

    public float b() {
        long v = this.R();
        return v == 0L ? 0.0f : ((float)this.H) * 1000.0f / ((float)v);
    }

    public float c() {
        long v = this.R();
        return v == 0L ? 0.0f : ((float)this.G) * 1000.0f / ((float)v);
    }

    public float d() {
        return this.e == 0 ? 0.0f : ((float)this.g) / ((float)this.e);
    }

    public float e() {
        long v = this.R();
        return v == 0L ? 0.0f : ((float)this.J) * 1000.0f / ((float)v);
    }

    public float f() {
        return this.e == 0 ? 0.0f : ((float)this.I) / ((float)this.e);
    }

    public float g() {
        long v = this.Q();
        return v == 0L ? 0.0f : ((float)this.O()) / ((float)v);
    }

    public int h() {
        return this.w == 0L ? -1 : ((int)(this.x / this.w));
    }

    public int i() {
        return this.E == 0L ? -1 : ((int)(this.F * 8000L / this.E));
    }

    public long j() {
        return this.a == 0 ? 0x8000000000000001L : this.N() / ((long)this.a);
    }

    public int k() {
        return this.C == 0 ? -1 : ((int)(this.D / ((long)this.C)));
    }

    public int l() {
        return this.z == 0 ? -1 : ((int)(this.B / ((long)this.z)));
    }

    public int m() {
        return this.y == 0 ? -1 : this.A / this.y;
    }

    public long n() {
        return this.j == 0 ? 0x8000000000000001L : this.i / ((long)this.j);
    }

    public float o() {
        return this.e == 0 ? 0.0f : ((float)this.K) / ((float)this.e);
    }

    public float p() {
        return this.e == 0 ? 0.0f : ((float)this.l) / ((float)this.e);
    }

    public float q() {
        return this.e == 0 ? 0.0f : ((float)this.k) / ((float)this.e);
    }

    public long r() {
        return this.e == 0 ? 0x8000000000000001L : this.P() / ((long)this.e);
    }

    public long s() {
        return this.e == 0 ? 0x8000000000000001L : this.Q() / ((long)this.e);
    }

    public long t() {
        return this.e == 0 ? 0x8000000000000001L : this.R() / ((long)this.e);
    }

    public float u() {
        return this.e == 0 ? 0.0f : ((float)this.n) / ((float)this.e);
    }

    public long v() {
        return this.e == 0 ? 0x8000000000000001L : this.S() / ((long)this.e);
    }

    public float w() {
        return this.e == 0 ? 0.0f : ((float)this.m) / ((float)this.e);
    }

    public long x() {
        return this.e == 0 ? 0x8000000000000001L : this.T() / ((long)this.e);
    }

    public long y() {
        return this.n == 0 ? 0x8000000000000001L : (this.J(6) + this.J(7)) / ((long)this.n);
    }

    public long z() {
        return this.m == 0 ? 0x8000000000000001L : this.T() / ((long)this.m);
    }
}

