package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap d;

    public ForwardingSeekMap(SeekMap seekMap0) {
        this.d = seekMap0;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.d.c1();
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        return this.d.d1(v);
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return this.d.e1();
    }
}

