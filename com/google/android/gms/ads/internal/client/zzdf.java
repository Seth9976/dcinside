package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzdf extends zzaya implements zzdh {
    zzdf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdh
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }
}

