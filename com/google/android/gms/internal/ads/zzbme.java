package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

public abstract class zzbme extends zzayb implements zzbmf {
    public zzbme() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v != 1) {
            if(v != 2) {
                return false;
            }
            parcel0.readInt();
            zzayc.zzc(parcel0);
        }
        parcel1.writeNoException();
        return true;
    }
}

