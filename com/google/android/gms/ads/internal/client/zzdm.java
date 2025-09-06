package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzdm extends zzaya implements zzdo {
    zzdm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdo
    public final void zze() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

