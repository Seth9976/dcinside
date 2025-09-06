package com.google.android.gms.tasks;

final class zzm implements Runnable {
    final Task zza;
    final zzn zzb;

    zzm(zzn zzn0, Task task0) {
        this.zzb = zzn0;
        this.zza = task0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zzb.zzb) {
            zzn zzn0 = this.zzb;
            if(zzn0.zzc != null) {
                zzn0.zzc.onSuccess(this.zza.getResult());
            }
        }
    }
}

