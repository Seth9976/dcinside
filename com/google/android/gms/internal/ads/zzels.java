package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.t0;

public final class zzels implements zzetr {
    private final Clock zza;
    private final zzfcj zzb;

    zzels(Clock clock0, zzfcj zzfcj0) {
        this.zza = clock0;
        this.zzb = zzfcj0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 4;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        long v = this.zza.currentTimeMillis();
        return zzgch.zzh(new zzelt(this.zzb, v));
    }
}

