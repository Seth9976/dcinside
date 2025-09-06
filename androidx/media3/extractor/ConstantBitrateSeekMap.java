package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class ConstantBitrateSeekMap implements SeekMap {
    private final long d;
    private final long e;
    private final int f;
    private final long g;
    private final int h;
    private final long i;
    private final boolean j;

    public ConstantBitrateSeekMap(long v, long v1, int v2, int v3) {
        this(v, v1, v2, v3, false);
    }

    public ConstantBitrateSeekMap(long v, long v1, int v2, int v3, boolean z) {
        this.d = v;
        this.e = v1;
        if(v3 == -1) {
            v3 = 1;
        }
        this.f = v3;
        this.h = v2;
        this.j = z;
        if(v == -1L) {
            this.g = -1L;
            this.i = 0x8000000000000001L;
            return;
        }
        this.g = v - v1;
        this.i = ConstantBitrateSeekMap.d(v, v1, v2);
    }

    private long a(long v) {
        int v1 = this.f;
        long v2 = v * ((long)this.h) / 8000000L / ((long)v1) * ((long)v1);
        long v3 = this.g;
        if(v3 != -1L) {
            v2 = Math.min(v2, v3 - ((long)v1));
        }
        return this.e + Math.max(v2, 0L);
    }

    public long c(long v) {
        return ConstantBitrateSeekMap.d(v, this.e, this.h);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.i;
    }

    private static long d(long v, long v1, int v2) {
        return Math.max(0L, v - v1) * 8000000L / ((long)v2);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        if(this.g == -1L && !this.j) {
            return new SeekPoints(new SeekPoint(0L, this.e));
        }
        long v1 = this.a(v);
        long v2 = this.c(v1);
        SeekPoint seekPoint0 = new SeekPoint(v2, v1);
        if(this.g != -1L && v2 < v) {
            int v3 = this.f;
            if(((long)v3) + v1 < this.d) {
                long v4 = v1 + ((long)v3);
                return new SeekPoints(seekPoint0, new SeekPoint(this.c(v4), v4));
            }
        }
        return new SeekPoints(seekPoint0);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return this.g != -1L || this.j;
    }
}

