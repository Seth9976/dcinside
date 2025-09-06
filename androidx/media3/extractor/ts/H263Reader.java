package androidx.media3.extractor.ts;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.util.Arrays;
import java.util.Collections;

@UnstableApi
public final class H263Reader implements ElementaryStreamReader {
    static final class CsdBuffer {
        private boolean a;
        private int b;
        public int c;
        public int d;
        public byte[] e;
        private static final byte[] f = null;
        private static final int g = 0;
        private static final int h = 1;
        private static final int i = 2;
        private static final int j = 3;
        private static final int k = 4;

        static {
            CsdBuffer.f = new byte[]{0, 0, 1};
        }

        public CsdBuffer(int v) {
            this.e = new byte[v];
        }

        public void a(byte[] arr_b, int v, int v1) {
            if(!this.a) {
                return;
            }
            int v2 = v1 - v;
            byte[] arr_b1 = this.e;
            int v3 = this.c;
            if(arr_b1.length < v3 + v2) {
                this.e = Arrays.copyOf(arr_b1, (v3 + v2) * 2);
            }
            System.arraycopy(arr_b, v, this.e, this.c, v2);
            this.c += v2;
        }

        public boolean b(int v, int v1) {
            switch(this.b) {
                case 0: {
                    if(v == 0xB0) {
                        this.b = 1;
                        this.a = true;
                    }
                    break;
                }
                case 1: {
                    if(v == 0xB5) {
                        this.b = 2;
                    }
                    else {
                        Log.n("H263Reader", "Unexpected start code value");
                        this.c();
                    }
                    break;
                }
                case 2: {
                    if(v > 0x1F) {
                        Log.n("H263Reader", "Unexpected start code value");
                        this.c();
                    }
                    else {
                        this.b = 3;
                    }
                    break;
                }
                case 3: {
                    if((v & 0xF0) == 0x20) {
                        this.d = this.c;
                        this.b = 4;
                    }
                    else {
                        Log.n("H263Reader", "Unexpected start code value");
                        this.c();
                    }
                    break;
                }
                case 4: {
                    if(v == 0xB3 || v == 0xB5) {
                        this.c -= v1;
                        this.a = false;
                        return true;
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
            this.a(CsdBuffer.f, 0, CsdBuffer.f.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    static final class SampleReader {
        private final TrackOutput a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;
        private static final int i = 1;
        private static final int j;

        public SampleReader(TrackOutput trackOutput0) {
            this.a = trackOutput0;
        }

        public void a(byte[] arr_b, int v, int v1) {
            if(this.c) {
                int v2 = this.f;
                int v3 = v + 1 - v2;
                if(v3 < v1) {
                    this.d = (arr_b[v3] & 0xC0) >> 6 == 0;
                    this.c = false;
                    return;
                }
                this.f = v2 + (v1 - v);
            }
        }

        public void b(long v, int v1, boolean z) {
            Assertions.i(this.h != 0x8000000000000001L);
            if(this.e == 0xB6 && z && this.b) {
                this.a.f(this.h, ((int)this.d), ((int)(v - this.g)), v1, null);
            }
            if(this.e != 0xB3) {
                this.g = v;
            }
        }

        public void c(int v, long v1) {
            this.e = v;
            this.d = false;
            boolean z = true;
            this.b = v == 0xB3 || v == 0xB6;
            if(v != 0xB6) {
                z = false;
            }
            this.c = z;
            this.f = 0;
            this.h = v1;
        }

        public void d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    @Nullable
    private final UserDataReader a;
    @Nullable
    private final ParsableByteArray b;
    private final boolean[] c;
    private final CsdBuffer d;
    @Nullable
    private final NalUnitTargetBuffer e;
    private SampleReader f;
    private long g;
    private String h;
    private TrackOutput i;
    private boolean j;
    private long k;
    private static final String l = "H263Reader";
    private static final int m = 0xB0;
    private static final int n = 0xB2;
    private static final int o = 0xB3;
    private static final int p = 0xB5;
    private static final int q = 0xB6;
    private static final int r = 0x1F;
    private static final int s = -1;
    private static final float[] t;
    private static final int u;

    static {
        H263Reader.t = new float[]{1.0f, 1.0f, 1.090909f, 0.909091f, 1.454545f, 1.212121f, 1.0f};
    }

    public H263Reader() {
        this(null);
    }

    H263Reader(@Nullable UserDataReader userDataReader0) {
        this.a = userDataReader0;
        this.c = new boolean[4];
        this.d = new CsdBuffer(0x80);
        this.k = 0x8000000000000001L;
        if(userDataReader0 != null) {
            this.e = new NalUnitTargetBuffer(0xB2, 0x80);
            this.b = new ParsableByteArray();
            return;
        }
        this.e = null;
        this.b = null;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void a(ParsableByteArray parsableByteArray0) {
        Assertions.k(this.f);
        Assertions.k(this.i);
        int v = parsableByteArray0.f();
        int v1 = parsableByteArray0.g();
        byte[] arr_b = parsableByteArray0.e();
        this.g += (long)parsableByteArray0.a();
        this.i.b(parsableByteArray0, parsableByteArray0.a());
        int v2;
        while((v2 = NalUnitUtil.c(arr_b, v, v1, this.c)) != v1) {
            int v3 = parsableByteArray0.e()[v2 + 3] & 0xFF;
            int v4 = v2 - v;
            int v5 = 0;
            if(!this.j) {
                if(v4 > 0) {
                    this.d.a(arr_b, v, v2);
                }
                if(this.d.b(v3, (v4 >= 0 ? 0 : -v4))) {
                    TrackOutput trackOutput0 = this.i;
                    int v6 = this.d.d;
                    String s = (String)Assertions.g(this.h);
                    trackOutput0.d(H263Reader.f(this.d, v6, s));
                    this.j = true;
                }
            }
            this.f.a(arr_b, v, v2);
            NalUnitTargetBuffer nalUnitTargetBuffer0 = this.e;
            if(nalUnitTargetBuffer0 != null) {
                if(v4 > 0) {
                    nalUnitTargetBuffer0.a(arr_b, v, v2);
                }
                else {
                    v5 = -v4;
                }
                if(this.e.b(v5)) {
                    int v7 = NalUnitUtil.r(this.e.d, this.e.e);
                    this.b.W(this.e.d, v7);
                    this.a.a(this.k, this.b);
                }
                if(v3 == 0xB2 && parsableByteArray0.e()[v2 + 2] == 1) {
                    this.e.e(0xB2);
                }
            }
            this.f.b(this.g - ((long)(v1 - v2)), v1 - v2, this.j);
            this.f.c(v3, this.k);
            v = v2 + 3;
        }
        if(!this.j) {
            this.d.a(arr_b, v, v1);
        }
        this.f.a(arr_b, v, v1);
        NalUnitTargetBuffer nalUnitTargetBuffer1 = this.e;
        if(nalUnitTargetBuffer1 != null) {
            nalUnitTargetBuffer1.a(arr_b, v, v1);
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void b() {
        NalUnitUtil.a(this.c);
        this.d.c();
        SampleReader h263Reader$SampleReader0 = this.f;
        if(h263Reader$SampleReader0 != null) {
            h263Reader$SampleReader0.d();
        }
        NalUnitTargetBuffer nalUnitTargetBuffer0 = this.e;
        if(nalUnitTargetBuffer0 != null) {
            nalUnitTargetBuffer0.d();
        }
        this.g = 0L;
        this.k = 0x8000000000000001L;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void c(ExtractorOutput extractorOutput0, TrackIdGenerator tsPayloadReader$TrackIdGenerator0) {
        tsPayloadReader$TrackIdGenerator0.a();
        this.h = tsPayloadReader$TrackIdGenerator0.b();
        TrackOutput trackOutput0 = extractorOutput0.b(tsPayloadReader$TrackIdGenerator0.c(), 2);
        this.i = trackOutput0;
        this.f = new SampleReader(trackOutput0);
        UserDataReader userDataReader0 = this.a;
        if(userDataReader0 != null) {
            userDataReader0.b(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
        }
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void d(long v, int v1) {
        this.k = v;
    }

    @Override  // androidx.media3.extractor.ts.ElementaryStreamReader
    public void e(boolean z) {
        Assertions.k(this.f);
        if(z) {
            this.f.b(this.g, 0, this.j);
            this.f.d();
        }
    }

    private static Format f(CsdBuffer h263Reader$CsdBuffer0, int v, String s) {
        byte[] arr_b = Arrays.copyOf(h263Reader$CsdBuffer0.e, h263Reader$CsdBuffer0.c);
        ParsableBitArray parsableBitArray0 = new ParsableBitArray(arr_b);
        parsableBitArray0.t(v);
        parsableBitArray0.t(4);
        parsableBitArray0.r();
        parsableBitArray0.s(8);
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(4);
            parsableBitArray0.s(3);
        }
        int v1 = parsableBitArray0.h(4);
        float f = 1.0f;
        if(v1 == 15) {
            int v2 = parsableBitArray0.h(8);
            int v3 = parsableBitArray0.h(8);
            if(v3 == 0) {
                Log.n("H263Reader", "Invalid aspect ratio");
            }
            else {
                f = ((float)v2) / ((float)v3);
            }
        }
        else {
            float[] arr_f = H263Reader.t;
            if(v1 < arr_f.length) {
                f = arr_f[v1];
            }
            else {
                Log.n("H263Reader", "Invalid aspect ratio");
            }
        }
        if(parsableBitArray0.g()) {
            parsableBitArray0.s(2);
            parsableBitArray0.s(1);
            if(parsableBitArray0.g()) {
                parsableBitArray0.s(15);
                parsableBitArray0.r();
                parsableBitArray0.s(15);
                parsableBitArray0.r();
                parsableBitArray0.s(15);
                parsableBitArray0.r();
                parsableBitArray0.s(3);
                parsableBitArray0.s(11);
                parsableBitArray0.r();
                parsableBitArray0.s(15);
                parsableBitArray0.r();
            }
        }
        if(parsableBitArray0.h(2) != 0) {
            Log.n("H263Reader", "Unhandled video object layer shape");
        }
        parsableBitArray0.r();
        int v4 = parsableBitArray0.h(16);
        parsableBitArray0.r();
        if(parsableBitArray0.g()) {
            if(v4 == 0) {
                Log.n("H263Reader", "Invalid vop_increment_time_resolution");
            }
            else {
                int v5 = v4 - 1;
                int v6 = 0;
                while(v5 > 0) {
                    ++v6;
                    v5 >>= 1;
                }
                parsableBitArray0.s(v6);
            }
        }
        parsableBitArray0.r();
        int v7 = parsableBitArray0.h(13);
        parsableBitArray0.r();
        int v8 = parsableBitArray0.h(13);
        parsableBitArray0.r();
        parsableBitArray0.r();
        return new Builder().a0(s).o0("video/mp4v-es").v0(v7).Y(v8).k0(f).b0(Collections.singletonList(arr_b)).K();
    }
}

