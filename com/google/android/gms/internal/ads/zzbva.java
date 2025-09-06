package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

public final class zzbva extends zzaya implements zzbvc {
    zzbva(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zze(zzbb zzbb0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, zzbb0);
        this.zzda(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, parcelFileDescriptor0);
        this.zzda(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor0, zzbvk zzbvk0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, parcelFileDescriptor0);
        zzayc.zzd(parcel0, zzbvk0);
        this.zzda(3, parcel0);
    }
}

