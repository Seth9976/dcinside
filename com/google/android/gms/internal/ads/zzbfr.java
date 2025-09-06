package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbfr extends zzaya implements zzbft {
    zzbfr(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        Parcel parcel0 = this.zzcZ(2, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zzf() throws RemoteException {
        Parcel parcel0 = this.zzcZ(6, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final float zzg() throws RemoteException {
        Parcel parcel0 = this.zzcZ(5, this.zza());
        float f = parcel0.readFloat();
        parcel0.recycle();
        return f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final zzeb zzh() throws RemoteException {
        Parcel parcel0 = this.zzcZ(7, this.zza());
        zzeb zzeb0 = zzea.zzb(parcel0.readStrongBinder());
        parcel0.recycle();
        return zzeb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final IObjectWrapper zzi() throws RemoteException {
        Parcel parcel0 = this.zzcZ(4, this.zza());
        IObjectWrapper iObjectWrapper0 = Stub.asInterface(parcel0.readStrongBinder());
        parcel0.recycle();
        return iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Parcel parcel0 = this.zza();
        zzayc.zzf(parcel0, iObjectWrapper0);
        this.zzda(3, parcel0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        Parcel parcel0 = this.zzcZ(10, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        Parcel parcel0 = this.zzcZ(8, this.zza());
        boolean z = zzayc.zzg(parcel0);
        parcel0.recycle();
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbhe0) throws RemoteException {
        throw null;
    }
}

