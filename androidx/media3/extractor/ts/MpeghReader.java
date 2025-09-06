package androidx.media3.extractor.ts;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import com.google.common.collect.O2;
import h4.m;

@UnstableApi
public final class MpeghReader implements ElementaryStreamReader {
    private static final int A = 15;
    private final ParsableByteArray a;
    private final ParsableBitArray b;
    private final ParsableByteArray c;
    private int d;
    private String e;
    private TrackOutput f;
    private double g;
    private double h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;
    private int n;
    private int o;
    private MhasPacketHeader p;
    private int q;
    private int r;
    private int s;
    private long t;
    private boolean u;
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 2;

    public MpeghReader() {
        this.d = 0;
        this.a = new ParsableByteArray(new byte[15], 2);
        this.b = new ParsableBitArray();
        this.c = new ParsableByteArray();
        this.p = new MhasPacketHeader();
        this.q = 0x80000001;
        this.r = -1;
        this.t = -1L;
        this.j = true;
        this.m = true;
        this.g = -9223372036854776000.0;
        this.h = -9223372036854776000.0;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) throws ParserException {
        Assertions.k(this.f);
        while(parsableByteArray0.a() > 0) {
            int v = this.d;
            if(v == 0) {
                if(this.k(parsableByteArray0)) {
                    goto label_39;
                }
                continue;
            }
            else {
                switch(v) {
                    case 1: {
                        this.f(parsableByteArray0, this.a, false);
                        if(this.a.a() != 0) {
                            this.m = false;
                        }
                        else if(this.i()) {
                            this.a.Y(0);
                            this.f.b(this.a, this.a.g());
                            this.a.U(2);
                            this.c.U(this.p.c);
                            this.m = true;
                            this.d = 2;
                        }
                        else {
                            if(this.a.g() >= 15) {
                                continue;
                            }
                            this.a.X(this.a.g() + 1);
                            this.m = false;
                        }
                        continue;
                    }
                    case 2: {
                        if(this.j(this.p.a)) {
                            this.f(parsableByteArray0, this.c, true);
                        }
                        this.l(parsableByteArray0);
                        MhasPacketHeader mpeghUtil$MhasPacketHeader0 = this.p;
                        if(this.n != mpeghUtil$MhasPacketHeader0.c) {
                            continue;
                        }
                        int v1 = mpeghUtil$MhasPacketHeader0.a;
                        if(v1 == 1) {
                            this.h(new ParsableBitArray(this.c.e()));
                        }
                        else {
                            switch(v1) {
                                case 2: {
                                    this.g();
                                    break;
                                }
                                case 17: {
                                    this.s = MpeghUtil.f(new ParsableBitArray(this.c.e()));
                                }
                            }
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
        label_39:
            this.d = 1;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.d = 0;
        this.l = 0;
        this.a.U(2);
        this.n = 0;
        this.o = 0;
        this.q = 0x80000001;
        this.r = -1;
        this.s = 0;
        this.t = -1L;
        this.u = false;
        this.i = false;
        this.m = true;
        this.j = true;
        this.g = -9223372036854776000.0;
        this.h = -9223372036854776000.0;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.e = tsPayloadReader$TrackIdGenerator0.b();
        this.f = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.k = v1;
        if(!this.j && (this.o != 0 || !this.m)) {
            this.i = true;
        }
        if(v != 0x8000000000000001L) {
            if(this.i) {
                this.h = (double)v;
                return;
            }
            this.g = (double)v;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
    }

    private void f(ParsableByteArray parsableByteArray0, ParsableByteArray parsableByteArray1, boolean z) {
        int v = parsableByteArray0.f();
        int v1 = Math.min(parsableByteArray0.a(), parsableByteArray1.a());
        parsableByteArray0.n(parsableByteArray1.e(), parsableByteArray1.f(), v1);
        parsableByteArray1.Z(v1);
        if(z) {
            parsableByteArray0.Y(v);
        }
    }

    @m({"output"})
    private void g() {
        int v;
        if(this.u) {
            this.j = false;
            v = 1;
        }
        else {
            v = 0;
        }
        double f = ((double)(this.r - this.s)) * 1000000.0 / ((double)this.q);
        long v1 = Math.round(this.g);
        if(this.i) {
            this.i = false;
            this.g = this.h;
        }
        else {
            this.g += f;
        }
        this.f.f(v1, v, this.o, 0, null);
        this.u = false;
        this.s = 0;
        this.o = 0;
    }

    @m({"output"})
    private void h(ParsableBitArray parsableBitArray0) throws ParserException {
        Mpegh3daConfig mpeghUtil$Mpegh3daConfig0 = MpeghUtil.h(parsableBitArray0);
        this.q = mpeghUtil$Mpegh3daConfig0.b;
        this.r = mpeghUtil$Mpegh3daConfig0.c;
        long v = this.p.b;
        if(this.t != v) {
            this.t = v;
            O2 o20 = mpeghUtil$Mpegh3daConfig0.d == null || mpeghUtil$Mpegh3daConfig0.d.length <= 0 ? null : O2.C(Util.f, mpeghUtil$Mpegh3daConfig0.d);
            Format format0 = new Builder().a0(this.e).o0("audio/mhm1").p0(this.q).O((mpeghUtil$Mpegh3daConfig0.a == -1 ? "mhm1" : "mhm1" + String.format(".%02X", mpeghUtil$Mpegh3daConfig0.a))).b0(o20).K();
            this.f.d(format0);
        }
        this.u = true;
    }

    private boolean i() throws ParserException {
        int v = this.a.g();
        this.b.p(this.a.e(), v);
        boolean z = MpeghUtil.g(this.b, this.p);
        if(z) {
            this.n = 0;
            this.o += this.p.c + v;
        }
        return z;
    }

    private boolean j(int v) {
        return v == 1 || v == 17;
    }

    private boolean k(ParsableByteArray parsableByteArray0) {
        int v = this.k;
        if((v & 2) == 0) {
            parsableByteArray0.Y(parsableByteArray0.g());
            return false;
        }
        if((v & 4) == 0) {
            while(parsableByteArray0.a() > 0) {
                int v1 = this.l << 8;
                this.l = v1;
                int v2 = v1 | parsableByteArray0.L();
                this.l = v2;
                if(MpeghUtil.e(v2)) {
                    parsableByteArray0.Y(parsableByteArray0.f() - 3);
                    this.l = 0;
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @m({"output"})
    private void l(ParsableByteArray parsableByteArray0) {
        int v = Math.min(parsableByteArray0.a(), this.p.c - this.n);
        this.f.b(parsableByteArray0, v);
        this.n += v;
    }
}

