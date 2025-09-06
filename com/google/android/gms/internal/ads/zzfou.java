package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzfou extends zzaya implements IInterface {
    zzfou(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfos zze(zzfoq zzfoq0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzfoq0);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        zzfos zzfos0 = (zzfos)zzayc.zza(parcel1, zzfos.CREATOR);
        parcel1.recycle();
        return zzfos0;
    }

    public final zzfpb zzf(zzfoz zzfoz0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzfoz0);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        zzfpb zzfpb0 = (zzfpb)zzayc.zza(parcel1, zzfpb.CREATOR);
        parcel1.recycle();
        return zzfpb0;
    }

    public final void zzg(zzfon zzfon0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzfon0);
        this.zzda(2, parcel0);
    }
}

