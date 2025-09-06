package androidx.media3.extractor.amr;

import androidx.media3.common.Format.Builder;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import h4.m;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

@UnstableApi
public final class AmrExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    private static final int A = 20;
    private static final int B = 16000;
    private static final int C = 8000;
    private static final int D = 20000;
    private final byte[] d;
    private final int e;
    private boolean f;
    private long g;
    private int h;
    private int i;
    private boolean j;
    private long k;
    private int l;
    private int m;
    private long n;
    private ExtractorOutput o;
    private TrackOutput p;
    private SeekMap q;
    private boolean r;
    public static final ExtractorsFactory s = null;
    public static final int t = 1;
    public static final int u = 2;
    private static final int[] v;
    private static final int[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final int z;

    static {
        AmrExtractor.s = new a();
        AmrExtractor.v = new int[]{13, 14, 16, 18, 20, 21, 27, 0x20, 6, 7, 6, 6, 1, 1, 1, 1};
        AmrExtractor.w = new int[]{18, 24, 33, 37, 41, 0x2F, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        AmrExtractor.x = new byte[]{35, 33, 65, 77, 82, 10};
        AmrExtractor.y = new byte[]{35, 33, 65, 77, 82, 45, 87, 66, 10};
        AmrExtractor.z = 61;
    }

    public AmrExtractor() {
        this(0);
    }

    public AmrExtractor(int v) {
        if((v & 2) != 0) {
            v |= 1;
        }
        this.e = v;
        this.d = new byte[1];
        this.l = -1;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.g = 0L;
        this.h = 0;
        this.i = 0;
        if(v != 0L) {
            SeekMap seekMap0 = this.q;
            if(seekMap0 instanceof ConstantBitrateSeekMap) {
                this.n = ((ConstantBitrateSeekMap)seekMap0).c(v);
                return;
            }
        }
        this.n = 0L;
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
        this.j();
        if(extractorInput0.getPosition() == 0L && !this.x(extractorInput0)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        this.t();
        int v = this.y(extractorInput0);
        this.u(extractorInput0.getLength(), v);
        return v;
    }

    static byte[] f() {
        return Arrays.copyOf(AmrExtractor.x, AmrExtractor.x.length);
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return this.x(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.o = extractorOutput0;
        this.p = extractorOutput0.b(0, 1);
        extractorOutput0.m();
    }

    static byte[] i() {
        return Arrays.copyOf(AmrExtractor.y, AmrExtractor.y.length);
    }

    @h4.d({"extractorOutput", "trackOutput"})
    private void j() {
        Assertions.k(this.p);
    }

    static int k(int v) {
        return AmrExtractor.v[v];
    }

    static int l(int v) {
        return AmrExtractor.w[v];
    }

    private static int m(int v, long v1) [...] // Inlined contents

    private SeekMap n(long v, boolean z) {
        return new ConstantBitrateSeekMap(v, this.k, ((int)(((long)this.l) * 8000000L / 20000L)), this.l, z);
    }

    private int o(int v) throws ParserException {
        if(!this.q(v)) {
            throw ParserException.a(("Illegal AMR " + (this.f ? "WB" : "NB") + " frame type " + v), null);
        }
        return this.f ? AmrExtractor.w[v] : AmrExtractor.v[v];
    }

    // 去混淆评级： 低(20)
    private boolean p(int v) {
        return !this.f && (v < 12 || v > 14);
    }

    // 去混淆评级： 低(20)
    private boolean q(int v) {
        return v >= 0 && v <= 15 && (this.r(v) || this.p(v));
    }

    // 去混淆评级： 低(20)
    private boolean r(int v) {
        return this.f && (v < 10 || v > 13);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }

    private static Extractor[] s() {
        return new Extractor[]{new AmrExtractor()};
    }

    @m({"trackOutput"})
    private void t() {
        if(!this.r) {
            this.r = true;
            boolean z = this.f;
            this.p.d(new Builder().o0((z ? "audio/amr-wb" : "audio/3gpp")).f0(AmrExtractor.z).N(1).p0((z ? 16000 : 8000)).K());
        }
    }

    @m({"extractorOutput"})
    private void u(long v, int v1) {
        if(this.j) {
            return;
        }
        int v2 = this.e;
        if((v2 & 1) == 0 || v == -1L || this.l != -1 && this.l != this.h) {
            Unseekable seekMap$Unseekable0 = new Unseekable(0x8000000000000001L);
            this.q = seekMap$Unseekable0;
            this.o.r(seekMap$Unseekable0);
            this.j = true;
        }
        else if(this.m >= 20 || v1 == -1) {
            SeekMap seekMap0 = this.n(v, (v2 & 2) != 0);
            this.q = seekMap0;
            this.o.r(seekMap0);
            this.j = true;
        }
    }

    private static boolean v(ExtractorInput extractorInput0, byte[] arr_b) throws IOException {
        extractorInput0.o();
        byte[] arr_b1 = new byte[arr_b.length];
        extractorInput0.k(arr_b1, 0, arr_b.length);
        return Arrays.equals(arr_b1, arr_b);
    }

    private int w(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.o();
        extractorInput0.k(this.d, 0, 1);
        int v = this.d[0];
        if((v & 0x83) > 0) {
            throw ParserException.a(("Invalid padding bits for frame header " + v), null);
        }
        return this.o(v >> 3 & 15);
    }

    private boolean x(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = AmrExtractor.x;
        if(AmrExtractor.v(extractorInput0, arr_b)) {
            this.f = false;
            extractorInput0.r(arr_b.length);
            return true;
        }
        byte[] arr_b1 = AmrExtractor.y;
        if(AmrExtractor.v(extractorInput0, arr_b1)) {
            this.f = true;
            extractorInput0.r(arr_b1.length);
            return true;
        }
        return false;
    }

    @m({"trackOutput"})
    private int y(ExtractorInput extractorInput0) throws IOException {
        if(this.i == 0) {
            try {
                int v = this.w(extractorInput0);
                this.h = v;
                this.i = v;
            }
            catch(EOFException unused_ex) {
                return -1;
            }
            if(this.l == -1) {
                this.k = extractorInput0.getPosition();
                this.l = this.h;
            }
            if(this.l == this.h) {
                ++this.m;
            }
        }
        int v1 = this.p.e(extractorInput0, this.i, true);
        if(v1 == -1) {
            return -1;
        }
        int v2 = this.i - v1;
        this.i = v2;
        if(v2 > 0) {
            return 0;
        }
        this.p.f(this.n + this.g, 1, this.h, 0, null);
        this.g += 20000L;
        return 0;
    }
}

