package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzcjf implements zzfbi {
    private final zzcih zza;
    private final zzhfa zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;

    zzcjf(zzcih zzcih0, Context context0, String s, zzcjm zzcjm0) {
        this.zza = zzcih0;
        zzher zzher0 = zzhes.zza(context0);
        this.zzb = zzher0;
        zzezi zzezi0 = new zzezi(zzher0, zzcih0.zzbh, zzcih0.zzbi);
        this.zzc = zzezi0;
        zzhfa zzhfa0 = zzheq.zzc(new zzfas(zzcih0.zzbh));
        this.zzd = zzhfa0;
        zzhfa zzhfa1 = zzheq.zzc(zzfcg.zza());
        this.zze = zzhfa1;
        zzhfa zzhfa2 = zzheq.zzc(new zzfbc(zzher0, zzcih0.zzc, zzcih0.zzS, zzezi0, zzhfa0, zzfcl.zza(), zzhfa1));
        this.zzf = zzhfa2;
        this.zzg = zzheq.zzc(new zzfbm(zzhfa2, zzhfa0, zzhfa1));
        zzher zzher1 = zzhes.zzc(s);
        this.zzh = zzher1;
        this.zzi = zzheq.zzc(new zzfbg(zzher1, zzhfa2, zzher0, zzhfa0, zzhfa1, zzcih0.zzl, zzcih0.zzU, zzcih0.zzM));
    }

    @Override  // com.google.android.gms.internal.ads.zzfbi
    public final zzfbf zza() {
        return (zzfbf)this.zzi.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzfbi
    public final zzfbl zzb() {
        return (zzfbl)this.zzg.zzb();
    }
}

