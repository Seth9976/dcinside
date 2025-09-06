package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzea extends zza {
    private final String zzc;
    private final String zzd;
    private final Object zze;
    private final boolean zzf;
    private final zzdy zzg;

    zzea(zzdy zzdy0, String s, String s1, Object object0, boolean z) {
        this.zzc = s;
        this.zzd = s1;
        this.zze = object0;
        this.zzf = z;
        this.zzg = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        Object object0 = Preconditions.checkNotNull(this.zzg.zzj);
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zze);
        ((zzdj)object0).setUserProperty(this.zzc, this.zzd, iObjectWrapper0, this.zzf, this.zza);
    }
}

