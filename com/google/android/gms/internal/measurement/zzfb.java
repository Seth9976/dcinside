package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzfb extends zza {
    private final Intent zzc;
    private final zzdy zzd;

    zzfb(zzdy zzdy0, Intent intent0) {
        this.zzc = intent0;
        this.zzd = zzdy0;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.zzdy$zza
    final void zza() throws RemoteException {
        ((zzdj)Preconditions.checkNotNull(this.zzd.zzj)).setSgtmDebugInfo(this.zzc);
    }
}

