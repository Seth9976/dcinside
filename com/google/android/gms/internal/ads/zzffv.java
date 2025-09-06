package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzffv {
    final zzfgf zza;
    private final Object zzb;
    private final List zzc;

    zzffv(zzfgf zzfgf0, Object object0, List list0, zzfge zzfge0) {
        this.zza = zzfgf0;
        super();
        this.zzb = object0;
        this.zzc = list0;
    }

    public final zzfgd zza(Callable callable0) {
        zzgcf zzgcf0 = zzgch.zzb(this.zzc);
        t0 t00 = zzgcf0.zza(new zzffu(), zzbzw.zzg);
        t0 t01 = zzgcf0.zza(callable0, this.zza.zzb);
        return new zzfgd(this.zza, this.zzb, null, t00, this.zzc, t01, null);
    }
}

