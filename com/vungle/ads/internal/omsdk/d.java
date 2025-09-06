package com.vungle.ads.internal.omsdk;

import androidx.annotation.VisibleForTesting;
import y4.l;

public final class d {
    @l
    public static final d INSTANCE;

    static {
        d.INSTANCE = new d();
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    public final boolean isOmidActive() {
        return false;
    }
}

