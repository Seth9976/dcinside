package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzbyg implements Callable {
    public final zzbyi zza;
    public final Context zzb;

    public zzbyg(zzbyi zzbyi0, Context context0) {
        this.zza = zzbyi0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zze(this.zzb);
    }
}

