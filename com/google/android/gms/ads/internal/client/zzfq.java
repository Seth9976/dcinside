package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxd;

public final class zzfq extends zzbwo {
    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final zzdy zzc() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final zzbwm zzd() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        return "";
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(zzm zzm0, zzbww zzbww0) throws RemoteException {
        zzfq.zzr(zzbww0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(zzm zzm0, zzbww zzbww0) throws RemoteException {
        zzfq.zzr(zzbww0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(zzdo zzdo0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(zzdr zzdr0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbws0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxd0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) {
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwx0) throws RemoteException {
    }

    private static void zzr(zzbww zzbww0) {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzfp zzfp0 = new zzfp(zzbww0);
        zzf.zza.post(zzfp0);
    }
}

