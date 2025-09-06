package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzeg extends zza {
    private final Boolean zzc;
    private final zzdy zzd;

    zzeg(zzdy zzdy0, Boolean boolean0) {
        this.zzc = boolean0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        if(this.zzc != null) {
            ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
            return;
        }
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).clearMeasurementEnabled(this.zza);
    }
}

