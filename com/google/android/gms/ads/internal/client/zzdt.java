package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

public abstract class zzdt extends zzayb implements zzdu {
    public zzdt() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override  // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            String s = parcel0.readString();
            IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
            IObjectWrapper iObjectWrapper1 = Stub.asInterface(parcel0.readStrongBinder());
            zzayc.zzc(parcel0);
            this.zze(s, iObjectWrapper0, iObjectWrapper1);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

