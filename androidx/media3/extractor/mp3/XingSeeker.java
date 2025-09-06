package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekPoint;

final class XingSeeker implements Seeker {
    private final long d;
    private final int e;
    private final long f;
    private final int g;
    private final long h;
    private final long i;
    @Nullable
    private final long[] j;
    private static final String k = "XingSeeker";

    private XingSeeker(long v, int v1, long v2, int v3) {
        this(v, v1, v2, v3, -1L, null);
    }

    private XingSeeker(long v, int v1, long v2, int v3, long v4, @Nullable long[] arr_v) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = v4;
        this.j = arr_v;
        this.i = v4 == -1L ? -1L : v + v4;
    }

    @Nullable
    public static XingSeeker a(XingFrame xingFrame0, long v) {
        long v1 = xingFrame0.a();
        if(v1 == 0x8000000000000001L) {
            return null;
        }
        long v2 = xingFrame0.c;
        if(v2 != -1L) {
            return xingFrame0.f == null ? new XingSeeker(v, xingFrame0.a.c, v1, xingFrame0.a.f) : new XingSeeker(v, xingFrame0.a.c, v1, xingFrame0.a.f, v2, xingFrame0.f);
        }
        return new XingSeeker(v, xingFrame0.a.c, v1, xingFrame0.a.f);
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long b(long v) {
        long v1 = v - this.d;
        if(this.e1() && v1 > ((long)this.e)) {
            long[] arr_v = (long[])Assertions.k(this.j);
            double f = ((double)v1) * 256.0 / ((double)this.h);
            int v2 = Util.n(arr_v, ((long)f), true, true);
            long v3 = this.c(v2);
            long v4 = arr_v[v2];
            long v5 = this.c(v2 + 1);
            long v6 = v2 == 99 ? 0x100L : arr_v[v2 + 1];
            return v4 == v6 ? v3 + Math.round(0.0 * ((double)(v5 - v3))) : v3 + Math.round((f - ((double)v4)) / ((double)(v6 - v4)) * ((double)(v5 - v3)));
        }
        return 0L;
    }

    private long c(int v) {
        return this.f * ((long)v) / 100L;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.f;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        if(!this.e1()) {
            return new SeekPoints(new SeekPoint(0L, this.d + ((long)this.e)));
        }
        long v1 = Util.x(v, 0L, this.f);
        double f = ((double)v1) * 100.0 / ((double)this.f);
        double f1 = 0.0;
        if(f > 0.0) {
            if(f >= 100.0) {
                return new SeekPoints(new SeekPoint(v1, this.d + Util.x(Math.round(1.0 * ((double)this.h)), this.e, this.h - 1L)));
            }
            long[] arr_v = (long[])Assertions.k(this.j);
            double f2 = (double)arr_v[((int)f)];
            f1 = f2 + (f - ((double)(((int)f)))) * ((((int)f) == 99 ? 256.0 : ((double)arr_v[((int)f) + 1])) - f2);
        }
        return new SeekPoints(new SeekPoint(v1, this.d + Util.x(Math.round(f1 / 256.0 * ((double)this.h)), this.e, this.h - 1L)));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return this.j != null;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long f() {
        return this.i;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public int i() {
        return this.g;
    }
}

