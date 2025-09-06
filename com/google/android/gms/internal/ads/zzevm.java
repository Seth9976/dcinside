package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import java.util.concurrent.Callable;

public final class zzevm implements Callable {
    public final t0 zza;
    public final t0 zzb;

    public zzevm(t0 t00, t0 t01) {
        this.zza = t00;
        this.zzb = t01;
    }

    @Override
    public final Object call() {
        return new zzevo(((String)this.zza.get()), ((String)this.zzb.get()));
    }
}

