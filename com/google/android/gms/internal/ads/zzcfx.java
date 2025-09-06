package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzcfx implements Runnable {
    public final zzcfz zza;
    public final Map zzb;

    public zzcfx(zzcfz zzcfz0, Map map0) {
        this.zza = zzcfz0;
        this.zzb = map0;
    }

    @Override
    public final void run() {
        this.zza.zzr(this.zzb);
    }
}

