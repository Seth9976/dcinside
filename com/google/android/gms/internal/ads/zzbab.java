package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbab extends zzaya implements zzbad {
    zzbab(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final zzby zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final zzdy zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        zzdy zzdy0 = zzdx.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzh(zzdr zzdr0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdr0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbad
    public final void zzi(IObjectWrapper iObjectWrapper0, zzbak zzbak0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbak0);
        this.zzda(4, parcel0);
    }
}

