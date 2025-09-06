package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Ac4Util.SyncFrameInfo;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.m;

@UnstableApi
public final class Ac4Reader implements ElementaryStreamReader {
    private final ParsableBitArray a;
    private final ParsableByteArray b;
    @Nullable
    private final String c;
    private final int d;
    private String e;
    private TrackOutput f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private long k;
    private Format l;
    private int m;
    private long n;
    private static final int o = 0;
    private static final int p = 1;
    private static final int q = 2;

    public Ac4Reader() {
        this(null, 0);
    }

    public Ac4Reader(@Nullable String s, int v) {
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(new byte[16]);
        this.a = parsableBitArray0;
        this.b = new ParsableByteArray(parsableBitArray0.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = 0x8000000000000001L;
        this.c = s;
        this.d = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        Assertions.k(this.f);
        while(parsableByteArray0.a() > 0) {
            boolean z = true;
            switch(this.g) {
                case 0: {
                    if(!this.h(parsableByteArray0)) {
                        continue;
                    }
                    this.g = 1;
                    this.b.e()[0] = -84;
                    this.b.e()[1] = (byte)(this.j ? 65 : 0x40);
                    this.h = 2;
                    continue;
                }
                case 1: {
                    if(!this.f(parsableByteArray0, this.b.e(), 16)) {
                        continue;
                    }
                    this.g();
                    this.b.Y(0);
                    this.f.b(this.b, 16);
                    this.g = 2;
                    continue;
                }
                case 2: {
                    int v = Math.min(parsableByteArray0.a(), this.m - this.h);
                    this.f.b(parsableByteArray0, v);
                    int v1 = this.h + v;
                    this.h = v1;
                    if(v1 != this.m) {
                        continue;
                    }
                    if(this.n == 0x8000000000000001L) {
                        z = false;
                    }
                    break;
                }
                default: {
                    continue;
                }
            }
            Assertions.i(z);
            this.f.f(this.n, 1, this.m, 0, null);
            this.n += this.k;
            this.g = 0;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.j = false;
        this.n = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.e = tsPayloadReader$TrackIdGenerator0.b();
        this.f = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.n = v;
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
        this.a.q(0);
        SyncFrameInfo ac4Util$SyncFrameInfo0 = Ac4Util.d(this.a);
        if(this.l == null || ac4Util$SyncFrameInfo0.c != this.l.B || ac4Util$SyncFrameInfo0.b != this.l.C || !"audio/ac4".equals(this.l.n)) {
            Format format0 = new Builder().a0(this.e).o0("audio/ac4").N(ac4Util$SyncFrameInfo0.c).p0(ac4Util$SyncFrameInfo0.b).e0(this.c).m0(this.d).K();
            this.l = format0;
            this.f.d(format0);
        }
        this.m = ac4Util$SyncFrameInfo0.d;
        this.k = ((long)ac4Util$SyncFrameInfo0.e) * 1000000L / ((long)this.l.C);
    }

    private boolean h(ParsableByteArray parsableByteArray0) {
        while(true) {
            boolean z = false;
            if(parsableByteArray0.a() <= 0) {
                break;
            }
            if(this.i) {
                int v = parsableByteArray0.L();
                this.i = v == 0xAC;
                if(v == 0x40 || v == 65) {
                    if(v == 65) {
                        z = true;
                    }
                    this.j = z;
                    return true;
                }
            }
            else {
                if(parsableByteArray0.L() == 0xAC) {
                    z = true;
                }
                this.i = z;
            }
        }
        return false;
    }
}

