package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.common.util.concurrent.t0;

public final class zzaf implements zzgbo {
    public final zzau zza;
    public final zzdnl[] zzb;
    public final String zzc;

    public zzaf(zzau zzau0, zzdnl[] arr_zzdnl, String s) {
        this.zza = zzau0;
        this.zzb = arr_zzdnl;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzgbo
    public final t0 zza(Object object0) {
        return this.zza.zzv(this.zzb, this.zzc, ((zzdnl)object0));
    }
}

