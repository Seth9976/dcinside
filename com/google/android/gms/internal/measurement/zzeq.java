package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzeq extends zza {
    private final zzdk zzc;
    private final zzdy zzd;

    zzeq(zzdy zzdy0, zzdk zzdk0) {
        this.zzc = zzdk0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).generateEventId(this.zzc);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zzc.zza(null);
    }
}

