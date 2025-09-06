package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.util.client.zzt;

final class zzfiz implements zzgcd {
    final zzfgw zza;
    final zzfhh zzb;
    final zzfja zzc;

    zzfiz(zzfja zzfja0, zzfgw zzfgw0, zzfhh zzfhh0) {
        this.zza = zzfgw0;
        this.zzb = zzfhh0;
        this.zzc = zzfja0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zza(@NonNull Throwable throwable0) {
        this.zza.zzg(false);
        zzfhh zzfhh0 = this.zzb;
        if(zzfhh0 == null) {
            this.zzc.zzf.zzb(this.zza.zzm());
            return;
        }
        zzfhh0.zza(this.zza);
        zzfhh0.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object object0) {
        this.zza.zzg(((zzt)object0) == zzt.zza);
        zzfhh zzfhh0 = this.zzb;
        if(zzfhh0 == null) {
            zzfha zzfha0 = this.zza.zzm();
            this.zzc.zzf.zzb(zzfha0);
            return;
        }
        zzfhh0.zza(this.zza);
        zzfhh0.zzh();
    }
}

