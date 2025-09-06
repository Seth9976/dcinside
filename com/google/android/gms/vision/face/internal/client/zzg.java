package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.internal.vision.zza;
import com.google.android.gms.internal.vision.zzd;
import com.google.android.gms.internal.vision.zzs;

public abstract class zzg extends zza implements zzh {
    public zzg() {
        super("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
    }

    @Override  // com.google.android.gms.internal.vision.zza
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                FaceParcel[] arr_faceParcel = this.zza(Stub.asInterface(parcel0.readStrongBinder()), ((zzs)zzd.zza(parcel0, zzs.CREATOR)));
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_faceParcel, 1);
                return true;
            }
            case 2: {
                boolean z = this.zza(parcel0.readInt());
                parcel1.writeNoException();
                zzd.zza(parcel1, z);
                return true;
            }
            case 3: {
                this.zza();
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                FaceParcel[] arr_faceParcel1 = this.zza(Stub.asInterface(parcel0.readStrongBinder()), Stub.asInterface(parcel0.readStrongBinder()), Stub.asInterface(parcel0.readStrongBinder()), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), ((zzs)zzd.zza(parcel0, zzs.CREATOR)));
                parcel1.writeNoException();
                parcel1.writeTypedArray(arr_faceParcel1, 1);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

