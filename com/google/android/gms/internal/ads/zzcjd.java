package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;

final class zzcjd implements zzezu {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    zzcjd(zzcih zzcih0, Context context0, String s, zzs zzs0, zzcjm zzcjm0) {
        this.zza = zzcih0;
        zzher zzher0 = zzhes.zza(context0);
        this.zzb = zzher0;
        zzher zzher1 = zzhes.zza(zzs0);
        this.zzc = zzher1;
        zzher zzher2 = zzhes.zza(s);
        this.zzd = zzher2;
        zzhfa zzhfa0 = zzheq.zzc(new zzeko(zzcih0.zzM));
        this.zze = zzhfa0;
        zzhfa zzhfa1 = zzheq.zzc(new zzfas(zzcih0.zzbh));
        this.zzf = zzhfa1;
        zzhfa zzhfa2 = zzheq.zzc(new zzezs(zzher0, zzcih0.zzc, zzcih0.zzS, zzhfa0, zzhfa1, zzfcl.zza()));
        this.zzg = zzhfa2;
        this.zzh = zzheq.zzc(new zzekw(zzher0, zzher1, zzher2, zzhfa2, zzhfa0, zzhfa1, zzcih0.zzl, zzcih0.zzU, zzcih0.zzM));
    }

    @Override  // com.google.android.gms.internal.ads.zzezu
    public final zzekv zza() {
        return (zzekv)this.zzh.zzb();
    }
}

