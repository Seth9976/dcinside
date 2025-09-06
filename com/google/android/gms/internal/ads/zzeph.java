package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

public final class zzeph implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzeph(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj3;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        zzetf zzetf0 = ((zzeth)this.zza).zza();
        Object object0 = this.zzb.zzb();
        zzgcs zzgcs0 = zzffh.zzc();
        Object object1 = this.zzc.zzb();
        return new zzeoj(zzetf0, ((long)(((Long)zzbea.zzg.zze()))), ((Clock)object0), zzgcs0, ((zzdrw)object1));
    }
}

