package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

public final class zzdtr implements Callable {
    public final zzdua zza;
    public final zzfgw zzb;

    public zzdtr(zzdua zzdua0, zzfgw zzfgw0) {
        this.zza = zzdua0;
        this.zzb = zzfgw0;
    }

    @Override
    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}

