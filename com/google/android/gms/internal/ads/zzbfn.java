package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public final class zzbfn extends zzaya implements zzbfp {
    zzbfn(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override  // com.google.android.gms.internal.ads.zzbfp
    public final String zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        String s = parcel0.readString();
        parcel0.recycle();
        return s;
    }

    @Override  // com.google.android.gms.internal.ads.zzbfp
    public final List zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(3, this.zza());
        List list0 = zzayc.zzb(parcel0);
        parcel0.recycle();
        return list0;
    }
}

