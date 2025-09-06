package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

public final class zzbn implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzbn(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        return new zzbm(((zzb)this.zza.zzb()), ((int)(((Integer)this.zzb.zzb()))), ((String)this.zzc.zzb()));
    }
}

