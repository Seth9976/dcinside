package com.google.android.gms.measurement.internal;

final class zzm implements Runnable {
    private final zza zza;
    private final AppMeasurementDynamiteService zzb;

    zzm(AppMeasurementDynamiteService appMeasurementDynamiteService0, zza appMeasurementDynamiteService$zza0) {
        this.zza = appMeasurementDynamiteService$zza0;
        this.zzb = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        this.zzb.zza.zzp().zza(this.zza);
    }
}

