package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;

public final class zzcu extends zzaya implements zzcw {
    zzcu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public final zzbpe getAdapterCreator() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        zzbpe zzbpe0 = zzbpd.zzf(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbpe0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcw
    public final zzfb getLiteSdkVersion() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        zzfb zzfb0 = (zzfb)zzayc.zza(parcel0, zzfb.CREATOR);
        parcel0.recycle();
        return zzfb0;
    }
}

