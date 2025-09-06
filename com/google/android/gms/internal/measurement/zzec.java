package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzec extends zza {
    private final String zzc;
    private final String zzd;
    private final Bundle zze;
    private final zzdy zzf;

    zzec(zzdy zzdy0, String s, String s1, Bundle bundle0) {
        this.zzc = s;
        this.zzd = s1;
        this.zze = bundle0;
        this.zzf = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzf.zzj)).clearConditionalUserProperty(this.zzc, this.zzd, this.zze);
    }
}

