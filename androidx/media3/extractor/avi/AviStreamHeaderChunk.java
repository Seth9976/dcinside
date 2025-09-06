package androidx.media3.extractor.avi;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;

final class AviStreamHeaderChunk implements AviChunk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private static final String g = "AviStreamHeaderChunk";

    private AviStreamHeaderChunk(int v, int v1, int v2, int v3, int v4, int v5) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
    }

    public long a() {
        return Util.Z1(this.e, ((long)this.c) * 1000000L, this.d);
    }

    public float b() {
        return ((float)this.d) / ((float)this.c);
    }

    public int c() {
        switch(this.a) {
            case 1935960438: {
                return 2;
            }
            case 0x73647561: {
                return 1;
            }
            case 1937012852: {
                return 3;
            }
            default: {
                Log.n("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.a));
                return -1;
            }
        }
    }

    public static AviStreamHeaderChunk d(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.w();
        parsableByteArray0.Z(12);
        int v1 = parsableByteArray0.w();
        int v2 = parsableByteArray0.w();
        int v3 = parsableByteArray0.w();
        parsableByteArray0.Z(4);
        int v4 = parsableByteArray0.w();
        int v5 = parsableByteArray0.w();
        parsableByteArray0.Z(8);
        return new AviStreamHeaderChunk(v, v1, v2, v3, v4, v5);
    }

    @Override  // androidx.media3.extractor.avi.AviChunk
    public int getType() {
        return 0x68727473;
    }
}

