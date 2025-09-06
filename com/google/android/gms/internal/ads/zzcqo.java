package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzcqo implements zzayk, zzcxh {
    private final zzfbo zza;
    private final zzcwl zzb;
    private final zzcxq zzc;
    private final AtomicBoolean zzd;
    private final AtomicBoolean zze;

    public zzcqo(zzfbo zzfbo0, zzcwl zzcwl0, zzcxq zzcxq0) {
        this.zzd = new AtomicBoolean();
        this.zze = new AtomicBoolean();
        this.zza = zzfbo0;
        this.zzb = zzcwl0;
        this.zzc = zzcxq0;
    }

    private final void zza() {
        if(this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        if(this.zza.zze == 1 && zzayj0.zzj) {
            this.zza();
        }
        if(zzayj0.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        synchronized(this) {
            if(this.zza.zze != 1) {
                this.zza();
            }
        }
    }
}

