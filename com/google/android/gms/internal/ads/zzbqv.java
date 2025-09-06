package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbqv extends zzaya implements zzbqx {
    zzbqv(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString("Adapter returned null.");
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqx
    public final void zzg(zzbpt zzbpt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbpt0);
        this.zzda(1, parcel0);
    }
}

