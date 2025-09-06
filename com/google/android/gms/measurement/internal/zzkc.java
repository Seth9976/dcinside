package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import com.google.common.util.concurrent.e0;

final class zzkc implements e0 {
    private final zzno zza;
    private final zzjq zzb;

    zzkc(zzjq zzjq0, zzno zzno0) {
        this.zza = zzno0;
        this.zzb = zzjq0;
        super();
    }

    @Override  // com.google.common.util.concurrent.e0
    public final void onFailure(Throwable throwable0) {
        this.zzb.zzt();
        zzjq.zza(this.zzb, false);
        if(!this.zzb.zze().zza(zzbh.zzcn)) {
            this.zzb.zzas();
            this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", throwable0);
            return;
        }
        switch((this.zzb.zze().zza(zzbh.zzcl) ? zzjq.zza(this.zzb, throwable0) : 2) - 1) {
            case 0: {
                this.zzb.zzj().zzu().zza("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(throwable0.toString()));
                this.zzb.zzi = 1;
                this.zzb.zzal().add(this.zza);
                return;
            }
            case 1: {
                this.zzb.zzal().add(this.zza);
                if(this.zzb.zzi > 0x20) {
                    this.zzb.zzi = 1;
                    this.zzb.zzj().zzu().zza("registerTriggerAsync failed. May try later. App ID, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(throwable0.toString()));
                    return;
                }
                this.zzb.zzj().zzu().zza("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgo.zza(this.zzb.zzg().zzad()), zzgo.zza(String.valueOf(this.zzb.zzi)), zzgo.zza(throwable0.toString()));
                zzjq.zzb(this.zzb, this.zzb.zzi);
                this.zzb.zzi <<= 1;
                return;
            }
            case 2: {
                this.zzb.zzj().zzg().zza("registerTriggerAsync failed. Dropping URI. App ID, Throwable", zzgo.zza(this.zzb.zzg().zzad()), throwable0);
                this.zza();
                this.zzb.zzi = 1;
                this.zzb.zzas();
            }
        }
    }

    @Override  // com.google.common.util.concurrent.e0
    public final void onSuccess(Object object0) {
        this.zzb.zzt();
        if(this.zzb.zze().zza(zzbh.zzcn)) {
            this.zza();
            zzjq.zza(this.zzb, false);
            this.zzb.zzi = 1;
            this.zzb.zzj().zzc().zza("Successfully registered trigger URI", this.zza.zza);
            this.zzb.zzas();
            return;
        }
        zzjq.zza(this.zzb, false);
        this.zzb.zzas();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }

    private final void zza() {
        SparseArray sparseArray0 = this.zzb.zzk().zzm();
        sparseArray0.put(this.zza.zzc, this.zza.zzb);
        this.zzb.zzk().zza(sparseArray0);
    }
}

