package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzcjh implements zzdoe {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;

    zzcjh(zzcih zzcih0, zzcjm zzcjm0) {
        this.zza = zzcih0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcuy
    public final zzcuy zza(@Nullable zzeym zzeym0) {
        this.zzc = zzeym0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcuy
    public final zzcuy zzb(@Nullable zzezj zzezj0) {
        this.zzb = zzezj0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdoe
    public final zzdoe zzc(zzdbm zzdbm0) {
        this.zzd = zzdbm0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdoe
    public final zzdoe zzd(zzcvc zzcvc0) {
        this.zze = zzcvc0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdoe
    public final zzdof zze() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        zzcsf zzcsf0 = new zzcsf();
        zzfdo zzfdo0 = new zzfdo();
        zzcue zzcue0 = new zzcue();
        zzdsl zzdsl0 = new zzdsl();
        zzdbm zzdbm0 = this.zzd;
        zzcvc zzcvc0 = this.zze;
        zzegz zzegz0 = zzehb.zza();
        return new zzcji(this.zza, zzcsf0, zzfdo0, zzcue0, zzdsl0, zzdbm0, zzcvc0, zzegz0, null, this.zzb, this.zzc, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcuy
    public final Object zzh() {
        return this.zze();
    }
}

