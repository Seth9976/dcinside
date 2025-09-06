package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdh;

abstract class zzav {
    private static volatile Handler zza;
    private final zzjc zzb;
    private final Runnable zzc;
    private volatile long zzd;

    zzav(zzjc zzjc0) {
        Preconditions.checkNotNull(zzjc0);
        this.zzb = zzjc0;
        this.zzc = new zzay(this, zzjc0);
    }

    static void zza(zzav zzav0, long v) {
        zzav0.zzd = 0L;
    }

    final void zza() {
        this.zzd = 0L;
        this.zzd().removeCallbacks(this.zzc);
    }

    public final void zza(long v) {
        this.zza();
        if(v >= 0L) {
            this.zzd = this.zzb.zzb().currentTimeMillis();
            if(!this.zzd().postDelayed(this.zzc, v)) {
                this.zzb.zzj().zzg().zza("Failed to schedule delayed post. time", v);
            }
        }
    }

    public abstract void zzb();

    public final boolean zzc() {
        return this.zzd != 0L;
    }

    private final Handler zzd() {
        if(zzav.zza != null) {
            return zzav.zza;
        }
        synchronized(zzav.class) {
            if(zzav.zza == null) {
                zzav.zza = new zzdh(this.zzb.zza().getMainLooper());
            }
            return zzav.zza;
        }
    }
}

