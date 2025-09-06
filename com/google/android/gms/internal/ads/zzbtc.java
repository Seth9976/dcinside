package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbtc extends zzaya implements zzbte {
    zzbtc(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() throws RemoteException {
        Parcel parcel0 = this.zzcZ(11, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int v, int v1, Intent intent0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        zzayc.zzd(parcel0, intent0);
        this.zzda(12, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzi() throws RemoteException {
        this.zzda(10, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzk(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(13, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzl(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzm() throws RemoteException {
        this.zzda(8, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzo() throws RemoteException {
        this.zzda(5, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int v, String[] arr_s, int[] arr_v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        parcel0.writeStringArray(arr_s);
        parcel0.writeIntArray(arr_v);
        this.zzda(15, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzq() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzr() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzs(Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        Parcel parcel1 = this.zzcZ(6, parcel0);
        if(parcel1.readInt() != 0) {
            bundle0.readFromParcel(parcel1);
        }
        parcel1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzt() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzu() throws RemoteException {
        this.zzda(7, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzv() throws RemoteException {
        this.zzda(14, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzbte
    public final void zzx() throws RemoteException {
        this.zzda(9, this.zza());
    }
}

