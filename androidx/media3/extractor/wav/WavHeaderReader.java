package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import java.io.IOException;

final class WavHeaderReader {
    static final class ChunkHeader {
        public final int a;
        public final long b;
        public static final int c = 8;

        private ChunkHeader(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        public static ChunkHeader a(ExtractorInput extractorInput0, ParsableByteArray parsableByteArray0) throws IOException {
            extractorInput0.k(parsableByteArray0.e(), 0, 8);
            parsableByteArray0.Y(0);
            return new ChunkHeader(parsableByteArray0.s(), parsableByteArray0.A());
        }
    }

    private static final String a = "WavHeaderReader";

    public static boolean a(ExtractorInput extractorInput0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(8);
        switch(ChunkHeader.a(extractorInput0, parsableByteArray0).a) {
            case 1380333108: 
            case 1380533830: {
                extractorInput0.k(parsableByteArray0.e(), 0, 4);
                parsableByteArray0.Y(0);
                int v = parsableByteArray0.s();
                if(v != 0x57415645) {
                    Log.d("WavHeaderReader", "Unsupported form type: " + v);
                    return false;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static WavFormat b(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b1;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(16);
        ChunkHeader wavHeaderReader$ChunkHeader0 = WavHeaderReader.d(0x666D7420, extractorInput0, parsableByteArray0);
        Assertions.i(wavHeaderReader$ChunkHeader0.b >= 16L);
        extractorInput0.k(parsableByteArray0.e(), 0, 16);
        parsableByteArray0.Y(0);
        int v = parsableByteArray0.D();
        int v1 = parsableByteArray0.D();
        int v2 = parsableByteArray0.C();
        int v3 = parsableByteArray0.C();
        int v4 = parsableByteArray0.D();
        int v5 = parsableByteArray0.D();
        int v6 = ((int)wavHeaderReader$ChunkHeader0.b) - 16;
        if(v6 > 0) {
            byte[] arr_b = new byte[v6];
            extractorInput0.k(arr_b, 0, v6);
            arr_b1 = arr_b;
        }
        else {
            arr_b1 = Util.f;
        }
        extractorInput0.r(((int)(extractorInput0.p() - extractorInput0.getPosition())));
        return new WavFormat(v, v1, v2, v3, v4, v5, arr_b1);
    }

    public static long c(ExtractorInput extractorInput0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(8);
        ChunkHeader wavHeaderReader$ChunkHeader0 = ChunkHeader.a(extractorInput0, parsableByteArray0);
        if(wavHeaderReader$ChunkHeader0.a != 0x64733634) {
            extractorInput0.o();
            return -1L;
        }
        extractorInput0.q(8);
        parsableByteArray0.Y(0);
        extractorInput0.k(parsableByteArray0.e(), 0, 8);
        long v = parsableByteArray0.y();
        extractorInput0.r(((int)wavHeaderReader$ChunkHeader0.b) + 8);
        return v;
    }

    private static ChunkHeader d(int v, ExtractorInput extractorInput0, ParsableByteArray parsableByteArray0) throws IOException {
        ChunkHeader wavHeaderReader$ChunkHeader0;
        for(wavHeaderReader$ChunkHeader0 = ChunkHeader.a(extractorInput0, parsableByteArray0); wavHeaderReader$ChunkHeader0.a != v; wavHeaderReader$ChunkHeader0 = ChunkHeader.a(extractorInput0, parsableByteArray0)) {
            Log.n("WavHeaderReader", "Ignoring unknown WAV chunk: " + wavHeaderReader$ChunkHeader0.a);
            long v1 = wavHeaderReader$ChunkHeader0.b % 2L == 0L ? wavHeaderReader$ChunkHeader0.b + 8L : wavHeaderReader$ChunkHeader0.b + 9L;
            if(v1 > 0x7FFFFFFFL) {
                throw ParserException.e(("Chunk is too large (~2GB+) to skip; id: " + wavHeaderReader$ChunkHeader0.a));
            }
            extractorInput0.r(((int)v1));
        }
        return wavHeaderReader$ChunkHeader0;
    }

    public static Pair e(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.o();
        ChunkHeader wavHeaderReader$ChunkHeader0 = WavHeaderReader.d(1684108385, extractorInput0, new ParsableByteArray(8));
        extractorInput0.r(8);
        return Pair.create(extractorInput0.getPosition(), wavHeaderReader$ChunkHeader0.b);
    }
}

