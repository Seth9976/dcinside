package com.google.android.gms.internal.clearcut;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zzc;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public interface zzl extends IInterface {
    void zza(Status arg1) throws RemoteException;

    void zza(Status arg1, long arg2) throws RemoteException;

    void zza(Status arg1, zzc arg2) throws RemoteException;

    void zza(Status arg1, zze[] arg2) throws RemoteException;

    void zza(DataHolder arg1) throws RemoteException;

    void zzb(Status arg1) throws RemoteException;

    void zzb(Status arg1, long arg2) throws RemoteException;

    void zzb(Status arg1, zzc arg2) throws RemoteException;

    void zzc(Status arg1) throws RemoteException;
}

