package com.google.android.gms.ads.internal.util;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzbp extends zzaya implements zzbr {
    zzbp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzg(IObjectWrapper iObjectWrapper0, zza zza0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zza0);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

