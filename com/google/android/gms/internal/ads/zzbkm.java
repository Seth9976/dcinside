package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbkm extends zzaya implements zzbko {
    zzbkm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbko
    public final void zzb(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(1, parcel0);
    }
}

