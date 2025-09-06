package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public final class zzbpf extends zzaya implements zzbph {
    zzbpf(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzA(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(28, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzB(zzm zzm0, String s, String s1) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzC(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(0x20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzD(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzE() throws RemoteException {
        this.zzda(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzF() throws RemoteException {
        this.zzda(9, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(25, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzH(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(39, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzI() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzJ(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(37, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzK(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(30, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzL() throws RemoteException {
        this.zzda(12, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final boolean zzM() throws RemoteException {
        Parcel parcel0 = this.zzcZ(22, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final boolean zzN() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbpp zzO() throws RemoteException {
        zzbpp zzbpp0;
        Parcel parcel0 = this.zzcZ(15, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbpp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpp0 = iInterface0 instanceof zzbpp ? ((zzbpp)iInterface0) : new zzbpp(iBinder0);
        }
        parcel0.recycle();
        return zzbpp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbpq zzP() throws RemoteException {
        zzbpq zzbpq0;
        Parcel parcel0 = this.zzcZ(16, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbpq0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpq0 = iInterface0 instanceof zzbpq ? ((zzbpq)iInterface0) : new zzbpq(iBinder0);
        }
        parcel0.recycle();
        return zzbpq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzeb zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(26, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbgq zzi() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbpn zzj() throws RemoteException {
        zzbpn zzbpn0;
        Parcel parcel0 = this.zzcZ(36, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbpn0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpn0 = iInterface0 instanceof zzbpn ? ((zzbpn)iInterface0) : new zzbpl(iBinder0);
        }
        parcel0.recycle();
        return zzbpn0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbpt zzk() throws RemoteException {
        zzbpt zzbpt0;
        Parcel parcel0 = this.zzcZ(27, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbpt0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpt0 = iInterface0 instanceof zzbpt ? ((zzbpt)iInterface0) : new zzbpr(iBinder0);
        }
        parcel0.recycle();
        return zzbpt0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbrs zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(33, this.zza());
        zzbrs zzbrs0 = (zzbrs)zzayc.zza(parcel0, zzbrs.CREATOR);
        parcel0.recycle();
        return zzbrs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final zzbrs zzm() throws RemoteException {
        Parcel parcel0 = this.zzcZ(34, this.zza());
        zzbrs zzbrs0 = (zzbrs)zzayc.zza(parcel0, zzbrs.CREATOR);
        parcel0.recycle();
        return zzbrs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final IObjectWrapper zzn() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzo() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzp(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbwh zzbwh0, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(null);
        zzayc.zzf(parcel0, zzbwh0);
        parcel0.writeString(s1);
        this.zzda(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzq(IObjectWrapper iObjectWrapper0, zzblr zzblr0, List list0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzblr0);
        parcel0.writeTypedList(list0);
        this.zzda(0x1F, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzr(IObjectWrapper iObjectWrapper0, zzbwh zzbwh0, List list0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbwh0);
        parcel0.writeStringList(list0);
        this.zzda(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzs(zzm zzm0, String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        this.zzda(11, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzt(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(38, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzu(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzv(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzw(IObjectWrapper iObjectWrapper0, zzs zzs0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzs0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(35, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzx(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, zzbpk zzbpk0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzy(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, String s1, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbph
    public final void zzz(IObjectWrapper iObjectWrapper0, zzm zzm0, String s, String s1, zzbpk zzbpk0, zzbfl zzbfl0, List list0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzd(parcel0, zzm0);
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzf(parcel0, zzbpk0);
        zzayc.zzd(parcel0, zzbfl0);
        parcel0.writeStringList(list0);
        this.zzda(14, parcel0);
    }
}

