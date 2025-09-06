package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

@UnstableApi
public final class AtomSizeTooSmallSniffFailure implements SniffFailure {
    public final int a;
    public final long b;
    public final int c;

    public AtomSizeTooSmallSniffFailure(int v, long v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }
}

