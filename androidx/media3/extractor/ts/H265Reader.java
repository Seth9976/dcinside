package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil.H265SpsData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.d;
import h4.m;
import java.util.Collections;

@UnstableApi
public final class H265Reader implements ElementaryStreamReader {
    static final class SampleReader {
        private final TrackOutput a;
        private long b;
        private boolean c;
        private int d;
        private long e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;
        private static final int n = 2;

        public SampleReader(TrackOutput trackOutput0) {
            this.a = trackOutput0;
        }

        public void a(long v) {
            this.m = this.c;
            this.e(((int)(v - this.b)));
            this.k = this.b;
            this.b = v;
            this.e(0);
            this.i = false;
        }

        public void b(long v, int v1, boolean z) {
            if(this.j && this.g) {
                this.m = this.c;
                this.j = false;
                return;
            }
            if(this.h || this.g) {
                if(z && this.i) {
                    this.e(v1 + ((int)(v - this.b)));
                }
                this.k = this.b;
                this.l = this.e;
                this.m = this.c;
                this.i = true;
            }
        }

        // 去混淆评级： 低(20)
        private static boolean c(int v) {
            return 0x20 <= v && v <= 35 || v == 39;
        }

        private static boolean d(int v) {
            return v < 0x20 || v == 40;
        }

        private void e(int v) {
            long v1 = this.l;
            if(v1 == 0x8000000000000001L) {
                return;
            }
            this.a.f(v1, ((int)this.m), ((int)(this.b - this.k)), v, null);
        }

        public void f(byte[] arr_b, int v, int v1) {
            if(this.f) {
                int v2 = this.d;
                int v3 = v + 2 - v2;
                if(v3 < v1) {
                    this.g = (arr_b[v3] & 0x80) != 0;
                    this.f = false;
                    return;
                }
                this.d = v2 + (v1 - v);
            }
        }

        public void g() {
            this.f = false;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public void h(long v, int v1, int v2, long v3, boolean z) {
            boolean z1 = false;
            this.g = false;
            this.h = false;
            this.e = v3;
            this.d = 0;
            this.b = v;
            if(!SampleReader.d(v2)) {
                if(this.i && !this.j) {
                    if(z) {
                        this.e(v1);
                    }
                    this.i = false;
                }
                if(SampleReader.c(v2)) {
                    this.h = !this.j;
                    this.j = true;
                }
            }
            boolean z2 = v2 >= 16 && v2 <= 21;
            this.c = z2;
            if(z2 || v2 <= 9) {
                z1 = true;
            }
            this.f = z1;
        }
    }

    private final SeiReader a;
    private String b;
    private TrackOutput c;
    private SampleReader d;
    private boolean e;
    private final boolean[] f;
    private final NalUnitTargetBuffer g;
    private final NalUnitTargetBuffer h;
    private final NalUnitTargetBuffer i;
    private final NalUnitTargetBuffer j;
    private final NalUnitTargetBuffer k;
    private long l;
    private long m;
    private final ParsableByteArray n;
    private static final String o = "H265Reader";
    private static final int p = 9;
    private static final int q = 16;
    private static final int r = 21;
    private static final int s = 0x20;
    private static final int t = 33;
    private static final int u = 34;
    private static final int v = 35;
    private static final int w = 39;
    private static final int x = 40;

