package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzcr extends zzaya implements zzct {
    zzcr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzb() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzc() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzd(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zze() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzct
    public final void zzf() throws RemoteException {
        this.zzda(2, this.zza());
    }
}

