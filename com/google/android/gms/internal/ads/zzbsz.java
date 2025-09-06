package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbsz extends zzayb implements zzbta {
    public static zzbta zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterface0 instanceof zzbta ? ((zzbta)iInterface0) : new zzbsy(iBinder0);
    }
}

