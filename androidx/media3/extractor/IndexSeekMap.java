package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class IndexSeekMap implements SeekMap {
    private final long[] d;
    private final long[] e;
    private final long f;
    private final boolean g;

    public IndexSeekMap(long[] arr_v, long[] arr_v1, long v) {
        Assertions.a(arr_v.length == arr_v1.length);
        this.g = arr_v1.length > 0;
        if(arr_v1.length <= 0 || arr_v1[0] <= 0L) {
            this.d = arr_v;
            this.e = arr_v1;
        }
        else {
            long[] arr_v2 = new long[arr_v1.length + 1];
            this.d = arr_v2;
            long[] arr_v3 = new long[arr_v1.length + 1];
            this.e = arr_v3;
            System.arraycopy(arr_v, 0, arr_v2, 1, arr_v1.length);
            System.arraycopy(arr_v1, 0, arr_v3, 1, arr_v1.length);
        }
        this.f = v;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.f;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        if(!this.g) {
            return new SeekPoints(SeekPoint.c);
        }
        int v1 = Util.n(this.e, v, true, true);
        SeekPoint seekPoint0 = new SeekPoint(this.e[v1], this.d[v1]);
        return seekPoint0.a == v || v1 == this.e.length - 1 ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(this.e[v1 + 1], this.d[v1 + 1]));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return this.g;
    }
}

