package androidx.media3.extractor.ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import h4.m;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class PsExtractor implements Extractor {
    static final class PesReader {
        private final ElementaryStreamReader a;
        private final TimestampAdjuster b;
        private final ParsableBitArray c;
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;
        private static final int i = 0x40;

        public PesReader(ElementaryStreamReader elementaryStreamReader0, TimestampAdjuster timestampAdjuster0) {
            this.a = elementaryStreamReader0;
            this.b = timestampAdjuster0;
            this.c = new ParsableBitArray(new byte[0x40]);
        }

        public void a(ParsableByteArray parsableByteArray0) throws ParserException {
            parsableByteArray0.n(this.c.a, 0, 3);
            this.c.q(0);
            this.b();
            parsableByteArray0.n(this.c.a, 0, this.g);
            this.c.q(0);
            this.c();
            this.a.d(this.h, 4);
            this.a.a(parsableByteArray0);
            this.a.e(false);
        }

        private void b() {
            this.c.s(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.s(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0L;
            if(this.d) {
                this.c.s(4);
                long v = ((long)this.c.h(3)) << 30;
                this.c.s(1);
                int v1 = this.c.h(15);
                this.c.s(1);
                long v2 = v | ((long)(v1 << 15)) | ((long)this.c.h(15));
                this.c.s(1);
                if(!this.f && this.e) {
                    this.c.s(4);
                    long v3 = ((long)this.c.h(3)) << 30;
                    this.c.s(1);
                    int v4 = this.c.h(15);
                    this.c.s(1);
                    long v5 = v3 | ((long)(v4 << 15)) | ((long)this.c.h(15));
                    this.c.s(1);
                    this.b.b(v5);
                    this.f = true;
                }
                this.h = this.b.b(v2);
            }
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }

    public static final int A = 0xF0;
    private final TimestampAdjuster d;
    private final SparseArray e;
    private final ParsableByteArray f;
    private final PsDurationReader g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    @Nullable
    private PsBinarySearchSeeker l;
    private ExtractorOutput m;
    private boolean n;
    public static final ExtractorsFactory o = null;
    static final int p = 442;
    static final int q = 443;
    static final int r = 1;
    static final int s = 441;
    private static final int t = 0x100;
    private static final long u = 0x100000L;
    private static final long v = 0x2000L;
    public static final int w = 0xBD;
    public static final int x = 0xC0;
    public static final int y = 0xE0;
    public static final int z = 0xE0;

    static {
        PsExtractor.o = new d();
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster0) {
        this.d = timestampAdjuster0;
        this.f = new ParsableByteArray(0x1000);
        this.e = new SparseArray();
        this.g = new PsDurationReader();
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        int v3 = 1;
        int v4 = this.d.f() == 0x8000000000000001L ? 1 : 0;
        if(v4 == 0) {
            long v5 = this.d.d();
            if(v5 == 0x8000000000000001L || v5 == 0L || v5 == v1) {
                v3 = 0;
            }
            v4 = v3;
        }
        if(v4 != 0) {
            this.d.i(v1);
        }
        PsBinarySearchSeeker psBinarySearchSeeker0 = this.l;
        if(psBinarySearchSeeker0 != null) {
            psBinarySearchSeeker0.h(v1);
        }
        for(int v2 = 0; v2 < this.e.size(); ++v2) {
            ((PesReader)this.e.valueAt(v2)).d();
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this;
    }

    @Override  // androidx.media3.extractor.Extractor
    public List d() {
        return androidx.media3.extractor.d.a(this);
    }

    @Override  // androidx.media3.extractor.Extractor
    public int e(ExtractorInput extractorInput0, PositionHolder positionHolder0) throws IOException {
        Ac3Reader ac3Reader0;
        Assertions.k(this.m);
        long v = extractorInput0.getLength();
        int v1 = Long.compare(v, -1L);
        if(v1 != 0 && !this.g.e()) {
            return this.g.g(extractorInput0, positionHolder0);
        }
        this.i(v);
        if(this.l != null && this.l.d()) {
            return this.l.c(extractorInput0, positionHolder0);
        }
        extractorInput0.o();
        long v2 = v1 == 0 ? -1L : v - extractorInput0.p();
        if(v2 != -1L && v2 < 4L) {
            return -1;
        }
        if(!extractorInput0.n(this.f.e(), 0, 4, true)) {
            return -1;
        }
        this.f.Y(0);
        int v3 = this.f.s();
        if(v3 == 441) {
            return -1;
        }
        switch(v3) {
            case 442: {
                extractorInput0.k(this.f.e(), 0, 10);
                this.f.Y(9);
                extractorInput0.r((this.f.L() & 7) + 14);
                return 0;
            }
            case 443: {
                extractorInput0.k(this.f.e(), 0, 2);
                this.f.Y(0);
                extractorInput0.r(this.f.R() + 6);
                return 0;
            }
            default: {
                if((v3 & 0xFFFFFF00) >> 8 != 1) {
                    extractorInput0.r(1);
                    return 0;
                }
                PesReader psExtractor$PesReader0 = (PesReader)this.e.get(v3 & 0xFF);
                if(!this.h) {
                    if(psExtractor$PesReader0 == null) {
                        if((v3 & 0xFF) == 0xBD) {
                            ac3Reader0 = new Ac3Reader();
                            this.i = true;
                            this.k = extractorInput0.getPosition();
                        }
                        else if((v3 & 0xE0) == 0xC0) {
                            ac3Reader0 = new MpegAudioReader();
                            this.i = true;
                            this.k = extractorInput0.getPosition();
                        }
                        else if((v3 & 0xF0) == 0xE0) {
                            ac3Reader0 = new H262Reader();
                            this.j = true;
                            this.k = extractorInput0.getPosition();
                        }
                        else {
                            ac3Reader0 = null;
                        }
                        if(ac3Reader0 != null) {
                            TrackIdGenerator tsPayloadReader$TrackIdGenerator0 = new TrackIdGenerator(v3 & 0xFF, 0x100);
                            ac3Reader0.c(this.m, tsPayloadReader$TrackIdGenerator0);
                            psExtractor$PesReader0 = new PesReader(ac3Reader0, this.d);
                            this.e.put(v3 & 0xFF, psExtractor$PesReader0);
                        }
                    }
                    long v4 = !this.i || !this.j ? 0x100000L : this.k + 0x2000L;
                    if(extractorInput0.getPosition() > v4) {
                        this.h = true;
                        this.m.m();
                    }
                }
                extractorInput0.k(this.f.e(), 0, 2);
                this.f.Y(0);
                int v5 = this.f.R();
                if(psExtractor$PesReader0 == null) {
                    extractorInput0.r(v5 + 6);
                    return 0;
                }
                this.f.U(v5 + 6);
                extractorInput0.readFully(this.f.e(), 0, v5 + 6);
                this.f.Y(6);
                psExtractor$PesReader0.a(this.f);
                this.f.X(this.f.b());
                return 0;
            }
        }
    }

    private static Extractor[] f() {
        return new Extractor[]{new PsExtractor()};
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        byte[] arr_b = new byte[14];
        extractorInput0.k(arr_b, 0, 14);
        if(442 != ((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF)) {
            return false;
        }
        if((arr_b[4] & 0xC4) != 68) {
            return false;
        }
        if((arr_b[6] & 4) != 4) {
            return false;
        }
        if((arr_b[8] & 4) != 4) {
            return false;
        }
        if((arr_b[9] & 1) != 1) {
            return false;
        }
        if((arr_b[12] & 3) != 3) {
            return false;
        }
        extractorInput0.q(arr_b[13] & 7);
        extractorInput0.k(arr_b, 0, 3);
        return 1 == ((arr_b[0] & 0xFF) << 16 | (arr_b[1] & 0xFF) << 8 | arr_b[2] & 0xFF);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.m = extractorOutput0;
    }

    @m({"output"})
    private void i(long v) {
        if(!this.n) {
            this.n = true;
            if(this.g.c() != 0x8000000000000001L) {
                PsBinarySearchSeeker psBinarySearchSeeker0 = new PsBinarySearchSeeker(this.g.d(), this.g.c(), v);
                this.l = psBinarySearchSeeker0;
                this.m.r(psBinarySearchSeeker0.b());
                return;
            }
            this.m.r(new Unseekable(this.g.c()));
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

