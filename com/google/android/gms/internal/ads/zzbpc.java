package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbpc extends zzaya implements zzbpe {
    zzbpc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override  // com.google.android.gms.internal.ads.zzbpe
    public final zzbph zzb(String s) throws RemoteException {
        zzbph zzbph0;
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzbph0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbph0 = iInterface0 instanceof zzbph ? ((zzbph)iInterface0) : new zzbpf(iBinder0);
        }
        parcel1.recycle();
        return zzbph0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpe
    public final zzbrd zzc(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(3, parcel0);
        zzbrd zzbrd0 = zzbrc.zzb(parcel1.readStrongBinder());
        parcel1.recycle();
        return zzbrd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpe
    public final boolean zzd(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(4, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbpe
    public final boolean zze(String s) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        Parcel parcel1 = this.zzcZ(2, parcel0);
        boolean z = zzayc.zzg(parcel1);
        parcel1.recycle();
        return z;
    }
}

