package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcru implements zzr {
    private final zzcxa zza;
    private final AtomicBoolean zzb;
    private final AtomicBoolean zzc;

    public zzcru(zzcxa zzcxa0) {
        this.zzb = new AtomicBoolean(false);
        this.zzc = new AtomicBoolean(false);
        this.zza = zzcxa0;
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        this.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.zza.zzc();
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int v) {
        this.zzb.set(true);
        this.zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }

    private final void zzh() {
        if(!this.zzc.get()) {
            this.zzc.set(true);
            this.zza.zza();
        }
    }
}

