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

public final class zzbpp extends zzaya implements IInterface {
    zzbpp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(15, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    public final zzeb zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(17, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    public final zzbfp zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(19, this.zza());
        zzbfp zzbfp0 = zzbfo.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfp0;
    }

    public final zzbfw zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        zzbfw zzbfw0 = zzbfv.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfw0;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        Parcel parcel0 = this.zzcZ(18, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel parcel0 = this.zzcZ(20, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    public final IObjectWrapper zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(21, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
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

    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.zzcZ(8, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    public final List zzr() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    public final void zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(11, parcel0);
    }

    public final void zzt() throws RemoteException {
        this.zzda(10, this.zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(12, parcel0);
    }

    public final void zzv(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        zzayc.zzf(parcel0, iObjectWrapper2);
        this.zzda(22, parcel0);
    }

    public final void zzw(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(16, parcel0);
    }

    public final boolean zzx() throws RemoteException {
        Parcel parcel0 = this.zzcZ(14, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    public final boolean zzy() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

