package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

public final class zzdwp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdwp(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzfgn zzfgn0 = (zzfgn)this.zza.zzb();
        zzfgd zzfgd0 = zzffx.zza(new zzdwk(zzv.zzr().zza(((Context)this.zzb.zzb()))), zzfgh.zzv, zzfgn0).zzi(1L, TimeUnit.SECONDS);
        zzffy zzffy0 = new zzffy(new zzdwl());
        return zzfgd0.zzc(Exception.class, zzffy0).zza();
    }
}

