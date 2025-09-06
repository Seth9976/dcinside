package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.AacUtil.Config;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.d;
import h4.m;
import java.util.Arrays;
import java.util.Collections;

@UnstableApi
public final class AdtsReader implements ElementaryStreamReader {
    private static final int A = 3;
    private static final int B = 4;
    private static final int C = 5;
    private static final int D = 2;
    private static final int E = 8;
    private static final int F = 0x100;
    private static final int G = 0x200;
    private static final int H = 0x300;
    private static final int I = 0x400;
    private static final int J = 10;
    private static final int K = 6;
    private static final byte[] L = null;
    private static final int M = -1;
    private final boolean a;
    private final ParsableBitArray b;
    private final ParsableByteArray c;
    @Nullable
    private final String d;
    private final int e;
    private String f;
    private TrackOutput g;
    private TrackOutput h;
    private int i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private long r;
    private int s;
    private long t;
    private TrackOutput u;
    private long v;
    private static final String w = "AdtsReader";
    private static final int x = 0;
    private static final int y = 1;
    private static final int z = 2;

    static {
        AdtsReader.L = new byte[]{73, 68, 51};
    }

    public AdtsReader(boolean z) {
        this(z, null, 0);
    }

    public AdtsReader(boolean z, @Nullable String s, int v) {
        this.b = new ParsableBitArray(new byte[7]);
        this.c = new ParsableByteArray(Arrays.copyOf(AdtsReader.L, 10));
        this.s();
        this.n = -1;
        this.o = -1;
        this.r = 0x8000000000000001L;
        this.t = 0x8000000000000001L;
        this.a = z;
        this.d = s;
        this.e = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) throws ParserException {
        this.f();
        while(parsableByteArray0.a() > 0) {
            switch(this.i) {
                case 0: {
                    this.j(parsableByteArray0);
                    break;
                }
                case 1: {
                    this.g(parsableByteArray0);
                    break;
                }
                case 2: {
                    if(!this.i(parsableByteArray0, this.c.e(), 10)) {
                        continue;
                    }
                    this.o();
                    break;
                }
                case 3: {
                    if(!this.i(parsableByteArray0, this.b.a, (this.l ? 7 : 5))) {
                        continue;
                    }
                    this.n();
                    break;
                }
                case 4: {
                    this.p(parsableByteArray0);
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
        this.t = 0x8000000000000001L;
        this.q();
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.f = tsPayloadReader$TrackIdGenerator0.b();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 1);
        this.g = trackOutput0;
        this.u = trackOutput0;
        if(this.a) {
            tsPayloadReader$TrackIdGenerator0.a();
            TrackOutput trackOutput1 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 5);
            this.h = trackOutput1;
            trackOutput1.d(new Builder().a0(tsPayloadReader$TrackIdGenerator0.b()).o0("application/id3").K());
            return;
        }
        this.h = new DiscardingTrackOutput();
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.t = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
    }

    @d({"output", "currentOutput", "id3Output"})
    private void f() {
        Assertions.g(this.g);
    }

    private void g(ParsableByteArray parsableByteArray0) {
        if(parsableByteArray0.a() == 0) {
            return;
        }
        this.b.a[0] = parsableByteArray0.e()[parsableByteArray0.f()];
        this.b.q(2);
        int v = this.b.h(4);
        if(this.o != -1 && v != this.o) {
            this.q();
            return;
        }
        if(!this.m) {
            this.m = true;
            this.n = this.p;
            this.o = v;
        }
        this.t();
    }

    private boolean h(ParsableByteArray parsableByteArray0, int v) {
        parsableByteArray0.Y(v + 1);
        if(!this.w(parsableByteArray0, this.b.a, 1)) {
            return false;
        }
        this.b.q(4);
        int v1 = this.b.h(1);
        if(this.n != -1 && v1 != this.n) {
            return false;
        }
        if(this.o != -1) {
            if(!this.w(parsableByteArray0, this.b.a, 1)) {
                return true;
            }
            this.b.q(2);
            if(this.b.h(4) != this.o) {
                return false;
            }
            parsableByteArray0.Y(v + 2);
        }
        if(!this.w(parsableByteArray0, this.b.a, 4)) {
            return true;
        }
        this.b.q(14);
        int v2 = this.b.h(13);
        if(v2 < 7) {
            return false;
        }
        byte[] arr_b = parsableByteArray0.e();
        int v3 = parsableByteArray0.g();
        int v4 = v + v2;
        if(v4 >= v3) {
            return true;
        }
        int v5 = arr_b[v4];
        if(v5 == -1) {
            return v4 + 1 == v3 ? true : this.l(-1, arr_b[v4 + 1]) && (arr_b[v4 + 1] & 8) >> 3 == v1;
        }
        if(v5 != 73) {
            return false;
        }
        if(v4 + 1 == v3) {
            return true;
        }
        if(arr_b[v4 + 1] != 68) {
            return false;
        }
        return v4 + 2 == v3 ? true : arr_b[v4 + 2] == 51;
    }

    private boolean i(ParsableByteArray parsableByteArray0, byte[] arr_b, int v) {
        int v1 = Math.min(parsableByteArray0.a(), v - this.j);
        parsableByteArray0.n(arr_b, this.j, v1);
        int v2 = this.j + v1;
        this.j = v2;
        return v2 == v;
    }

    private void j(ParsableByteArray parsableByteArray0) {
        byte[] arr_b = parsableByteArray0.e();
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        while(v < v1) {
            int v2 = arr_b[v];
            if(this.k == 0x200 && this.l(-1, ((byte)(v2 & 0xFF))) && (this.m || this.h(parsableByteArray0, v - 1))) {
                this.p = (v2 & 8) >> 3;
                this.l = (v2 & 1) == 0;
                if(this.m) {
                    this.t();
                }
                else {
                    this.r();
                }
                parsableByteArray0.Y(v + 1);
                return;
            }
            int v3 = this.k;
            switch(v2 & 0xFF | v3) {
                case 329: {
                    this.k = 0x300;
                    break;
                }
                case 0x1FF: {
                    this.k = 0x200;
                    break;
                }
                case 836: {
                    this.k = 0x400;
                    break;
                }
                case 1075: {
                    this.u();
                    parsableByteArray0.Y(v + 1);
                    return;
                label_20:
                    if(v3 != 0x100) {
                        this.k = 0x100;
                        continue;
                    }
                    break;
                }
                default: {
                    goto label_20;
                }
            }
            ++v;
        }
        parsableByteArray0.Y(v);
    }

    public long k() {
        return this.r;
    }

    private boolean l(byte b, byte b1) {
        return AdtsReader.m((b & 0xFF) << 8 | b1 & 0xFF);
    }

    public static boolean m(int v) {
        return (v & 0xFFF6) == 0xFFF0;
    }

    @m({"output"})
    private void n() throws ParserException {
        this.b.q(0);
        if(this.q) {
            this.b.s(10);
        }
        else {
            int v = this.b.h(2);
            if(v + 1 != 2) {
                Log.n("AdtsReader", "Detected audio object type: " + (v + 1) + ", but assuming AAC LC.");
            }
            this.b.s(5);
            int v1 = this.b.h(3);
            byte[] arr_b = AacUtil.b(2, this.o, v1);
            Config aacUtil$Config0 = AacUtil.f(arr_b);
            Format format0 = new Builder().a0(this.f).o0("audio/mp4a-latm").O(aacUtil$Config0.c).N(aacUtil$Config0.b).p0(aacUtil$Config0.a).b0(Collections.singletonList(arr_b)).e0(this.d).m0(this.e).K();
            this.r = 1024000000L / ((long)format0.C);
            this.g.d(format0);
            this.q = true;
        }
        this.b.s(4);
        int v2 = this.b.h(13);
        this.v(this.g, this.r, 0, (this.l ? v2 - 9 : v2 - 7));
    }

    @m({"id3Output"})
    private void o() {
        this.h.b(this.c, 10);
        this.c.Y(6);
        this.v(this.h, 0L, 10, this.c.K() + 10);
    }

    @m({"currentOutput"})
    private void p(ParsableByteArray parsableByteArray0) {
        int v = Math.min(parsableByteArray0.a(), this.s - this.j);
        this.u.b(parsableByteArray0, v);
        int v1 = this.j + v;
        this.j = v1;
        if(v1 == this.s) {
            Assertions.i(this.t != 0x8000000000000001L);
            this.u.f(this.t, 1, this.s, 0, null);
            this.t += this.v;
            this.s();
        }
    }

    private void q() {
        this.m = false;
        this.s();
    }

    private void r() {
        this.i = 1;
        this.j = 0;
    }

    private void s() {
        this.i = 0;
        this.j = 0;
        this.k = 0x100;
    }

    private void t() {
        this.i = 3;
        this.j = 0;
    }

    private void u() {
        this.i = 2;
        this.j = AdtsReader.L.length;
        this.s = 0;
        this.c.Y(0);
    }

    private void v(TrackOutput trackOutput0, long v, int v1, int v2) {
        this.i = 4;
        this.j = v1;
        this.u = trackOutput0;
        this.v = v;
        this.s = v2;
    }

    private boolean w(ParsableByteArray parsableByteArray0, byte[] arr_b, int v) {
        if(parsableByteArray0.a() < v) {
            return false;
        }
        parsableByteArray0.n(arr_b, 0, v);
        return true;
    }
}

