package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;

final class zzfg extends zzbq {
    final zzfi zza;

    zzfg(zzfi zzfi0, zzfh zzfh0) {
        this.zza = zzfi0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    @Nullable
    public final String zze() throws RemoteException {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    @Nullable
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzm0) throws RemoteException {
        this.zzh(zzm0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzm0, int v) throws RemoteException {
        zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzff zzff0 = new zzff(this);
        zzf.zza.post(zzff0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        return false;
    }
}

