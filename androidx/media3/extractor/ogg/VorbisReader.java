package androidx.media3.extractor.ogg;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.VorbisUtil.CommentHeader;
import androidx.media3.extractor.VorbisUtil.Mode;
import androidx.media3.extractor.VorbisUtil.VorbisIdHeader;
import androidx.media3.extractor.VorbisUtil;
import com.google.common.collect.O2;
import h4.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

final class VorbisReader extends StreamReader {
    static final class VorbisSetup {
        public final VorbisIdHeader a;
        public final CommentHeader b;
        public final byte[] c;
        public final Mode[] d;
        public final int e;

        public VorbisSetup(VorbisIdHeader vorbisUtil$VorbisIdHeader0, CommentHeader vorbisUtil$CommentHeader0, byte[] arr_b, Mode[] arr_vorbisUtil$Mode, int v) {
            this.a = vorbisUtil$VorbisIdHeader0;
            this.b = vorbisUtil$CommentHeader0;
            this.c = arr_b;
            this.d = arr_vorbisUtil$Mode;
            this.e = v;
        }
    }

    @Nullable
    private VorbisSetup r;
    private int s;
    private boolean t;
    @Nullable
    private VorbisIdHeader u;
    @Nullable
    private CommentHeader v;

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected void e(long v) {
        super.e(v);
        int v1 = 0;
        this.t = v != 0L;
        VorbisIdHeader vorbisUtil$VorbisIdHeader0 = this.u;
        if(vorbisUtil$VorbisIdHeader0 != null) {
            v1 = vorbisUtil$VorbisIdHeader0.g;
        }
        this.s = v1;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected long f(ParsableByteArray parsableByteArray0) {
        int v = 0;
        if((parsableByteArray0.e()[0] & 1) == 1) {
            return -1L;
        }
        int v1 = VorbisReader.o(parsableByteArray0.e()[0], ((VorbisSetup)Assertions.k(this.r)));
        if(this.t) {
            v = (this.s + v1) / 4;
        }
        VorbisReader.n(parsableByteArray0, ((long)v));
        this.t = true;
        this.s = v1;
        return (long)v;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    @e(expression = {"#3.format"}, result = false)
    protected boolean h(ParsableByteArray parsableByteArray0, long v, SetupData streamReader$SetupData0) throws IOException {
        if(this.r != null) {
            Assertions.g(streamReader$SetupData0.a);
            return false;
        }
        VorbisSetup vorbisReader$VorbisSetup0 = this.q(parsableByteArray0);
        this.r = vorbisReader$VorbisSetup0;
        if(vorbisReader$VorbisSetup0 == null) {
            return true;
        }
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(vorbisReader$VorbisSetup0.a.j);
        arrayList0.add(vorbisReader$VorbisSetup0.c);
        Metadata metadata0 = VorbisUtil.d(O2.x(vorbisReader$VorbisSetup0.b.b));
        streamReader$SetupData0.a = new Builder().o0("audio/vorbis").M(vorbisReader$VorbisSetup0.a.e).j0(vorbisReader$VorbisSetup0.a.d).N(vorbisReader$VorbisSetup0.a.b).p0(vorbisReader$VorbisSetup0.a.c).b0(arrayList0).h0(metadata0).K();
        return true;
    }

    @Override  // androidx.media3.extractor.ogg.StreamReader
    protected void l(boolean z) {
        super.l(z);
        if(z) {
            this.r = null;
            this.u = null;
            this.v = null;
        }
        this.s = 0;
        this.t = false;
    }

    @VisibleForTesting
    static void n(ParsableByteArray parsableByteArray0, long v) {
        if(parsableByteArray0.b() < parsableByteArray0.g() + 4) {
            parsableByteArray0.V(Arrays.copyOf(parsableByteArray0.e(), parsableByteArray0.g() + 4));
        }
        else {
            parsableByteArray0.X(parsableByteArray0.g() + 4);
        }
        byte[] arr_b = parsableByteArray0.e();
        arr_b[parsableByteArray0.g() - 4] = (byte)(((int)(v & 0xFFL)));
        arr_b[parsableByteArray0.g() - 3] = (byte)(((int)(v >>> 8 & 0xFFL)));
        arr_b[parsableByteArray0.g() - 2] = (byte)(((int)(v >>> 16 & 0xFFL)));
        arr_b[parsableByteArray0.g() - 1] = (byte)(((int)(v >>> 24 & 0xFFL)));
    }

    private static int o(byte b, VorbisSetup vorbisReader$VorbisSetup0) {
        return vorbisReader$VorbisSetup0.d[b >> 1 & 0xFF >>> 8 - vorbisReader$VorbisSetup0.e].a ? vorbisReader$VorbisSetup0.a.h : vorbisReader$VorbisSetup0.a.g;
    }

    @VisibleForTesting
    static int p(byte b, int v, int v1) [...] // Inlined contents

    @Nullable
    @VisibleForTesting
    VorbisSetup q(ParsableByteArray parsableByteArray0) throws IOException {
        VorbisIdHeader vorbisUtil$VorbisIdHeader0 = this.u;
        if(vorbisUtil$VorbisIdHeader0 == null) {
            this.u = VorbisUtil.l(parsableByteArray0);
            return null;
        }
        CommentHeader vorbisUtil$CommentHeader0 = this.v;
        if(vorbisUtil$CommentHeader0 == null) {
            this.v = VorbisUtil.j(parsableByteArray0);
            return null;
        }
        byte[] arr_b = new byte[parsableByteArray0.g()];
        System.arraycopy(parsableByteArray0.e(), 0, arr_b, 0, parsableByteArray0.g());
        Mode[] arr_vorbisUtil$Mode = VorbisUtil.m(parsableByteArray0, vorbisUtil$VorbisIdHeader0.b);
        return new VorbisSetup(vorbisUtil$VorbisIdHeader0, vorbisUtil$CommentHeader0, arr_b, arr_vorbisUtil$Mode, VorbisUtil.b(arr_vorbisUtil$Mode.length - 1));
    }

    public static boolean r(ParsableByteArray parsableByteArray0) {
        try {
            return VorbisUtil.o(1, parsableByteArray0, true);
        }
        catch(ParserException unused_ex) {
            return false;
        }
    }
}

