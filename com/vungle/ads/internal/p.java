package com.vungle.ads.internal;

import android.content.Context;
import kotlin.jvm.internal.L;
import y4.l;

public final class p extends m {
    public p(@l Context context0) {
        L.p(context0, "context");
        super(context0);
    }

    @Override  // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(@l com.vungle.ads.internal.model.m m0) {
        L.p(m0, "placement");
        return m0.isInterstitial() || m0.isAppOpen();
    }
}

