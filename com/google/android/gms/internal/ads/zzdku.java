package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

public final class zzdku implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdku(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzdkt(((zzbo)this.zza.zzb()), ((Clock)this.zzb.zzb()), zzffh.zzc());
    }
}

