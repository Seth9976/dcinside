package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil.Header;

final class XingFrame {
    public final Header a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    @Nullable
    public final long[] f;

    private XingFrame(Header mpegAudioUtil$Header0, long v, long v1, @Nullable long[] arr_v, int v2, int v3) {
        this.a = new Header(mpegAudioUtil$Header0);
        this.b = v;
        this.c = v1;
        this.f = arr_v;
        this.d = v2;
        this.e = v3;
    }

    public long a() {
        return this.b == -1L || this.b == 0L ? 0x8000000000000001L : Util.Y1(this.b * ((long)this.a.g) - 1L, this.a.d);
    }

    public static XingFrame b(Header mpegAudioUtil$Header0, ParsableByteArray parsableByteArray0) {
        long[] arr_v1;
        int v = parsableByteArray0.s();
        int v1 = (v & 1) == 0 ? -1 : parsableByteArray0.P();
        long v2 = (v & 2) == 0 ? -1L : parsableByteArray0.N();
        if((v & 4) == 4) {
            long[] arr_v = new long[100];
            for(int v3 = 0; v3 < 100; ++v3) {
                arr_v[v3] = (long)parsableByteArray0.L();
            }
            arr_v1 = arr_v;
        }
        else {
            arr_v1 = null;
        }
        if((v & 8) != 0) {
            parsableByteArray0.Z(4);
        }
        if(parsableByteArray0.a() >= 24) {
            parsableByteArray0.Z(21);
            int v4 = parsableByteArray0.O();
            return new XingFrame(mpegAudioUtil$Header0, ((long)v1), v2, arr_v1, (0xFFF000 & v4) >> 12, v4 & 0xFFF);
        }
        return new XingFrame(mpegAudioUtil$Header0, ((long)v1), v2, arr_v1, -1, -1);
    }
}

