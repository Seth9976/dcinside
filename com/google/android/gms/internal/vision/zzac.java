package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzac extends zzb implements zzad {
    zzac(IBinder iBinder0) {
        super(iBinder0, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
    }

    @Override  // com.google.android.gms.internal.vision.zzad
    public final zzah[] zza(IObjectWrapper iObjectWrapper0, zzs zzs0, zzaj zzaj0) throws RemoteException {
        Parcel parcel0 = this.a_();
        zzd.zza(parcel0, iObjectWrapper0);
        zzd.zza(parcel0, zzs0);
        zzd.zza(parcel0, zzaj0);
        Parcel parcel1 = this.zza(3, parcel0);
        zzah[] arr_zzah = (zzah[])parcel1.createTypedArray(zzah.CREATOR);
        parcel1.recycle();
        return arr_zzah;
    }

    @Override  // com.google.android.gms.internal.vision.zzad
    public final void zzb() throws RemoteException {
        this.zzb(2, this.a_());
    }
}

