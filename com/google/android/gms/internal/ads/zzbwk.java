package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbwk extends zzaya implements zzbwm {
    zzbwk(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override  // com.google.android.gms.internal.ads.zzbwm
    public final int zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwm
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

