package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbls extends zzaya implements zzblu {
    zzbls(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzblu
    public final void zzb(List list0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        this.zzda(1, parcel0);
    }
}

