package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzej implements Runnable {
    public final zzel zza;
    public final IObjectWrapper zzb;

    public zzej(zzel zzel0, IObjectWrapper iObjectWrapper0) {
        this.zza = zzel0;
        this.zzb = iObjectWrapper0;
    }

    @Override
    public final void run() {
        this.zza.zzl(this.zzb);
    }
}

