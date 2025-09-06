package com.google.android.gms.internal.ads;

final class zzapc implements Runnable {
    private final zzapm zza;
    private final zzaps zzb;
    private final Runnable zzc;

    public zzapc(zzapm zzapm0, zzaps zzaps0, Runnable runnable0) {
        this.zza = zzapm0;
        this.zzb = zzaps0;
        this.zzc = runnable0;
    }

    @Override
    public final void run() {
        zzaps zzaps0 = this.zzb;
        if(zzaps0.zzc()) {
            this.zza.zzo(zzaps0.zza);
        }
        else {
            this.zza.zzn(zzaps0.zzc);
        }
        if(this.zzb.zzd) {
            this.zza.zzm("intermediate-response");
        }
        else {
            this.zza.zzp("done");
        }
        Runnable runnable0 = this.zzc;
        if(runnable0 != null) {
            runnable0.run();
        }
    }
}

