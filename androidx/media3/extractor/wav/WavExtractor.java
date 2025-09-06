package androidx.media3.extractor.wav;

import android.util.Pair;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.WavUtil;
import androidx.media3.extractor.d;
import h4.m;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class WavExtractor implements Extractor {
    static final class ImaAdPcmOutputWriter implements OutputWriter {
        private final ExtractorOutput a;
        private final TrackOutput b;
        private final WavFormat c;
        private final int d;
        private final byte[] e;
        private final ParsableByteArray f;
        private final int g;
        private final Format h;
        private int i;
        private long j;
        private int k;
        private long l;
        private static final int[] m;
        private static final int[] n;

        static {
            ImaAdPcmOutputWriter.m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
            ImaAdPcmOutputWriter.n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 0x1F, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 0x76, 130, 0x8F, 0x9D, 0xAD, 190, 209, 230, 0xFD, 279, 307, 337, 371, 408, 449, 494, 0x220, 598, 658, 724, 796, 876, 963, 1060, 0x48E, 0x502, 0x583, 0x610, 1707, 0x756, 2066, 0x8E0, 0x9C3, 0xABD, 0xBD0, 0xCFF, 3660, 0xFBA, 4428, 0x1307, 5358, 0x1706, 6484, 7132, 7845, 8630, 9493, 10442, 0x2CDF, 0x315B, 0x364B, 0x3BB9, 0x41B2, 18500, 20350, 0x5771, 0x602F, 27086, 0x7462, 0x7FFF};
        }

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput0, TrackOutput trackOutput0, WavFormat wavFormat0) throws ParserException {
            this.a = extractorOutput0;
            this.b = trackOutput0;
            this.c = wavFormat0;
            int v = Math.max(1, wavFormat0.c / 10);
            this.g = v;
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(wavFormat0.g);
            parsableByteArray0.D();
            int v1 = parsableByteArray0.D();
            this.d = v1;
            int v2 = wavFormat0.b;
            int v3 = (wavFormat0.e - v2 * 4) * 8 / (wavFormat0.f * v2) + 1;
            if(v1 != v3) {
                throw ParserException.a(("Expected frames per block: " + v3 + "; got: " + v1), null);
            }
            int v4 = (v + v1 - 1) / v1;
            this.e = new byte[wavFormat0.e * v4];
            this.f = new ParsableByteArray(v4 * (v1 * 2 * v2));
            int v5 = wavFormat0.c * wavFormat0.e * 8 / v1;
            this.h = new Builder().o0("audio/raw").M(v5).j0(v5).f0(v * 2 * v2).N(wavFormat0.b).p0(wavFormat0.c).i0(2).K();
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public boolean a(ExtractorInput extractorInput0, long v) throws IOException {
            boolean z;
            int v1 = this.f(this.k);
            int v2 = (this.g - v1 + this.d - 1) / this.d * this.c.e;
            if(v != 0L) {
                z = false;
                goto label_6;
            }
            while(true) {
                z = true;
            label_6:
                if(z) {
                    break;
                }
                int v3 = this.i;
                if(v3 >= v2) {
                    break;
                }
                int v4 = extractorInput0.read(this.e, this.i, ((int)Math.min(v2 - v3, v)));
                if(v4 == -1) {
                    continue;
                }
                this.i += v4;
                goto label_6;
            }
            int v5 = this.i / this.c.e;
            if(v5 > 0) {
                this.d(this.e, v5, this.f);
                this.i -= v5 * this.c.e;
                int v6 = this.f.g();
                this.b.b(this.f, v6);
                int v7 = this.k + v6;
                this.k = v7;
                int v8 = this.f(v7);
                int v9 = this.g;
                if(v8 >= v9) {
                    this.i(v9);
                }
            }
            if(z) {
                int v10 = this.f(this.k);
                if(v10 > 0) {
                    this.i(v10);
                }
            }
            return z;
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public void b(int v, long v1) {
            WavSeekMap wavSeekMap0 = new WavSeekMap(this.c, this.d, ((long)v), v1);
            this.a.r(wavSeekMap0);
            this.b.d(this.h);
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public void c(long v) {
            this.i = 0;
            this.j = v;
            this.k = 0;
            this.l = 0L;
        }

        private void d(byte[] arr_b, int v, ParsableByteArray parsableByteArray0) {
            for(int v1 = 0; v1 < v; ++v1) {
                for(int v2 = 0; v2 < this.c.b; ++v2) {
                    this.e(arr_b, v1, v2, parsableByteArray0.e());
                }
            }
            parsableByteArray0.Y(0);
            parsableByteArray0.X(this.g(this.d * v));
        }

        private void e(byte[] arr_b, int v, int v1, byte[] arr_b1) {
            int v2 = this.c.b;
            int v3 = v * this.c.e + v1 * 4;
            int v4 = this.c.e / v2 - 4;
            int v5 = (short)((arr_b[v3 + 1] & 0xFF) << 8 | arr_b[v3] & 0xFF);
            int v6 = Math.min(arr_b[v3 + 2] & 0xFF, 88);
            int v7 = ImaAdPcmOutputWriter.n[v6];
            int v8 = (v * this.d * v2 + v1) * 2;
            arr_b1[v8] = (byte)(v5 & 0xFF);
            arr_b1[v8 + 1] = (byte)(v5 >> 8);
            for(int v9 = 0; v9 < v4 * 2; ++v9) {
                int v10 = arr_b[v9 / 8 * v2 * 4 + (v2 * 4 + v3) + v9 / 2 % 4];
                int v11 = v9 % 2 == 0 ? v10 & 15 : (v10 & 0xFF) >> 4;
                v5 = Util.w(v5 + ((v11 & 8) == 0 ? ((v11 & 7) * 2 + 1) * v7 >> 3 : -(((v11 & 7) * 2 + 1) * v7 >> 3)), 0xFFFF8000, 0x7FFF);
                v8 += v2 * 2;
                arr_b1[v8] = (byte)(v5 & 0xFF);
                arr_b1[v8 + 1] = (byte)(v5 >> 8);
                v6 = Util.w(v6 + ImaAdPcmOutputWriter.m[v11], 0, ImaAdPcmOutputWriter.n.length - 1);
                v7 = ImaAdPcmOutputWriter.n[v6];
            }
        }

        private int f(int v) {
            return v / (this.c.b * 2);
        }

        private int g(int v) {
            return v * 2 * this.c.b;
        }

        private static int h(int v, int v1) [...] // Inlined contents

        private void i(int v) {
            long v1 = this.j;
            long v2 = Util.Z1(this.l, 1000000L, this.c.c);
            int v3 = this.g(v);
            this.b.f(v1 + v2, 1, v3, this.k - v3, null);
            this.l += (long)v;
            this.k -= v3;
        }
    }

    interface OutputWriter {
        boolean a(ExtractorInput arg1, long arg2) throws IOException;

        void b(int arg1, long arg2) throws ParserException;

        void c(long arg1);
    }

    static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput a;
        private final TrackOutput b;
        private final WavFormat c;
        private final Format d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput0, TrackOutput trackOutput0, WavFormat wavFormat0, String s, int v) throws ParserException {
            this.a = extractorOutput0;
            this.b = trackOutput0;
            this.c = wavFormat0;
            int v1 = wavFormat0.b * wavFormat0.f / 8;
            if(wavFormat0.e != v1) {
                throw ParserException.a(("Expected block size: " + v1 + "; got: " + wavFormat0.e), null);
            }
            int v2 = wavFormat0.c * v1 * 8;
            int v3 = Math.max(v1, wavFormat0.c * v1 / 10);
            this.e = v3;
            this.d = new Builder().o0(s).M(v2).j0(v2).f0(v3).N(wavFormat0.b).p0(wavFormat0.c).i0(v).K();
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public boolean a(ExtractorInput extractorInput0, long v) throws IOException {
            int v1;
            while((v1 = Long.compare(v, 0L)) > 0) {
                int v2 = this.g;
                int v3 = this.e;
                if(v2 >= v3) {
                    break;
                }
                int v4 = this.b.e(extractorInput0, ((int)Math.min(v3 - v2, v)), true);
                if(v4 == -1) {
                    v = 0L;
                }
                else {
                    this.g += v4;
                    v -= (long)v4;
                }
            }
            WavFormat wavFormat0 = this.c;
            int v5 = wavFormat0.e;
            int v6 = this.g / v5;
            if(v6 > 0) {
                long v7 = this.f;
                long v8 = Util.Z1(this.h, 1000000L, wavFormat0.c);
                int v9 = v6 * v5;
                int v10 = this.g - v9;
                this.b.f(v7 + v8, 1, v9, v10, null);
                this.h += (long)v6;
                this.g = v10;
            }
            return v1 <= 0;
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public void b(int v, long v1) {
            WavSeekMap wavSeekMap0 = new WavSeekMap(this.c, 1, ((long)v), v1);
            this.a.r(wavSeekMap0);
            this.b.d(this.d);
        }

        @Override  // androidx.media3.extractor.wav.WavExtractor$OutputWriter
        public void c(long v) {
            this.f = v;
            this.g = 0;
            this.h = 0L;
        }
    }

    private ExtractorOutput d;
    private TrackOutput e;
    private int f;
    private long g;
    private OutputWriter h;
    private int i;
    private long j;
    private static final String k = "WavExtractor";
    private static final int l = 10;
    public static final ExtractorsFactory m = null;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;

    static {
        WavExtractor.m = new a();
    }

    public WavExtractor() {
        this.f = 0;
        this.g = -1L;
        this.i = -1;
        this.j = -1L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.f = v == 0L ? 0 : 4;
        OutputWriter wavExtractor$OutputWriter0 = this.h;
        if(wavExtractor$OutputWriter0 != null) {
            wavExtractor$OutputWriter0.c(v1);
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        this.f();
        switch(this.f) {
            case 0: {
                this.j(extractorInput0);
                return 0;
            }
            case 1: {
                this.l(extractorInput0);
                return 0;
            }
            case 2: {
                this.k(extractorInput0);
                return 0;
            }
            case 3: {
                this.n(extractorInput0);
                return 0;
            }
            case 4: {
                return this.m(extractorInput0);
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    @h4.d({"extractorOutput", "trackOutput"})
    private void f() {
        Assertions.k(this.e);
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return WavHeaderReader.a(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.d = extractorOutput0;
        this.e = extractorOutput0.b(0, 1);
        extractorOutput0.m();
    }

    private static Extractor[] i() {
        return new Extractor[]{new WavExtractor()};
    }

    private void j(ExtractorInput extractorInput0) throws IOException {
        Assertions.i(extractorInput0.getPosition() == 0L);
        int v = this.i;
        if(v != -1) {
            extractorInput0.r(v);
            this.f = 4;
            return;
        }
        if(!WavHeaderReader.a(extractorInput0)) {
            throw ParserException.a("Unsupported or unrecognized wav file type.", null);
        }
        extractorInput0.r(((int)(extractorInput0.p() - extractorInput0.getPosition())));
        this.f = 1;
    }

    @m({"extractorOutput", "trackOutput"})
    private void k(ExtractorInput extractorInput0) throws IOException {
        WavFormat wavFormat0 = WavHeaderReader.b(extractorInput0);
        int v = wavFormat0.a;
        if(v == 17) {
            this.h = new ImaAdPcmOutputWriter(this.d, this.e, wavFormat0);
        }
        else {
            switch(v) {
                case 6: {
                    this.h = new PassthroughOutputWriter(this.d, this.e, wavFormat0, "audio/g711-alaw", -1);
                    break;
                }
                case 7: {
                    this.h = new PassthroughOutputWriter(this.d, this.e, wavFormat0, "audio/g711-mlaw", -1);
                    break;
                }
                default: {
                    int v1 = WavUtil.a(v, wavFormat0.f);
                    if(v1 == 0) {
                        throw ParserException.e(("Unsupported WAV format type: " + wavFormat0.a));
                    }
                    this.h = new PassthroughOutputWriter(this.d, this.e, wavFormat0, "audio/raw", v1);
                    break;
                }
            }
        }
        this.f = 3;
    }

    private void l(ExtractorInput extractorInput0) throws IOException {
        this.g = WavHeaderReader.c(extractorInput0);
        this.f = 2;
    }

    private int m(ExtractorInput extractorInput0) throws IOException {
        Assertions.i(this.j != -1L);
        long v = this.j;
        long v1 = extractorInput0.getPosition();
        return ((OutputWriter)Assertions.g(this.h)).a(extractorInput0, v - v1) ? -1 : 0;
    }

    private void n(ExtractorInput extractorInput0) throws IOException {
        Pair pair0 = WavHeaderReader.e(extractorInput0);
        this.i = ((Long)pair0.first).intValue();
        long v = (long)(((Long)pair0.second));
        long v1 = this.g;
        if(v1 != -1L && v == 0xFFFFFFFFL) {
            v = v1;
        }
        this.j = ((long)this.i) + v;
        long v2 = extractorInput0.getLength();
        if(v2 != -1L && this.j > v2) {
            Log.n("WavExtractor", "Data exceeds input length: " + this.j + ", " + v2);
            this.j = v2;
        }
        ((OutputWriter)Assertions.g(this.h)).b(this.i, this.j);
        this.f = 4;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

