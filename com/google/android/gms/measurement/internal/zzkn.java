package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzkn implements Runnable {
    private final Bundle zza;
    private final zzjq zzb;

    zzkn(zzjq zzjq0, Bundle bundle0) {
        this.zza = bundle0;
        this.zzb = zzjq0;
        super();
    }

    @Override
    public final void run() {
        zzjq.zza(this.zzb, this.zza);
    }
}

