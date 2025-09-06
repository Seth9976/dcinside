package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbgr;

@VisibleForTesting
final class zze extends AdListener implements zzf, zzg, zzi {
    @VisibleForTesting
    final AbstractAdViewAdapter zza;
    @VisibleForTesting
    final MediationNativeListener zzb;

    public zze(AbstractAdViewAdapter abstractAdViewAdapter0, MediationNativeListener mediationNativeListener0) {
        this.zza = abstractAdViewAdapter0;
        this.zzb = mediationNativeListener0;
    }

    @Override  // com.google.android.gms.ads.AdListener
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
    public final void onAdImpression() {
        this.zzb.onAdImpression(this.zza);
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.zzb.onAdOpened(this.zza);
    }

    @Override  // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd0) {
        zza zza0 = new zza(unifiedNativeAd0);
        this.zzb.onAdLoaded(this.zza, zza0);
    }

    @Override  // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbgr zzbgr0, String s) {
        this.zzb.zze(this.zza, zzbgr0, s);
    }

    @Override  // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbgr zzbgr0) {
        this.zzb.zzd(this.zza, zzbgr0);
    }
}

