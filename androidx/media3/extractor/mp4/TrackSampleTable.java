package androidx.media3.extractor.mp4;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

final class TrackSampleTable {
    public final Track a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public TrackSampleTable(Track track0, long[] arr_v, int[] arr_v1, int v, long[] arr_v2, int[] arr_v3, long v1) {
        boolean z = false;
        Assertions.a(arr_v1.length == arr_v2.length);
        Assertions.a(arr_v.length == arr_v2.length);
        if(arr_v3.length == arr_v2.length) {
            z = true;
        }
        Assertions.a(z);
        this.a = track0;
        this.c = arr_v;
        this.d = arr_v1;
        this.e = v;
        this.f = arr_v2;
        this.g = arr_v3;
        this.h = v1;
        this.b = arr_v.length;
        if(arr_v3.length > 0) {
            arr_v3[arr_v3.length - 1] |= 0x20000000;
        }
    }

    public int a(long v) {
        for(int v1 = Util.n(this.f, v, true, false); v1 >= 0; --v1) {
            if((this.g[v1] & 1) != 0) {
                return v1;
            }
        }
        return -1;
    }

    public int b(long v) {
        for(int v1 = Util.j(this.f, v, true, false); v1 < this.f.length; ++v1) {
            if((this.g[v1] & 1) != 0) {
                return v1;
            }
        }
        return -1;
    }
}

