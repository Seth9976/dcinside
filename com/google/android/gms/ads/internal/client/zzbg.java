package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzbg extends zzaya implements zzbi {
    zzbg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbi
    public final void zzb() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

