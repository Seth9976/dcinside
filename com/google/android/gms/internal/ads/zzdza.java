package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;

public final class zzdza implements Callable {
    public final zzdzl zza;
    public final t0 zzb;
    public final t0 zzc;
    public final zzbvk zzd;
    public final zzfgw zze;

    public zzdza(zzdzl zzdzl0, t0 t00, t0 t01, zzbvk zzbvk0, zzfgw zzfgw0) {
        this.zza = zzdzl0;
        this.zzb = t00;
        this.zzc = t01;
        this.zzd = zzbvk0;
        this.zze = zzfgw0;
    }

    @Override
    public final Object call() {
        return this.zza.zzk(this.zzb, this.zzc, this.zzd, this.zze);
    }
}

