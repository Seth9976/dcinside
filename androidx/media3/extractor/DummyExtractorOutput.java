package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override  // androidx.media3.extractor.ExtractorOutput
    public TrackOutput b(int v, int v1) {
        return new DiscardingTrackOutput();
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void m() {
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void r(SeekMap seekMap0) {
    }
}

