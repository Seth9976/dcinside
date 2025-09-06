package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbmg extends zzaya implements zzbmi {
    zzbmg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override  // com.google.android.gms.internal.ads.zzbmi
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmi
    public final void zzg(zzbmc zzbmc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbmc0);
        this.zzda(1, parcel0);
    }
}

