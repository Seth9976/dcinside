package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzcgv extends zzayb implements zzcgw {
    public static zzcgw zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterface0 instanceof zzcgw ? ((zzcgw)iInterface0) : new zzcgu(iBinder0);
    }
}

