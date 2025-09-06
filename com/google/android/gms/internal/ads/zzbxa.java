package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzq;

public final class zzbxa implements zzq {
    @Override  // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object object0) {
        if(((IBinder)object0) == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        return iInterface0 instanceof zzbwt ? ((zzbwt)iInterface0) : new zzbwt(((IBinder)object0));
    }
}

