package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.LoadAdError;

final class zzek extends zzbd {
    final zzel zza;

    zzek(zzel zzel0) {
        this.zza = zzel0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbd
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.zza.zze.zzb(this.zza.zzi());
        super.onAdFailedToLoad(loadAdError0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbd
    public final void onAdLoaded() {
        zzeb zzeb0 = this.zza.zzi();
        this.zza.zze.zzb(zzeb0);
        super.onAdLoaded();
    }
}

