package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbgo extends zzaya implements zzbgq {
    zzbgo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzeb zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzf() throws RemoteException {
        zzbft zzbft0;
        Parcel parcel0 = this.zzcZ(16, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbft0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbft0 = iInterface0 instanceof zzbft ? ((zzbft)iInterface0) : new zzbfr(iBinder0);
        }
        parcel0.recycle();
        return zzbft0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzg(String s) throws RemoteException {
        zzbfw zzbfw0;
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbfw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfw0 = iInterface0 instanceof zzbfw ? ((zzbfw)iInterface0) : new zzbfu(iBinder0);
        }
        parcel1.recycle();
        return zzbfw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final String zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final String zzj(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        String s1 = parcel1.readString();
        parcel1.recycle();
        return s1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final List zzk() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = parcel0.createStringArrayList();
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() throws RemoteException {
        this.zzda(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() throws RemoteException {
        this.zzda(15, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(17, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(10, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

