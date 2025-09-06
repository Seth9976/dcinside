package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdo;

final class zzn implements Runnable {
    private final zzdo zza;
    private final AppMeasurementDynamiteService zzb;

    zzn(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzdo zzdo0) {
        this.zza = zzdo0;
        this.zzb = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        zzos zzos0 = this.zzb.zza.zzt();
        boolean z = this.zzb.zza.zzab();
        zzos0.zza(this.zza, z);
    }
}

