package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbyw extends zzayb implements zzbyx {
    public static zzbyx zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterface0 instanceof zzbyx ? ((zzbyx)iInterface0) : new zzbyv(iBinder0);
    }
}

