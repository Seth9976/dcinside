package androidx.media3.extractor.bmp;

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
public final class BmpExtractor implements Extractor {
    private final SingleSampleExtractor d;
    private static final int e = 2;
    private static final int f = 0x424D;

    public BmpExtractor() {
        this.d = new SingleSampleExtractor(0x424D, 2, "image/bmp");
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.d.a(v, v1);
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
        return this.d.e(extractorInput0, positionHolder0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public boolean g(ExtractorInput extractorInput0) throws IOException {
        return this.d.g(extractorInput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.d.h(extractorOutput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

