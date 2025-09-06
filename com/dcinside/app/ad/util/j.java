package com.dcinside.app.ad.util;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;

public final class j implements OnNativeAdLoadedListener {
    public final k a;

    public j(k k0) {
        this.a = k0;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd0) {
        k.n(this.a, nativeAd0);
    }
}

