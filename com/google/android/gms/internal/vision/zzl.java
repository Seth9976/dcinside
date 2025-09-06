package com.google.android.gms.internal.vision;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;

public interface zzl extends IInterface {
    void zza() throws RemoteException;

    Barcode[] zza(IObjectWrapper arg1, zzs arg2) throws RemoteException;

    Barcode[] zzb(IObjectWrapper arg1, zzs arg2) throws RemoteException;
}

