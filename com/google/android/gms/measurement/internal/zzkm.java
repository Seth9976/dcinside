package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

final class zzkm extends zzav {
    private final zzjq zza;

    zzkm(zzjq zzjq0, zzjc zzjc0) {
        this.zza = zzjq0;
        super(zzjc0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzav
    @WorkerThread
    public final void zzb() {
        if(this.zza.zzu.zzah()) {
            this.zza.zzq.zza(2000L);
        }
    }
}

