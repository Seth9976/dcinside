package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbgc extends zzayb implements zzbgd {
    public static zzbgd zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterface0 instanceof zzbgd ? ((zzbgd)iInterface0) : new zzbgb(iBinder0);
    }
}

