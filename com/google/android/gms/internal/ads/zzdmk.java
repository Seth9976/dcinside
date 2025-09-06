package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

public final class zzdmk implements Runnable {
    public final zzdmm zza;

    public zzdmk(zzdmm zzdmm0) {
        this.zza = zzdmm0;
    }

    @Override
    public final void run() {
        try {
            this.zza.zzd();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

