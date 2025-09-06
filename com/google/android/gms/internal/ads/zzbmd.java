package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbmd extends zzaya implements zzbmf {
    zzbmd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbmf
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmf
    public final void zzf() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

