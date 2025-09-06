package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzma implements Runnable {
    private final zzo zza;
    private final zzls zzb;

    zzma(zzls zzls0, zzo zzo0) {
        this.zza = zzo0;
        this.zzb = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzb.zzb;
        if(zzgb0 == null) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgb0.zze(this.zza);
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to reset data on the service: remote exception", remoteException0);
        }
        this.zzb.zzar();
    }
}

