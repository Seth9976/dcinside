package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

public final class zzdz extends zzaya implements zzeb {
    zzdz(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        int v = parcel0.readInt();
        parcel0.recycle();
        return v;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() throws RemoteException {
        zzee zzee0;
        Parcel parcel0 = this.zzcZ(11, this.zza());
        IBinder iBinder0 = parcel0.readStrongBinder();
        if(iBinder0 == null) {
            zzee0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzee0 = iInterface0 instanceof zzee ? ((zzee)iInterface0) : new zzec(iBinder0);
        }
        parcel0.recycle();
        return zzee0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcel0 = this.zza();
        parcel0.writeInt(((int)z));
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        this.zzda(2, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        this.zzda(1, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzee0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, zzee0);
        this.zzda(8, parcel0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        this.zzda(13, this.zza());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        Parcel parcel0 = this.zzcZ(12, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        Parcel parcel0 = this.zzcZ(10, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }
}

