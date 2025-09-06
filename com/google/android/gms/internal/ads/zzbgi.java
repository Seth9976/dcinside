package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbgi extends zzayb implements zzbgj {
    public static zzbgj zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterface0 instanceof zzbgj ? ((zzbgj)iInterface0) : new zzbgh(iBinder0);
    }
}

