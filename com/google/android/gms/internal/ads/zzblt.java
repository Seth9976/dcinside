package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

public abstract class zzblt extends zzayb implements zzblu {
    public zzblt() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzblu zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterface0 instanceof zzblu ? ((zzblu)iInterface0) : new zzbls(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            ArrayList arrayList0 = parcel0.createTypedArrayList(zzbln.CREATOR);
            zzayc.zzc(parcel0);
            this.zzb(arrayList0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

