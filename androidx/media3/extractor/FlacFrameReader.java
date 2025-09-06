package androidx.media3.extractor;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.IOException;

@UnstableApi
public final class FlacFrameReader {
    public static final class SampleNumberHolder {
        public long a;

    }

    private static boolean a(ParsableByteArray parsableByteArray0, FlacStreamMetadata flacStreamMetadata0, int v) {
        int v1 = FlacFrameReader.j(parsableByteArray0, v);
        return v1 != -1 && v1 <= flacStreamMetadata0.b;
    }

    private static boolean b(ParsableByteArray parsableByteArray0, int v) {
        return parsableByteArray0.L() == Util.F(parsableByteArray0.e(), v, parsableByteArray0.f() - 1, 0);
    }

    private static boolean c(ParsableByteArray parsableByteArray0, FlacStreamMetadata flacStreamMetadata0, boolean z, SampleNumberHolder flacFrameReader$SampleNumberHolder0) {
        long v;
        try {
            v = parsableByteArray0.S();
        }
        catch(NumberFormatException unused_ex) {
            return false;
        }
        if(!z) {
            v *= (long)flacStreamMetadata0.b;
        }
        flacFrameReader$SampleNumberHolder0.a = v;
        return true;
    }

    // 去混淆评级： 低(35)
    public static boolean d(ParsableByteArray parsableByteArray0, FlacStreamMetadata flacStreamMetadata0, int v, SampleNumberHolder flacFrameReader$SampleNumberHolder0) {
        long v1 = parsableByteArray0.N();
        return v1 >>> 16 == ((long)v) ? FlacFrameReader.g(((int)(15L & v1 >> 4)), flacStreamMetadata0) && FlacFrameReader.f(((int)(v1 >> 1 & 7L)), flacStreamMetadata0) && (v1 & 1L) != 1L && FlacFrameReader.c(parsableByteArray0, flacStreamMetadata0, (v1 >>> 16 & 1L) == 1L, flacFrameReader$SampleNumberHolder0) && FlacFrameReader.a(parsableByteArray0, flacStreamMetadata0, ((int)(v1 >> 12 & 15L))) && FlacFrameReader.e(parsableByteArray0, flacStreamMetadata0, ((int)(v1 >> 8 & 15L))) && FlacFrameReader.b(parsableByteArray0, parsableByteArray0.f()) : false;
    }

    private static boolean e(ParsableByteArray parsableByteArray0, FlacStreamMetadata flacStreamMetadata0, int v) {
        int v1 = flacStreamMetadata0.e;
        if(v == 0) {
            return true;
        }
        if(v <= 11) {
            return v == flacStreamMetadata0.f;
        }
        if(v == 12) {
            return parsableByteArray0.L() * 1000 == v1;
        }
        if(v <= 14) {
            int v2 = parsableByteArray0.R();
            if(v == 14) {
                v2 *= 10;
            }
            return v2 == v1;
        }
        return false;
    }

    private static boolean f(int v, FlacStreamMetadata flacStreamMetadata0) {
        return v == 0 ? true : v == flacStreamMetadata0.i;
    }

    private static boolean g(int v, FlacStreamMetadata flacStreamMetadata0) {
        return v > 7 ? v <= 10 && flacStreamMetadata0.g == 2 : v == flacStreamMetadata0.g - 1;
    }

    public static boolean h(ExtractorInput extractorInput0, FlacStreamMetadata flacStreamMetadata0, int v, SampleNumberHolder flacFrameReader$SampleNumberHolder0) throws IOException {
        long v1 = extractorInput0.p();
        byte[] arr_b = new byte[2];
        extractorInput0.k(arr_b, 0, 2);
        if(((arr_b[0] & 0xFF) << 8 | arr_b[1] & 0xFF) != v) {
            extractorInput0.o();
            extractorInput0.q(((int)(v1 - extractorInput0.getPosition())));
            return false;
        }
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(16);
        System.arraycopy(arr_b, 0, parsableByteArray0.e(), 0, 2);
        parsableByteArray0.X(ExtractorUtil.c(extractorInput0, parsableByteArray0.e(), 2, 14));
        extractorInput0.o();
        extractorInput0.q(((int)(v1 - extractorInput0.getPosition())));
        return FlacFrameReader.d(parsableByteArray0, flacStreamMetadata0, v, flacFrameReader$SampleNumberHolder0);
    }

    public static long i(ExtractorInput extractorInput0, FlacStreamMetadata flacStreamMetadata0) throws IOException {
        extractorInput0.o();
        boolean z = true;
        extractorInput0.q(1);
        byte[] arr_b = new byte[1];
        extractorInput0.k(arr_b, 0, 1);
        if((arr_b[0] & 1) != 1) {
            z = false;
        }
        extractorInput0.q(2);
        ParsableByteArray parsableByteArray0 = new ParsableByteArray((z ? 7 : 6));
        parsableByteArray0.X(ExtractorUtil.c(extractorInput0, parsableByteArray0.e(), 0, (z ? 7 : 6)));
        extractorInput0.o();
        SampleNumberHolder flacFrameReader$SampleNumberHolder0 = new SampleNumberHolder();
        if(!FlacFrameReader.c(parsableByteArray0, flacStreamMetadata0, z, flacFrameReader$SampleNumberHolder0)) {
            throw ParserException.a(null, null);
        }
        return flacFrameReader$SampleNumberHolder0.a;
    }

    public static int j(ParsableByteArray parsableByteArray0, int v) {
        switch(v) {
            case 1: {
                return 0xC0;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 0x240 << v - 2;
            }
            case 6: {
                return parsableByteArray0.L() + 1;
            }
            case 7: {
                return parsableByteArray0.R() + 1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 0x100 << v - 8;
            }
            default: {
                return -1;
            }
        }
    }
}

