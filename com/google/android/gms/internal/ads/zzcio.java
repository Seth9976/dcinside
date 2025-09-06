package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

final class zzcio implements zzcpp {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;
    private zzeiw zzf;
    private zzcqr zzg;
    private zzegz zzh;
    private zzcoj zzi;
    private zzdgl zzj;

    zzcio(zzcih zzcih0, zzcjm zzcjm0) {
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

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzc(zzcoj zzcoj0) {
        this.zzi = zzcoj0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzd(zzdgl zzdgl0) {
        this.zzj = zzdgl0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zze(zzeiw zzeiw0) {
        this.zzf = zzeiw0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzf(zzdbm zzdbm0) {
        this.zzd = zzdbm0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzg(zzcqr zzcqr0) {
        this.zzg = zzcqr0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcuy
    public final Object zzh() {
        return this.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzi(zzcvc zzcvc0) {
        this.zze = zzcvc0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpp zzj(zzegz zzegz0) {
        this.zzh = zzegz0;
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcpp
    public final zzcpq zzk() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        zzhez.zzc(this.zzf, zzeiw.class);
        zzhez.zzc(this.zzg, zzcqr.class);
        if(this.zzh == null) {
            this.zzh = zzehb.zza();
        }
        zzhez.zzc(this.zzi, zzcoj.class);
        zzhez.zzc(this.zzj, zzdgl.class);
        zzcoj zzcoj0 = this.zzi;
        zzdgl zzdgl0 = this.zzj;
        zzcsf zzcsf0 = new zzcsf();
        zzfdo zzfdo0 = new zzfdo();
        zzcue zzcue0 = new zzcue();
        zzdsl zzdsl0 = new zzdsl();
        return new zzcip(this.zza, zzcoj0, zzdgl0, zzcsf0, zzfdo0, zzcue0, zzdsl0, this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}

