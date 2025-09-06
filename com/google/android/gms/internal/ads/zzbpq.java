package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbpq extends zzaya implements IInterface {
    zzbpq(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzeb zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(16, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    public final zzbfp zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(19, this.zza());
        zzbfp zzbfp0 = zzbfo.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfp0;
    }

    public final zzbfw zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        zzbfw zzbfw0 = zzbfv.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfw0;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(15, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel parcel0 = this.zzcZ(20, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel parcel0 = this.zzcZ(21, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final String zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzm() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzn() throws RemoteException {
        Parcel parcel0 = this.zzcZ(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzo() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final List zzp() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzq(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(9, parcel0);
    }

    public final void zzr() throws RemoteException {
        this.zzda(8, this.zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(10, parcel0);
    }

    public final void zzt(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        zzayc.zzf(parcel0, iObjectWrapper2);
        this.zzda(22, parcel0);
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(14, parcel0);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcel0 = this.zzcZ(11, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

