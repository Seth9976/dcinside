package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzca extends zzbu implements zzbz {
    zzca(IBinder iBinder0) {
        super(iBinder0, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbz
    public final Bundle zza(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzbw.zza(parcel0, bundle0);
        Parcel parcel1 = this.zza(1, parcel0);
        Bundle bundle1 = (Bundle)zzbw.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }
}

