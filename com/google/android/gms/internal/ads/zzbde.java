package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbde extends zzaya implements zzbdg {
    zzbde(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbdg
    public final void zze(zzbdd zzbdd0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbdd0);
        this.zzda(1, parcel0);
    }
}

