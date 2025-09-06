package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbpl extends zzaya implements zzbpn {
    zzbpl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpn
    public final IObjectWrapper zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpn
    public final boolean zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

