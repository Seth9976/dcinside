package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzfj implements Runnable {
    final zzfk zza;

    zzfj(zzfk zzfk0) {
        this.zza = zzfk0;
        super();
    }

    @Override
    public final void run() {
        zzfk zzfk0 = this.zza;
        if(zzfk0.zza != null) {
            try {
                zzfk0.zza.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Could not notify onAdFailedToLoad event.", remoteException0);
            }
        }
    }
}

