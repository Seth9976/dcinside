package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;

public final class zzo extends zzb implements zzl {
    zzo(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    @Override  // com.google.android.gms.internal.vision.zzl
    public final void zza() throws RemoteException {
        this.zzb(3, this.a_());
    }

    @Override  // com.google.android.gms.internal.vision.zzl
    public final Barcode[] zza(IObjectWrapper iObjectWrapper0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzs0);
        Parcel parcel1 = this.zza(1, parcel0);
        Barcode[] arr_barcode = (Barcode[])parcel1.createTypedArray(Barcode.CREATOR);
        parcel1.recycle();
        return arr_barcode;
    }

    @Override  // com.google.android.gms.internal.vision.zzl
    public final Barcode[] zzb(IObjectWrapper iObjectWrapper0, zzs zzs0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzs0);
        Parcel parcel1 = this.zza(2, parcel0);
        Barcode[] arr_barcode = (Barcode[])parcel1.createTypedArray(Barcode.CREATOR);
        parcel1.recycle();
        return arr_barcode;
    }
}

