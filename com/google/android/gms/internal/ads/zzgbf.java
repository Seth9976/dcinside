package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;

public final class zzgbf implements Runnable {
    public final zzgbh zza;
    public final int zzb;
    public final t0 zzc;

    public zzgbf(zzgbh zzgbh0, int v, t0 t00) {
        this.zza = zzgbh0;
        this.zzb = v;
        this.zzc = t00;
    }

    @Override
    public final void run() {
        this.zza.zzw(this.zzb, this.zzc);
    }
}

