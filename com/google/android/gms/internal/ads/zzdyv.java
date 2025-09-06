package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;

public final class zzdyv implements Callable {
    public final t0 zza;
    public final t0 zzb;

    public zzdyv(t0 t00, t0 t01) {
        this.zza = t00;
        this.zzb = t01;
    }

    @Override
    public final Object call() {
        return new zzdzk(((zzdzo)this.zza.get()), ((zzdzi)this.zzb.get()).zzb, ((zzdzi)this.zzb.get()).zza);
    }
}

