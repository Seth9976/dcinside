package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import java.util.UUID;

@UnstableApi
public interface MediaDrmCallback {
    byte[] a(UUID arg1, KeyRequest arg2) throws MediaDrmCallbackException;

    byte[] b(UUID arg1, ProvisionRequest arg2) throws MediaDrmCallbackException;
}

