package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;

final class zzbro implements SignalCallbacks {
    final zzbrg zza;

    zzbro(zzbrq zzbrq0, zzbrg zzbrg0) {
        this.zza = zzbrg0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(AdError adError0) {
        try {
            zze zze0 = adError0.zza();
            this.zza.zzg(zze0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onFailure(String s) {
        try {
            this.zza.zzf(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.rtb.SignalCallbacks
    public final void onSuccess(String s) {
        try {
            this.zza.zze(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }
}

