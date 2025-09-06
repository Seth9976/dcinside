package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzls implements zzkk {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzbe zzd;

    public zzls(zzcx zzcx0) {
        this.zzd = zzbe.zza;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        long v = this.zzb;
        if(this.zza) {
            long v1 = SystemClock.elapsedRealtime() - this.zzc;
            return this.zzd.zzb == 1.0f ? v + zzei.zzs(v1) : v + this.zzd.zza(v1);
        }
        return v;
    }

    public final void zzb(long v) {
        this.zzb = v;
        if(this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd;
    }

    public final void zzd() {
        if(!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zze() {
        if(this.zza) {
            this.zzb(this.zza());
            this.zza = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbe0) {
        if(this.zza) {
            this.zzb(this.zza());
        }
        this.zzd = zzbe0;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        return false;
    }
}

