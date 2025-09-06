package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

public final class zzcg extends zzaya implements zzci {
    zzcg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzbad zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(5, parcel0);
        zzbad zzbad0 = zzbac.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbad0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String s) throws RemoteException {
        zzby zzby0;
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(7, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzby0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzby0 = iInterface0 instanceof zzby ? ((zzby)iInterface0) : new zzbw(iBinder0);
        }
        parcel1.recycle();
        return zzby0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final zzbwp zzg(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        zzbwp zzbwp0 = zzbwo.zzq(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbwp0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpe zzbpe0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzbpe0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list0, zzcf zzcf0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeTypedList(list0);
        zzayc.zzf(parcel0, zzcf0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(4, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(6, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

