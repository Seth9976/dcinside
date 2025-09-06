package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbad extends IInterface {
    zzby zze() throws RemoteException;

    @Nullable
    zzdy zzf() throws RemoteException;

    void zzg(boolean arg1) throws RemoteException;

    void zzh(zzdr arg1) throws RemoteException;

    void zzi(IObjectWrapper arg1, zzbak arg2) throws RemoteException;
}

