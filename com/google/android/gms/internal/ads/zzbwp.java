package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;

public interface zzbwp extends IInterface {
    Bundle zzb() throws RemoteException;

    zzdy zzc() throws RemoteException;

    zzbwm zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(zzm arg1, zzbww arg2) throws RemoteException;

    void zzg(zzm arg1, zzbww arg2) throws RemoteException;

    void zzh(boolean arg1) throws RemoteException;

    void zzi(zzdo arg1) throws RemoteException;

    void zzj(zzdr arg1) throws RemoteException;

    void zzk(zzbws arg1) throws RemoteException;

    void zzl(zzbxd arg1) throws RemoteException;

    void zzm(IObjectWrapper arg1) throws RemoteException;

    void zzn(IObjectWrapper arg1, boolean arg2) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbwx arg1) throws RemoteException;
}

