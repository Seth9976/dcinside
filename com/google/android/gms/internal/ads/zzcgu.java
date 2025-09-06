package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzcgu extends zzaya implements zzcgw {
    zzcgu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override  // com.google.android.gms.internal.ads.zzcgw
    public final void zze(IObjectWrapper iObjectWrapper0, zzcgt zzcgt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzcgt0);
        this.zzda(2, parcel0);
    }
}

