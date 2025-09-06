package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbwu extends zzaya implements zzbww {
    zzbwu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

