package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzbm extends zzaya implements zzbo {
    zzbm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzb(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbo
    public final void zzc() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

