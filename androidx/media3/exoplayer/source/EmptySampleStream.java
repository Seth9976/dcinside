package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

@UnstableApi
public final class EmptySampleStream implements SampleStream {
    @Override  // androidx.media3.exoplayer.source.SampleStream
    public void b() {
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return true;
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int m(FormatHolder formatHolder0, DecoderInputBuffer decoderInputBuffer0, int v) {
        decoderInputBuffer0.n(4);
        return -4;
    }

    @Override  // androidx.media3.exoplayer.source.SampleStream
    public int p(long v) {
        return 0;
    }
}

