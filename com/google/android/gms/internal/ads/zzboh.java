package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzboh implements zzcaf {
    final zzbnm zza;
    final Object zzb;
    final zzcab zzc;
    final zzbok zzd;

    zzboh(zzbok zzbok0, zzbnm zzbnm0, Object object0, zzcab zzcab0) {
        this.zza = zzbnm0;
        this.zzb = object0;
        this.zzc = zzcab0;
        this.zzd = zzbok0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcaf
    public final void zza(Object object0) {
        zze.zza("callJs > getEngine: Promise fulfilled");
        zzbok.zzd(this.zzd, this.zza, ((zzbnt)object0), this.zzb, this.zzc);
    }
}

