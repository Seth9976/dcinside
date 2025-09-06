package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.MpegAudioUtil.Header;
import androidx.media3.extractor.TrackOutput;
import h4.m;

@UnstableApi
public final class MpegAudioReader implements ElementaryStreamReader {
    private final ParsableByteArray a;
    private final Header b;
    @Nullable
    private final String c;
    private final int d;
    private TrackOutput e;
    private String f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private long k;
    private int l;
    private long m;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 4;

    public MpegAudioReader() {
        this(null, 0);
    }

    public MpegAudioReader(@Nullable String s, int v) {
        this.g = 0;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(4);
        this.a = parsableByteArray0;
        parsableByteArray0.e()[0] = -1;
        this.b = new Header();
        this.m = 0x8000000000000001L;
        this.c = s;
        this.d = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        Assertions.k(this.e);
        while(parsableByteArray0.a() > 0) {
            switch(this.g) {
                case 0: {
                    this.f(parsableByteArray0);
                    break;
                }
                case 1: {
                    this.h(parsableByteArray0);
                    break;
                }
                case 2: {
                    this.g(parsableByteArray0);
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.f = tsPayloadReader$TrackIdGenerator0.b();
        this.e = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.m = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
    }

    private void f(ParsableByteArray parsableByteArray0) {
        byte[] arr_b = parsableByteArray0.e();
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1) {
            int v2 = arr_b[v];
            boolean z = this.j && (v2 & 0xE0) == 0xE0;
            this.j = (v2 & 0xFF) == 0xFF;
            if(z) {
                parsableByteArray0.Y(v + 1);
                this.j = false;
                this.a.e()[1] = arr_b[v];
                this.h = 2;
                this.g = 1;
                return;
            }
            ++v;
        }
        parsableByteArray0.Y(v1);
    }

    @m({"output"})
    private void g(ParsableByteArray parsableByteArray0) {
        int v = Math.min(parsableByteArray0.a(), this.l - this.h);
        this.e.b(parsableByteArray0, v);
        int v1 = this.h + v;
        this.h = v1;
        if(v1 < this.l) {
            return;
        }
        Assertions.i(this.m != 0x8000000000000001L);
        this.e.f(this.m, 1, this.l, 0, null);
        this.m += this.k;
        this.h = 0;
        this.g = 0;
    }

    @m({"output"})
    private void h(ParsableByteArray parsableByteArray0) {
        int v = Math.min(parsableByteArray0.a(), 4 - this.h);
        parsableByteArray0.n(this.a.e(), this.h, v);
        int v1 = this.h + v;
        this.h = v1;
        if(v1 < 4) {
            return;
        }
        this.a.Y(0);
        int v2 = this.a.s();
        if(!this.b.a(v2)) {
            this.h = 0;
            this.g = 1;
            return;
        }
        Header mpegAudioUtil$Header0 = this.b;
        this.l = mpegAudioUtil$Header0.c;
        if(!this.i) {
            this.k = ((long)mpegAudioUtil$Header0.g) * 1000000L / ((long)mpegAudioUtil$Header0.d);
            Format format0 = new Builder().a0(this.f).o0(this.b.b).f0(0x1000).N(this.b.e).p0(this.b.d).e0(this.c).m0(this.d).K();
            this.e.d(format0);
            this.i = true;
        }
        this.a.Y(0);
        this.e.b(this.a, 4);
        this.g = 2;
    }
}

