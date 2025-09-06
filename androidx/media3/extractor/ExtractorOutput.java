package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public interface ExtractorOutput {
    public static final ExtractorOutput p1;

    static {
        ExtractorOutput.p1 = new ExtractorOutput() {
            @Override  // androidx.media3.extractor.ExtractorOutput
            public TrackOutput b(int v, int v1) {
                throw new UnsupportedOperationException();
            }

            @Override  // androidx.media3.extractor.ExtractorOutput
            public void m() {
                throw new UnsupportedOperationException();
            }

            @Override  // androidx.media3.extractor.ExtractorOutput
            public void r(SeekMap seekMap0) {
                throw new UnsupportedOperationException();
            }
        };
    }

    TrackOutput b(int arg1, int arg2);

    void m();

    void r(SeekMap arg1);
}

