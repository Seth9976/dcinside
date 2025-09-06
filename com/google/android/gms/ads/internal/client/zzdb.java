package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzdb extends zzaya implements zzdd {
    zzdb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

