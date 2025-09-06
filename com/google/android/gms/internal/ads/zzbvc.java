package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

public interface zzbvc extends IInterface {
    void zze(zzbb arg1) throws RemoteException;

    @Deprecated
    void zzf(ParcelFileDescriptor arg1) throws RemoteException;

    void zzg(ParcelFileDescriptor arg1, zzbvk arg2) throws RemoteException;
}

