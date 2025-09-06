package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil.PpsData;
import androidx.media3.container.NalUnitUtil.SpsData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.container.ParsableNalUnitBitArray;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import h4.d;
import h4.m;
import java.util.ArrayList;
import java.util.Arrays;

@UnstableApi
public final class H264Reader implements ElementaryStreamReader {
    static final class SampleReader {
        static final class SliceHeaderData {
            private boolean a;
            private boolean b;
            @Nullable
            private SpsData c;
            private int d;
            private int e;
            private int f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;
            private boolean k;
            private int l;
            private int m;
            private int n;
            private int o;
            private int p;
            private static final int q = 2;
            private static final int r = 7;

            private SliceHeaderData() {
            }

            SliceHeaderData(androidx.media3.extractor.ts.H264Reader.1 h264Reader$10) {
            }

            public void b() {
                this.b = false;
                this.a = false;
            }

            private boolean c(SliceHeaderData h264Reader$SampleReader$SliceHeaderData0) {
                if(!this.a) {
                    return false;
                }
                if(!h264Reader$SampleReader$SliceHeaderData0.a) {
                    return true;
                }
                SpsData nalUnitUtil$SpsData0 = (SpsData)Assertions.k(this.c);
                SpsData nalUnitUtil$SpsData1 = (SpsData)Assertions.k(h264Reader$SampleReader$SliceHeaderData0.c);
                return this.f != h264Reader$SampleReader$SliceHeaderData0.f || this.g != h264Reader$SampleReader$SliceHeaderData0.g || this.h != h264Reader$SampleReader$SliceHeaderData0.h || this.i && h264Reader$SampleReader$SliceHeaderData0.i && this.j != h264Reader$SampleReader$SliceHeaderData0.j || this.d != h264Reader$SampleReader$SliceHeaderData0.d && (this.d == 0 || h264Reader$SampleReader$SliceHeaderData0.d == 0) || (nalUnitUtil$SpsData0.n == 0 && nalUnitUtil$SpsData1.n == 0 && (this.m != h264Reader$SampleReader$SliceHeaderData0.m || this.n != h264Reader$SampleReader$SliceHeaderData0.n) || nalUnitUtil$SpsData0.n == 1 && nalUnitUtil$SpsData1.n == 1 && (this.o != h264Reader$SampleReader$SliceHeaderData0.o || this.p != h264Reader$SampleReader$SliceHeaderData0.p)) || (this.k != h264Reader$SampleReader$SliceHeaderData0.k || this.k && this.l != h264Reader$SampleReader$SliceHeaderData0.l);
            }

            public boolean d() {
                return this.b && (this.e == 2 || this.e == 7);
            }

            public void e(SpsData nalUnitUtil$SpsData0, int v, int v1, int v2, int v3, boolean z, boolean z1, boolean z2, boolean z3, int v4, int v5, int v6, int v7, int v8) {
                this.c = nalUnitUtil$SpsData0;
                this.d = v;
                this.e = v1;
                this.f = v2;
                this.g = v3;
                this.h = z;
                this.i = z1;
                this.j = z2;
                this.k = z3;
                this.l = v4;
                this.m = v5;
                this.n = v6;
                this.o = v7;
                this.p = v8;
                this.a = true;
                this.b = true;
            }

            public void f(int v) {
                this.e = v;
                this.b = true;
            }
        }

        private final TrackOutput a;
        private final boolean b;
        private final boolean c;
        private final SparseArray d;
        private final SparseArray e;
        private final ParsableNalUnitBitArray f;
        private byte[] g;
        private int h;
        private int i;
        private long j;
        private boolean k;
        private long l;
        private SliceHeaderData m;
        private SliceHeaderData n;
        private boolean o;
        private long p;
        private long q;
        private boolean r;
        private boolean s;
        private static final int t = 0x80;

        public SampleReader(TrackOutput trackOutput0, boolean z, boolean z1) {
            this.a = trackOutput0;
            this.b = z;
            this.c = z1;
            this.d = new SparseArray();
            this.e = new SparseArray();
            this.m = new SliceHeaderData(null);
            this.n = new SliceHeaderData(null);
            byte[] arr_b = new byte[0x80];
            this.g = arr_b;
            this.f = new ParsableNalUnitBitArray(arr_b, 0, 0);
            this.h();
        }

