package com.google.android.gms.internal.ads;

public final class zzaax implements Runnable {
    public final zzabb zza;
    public final zzhs zzb;

    public zzaax(zzabb zzabb0, zzhs zzhs0) {
        this.zza = zzabb0;
        this.zzb = zzhs0;
    }

    @Override
    public final void run() {
        this.zza.zzk(this.zzb);
    }
}

