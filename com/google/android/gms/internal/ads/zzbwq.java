package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbwq extends zzaya implements zzbws {
    zzbwq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zze() throws RemoteException {
        this.zzda(7, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzg() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzi(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbws
    public final void zzk(zzbwm zzbwm0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbwm0);
        this.zzda(3, parcel0);
    }
}

