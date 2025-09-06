package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzdwi implements Callable {
    public final zzava zza;
    public final Context zzb;

    public zzdwi(zzava zzava0, Context context0) {
        this.zza = zzava0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc().zzg(this.zzb);
    }
}

