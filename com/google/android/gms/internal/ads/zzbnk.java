package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzbnk implements zzcaf {
    final zzbnm zza;

    zzbnk(zzbnm zzbnm0) {
        this.zza = zzbnm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaf
    public final void zza(Object object0) {
        zzbnt zzbnt0 = (zzbnt)object0;
        zze.zza("Releasing engine reference.");
        this.zza.zzb.zzd();
    }
}

