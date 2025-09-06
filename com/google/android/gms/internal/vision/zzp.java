package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzp extends zzb implements zzn {
    zzp(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    }

    @Override  // com.google.android.gms.internal.vision.zzn
    public final zzl zza(IObjectWrapper iObjectWrapper0, zzk zzk0) throws RemoteException {
        zzl zzl0;
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzk0);
        Parcel parcel1 = this.zza(1, parcel0);
        IBinder iBinder0 = parcel1.readStrongBinder();
        if(iBinder0 == null) {
            zzl0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            zzl0 = iInterface0 instanceof zzl ? ((zzl)iInterface0) : new zzo(iBinder0);
        }
        parcel1.recycle();
        return zzl0;
    }
}

