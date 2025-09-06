package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzeb extends zza {
    private final String zzc;
    private final String zzd;
    private final zzdk zze;
    private final zzdy zzf;

    zzeb(zzdy zzdy0, String s, String s1, zzdk zzdk0) {
        this.zzc = s;
        this.zzd = s1;
        this.zze = zzdk0;
        this.zzf = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzf.zzj)).getConditionalUserProperties(this.zzc, this.zzd, this.zze);
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    protected final void zzb() {
        this.zze.zza(null);
    }
}

