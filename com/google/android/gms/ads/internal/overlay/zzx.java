package com.google.android.gms.ads.internal.overlay;

import java.util.Map;

public final class zzx implements Runnable {
    public final zzz zza;
    public final String zzb;
    public final Map zzc;

    public zzx(zzz zzz0, String s, Map map0) {
        this.zza = zzz0;
        this.zzb = s;
        this.zzc = map0;
    }

    @Override
    public final void run() {
        this.zza.zzh(this.zzb, this.zzc);
    }
}

