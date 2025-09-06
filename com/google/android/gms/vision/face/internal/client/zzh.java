package com.google.android.gms.vision.face.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzs;

public interface zzh extends IInterface {
    void zza() throws RemoteException;

    boolean zza(int arg1) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper arg1, IObjectWrapper arg2, IObjectWrapper arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, zzs arg10) throws RemoteException;

    FaceParcel[] zza(IObjectWrapper arg1, zzs arg2) throws RemoteException;
}

