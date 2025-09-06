package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbrd extends IInterface {
    zzeb zze() throws RemoteException;

    zzbrs zzf() throws RemoteException;

    zzbrs zzg() throws RemoteException;

    void zzh(IObjectWrapper arg1, String arg2, Bundle arg3, Bundle arg4, zzs arg5, zzbrg arg6) throws RemoteException;

    void zzi(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqo arg5, zzbpk arg6) throws RemoteException;

    void zzj(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqr arg5, zzbpk arg6, zzs arg7) throws RemoteException;

    void zzk(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqr arg5, zzbpk arg6, zzs arg7) throws RemoteException;

    void zzl(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqu arg5, zzbpk arg6) throws RemoteException;

    void zzm(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqx arg5, zzbpk arg6) throws RemoteException;

    void zzn(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbqx arg5, zzbpk arg6, zzbfl arg7) throws RemoteException;

    void zzo(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbra arg5, zzbpk arg6) throws RemoteException;

    void zzp(String arg1, String arg2, zzm arg3, IObjectWrapper arg4, zzbra arg5, zzbpk arg6) throws RemoteException;

    void zzq(String arg1) throws RemoteException;

    boolean zzr(IObjectWrapper arg1) throws RemoteException;

    boolean zzs(IObjectWrapper arg1) throws RemoteException;

    boolean zzt(IObjectWrapper arg1) throws RemoteException;
}

