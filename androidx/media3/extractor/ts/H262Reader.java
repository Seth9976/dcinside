package androidx.media3.extractor.ts;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;

@UnstableApi
public final class H262Reader implements ElementaryStreamReader {
    static final class CsdBuffer {
        private boolean a;
        public int b;
        public int c;
        public byte[] d;
        private static final byte[] e;

        static {
            CsdBuffer.e = new byte[]{0, 0, 1};
        }

        public CsdBuffer(int v) {
            this.d = new byte[v];
        }

        public void a(byte[] arr_b, int v, int v1) {
            if(!this.a) {
                return;
            }
            int v2 = v1 - v;
            byte[] arr_b1 = this.d;
            int v3 = this.b;
            if(arr_b1.length < v3 + v2) {
                this.d = Arrays.copyOf(arr_b1, (v3 + v2) * 2);
            }
            System.arraycopy(arr_b, v, this.d, this.b, v2);
            this.b += v2;
        }

        public boolean b(int v, int v1) {
            if(this.a) {
                int v2 = this.b - v1;
                this.b = v2;
                if(this.c == 0 && v == 0xB5) {
                    this.c = v2;
                    this.a(CsdBuffer.e, 0, CsdBuffer.e.length);
                    return false;
                }
                this.a = false;
                return true;
            }
            else if(v == 0xB3) {
                this.a = true;
            }
            this.a(CsdBuffer.e, 0, CsdBuffer.e.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    private String a;
    private TrackOutput b;
    @Nullable
    private final UserDataReader c;
    @Nullable
    private final ParsableByteArray d;
    @Nullable
    private final NalUnitTargetBuffer e;
    private final boolean[] f;
    private final CsdBuffer g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private static final int q = 0;
    private static final int r = 0xB3;
    private static final int s = 0xB5;
    private static final int t = 0xB8;
    private static final int u = 0xB2;
    private static final double[] v;

    static {
        H262Reader.v = new double[]{23.976024, 24.0, 25.0, 29.97003, 30.0, 50.0, 59.94006, 60.0};
    }

    public H262Reader() {
        this(null);
    }

    H262Reader(@Nullable UserDataReader userDataReader0) {
        this.c = userDataReader0;
        this.f = new boolean[4];
        this.g = new CsdBuffer(0x80);
        if(userDataReader0 == null) {
            this.e = null;
            this.d = null;
        }
        else {
            this.e = new NalUnitTargetBuffer(0xB2, 0x80);
            this.d = new ParsableByteArray();
        }
        this.l = 0x8000000000000001L;
        this.n = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        int v9;
        int v5;
        Assertions.k(this.b);
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        byte[] arr_b = parsableByteArray0.e();
        this.h += (long)parsableByteArray0.a();
        this.b.b(parsableByteArray0, parsableByteArray0.a());
        int v2;
        while((v2 = NalUnitUtil.c(arr_b, v, v1, this.f)) != v1) {
            int v3 = parsableByteArray0.e()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            boolean z = false;
            if(!this.j) {
                if(v4 > 0) {
                    this.g.a(arr_b, v, v2);
                }
                if(this.g.b(v3, (v4 >= 0 ? 0 : -v4))) {
                    String s = (String)Assertions.g(this.a);
                    Pair pair0 = H262Reader.f(this.g, s);
                    this.b.d(((Format)pair0.first));
                    this.k = (long)(((Long)pair0.second));
                    this.j = true;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer0 = this.e;
            if(nalUnitTargetBuffer0 != null) {
                if(v4 > 0) {
                    nalUnitTargetBuffer0.a(arr_b, v, v2);
                    v5 = 0;
                }
                else {
                    v5 = -v4;
                }
                if(this.e.b(v5)) {
                    int v6 = NalUnitUtil.r(this.e.d, this.e.e);
                    this.d.W(this.e.d, v6);
                    this.c.a(this.n, this.d);
                }
                if(v3 == 0xB2 && parsableByteArray0.e()[v2 + 2] == 1) {
                    this.e.e(0xB2);
                }
            }
            switch(v3) {
                case 0: 
                case 0xB3: {
                    int v7 = v1 - v2;
                    if(!this.p || !this.j) {
                        v9 = v3;
                    }
                    else {
                        long v8 = this.n;
                        if(v8 != 0x8000000000000001L) {
                            v9 = v3;
                            this.b.f(v8, ((int)this.o), ((int)(this.h - this.m)) - v7, v7, null);
                        }
                    }
                    if(!this.i || this.p) {
                        this.m = this.h - ((long)v7);
                        long v10 = this.l;
                        if(v10 == 0x8000000000000001L) {
                            v10 = this.n == 0x8000000000000001L ? 0x8000000000000001L : this.n + this.k;
                        }
                        this.n = v10;
                        this.o = false;
                        this.l = 0x8000000000000001L;
                        this.i = true;
                    }
                    if(v9 == 0) {
                        z = true;
                    }
                    this.p = z;
                    break;
                }
                case 0xB8: {
                    this.o = true;
                }
            }
            v = v2 + 3;
        }
        if(!this.j) {
            this.g.a(arr_b, v, v1);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer1 = this.e;
        if(nalUnitTargetBuffer1 != null) {
            nalUnitTargetBuffer1.a(arr_b, v, v1);
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        NalUnitUtil.a(this.f);
        this.g.c();
        NalUnitTargetBuffer nalUnitTargetBuffer0 = this.e;
        if(nalUnitTargetBuffer0 != null) {
            nalUnitTargetBuffer0.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = 0x8000000000000001L;
        this.n = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.a = tsPayloadReader$TrackIdGenerator0.b();
        this.b = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 2);
        UserDataReader userDataReader0 = this.c;
        if(userDataReader0 != null) {
            userDataReader0.b(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.l = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        Assertions.k(this.b);
        if(z) {
            this.b.f(this.n, ((int)this.o), ((int)(this.h - this.m)), 0, null);
        }
    }

    private static Pair f(CsdBuffer h262Reader$CsdBuffer0, String s) {
        float f;
        byte[] arr_b = Arrays.copyOf(h262Reader$CsdBuffer0.d, h262Reader$CsdBuffer0.b);
        int v = (arr_b[4] & 0xFF) << 4 | (arr_b[5] & 0xFF) >> 4;
        int v1 = (arr_b[5] & 15) << 8 | arr_b[6] & 0xFF;
        int v2 = (arr_b[7] & 0xF0) >> 4;
        if(v2 == 2) {
            f = ((float)(v1 * 4)) / ((float)(v * 3));
        }
        else {
            switch(v2) {
                case 3: {
                    f = ((float)(v1 * 16)) / ((float)(v * 9));
                    break;
                }
                case 4: {
                    f = ((float)(v1 * 0x79)) / ((float)(v * 100));
                    break;
                }
                default: {
                    f = 1.0f;
                }
            }
        }
        Format format0 = new Builder().a0(s).o0("video/mpeg2").v0(v).Y(v1).k0(f).b0(Collections.singletonList(arr_b)).K();
        int v3 = (arr_b[7] & 15) - 1;
        if(v3 >= 0) {
            double[] arr_f = H262Reader.v;
            if(v3 < arr_f.length) {
                double f1 = arr_f[v3];
                int v4 = arr_b[h262Reader$CsdBuffer0.c + 9];
                int v5 = (v4 & 0x60) >> 5;
                if(v5 != (v4 & 0x1F)) {
                    f1 *= (((double)v5) + 1.0) / ((double)((v4 & 0x1F) + 1));
                }
                return Pair.create(format0, ((long)(1000000.0 / f1)));
            }
        }
        return Pair.create(format0, 0L);
    }
}

