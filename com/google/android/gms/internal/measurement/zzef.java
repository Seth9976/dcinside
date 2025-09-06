package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzef extends zza {
    private final Bundle zzc;
    private final zzdy zzd;

    zzef(zzdy zzdy0, Bundle bundle0) {
        this.zzc = bundle0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).setConsent(this.zzc, this.zza);
    }
}

