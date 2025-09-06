package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

final class zzmf implements Runnable {
    private final zzo zza;
    private final Bundle zzb;
    private final zzls zzc;

    zzmf(zzls zzls0, zzo zzo0, Bundle bundle0) {
        this.zza = zzo0;
        this.zzb = bundle0;
        this.zzc = zzls0;
        super();
    }

    @Override
    public final void run() {
        zzgb zzgb0 = this.zzc.zzb;
        if(zzgb0 == null) {
            this.zzc.zzj().zzg().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzgb0.zza(this.zzb, this.zza);
        }
        catch(RemoteException remoteException0) {
            this.zzc.zzj().zzg().zza("Failed to send default event parameters to service", remoteException0);
        }
    }
}

