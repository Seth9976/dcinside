package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzdj extends zzaya implements zzdl {
    zzdj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(1, parcel0);
    }
}

