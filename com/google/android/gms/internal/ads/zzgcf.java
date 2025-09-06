package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzgcf {
    private final boolean zza;
    private final zzfxn zzb;

    zzgcf(boolean z, zzfxn zzfxn0, zzgcg zzgcg0) {
        this.zza = z;
        this.zzb = zzfxn0;
    }

    public final t0 zza(Callable callable0, Executor executor0) {
        return new zzgbu(this.zzb, this.zza, executor0, callable0);
    }
}

