package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbff extends zzaya implements IInterface {
    zzbff(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbuo zzbuo0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbuo0);
        this.zzda(1, parcel0);
    }
}

