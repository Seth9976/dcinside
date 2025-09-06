package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzbib implements Runnable {
    final AdManagerAdView zza;
    final zzby zzb;
    final zzbic zzc;

    zzbib(zzbic zzbic0, AdManagerAdView adManagerAdView0, zzby zzby0) {
        this.zza = adManagerAdView0;
        this.zzb = zzby0;
        this.zzc = zzbic0;
        super();
    }

    @Override
    public final void run() {
        if(this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
            return;
        }
        zzo.zzj("Could not bind.");
    }
}

