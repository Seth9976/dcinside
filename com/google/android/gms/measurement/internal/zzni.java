package com.google.android.gms.measurement.internal;

public final class zzni implements Runnable {
    private zznf zza;

    public zzni(zznf zznf0) {
        this.zza = zznf0;
    }

    @Override
    public final void run() {
        zzng zzng0 = this.zza.zzc;
        long v = this.zza.zza;
        long v1 = this.zza.zzb;
        zzng0.zza.zzt();
        zzng0.zza.zzj().zzc().zza("Application going to the background");
        zzng0.zza.zzk().zzn.zza(true);
        zzng0.zza.zza(true);
        if(!zzng0.zza.zze().zzw()) {
            if(zzng0.zza.zze().zza(zzbh.zzcp)) {
                zzng0.zza.zza(false, false, v1);
                zzng0.zza.zzb.zzb(v1);
            }
            else {
                zzng0.zza.zzb.zzb(v1);
                zzng0.zza.zza(false, false, v1);
            }
        }
        zzng0.zza.zzj().zzo().zza("Application backgrounded at: timestamp_millis", v);
        if(zzng0.zza.zze().zza(zzbh.zzdd)) {
            zzng0.zza.zzm().zzam();
        }
    }
}

