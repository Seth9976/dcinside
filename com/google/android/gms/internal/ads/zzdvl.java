package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

final class zzdvl extends AdListener {
    final String zza;
    final AdView zzb;
    final String zzc;
    final zzdvs zzd;

    zzdvl(zzdvs zzdvs0, String s, AdView adView0, String s1) {
        this.zza = s;
        this.zzb = adView0;
        this.zzc = s1;
        this.zzd = zzdvs0;
        super();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzdvs.zzl(loadAdError0);
        this.zzd.zzm(s, this.zzc);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}

