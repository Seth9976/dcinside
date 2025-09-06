package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzdo;

final class zzk implements Runnable {
    private final zzdo zza;
    private final zzbf zzb;
    private final String zzc;
    private final AppMeasurementDynamiteService zzd;

    zzk(AppMeasurementDynamiteService appMeasurementDynamiteService0, zzdo zzdo0, zzbf zzbf0, String s) {
        this.zza = zzdo0;
        this.zzb = zzbf0;
        this.zzc = s;
        this.zzd = appMeasurementDynamiteService0;
        super();
    }

    @Override
    public final void run() {
        this.zzd.zza.zzr().zza(this.zza, this.zzb, this.zzc);
    }
}

