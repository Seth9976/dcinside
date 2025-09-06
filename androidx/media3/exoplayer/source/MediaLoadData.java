package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class MediaLoadData {
    public final int a;
    public final int b;
    @Nullable
    public final Format c;
    public final int d;
    @Nullable
    public final Object e;
    public final long f;
    public final long g;

    public MediaLoadData(int v) {
        this(v, -1, null, 0, null, 0x8000000000000001L, 0x8000000000000001L);
    }

    public MediaLoadData(int v, int v1, @Nullable Format format0, int v2, @Nullable Object object0, long v3, long v4) {
        this.a = v;
        this.b = v1;
        this.c = format0;
        this.d = v2;
        this.e = object0;
        this.f = v3;
        this.g = v4;
    }
}

