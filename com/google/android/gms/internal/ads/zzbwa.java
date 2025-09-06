package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbwa extends zzaya implements zzbwc {
    zzbwa(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zze(zzbvw zzbvw0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbvw0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzf() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzh() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzi() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzj() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzk() throws RemoteException {
        this.zzda(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbwc
    public final void zzl() throws RemoteException {
        this.zzda(3, this.zza());
    }
}

