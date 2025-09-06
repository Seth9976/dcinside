package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.t0;

final class zzeoi {
    public final t0 zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(t0 t00, long v, Clock clock0) {
        this.zza = t00;
        this.zzc = clock0;
        this.zzb = clock0.elapsedRealtime() + v;
    }

    public final boolean zza() {
        long v = this.zzc.elapsedRealtime();
        return this.zzb < v;
    }
}

