package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbre extends zzaya implements zzbrg {
    zzbre(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zzf(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrg
    public final void zzg(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }
}

