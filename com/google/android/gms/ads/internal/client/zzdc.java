package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;

public abstract class zzdc extends zzayb implements zzdd {
    public zzdc() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
    }

    public static zzdd zzb(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return iInterface0 instanceof zzdd ? ((zzdd)iInterface0) : new zzdb(iBinder0);
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            this.zze();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

