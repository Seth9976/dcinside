package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbtr extends zzaya implements zzbtt {
    zzbtr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbtt
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbtt
    public final void zzf(List list0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        this.zzda(1, parcel0);
    }
}

