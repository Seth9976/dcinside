package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdwx implements Callable {
    public final zzdwz zza;
    public final zzbvk zzb;

    public zzdwx(zzdwz zzdwz0, zzbvk zzbvk0) {
        this.zza = zzdwz0;
        this.zzb = zzbvk0;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}

