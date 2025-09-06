package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwc;

public final class zzbw extends zzaya implements zzby {
    zzbw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        this.zzda(11, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbi0);
        this.zzda(20, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbl0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzs0);
        this.zzda(13, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzcm0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbag0);
        this.zzda(40, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzy0);
        this.zzda(39, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzct0);
        this.zzda(45, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(34, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(22, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdr0);
        this.zzda(42, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzga0);
        this.zzda(29, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(44, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        Parcel parcel0 = this.zzcZ(46, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        Parcel parcel0 = this.zzcZ(23, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzm0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        Parcel parcel1 = this.zzcZ(4, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        zzs zzs0 = (zzs)zzayc.zza(parcel0, zzs.CREATOR);
        parcel0.recycle();
        return zzs0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() throws RemoteException {
        zzbl zzbl0;
        Parcel parcel0 = this.zzcZ(33, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbl0 = iInterface0 instanceof zzbl ? ((zzbl)iInterface0) : new zzbj(iBinder0);
        }
        parcel0.recycle();
        return zzbl0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() throws RemoteException {
        zzcm zzcm0;
        Parcel parcel0 = this.zzcZ(0x20, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzcm0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzcm0 = iInterface0 instanceof zzcm ? ((zzcm)iInterface0) : new zzck(iBinder0);
        }
        parcel0.recycle();
        return zzcm0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() throws RemoteException {
        zzdy zzdy0;
        Parcel parcel0 = this.zzcZ(41, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzdy0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdy0 = iInterface0 instanceof zzdy ? ((zzdy)iInterface0) : new zzdw(iBinder0);
        }
        parcel0.recycle();
        return zzdy0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() throws RemoteException {
        zzeb zzeb0;
        Parcel parcel0 = this.zzcZ(26, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzeb0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzeb0 = iInterface0 instanceof zzeb ? ((zzeb)iInterface0) : new zzdz(iBinder0);
        }
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() throws RemoteException {
        Parcel parcel0 = this.zzcZ(0x1F, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, zzbo0);
        this.zzda(43, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        this.zzda(5, this.zza());
    }
}

