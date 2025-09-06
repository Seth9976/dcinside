package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.ads.internal.util.client.zzq;

public final class zzae implements zzq {
    @Override  // com.google.android.gms.ads.internal.util.client.zzq
    public final Object zza(Object object0) {
        if(((IBinder)object0) == null) {
            return null;
        }
        IInterface iInterface0 = ((IBinder)object0).queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return iInterface0 instanceof zzdv ? ((zzdv)iInterface0) : new zzdv(((IBinder)object0));
    }
}

