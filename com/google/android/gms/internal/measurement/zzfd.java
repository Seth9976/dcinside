package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzfd extends zza {
    private final zzb zzc;
    private final zzdy zzd;

    zzfd(zzdy zzdy0, zzb zzdy$zzb0) {
        this.zzc = zzdy$zzb0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).unregisterOnMeasurementEventListener(this.zzc);
    }
}

