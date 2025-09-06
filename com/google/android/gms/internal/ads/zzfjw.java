package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzfjw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzfjw(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzfjv(((zzfki)this.zza.zzb()), ((zzfjq)this.zzb).zza(), ((zzche)this.zzc).zza(), ((Clock)this.zzd.zzb()));
    }
}

