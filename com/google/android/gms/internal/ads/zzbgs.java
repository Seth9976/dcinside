package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbgs extends zzaya implements zzbgu {
    zzbgs(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgu
    public final void zze(zzbgl zzbgl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbgl0);
        this.zzda(1, parcel0);
    }
}

