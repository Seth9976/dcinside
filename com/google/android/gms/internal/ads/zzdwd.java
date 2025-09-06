package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdwd implements Callable {
    public final zzdwg zza;
    public final zzbvk zzb;

    public zzdwd(zzdwg zzdwg0, zzbvk zzbvk0) {
        this.zza = zzdwg0;
        this.zzb = zzbvk0;
    }

    @Override
    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}

