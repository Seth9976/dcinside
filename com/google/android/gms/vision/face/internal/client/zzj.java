package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzd;
import com.google.android.gms.internal.vision.zzs;

public final class zzj extends zzb implements zzh {
    zzj(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override  // com.google.android.gms.vision.face.internal.client.zzh
    public final void zza() throws RemoteException {
        this.zzb(3, this.a_());
    }

    @Override  // com.google.android.gms.vision.face.internal.client.zzh
    public final boolean zza(int v) throws RemoteException {
        Parcel parcel0 = this.a_();
        parcel0.writeInt(v);
        Parcel parcel1 = this.zza(2, parcel0);
        boolean z = zzd.zza(parcel1);
        parcel1.recycle();
        return z;
    }

    @Override  // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper0, IObjectWrapper iObjectWrapper1, IObjectWrapper iObjectWrapper2, int v, int v1, int v2, int v3, int v4, int v5, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, iObjectWrapper1);
        zzd.zza(parcel0, iObjectWrapper2);
        parcel0.writeInt(v);
        parcel0.writeInt(v1);
        parcel0.writeInt(v2);
        parcel0.writeInt(v3);
        parcel0.writeInt(v4);
        parcel0.writeInt(v5);
        zzd.zza(parcel0, zzs0);
        Parcel parcel1 = this.zza(4, parcel0);
        FaceParcel[] arr_faceParcel = (FaceParcel[])parcel1.createTypedArray(FaceParcel.CREATOR);
        parcel1.recycle();
        return arr_faceParcel;
    }

    @Override  // com.google.android.gms.vision.face.internal.client.zzh
    public final FaceParcel[] zza(IObjectWrapper iObjectWrapper0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzs0);
        Parcel parcel1 = this.zza(1, parcel0);
        FaceParcel[] arr_faceParcel = (FaceParcel[])parcel1.createTypedArray(FaceParcel.CREATOR);
        parcel1.recycle();
        return arr_faceParcel;
    }
}

