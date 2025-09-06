package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

final class zzeu extends zza {
    private final int zzc;
    private final String zzd;
    private final Object zze;
    private final Object zzf;
    private final Object zzg;
    private final zzdy zzh;

    zzeu(zzdy zzdy0, boolean z, int v, String s, Object object0, Object object1, Object object2) {
        this.zzc = 5;
        this.zzd = s;
        this.zze = object0;
        this.zzf = null;
        this.zzg = null;
        this.zzh = zzdy0;
        super(false);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        Object object0 = Preconditions.checkNotNull(this.zzh.zzj);
        IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.zze);
        IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(null);
        IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(null);
        ((zzdj)object0).logHealthData(this.zzc, this.zzd, iObjectWrapper0, iObjectWrapper1, iObjectWrapper2);
    }
}

