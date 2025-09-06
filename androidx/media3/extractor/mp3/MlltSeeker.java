package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.metadata.id3.MlltFrame;

final class MlltSeeker implements Seeker {
    private final long[] d;
    private final long[] e;
    private final long f;

    private MlltSeeker(long[] arr_v, long[] arr_v1, long v) {
        this.d = arr_v;
        this.e = arr_v1;
        if(v == 0x8000000000000001L) {
            v = Util.F1(arr_v1[arr_v1.length - 1]);
        }
        this.f = v;
    }

    public static MlltSeeker a(long v, MlltFrame mlltFrame0, long v1) {
        int v2 = mlltFrame0.e.length + 1;
        long[] arr_v = new long[v2];
        long[] arr_v1 = new long[v2];
        arr_v[0] = v;
        long v3 = 0L;
        arr_v1[0] = 0L;
        for(int v4 = 1; v4 <= mlltFrame0.e.length; ++v4) {
            v += (long)(mlltFrame0.c + mlltFrame0.e[v4 - 1]);
            v3 += (long)(mlltFrame0.d + mlltFrame0.f[v4 - 1]);
            arr_v[v4] = v;
            arr_v1[v4] = v3;
        }
        return new MlltSeeker(arr_v, arr_v1, v1);
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long b(long v) {
        return Util.F1(((long)(((Long)MlltSeeker.c(v, this.d, this.e).second))));
    }

    private static Pair c(long v, long[] arr_v, long[] arr_v1) {
        int v1 = Util.n(arr_v, v, true, true);
        long v2 = arr_v[v1];
        long v3 = arr_v1[v1];
        if(v1 + 1 == arr_v.length) {
            return Pair.create(v2, v3);
        }
        long v4 = arr_v[v1 + 1];
        long v5 = arr_v1[v1 + 1];
        return v4 == v2 ? Pair.create(v, ((long)(((long)(0.0 * ((double)(v5 - v3)))) + v3))) : Pair.create(v, ((long)(((long)((((double)v) - ((double)v2)) / ((double)(v4 - v2)) * ((double)(v5 - v3)))) + v3)));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.f;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        Pair pair0 = MlltSeeker.c(Util.B2(Util.x(v, 0L, this.f)), this.e, this.d);
        return new SeekPoints(new SeekPoint(Util.F1(((long)(((Long)pair0.first)))), ((long)(((Long)pair0.second)))));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long f() {
        return -1L;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public int i() {
        return 0x80000001;
    }
}

