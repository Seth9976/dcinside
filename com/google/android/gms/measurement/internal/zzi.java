package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdo;

final class zzi implements Runnable {
    private final zzdo zza;
    private final AppMeasurementDynamiteService zzb;

    zzi(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzdo zzdo0) {
        this.zza = zzdo0;
        this.zzb = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzr().zza(this.zza);
    }
}

