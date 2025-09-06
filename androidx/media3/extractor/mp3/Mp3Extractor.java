package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.Id3Peeker;
import androidx.media3.extractor.MpegAudioUtil.Header;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.common.math.h;
import com.google.common.primitives.l;
import h4.m;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.math.RoundingMode;
import java.util.List;

@UnstableApi
public final class Mp3Extractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    public static final int A = 4;
    public static final int B = 8;
    private static final String C = "Mp3Extractor";
    private static final FramePredicate D = null;
    private static final int E = 0x20000;
    private static final int F = 0x8000;
    private static final int G = 10;
    private static final int H = 0xFFFE0C00;
    private static final int I = 1483304551;
    private static final int J = 0x496E666F;
    private static final int K = 1447187017;
    private static final int L = 0;
    private final int d;
    private final long e;
    private final ParsableByteArray f;
    private final Header g;
    private final GaplessInfoHolder h;
    private final Id3Peeker i;
    private final TrackOutput j;
    private ExtractorOutput k;
    private TrackOutput l;
    private TrackOutput m;
    private int n;
    @Nullable
    private Metadata o;
    private long p;
    private long q;
    private long r;
    private int s;
    private Seeker t;
    private boolean u;
    private boolean v;
    private long w;
    public static final ExtractorsFactory x = null;
    public static final int y = 1;
    public static final int z = 2;

    static {
        Mp3Extractor.x = new a();
        Mp3Extractor.D = (int v, int v1, int v2, int v3, int v4) -> // 去混淆评级： 低(30)
        v1 == 67 && v2 == 0x4F && v3 == 77 && (v4 == 77 || v == 2) || v1 == 77 && v2 == 76 && v3 == 76 && (v4 == 84 || v == 2);
    }

    public Mp3Extractor() {
        this(0);
    }

    public Mp3Extractor(int v) {
        this(v, 0x8000000000000001L);
    }

    public Mp3Extractor(int v, long v1) {
        if((v & 2) != 0) {
            v |= 1;
        }
        this.d = v;
        this.e = v1;
        this.f = new ParsableByteArray(10);
        this.g = new Header();
        this.h = new GaplessInfoHolder();
        this.p = 0x8000000000000001L;
        this.i = new Id3Peeker();
        DiscardingTrackOutput discardingTrackOutput0 = new DiscardingTrackOutput();
        this.j = discardingTrackOutput0;
        this.m = discardingTrackOutput0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.n = 0;
        this.p = 0x8000000000000001L;
        this.q = 0L;
        this.s = 0;
        this.w = v1;
        if(this.t instanceof IndexSeeker && !((IndexSeeker)this.t).a(v1)) {
            this.v = true;
            this.m = this.j;
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        this.i();
        int v = this.w(extractorInput0);
        if(v == -1 && this.t instanceof IndexSeeker) {
            long v1 = this.k(this.q);
            if(this.t.c1() != v1) {
                ((IndexSeeker)this.t).d(v1);
                this.k.r(this.t);
            }
        }
        return v;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return this.y(extractorInput0, true);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.k = extractorOutput0;
        TrackOutput trackOutput0 = extractorOutput0.b(0, 1);
        this.l = trackOutput0;
        this.m = trackOutput0;
        this.k.m();
    }

    @h4.d({"extractorOutput", "realTrackOutput"})
    private void i() {
        Assertions.k(this.l);
    }

    private Seeker j(ExtractorInput extractorInput0) throws IOException {
        long v1;
        long v;
        Seeker seeker0 = this.u(extractorInput0);
        MlltSeeker mlltSeeker0 = Mp3Extractor.t(this.o, extractorInput0.getPosition());
        if(this.u) {
            return new UnseekableSeeker();
        }
        if((this.d & 4) != 0) {
            if(mlltSeeker0 != null) {
                v = mlltSeeker0.c1();
                v1 = mlltSeeker0.f();
            }
            else if(seeker0 == null) {
                v = Mp3Extractor.o(this.o);
                v1 = -1L;
            }
            else {
                v = seeker0.c1();
                v1 = seeker0.f();
            }
            seeker0 = new IndexSeeker(v, extractorInput0.getPosition(), v1);
        }
        else if(mlltSeeker0 != null) {
            seeker0 = mlltSeeker0;
        }
        else if(seeker0 == null) {
            seeker0 = null;
        }
        boolean z = true;
        if(seeker0 == null || !seeker0.e1() && (this.d & 1) != 0) {
            if((this.d & 2) == 0) {
                z = false;
            }
            return this.n(extractorInput0, z);
        }
        return seeker0;
    }

    private long k(long v) {
        return this.p + v * 1000000L / ((long)this.g.d);
    }

    public void l() {
        this.u = true;
    }

    @Nullable
    private Seeker m(long v, XingFrame xingFrame0, long v1) {
        long v5;
        long v4;
        long v2 = xingFrame0.a();
        if(v2 == 0x8000000000000001L) {
            return null;
        }
        long v3 = xingFrame0.c;
        if(v3 != -1L) {
            v4 = v3 - ((long)xingFrame0.a.c);
            v5 = v + v3;
        }
        else if(v1 != -1L) {
            v5 = v1;
            v4 = v1 - v - ((long)xingFrame0.a.c);
        }
        else {
            return null;
        }
        RoundingMode roundingMode0 = RoundingMode.HALF_UP;
        int v6 = l.d(Util.c2(v4, 8000000L, v2, roundingMode0));
        int v7 = l.d(h.g(v4, xingFrame0.b, roundingMode0));
        return new ConstantBitrateSeeker(v5, v + ((long)xingFrame0.a.c), v6, v7, false);
    }

    private Seeker n(ExtractorInput extractorInput0, boolean z) throws IOException {
        extractorInput0.k(this.f.e(), 0, 4);
        this.f.Y(0);
        int v = this.f.s();
        this.g.a(v);
        return new ConstantBitrateSeeker(extractorInput0.getLength(), extractorInput0.getPosition(), this.g, z);
    }

    private static long o(@Nullable Metadata metadata0) {
        if(metadata0 != null) {
            int v = metadata0.f();
            for(int v1 = 0; v1 < v; ++v1) {
                Entry metadata$Entry0 = metadata0.e(v1);
                if(metadata$Entry0 instanceof TextInformationFrame && ((TextInformationFrame)metadata$Entry0).a.equals("TLEN")) {
                    return Util.F1(Long.parseLong(((String)((TextInformationFrame)metadata$Entry0).d.get(0))));
                }
            }
        }
        return 0x8000000000000001L;
    }

    private static int p(ParsableByteArray parsableByteArray0, int v) {
        if(parsableByteArray0.g() >= v + 4) {
            parsableByteArray0.Y(v);
            int v1 = parsableByteArray0.s();
            if(v1 == 0x496E666F || v1 == 1483304551) {
                return v1;
            }
        }
        if(parsableByteArray0.g() >= 40) {
            parsableByteArray0.Y(36);
            return parsableByteArray0.s() == 1447187017 ? 1447187017 : 0;
        }
        return 0;
    }

    private static boolean q(int v, long v1) {
        return ((long)(v & 0xFFFE0C00)) == (v1 & 0xFFFFFFFFFFFE0C00L);
    }

    private static Extractor[] r() {
        return new Extractor[]{new Mp3Extractor()};
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    // 去混淆评级： 低(30)
    // 检测为 Lambda 实现
    private static boolean s(int v, int v1, int v2, int v3, int v4) [...]

    @Nullable
    private static MlltSeeker t(@Nullable Metadata metadata0, long v) {
        if(metadata0 != null) {
            int v1 = metadata0.f();
            for(int v2 = 0; v2 < v1; ++v2) {
                Entry metadata$Entry0 = metadata0.e(v2);
                if(metadata$Entry0 instanceof MlltFrame) {
                    return MlltSeeker.a(v, ((MlltFrame)metadata$Entry0), Mp3Extractor.o(metadata0));
                }
            }
        }
        return null;
    }

    @Nullable
    private Seeker u(ExtractorInput extractorInput0) throws IOException {
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(this.g.c);
        extractorInput0.k(parsableByteArray0.e(), 0, this.g.c);
        Header mpegAudioUtil$Header0 = this.g;
        int v = 21;
        if((mpegAudioUtil$Header0.a & 1) == 0) {
            if(mpegAudioUtil$Header0.e == 1) {
                v = 13;
            }
        }
        else if(mpegAudioUtil$Header0.e != 1) {
            v = 36;
        }
        int v1 = Mp3Extractor.p(parsableByteArray0, v);
        if(v1 != 0x496E666F) {
            switch(v1) {
                case 1447187017: {
                    VbriSeeker vbriSeeker0 = VbriSeeker.a(extractorInput0.getLength(), extractorInput0.getPosition(), this.g, parsableByteArray0);
                    extractorInput0.r(this.g.c);
                    return vbriSeeker0;
                }
                case 1483304551: {
                    break;
                }
                default: {
                    extractorInput0.o();
                    return null;
                }
            }
        }
        XingFrame xingFrame0 = XingFrame.b(this.g, parsableByteArray0);
        if(!this.h.a()) {
            int v2 = xingFrame0.d;
            if(v2 != -1) {
                int v3 = xingFrame0.e;
                if(v3 != -1) {
                    this.h.a = v2;
                    this.h.b = v3;
                }
            }
        }
        long v4 = extractorInput0.getPosition();
        if(extractorInput0.getLength() != -1L && xingFrame0.c != -1L && extractorInput0.getLength() != xingFrame0.c + v4) {
            Log.h("Mp3Extractor", "Data size mismatch between stream (" + extractorInput0.getLength() + ") and Xing frame (" + (xingFrame0.c + v4) + "), using Xing value.");
        }
        extractorInput0.r(this.g.c);
        return v1 == 1483304551 ? XingSeeker.a(xingFrame0, v4) : this.m(v4, xingFrame0, extractorInput0.getLength());
    }

    private boolean v(ExtractorInput extractorInput0) throws IOException {
        Seeker seeker0 = this.t;
        if(seeker0 != null) {
            long v = seeker0.f();
            if(v != -1L && extractorInput0.p() > v - 4L) {
                return true;
            }
        }
        try {
            return !extractorInput0.n(this.f.e(), 0, 4, true);
        }
        catch(EOFException unused_ex) {
            return true;
        }
    }

    @m({"extractorOutput", "realTrackOutput"})
    private int w(ExtractorInput extractorInput0) throws IOException {
        if(this.n == 0) {
            try {
                this.y(extractorInput0, false);
            }
            catch(EOFException unused_ex) {
                return -1;
            }
        }
        if(this.t == null) {
            Seeker seeker0 = this.j(extractorInput0);
            this.t = seeker0;
            this.k.r(seeker0);
            Builder format$Builder0 = new Builder().o0(this.g.b).f0(0x1000).N(this.g.e).p0(this.g.d).V(this.h.a).W(this.h.b).h0(((this.d & 8) == 0 ? this.o : null));
            if(this.t.i() != 0x80000001) {
                format$Builder0.M(this.t.i());
            }
            this.m.d(format$Builder0.K());
            this.r = extractorInput0.getPosition();
            return this.x(extractorInput0);
        }
        if(this.r != 0L) {
            long v = extractorInput0.getPosition();
            long v1 = this.r;
            if(v < v1) {
                extractorInput0.r(((int)(v1 - v)));
            }
        }
        return this.x(extractorInput0);
    }

    @m({"realTrackOutput", "seeker"})
    private int x(ExtractorInput extractorInput0) throws IOException {
        if(this.s == 0) {
            extractorInput0.o();
            if(this.v(extractorInput0)) {
                return -1;
            }
            this.f.Y(0);
            int v = this.f.s();
            if(!Mp3Extractor.q(v, ((long)this.n)) || MpegAudioUtil.j(v) == -1) {
                extractorInput0.r(1);
                this.n = 0;
                return 0;
            }
            this.g.a(v);
            if(this.p == 0x8000000000000001L) {
                this.p = this.t.b(extractorInput0.getPosition());
                if(this.e != 0x8000000000000001L) {
                    long v1 = this.t.b(0L);
                    this.p += this.e - v1;
                }
            }
            Header mpegAudioUtil$Header0 = this.g;
            this.s = mpegAudioUtil$Header0.c;
            Seeker seeker0 = this.t;
            if(seeker0 instanceof IndexSeeker) {
                ((IndexSeeker)seeker0).c(this.k(this.q + ((long)mpegAudioUtil$Header0.g)), extractorInput0.getPosition() + ((long)this.g.c));
                if(this.v && ((IndexSeeker)seeker0).a(this.w)) {
                    this.v = false;
                    this.m = this.l;
                }
            }
        }
        int v2 = this.m.e(extractorInput0, this.s, true);
        if(v2 == -1) {
            return -1;
        }
        int v3 = this.s - v2;
        this.s = v3;
        if(v3 > 0) {
            return 0;
        }
        this.m.f(this.k(this.q), 1, this.g.c, 0, null);
        this.q += (long)this.g.g;
        this.s = 0;
        return 0;
    }

    private boolean y(ExtractorInput extractorInput0, boolean z) throws IOException {
        int v1;
        int v;
        extractorInput0.o();
        if(extractorInput0.getPosition() == 0L) {
            Metadata metadata0 = this.i.a(extractorInput0, ((this.d & 8) == 0 ? null : Mp3Extractor.D));
            this.o = metadata0;
            if(metadata0 != null) {
                this.h.c(metadata0);
            }
            v = (int)extractorInput0.p();
            if(!z) {
                extractorInput0.r(v);
            }
            v1 = 0;
        }
        else {
            v1 = 0;
            v = 0;
        }
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(this.v(extractorInput0)) {
                if(v2 <= 0) {
                    throw new EOFException();
                }
                goto label_29;
            }
            this.f.Y(0);
            int v4 = this.f.s();
            if(v1 == 0 || Mp3Extractor.q(v4, ((long)v1))) {
                int v5 = MpegAudioUtil.j(v4);
                if(v5 != -1) {
                    ++v2;
                    if(v2 == 1) {
                        this.g.a(v4);
                        v1 = v4;
                    }
                    else if(v2 == 4) {
                        goto label_29;
                    }
                    extractorInput0.q(v5 - 4);
                    continue;
                label_29:
                    if(z) {
                        extractorInput0.r(v + v3);
                    }
                    else {
                        extractorInput0.o();
                    }
                    this.n = v1;
                    return true;
                }
            }
            if(v3 == (z ? 0x8000 : 0x20000)) {
                if(!z) {
                    throw ParserException.a("Searched too many bytes.", null);
                }
                return false;
            }
            if(z) {
                extractorInput0.o();
                extractorInput0.q(v + (v3 + 1));
            }
            else {
                extractorInput0.r(1);
            }
            ++v3;
            v1 = 0;
            v2 = 0;
        }
    }
}

