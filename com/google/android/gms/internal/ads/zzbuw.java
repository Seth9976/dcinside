package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbuw extends zzaya implements zzbuy {
    zzbuw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zze(zzbvk zzbvk0, zzbvc zzbvc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbvk0);
        zzayc.zzf(parcel0, zzbvc0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(zzbvk zzbvk0, zzbvc zzbvc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbvk0);
        zzayc.zzf(parcel0, zzbvc0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(zzbvk zzbvk0, zzbvc zzbvc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbvk0);
        zzayc.zzf(parcel0, zzbvc0);
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(String s, zzbvc zzbvc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbvc0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(zzbuu zzbuu0, zzbvd zzbvd0) throws RemoteException {
        throw null;
    }
}

