package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbwn extends zzaya implements zzbwp {
    zzbwn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        Parcel parcel0 = this.zzcZ(9, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final zzdy zzc() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        zzdy zzdy0 = zzdx.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzdy0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zzd() throws RemoteException {
        zzbwm zzbwm0;
        Parcel parcel0 = this.zzcZ(11, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzbwm0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwm0 = iInterface0 instanceof zzbwm ? ((zzbwm)iInterface0) : new zzbwk(iBinder0);
        }
        parcel0.recycle();
        return zzbwm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(zzm zzm0, zzbww zzbww0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, zzbww0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(zzm zzm0, zzbww zzbww0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzm0);
        zzayc.zzf(parcel0, zzbww0);
        this.zzda(14, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(zzdo zzdo0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdo0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(zzdr zzdr0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzdr0);
        this.zzda(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbws0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbws0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxd0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbxd0);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwx0) throws RemoteException {
        throw null;
    }
}

