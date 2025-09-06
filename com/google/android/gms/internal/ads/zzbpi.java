package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

public final class zzbpi extends zzaya implements zzbpk {
    zzbpi(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int v, String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeString(s);
        this.zzda(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int v) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(24, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws RemoteException {
        this.zzda(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String s, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        this.zzda(9, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgq0, String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbgq0);
        parcel0.writeString(s);
        this.zzda(10, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwi0) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwm0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbwm0);
        this.zzda(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        this.zzda(18, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws RemoteException {
        this.zzda(11, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws RemoteException {
        this.zzda(15, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
        this.zzda(20, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws RemoteException {
        this.zzda(13, this.zza());
    }
}

