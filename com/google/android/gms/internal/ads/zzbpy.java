package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;

final class zzbpy implements InitializationCompleteCallback {
    final zzblr zza;

    zzbpy(zzbqf zzbqf0, zzblr zzblr0) {
        this.zza = zzblr0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String s) {
        try {
            this.zza.zze(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }
}

