package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzcie implements zzdgp {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;
    private zzdgl zzf;
    private zzcoj zzg;

    zzcie(zzcih zzcih0, zzcjm zzcjm0) {
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

    @Override  // com.google.android.gms.internal.ads.zzdgp
    public final zzdgp zzc(zzcoj zzcoj0) {
        this.zzg = zzcoj0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgp
    public final zzdgp zzd(zzdgl zzdgl0) {
        this.zzf = zzdgl0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgp
    public final zzdgp zze(zzdbm zzdbm0) {
        this.zzd = zzdbm0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgp
    public final zzdgp zzf(zzcvc zzcvc0) {
        this.zze = zzcvc0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzdgp
    public final zzdgq zzg() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        zzhez.zzc(this.zzf, zzdgl.class);
        zzhez.zzc(this.zzg, zzcoj.class);
        zzcoj zzcoj0 = this.zzg;
        zzdgl zzdgl0 = this.zzf;
        zzcsf zzcsf0 = new zzcsf();
        zzfdo zzfdo0 = new zzfdo();
        zzcue zzcue0 = new zzcue();
        zzdsl zzdsl0 = new zzdsl();
        zzdbm zzdbm0 = this.zzd;
        zzcvc zzcvc0 = this.zze;
        zzegz zzegz0 = zzehb.zza();
        return new zzcif(this.zza, zzcoj0, zzdgl0, zzcsf0, zzfdo0, zzcue0, zzdsl0, zzdbm0, zzcvc0, zzegz0, null, this.zzb, this.zzc, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcuy
    public final Object zzh() {
        return this.zzg();
    }
}

