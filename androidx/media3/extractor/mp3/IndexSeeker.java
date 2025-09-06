package androidx.media3.extractor.mp3;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekPoint;
import java.math.RoundingMode;

final class IndexSeeker implements Seeker {
    private final long d;
    private final LongArray e;
    private final LongArray f;
    private final int g;
    private long h;
    @VisibleForTesting
    static final long i = 100000L;

    public IndexSeeker(long v, long v1, long v2) {
        this.h = v;
        this.d = v2;
        LongArray longArray0 = new LongArray();
        this.e = longArray0;
        LongArray longArray1 = new LongArray();
        this.f = longArray1;
        longArray0.a(0L);
        longArray1.a(v1);
        int v3 = 0x80000001;
        if(v != 0x8000000000000001L) {
            long v4 = Util.c2(v1 - v2, 8L, v, RoundingMode.HALF_UP);
            if(v4 > 0L && v4 <= 0x7FFFFFFFL) {
                v3 = (int)v4;
            }
            this.g = v3;
            return;
        }
        this.g = 0x80000001;
    }

    public boolean a(long v) {
        return v - this.e.b(this.e.c() - 1) < 100000L;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long b(long v) {
        int v1 = Util.k(this.f, v, true, true);
        return this.e.b(v1);
    }

    public void c(long v, long v1) {
        if(this.a(v)) {
            return;
        }
        this.e.a(v);
        this.f.a(v1);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.h;
    }

    void d(long v) {
        this.h = v;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        int v1 = Util.k(this.e, v, true, true);
        SeekPoint seekPoint0 = new SeekPoint(this.e.b(v1), this.f.b(v1));
        return seekPoint0.a == v || v1 == this.e.c() - 1 ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(this.e.b(v1 + 1), this.f.b(v1 + 1)));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long f() {
        return this.d;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public int i() {
        return this.g;
    }
}

