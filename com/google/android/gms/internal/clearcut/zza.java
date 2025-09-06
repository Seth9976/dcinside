package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zza implements IInterface {
    private final IBinder zza;
    private final String zzb;

    protected zza(IBinder iBinder0, String s) {
        this.zza = iBinder0;
        this.zzb = s;
    }

    @Override  // android.os.IInterface
    public IBinder asBinder() {
        return this.zza;
    }

    protected final Parcel obtainAndWriteInterfaceToken() {
        Parcel parcel0 = Parcel.obtain();
        parcel0.writeInterfaceToken(this.zzb);
        return parcel0;
    }

    protected final void transactOneway(int v, Parcel parcel0) throws RemoteException {
        try {
            this.zza.transact(1, parcel0, null, 1);
        }
        finally {
            parcel0.recycle();
        }
    }
}

