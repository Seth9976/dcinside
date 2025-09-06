package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzfix implements Callable {
    public final zzfja zza;
    public final String zzb;

    public zzfix(zzfja zzfja0, String s) {
        this.zza = zzfja0;
        this.zzb = s;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}

