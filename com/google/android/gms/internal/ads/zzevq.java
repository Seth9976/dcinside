package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzevq implements Callable {
    public final zzevr zza;

    public zzevq(zzevr zzevr0) {
        this.zza = zzevr0;
    }

    @Override
    public final Object call() {
        return new zzevs(this.zza.zzb);
    }
}

