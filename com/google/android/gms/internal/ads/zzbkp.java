package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbkp extends zzaya implements zzbkr {
    zzbkp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzbkr
    public final void zze() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbkr
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(1, parcel0);
    }
}