        public void a(byte[] arr_b, int v, int v1) {
            int v15;
            int v14;
            int v13;
            int v12;
            int v9;
            boolean z2;
            boolean z1;
            boolean z;
            if(!this.k) {
                return;
            }
            int v2 = v1 - v;
            byte[] arr_b1 = this.g;
            int v3 = this.h;
            if(arr_b1.length < v3 + v2) {
                this.g = Arrays.copyOf(arr_b1, (v3 + v2) * 2);
            }
            System.arraycopy(arr_b, v, this.g, this.h, v2);
            int v4 = this.h + v2;
            this.h = v4;
            this.f.i(this.g, 0, v4);
            if(!this.f.b(8)) {
                return;
            }
            this.f.k();
            int v5 = this.f.e(2);
            this.f.l(5);
            if(!this.f.c()) {
                return;
            }
            this.f.h();
            if(!this.f.c()) {
                return;
            }
            int v6 = this.f.h();
            if(!this.c) {
                this.k = false;
                this.n.f(v6);
                return;
            }
            if(!this.f.c()) {
                return;
            }
            int v7 = this.f.h();
            if(this.e.indexOfKey(v7) < 0) {
                this.k = false;
                return;
            }
            PpsData nalUnitUtil$PpsData0 = (PpsData)this.e.get(v7);
            Object object0 = this.d.get(nalUnitUtil$PpsData0.b);
            if(((SpsData)object0).k) {
                if(!this.f.b(2)) {
                    return;
                }
                this.f.l(2);
            }
            if(!this.f.b(((SpsData)object0).m)) {
                return;
            }
            int v8 = this.f.e(((SpsData)object0).m);
            if(((SpsData)object0).l) {
                z = false;
                z2 = false;
                z1 = false;
            }
            else {
                if(!this.f.b(1)) {
                    return;
                }
                if(this.f.d()) {
                    if(!this.f.b(1)) {
                        return;
                    }
                    z = true;
                    z1 = this.f.d();
                    z2 = true;
                }
                else {
                    z = false;
                    z2 = false;
                    z1 = false;
                }
            }
            boolean z3 = this.i == 5;
            if(z3) {
                if(!this.f.c()) {
                    return;
                }
                v9 = this.f.h();
            }
            else {
                v9 = 0;
            }
            int v10 = ((SpsData)object0).n;
            if(v10 == 0) {
                if(!this.f.b(((SpsData)object0).o)) {
                    return;
                }
                int v11 = this.f.e(((SpsData)object0).o);
                if(!nalUnitUtil$PpsData0.c || z) {
                    v13 = v11;
                    v12 = 0;
                }
                else {
                    if(!this.f.c()) {
                        return;
                    }
                    v12 = this.f.g();
                    v13 = v11;
                }
                v14 = 0;
                v15 = 0;
            }
            else if(v10 != 1 || ((SpsData)object0).p) {
                v13 = 0;
                v12 = 0;
                v14 = 0;
                v15 = 0;
            }
            else {
                if(!this.f.c()) {
                    return;
                }
                int v16 = this.f.g();
                if(!nalUnitUtil$PpsData0.c || z) {
                    v14 = v16;
                    v13 = 0;
                    v12 = 0;
                    v15 = 0;
                }
                else {
                    if(!this.f.c()) {
                        return;
                    }
                    v15 = this.f.g();
                    v14 = v16;
                    v13 = 0;
                    v12 = 0;
                }
            }
            this.n.e(((SpsData)object0), v5, v6, v8, v7, z, z2, z1, z3, v9, v13, v12, v14, v15);
            this.k = false;
        }

        public void b(long v) {
            this.i();
            this.j = v;
            this.e(0);
            this.o = false;
        }

        public boolean c(long v, int v1, boolean z) {
            if(this.i == 9 || this.c && this.n.c(this.m)) {
                if(z && this.o) {
                    this.e(v1 + ((int)(v - this.j)));
                }
                this.p = this.j;
                this.q = this.l;
                this.r = false;
                this.o = true;
            }
            this.i();
            return this.r;
        }

        public boolean d() {
            return this.c;
        }

        private void e(int v) {
            long v1 = this.q;
            if(v1 == 0x8000000000000001L) {
                return;
            }
            this.a.f(v1, ((int)this.r), ((int)(this.j - this.p)), v, null);
        }

        public void f(PpsData nalUnitUtil$PpsData0) {
            this.e.append(nalUnitUtil$PpsData0.a, nalUnitUtil$PpsData0);
        }

        public void g(SpsData nalUnitUtil$SpsData0) {
            this.d.append(nalUnitUtil$SpsData0.d, nalUnitUtil$SpsData0);
        }

        public void h() {
            this.k = false;
            this.o = false;
            this.n.b();
        }

        private void i() {
            boolean z = this.b ? this.n.d() : this.s;
            this.r |= this.i == 5 || z && this.i == 1;
        }

        public void j(long v, int v1, long v2, boolean z) {
            this.i = v1;
            this.l = v2;
            this.j = v;
            this.s = z;
            if(this.b && v1 == 1 || this.c && (v1 == 1 || v1 == 5 || v1 == 2)) {
                SliceHeaderData h264Reader$SampleReader$SliceHeaderData0 = this.m;
                this.m = this.n;
                this.n = h264Reader$SampleReader$SliceHeaderData0;
                h264Reader$SampleReader$SliceHeaderData0.b();
                this.h = 0;
                this.k = true;
            }
        }
    }

    private final SeiReader a;
    private final boolean b;
    private final boolean c;
    private final NalUnitTargetBuffer d;
    private final NalUnitTargetBuffer e;
    private final NalUnitTargetBuffer f;
    private long g;
    private final boolean[] h;
    private String i;
    private TrackOutput j;
    private SampleReader k;
    private boolean l;
    private long m;
    private boolean n;
    private final ParsableByteArray o;

