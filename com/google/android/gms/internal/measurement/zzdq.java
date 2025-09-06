package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzdq extends zzbu implements zzdo {
    zzdq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override  // com.google.android.gms.internal.measurement.zzdo
    public final void zza(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        this.zzb(1, parcel0);
    }
}

