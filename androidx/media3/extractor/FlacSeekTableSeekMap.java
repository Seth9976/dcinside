package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class FlacSeekTableSeekMap implements SeekMap {
    private final FlacStreamMetadata d;
    private final long e;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata0, long v) {
        this.d = flacStreamMetadata0;
        this.e = v;
    }

    private SeekPoint a(long v, long v1) {
        return new SeekPoint(v * 1000000L / ((long)this.d.e), this.e + v1);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.d.h();
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        Assertions.k(this.d.k);
        long[] arr_v = this.d.k.a;
        long[] arr_v1 = this.d.k.b;
        int v1 = Util.n(arr_v, this.d.l(v), true, false);
        long v2 = 0L;
        long v3 = v1 == -1 ? 0L : arr_v[v1];
        if(v1 != -1) {
            v2 = arr_v1[v1];
        }
        SeekPoint seekPoint0 = this.a(v3, v2);
        return seekPoint0.a == v || v1 == arr_v.length - 1 ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, this.a(arr_v[v1 + 1], arr_v1[v1 + 1]));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }
}

