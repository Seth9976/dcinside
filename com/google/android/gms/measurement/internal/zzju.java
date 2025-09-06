package com.google.android.gms.measurement.internal;

import java.util.List;

public final class zzju implements Runnable {
    private zzjq zza;
    private List zzb;

    public zzju(zzjq zzjq0, List list0) {
        this.zza = zzjq0;
        this.zzb = list0;
    }

    @Override
    public final void run() {
        this.zza.zza(this.zzb);
    }
}

