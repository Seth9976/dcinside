package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbsv extends zzaya implements zzbsx {
    zzbsv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zze(Intent intent0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, intent0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String[] arr_s, int[] arr_v, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeStringArray(arr_s);
        parcel0.writeIntArray(arr_v);
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(IObjectWrapper iObjectWrapper0, zza zza0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zza0);
        this.zzda(6, parcel0);
    }
}

