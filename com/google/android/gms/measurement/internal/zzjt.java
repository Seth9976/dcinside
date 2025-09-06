package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzjt implements Runnable {
    private zzjq zza;
    private Bundle zzb;

    public zzjt(zzjq zzjq0, Bundle bundle0) {
        this.zza = zzjq0;
        this.zzb = bundle0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

