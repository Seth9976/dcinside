package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzatt implements Callable {
    public final zzatv zza;
    public final Context zzb;

    public zzatt(zzatv zzatv0, Context context0) {
        this.zza = zzatv0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzb(this.zzb);
    }
}

