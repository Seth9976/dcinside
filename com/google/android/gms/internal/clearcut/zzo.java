package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;

public final class zzo extends zza implements zzn {
    zzo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override  // com.google.android.gms.internal.clearcut.zzn
    public final void zza(zzl zzl0, zze zze0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, zzl0);
        zzc.zza(parcel0, zze0);
        this.transactOneway(1, parcel0);
    }
}

