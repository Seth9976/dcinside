package androidx.media3.extractor.flv;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.d;
import h4.m;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class FlvExtractor implements Extractor {
    private static final int A = 8;
    private static final int B = 9;
    private static final int C = 18;
    private static final int D = 4607062;
    private final ParsableByteArray d;
    private final ParsableByteArray e;
    private final ParsableByteArray f;
    private final ParsableByteArray g;
    private final ScriptTagPayloadReader h;
    private ExtractorOutput i;
    private int j;
    private boolean k;
    private long l;
    private int m;
    private int n;
    private int o;
    private long p;
    private boolean q;
    private AudioTagPayloadReader r;
    private VideoTagPayloadReader s;
    public static final ExtractorsFactory t = null;
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 9;
    private static final int z = 11;

    static {
        FlvExtractor.t = new a();
    }

    public FlvExtractor() {
        this.d = new ParsableByteArray(4);
        this.e = new ParsableByteArray(9);
        this.f = new ParsableByteArray(11);
        this.g = new ParsableByteArray();
        this.h = new ScriptTagPayloadReader();
        this.j = 1;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        if(v == 0L) {
            this.j = 1;
            this.k = false;
        }
        else {
            this.j = 3;
        }
        this.m = 0;
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
    alab1:
        while(true) {
            switch(this.j) {
                case 1: {
                    if(this.l(extractorInput0)) {
                        break;
                    }
                    return -1;
                }
                case 2: {
                    this.o(extractorInput0);
                    break;
                }
                case 3: {
                    if(this.n(extractorInput0)) {
                        break;
                    }
                    return -1;
                }
                case 4: {
                    if(!this.m(extractorInput0)) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    throw new IllegalStateException();
                }
            }
        }
        return 0;
    }

    @m({"extractorOutput"})
    private void f() {
        if(!this.q) {
            this.i.r(new Unseekable(0x8000000000000001L));
            this.q = true;
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.k(this.d.e(), 0, 3);
        this.d.Y(0);
        if(this.d.O() != 4607062) {
            return false;
        }
        extractorInput0.k(this.d.e(), 0, 2);
        this.d.Y(0);
        if((this.d.R() & 0xFA) != 0) {
            return false;
        }
        extractorInput0.k(this.d.e(), 0, 4);
        this.d.Y(0);
        int v = this.d.s();
        extractorInput0.o();
        extractorInput0.q(v);
        extractorInput0.k(this.d.e(), 0, 4);
        this.d.Y(0);
        return this.d.s() == 0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.i = extractorOutput0;
    }

    private long i() {
        if(this.k) {
            return this.l + this.p;
        }
        return this.h.e() == 0x8000000000000001L ? 0L : this.p;
    }

    private static Extractor[] j() {
        return new Extractor[]{new FlvExtractor()};
    }

    private ParsableByteArray k(ExtractorInput extractorInput0) throws IOException {
        if(this.o > this.g.b()) {
            this.g.W(new byte[Math.max(this.g.b() * 2, this.o)], 0);
        }
        else {
            this.g.Y(0);
        }
        this.g.X(this.o);
        extractorInput0.readFully(this.g.e(), 0, this.o);
        return this.g;
    }

    @m({"extractorOutput"})
    private boolean l(ExtractorInput extractorInput0) throws IOException {
        boolean z = false;
        if(!extractorInput0.e(this.e.e(), 0, 9, true)) {
            return false;
        }
        this.e.Y(0);
        this.e.Z(4);
        int v = this.e.L();
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 4) != 0 && this.r == null) {
            this.r = new AudioTagPayloadReader(this.i.b(8, 1));
        }
        if(z && this.s == null) {
            this.s = new VideoTagPayloadReader(this.i.b(9, 2));
        }
        this.i.m();
        this.m = this.e.s() - 5;
        this.j = 2;
        return true;
    }

    @m({"extractorOutput"})
    private boolean m(ExtractorInput extractorInput0) throws IOException {
        boolean z1;
        boolean z;
        long v = this.i();
        int v1 = this.n;
        if(v1 == 8 && this.r != null) {
            this.f();
            z = this.r.a(this.k(extractorInput0), v);
            z1 = true;
        }
        else if(v1 == 9 && this.s != null) {
            this.f();
            z = this.s.a(this.k(extractorInput0), v);
            z1 = true;
        }
        else if(v1 != 18 || this.q) {
            extractorInput0.r(this.o);
            z = false;
            z1 = false;
        }
        else {
            ParsableByteArray parsableByteArray0 = this.k(extractorInput0);
            z = this.h.a(parsableByteArray0, v);
            long v2 = this.h.e();
            if(v2 != 0x8000000000000001L) {
                this.i.r(new IndexSeekMap(this.h.f(), this.h.g(), v2));
                this.q = true;
            }
            z1 = true;
        }
        if(!this.k && z) {
            this.k = true;
            this.l = this.h.e() == 0x8000000000000001L ? -this.p : 0L;
        }
        this.m = 4;
        this.j = 2;
        return z1;
    }

    private boolean n(ExtractorInput extractorInput0) throws IOException {
        if(!extractorInput0.e(this.f.e(), 0, 11, true)) {
            return false;
        }
        this.f.Y(0);
        this.n = this.f.L();
        this.o = this.f.O();
        this.p = (long)this.f.O();
        this.p = (((long)(this.f.L() << 24)) | this.p) * 1000L;
        this.f.Z(3);
        this.j = 4;
        return true;
    }

    private void o(ExtractorInput extractorInput0) throws IOException {
        extractorInput0.r(this.m);
        this.m = 0;
        this.j = 3;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

