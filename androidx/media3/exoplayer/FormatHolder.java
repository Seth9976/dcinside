package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.drm.DrmSession;

@UnstableApi
public final class FormatHolder {
    @Nullable
    public DrmSession a;
    @Nullable
    public Format b;

    public void a() {
        this.a = null;
        this.b = null;
    }
}

