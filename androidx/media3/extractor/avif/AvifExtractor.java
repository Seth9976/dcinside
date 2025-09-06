package androidx.media3.extractor.avif;

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
public final class AvifExtractor implements Extractor {
    private final ParsableByteArray d;
    private final SingleSampleExtractor e;
    private static final int f = 0x66747970;
    private static final int g = 1635150182;
    private static final int h = 4;

    public AvifExtractor() {
        this.d = new ParsableByteArray(4);
        this.e = new SingleSampleExtractor(-1, -1, "image/avif");
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        this.e.a(v, v1);
    }

    private boolean b(ExtractorInput extractorInput0, int v) throws IOException {
        this.d.U(4);
        extractorInput0.k(this.d.e(), 0, 4);
        return this.d.N() == ((long)v);
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
        extractorInput0.q(4);
        return this.b(extractorInput0, 0x66747970) && this.b(extractorInput0, 1635150182);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void h(ExtractorOutput extractorOutput0) {
        this.e.h(extractorOutput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
    }
}

