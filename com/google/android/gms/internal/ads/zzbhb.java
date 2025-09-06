package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbhb extends zzaya implements zzbhd {
    zzbhb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbhd
    public final void zze(zzbgq zzbgq0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbgq0);
        this.zzda(1, parcel0);
    }
}

