package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbwb extends zzayb implements zzbwc {
    public static zzbwc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return iInterface0 instanceof zzbwc ? ((zzbwc)iInterface0) : new zzbwa(iBinder0);
    }
}

