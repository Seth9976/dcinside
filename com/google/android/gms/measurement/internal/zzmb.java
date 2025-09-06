package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmb implements Runnable {
    private final zzo zza;
    private final zzls zzb;

    zzmb(zzls zzls0, zzo zzo0) {
        this.zza = zzo0;
        this.zzb = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzb.zzb;
        if(zzgb0 == null) {
            this.zzb.zzj().zzg().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgb0.zzd(this.zza);
            this.zzb.zzh().zzac();
            this.zzb.zza(zzgb0, null, this.zza);
            this.zzb.zzar();
        }
        catch(RemoteException remoteException0) {
            this.zzb.zzj().zzg().zza("Failed to send app launch to the service", remoteException0);
        }
    }
}

