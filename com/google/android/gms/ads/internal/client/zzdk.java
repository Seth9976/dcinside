package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzdk extends zzayb implements zzdl {
    public zzdk() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            zze zze0 = (zze)zzayc.zza(parcel0, zze.CREATOR);
            zzayc.zzc(parcel0);
            this.zze(zze0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

