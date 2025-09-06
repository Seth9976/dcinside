package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;

public final class i {
    public static boolean a(DrmSession drmSession0) {
        return false;
    }

    public static void b(@Nullable DrmSession drmSession0, @Nullable DrmSession drmSession1) {
        if(drmSession0 == drmSession1) {
            return;
        }
        if(drmSession1 != null) {
            drmSession1.g(null);
        }
        if(drmSession0 != null) {
            drmSession0.d(null);
        }
    }
}

