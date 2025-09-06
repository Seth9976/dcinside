package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

public final class zzbvd extends zzaya implements IInterface {
    zzbvd(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(zzbb zzbb0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbb0);
        this.zzda(2, parcel0);
    }

    public final void zzf(String s, zzbuu zzbuu0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzd(parcel0, zzbuu0);
        this.zzda(1, parcel0);
    }
}

