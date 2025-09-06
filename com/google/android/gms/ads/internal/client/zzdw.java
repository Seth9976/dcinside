package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import java.util.List;

public final class zzdw extends zzaya implements zzdy {
    zzdw(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        Bundle bundle0 = (Bundle)zzayc.zza(parcel0, Bundle.CREATOR);
        parcel0.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        zzw zzw0 = (zzw)zzayc.zza(parcel0, zzw.CREATOR);
        parcel0.recycle();
        return zzw0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(1, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(6, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = parcel0.createTypedArrayList(zzw.CREATOR);
        parcel0.recycle();
        return list0;
    }
}

