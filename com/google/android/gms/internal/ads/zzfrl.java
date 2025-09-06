package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzfrl extends zzaya implements zzfrn {
    zzfrl(IBinder iBinder0) {
        super(iBinder0, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override  // com.google.android.gms.internal.ads.zzfrn
    public final void zze(Bundle bundle0, zzfrp zzfrp0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        zzayc.zzf(parcel0, zzfrp0);
        this.zzdb(2, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrn
    public final void zzf(String s, Bundle bundle0, zzfrp zzfrp0) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeString(s);
        zzayc.zzd(parcel0, bundle0);
        zzayc.zzf(parcel0, zzfrp0);
        this.zzdb(1, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfrn
    public final void zzg(Bundle bundle0, zzfrp zzfrp0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzd(parcel0, bundle0);
        zzayc.zzf(parcel0, zzfrp0);
        this.zzdb(3, parcel0);
    }
}

