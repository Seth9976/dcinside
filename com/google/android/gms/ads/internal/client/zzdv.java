package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpe;

public final class zzdv extends zzaya implements IInterface {
    zzdv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdu zze(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        zzdu zzdu0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzdu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdu0 = iInterface0 instanceof zzdu ? ((zzdu)iInterface0) : new zzds(iBinder0);
        }
        parcel1.recycle();
        return zzdu0;
    }
}

