package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;

final class PsDurationReader {
    private final TimestampAdjuster a;
    private final ParsableByteArray b;
    private boolean c;
    private boolean d;
    private boolean e;
    private long f;
    private long g;
    private long h;
    private static final String i = "PsDurationReader";
    private static final int j = 20000;

    PsDurationReader() {
        this.a = new TimestampAdjuster(0L);
        this.f = 0x8000000000000001L;
        this.g = 0x8000000000000001L;
        this.h = 0x8000000000000001L;
        this.b = new ParsableByteArray();
    }

    private static boolean a(byte[] arr_b) {
        if((arr_b[0] & 0xC4) != 68) {
            return false;
        }
        if((arr_b[2] & 4) != 4) {
            return false;
        }
        if((arr_b[4] & 4) != 4) {
            return false;
        }
        return (arr_b[5] & 1) == 1 ? (arr_b[8] & 3) == 3 : false;
    }

    private int b(ExtractorInput extractorInput0) {
        this.b.V(Util.f);
        this.c = true;
        extractorInput0.o();
        return 0;
    }

    public long c() {
        return this.h;
    }

    public TimestampAdjuster d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    private int f(byte[] arr_b, int v) {
        return arr_b[v + 3] & 0xFF | ((arr_b[v] & 0xFF) << 24 | (arr_b[v + 1] & 0xFF) << 16 | (arr_b[v + 2] & 0xFF) << 8);
    }

    public int g(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        if(!this.e) {
            return this.j(extractorInput0, positionHolder0);
        }
        if(this.g == 0x8000000000000001L) {
            return this.b(extractorInput0);
        }
        if(!this.d) {
            return this.h(extractorInput0, positionHolder0);
        }
        long v = this.f;
        if(v == 0x8000000000000001L) {
            return this.b(extractorInput0);
        }
        long v1 = this.a.b(v);
        this.h = this.a.c(this.g) - v1;
        return this.b(extractorInput0);
    }

    private int h(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        int v = (int)Math.min(20000L, extractorInput0.getLength());
        if(extractorInput0.getPosition() != 0L) {
            positionHolder0.a = 0L;
            return 1;
        }
        this.b.U(v);
        extractorInput0.o();
        extractorInput0.k(this.b.e(), 0, v);
        this.f = this.i(this.b);
        this.d = true;
        return 0;
    }

    private long i(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1 - 3) {
            if(this.f(parsableByteArray0.e(), v) == 442) {
                parsableByteArray0.Y(v + 4);
                long v2 = PsDurationReader.l(parsableByteArray0);
                if(v2 != 0x8000000000000001L) {
                    return v2;
                }
            }
            ++v;
        }
        return 0x8000000000000001L;
    }

    private int j(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        long v = extractorInput0.getLength();
        int v1 = (int)Math.min(20000L, v);
        long v2 = v - ((long)v1);
        if(extractorInput0.getPosition() != v2) {
            positionHolder0.a = v2;
            return 1;
        }
        this.b.U(v1);
        extractorInput0.o();
        extractorInput0.k(this.b.e(), 0, v1);
        this.g = this.k(this.b);
        this.e = true;
        return 0;
    }

    private long k(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        for(int v1 = parsableByteArray0.g() - 4; v1 >= v; --v1) {
            if(this.f(parsableByteArray0.e(), v1) == 442) {
                parsableByteArray0.Y(v1 + 4);
                long v2 = PsDurationReader.l(parsableByteArray0);
                if(v2 != 0x8000000000000001L) {
                    return v2;
                }
            }
        }
        return 0x8000000000000001L;
    }

    public static long l(ParsableByteArray parsableByteArray0) {
        int v = parsableByteArray0.f();
        if(parsableByteArray0.a() < 9) {
            return 0x8000000000000001L;
        }
        byte[] arr_b = new byte[9];
        parsableByteArray0.n(arr_b, 0, 9);
        parsableByteArray0.Y(v);
        return PsDurationReader.a(arr_b) ? PsDurationReader.m(arr_b) : 0x8000000000000001L;
    }

    private static long m(byte[] arr_b) {
        return (((long)arr_b[0]) & 56L) >> 3 << 30 | (((long)arr_b[0]) & 3L) << 28 | (((long)arr_b[1]) & 0xFFL) << 20 | (((long)arr_b[2]) & 0xF8L) >> 3 << 15 | (((long)arr_b[2]) & 3L) << 13 | (((long)arr_b[3]) & 0xFFL) << 5 | (((long)arr_b[4]) & 0xF8L) >> 3;
    }
}

