package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzblg extends zzaya implements IInterface {
    zzblg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbla zzbla0, zzblf zzblf0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbla0);
        zzayc.zzf(parcel0, zzblf0);
        this.zzdb(2, parcel0);
    }
}

