package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback;
import com.google.android.gms.ads.appopen.AppOpenAd;

final class zzdvk extends AppOpenAdLoadCallback {
    final String zza;
    final String zzb;
    final zzdvs zzc;

    zzdvk(zzdvs zzdvs0, String s, String s1) {
        this.zza = s;
        this.zzb = s1;
        this.zzc = zzdvs0;
        super();
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzdvs.zzl(loadAdError0);
        this.zzc.zzm(s, this.zzb);
    }

    @Override  // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(Object object0) {
        this.zzc.zzg(this.zza, ((AppOpenAd)object0), this.zzb);
    }
}

