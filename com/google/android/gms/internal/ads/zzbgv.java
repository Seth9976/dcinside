package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbgv extends zzaya implements zzbgx {
    zzbgv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgx
    public final void zze(zzbgn zzbgn0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbgn0);
        this.zzda(1, parcel0);
    }
}

