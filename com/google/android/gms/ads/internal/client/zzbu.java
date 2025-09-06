package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmi;

public interface zzbu extends IInterface {
    zzbr zze() throws RemoteException;

    void zzf(zzbgu arg1) throws RemoteException;

    void zzg(zzbgx arg1) throws RemoteException;

    void zzh(String arg1, zzbhd arg2, @Nullable zzbha arg3) throws RemoteException;

    void zzi(zzbmi arg1) throws RemoteException;

    void zzj(zzbhh arg1, zzs arg2) throws RemoteException;

    void zzk(zzbhk arg1) throws RemoteException;

    void zzl(zzbl arg1) throws RemoteException;

    void zzm(AdManagerAdViewOptions arg1) throws RemoteException;

    void zzn(zzblz arg1) throws RemoteException;

    void zzo(zzbfl arg1) throws RemoteException;

    void zzp(PublisherAdViewOptions arg1) throws RemoteException;

    void zzq(zzcq arg1) throws RemoteException;
}

