package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzby extends zzbx implements zzbz {
    public static zzbz zza(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterface0 instanceof zzbz ? ((zzbz)iInterface0) : new zzca(iBinder0);
    }
}

