package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

public class zzbd extends AdListener {
    private final Object zza;
    private AdListener zzb;

    public zzbd() {
        this.zza = new Object();
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdClosed();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError0) {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdFailedToLoad(loadAdError0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdImpression();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdLoaded();
            }
        }
    }

    @Override  // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized(this.zza) {
            AdListener adListener0 = this.zzb;
            if(adListener0 != null) {
                adListener0.onAdOpened();
            }
        }
    }

    public final void zza(AdListener adListener0) {
        synchronized(this.zza) {
            this.zzb = adListener0;
        }
    }
}

