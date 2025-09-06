package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzed extends zza {
    private final Activity zzc;
    private final String zzd;
    private final String zze;
    private final zzdy zzf;

    zzed(zzdy zzdy0, Activity activity0, String s, String s1) {
        this.zzc = activity0;
        this.zzd = s;
        this.zze = s1;
        this.zzf = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzf.zzj)).setCurrentScreen(ObjectWrapper.wrap(this.zzc), this.zzd, this.zze, this.zza);
    }
}

