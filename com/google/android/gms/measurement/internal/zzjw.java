package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzjw implements Runnable {
    private zzjq zza;
    private Bundle zzb;
    private long zzc;

    public zzjw(zzjq zzjq0, Bundle bundle0, long v) {
        this.zza = zzjq0;
        this.zzb = bundle0;
        this.zzc = v;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}

