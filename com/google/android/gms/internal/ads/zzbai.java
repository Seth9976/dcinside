package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbai extends zzaya implements zzbak {
    zzbai(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzb() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzc() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzd(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zze() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbak
    public final void zzf() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

