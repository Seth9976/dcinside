package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzbya implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzbya(zzhfj zzhfj0, zzhfj zzhfj1) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    public final zzbxz zza() {
        return new zzbxz(((Clock)this.zza.zzb()), ((zzbxx)this.zzb.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return this.zza();
    }
}

