package com.google.android.gms.internal.ads;

public final class zziy implements Runnable {
    public final zzjp zza;
    public final zzjz zzb;

    public zziy(zzjp zzjp0, zzjz zzjz0) {
        this.zza = zzjp0;
        this.zzb = zzjz0;
    }

    @Override
    public final void run() {
        this.zza.zzO(this.zzb);
    }
}

