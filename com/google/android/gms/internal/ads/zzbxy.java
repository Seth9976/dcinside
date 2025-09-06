package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

public final class zzbxy implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbxy(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzbxx(((Clock)this.zza.zzb()), ((zzg)this.zzb.zzb()), ((zzbyi)this.zzc.zzb()));
    }
}

