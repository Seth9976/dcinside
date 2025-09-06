package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbgb extends zzaya implements zzbgd {
    zzbgb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgd
    public final IBinder zze(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        zzayc.zzf(parcel0, iObjectWrapper2);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder0;
    }
}

