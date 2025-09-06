package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

final class zzdvp extends AdListener {
    final String zza;
    final zzdvs zzb;

    zzdvp(zzdvs zzdvs0, String s) {
        this.zza = s;
        this.zzb = zzdvs0;
        super();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        String s = zzdvs.zzl(loadAdError0);
        this.zzb.zzm(s, this.zza);
    }
}

