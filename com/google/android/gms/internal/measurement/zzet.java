package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzet extends zza {
    private final zzc zzc;
    private final zzdy zzd;

    zzet(zzdy zzdy0, zzc zzdy$zzc0) {
        this.zzc = zzdy$zzc0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).setEventInterceptor(this.zzc);
    }
}

