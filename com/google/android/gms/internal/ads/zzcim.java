package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcim implements zzewp {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;

    zzcim(zzcih zzcih0, Context context0, String s, zzcjm zzcjm0) {
        this.zza = zzcih0;
        zzher zzher0 = zzhes.zza(context0);
        this.zzb = zzher0;
        zzher zzher1 = zzhes.zza(s);
        this.zzc = zzher1;
        zzezh zzezh0 = new zzezh(zzher0, zzcih0.zzbh, zzcih0.zzbi);
        this.zzd = zzezh0;
        zzhfa zzhfa0 = zzheq.zzc(new zzexn(zzcih0.zzbh));
        this.zze = zzhfa0;
        zzhfa zzhfa1 = zzheq.zzc(new zzexp(zzher0, zzcih0.zzc, zzcih0.zzS, zzezh0, zzhfa0, zzfcl.zza(), zzcih0.zzl));
        this.zzf = zzhfa1;
        this.zzg = zzheq.zzc(new zzexv(zzcih0.zzS, zzher0, zzher1, zzhfa1, zzhfa0, zzcih0.zzl, zzcih0.zzM));
    }

    @Override  // com.google.android.gms.internal.ads.zzewp
    public final zzexu zza() {
        return (zzexu)this.zzg.zzb();
    }
}

