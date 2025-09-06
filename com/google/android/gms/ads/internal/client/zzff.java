package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzff implements Runnable {
    final zzfg zza;

    zzff(zzfg zzfg0) {
        this.zza = zzfg0;
        super();
    }

    @Override
    public final void run() {
        zzfi zzfi0 = this.zza.zza;
        if(zzfi0.zza != null) {
            try {
                zzfi0.zza.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzo.zzk("Could not notify onAdFailedToLoad event.", remoteException0);
            }
        }
    }
}

