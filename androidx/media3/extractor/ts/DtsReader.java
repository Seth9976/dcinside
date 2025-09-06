package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.DtsUtil.DtsHeader;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.primitives.l;
import h4.m;
import java.util.concurrent.atomic.AtomicInteger;

@UnstableApi
public final class DtsReader implements ElementaryStreamReader {
    private final ParsableByteArray a;
    private final AtomicInteger b;
    @Nullable
    private final String c;
    private final int d;
    private String e;
    private TrackOutput f;
    private int g;
    private int h;
    private int i;
    private long j;
    private Format k;
    private int l;
    private int m;
    private int n;
    private int o;
    private long p;
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 3;
    private static final int u = 4;
    private static final int v = 5;
    private static final int w = 6;
    private static final int x = 18;
    static final int y = 0x1000;
    static final int z = 5408;

    public DtsReader(@Nullable String s, int v, int v1) {
        this.a = new ParsableByteArray(new byte[v1]);
        this.g = 0;
        this.p = 0x8000000000000001L;
        this.b = new AtomicInteger();
        this.n = -1;
        this.o = -1;
        this.c = s;
        this.d = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) throws ParserException {
        Assertions.k(this.f);
        while(parsableByteArray0.a() > 0) {
            switch(this.g) {
                case 0: {
                    if(!this.j(parsableByteArray0)) {
                        continue;
                    }
                    int v = this.m;
                    if(v == 3 || v == 4) {
                        this.g = 4;
                    }
                    else if(v == 1) {
                        this.g = 1;
                    }
                    else {
                        this.g = 2;
                    }
                    continue;
                }
                case 1: {
                    if(!this.f(parsableByteArray0, this.a.e(), 18)) {
                        continue;
                    }
                    this.g();
                    this.a.Y(0);
                    this.f.b(this.a, 18);
                    this.g = 6;
                    continue;
                }
                case 2: {
                    if(!this.f(parsableByteArray0, this.a.e(), 7)) {
                        continue;
                    }
                    this.n = DtsUtil.j(this.a.e());
                    this.g = 3;
                    continue;
                }
                case 3: {
                    if(!this.f(parsableByteArray0, this.a.e(), this.n)) {
                        continue;
                    }
                    this.h();
                    this.a.Y(0);
                    this.f.b(this.a, this.n);
                    this.g = 6;
                    continue;
                }
                case 4: {
                    if(!this.f(parsableByteArray0, this.a.e(), 6)) {
                        continue;
                    }
                    int v1 = DtsUtil.l(this.a.e());
                    this.o = v1;
                    int v2 = this.h;
                    if(v2 > v1) {
                        int v3 = v2 - v1;
                        this.h = v2 - v3;
                        parsableByteArray0.Y(parsableByteArray0.f() - v3);
                    }
                    this.g = 5;
                    continue;
                }
                case 5: {
                    if(!this.f(parsableByteArray0, this.a.e(), this.o)) {
                        continue;
                    }
                    this.i();
                    this.a.Y(0);
                    this.f.b(this.a, this.o);
                    this.g = 6;
                    continue;
                }
                case 6: {
                    int v4 = Math.min(parsableByteArray0.a(), this.l - this.h);
                    this.f.b(parsableByteArray0, v4);
                    int v5 = this.h + v4;
                    this.h = v5;
                    if(v5 == this.l) {
                        break;
                    }
                    continue;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            Assertions.i(this.p != 0x8000000000000001L);
            this.f.f(this.p, (this.m == 4 ? 0 : 1), this.l, 0, null);
            this.p += this.j;
            this.g = 0;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.p = 0x8000000000000001L;
        this.b.set(0);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.e = tsPayloadReader$TrackIdGenerator0.b();
        this.f = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.p = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
    }

    private boolean f(ParsableByteArray parsableByteArray0, byte[] arr_b, int v) {
        int v1 = Math.min(parsableByteArray0.a(), v - this.h);
        parsableByteArray0.n(arr_b, this.h, v1);
        int v2 = this.h + v1;
        this.h = v2;
        return v2 == v;
    }

    @m({"output"})
    private void g() {
        byte[] arr_b = this.a.e();
        if(this.k == null) {
            Format format0 = DtsUtil.h(arr_b, this.e, this.c, this.d, null);
            this.k = format0;
            this.f.d(format0);
        }
        this.l = DtsUtil.b(arr_b);
        this.j = (long)l.d(Util.Y1(DtsUtil.g(arr_b), this.k.C));
    }

    @m({"output"})
    private void h() throws ParserException {
        DtsHeader dtsUtil$DtsHeader0 = DtsUtil.i(this.a.e());
        this.k(dtsUtil$DtsHeader0);
        this.l = dtsUtil$DtsHeader0.d;
        this.j = dtsUtil$DtsHeader0.e == 0x8000000000000001L ? 0L : dtsUtil$DtsHeader0.e;
    }

    @m({"output"})
    private void i() throws ParserException {
        DtsHeader dtsUtil$DtsHeader0 = DtsUtil.k(this.a.e(), this.b);
        if(this.m == 3) {
            this.k(dtsUtil$DtsHeader0);
        }
        this.l = dtsUtil$DtsHeader0.d;
        this.j = dtsUtil$DtsHeader0.e == 0x8000000000000001L ? 0L : dtsUtil$DtsHeader0.e;
    }

    private boolean j(ParsableByteArray parsableByteArray0) {
        while(parsableByteArray0.a() > 0) {
            int v = this.i << 8;
            this.i = v;
            int v1 = v | parsableByteArray0.L();
            this.i = v1;
            int v2 = DtsUtil.c(v1);
            this.m = v2;
            if(v2 != 0) {
                byte[] arr_b = this.a.e();
                int v3 = this.i;
                arr_b[0] = (byte)(v3 >> 24 & 0xFF);
                arr_b[1] = (byte)(v3 >> 16 & 0xFF);
                arr_b[2] = (byte)(v3 >> 8 & 0xFF);
                arr_b[3] = (byte)(v3 & 0xFF);
                this.h = 4;
                this.i = 0;
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @m({"output"})
    private void k(DtsHeader dtsUtil$DtsHeader0) {
        if(dtsUtil$DtsHeader0.b != 0x80000001 && (dtsUtil$DtsHeader0.c != -1 && (this.k == null || dtsUtil$DtsHeader0.c != this.k.B || dtsUtil$DtsHeader0.b != this.k.C || !Util.g(dtsUtil$DtsHeader0.a, this.k.n)))) {
            Format format0 = (this.k == null ? new Builder() : this.k.a()).a0(this.e).o0(dtsUtil$DtsHeader0.a).N(dtsUtil$DtsHeader0.c).p0(dtsUtil$DtsHeader0.b).e0(this.c).m0(this.d).K();
            this.k = format0;
            this.f.d(format0);
        }
    }
}

