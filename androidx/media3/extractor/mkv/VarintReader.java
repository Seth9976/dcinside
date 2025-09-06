package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

final class VarintReader {
    private final byte[] a;
    private int b;
    private int c;
    private static final int d = 0;
    private static final int e = 1;
    private static final long[] f;

    static {
        VarintReader.f = new long[]{0x80L, 0x40L, 0x20L, 16L, 8L, 4L, 2L, 1L};
    }

    public VarintReader() {
        this.a = new byte[8];
    }

    public static long a(byte[] arr_b, int v, boolean z) {
        long v1 = ((long)arr_b[0]) & 0xFFL;
        if(z) {
            v1 &= ~VarintReader.f[v - 1];
        }
        for(int v2 = 1; v2 < v; ++v2) {
            v1 = v1 << 8 | ((long)arr_b[v2]) & 0xFFL;
        }
        return v1;
    }

    public int b() {
        return this.c;
    }

    public static int c(int v) {
        for(int v1 = 0; true; ++v1) {
            long[] arr_v = VarintReader.f;
            if(v1 >= arr_v.length) {
                break;
            }
            if((arr_v[v1] & ((long)v)) != 0L) {
                return v1 + 1;
            }
        }
        return -1;
    }

    public long d(ExtractorInput extractorInput0, boolean z, boolean z1, int v) throws IOException {
        if(this.b == 0) {
            if(!extractorInput0.e(this.a, 0, 1, z)) {
                return -1L;
            }
            int v1 = VarintReader.c(this.a[0] & 0xFF);
            this.c = v1;
            if(v1 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int v2 = this.c;
        if(v2 > v) {
            this.b = 0;
            return -2L;
        }
        if(v2 != 1) {
            extractorInput0.readFully(this.a, 1, v2 - 1);
        }
        this.b = 0;
        return VarintReader.a(this.a, this.c, z1);
    }

    public void e() {
        this.b = 0;
        this.c = 0;
    }
}

