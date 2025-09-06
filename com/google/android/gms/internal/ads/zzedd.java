package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

public final class zzedd implements zzgbo {
    public final zzedh zza;
    public final zzfbo zzb;
    public final zzfca zzc;
    public final zzdpa zzd;

    public zzedd(zzedh zzedh0, zzfbo zzfbo0, zzfca zzfca0, zzdpa zzdpa0) {
        this.zza = zzedh0;
        this.zzb = zzfbo0;
        this.zzc = zzfca0;
        this.zzd = zzdpa0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzc(this.zzb, this.zzc, this.zzd, object0);
    }
}

