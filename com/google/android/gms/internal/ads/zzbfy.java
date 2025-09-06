package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfy extends zzaya implements zzbga {
    zzbfy(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final IObjectWrapper zzb(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel1.readStrongBinder());
        parcel1.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzc() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdt(String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdu(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdv(zzbft zzbft0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbft0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdw(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zzdx(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbga
    public final void zze(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeInt(v);
        this.zzda(5, parcel0);
    }
}

