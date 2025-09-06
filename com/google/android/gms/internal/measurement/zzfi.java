package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzfi extends zza {
    private final Activity zzc;
    private final zzd zzd;

    zzfi(zzd zzdy$zzd0, Activity activity0) {
        this.zzc = activity0;
        this.zzd = zzdy$zzd0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(zzdy.this.zzj)).onActivityStarted(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}

