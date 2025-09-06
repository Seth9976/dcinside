package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbyp extends zzaya implements zzbyr {
    zzbyp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzb(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyr
    public final void zzc(String s, String s1, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, bundle0);
        this.zzda(3, parcel0);
    }
}

