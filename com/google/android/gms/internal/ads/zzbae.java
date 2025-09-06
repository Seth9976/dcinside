package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbae extends zzaya implements zzbag {
    zzbae(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzc(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbag
    public final void zzd(zzbad zzbad0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbad0);
        this.zzda(1, parcel0);
    }
}

