package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbhi extends zzaya implements zzbhk {
    zzbhi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbhk
    public final void zze(zzbht zzbht0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbht0);
        this.zzda(1, parcel0);
    }
}

