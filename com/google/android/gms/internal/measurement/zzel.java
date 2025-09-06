package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzel extends zza {
    private final String zzc;
    private final zzdy zzd;

    zzel(zzdy zzdy0, String s) {
        this.zzc = s;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).endAdUnitExposure(this.zzc, this.zzb);
    }
}

