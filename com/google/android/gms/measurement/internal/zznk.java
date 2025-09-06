package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

final class zznk extends zzav {
    private final zznh zza;

    zznk(zznh zznh0, zzjc zzjc0) {
        this.zza = zznh0;
        super(zzjc0);
    }

    @Override  // com.google.android.gms.measurement.internal.zzav
    @WorkerThread
    public final void zzb() {
        zznh.zza(this.zza);
    }
}

