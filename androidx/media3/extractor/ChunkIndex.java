package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.Arrays;

@UnstableApi
public final class ChunkIndex implements SeekMap {
    public final int d;
    public final int[] e;
    public final long[] f;
    public final long[] g;
    public final long[] h;
    private final long i;

    public ChunkIndex(int[] arr_v, long[] arr_v1, long[] arr_v2, long[] arr_v3) {
        this.e = arr_v;
        this.f = arr_v1;
        this.g = arr_v2;
        this.h = arr_v3;
        this.d = arr_v.length;
        if(arr_v.length > 0) {
            this.i = arr_v2[arr_v.length - 1] + arr_v3[arr_v.length - 1];
            return;
        }
        this.i = 0L;
    }

    public int a(long v) {
        return Util.n(this.h, v, true, true);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.i;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        int v1 = this.a(v);
        SeekPoint seekPoint0 = new SeekPoint(this.h[v1], this.f[v1]);
        return seekPoint0.a >= v || v1 == this.d - 1 ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(this.h[v1 + 1], this.f[v1 + 1]));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }

    @Override
    public String toString() {
        return "ChunkIndex(length=" + this.d + ", sizes=" + Arrays.toString(this.e) + ", offsets=" + Arrays.toString(this.f) + ", timeUs=" + Arrays.toString(this.h) + ", durationsUs=" + Arrays.toString(this.g) + ")";
    }
}

