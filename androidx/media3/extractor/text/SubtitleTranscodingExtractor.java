package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.d;
import java.io.IOException;
import java.util.List;

@UnstableApi
public class SubtitleTranscodingExtractor implements Extractor {
    private final Extractor d;
    private final Factory e;
    private SubtitleTranscodingExtractorOutput f;

    public SubtitleTranscodingExtractor(Extractor extractor0, Factory subtitleParser$Factory0) {
        this.d = extractor0;
        this.e = subtitleParser$Factory0;
    }

    @Override  // androidx.media3.extractor.Extractor
    public void a(long v, long v1) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput0 = this.f;
        if(subtitleTranscodingExtractorOutput0 != null) {
            subtitleTranscodingExtractorOutput0.a();
        }
        this.d.a(v, v1);
    }

    @Override  // androidx.media3.extractor.Extractor
    public Extractor c() {
        return this.d;
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
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput0 = new SubtitleTranscodingExtractorOutput(extractorOutput0, this.e);
        this.f = subtitleTranscodingExtractorOutput0;
        this.d.h(subtitleTranscodingExtractorOutput0);
    }

    @Override  // androidx.media3.extractor.Extractor
    public void release() {
        this.d.release();
    }
}

