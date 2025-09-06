package androidx.media3.extractor.ogg;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.O2;
import h4.e;
import java.util.Arrays;
import java.util.List;

final class OpusReader extends StreamReader {
    private boolean r;
    private static final byte[] s;
    private static final byte[] t;

    static {
        OpusReader.s = new byte[]{0x4F, 0x70, 0x75, 0x73, 72, 101, 97, 100};
        OpusReader.t = new byte[]{0x4F, 0x70, 0x75, 0x73, 84, 97, 103, 0x73};
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected long f(ParsableByteArray parsableByteArray0) {
        return this.c(OpusUtil.e(parsableByteArray0.e()));
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    @e(expression = {"#3.format"}, result = false)
    protected boolean h(ParsableByteArray parsableByteArray0, long v, SetupData streamReader$SetupData0) throws ParserException {
        if(OpusReader.n(parsableByteArray0, OpusReader.s)) {
            byte[] arr_b = Arrays.copyOf(parsableByteArray0.e(), parsableByteArray0.g());
            int v1 = OpusUtil.c(arr_b);
            List list0 = OpusUtil.a(arr_b);
            if(streamReader$SetupData0.a != null) {
                return true;
            }
            streamReader$SetupData0.a = new Builder().o0("audio/opus").N(v1).p0(48000).b0(list0).K();
            return true;
        }
        byte[] arr_b1 = OpusReader.t;
        if(OpusReader.n(parsableByteArray0, arr_b1)) {
            Assertions.k(streamReader$SetupData0.a);
            if(this.r) {
                return true;
            }
            this.r = true;
            parsableByteArray0.Z(arr_b1.length);
            Metadata metadata0 = VorbisUtil.d(O2.x(VorbisUtil.k(parsableByteArray0, false, false).b));
            if(metadata0 == null) {
                return true;
            }
            streamReader$SetupData0.a = streamReader$SetupData0.a.a().h0(metadata0.c(streamReader$SetupData0.a.k)).K();
            return true;
        }
        Assertions.k(streamReader$SetupData0.a);
        return false;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected void l(boolean z) {
        super.l(z);
        if(z) {
            this.r = false;
        }
    }

    private static boolean n(ParsableByteArray parsableByteArray0, byte[] arr_b) {
        if(parsableByteArray0.a() < arr_b.length) {
            return false;
        }
        byte[] arr_b1 = new byte[arr_b.length];
        parsableByteArray0.n(arr_b1, 0, arr_b.length);
        parsableByteArray0.Y(parsableByteArray0.f());
        return Arrays.equals(arr_b1, arr_b);
    }

    public static boolean o(ParsableByteArray parsableByteArray0) {
        return OpusReader.n(parsableByteArray0, OpusReader.s);
    }
}

