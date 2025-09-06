package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzeen implements Callable {
    public final zzeeq zza;
    public final zzfca zzb;
    public final zzfbo zzc;

    public zzeen(zzeeq zzeeq0, zzfca zzfca0, zzfbo zzfbo0) {
        this.zza = zzeeq0;
        this.zzb = zzfca0;
        this.zzc = zzfbo0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}

