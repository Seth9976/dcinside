package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.zza;
import java.util.Set;

public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, OnImmersiveModeUpdatedListener, zza {
    @NonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdLoader adLoader;
    @NonNull
    protected AdView mAdView;
    @NonNull
    protected InterstitialAd mInterstitialAd;

    AdRequest buildAdRequest(Context context0, MediationAdRequest mediationAdRequest0, Bundle bundle0, Bundle bundle1) {
        Builder adRequest$Builder0 = new Builder();
        Set set0 = mediationAdRequest0.getKeywords();
        if(set0 != null) {
            for(Object object0: set0) {
                adRequest$Builder0.addKeyword(((String)object0));
            }
        }
        if(mediationAdRequest0.isTesting()) {
            adRequest$Builder0.zza(zzf.zzy(context0));
        }
        boolean z = true;
        if(mediationAdRequest0.taggedForChildDirectedTreatment() != -1) {
            if(mediationAdRequest0.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            adRequest$Builder0.zzd(z);
        }
        adRequest$Builder0.zzb(mediationAdRequest0.isDesignedForFamilies());
        Bundle bundle2 = this.buildExtrasBundle(bundle0, bundle1);
        adRequest$Builder0.addNetworkExtrasBundle(AdMobAdapter.class, bundle2);
        return adRequest$Builder0.build();
    }

    @NonNull
    protected abstract Bundle buildExtrasBundle(@NonNull Bundle arg1, @NonNull Bundle arg2);

    @NonNull
    public String getAdUnitId(@NonNull Bundle bundle0) {
        return bundle0.getString("pubid");
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.mAdView;
    }

    @VisibleForTesting
    InterstitialAd getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override  // com.google.android.gms.ads.mediation.zza
    @Nullable
    public zzeb getVideoController() {
        return this.mAdView == null ? null : this.mAdView.zza().zza();
    }

    @VisibleForTesting
    com.google.android.gms.ads.AdLoader.Builder newAdLoader(Context context0, String s) {
        return new com.google.android.gms.ads.AdLoader.Builder(context0, s);
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.destroy();
            this.mAdView = null;
        }
        if(this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if(this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override  // com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener
    public void onImmersiveModeUpdated(boolean z) {
        InterstitialAd interstitialAd0 = this.mInterstitialAd;
        if(interstitialAd0 != null) {
            interstitialAd0.setImmersiveMode(z);
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.pause();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        AdView adView0 = this.mAdView;
        if(adView0 != null) {
            adView0.resume();
        }
    }

    @Override  // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context0, @NonNull MediationBannerListener mediationBannerListener0, @NonNull Bundle bundle0, @NonNull AdSize adSize0, @NonNull MediationAdRequest mediationAdRequest0, @NonNull Bundle bundle1) {
        AdView adView0 = new AdView(context0);
        this.mAdView = adView0;
        adView0.setAdSize(new AdSize(adSize0.getWidth(), adSize0.getHeight()));
        this.mAdView.setAdUnitId(this.getAdUnitId(bundle0));
        this.mAdView.setAdListener(new zzb(this, mediationBannerListener0));
        this.mAdView.loadAd(this.buildAdRequest(context0, mediationAdRequest0, bundle1, bundle0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context0, @NonNull MediationInterstitialListener mediationInterstitialListener0, @NonNull Bundle bundle0, @NonNull MediationAdRequest mediationAdRequest0, @NonNull Bundle bundle1) {
        InterstitialAd.load(context0, this.getAdUnitId(bundle0), this.buildAdRequest(context0, mediationAdRequest0, bundle1, bundle0), new zzc(this, mediationInterstitialListener0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@NonNull Context context0, @NonNull MediationNativeListener mediationNativeListener0, @NonNull Bundle bundle0, @NonNull NativeMediationAdRequest nativeMediationAdRequest0, @NonNull Bundle bundle1) {
        zze zze0 = new zze(this, mediationNativeListener0);
        com.google.android.gms.ads.AdLoader.Builder adLoader$Builder0 = this.newAdLoader(context0, bundle0.getString("pubid")).withAdListener(zze0);
        adLoader$Builder0.zzc(nativeMediationAdRequest0.getNativeAdOptions());
        adLoader$Builder0.withNativeAdOptions(nativeMediationAdRequest0.getNativeAdRequestOptions());
        if(nativeMediationAdRequest0.isUnifiedNativeAdRequested()) {
            adLoader$Builder0.zzb(zze0);
        }
        if(nativeMediationAdRequest0.zzb()) {
            for(Object object0: nativeMediationAdRequest0.zza().keySet()) {
                adLoader$Builder0.zza(((String)object0), zze0, (((Boolean)nativeMediationAdRequest0.zza().get(((String)object0))).booleanValue() ? zze0 : null));
            }
        }
        AdLoader adLoader0 = adLoader$Builder0.build();
        this.adLoader = adLoader0;
        adLoader0.loadAd(this.buildAdRequest(context0, nativeMediationAdRequest0, bundle1, bundle0));
    }

    @Override  // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        InterstitialAd interstitialAd0 = this.mInterstitialAd;
        if(interstitialAd0 != null) {
            interstitialAd0.show(null);
        }
    }
}

