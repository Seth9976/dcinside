package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzdn extends zzbx implements zzdo {
    public zzdn() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            Bundle bundle0 = (Bundle)zzbw.zza(parcel0, Bundle.CREATOR);
            zzbw.zzb(parcel0);
            this.zza(bundle0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

