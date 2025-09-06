package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAd;

public final class zzdvh implements OnNativeAdLoadedListener {
    public final zzdvs zza;
    public final String zzb;
    public final String zzc;

    public zzdvh(zzdvs zzdvs0, String s, String s1) {
        this.zza = zzdvs0;
        this.zzb = s;
        this.zzc = s1;
    }

    @Override  // com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener
    public final void onNativeAdLoaded(NativeAd nativeAd0) {
        this.zza.zzg(this.zzb, nativeAd0, this.zzc);
    }
}

