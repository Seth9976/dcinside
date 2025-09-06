package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzd;

public final class zzk extends zzb implements zzi {
    zzk(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    @Override  // com.google.android.gms.vision.face.internal.client.zzi
    public final zzh newFaceDetector(IObjectWrapper iObjectWrapper0, zzf zzf0) throws RemoteException {
        zzh zzh0;
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzf0);
        Parcel parcel1 = this.zza(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzh0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
            zzh0 = iInterface0 instanceof zzh ? ((zzh)iInterface0) : new zzj(iBinder0);
        }
        parcel1.recycle();
        return zzh0;
    }
}

