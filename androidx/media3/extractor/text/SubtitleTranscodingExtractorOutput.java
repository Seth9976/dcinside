package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput a;
    private final Factory b;
    private final SparseArray c;

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput0, Factory subtitleParser$Factory0) {
        this.a = extractorOutput0;
        this.b = subtitleParser$Factory0;
        this.c = new SparseArray();
    }

    public void a() {
        for(int v = 0; v < this.c.size(); ++v) {
            ((SubtitleTranscodingTrackOutput)this.c.valueAt(v)).k();
        }
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public TrackOutput b(int v, int v1) {
        if(v1 != 3) {
            return this.a.b(v, v1);
        }
        TrackOutput trackOutput0 = (SubtitleTranscodingTrackOutput)this.c.get(v);
        if(trackOutput0 != null) {
            return trackOutput0;
        }
        TrackOutput trackOutput1 = new SubtitleTranscodingTrackOutput(this.a.b(v, 3), this.b);
        this.c.put(v, trackOutput1);
        return trackOutput1;
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void m() {
        this.a.m();
    }

    @Override  // androidx.media3.extractor.ExtractorOutput
    public void r(SeekMap seekMap0) {
        this.a.r(seekMap0);
    }
}

