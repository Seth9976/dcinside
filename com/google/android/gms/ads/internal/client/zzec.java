package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;

public final class zzec extends zzaya implements zzee {
    zzec(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws RemoteException {
        this.zzda(4, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(5, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws RemoteException {
        this.zzda(3, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws RemoteException {
        this.zzda(1, this.zza());
    }
}

