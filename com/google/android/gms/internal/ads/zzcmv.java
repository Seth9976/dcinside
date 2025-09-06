package com.google.android.gms.internal.ads;

import java.util.List;

final class zzcmv implements zzgcd {
    final String zza;
    final zzcmw zzb;

    zzcmv(zzcmw zzcmw0, String s) {
        this.zza = s;
        this.zzb = zzcmw0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
        List list0 = this.zzb.zzu();
        List list1 = this.zzb.zzg.zzd(this.zzb.zze, this.zzb.zzf, false, this.zza, null, list0);
        this.zzb.zzh.zza(list1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        List list0 = this.zzb.zzu();
        List list1 = this.zzb.zzg.zzd(this.zzb.zze, this.zzb.zzf, false, this.zza, ((String)object0), list0);
        this.zzb.zzh.zza(list1);
    }
}

