package androidx.media3.extractor.ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ConstantBitrateSeekMap;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.d;
import h4.m;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@UnstableApi
public final class AdtsExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    private final int d;
    private final AdtsReader e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final ParsableBitArray h;
    private ExtractorOutput i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    public static final ExtractorsFactory p = null;
    public static final int q = 1;
    public static final int r = 2;
    private static final int s = 0x800;
    private static final int t = 0x2000;
    private static final int u = 1000;

    static {
        AdtsExtractor.p = new c();
    }

    public AdtsExtractor() {
        this(0);
    }

    public AdtsExtractor(int v) {
        if((v & 2) != 0) {
            v |= 1;
        }
        this.d = v;
        this.e = new AdtsReader(true);
        this.f = new ParsableByteArray(0x800);
        this.l = -1;
        this.k = -1L;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(10);
        this.g = parsableByteArray0;
        this.h = new ParsableBitArray(parsableByteArray0.e());
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.n = false;
        this.e.b();
        this.j = v1;
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
        Assertions.k(this.i);
        long v = extractorInput0.getLength();
        if((this.d & 2) != 0 || (this.d & 1) != 0 && v != -1L) {
            this.f(extractorInput0);
        }
        int v1 = extractorInput0.read(this.f.e(), 0, 0x800);
        this.l(v, v1 == -1);
        if(v1 == -1) {
            return -1;
        }
        this.f.Y(0);
        this.f.X(v1);
        if(!this.n) {
            this.e.d(this.j, 4);
            this.n = true;
        }
        this.e.a(this.f);
        return 0;
    }

    private void f(ExtractorInput extractorInput0) throws IOException {
        if(this.m) {
            return;
        }
        this.l = -1;
        extractorInput0.o();
        long v = 0L;
        if(extractorInput0.getPosition() == 0L) {
            this.m(extractorInput0);
        }
        int v1 = 0;
        int v2 = 0;
        try {
            while(extractorInput0.n(this.g.e(), 0, 2, true)) {
                this.g.Y(0);
                if(!AdtsReader.m(this.g.R())) {
                    goto label_22;
                }
                if(!extractorInput0.n(this.g.e(), 0, 4, true)) {
                    break;
                }
                this.h.q(14);
                int v3 = this.h.h(13);
                if(v3 <= 6) {
                    this.m = true;
                    throw ParserException.a("Malformed ADTS stream", null);
                }
                v += (long)v3;
                ++v2;
                if(v2 == 1000 || !extractorInput0.s(v3 - 6, true)) {
                    break;
                }
            }
        label_21:
            v1 = v2;
        }
        catch(EOFException unused_ex) {
            goto label_21;
        }
    label_22:
        extractorInput0.o();
        this.l = v1 > 0 ? ((int)(v / ((long)v1))) : -1;
        this.m = true;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        int v = this.m(extractorInput0);
        int v1 = v;
        int v2 = 0;
        int v3 = 0;
        do {
            extractorInput0.k(this.g.e(), 0, 2);
            this.g.Y(0);
            if(AdtsReader.m(this.g.R())) {
                ++v2;
                if(v2 >= 4 && v3 > 0xBC) {
                    return true;
                }
                extractorInput0.k(this.g.e(), 0, 4);
                this.h.q(14);
                int v4 = this.h.h(13);
                if(v4 <= 6) {
                    ++v1;
                    extractorInput0.o();
                    extractorInput0.q(v1);
                    v2 = 0;
                    v3 = 0;
                }
                else {
                    extractorInput0.q(v4 - 6);
                    v3 += v4;
                }
            }
            else {
                ++v1;
                extractorInput0.o();
                extractorInput0.q(v1);
                v2 = 0;
                v3 = 0;
            }
        }
        while(v1 - v < 0x2000);
        return false;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.i = extractorOutput0;
        TrackIdGenerator tsPayloadReader$TrackIdGenerator0 = new TrackIdGenerator(0, 1);
        this.e.c(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
        extractorOutput0.m();
    }

    private static int i(int v, long v1) {
        return (int)(((long)v) * 8000000L / v1);
    }

    private SeekMap j(long v, boolean z) {
        int v1 = AdtsExtractor.i(this.l, this.e.k());
        return new ConstantBitrateSeekMap(v, this.k, v1, this.l, z);
    }

    private static Extractor[] k() {
        return new Extractor[]{new AdtsExtractor()};
    }

    @m({"extractorOutput"})
    private void l(long v, boolean z) {
        boolean z1 = false;
        if(this.o) {
            return;
        }
        boolean z2 = (this.d & 1) != 0 && this.l > 0;
        if(z2 && this.e.k() == 0x8000000000000001L && !z) {
            return;
        }
        if(!z2 || this.e.k() == 0x8000000000000001L) {
            this.i.r(new Unseekable(0x8000000000000001L));
        }
        else {
            ExtractorOutput extractorOutput0 = this.i;
            if((this.d & 2) != 0) {
                z1 = true;
            }
            extractorOutput0.r(this.j(v, z1));
        }
        this.o = true;
    }

    private int m(ExtractorInput extractorInput0) throws IOException {
        int v = 0;
        while(true) {
            extractorInput0.k(this.g.e(), 0, 10);
            this.g.Y(0);
            if(this.g.O() != 4801587) {
                break;
            }
            this.g.Z(3);
            int v1 = this.g.K();
            v += v1 + 10;
            extractorInput0.q(v1);
        }
        extractorInput0.o();
        extractorInput0.q(v);
        if(this.k == -1L) {
            this.k = (long)v;
        }
        return v;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

