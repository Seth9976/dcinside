package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmh implements Runnable {
    private final zzo zza;
    private final zzls zzb;

    zzmh(zzls zzls0, zzo zzo0) {
        this.zza = zzo0;
        this.zzb = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzb.zzb;
        if(zzgb0 == null) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgb0.zzh(this.zza);
            this.zzb.zzar();
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to send measurementEnabled to the service", remoteException0);
        }
    }
}

