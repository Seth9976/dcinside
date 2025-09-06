package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

final class Sniffer {
    private final ParsableByteArray a;
    private int b;
    private static final int c = 0x400;
    private static final int d = 0x1A45DFA3;

    public Sniffer() {
        this.a = new ParsableByteArray(8);
    }

    private long a(ExtractorInput extractorInput0) throws IOException {
        int v = 0;
        extractorInput0.k(this.a.e(), 0, 1);
        int v1 = this.a.e()[0] & 0xFF;
        if(v1 == 0) {
            return 0x8000000000000000L;
        }
        int v2 = 0x80;
        int v3;
        for(v3 = 0; (v1 & v2) == 0; ++v3) {
            v2 >>= 1;
        }
        int v4 = v1 & ~v2;
        extractorInput0.k(this.a.e(), 1, v3);
        while(v < v3) {
            ++v;
            v4 = (this.a.e()[v] & 0xFF) + (v4 << 8);
        }
        this.b += v3 + 1;
        return (long)v4;
    }

    public boolean b(ExtractorInput extractorInput0) throws IOException {
        long v8;
        int v7;
        long v = extractorInput0.getLength();
        long v1 = 0x400L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x400L) {
            v1 = v;
        }
        extractorInput0.k(this.a.e(), 0, 4);
        long v3 = this.a.N();
        this.b = 4;
        while(v3 != 0x1A45DFA3L) {
            int v4 = this.b + 1;
            this.b = v4;
            if(v4 == ((int)v1)) {
                return false;
            }
            extractorInput0.k(this.a.e(), 0, 1);
            v3 = v3 << 8 & 0xFFFFFFFFFFFFFF00L | ((long)(this.a.e()[0] & 0xFF));
        }
        long v5 = this.a(extractorInput0);
        long v6 = (long)this.b;
        if(v5 != 0x8000000000000000L && (v2 == 0 || v6 + v5 < v)) {
            while(true) {
                v7 = this.b;
                v8 = v6 + v5;
                if(((long)v7) >= v8) {
                    break;
                }
                if(this.a(extractorInput0) == 0x8000000000000000L) {
                    return false;
                }
                long v9 = this.a(extractorInput0);
                int v10 = Long.compare(v9, 0L);
                if(v10 >= 0 && v9 <= 0x7FFFFFFFL) {
                    if(v10 == 0) {
                        continue;
                    }
                    extractorInput0.q(((int)v9));
                    this.b += (int)v9;
                    continue;
                }
                return false;
            }
            return ((long)v7) == v8;
        }
        return false;
    }
}

