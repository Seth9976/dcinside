package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.Map;

@UnstableApi
public final class MediaDrmCallbackException extends IOException {
    public final DataSpec a;
    public final Uri b;
    public final Map c;
    public final long d;

    public MediaDrmCallbackException(DataSpec dataSpec0, Uri uri0, Map map0, long v, Throwable throwable0) {
        super(throwable0);
        this.a = dataSpec0;
        this.b = uri0;
        this.c = map0;
        this.d = v;
    }
}

