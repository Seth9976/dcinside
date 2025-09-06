package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbmh extends zzayb implements zzbmi {
    public static zzbmi zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return iInterface0 instanceof zzbmi ? ((zzbmi)iInterface0) : new zzbmg(iBinder0);
    }
}

