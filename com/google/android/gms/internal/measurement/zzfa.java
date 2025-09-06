package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzfa extends zza {
    private final zzdk zzc;
    private final int zzd;
    private final zzdy zze;

    zzfa(zzdy zzdy0, zzdk zzdk0, int v) {
        this.zzc = zzdk0;
        this.zzd = v;
        this.zze = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zze.zzj)).getTestFlag(this.zzc, this.zzd);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zzc.zza(null);
    }
}

