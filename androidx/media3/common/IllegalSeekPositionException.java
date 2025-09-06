package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class IllegalSeekPositionException extends IllegalStateException {
    public final Timeline a;
    public final int b;
    public final long c;

    public IllegalSeekPositionException(Timeline timeline0, int v, long v1) {
        this.a = timeline0;
        this.b = v;
        this.c = v1;
    }
}

