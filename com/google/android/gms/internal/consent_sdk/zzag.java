package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

final class zzag extends zza {
    private final zzag zza;
    private final zzdq zzb;
    private final zzdq zzc;
    private final zzdq zzd;
    private final zzdq zze;
    private final zzdq zzf;
    private final zzdq zzg;
    private final zzdq zzh;
    private final zzdq zzi;
    private final zzdq zzj;
    private final zzdq zzk;
    private final zzdq zzl;

    zzag(Application application0, zzaf zzaf0) {
        this.zza = this;
        zzdn zzdn0 = zzdo.zzb(application0);
        this.zzb = zzdn0;
        zzdq zzdq0 = zzdm.zzb(new zzaq(zzdn0));
        this.zzc = zzdq0;
        zzdq zzdq1 = zzdm.zzb(zzac.zza);
        this.zzd = zzdq1;
        zzae zzae0 = new zzae(this);
        this.zze = zzae0;
        zzdq zzdq2 = zzdm.zzb(new zzbo(zzae0, zzat.zza));
        this.zzf = zzdq2;
        zzo zzo0 = new zzo(zzdn0, zzdq0);
        this.zzg = zzo0;
        zzdq zzdq3 = zzdm.zzb(new zzf(zzat.zza));
        this.zzh = zzdq3;
        zzao zzao0 = new zzao(zzdn0, zzdq0, zzat.zza);
        this.zzi = zzao0;
        zzaa zzaa0 = new zzaa(zzdq3, zzao0, zzdq0);
        this.zzj = zzaa0;
        zzv zzv0 = new zzv(zzdn0, zzdq1, zzar.zza, zzat.zza, zzdq0, zzdq2, zzo0, zzaa0, zzdq3);
        this.zzk = zzv0;
        this.zzl = zzdm.zzb(new zzk(zzdq0, zzv0, zzdq2));
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zza
    public final zzj zzb() {
        return (zzj)this.zzl.zza();
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zza
    public final zzbn zzc() {
        return (zzbn)this.zzf.zza();
    }
}

