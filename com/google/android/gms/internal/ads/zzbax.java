package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbax extends zzaya implements IInterface {
    zzbax(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbav zzbav0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbav0);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        long v = parcel1.readLong();
        parcel1.recycle();
        return v;
    }

    public final zzbas zzf(zzbav zzbav0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbav0);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        zzbas zzbas0 = (zzbas)zzayc.zza(parcel1, zzbas.CREATOR);
        parcel1.recycle();
        return zzbas0;
    }

    public final zzbas zzg(zzbav zzbav0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbav0);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        zzbas zzbas0 = (zzbas)zzayc.zza(parcel1, zzbas.CREATOR);
        parcel1.recycle();
        return zzbas0;
    }
}

