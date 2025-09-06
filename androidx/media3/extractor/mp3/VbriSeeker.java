package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil.Header;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekPoint;

final class VbriSeeker implements Seeker {
    private final long[] d;
    private final long[] e;
    private final long f;
    private final long g;
    private final int h;
    private static final String i = "VbriSeeker";

    private VbriSeeker(long[] arr_v, long[] arr_v1, long v, long v1, int v2) {
        this.d = arr_v;
        this.e = arr_v1;
        this.f = v;
        this.g = v1;
        this.h = v2;
    }

    @Nullable
    public static VbriSeeker a(long v, long v1, Header mpegAudioUtil$Header0, ParsableByteArray parsableByteArray0) {
        int v10;
        parsableByteArray0.Z(10);
        int v2 = parsableByteArray0.s();
        if(v2 <= 0) {
            return null;
        }
        long v3 = Util.Z1(v2, ((long)(mpegAudioUtil$Header0.d < 32000 ? 0x240 : 0x480)) * 1000000L, mpegAudioUtil$Header0.d);
        int v4 = parsableByteArray0.R();
        int v5 = parsableByteArray0.R();
        int v6 = parsableByteArray0.R();
        parsableByteArray0.Z(2);
        long v7 = v1 + ((long)mpegAudioUtil$Header0.c);
        long[] arr_v = new long[v4];
        long[] arr_v1 = new long[v4];
        long v9 = v1;
        for(int v8 = 0; v8 < v4; ++v8) {
            arr_v[v8] = ((long)v8) * v3 / ((long)v4);
            arr_v1[v8] = Math.max(v9, v7);
            switch(v6) {
                case 1: {
                    v10 = parsableByteArray0.L();
                    break;
                }
                case 2: {
                    v10 = parsableByteArray0.R();
                    break;
                }
                case 3: {
                    v10 = parsableByteArray0.O();
                    break;
                }
                case 4: {
                    v10 = parsableByteArray0.P();
                    break;
                }
                default: {
                    return null;
                }
            }
            v9 += ((long)v10) * ((long)v5);
        }
        if(v != -1L && v != v9) {
            Log.n("VbriSeeker", "VBRI data size mismatch: " + v + ", " + v9);
        }
        return new VbriSeeker(arr_v, arr_v1, v3, v9, mpegAudioUtil$Header0.f);
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long b(long v) {
        return this.d[Util.n(this.e, v, true, true)];
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.f;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        int v1 = Util.n(this.d, v, true, true);
        SeekPoint seekPoint0 = new SeekPoint(this.d[v1], this.e[v1]);
        return seekPoint0.a >= v || v1 == this.d.length - 1 ? new SeekPoints(seekPoint0) : new SeekPoints(seekPoint0, new SeekPoint(this.d[v1 + 1], this.e[v1 + 1]));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public long f() {
        return this.g;
    }

    @Override  // androidx.media3.extractor.mp3.Seeker
    public int i() {
        return this.h;
    }
}

