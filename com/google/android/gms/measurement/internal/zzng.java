package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

final class zzng {
    final zznb zza;
    private zznf zzb;

    zzng(zznb zznb0) {
        this.zza = zznb0;
        super();
    }

    @WorkerThread
    final void zza() {
        this.zza.zzt();
        if(this.zzb != null) {
            this.zza.zzc.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
        if(this.zza.zze().zza(zzbh.zzcl) && this.zza.zzm().zzau()) {
            this.zza.zzj().zzp().zza("Retrying trigger URI registration in foreground");
            this.zza.zzm().zzas();
        }
    }

    @WorkerThread
    final void zza(long v) {
        this.zzb = new zznf(this, this.zza.zzb().currentTimeMillis(), v);
        this.zza.zzc.postDelayed(this.zzb, 2000L);
    }
}

