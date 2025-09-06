package com.google.android.gms.internal.ads;

public final class zzfhj implements Runnable {
    public final zzfhk zza;
    public final zzfha zzb;

    public zzfhj(zzfhk zzfhk0, zzfha zzfha0) {
        this.zza = zzfhk0;
        this.zzb = zzfha0;
    }

    @Override
    public final void run() {
        this.zza.zzc(this.zzb);
    }
}

