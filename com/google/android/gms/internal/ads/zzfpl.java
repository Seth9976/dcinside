package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzfpl extends zzaya implements zzfpn {
    zzfpl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zze(IObjectWrapper iObjectWrapper0, String s, String s1) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        parcel0.writeString(s);
        parcel0.writeString(null);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zzf() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zzg(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(7, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zzh(int[] arr_v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeIntArray(null);
        this.zzda(4, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zzi(int v) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(v);
        this.zzda(6, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfpn
    public final void zzj(byte[] arr_b) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeByteArray(arr_b);
        this.zzda(5, parcel0);
    }
}

