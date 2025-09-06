package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbhl extends zzaya implements zzbhn {
    zzbhl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbhn
    public final boolean zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

