package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbww;

public final class zzfp implements Runnable {
    public final zzbww zza;

    public zzfp(zzbww zzbww0) {
        this.zza = zzbww0;
    }

    @Override
    public final void run() {
        zzbww zzbww0 = this.zza;
        if(zzbww0 != null) {
            try {
                zzbww0.zze(1);
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

