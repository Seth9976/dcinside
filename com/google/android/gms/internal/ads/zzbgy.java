package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbgy extends zzaya implements zzbha {
    zzbgy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgq0, String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbgq0);
        parcel0.writeString(s);
        this.zzda(1, parcel0);
    }
}

