package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public abstract class zzds extends zzbx implements zzdp {
    public zzds() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override  // com.google.android.gms.internal.measurement.zzbx
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                Parcelable parcelable0 = zzbw.zza(parcel0, Bundle.CREATOR);
                long v2 = parcel0.readLong();
                zzbw.zzb(parcel0);
                this.zza(s, s1, ((Bundle)parcelable0), v2);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                int v3 = this.zza();
                parcel1.writeNoException();
                parcel1.writeInt(v3);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

