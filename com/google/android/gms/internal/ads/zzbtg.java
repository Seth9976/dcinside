package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbtg extends zzayb implements zzbth {
    public static zzbth zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterface0 instanceof zzbth ? ((zzbth)iInterface0) : new zzbtf(iBinder0);
    }
}

