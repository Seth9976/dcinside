package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;

public final class zzbst extends zzbhj {
    private final OnNativeAdLoadedListener zza;

    public zzbst(OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener0) {
        this.zza = nativeAd$OnNativeAdLoadedListener0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbht zzbht0) {
        zzbsn zzbsn0 = new zzbsn(zzbht0);
        this.zza.onNativeAdLoaded(zzbsn0);
    }
}

