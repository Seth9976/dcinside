package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil.Config;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.m;
import java.util.Collections;

@UnstableApi
public final class LatmReader implements ElementaryStreamReader {
    private static final int A = 0x400;
    private static final int B = 86;
    private static final int C = 0xE0;
    @Nullable
    private final String a;
    private final int b;
    private final ParsableByteArray c;
    private final ParsableBitArray d;
    private TrackOutput e;
    private String f;
    private Format g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private int u;
    @Nullable
    private String v;
    private static final int w = 0;
    private static final int x = 1;
    private static final int y = 2;
    private static final int z = 3;

    public LatmReader(@Nullable String s, int v) {
        this.a = s;
        this.b = v;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(0x400);
        this.c = parsableByteArray0;
        this.d = new ParsableBitArray(parsableByteArray0.e());
        this.l = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) throws ParserException {
        Assertions.k(this.e);
        while(parsableByteArray0.a() > 0) {
            switch(this.h) {
                case 0: {
                    if(parsableByteArray0.L() != 86) {
                        continue;
                    }
                    this.h = 1;
                    continue;
                }
                case 1: {
                    int v = parsableByteArray0.L();
                    if((v & 0xE0) == 0xE0) {
                        this.k = v;
                        this.h = 2;
                    }
                    else {
                        if(v == 86) {
                            continue;
                        }
                        this.h = 0;
                    }
                    continue;
                }
                case 2: {
                    int v1 = (this.k & 0xFFFFFF1F) << 8 | parsableByteArray0.L();
                    this.j = v1;
                    if(v1 > this.c.e().length) {
                        this.m(this.j);
                    }
                    this.i = 0;
                    this.h = 3;
                    continue;
                }
                case 3: {
                    int v2 = Math.min(parsableByteArray0.a(), this.j - this.i);
                    parsableByteArray0.n(this.d.a, this.i, v2);
                    int v3 = this.i + v2;
                    this.i = v3;
                    if(v3 == this.j) {
                        break;
                    }
                    continue;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.d.q(0);
            this.g(this.d);
            this.h = 0;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.h = 0;
        this.l = 0x8000000000000001L;
        this.m = false;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.e = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
        this.f = tsPayloadReader$TrackIdGenerator0.b();
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.l = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
    }

    private static long f(ParsableBitArray parsableBitArray0) {
        return (long)parsableBitArray0.h((parsableBitArray0.h(2) + 1) * 8);
    }

    @m({"output"})
    private void g(ParsableBitArray parsableBitArray0) throws ParserException {
        if(!parsableBitArray0.g()) {
            this.m = true;
            this.l(parsableBitArray0);
        }
        else if(!this.m) {
            return;
        }
        if(this.n != 0 || this.o != 0) {
            throw ParserException.a(null, null);
        }
        this.k(parsableBitArray0, this.j(parsableBitArray0));
        if(this.q) {
            parsableBitArray0.s(((int)this.r));
        }
    }

    private int h(ParsableBitArray parsableBitArray0) throws ParserException {
        Config aacUtil$Config0 = AacUtil.e(parsableBitArray0, true);
        this.v = aacUtil$Config0.c;
        this.s = aacUtil$Config0.a;
        this.u = aacUtil$Config0.b;
        return 0;
    }

    private void i(ParsableBitArray parsableBitArray0) {
        int v = parsableBitArray0.h(3);
        this.p = v;
        switch(v) {
            case 0: {
                parsableBitArray0.s(8);
                return;
            }
            case 1: {
                parsableBitArray0.s(9);
                return;
            }
            case 3: 
            case 4: 
            case 5: {
                parsableBitArray0.s(6);
                return;
            label_10:
                if(v != 7) {
                    throw new IllegalStateException();
                }
                break;
            }
            case 6: {
                break;
            }
            default: {
                goto label_10;
            }
        }
        parsableBitArray0.s(1);
    }

    private int j(ParsableBitArray parsableBitArray0) throws ParserException {
        if(this.p != 0) {
            throw ParserException.a(null, null);
        }
        int v = 0;
        do {
            int v1 = parsableBitArray0.h(8);
            v += v1;
        }
        while(v1 == 0xFF);
        return v;
    }

    @m({"output"})
    private void k(ParsableBitArray parsableBitArray0, int v) {
        int v1 = parsableBitArray0.e();
        boolean z = false;
        if((v1 & 7) == 0) {
            this.c.Y(v1 >> 3);
        }
        else {
            parsableBitArray0.i(this.c.e(), 0, v * 8);
            this.c.Y(0);
        }
        this.e.b(this.c, v);
        if(this.l != 0x8000000000000001L) {
            z = true;
        }
        Assertions.i(z);
        this.e.f(this.l, 1, v, 0, null);
        this.l += this.t;
    }

    @m({"output"})
    private void l(ParsableBitArray parsableBitArray0) throws ParserException {
        int v = parsableBitArray0.h(1);
        int v1 = v == 1 ? parsableBitArray0.h(1) : 0;
        this.n = v1;
        if(v1 != 0) {
            throw ParserException.a(null, null);
        }
        if(v == 1) {
            LatmReader.f(parsableBitArray0);
        }
        if(!parsableBitArray0.g()) {
            throw ParserException.a(null, null);
        }
        this.o = parsableBitArray0.h(6);
        if(parsableBitArray0.h(4) != 0 || parsableBitArray0.h(3) != 0) {
            throw ParserException.a(null, null);
        }
        if(v == 0) {
            int v2 = this.h(parsableBitArray0);
            parsableBitArray0.q(parsableBitArray0.e());
            byte[] arr_b = new byte[(v2 + 7) / 8];
            parsableBitArray0.i(arr_b, 0, v2);
            Format format0 = new Builder().a0(this.f).o0("audio/mp4a-latm").O(this.v).N(this.u).p0(this.s).b0(Collections.singletonList(arr_b)).e0(this.a).m0(this.b).K();
            if(!format0.equals(this.g)) {
                this.g = format0;
                this.t = 1024000000L / ((long)format0.C);
                this.e.d(format0);
            }
        }
        else {
            parsableBitArray0.s(((int)LatmReader.f(parsableBitArray0)) - this.h(parsableBitArray0));
        }
        this.i(parsableBitArray0);
        boolean z = parsableBitArray0.g();
        this.q = z;
        this.r = 0L;
        if(z) {
            if(v == 1) {
                this.r = LatmReader.f(parsableBitArray0);
            }
            else {
                while(true) {
                    boolean z1 = parsableBitArray0.g();
                    this.r = (this.r << 8) + ((long)parsableBitArray0.h(8));
                    if(!z1) {
                        break;
                    }
                }
            }
        }
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(8);
        }
    }

    private void m(int v) {
        this.c.U(v);
        this.d.o(this.c.e());
    }
}

