package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzblp extends zzaya implements zzblr {
    zzblp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzblr
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblr
    public final void zzf() throws RemoteException {
        this.zzda(2, this.zza());
    }
}

