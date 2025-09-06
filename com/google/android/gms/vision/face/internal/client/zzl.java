package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.vision.zza;
import com.google.android.gms.internal.vision.zzd;

public abstract class zzl extends zza implements zzi {
    public zzl() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    }

    public static zzi asInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
        return iInterface0 instanceof zzi ? ((zzi)iInterface0) : new zzk(iBinder0);
    }

    @Override  // com.google.android.gms.internal.vision.zza
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1) {
            zzh zzh0 = this.newFaceDetector(Stub.asInterface(parcel0.readStrongBinder()), ((zzf)zzd.zza(parcel0, zzf.CREATOR)));
            parcel1.writeNoException();
            zzd.zza(parcel1, zzh0);
            return true;
        }
        return false;
    }
}

