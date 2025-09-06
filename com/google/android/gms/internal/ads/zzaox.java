package com.google.android.gms.internal.ads;

final class zzaox implements Runnable {
    final zzapm zza;
    final zzaoy zzb;

    zzaox(zzaoy zzaoy0, zzapm zzapm0) {
        this.zza = zzapm0;
        this.zzb = zzaoy0;
        super();
    }

    @Override
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
        }
    }
}

