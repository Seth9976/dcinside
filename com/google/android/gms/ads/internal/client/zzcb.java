package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayb;

public abstract class zzcb extends zzayb implements zzcc {
    public static zzcc zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterface0 instanceof zzcc ? ((zzcc)iInterface0) : new zzca(iBinder0);
    }
}

