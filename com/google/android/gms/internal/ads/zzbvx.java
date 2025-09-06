package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbvx extends zzaya implements IInterface {
    zzbvx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvw zzbvw0, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbvw0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzda(2, parcel0);
    }
}

