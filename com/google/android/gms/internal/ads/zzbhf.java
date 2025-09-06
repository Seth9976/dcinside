package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbhf extends zzaya implements zzbhh {
    zzbhf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbhh
    public final void zze(zzby zzby0, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzby0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(1, parcel0);
    }
}

