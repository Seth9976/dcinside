package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

public interface zzci extends IInterface {
    @Nullable
    zzbad zze(String arg1) throws RemoteException;

    @Nullable
    zzby zzf(String arg1) throws RemoteException;

    @Nullable
    zzbwp zzg(String arg1) throws RemoteException;

    void zzh(zzbpe arg1) throws RemoteException;

    void zzi(List arg1, zzcf arg2) throws RemoteException;

    boolean zzj(String arg1) throws RemoteException;

    boolean zzk(String arg1) throws RemoteException;

    boolean zzl(String arg1) throws RemoteException;
}

