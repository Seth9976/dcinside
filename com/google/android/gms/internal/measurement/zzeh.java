package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzeh extends zza {
    private final zzdy zzc;

    zzeh(zzdy zzdy0) {
        this.zzc = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzc.zzj)).resetAnalyticsData(this.zza);
    }
}

