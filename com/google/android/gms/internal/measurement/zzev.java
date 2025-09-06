package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzev extends zza {
    private final String zzc;
    private final zzdk zzd;
    private final zzdy zze;

    zzev(zzdy zzdy0, String s, zzdk zzdk0) {
        this.zzc = s;
        this.zzd = zzdk0;
        this.zze = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zze.zzj)).getMaxUserProperties(this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zzd.zza(null);
    }
}

