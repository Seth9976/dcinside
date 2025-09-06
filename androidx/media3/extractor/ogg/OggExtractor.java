package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.d;
import h4.e;
import java.io.IOException;
import java.util.List;

@UnstableApi
public class OggExtractor implements Extractor {
    private ExtractorOutput d;
    private StreamReader e;
    private boolean f;
    public static final ExtractorsFactory g = null;
    private static final int h = 8;

    static {
        OggExtractor.g = new a();
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        StreamReader streamReader0 = this.e;
        if(streamReader0 != null) {
            streamReader0.m(v, v1);
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
        Assertions.k(this.d);
        if(this.e == null) {
            if(!this.j(extractorInput0)) {
                throw ParserException.a("Failed to determine bitstream type", null);
            }
            extractorInput0.o();
        }
        if(!this.f) {
            TrackOutput trackOutput0 = this.d.b(0, 1);
            this.d.m();
            this.e.d(this.d, trackOutput0);
            this.f = true;
        }
        return this.e.g(extractorInput0, positionHolder0);
    }

    private static Extractor[] f() {
        return new Extractor[]{new OggExtractor()};
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        try {
            return this.j(extractorInput0);
        }
        catch(ParserException unused_ex) {
            return false;
        }
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.d = extractorOutput0;
    }

    private static ParsableByteArray i(ParsableByteArray parsableByteArray0) {
        parsableByteArray0.Y(0);
        return parsableByteArray0;
    }

    @e(expression = {"streamReader"}, result = true)
    private boolean j(ExtractorInput extractorInput0) throws IOException {
        OggPageHeader oggPageHeader0 = new OggPageHeader();
        if(oggPageHeader0.a(extractorInput0, true) && (oggPageHeader0.b & 2) == 2) {
            int v = Math.min(oggPageHeader0.i, 8);
            ParsableByteArray parsableByteArray0 = new ParsableByteArray(v);
            extractorInput0.k(parsableByteArray0.e(), 0, v);
            if(FlacReader.p(OggExtractor.i(parsableByteArray0))) {
                this.e = new FlacReader();
                return true;
            }
            if(VorbisReader.r(OggExtractor.i(parsableByteArray0))) {
                this.e = new VorbisReader();
                return true;
            }
            if(OpusReader.o(OggExtractor.i(parsableByteArray0))) {
                this.e = new OpusReader();
                return true;
            }
        }
        return false;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

