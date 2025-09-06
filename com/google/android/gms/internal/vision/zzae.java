package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzae extends zzb implements zzaf {
    zzae(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
    }

    @Override  // com.google.android.gms.internal.vision.zzaf
    public final zzad zza(IObjectWrapper iObjectWrapper0, zzam zzam0) throws RemoteException {
        zzad zzad0;
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzam0);
        Parcel parcel1 = this.zza(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzad0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
            zzad0 = iInterface0 instanceof zzad ? ((zzad)iInterface0) : new zzac(iBinder0);
        }
        parcel1.recycle();
        return zzad0;
    }
}

