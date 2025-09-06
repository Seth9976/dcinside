package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbpr extends zzaya implements zzbpt {
    zzbpr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() throws RemoteException {
        Parcel parcel0 = this.zzcZ(18, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() throws RemoteException {
        Parcel parcel0 = this.zzcZ(17, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final double zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(8, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(23, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(25, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(24, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final Bundle zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(16, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final zzeb zzj() throws RemoteException {
        Parcel parcel0 = this.zzcZ(11, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final zzbfp zzk() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        zzbfp zzbfp0 = zzbfo.zzj(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final zzbfw zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        zzbfw zzbfw0 = zzbfv.zzg(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzbfw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcel0 = this.zzcZ(14, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzo() throws RemoteException {
        Parcel parcel0 = this.zzcZ(15, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzr() throws RemoteException {
        Parcel parcel0 = this.zzcZ(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzs() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzt() throws RemoteException {
        Parcel parcel0 = this.zzcZ(10, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final String zzu() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final List zzv() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() throws RemoteException {
        this.zzda(19, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, iObjectWrapper1);
        zzayc.zzf(parcel0, iObjectWrapper2);
        this.zzda(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(22, parcel0);
    }
}

