package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;
import java.io.IOException;

final class TsDurationReader {
    private final int a;
    private final TimestampAdjuster b;
    private final ParsableByteArray c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;
    private long h;
    private long i;
    private static final String j = "TsDurationReader";

    TsDurationReader(int v) {
        this.a = v;
        this.b = new TimestampAdjuster(0L);
        this.g = 0x8000000000000001L;
        this.h = 0x8000000000000001L;
        this.i = 0x8000000000000001L;
        this.c = new ParsableByteArray();
    }

    private int a(ExtractorInput extractorInput0) {
        this.c.V(Util.f);
        this.d = true;
        extractorInput0.o();
        return 0;
    }

    public long b() {
        return this.i;
    }

    public TimestampAdjuster c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0, int v) throws IOException {
        if(v <= 0) {
            return this.a(extractorInput0);
        }
        if(!this.f) {
            return this.h(extractorInput0, positionHolder0, v);
        }
        if(this.h == 0x8000000000000001L) {
            return this.a(extractorInput0);
        }
        if(!this.e) {
            return this.f(extractorInput0, positionHolder0, v);
        }
        long v1 = this.g;
        if(v1 == 0x8000000000000001L) {
            return this.a(extractorInput0);
        }
        long v2 = this.b.b(v1);
        this.i = this.b.c(this.h) - v2;
        return this.a(extractorInput0);
    }

    private int f(ExtractorInput extractorInput0, PositionHolder positionHolder0, int v) throws IOException {
        long v1 = extractorInput0.getLength();
        int v2 = (int)Math.min(this.a, v1);
        if(extractorInput0.getPosition() != 0L) {
            positionHolder0.a = 0L;
            return 1;
        }
        this.c.U(v2);
        extractorInput0.o();
        extractorInput0.k(this.c.e(), 0, v2);
        this.g = this.g(this.c, v);
        this.e = true;
        return 0;
    }

    private long g(ParsableByteArray parsableByteArray0, int v) {
        int v1 = parsableByteArray0.f();
        int v2 = parsableByteArray0.g();
        while(v1 < v2) {
            if(parsableByteArray0.e()[v1] == 71) {
                long v3 = TsUtil.c(parsableByteArray0, v1, v);
                if(v3 != 0x8000000000000001L) {
                    return v3;
                }
            }
            ++v1;
        }
        return 0x8000000000000001L;
    }

    private int h(ExtractorInput extractorInput0, PositionHolder positionHolder0, int v) throws IOException {
        long v1 = extractorInput0.getLength();
        int v2 = (int)Math.min(this.a, v1);
        long v3 = v1 - ((long)v2);
        if(extractorInput0.getPosition() != v3) {
            positionHolder0.a = v3;
            return 1;
        }
        this.c.U(v2);
        extractorInput0.o();
        extractorInput0.k(this.c.e(), 0, v2);
        this.h = this.i(this.c, v);
        this.f = true;
        return 0;
    }

    private long i(ParsableByteArray parsableByteArray0, int v) {
        int v1 = parsableByteArray0.f();
        int v2 = parsableByteArray0.g();
        for(int v3 = v2 - 0xBC; v3 >= v1; --v3) {
            if(TsUtil.b(parsableByteArray0.e(), v1, v2, v3)) {
                long v4 = TsUtil.c(parsableByteArray0, v3, v);
                if(v4 != 0x8000000000000001L) {
                    return v4;
                }
            }
        }
        return 0x8000000000000001L;
    }
}

