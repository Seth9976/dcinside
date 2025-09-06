package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class SingleSampleSeekMap implements SeekMap {
    private final long d;
    private final long e;

    public SingleSampleSeekMap(long v) {
        this(v, 0L);
    }

    public SingleSampleSeekMap(long v, long v1) {
        this.d = v;
        this.e = v1;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public long c1() {
        return this.d;
    }

    @Override  // androidx.media3.extractor.SeekMap
    public SeekPoints d1(long v) {
        return new SeekPoints(new SeekPoint(v, this.e));
    }

    @Override  // androidx.media3.extractor.SeekMap
    public boolean e1() {
        return true;
    }
}

