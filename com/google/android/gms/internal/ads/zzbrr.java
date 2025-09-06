package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

final class zzbrr implements MediationAppOpenAdCallback, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationRewardedAdCallback {
    final zzbpk zza;

    zzbrr(zzbpk zzbpk0) {
        this.zza = zzbpk0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        try {
            this.zza.zzf();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(AdError adError0) {
        try {
            zzo.zzj(("Mediated ad failed to show: Error Code = " + adError0.getCode() + ". Error Message = " + adError0.getMessage() + " Error Domain = " + adError0.getDomain()));
            zze zze0 = adError0.zza();
            this.zza.zzk(zze0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onAdFailedToShow(String s) {
        try {
            zzo.zzj(("Mediated ad failed to show: " + s));
            this.zza.zzl(s);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        try {
            this.zza.zzn();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        try {
            this.zza.zzp();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem0) {
        try {
            zzbxg zzbxg0 = new zzbxg(rewardItem0);
            this.zza.zzt(zzbxg0);
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationRewardedAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        try {
            this.zza.zzv();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        try {
            this.zza.zzw();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        try {
            this.zza.zzx();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        try {
            this.zza.zzy();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        try {
            this.zza.zze();
        }
        catch(RemoteException unused_ex) {
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        try {
            this.zza.zzm();
        }
        catch(RemoteException unused_ex) {
        }
    }
}

