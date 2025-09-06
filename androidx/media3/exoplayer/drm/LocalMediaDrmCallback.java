package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.util.UUID;

@UnstableApi
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    private final byte[] a;

    public LocalMediaDrmCallback(byte[] arr_b) {
        this.a = (byte[])Assertions.g(arr_b);
    }

    @Override  // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] a(UUID uUID0, KeyRequest exoMediaDrm$KeyRequest0) {
        return this.a;
    }

    @Override  // androidx.media3.exoplayer.drm.MediaDrmCallback
    public byte[] b(UUID uUID0, ProvisionRequest exoMediaDrm$ProvisionRequest0) {
        throw new UnsupportedOperationException();
    }
}

