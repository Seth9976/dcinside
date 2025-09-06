package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdgk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzdgk(zzhfj zzhfj0, zzhfj zzhfj1, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzhfj0;
        this.zzb = zzhfj1;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
    }

    @Override  // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final Object zzb() {
        Map map0 = ((zzhev)this.zza).zzd();
        Map map1 = ((zzhev)this.zzb).zzd();
        Map map2 = ((zzhev)this.zzc).zzd();
        zzdiq zzdiq0 = ((zzdgo)this.zze).zza();
        return new zzdgj(map0, map1, map2, this.zzd, zzdiq0);
    }
}

