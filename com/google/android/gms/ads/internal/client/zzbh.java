package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;

public abstract class zzbh extends zzayb implements zzbi {
    public zzbh() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            this.zzb();
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

