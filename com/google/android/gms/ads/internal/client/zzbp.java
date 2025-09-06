package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzbp extends zzaya implements zzbr {
    zzbp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzm0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzm0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeInt(v);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

