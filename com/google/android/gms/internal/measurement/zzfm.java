package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzfm extends zza {
    private final Activity zzc;
    private final zzdk zzd;
    private final zzd zze;

    zzfm(zzd zzdy$zzd0, Activity activity0, zzdk zzdk0) {
        this.zzc = activity0;
        this.zzd = zzdk0;
        this.zze = zzdy$zzd0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(zzdy.this.zzj)).onActivitySaveInstanceState(ObjectWrapper.wrap(this.zzc), this.zzd, this.zzb);
    }
}

