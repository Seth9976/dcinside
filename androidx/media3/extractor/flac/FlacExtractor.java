package androidx.media3.extractor.flac;

import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.FlacFrameReader.SampleNumberHolder;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader.FlacStreamMetadataHolder;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

@UnstableApi
public final class FlacExtractor implements Extractor {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Flags {
    }

    private static final int A = -1;
    private final byte[] d;
    private final ParsableByteArray e;
    private final boolean f;
    private final SampleNumberHolder g;
    private ExtractorOutput h;
    private TrackOutput i;
    private int j;
    @Nullable
    private Metadata k;
    private FlacStreamMetadata l;
    private int m;
    private int n;
    private FlacBinarySearchSeeker o;
    private int p;
    private long q;
    public static final ExtractorsFactory r = null;
    public static final int s = 1;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 0x8000;

    static {
        FlacExtractor.r = new b();
    }

    public FlacExtractor() {
        this(0);
    }

    public FlacExtractor(int v) {
        this.d = new byte[42];
        this.e = new ParsableByteArray(new byte[0x8000], 0);
        this.f = (v & 1) != 0;
        this.g = new SampleNumberHolder();
        this.j = 0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        long v2 = 0L;
        if(v == 0L) {
            this.j = 0;
        }
        else {
            FlacBinarySearchSeeker flacBinarySearchSeeker0 = this.o;
            if(flacBinarySearchSeeker0 != null) {
                flacBinarySearchSeeker0.h(v1);
            }
        }
        if(v1 != 0L) {
            v2 = -1L;
        }
        this.q = v2;
        this.p = 0;
        this.e.U(0);
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
        switch(this.j) {
            case 0: {
                this.o(extractorInput0);
                return 0;
            }
            case 1: {
                this.k(extractorInput0);
                return 0;
            }
            case 2: {
                this.q(extractorInput0);
                return 0;
            }
            case 3: {
                this.p(extractorInput0);
                return 0;
            }
            case 4: {
                this.i(extractorInput0);
                return 0;
            }
            case 5: {
                return this.n(extractorInput0, positionHolder0);
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    private long f(ParsableByteArray parsableByteArray0, boolean z) {
        boolean z2;
        Assertions.g(this.l);
        int v;
        for(v = parsableByteArray0.f(); v <= parsableByteArray0.g() - 16; ++v) {
            parsableByteArray0.Y(v);
            if(FlacFrameReader.d(parsableByteArray0, this.l, this.n, this.g)) {
                parsableByteArray0.Y(v);
                return this.g.a;
            }
        }
        if(z) {
            while(v <= parsableByteArray0.g() - this.m) {
                parsableByteArray0.Y(v);
                boolean z1 = false;
                try {
                    z2 = false;
                    z2 = FlacFrameReader.d(parsableByteArray0, this.l, this.n, this.g);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                }
                if(parsableByteArray0.f() <= parsableByteArray0.g()) {
                    z1 = z2;
                }
                if(z1) {
                    parsableByteArray0.Y(v);
                    return this.g.a;
                }
                ++v;
            }
            parsableByteArray0.Y(parsableByteArray0.g());
            return -1L;
        }
        parsableByteArray0.Y(v);
        return -1L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        FlacMetadataReader.c(extractorInput0, false);
        return FlacMetadataReader.a(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.h = extractorOutput0;
        this.i = extractorOutput0.b(0, 1);
        extractorOutput0.m();
    }

    private void i(ExtractorInput extractorInput0) throws IOException {
        this.n = FlacMetadataReader.b(extractorInput0);
        this.h.r(this.j(extractorInput0.getPosition(), extractorInput0.getLength()));
        this.j = 5;
    }

    private SeekMap j(long v, long v1) {
        Assertions.g(this.l);
        FlacStreamMetadata flacStreamMetadata0 = this.l;
        if(flacStreamMetadata0.k != null) {
            return new FlacSeekTableSeekMap(flacStreamMetadata0, v);
        }
        if(v1 != -1L && flacStreamMetadata0.j > 0L) {
            FlacBinarySearchSeeker flacBinarySearchSeeker0 = new FlacBinarySearchSeeker(flacStreamMetadata0, this.n, v, v1);
            this.o = flacBinarySearchSeeker0;
            return flacBinarySearchSeeker0.b();
        }
        return new Unseekable(flacStreamMetadata0.h());
    }

    private void k(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.k(this.d, 0, this.d.length);
        extractorInput0.o();
        this.j = 2;
    }

    private static Extractor[] l() {
        return new Extractor[]{new FlacExtractor()};
    }

    private void m() {
        this.i.f(this.q * 1000000L / ((long)this.l.e), 1, this.p, 0, null);
    }

    private int n(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        boolean z;
        Assertions.g(this.i);
        Assertions.g(this.l);
        if(this.o != null && this.o.d()) {
            return this.o.c(extractorInput0, positionHolder0);
        }
        if(this.q == -1L) {
            this.q = FlacFrameReader.i(extractorInput0, this.l);
            return 0;
        }
        int v = this.e.g();
        if(v < 0x8000) {
            int v1 = extractorInput0.read(this.e.e(), v, 0x8000 - v);
            z = v1 == -1;
            if(!z) {
                this.e.X(v + v1);
            }
            else if(this.e.a() == 0) {
                this.m();
                return -1;
            }
        }
        else {
            z = false;
        }
        int v2 = this.e.f();
        int v3 = this.p;
        int v4 = this.m;
        if(v3 < v4) {
            this.e.Z(Math.min(v4 - v3, this.e.a()));
        }
        long v5 = this.f(this.e, z);
        int v6 = this.e.f() - v2;
        this.e.Y(v2);
        this.i.b(this.e, v6);
        this.p += v6;
        if(v5 != -1L) {
            this.m();
            this.p = 0;
            this.q = v5;
        }
        if(this.e.a() < 16) {
            int v7 = this.e.a();
            System.arraycopy(this.e.e(), this.e.f(), this.e.e(), 0, v7);
            this.e.Y(0);
            this.e.X(v7);
        }
        return 0;
    }

    private void o(ExtractorInput extractorInput0) throws IOException {
        this.k = FlacMetadataReader.d(extractorInput0, !this.f);
        this.j = 1;
    }

    private void p(ExtractorInput extractorInput0) throws IOException {
        FlacStreamMetadataHolder flacMetadataReader$FlacStreamMetadataHolder0 = new FlacStreamMetadataHolder(this.l);
        boolean z = false;
        while(!z) {
            z = FlacMetadataReader.e(extractorInput0, flacMetadataReader$FlacStreamMetadataHolder0);
            this.l = flacMetadataReader$FlacStreamMetadataHolder0.a;
        }
        Assertions.g(this.l);
        this.m = Math.max(this.l.c, 6);
        this.i.d(this.l.i(this.d, this.k));
        this.j = 4;
    }

    private void q(ExtractorInput extractorInput0) throws IOException {
        FlacMetadataReader.i(extractorInput0);
        this.j = 3;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

