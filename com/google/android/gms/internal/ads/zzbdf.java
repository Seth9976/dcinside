package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbdf extends zzayb implements zzbdg {
    public static zzbdg zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return iInterface0 instanceof zzbdg ? ((zzbdg)iInterface0) : new zzbde(iBinder0);
    }
}

