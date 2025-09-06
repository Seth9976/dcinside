package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata.SeekTable;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;
import h4.e;
import java.util.Arrays;

final class FlacReader extends StreamReader {
    static final class FlacOggSeeker implements OggSeeker {
        private FlacStreamMetadata a;
        private SeekTable b;
        private long c;
        private long d;

        public FlacOggSeeker(FlacStreamMetadata flacStreamMetadata0, SeekTable flacStreamMetadata$SeekTable0) {
            this.a = flacStreamMetadata0;
            this.b = flacStreamMetadata$SeekTable0;
            this.c = -1L;
            this.d = -1L;
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public long a(ExtractorInput extractorInput0) {
            long v = this.d;
            if(v >= 0L) {
                this.d = -1L;
                return -(v + 2L);
            }
            return -1L;
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public SeekMap b() {
            Assertions.i(this.c != -1L);
            return new FlacSeekTableSeekMap(this.a, this.c);
        }

        @Override  // androidx.media3.extractor.ogg.OggSeeker
        public void c(long v) {
            long[] arr_v = this.b.a;
            this.d = arr_v[Util.n(arr_v, v, true, true)];
        }

        public void d(long v) {
            this.c = v;
        }
    }

    @Nullable
    private FlacStreamMetadata r;
    @Nullable
    private FlacOggSeeker s;
    private static final byte t = -1;
    private static final int u = 4;

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected long f(ParsableByteArray parsableByteArray0) {
        return FlacReader.o(parsableByteArray0.e()) ? ((long)this.n(parsableByteArray0)) : -1L;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    @e(expression = {"#3.format"}, result = false)
    protected boolean h(ParsableByteArray parsableByteArray0, long v, SetupData streamReader$SetupData0) {
        byte[] arr_b = parsableByteArray0.e();
        FlacStreamMetadata flacStreamMetadata0 = this.r;
        if(flacStreamMetadata0 == null) {
            FlacStreamMetadata flacStreamMetadata1 = new FlacStreamMetadata(arr_b, 17);
            this.r = flacStreamMetadata1;
            streamReader$SetupData0.a = flacStreamMetadata1.i(Arrays.copyOfRange(arr_b, 9, parsableByteArray0.g()), null);
            return true;
        }
        if((arr_b[0] & 0x7F) == 3) {
            SeekTable flacStreamMetadata$SeekTable0 = FlacMetadataReader.f(parsableByteArray0);
            FlacStreamMetadata flacStreamMetadata2 = flacStreamMetadata0.c(flacStreamMetadata$SeekTable0);
            this.r = flacStreamMetadata2;
            this.s = new FlacOggSeeker(flacStreamMetadata2, flacStreamMetadata$SeekTable0);
            return true;
        }
        if(FlacReader.o(arr_b)) {
            FlacOggSeeker flacReader$FlacOggSeeker0 = this.s;
            if(flacReader$FlacOggSeeker0 != null) {
                flacReader$FlacOggSeeker0.d(v);
                streamReader$SetupData0.b = this.s;
            }
            Assertions.g(streamReader$SetupData0.a);
            return false;
        }
        return true;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected void l(boolean z) {
        super.l(z);
        if(z) {
            this.r = null;
            this.s = null;
        }
    }

    private int n(ParsableByteArray parsableByteArray0) {
        int v = (parsableByteArray0.e()[2] & 0xFF) >> 4;
        if(v == 6 || v == 7) {
            parsableByteArray0.Z(4);
            parsableByteArray0.S();
        }
        int v1 = FlacFrameReader.j(parsableByteArray0, v);
        parsableByteArray0.Y(0);
        return v1;
    }

    private static boolean o(byte[] arr_b) {
        return arr_b[0] == -1;
    }

    public static boolean p(ParsableByteArray parsableByteArray0) {
        return parsableByteArray0.a() >= 5 && parsableByteArray0.L() == 0x7F && parsableByteArray0.N() == 1179402563L;
    }
}

