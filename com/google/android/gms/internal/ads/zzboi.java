package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

final class zzboi implements zzcad {
    final zzcab zza;
    final zzbnm zzb;

    zzboi(zzbok zzbok0, zzcab zzcab0, zzbnm zzbnm0) {
        this.zza = zzcab0;
        this.zzb = zzbnm0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        zze.zza("callJs > getEngine: Promise rejected");
        zzbnv zzbnv0 = new zzbnv("Unable to obtain a JavascriptEngine.");
        this.zza.zzd(zzbnv0);
        this.zzb.zzb();
    }
}

