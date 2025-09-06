package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbwt extends zzaya implements IInterface {
    zzbwt(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper0, String s, zzbpe zzbpe0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

