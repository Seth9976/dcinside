package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpe;

public final class zzbz extends zzaya implements IInterface {
    zzbz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper0, zzs zzs0, String s, zzbpe zzbpe0, int v, int v1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        parcel0.writeInt(v1);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

