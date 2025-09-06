package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbsx extends IInterface {
    void zze(Intent arg1) throws RemoteException;

    void zzf(String[] arg1, int[] arg2, IObjectWrapper arg3) throws RemoteException;

    void zzg(IObjectWrapper arg1) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi(IObjectWrapper arg1, String arg2, String arg3) throws RemoteException;

    void zzj(IObjectWrapper arg1, zza arg2) throws RemoteException;
}

