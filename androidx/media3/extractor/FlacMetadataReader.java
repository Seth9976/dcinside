package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import com.google.common.collect.O2;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class FlacMetadataReader {
    public static final class FlacStreamMetadataHolder {
        @Nullable
        public FlacStreamMetadata a;

        public FlacStreamMetadataHolder(@Nullable FlacStreamMetadata flacStreamMetadata0) {
            this.a = flacStreamMetadata0;
        }
    }

    private static final int a = 0x664C6143;
    private static final int b = 0x3FFE;
    private static final int c = 18;

    public static boolean a(ExtractorInput extractorInput0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(4);
        extractorInput0.k(parsableByteArray0.e(), 0, 4);
        return parsableByteArray0.N() == 0x664C6143L;
    }

    public static int b(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.o();
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(2);
        extractorInput0.k(parsableByteArray0.e(), 0, 2);
        int v = parsableByteArray0.R();
        if(v >> 2 == 0x3FFE) {
            extractorInput0.o();
            return v;
        }
        extractorInput0.o();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    @Nullable
    public static Metadata c(ExtractorInput extractorInput0, boolean z) throws IOException {
        Metadata metadata0 = new Id3Peeker().a(extractorInput0, (z ? null : Id3Decoder.b));
        return metadata0 == null || metadata0.f() == 0 ? null : metadata0;
    }

    @Nullable
    public static Metadata d(ExtractorInput extractorInput0, boolean z) throws IOException {
        extractorInput0.o();
        long v = extractorInput0.p();
        Metadata metadata0 = FlacMetadataReader.c(extractorInput0, z);
        extractorInput0.r(((int)(extractorInput0.p() - v)));
        return metadata0;
    }

    public static boolean e(ExtractorInput extractorInput0, FlacStreamMetadataHolder flacMetadataReader$FlacStreamMetadataHolder0) throws IOException {
        extractorInput0.o();
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(new byte[4]);
        extractorInput0.k(parsableBitArray0.a, 0, 4);
        boolean z = parsableBitArray0.g();
        int v = parsableBitArray0.h(7);
        int v1 = parsableBitArray0.h(24);
        if(v == 0) {
            flacMetadataReader$FlacStreamMetadataHolder0.a = FlacMetadataReader.h(extractorInput0);
            return z;
        }
        FlacStreamMetadata flacStreamMetadata0 = flacMetadataReader$FlacStreamMetadataHolder0.a;
        if(flacStreamMetadata0 != null) {
            switch(v) {
                case 3: {
                    flacMetadataReader$FlacStreamMetadataHolder0.a = flacStreamMetadata0.c(FlacMetadataReader.g(extractorInput0, v1 + 4));
                    return z;
                }
                case 4: {
                    flacMetadataReader$FlacStreamMetadataHolder0.a = flacStreamMetadata0.d(FlacMetadataReader.j(extractorInput0, v1 + 4));
                    return z;
                }
                case 6: {
                    ParsableByteArray parsableByteArray0 = new ParsableByteArray(v1 + 4);
                    extractorInput0.readFully(parsableByteArray0.e(), 0, v1 + 4);
                    parsableByteArray0.Z(4);
                    flacMetadataReader$FlacStreamMetadataHolder0.a = flacStreamMetadata0.b(O2.B(PictureFrame.a(parsableByteArray0)));
                    return z;
                }
                default: {
                    extractorInput0.r(v1 + 4);
                    return z;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public static SeekTable f(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Z(1);
        int v = parsableByteArray0.O();
        long v1 = ((long)parsableByteArray0.f()) + ((long)v);
        long[] arr_v = new long[v / 18];
        long[] arr_v1 = new long[v / 18];
        for(int v2 = 0; v2 < v / 18; ++v2) {
            long v3 = parsableByteArray0.E();
            if(v3 == -1L) {
                arr_v = Arrays.copyOf(arr_v, v2);
                arr_v1 = Arrays.copyOf(arr_v1, v2);
                break;
            }
            arr_v[v2] = v3;
            arr_v1[v2] = parsableByteArray0.E();
            parsableByteArray0.Z(2);
        }
        parsableByteArray0.Z(((int)(v1 - ((long)parsableByteArray0.f()))));
        return new SeekTable(arr_v, arr_v1);
    }

    private static SeekTable g(ExtractorInput extractorInput0, int v) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(v);
        extractorInput0.readFully(parsableByteArray0.e(), 0, v);
        return FlacMetadataReader.f(parsableByteArray0);
    }

    private static FlacStreamMetadata h(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = new byte[38];
        extractorInput0.readFully(arr_b, 0, 38);
        return new FlacStreamMetadata(arr_b, 4);
    }

    public static void i(ExtractorInput extractorInput0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(4);
        extractorInput0.readFully(parsableByteArray0.e(), 0, 4);
        if(parsableByteArray0.N() != 0x664C6143L) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(ExtractorInput extractorInput0, int v) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(v);
        extractorInput0.readFully(parsableByteArray0.e(), 0, v);
        parsableByteArray0.Z(4);
        return Arrays.asList(VorbisUtil.k(parsableByteArray0, false, false).b);
    }
}

