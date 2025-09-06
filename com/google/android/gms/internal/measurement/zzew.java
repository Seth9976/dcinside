package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzew extends zza {
    private final Bundle zzc;
    private final zzdk zzd;
    private final zzdy zze;

    zzew(zzdy zzdy0, Bundle bundle0, zzdk zzdk0) {
        this.zzc = bundle0;
        this.zzd = zzdk0;
        this.zze = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zze.zzj)).performAction(this.zzc, this.zzd, this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zzd.zza(null);
    }
}

