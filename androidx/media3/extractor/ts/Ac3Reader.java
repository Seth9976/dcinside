package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Ac3Util.SyncFrameInfo;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.m;

@UnstableApi
public final class Ac3Reader implements ElementaryStreamReader {
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
    private long j;
    private Format k;
    private int l;
    private long m;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 0x80;

    public Ac3Reader() {
        this(null, 0);
    }

    public Ac3Reader(@Nullable String s, int v) {
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(new byte[0x80]);
        this.a = parsableBitArray0;
        this.b = new ParsableByteArray(parsableBitArray0.a);
        this.g = 0;
        this.m = 0x8000000000000001L;
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
                    this.b.e()[0] = 11;
                    this.b.e()[1] = 0x77;
                    this.h = 2;
                    continue;
                }
                case 1: {
                    if(!this.f(parsableByteArray0, this.b.e(), 0x80)) {
                        continue;
                    }
                    this.g();
                    this.b.Y(0);
                    this.f.b(this.b, 0x80);
                    this.g = 2;
                    continue;
                }
                case 2: {
                    int v = Math.min(parsableByteArray0.a(), this.l - this.h);
                    this.f.b(parsableByteArray0, v);
                    int v1 = this.h + v;
                    this.h = v1;
                    if(v1 != this.l) {
                        continue;
                    }
                    if(this.m == 0x8000000000000001L) {
                        z = false;
                    }
                    break;
                }
                default: {
                    continue;
                }
            }
            Assertions.i(z);
            this.f.f(this.m, 1, this.l, 0, null);
            this.m += this.j;
            this.g = 0;
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.e = tsPayloadReader$TrackIdGenerator0.b();
        this.f = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.m = v;
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
        SyncFrameInfo ac3Util$SyncFrameInfo0 = Ac3Util.f(this.a);
        if(this.k == null || ac3Util$SyncFrameInfo0.d != this.k.B || ac3Util$SyncFrameInfo0.c != this.k.C || !Util.g(ac3Util$SyncFrameInfo0.a, this.k.n)) {
            Builder format$Builder0 = new Builder().a0(this.e).o0(ac3Util$SyncFrameInfo0.a).N(ac3Util$SyncFrameInfo0.d).p0(ac3Util$SyncFrameInfo0.c).e0(this.c).m0(this.d).j0(ac3Util$SyncFrameInfo0.g);
            if("audio/ac3".equals(ac3Util$SyncFrameInfo0.a)) {
                format$Builder0.M(ac3Util$SyncFrameInfo0.g);
            }
            Format format0 = format$Builder0.K();
            this.k = format0;
            this.f.d(format0);
        }
        this.l = ac3Util$SyncFrameInfo0.e;
        this.j = ((long)ac3Util$SyncFrameInfo0.f) * 1000000L / ((long)this.k.C);
    }

    private boolean h(ParsableByteArray parsableByteArray0) {
        while(true) {
            boolean z = false;
            if(parsableByteArray0.a() <= 0) {
                break;
            }
            if(this.i) {
                int v = parsableByteArray0.L();
                if(v == 0x77) {
                    this.i = false;
                    return true;
                }
                if(v == 11) {
                    z = true;
                }
            }
            else if(parsableByteArray0.L() == 11) {
                z = true;
            }
            this.i = z;
        }
        return false;
    }
}

