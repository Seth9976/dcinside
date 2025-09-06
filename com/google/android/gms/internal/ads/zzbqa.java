package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;

final class zzbqa implements MediationAdLoadCallback {
    final zzbpk zza;
    final zzbqf zzb;

    zzbqa(zzbqf zzbqf0, zzbpk zzbpk0) {
        this.zza = zzbpk0;
        this.zzb = zzbqf0;
        super();
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError0) {
        try {
            zzo.zze((this.zzb.zza.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError0.getCode() + ". ErrorMessage = " + adError0.getMessage() + ". ErrorDomain = " + adError0.getDomain()));
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
        MediationInterstitialAd mediationInterstitialAd0 = (MediationInterstitialAd)object0;
        try {
            this.zzb.zzf = mediationInterstitialAd0;
            this.zza.zzo();
            return new zzbpv(this.zza);
        }
        catch(RemoteException remoteException0) {
            zzo.zzh("", remoteException0);
            return new zzbpv(this.zza);
        }
    }
}

