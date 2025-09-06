package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfu extends zzaya implements zzbfw {
    zzbfu(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        double f = parcel0.readDouble();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final Uri zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        Uri uri0 = (Uri)zzayc.zza(parcel0, Uri.CREATOR);
        parcel0.recycle();
        return uri0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }
}

