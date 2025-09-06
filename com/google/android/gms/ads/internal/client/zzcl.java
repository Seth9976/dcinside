package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzcl extends zzayb implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcm zzd(IBinder iBinder0) {
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new zzck(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            String s = parcel0.readString();
            String s1 = parcel0.readString();
            zzayc.zzc(parcel0);
            this.zzc(s, s1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

