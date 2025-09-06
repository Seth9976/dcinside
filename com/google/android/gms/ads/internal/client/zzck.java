package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzck extends zzaya implements zzcm {
    zzck(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(String s, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzda(1, parcel0);
    }
}

