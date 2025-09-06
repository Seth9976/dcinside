package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdo;

final class zzl implements Runnable {
    private final zzdo zza;
    private final String zzb;
    private final String zzc;
    private final AppMeasurementDynamiteService zzd;

    zzl(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzdo zzdo0, String s, String s1) {
        this.zza = zzdo0;
        this.zzb = s;
        this.zzc = s1;
        this.zzd = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        this.zzd.zza.zzr().zza(this.zza, this.zzb, this.zzc);
    }
}

