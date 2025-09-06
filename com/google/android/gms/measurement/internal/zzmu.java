package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class zzmu implements Runnable {
    private final zzmq zza;

    zzmu(zzmq zzmq0) {
        this.zza = zzmq0;
        super();
    }

    @Override
    public final void run() {
        ComponentName componentName0 = new ComponentName(this.zza.zza.zza(), "com.google.android.gms.measurement.AppMeasurementService");
        zzls.zza(this.zza.zza, componentName0);
    }
}

