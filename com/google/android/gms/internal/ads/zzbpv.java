package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.common.internal.Preconditions;

public final class zzbpv implements MediationAppOpenAdCallback, MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback {
    private final zzbpk zza;

    public zzbpv(zzbpk zzbpk0) {
        this.zza = zzbpk0;
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(@NonNull AdError adError0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj(("Mediation ad failed to show: Error Code = " + adError0.getCode() + ". Error Message = " + adError0.getMessage() + " Error Domain = " + adError0.getDomain()));
        try {
            zze zze0 = adError0.zza();
            this.zza.zzk(zze0);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String s) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdFailedToShow.");
        zzo.zzj(("Mediation ad failed to show: " + s));
        try {
            this.zza.zzl(s);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdLeftApplication.");
        try {
            this.zza.zzn();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onAdOpened.");
        try {
            this.zza.zzp();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoComplete.");
        try {
            this.zza.zzu();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPause.");
        try {
            this.zza.zzw();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called onVideoPlay.");
        try {
            this.zza.zzx();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzo.zze("Adapter called reportAdImpression.");
        try {
            this.zza.zzm();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

