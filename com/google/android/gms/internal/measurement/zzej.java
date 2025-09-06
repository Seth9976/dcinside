package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzej extends zza {
    private final long zzc;
    private final zzdy zzd;

    zzej(zzdy zzdy0, long v) {
        this.zzc = v;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).setSessionTimeoutDuration(this.zzc);
    }
}

