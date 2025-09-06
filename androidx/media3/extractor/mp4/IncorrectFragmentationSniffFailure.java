package androidx.media3.extractor.mp4;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;

@UnstableApi
public final class IncorrectFragmentationSniffFailure implements SniffFailure {
    public final boolean a;
    public static final IncorrectFragmentationSniffFailure b;
    public static final IncorrectFragmentationSniffFailure c;

    static {
        IncorrectFragmentationSniffFailure.b = new IncorrectFragmentationSniffFailure(true);
        IncorrectFragmentationSniffFailure.c = new IncorrectFragmentationSniffFailure(false);
    }

    private IncorrectFragmentationSniffFailure(boolean z) {
        this.a = z;
    }
}

