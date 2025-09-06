package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

@UnstableApi
public final class FrameworkCryptoConfig implements CryptoConfig {
    public final UUID a;
    public final byte[] b;
    @Deprecated
    public final boolean c;
    public static final boolean d;

    static {
        FrameworkCryptoConfig.d = "Amazon".equals(Util.c) && ("AFTM".equals(Util.d) || "AFTB".equals(Util.d));
    }

    public FrameworkCryptoConfig(UUID uUID0, byte[] arr_b, boolean z) {
        this.a = uUID0;
        this.b = arr_b;
        this.c = z;
    }
}

