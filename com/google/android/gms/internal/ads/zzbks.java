package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbks extends zzaya implements zzbku {
    zzbks(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbku
    public final zzbkr zze(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v, zzbko zzbko0) throws RemoteException {
        zzbkr zzbkr0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        zzayc.zzf(parcel0, zzbko0);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbkr0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkr0 = iInterface0 instanceof zzbkr ? ((zzbkr)iInterface0) : new zzbkp(iBinder0);
        }
        parcel1.recycle();
        return zzbkr0;
    }
}

