package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

@UnstableApi
public final class NoDeclaredBrandSniffFailure implements SniffFailure {
    public static final NoDeclaredBrandSniffFailure a;

    static {
        NoDeclaredBrandSniffFailure.a = new NoDeclaredBrandSniffFailure();
    }
}

