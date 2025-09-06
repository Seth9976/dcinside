package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

final class zznh {
    @VisibleForTesting
    protected long zza;
    final zznb zzb;
    @VisibleForTesting
    private long zzc;
    private final zzav zzd;

    public zznh(zznb zznb0) {
        this.zzb = zznb0;
        super();
        this.zzd = new zznk(this, zznb0.zzu);
        long v = zznb0.zzb().elapsedRealtime();
        this.zzc = v;
        this.zza = v;
    }

    static void zza(zznh zznh0) {
        zznh0.zzb.zzt();
        zznh0.zza(false, false, zznh0.zzb.zzb().elapsedRealtime());
        zznh0.zzb.zzc().zza(zznh0.zzb.zzb().elapsedRealtime());
    }

    @VisibleForTesting
    @WorkerThread
    final long zza(long v) {
        long v1 = v - this.zza;
        this.zza = v;
        return v1;
    }

    final void zza() {
        this.zzd.zza();
        this.zzc = this.zzb.zze().zza(zzbh.zzdb) ? this.zzb.zzb().elapsedRealtime() : 0L;
        this.zza = this.zzc;
    }

    @WorkerThread
    public final boolean zza(boolean z, boolean z1, long v) {
        this.zzb.zzt();
        this.zzb.zzu();
        if(this.zzb.zzu.zzac()) {
            zzha zzha0 = this.zzb.zzk();
            long v1 = this.zzb.zzb().currentTimeMillis();
            zzha0.zzk.zza(v1);
        }
        long v2 = v - this.zzc;
        if(!z && v2 < 1000L) {
            this.zzb.zzj().zzp().zza("Screen exposed for less than 1000 ms. Event not sent. time", v2);
            return false;
        }
        if(!z1) {
            v2 = this.zza(v);
        }
        this.zzb.zzj().zzp().zza("Recording user engagement, ms", v2);
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_et", v2);
        boolean z2 = this.zzb.zze().zzw();
        zzos.zza(this.zzb.zzn().zza(!z2), bundle0, true);
        if(!z1) {
            this.zzb.zzm().zzc("auto", "_e", bundle0);
        }
        this.zzc = v;
        this.zzd.zza();
        long v3 = (long)(((Long)zzbh.zzbc.zza(null)));
        this.zzd.zza(v3);
        return true;
    }

    @WorkerThread
    final void zzb(long v) {
        this.zzd.zza();
    }

    @WorkerThread
    final void zzc(long v) {
        this.zzb.zzt();
        this.zzd.zza();
        this.zzc = v;
        this.zza = v;
    }
}

