package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

@VisibleForTesting
final class zzb extends AdListener implements AppEventListener, zza {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationBannerListener zzb;

    public zzb(AbstractAdViewAdapter abstractAdViewAdapter0, MediationBannerListener mediationBannerListener0) {
        this.zza = abstractAdViewAdapter0;
        this.zzb = mediationBannerListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.onAdClicked(this.zza);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.zzb.onAdClosed(this.zza);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        this.zzb.onAdFailedToLoad(this.zza, loadAdError0);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzb.onAdLoaded(this.zza);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.zzb.onAdOpened(this.zza);
    }

    @Override  // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String s, String s1) {
        this.zzb.zzb(this.zza, s, s1);
    }
}

