package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzq;

public final class zzj implements zzq {
    @Override  // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object object0) {
        if(((IBinder)object0) == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterface0 instanceof zzbz ? ((zzbz)iInterface0) : new zzbz(((IBinder)object0));
    }
}

