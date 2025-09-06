package com.google.android.gms.internal.ads;

final class zzaur implements Runnable {
    final zzaus zza;

    zzaur(zzaus zzaus0) {
        this.zza = zzaus0;
        super();
    }

    @Override
    public final void run() {
        synchronized(this.zza.zzo) {
            if(!this.zza.zzp) {
                this.zza.zzp = true;
                try {
                    zzaus.zzj(this.zza);
                }
                catch(Exception exception0) {
                    this.zza.zzh.zzc(2023, -1L, exception0);
                }
                Object object1 = this.zza.zzo;
                synchronized(object1) {
                    this.zza.zzp = false;
                }
            }
        }
    }
}

