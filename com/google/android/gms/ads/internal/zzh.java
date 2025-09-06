package com.google.android.gms.ads.internal;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzh implements Callable {
    public final zzk zza;
    public final Context zzb;

    public zzh(zzk zzk0, Context context0) {
        this.zza = zzk0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzb(this.zzb, null);
    }
}

