package com.google.android.gms.internal.ads;

public final class zzehw implements Runnable {
    public final zzehx zza;
    public final zzfca zzb;
    public final zzfbo zzc;
    public final zzecz zzd;

    public zzehw(zzehx zzehx0, zzfca zzfca0, zzfbo zzfbo0, zzecz zzecz0) {
        this.zza = zzehx0;
        this.zzb = zzfca0;
        this.zzc = zzfbo0;
        this.zzd = zzecz0;
    }

    @Override
    public final void run() {
        zzehz.zzd(this.zza.zzd, this.zzb, this.zzc, this.zzd);
    }
}

