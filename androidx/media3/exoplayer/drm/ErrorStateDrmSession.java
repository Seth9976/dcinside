package androidx.media3.exoplayer.drm;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import java.util.Map;
import java.util.UUID;

@UnstableApi
public final class ErrorStateDrmSession implements DrmSession {
    private final DrmSessionException f;

    public ErrorStateDrmSession(DrmSessionException drmSession$DrmSessionException0) {
        this.f = (DrmSessionException)Assertions.g(drmSession$DrmSessionException0);
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public boolean a() {
        return false;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public CryptoConfig b() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public Map c() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public void d(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public final UUID e() {
        return C.g2;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public byte[] f() {
        return null;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public void g(@Nullable EventDispatcher drmSessionEventListener$EventDispatcher0) {
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    @Nullable
    public DrmSessionException getError() {
        return this.f;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override  // androidx.media3.exoplayer.drm.DrmSession
    public boolean h(String s) {
        return false;
    }
}

