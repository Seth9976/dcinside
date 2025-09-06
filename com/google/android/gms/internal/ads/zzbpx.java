package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

final class zzbpx implements MediationAdLoadCallback {
    final zzbpk zza;
    final Adapter zzb;
    final zzbqf zzc;

    zzbpx(zzbqf zzbqf0, zzbpk zzbpk0, Adapter adapter0) {
        this.zza = zzbpk0;
        this.zzb = adapter0;
        this.zzc = zzbqf0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(@NonNull AdError adError0) {
        try {
            zzo.zze((this.zzb.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
            zze zze0 = adError0.zza();
            this.zza.zzh(zze0);
            int v = adError0.getCode();
            this.zza.zzi(v, adError0.getMessage());
            int v1 = adError0.getCode();
            this.zza.zzg(v1);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String s) {
        this.onFailure(new AdError(0, s, "undefined"));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final Object onSuccess(Object object0) {
        MediationInterscrollerAd mediationInterscrollerAd0 = (MediationInterscrollerAd)object0;
        try {
            this.zzc.zzj = mediationInterscrollerAd0;
            this.zza.zzo();
            return new zzbpv(this.zza);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return new zzbpv(this.zza);
        }
    }
}

