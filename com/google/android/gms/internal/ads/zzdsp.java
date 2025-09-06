package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

public final class zzdsp implements zzher {
    private final zzdsl zza;
    private final zzhfj zzb;

    public zzdsp(zzdsl zzdsl0, zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzdsl0;
        this.zzb = zzhfj0;
    }

    public static Set zza(zzdsl zzdsl0, zzdsv zzdsv0, Executor executor0) {
        Set set0 = zzdsl.zzd(zzdsv0, executor0);
        zzhez.zzb(set0);
        return set0;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzdsv zzdsv0 = (zzdsv)this.zzb.zzb();
        zzgcs zzgcs0 = zzffh.zzc();
        return zzdsp.zza(this.zza, zzdsv0, zzgcs0);
    }
}

