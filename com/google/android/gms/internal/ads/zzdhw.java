package com.google.android.gms.internal.ads;

public final class zzdhw implements Runnable {
    public final zzdia zza;
    public final boolean zzb;

    public zzdhw(zzdia zzdia0, boolean z) {
        this.zza = zzdia0;
        this.zzb = z;
    }

    @Override
    public final void run() {
        this.zza.zzy(this.zzb);
    }
}

