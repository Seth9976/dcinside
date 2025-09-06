package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;

public final class zzdfr implements zzr {
    private final zzcxz zza;
    private final zzdde zzb;

    public zzdfr(zzcxz zzcxz0, zzdde zzdde0) {
        this.zza = zzcxz0;
        this.zzb = zzdde0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        this.zza.zzdE();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        this.zza.zzdi();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        this.zza.zzdo();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.zza.zzdp();
        this.zzb.zzb();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        this.zza.zzdr();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        this.zza.zzds(v);
        this.zzb.zza();
    }
}