    public H265Reader(SeiReader seiReader0) {
        this.a = seiReader0;
        this.f = new boolean[3];
        this.g = new NalUnitTargetBuffer(0x20, 0x80);
        this.h = new NalUnitTargetBuffer(33, 0x80);
        this.i = new NalUnitTargetBuffer(34, 0x80);
        this.j = new NalUnitTargetBuffer(39, 0x80);
        this.k = new NalUnitTargetBuffer(40, 0x80);
        this.m = 0x8000000000000001L;
        this.n = new ParsableByteArray();
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        this.f();
        while(parsableByteArray0.a() > 0) {
            int v = parsableByteArray0.f();
            int v1 = parsableByteArray0.g();
            byte[] arr_b = parsableByteArray0.e();
            this.l += (long)parsableByteArray0.a();
            this.c.b(parsableByteArray0, parsableByteArray0.a());
            while(v < v1) {
                int v2 = NalUnitUtil.c(arr_b, v, v1, this.f);
                if(v2 == v1) {
                    this.h(arr_b, v, v1);
                    return;
                }
                int v3 = NalUnitUtil.e(arr_b, v2);
                int v4 = v2 - v;
                if(v4 > 0) {
                    this.h(arr_b, v, v2);
                }
                int v5 = v1 - v2;
                long v6 = this.l - ((long)v5);
                this.g(v6, v5, (v4 >= 0 ? 0 : -v4), this.m);
                this.j(v6, v5, v3, this.m);
                v = v2 + 3;
            }
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.l = 0L;
        this.m = 0x8000000000000001L;
        NalUnitUtil.a(this.f);
        this.g.d();
        this.h.d();
        this.i.d();
        this.j.d();
        this.k.d();
        SampleReader h265Reader$SampleReader0 = this.d;
        if(h265Reader$SampleReader0 != null) {
            h265Reader$SampleReader0.g();
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.b = tsPayloadReader$TrackIdGenerator0.b();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 2);
        this.c = trackOutput0;
        this.d = new SampleReader(trackOutput0);
        this.a.b(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.m = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        this.f();
        if(z) {
            this.d.a(this.l);
        }
    }

    @d({"output", "sampleReader"})
    private void f() {
        Assertions.k(this.c);
    }

    @m({"output", "sampleReader"})
    private void g(long v, int v1, int v2, long v3) {
        this.d.b(v, v1, this.e);
        if(!this.e) {
            this.g.b(v2);
            this.h.b(v2);
            this.i.b(v2);
            if(this.g.c() && this.h.c() && this.i.c()) {
                this.c.d(H265Reader.i(this.b, this.g, this.h, this.i));
                this.e = true;
            }
        }
        if(this.j.b(v2)) {
            int v4 = NalUnitUtil.r(this.j.d, this.j.e);
            this.n.W(this.j.d, v4);
            this.n.Z(5);
            this.a.a(v3, this.n);
        }
        if(this.k.b(v2)) {
            int v5 = NalUnitUtil.r(this.k.d, this.k.e);
            this.n.W(this.k.d, v5);
            this.n.Z(5);
            this.a.a(v3, this.n);
        }
    }

    @m({"sampleReader"})
    private void h(byte[] arr_b, int v, int v1) {
        this.d.f(arr_b, v, v1);
        if(!this.e) {
            this.g.a(arr_b, v, v1);
            this.h.a(arr_b, v, v1);
            this.i.a(arr_b, v, v1);
        }
        this.j.a(arr_b, v, v1);
        this.k.a(arr_b, v, v1);
    }

    private static Format i(@Nullable String s, NalUnitTargetBuffer nalUnitTargetBuffer0, NalUnitTargetBuffer nalUnitTargetBuffer1, NalUnitTargetBuffer nalUnitTargetBuffer2) {
        int v = nalUnitTargetBuffer0.e;
        byte[] arr_b = new byte[nalUnitTargetBuffer1.e + v + nalUnitTargetBuffer2.e];
        System.arraycopy(nalUnitTargetBuffer0.d, 0, arr_b, 0, v);
        System.arraycopy(nalUnitTargetBuffer1.d, 0, arr_b, nalUnitTargetBuffer0.e, nalUnitTargetBuffer1.e);
        System.arraycopy(nalUnitTargetBuffer2.d, 0, arr_b, nalUnitTargetBuffer0.e + nalUnitTargetBuffer1.e, nalUnitTargetBuffer2.e);
        H265SpsData nalUnitUtil$H265SpsData0 = NalUnitUtil.h(nalUnitTargetBuffer1.d, 3, nalUnitTargetBuffer1.e);
        String s1 = CodecSpecificDataUtil.c(nalUnitUtil$H265SpsData0.a, nalUnitUtil$H265SpsData0.b, nalUnitUtil$H265SpsData0.c, nalUnitUtil$H265SpsData0.d, nalUnitUtil$H265SpsData0.h, nalUnitUtil$H265SpsData0.i);
        return new Builder().a0(s).o0("video/hevc").O(s1).v0(nalUnitUtil$H265SpsData0.k).Y(nalUnitUtil$H265SpsData0.l).P(new androidx.media3.common.ColorInfo.Builder().d(nalUnitUtil$H265SpsData0.o).c(nalUnitUtil$H265SpsData0.p).e(nalUnitUtil$H265SpsData0.q).g(nalUnitUtil$H265SpsData0.f + 8).b(nalUnitUtil$H265SpsData0.g + 8).a()).k0(nalUnitUtil$H265SpsData0.m).g0(nalUnitUtil$H265SpsData0.n).b0(Collections.singletonList(arr_b)).K();
    }

    @m({"sampleReader"})
    private void j(long v, int v1, int v2, long v3) {
        this.d.h(v, v1, v2, v3, this.e);
        if(!this.e) {
            this.g.e(v2);
            this.h.e(v2);
            this.i.e(v2);
        }
        this.j.e(v2);
        this.k.e(v2);
    }
}

