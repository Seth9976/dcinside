package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzceb implements Runnable {
    public final zzcbs zza;
    public final Map zzb;

    public zzceb(zzcbs zzcbs0, Map map0) {
        this.zza = zzcbs0;
        this.zzb = map0;
    }

    @Override
    public final void run() {
        this.zza.zzd("onGcacheInfoEvent", this.zzb);
    }
}

