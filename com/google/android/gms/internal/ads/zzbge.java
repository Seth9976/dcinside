package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbge extends zzaya implements zzbgg {
    zzbge(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzb(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzc(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgg
    public final void zzd() throws RemoteException {
        this.zzda(2, this.zza());
    }
}

