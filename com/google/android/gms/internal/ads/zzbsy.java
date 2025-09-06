package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbsy extends zzaya implements zzbta {
    zzbsy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbta
    public final zzbsx zze(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        zzbsx zzbsx0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbsx0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbsx0 = iInterface0 instanceof zzbsx ? ((zzbsx)iInterface0) : new zzbsv(iBinder0);
        }
        parcel1.recycle();
        return zzbsx0;
    }
}