    public H264Reader(SeiReader seiReader0, boolean z, boolean z1) {
        this.a = seiReader0;
        this.b = z;
        this.c = z1;
        this.h = new boolean[3];
        this.d = new NalUnitTargetBuffer(7, 0x80);
        this.e = new NalUnitTargetBuffer(8, 0x80);
        this.f = new NalUnitTargetBuffer(6, 0x80);
        this.m = 0x8000000000000001L;
        this.o = new ParsableByteArray();
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        this.f();
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        byte[] arr_b = parsableByteArray0.e();
        this.g += (long)parsableByteArray0.a();
        this.j.b(parsableByteArray0, parsableByteArray0.a());
        int v2;
        while((v2 = NalUnitUtil.c(arr_b, v, v1, this.h)) != v1) {
            int v3 = NalUnitUtil.f(arr_b, v2);
            int v4 = v2 - v;
            if(v4 > 0) {
                this.h(arr_b, v, v2);
            }
            int v5 = v1 - v2;
            long v6 = this.g - ((long)v5);
            this.g(v6, v5, (v4 >= 0 ? 0 : -v4), this.m);
            this.i(v6, v3, this.m);
            v = v2 + 3;
        }
        this.h(arr_b, v, v1);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        this.g = 0L;
        this.n = false;
        this.m = 0x8000000000000001L;
        NalUnitUtil.a(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        SampleReader h264Reader$SampleReader0 = this.k;
        if(h264Reader$SampleReader0 != null) {
            h264Reader$SampleReader0.h();
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.i = tsPayloadReader$TrackIdGenerator0.b();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 2);
        this.j = trackOutput0;
        this.k = new SampleReader(trackOutput0, this.b, this.c);
        this.a.b(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.m = v;
        this.n |= (v1 & 2) != 0;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        this.f();
        if(z) {
            this.k.b(this.g);
        }
    }

    @d({"output", "sampleReader"})
    private void f() {
        Assertions.k(this.j);
    }

    @m({"output", "sampleReader"})
    private void g(long v, int v1, int v2, long v3) {
        if(!this.l || this.k.d()) {
            this.d.b(v2);
            this.e.b(v2);
            if(this.l) {
                if(this.d.c()) {
                    SpsData nalUnitUtil$SpsData1 = NalUnitUtil.l(this.d.d, 3, this.d.e);
                    this.k.g(nalUnitUtil$SpsData1);
                    this.d.d();
                }
                else if(this.e.c()) {
                    PpsData nalUnitUtil$PpsData1 = NalUnitUtil.j(this.e.d, 3, this.e.e);
                    this.k.f(nalUnitUtil$PpsData1);
                    this.e.d();
                }
            }
            else if(this.d.c() && this.e.c()) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(Arrays.copyOf(this.d.d, this.d.e));
                arrayList0.add(Arrays.copyOf(this.e.d, this.e.e));
                SpsData nalUnitUtil$SpsData0 = NalUnitUtil.l(this.d.d, 3, this.d.e);
                PpsData nalUnitUtil$PpsData0 = NalUnitUtil.j(this.e.d, 3, this.e.e);
                this.j.d(new Builder().a0(this.i).o0("video/avc").O(CodecSpecificDataUtil.a(nalUnitUtil$SpsData0.a, nalUnitUtil$SpsData0.b, nalUnitUtil$SpsData0.c)).v0(nalUnitUtil$SpsData0.f).Y(nalUnitUtil$SpsData0.g).P(new androidx.media3.common.ColorInfo.Builder().d(nalUnitUtil$SpsData0.q).c(nalUnitUtil$SpsData0.r).e(nalUnitUtil$SpsData0.s).g(nalUnitUtil$SpsData0.i + 8).b(nalUnitUtil$SpsData0.j + 8).a()).k0(nalUnitUtil$SpsData0.h).b0(arrayList0).g0(nalUnitUtil$SpsData0.t).K());
                this.l = true;
                this.k.g(nalUnitUtil$SpsData0);
                this.k.f(nalUnitUtil$PpsData0);
                this.d.d();
                this.e.d();
            }
        }
        if(this.f.b(v2)) {
            int v4 = NalUnitUtil.r(this.f.d, this.f.e);
            this.o.W(this.f.d, v4);
            this.o.Y(4);
            this.a.a(v3, this.o);
        }
        if(this.k.c(v, v1, this.l)) {
            this.n = false;
        }
    }

    @m({"sampleReader"})
    private void h(byte[] arr_b, int v, int v1) {
        if(!this.l || this.k.d()) {
            this.d.a(arr_b, v, v1);
            this.e.a(arr_b, v, v1);
        }
        this.f.a(arr_b, v, v1);
        this.k.a(arr_b, v, v1);
    }

    @m({"sampleReader"})
    private void i(long v, int v1, long v2) {
        if(!this.l || this.k.d()) {
            this.d.e(v1);
            this.e.e(v1);
        }
        this.f.e(v1);
        this.k.j(v, v1, v2, this.n);
    }

    class androidx.media3.extractor.ts.H264Reader.1 {
    }

}

