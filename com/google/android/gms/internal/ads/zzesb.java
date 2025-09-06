package com.google.android.gms.internal.ads;

import java.util.Set;

public final class zzesb implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzesb(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj1;
        this.zzb = zzhfj2;
    }

    public final zzerz zza() {
        return new zzerz(zzffh.zzc(), ((zzche)this.zza).zza(), ((Set)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

