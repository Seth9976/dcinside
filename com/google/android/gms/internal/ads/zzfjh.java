package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzfjh extends zzbn {
    final zzgdb zza;
    final zzby zzb;
    final zzfji zzc;

    zzfjh(zzfji zzfji0, zzgdb zzgdb0, zzby zzby0) {
        this.zza = zzgdb0;
        this.zzb = zzby0;
        this.zzc = zzfji0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zze0) {
        zzo.zzj(("Failed to load interstitial ad with error: " + zze0.zzb().toString() + " for ad unit: " + this.zzc.zze.zza));
        this.zzc.zzA(zze0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() {
        zzfjd.zza(this.zzb, this.zza);
    }
}

