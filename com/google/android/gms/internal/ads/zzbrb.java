package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbrb extends zzaya implements zzbrd {
    zzbrb(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final zzeb zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        zzbrs zzbrs0 = (zzbrs)zzayc.zza(parcel0, zzbrs.CREATOR);
        parcel0.recycle();
        return zzbrs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        zzbrs zzbrs0 = (zzbrs)zzayc.zza(parcel0, zzbrs.CREATOR);
        parcel0.recycle();
        return zzbrs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(IObjectWrapper iObjectWrapper0, String s, Bundle bundle0, Bundle bundle1, zzs zzs0, zzbrg zzbrg0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        zzayc.zzd(parcel0, bundle0);
        zzayc.zzd(parcel0, bundle1);
        zzayc.zzd(parcel0, zzs0);
        zzayc.zzf(parcel0, zzbrg0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqo zzbqo0, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqo0);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(23, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqr zzbqr0, zzbpk zzbpk0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqr0);
        zzayc.zzf(parcel0, zzbpk0);
        zzayc.zzd(parcel0, zzs0);
        this.zzda(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqr zzbqr0, zzbpk zzbpk0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqr0);
        zzayc.zzf(parcel0, zzbpk0);
        zzayc.zzd(parcel0, zzs0);
        this.zzda(21, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqu zzbqu0, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqu0);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqx zzbqx0, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqx0);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(18, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbqx zzbqx0, zzbpk zzbpk0, zzbfl zzbfl0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbqx0);
        zzayc.zzf(parcel0, zzbpk0);
        zzayc.zzd(parcel0, zzbfl0);
        this.zzda(22, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbra zzbra0, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbra0);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(20, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(String s, String s1, zzm zzm0, IObjectWrapper iObjectWrapper0, zzbra zzbra0, zzbpk zzbpk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        parcel0.writeString(s1);
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, iObjectWrapper0);
        zzayc.zzf(parcel0, zzbra0);
        zzayc.zzf(parcel0, zzbpk0);
        this.zzda(16, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        this.zzda(19, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(24, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(15, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        Parcel parcel1 = this.zzcZ(17, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

