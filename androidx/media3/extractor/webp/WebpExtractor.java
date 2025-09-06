package androidx.media3.extractor.webp;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import androidx.media3.extractor.d;
import java.io.IOException;
import java.util.List;

@UnstableApi
public final class WebpExtractor implements Extractor {
    private final ParsableByteArray d;
    private final SingleSampleExtractor e;
    private static final int f = 4;
    private static final int g = 1380533830;
    private static final int h = 0x57454250;

    public WebpExtractor() {
        this.d = new ParsableByteArray(4);
        this.e = new SingleSampleExtractor(-1, -1, "image/webp");
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.e.a(v, v1);
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
        return this.e.e(extractorInput0, positionHolder0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        this.d.U(4);
        extractorInput0.k(this.d.e(), 0, 4);
        if(this.d.N() != 1380533830L) {
            return false;
        }
        extractorInput0.q(4);
        this.d.U(4);
        extractorInput0.k(this.d.e(), 0, 4);
        return this.d.N() == 0x57454250L;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.e.h(extractorOutput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

