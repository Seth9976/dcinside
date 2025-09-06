package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbys extends zzaya implements zzbyu {
    zzbys(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, String s, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, iObjectWrapper2);
        Parcel parcel1 = this.zzcZ(11, parcel0);
        IObjectWrapper iObjectWrapper3 = Stub.asInterface(parcel1.readStrongBinder());
        parcel1.recycle();
        return iObjectWrapper3;
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(IObjectWrapper iObjectWrapper0, zzbyy zzbyy0, zzbyr zzbyr0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzbyy0);
        zzayc.zzf(parcel0, zzbyr0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(zzbuc zzbuc0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbuc0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbtt0);
        this.zzda(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbtt0);
        this.zzda(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbtt0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(List list0, IObjectWrapper iObjectWrapper0, zzbtt zzbtt0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbtt0);
        this.zzda(5, parcel0);
    }
}

