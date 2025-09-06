package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class zzbtm extends zzayb implements zzbtn {
    public static zzbtn zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return iInterface0 instanceof zzbtn ? ((zzbtn)iInterface0) : new zzbtl(iBinder0);
    }
}

