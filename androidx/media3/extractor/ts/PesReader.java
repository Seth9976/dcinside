package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import h4.m;

@UnstableApi
public final class PesReader implements TsPayloadReader {
    private final ElementaryStreamReader d;
    private final ParsableBitArray e;
    private int f;
    private int g;
    private TimestampAdjuster h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private boolean n;
    private long o;
    private static final String p = "PesReader";
    private static final int q = 0;
    private static final int r = 1;
    private static final int s = 2;
    private static final int t = 3;
    private static final int u = 9;
    private static final int v = 10;
    private static final int w = 10;

    public PesReader(ElementaryStreamReader elementaryStreamReader0) {
        this.d = elementaryStreamReader0;
        this.e = new ParsableBitArray(new byte[10]);
        this.f = 0;
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void a(ParsableByteArray parsableByteArray0, int v) throws ParserException {
        Assertions.k(this.h);
        if((v & 1) != 0) {
            int v1 = this.f;
            if(v1 != 0 && v1 != 1) {
                switch(v1) {
                    case 2: {
                        Log.n("PesReader", "Unexpected start indicator reading extended header");
                        break;
                    }
                    case 3: {
                        if(this.m != -1) {
                            Log.n("PesReader", "Unexpected start indicator: expected " + this.m + " more bytes");
                        }
                        this.d.e(parsableByteArray0.g() == 0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException();
                    }
                }
            }
            this.h(1);
        }
        while(parsableByteArray0.a() > 0) {
            switch(this.f) {
                case 0: {
                    parsableByteArray0.Z(parsableByteArray0.a());
                    continue;
                }
                case 1: {
                    if(!this.e(parsableByteArray0, this.e.a, 9)) {
                        continue;
                    }
                    this.h((this.f() ? 2 : 0));
                    continue;
                }
                case 2: {
                    if(!this.e(parsableByteArray0, this.e.a, Math.min(10, this.l)) || !this.e(parsableByteArray0, null, this.l)) {
                        continue;
                    }
                    this.g();
                    v |= (this.n ? 4 : 0);
                    this.d.d(this.o, v);
                    this.h(3);
                    continue;
                }
                case 3: {
                    int v2 = parsableByteArray0.a();
                    int v3 = this.m == -1 ? 0 : v2 - this.m;
                    if(v3 > 0) {
                        v2 -= v3;
                        parsableByteArray0.X(parsableByteArray0.f() + v2);
                    }
                    this.d.a(parsableByteArray0);
                    int v4 = this.m;
                    if(v4 == -1) {
                        continue;
                    }
                    int v5 = v4 - v2;
                    this.m = v5;
                    if(v5 == 0) {
                        break;
                    }
                    continue;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.d.e(false);
            this.h(1);
        }
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void b() {
        this.f = 0;
        this.g = 0;
        this.k = false;
        this.d.b();
    }

    @Override  // androidx.media3.extractor.ts.TsPayloadReader
    public void c(TimestampAdjuster timestampAdjuster0, ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        this.h = timestampAdjuster0;
        this.d.c(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
    }

    // 去混淆评级： 低(20)
    public boolean d(boolean z) {
        return this.f == 3 && this.m == -1 && (!z || !(this.d instanceof H262Reader));
    }

    private boolean e(ParsableByteArray parsableByteArray0, @Nullable byte[] arr_b, int v) {
        int v1 = Math.min(parsableByteArray0.a(), v - this.g);
        if(v1 <= 0) {
            return true;
        }
        if(arr_b == null) {
            parsableByteArray0.Z(v1);
        }
        else {
            parsableByteArray0.n(arr_b, this.g, v1);
        }
        int v2 = this.g + v1;
        this.g = v2;
        return v2 == v;
    }

    private boolean f() {
        this.e.q(0);
        int v = this.e.h(24);
        if(v != 1) {
            Log.n("PesReader", "Unexpected start code prefix: " + v);
            this.m = -1;
            return false;
        }
        this.e.s(8);
        int v1 = this.e.h(16);
        this.e.s(5);
        this.n = this.e.g();
        this.e.s(2);
        this.i = this.e.g();
        this.j = this.e.g();
        this.e.s(6);
        int v2 = this.e.h(8);
        this.l = v2;
        if(v1 == 0) {
            this.m = -1;
            return true;
        }
        int v3 = v1 - 3 - v2;
        this.m = v3;
        if(v3 < 0) {
            Log.n("PesReader", "Found negative packet payload size: " + this.m);
            this.m = -1;
        }
        return true;
    }

    @m({"timestampAdjuster"})
    private void g() {
        this.e.q(0);
        this.o = 0x8000000000000001L;
        if(this.i) {
            this.e.s(4);
            long v = ((long)this.e.h(3)) << 30;
            this.e.s(1);
            int v1 = this.e.h(15);
            this.e.s(1);
            long v2 = v | ((long)(v1 << 15)) | ((long)this.e.h(15));
            this.e.s(1);
            if(!this.k && this.j) {
                this.e.s(4);
                long v3 = ((long)this.e.h(3)) << 30;
                this.e.s(1);
                int v4 = this.e.h(15);
                this.e.s(1);
                long v5 = v3 | ((long)(v4 << 15)) | ((long)this.e.h(15));
                this.e.s(1);
                this.h.b(v5);
                this.k = true;
            }
            this.o = this.h.b(v2);
        }
    }

    private void h(int v) {
        this.f = v;
        this.g = 0;
    }
}

