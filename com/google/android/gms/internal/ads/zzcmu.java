package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.util.List;

final class zzcmu implements zzgcd {
    final zzcmw zza;

    zzcmu(zzcmw zzcmw0) {
        this.zza = zzcmw0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable throwable0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        List list0 = this.zza.zzg.zzd(this.zza.zze, this.zza.zzf, false, "", ((String)object0), this.zza.zzf.zzc);
        this.zza.zzh.zzc(list0, (zzv.zzp().zzA(this.zza.zza) ? 2 : 1));
    }
}

