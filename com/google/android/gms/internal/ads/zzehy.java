package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

final class zzehy extends zzbwg {
    final zzcxz zza;
    final zzcvr zzb;
    final zzcxa zzc;
    final zzdeb zzd;

    zzehy(zzehz zzehz0, zzcxz zzcxz0, zzcvr zzcvr0, zzcxa zzcxa0, zzdeb zzdeb0) {
        this.zza = zzcxz0;
        this.zzb = zzcvr0;
        this.zzc = zzcxa0;
        this.zzd = zzdeb0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zze(IObjectWrapper iObjectWrapper0) {
        this.zzb.onAdClicked();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        this.zza.zzds(4);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzh(IObjectWrapper iObjectWrapper0) {
        this.zzc.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzi(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.zza.zzdp();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzl(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzm(IObjectWrapper iObjectWrapper0, zzbwi zzbwi0) {
        this.zzd.zza(zzbwi0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzn(IObjectWrapper iObjectWrapper0) {
        this.zzc.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwh
    public final void zzo(IObjectWrapper iObjectWrapper0) {
        this.zzd.zzc();
    }
}

