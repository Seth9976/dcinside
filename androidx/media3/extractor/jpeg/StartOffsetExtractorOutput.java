package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.SeekMap.SeekPoints;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final long a;
    private final ExtractorOutput b;

    public StartOffsetExtractorOutput(long v, ExtractorOutput extractorOutput0) {
        this.a = v;
        this.b = extractorOutput0;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public TrackOutput b(int v, int v1) {
        return this.b.b(v, v1);
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void m() {
        this.b.m();
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void r(SeekMap seekMap0) {
        androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.1 startOffsetExtractorOutput$10 = new ForwardingSeekMap(seekMap0) {
            final StartOffsetExtractorOutput f;

            @Override  // androidx.media3.extractor.ForwardingSeekMap
            public SeekPoints d1(long v) {
                SeekPoints seekMap$SeekPoints0 = seekMap0.d1(v);
                long v1 = StartOffsetExtractorOutput.this.a;
                SeekPoint seekPoint0 = new SeekPoint(seekMap$SeekPoints0.a.a, seekMap$SeekPoints0.a.b + v1);
                long v2 = StartOffsetExtractorOutput.this.a;
                return new SeekPoints(seekPoint0, new SeekPoint(seekMap$SeekPoints0.b.a, seekMap$SeekPoints0.b.b + v2));
            }
        };
        this.b.r(startOffsetExtractorOutput$10);
    }
}

