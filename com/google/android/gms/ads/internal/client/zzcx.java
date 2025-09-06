package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.List;

public final class zzcx extends zzaya implements zzcz {
    zzcx(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(13, this.zza());
        List list0 = parcel0.createTypedArrayList(zzbln.CREATOR);
        parcel0.recycle();
        return list0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(10, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws RemoteException {
        this.zzda(15, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(17, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String s, IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(null);
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdl0);
        this.zzda(16, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper0, String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpe0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbpe0);
        this.zzda(11, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeFloat(f);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String s) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzblu0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzblu0);
        this.zzda(12, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(18, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfv0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzfv0);
        this.zzda(14, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        Parcel parcel0 = this.zzcZ(8, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

