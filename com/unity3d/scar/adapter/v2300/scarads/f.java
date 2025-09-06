package com.unity3d.scar.adapter.v2300.scarads;

import P2.c;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.unity3d.scar.adapter.common.h;

public class f extends b {
    class a extends InterstitialAdLoadCallback {
        final f c;

        @Override  // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError0) {
            super.onAdFailedToLoad(loadAdError0);
            f.this.c.onAdFailedToLoad(loadAdError0.getCode(), loadAdError0.toString());
        }

        public void onAdLoaded(@NonNull InterstitialAd interstitialAd0) {
            super.onAdLoaded(interstitialAd0);
            f.this.c.onAdLoaded();
            interstitialAd0.setFullScreenContentCallback(f.this.e);
            f.this.b.d(interstitialAd0);
            c c0 = f.this.a;
            if(c0 != null) {
                c0.onAdLoaded();
            }
        }

        @Override  // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull Object object0) {
            this.onAdLoaded(((InterstitialAd)object0));
        }
    }

    class com.unity3d.scar.adapter.v2300.scarads.f.b extends FullScreenContentCallback {
        final f c;

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            f.this.c.onAdClicked();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            f.this.c.onAdClosed();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError0) {
            super.onAdFailedToShowFullScreenContent(adError0);
            int v = adError0.getCode();
            f.this.c.onAdFailedToShow(v, adError0.toString());
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            f.this.c.onAdImpression();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            f.this.c.onAdOpened();
        }
    }

    private final e b;
    private final h c;
    private final InterstitialAdLoadCallback d;
    private final FullScreenContentCallback e;

    public f(h h0, e e0) {
        this.d = new a(this);
        this.e = new com.unity3d.scar.adapter.v2300.scarads.f.b(this);
        this.c = h0;
        this.b = e0;
    }

    public InterstitialAdLoadCallback e() {
        return this.d;
    }
}

