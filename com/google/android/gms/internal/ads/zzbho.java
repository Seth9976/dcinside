package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbho extends zzaya implements zzbhq {
    zzbho(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbhq
    public final void zze() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbhq
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(1, parcel0);
    }
}

