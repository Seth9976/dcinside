package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzfkk extends zzbwv {
    final zzgdb zza;
    final zzbwp zzb;
    final zzfkl zzc;

    zzfkk(zzfkl zzfkl0, zzgdb zzgdb0, zzbwp zzbwp0) {
        this.zza = zzgdb0;
        this.zzb = zzbwp0;
        this.zzc = zzfkl0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zze(int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzf(zze zze0) {
        zzo.zzj(("Failed to load rewarded ad with error: " + zze0.zzb().toString() + ", adUnitId: " + this.zzc.zze.zza));
        this.zzc.zzA(zze0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        zzfjd.zza(this.zzb, this.zza);
    }
}

