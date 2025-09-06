package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzcd extends zzaya implements zzcf {
    zzcd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzft0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzft0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzft0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzft0);
        this.zzda(2, parcel0);
    }
}

