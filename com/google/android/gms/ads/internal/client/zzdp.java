package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzdp extends zzaya implements zzdr {
    zzdp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdr
    public final void zze(zzu zzu0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzu0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdr
    public final boolean zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

