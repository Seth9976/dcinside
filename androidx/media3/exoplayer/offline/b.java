package androidx.media3.exoplayer.offline;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;

public final class b implements DrmSessionManagerProvider {
    public final DrmSessionManager a;

    public b(DrmSessionManager drmSessionManager0) {
        this.a = drmSessionManager0;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSessionManagerProvider
    public final DrmSessionManager a(MediaItem mediaItem0) {
        return DownloadHelper.d(this.a, mediaItem0);
    }
}

