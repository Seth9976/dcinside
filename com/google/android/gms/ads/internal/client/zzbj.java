package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzbj extends zzaya implements zzbl {
    zzbj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        this.zzda(6, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(zze zze0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zze0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() throws RemoteException {
        this.zzda(7, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() throws RemoteException {
        this.zzda(9, this.zza());
    }
}

