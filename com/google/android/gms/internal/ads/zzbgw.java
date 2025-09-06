package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbgw extends zzayb implements zzbgx {
    public static zzbgx zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return iInterface0 instanceof zzbgx ? ((zzbgx)iInterface0) : new zzbgv(iBinder0);
    }
}

