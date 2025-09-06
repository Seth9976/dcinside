package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbtp extends zzayb implements zzbtq {
    public static zzbtq zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return iInterface0 instanceof zzbtq ? ((zzbtq)iInterface0) : new zzbto(iBinder0);
    }
}

