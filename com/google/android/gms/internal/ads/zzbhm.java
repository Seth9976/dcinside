package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class zzbhm extends zzayb implements zzbhn {
    public static zzbhn zzb(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterface0 instanceof zzbhn ? ((zzbhn)iInterface0) : new zzbhl(iBinder0);
    }
}

