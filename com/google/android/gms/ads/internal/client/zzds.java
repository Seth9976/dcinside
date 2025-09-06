package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzds extends zzaya implements zzdu {
    zzds(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(String s, IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        this.zzda(1, parcel0);
    }
}

