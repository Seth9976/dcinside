package androidx.media3.extractor.jpeg;

import androidx.annotation.Nullable;
import androidx.media3.common.Format.Builder;
import androidx.media3.common.Metadata.Entry;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.d;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser.Factory;
import java.io.IOException;
import java.util.List;

final class JpegMotionPhotoExtractor implements Extractor {
    private final ParsableByteArray d;
    private ExtractorOutput e;
    private int f;
    private int g;
    private int h;
    private long i;
    @Nullable
    private MotionPhotoMetadata j;
    private ExtractorInput k;
    private StartOffsetExtractorInput l;
    @Nullable
    private Mp4Extractor m;
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 4;
    private static final int r = 5;
    private static final int s = 6;
    private static final int t = 6;
    private static final long u = 1165519206L;
    private static final int v = 0xFFD8;
    private static final int w = 0xFFDA;
    private static final int x = 0xFFE0;
    private static final int y = 0xFFE1;
    private static final String z = "http://ns.adobe.com/xap/1.0/";

    public JpegMotionPhotoExtractor() {
        this.d = new ParsableByteArray(6);
        this.i = -1L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        if(v == 0L) {
            this.f = 0;
            this.m = null;
            return;
        }
        if(this.f == 5) {
            ((Mp4Extractor)Assertions.g(this.m)).a(v, v1);
        }
    }

    private void b(ExtractorInput extractorInput0) throws IOException {
        this.d.U(2);
        extractorInput0.k(this.d.e(), 0, 2);
        extractorInput0.q(this.d.R() - 2);
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
        switch(this.f) {
            case 0: {
                this.l(extractorInput0);
                return 0;
            }
            case 1: {
                this.n(extractorInput0);
                return 0;
            }
            case 2: {
                this.m(extractorInput0);
                return 0;
            }
            case 4: {
                long v1 = extractorInput0.getPosition();
                long v2 = this.i;
                if(v1 != v2) {
                    positionHolder0.a = v2;
                    return 1;
                }
                this.o(extractorInput0);
                return 0;
            }
            case 5: {
                if(this.l == null || extractorInput0 != this.k) {
                    this.k = extractorInput0;
                    this.l = new StartOffsetExtractorInput(extractorInput0, this.i);
                }
                int v = ((Mp4Extractor)Assertions.g(this.m)).e(this.l, positionHolder0);
                if(v == 1) {
                    positionHolder0.a += this.i;
                }
                return v;
            }
            case 6: {
                return -1;
            }
            default: {
                throw new IllegalStateException();
            }
        }
    }

    private void f() {
        ((ExtractorOutput)Assertions.g(this.e)).m();
        this.e.r(new Unseekable(0x8000000000000001L));
        this.f = 6;
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        if(this.k(extractorInput0) != 0xFFD8) {
            return false;
        }
        int v = this.k(extractorInput0);
        this.g = v;
        if(v == 0xFFE0) {
            this.b(extractorInput0);
            this.g = this.k(extractorInput0);
        }
        if(this.g != 0xFFE1) {
            return false;
        }
        extractorInput0.q(2);
        this.d.U(6);
        extractorInput0.k(this.d.e(), 0, 6);
        return this.d.N() == 1165519206L && this.d.R() == 0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.e = extractorOutput0;
    }

    @Nullable
    private static MotionPhotoMetadata i(String s, long v) throws IOException {
        if(v == -1L) {
            return null;
        }
        MotionPhotoDescription motionPhotoDescription0 = XmpMotionPhotoDescriptionParser.a(s);
        return motionPhotoDescription0 == null ? null : motionPhotoDescription0.a(v);
    }

    private void j(MotionPhotoMetadata motionPhotoMetadata0) {
        ((ExtractorOutput)Assertions.g(this.e)).b(0x400, 4).d(new Builder().Q("image/jpeg").h0(new Metadata(new Entry[]{motionPhotoMetadata0})).K());
    }

    private int k(ExtractorInput extractorInput0) throws IOException {
        this.d.U(2);
        extractorInput0.k(this.d.e(), 0, 2);
        return this.d.R();
    }

    private void l(ExtractorInput extractorInput0) throws IOException {
        this.d.U(2);
        extractorInput0.readFully(this.d.e(), 0, 2);
        int v = this.d.R();
        this.g = v;
        if(v == 0xFFDA) {
            if(this.i != -1L) {
                this.f = 4;
                return;
            }
            this.f();
            return;
        }
        if((v < 0xFFD0 || v > 0xFFD9) && v != 0xFF01) {
            this.f = 1;
        }
    }

    private void m(ExtractorInput extractorInput0) throws IOException {
        if(this.g == 0xFFE1) {
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(this.h);
            extractorInput0.readFully(parsableByteArray0.e(), 0, this.h);
            if(this.j == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray0.F())) {
                String s = parsableByteArray0.F();
                if(s != null) {
                    MotionPhotoMetadata motionPhotoMetadata0 = JpegMotionPhotoExtractor.i(s, extractorInput0.getLength());
                    this.j = motionPhotoMetadata0;
                    if(motionPhotoMetadata0 != null) {
                        this.i = motionPhotoMetadata0.d;
                    }
                }
            }
        }
        else {
            extractorInput0.r(this.h);
        }
        this.f = 0;
    }

    private void n(ExtractorInput extractorInput0) throws IOException {
        this.d.U(2);
        extractorInput0.readFully(this.d.e(), 0, 2);
        this.h = this.d.R() - 2;
        this.f = 2;
    }

    private void o(ExtractorInput extractorInput0) throws IOException {
        if(!extractorInput0.n(this.d.e(), 0, 1, true)) {
            this.f();
            return;
        }
        extractorInput0.o();
        if(this.m == null) {
            this.m = new Mp4Extractor(Factory.a, 8);
        }
        StartOffsetExtractorInput startOffsetExtractorInput0 = new StartOffsetExtractorInput(extractorInput0, this.i);
        this.l = startOffsetExtractorInput0;
        if(this.m.g(startOffsetExtractorInput0)) {
            this.m.h(new StartOffsetExtractorOutput(this.i, ((ExtractorOutput)Assertions.g(this.e))));
            this.p();
            return;
        }
        this.f();
    }

    private void p() {
        this.j(((MotionPhotoMetadata)Assertions.g(this.j)));
        this.f = 5;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

