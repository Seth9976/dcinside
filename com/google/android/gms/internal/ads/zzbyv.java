package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbyv extends zzaya implements zzbyx {
    zzbyv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyx
    public final zzbyu zze(IObjectWrapper iObjectWrapper0, zzbpe zzbpe0, int v) throws RemoteException {
        zzbyu zzbyu0;
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbpe0);
        parcel0.writeInt(244410000);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbyu0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbyu0 = iInterface0 instanceof zzbyu ? ((zzbyu)iInterface0) : new zzbys(iBinder0);
        }
        parcel1.recycle();
        return zzbyu0;
    }
}

