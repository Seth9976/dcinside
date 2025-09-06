package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap.Unseekable;
import androidx.media3.extractor.d;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class Ac3Extractor implements Extractor {
    private final Ac3Reader d;
    private final ParsableByteArray e;
    private boolean f;
    public static final ExtractorsFactory g = null;
    private static final int h = 0x2000;
    private static final int i = 0xB77;
    private static final int j = 0xAE2;

    static {
        Ac3Extractor.g = new a();
    }

    public Ac3Extractor() {
        this.d = new Ac3Reader();
        this.e = new ParsableByteArray(0xAE2);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.f = false;
        this.d.b();
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
        int v = extractorInput0.read(this.e.e(), 0, 0xAE2);
        if(v == -1) {
            return -1;
        }
        this.e.Y(0);
        this.e.X(v);
        if(!this.f) {
            this.d.d(0L, 4);
            this.f = true;
        }
        this.d.a(this.e);
        return 0;
    }

    private static Extractor[] f() {
        return new Extractor[]{new Ac3Extractor()};
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        int v3;
        ParsableByteArray parsableByteArray0 = new ParsableByteArray(10);
        int v = 0;
        while(true) {
            extractorInput0.k(parsableByteArray0.e(), 0, 10);
            parsableByteArray0.Y(0);
            if(parsableByteArray0.O() != 4801587) {
                break;
            }
            parsableByteArray0.Z(3);
            int v1 = parsableByteArray0.K();
            v += v1 + 10;
            extractorInput0.q(v1);
        }
        extractorInput0.o();
        extractorInput0.q(v);
        int v2 = v;
        while(true) {
            v3 = 0;
        label_14:
            extractorInput0.k(parsableByteArray0.e(), 0, 6);
            parsableByteArray0.Y(0);
            if(parsableByteArray0.R() == 0xB77) {
                break;
            }
            extractorInput0.o();
            ++v2;
            if(v2 - v >= 0x2000) {
                return false;
            }
            extractorInput0.q(v2);
        }
        ++v3;
        if(v3 >= 4) {
            return true;
        }
        int v4 = Ac3Util.g(parsableByteArray0.e());
        if(v4 != -1) {
            extractorInput0.q(v4 - 6);
            goto label_14;
        }
        return false;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        TrackIdGenerator tsPayloadReader$TrackIdGenerator0 = new TrackIdGenerator(0, 1);
        this.d.c(extractorOutput0, tsPayloadReader$TrackIdGenerator0);
        extractorOutput0.m();
        extractorOutput0.r(new Unseekable(0x8000000000000001L));
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

