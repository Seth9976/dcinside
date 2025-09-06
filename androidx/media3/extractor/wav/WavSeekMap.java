package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

final class WavSeekMap implements SeekMap {
    private final WavFormat d;
    private final int e;
    private final long f;
    private final long g;
    private final long h;

    public WavSeekMap(WavFormat wavFormat0, int v, long v1, long v2) {
        this.d = wavFormat0;
        this.e = v;
        this.f = v1;
        long v3 = (v2 - v1) / ((long)wavFormat0.e);
        this.g = v3;
        this.h = this.a(v3);
    }

    private long a(long v) {
        return Util.Z1(v * ((long)this.e), 1000000L, this.d.c);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.h;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        long v1 = Util.x(((long)this.d.c) * v / (((long)this.e) * 1000000L), 0L, this.g - 1L);
        long v2 = this.a(v1);
        SeekPoint seekPoint0 = new SeekPoint(v2, this.f + ((long)this.d.e) * v1);
        return v2 >= v || v1 == this.g - 1L ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(this.a(v1 + 1L), this.f + ((long)this.d.e) * (v1 + 1L)));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }
}

