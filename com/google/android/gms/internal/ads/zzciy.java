package com.google.android.gms.internal.ads;

import android.content.Context;

final class zzciy implements zzdth {
    private final Context zza;
    private final zzbko zzb;
    private final zzcih zzc;
    private final zzciy zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;

    zzciy(zzcih zzcih0, Context context0, zzbko zzbko0, zzcjm zzcjm0) {
        this.zzd = this;
        this.zzc = zzcih0;
        this.zza = context0;
        this.zzb = zzbko0;
        zzher zzher0 = zzhes.zza(this);
        this.zze = zzher0;
        zzher zzher1 = zzhes.zza(zzbko0);
        this.zzf = zzher1;
        zzdtd zzdtd0 = new zzdtd(zzher1);
        this.zzg = zzdtd0;
        this.zzh = zzheq.zzc(new zzdtf(zzher0, zzdtd0));
    }

    @Override  // com.google.android.gms.internal.ads.zzdth
    public final zzdsy zzb() {
        return new zzciv(this.zzc, this.zzd, null);
    }

    static zzdtc zzc(zzciy zzciy0) {
        return zzdtd.zzc(zzciy0.zzb);
    }

    @Override  // com.google.android.gms.internal.ads.zzdth
    public final zzdte zzd() {
        return (zzdte)this.zzh.zzb();
    }
}

