package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbhr extends zzaya implements zzbht {
    zzbhr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzA() throws RemoteException {
        this.zzda(28, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzB(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        this.zzda(33, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzC(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        this.zzda(17, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzD() throws RemoteException {
        this.zzda(27, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzE(zzdd zzdd0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdd0);
        this.zzda(26, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzF(zzdr zzdr0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdr0);
        this.zzda(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzG(zzbhq zzbhq0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbhq0);
        this.zzda(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() throws RemoteException {
        Parcel parcel0 = this.zzcZ(30, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws RemoteException {
        Parcel parcel0 = this.zzcZ(24, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        Parcel parcel1 = this.zzcZ(16, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(8, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final Bundle zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(20, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzdy zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(0x1F, this.zza());
        zzdy zzdy0 = zzdx.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzeb zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(11, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbfp zzi() throws RemoteException {
        zzbfp zzbfp0;
        Parcel parcel0 = this.zzcZ(14, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbfp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfp0 = iInterface0 instanceof zzbfp ? ((zzbfp)iInterface0) : new zzbfn(iBinder0);
        }
        parcel0.recycle();
        return zzbfp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbft zzj() throws RemoteException {
        zzbft zzbft0;
        Parcel parcel0 = this.zzcZ(29, this.zza());
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

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final zzbfw zzk() throws RemoteException {
        zzbfw zzbfw0;
        Parcel parcel0 = this.zzcZ(5, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbfw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfw0 = iInterface0 instanceof zzbfw ? ((zzbfw)iInterface0) : new zzbfu(iBinder0);
        }
        parcel0.recycle();
        return zzbfw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(19, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzm() throws RemoteException {
        Parcel parcel0 = this.zzcZ(18, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzn() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzo() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzp() throws RemoteException {
        Parcel parcel0 = this.zzcZ(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzq() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzs() throws RemoteException {
        Parcel parcel0 = this.zzcZ(10, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final String zzt() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final List zzu() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final List zzv() throws RemoteException {
        Parcel parcel0 = this.zzcZ(23, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws RemoteException {
        this.zzda(22, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws RemoteException {
        this.zzda(13, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzy(zzdh zzdh0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdh0);
        this.zzda(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbht
    public final void zzz(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        this.zzda(15, parcel0);
    }
}

