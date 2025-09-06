package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbqm extends zzaya implements zzbqo {
    zzbqm(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString("Adapter returned null.");
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbqo
    public final void zzg() throws RemoteException {
        this.zzda(2, this.zza());
    }
}

