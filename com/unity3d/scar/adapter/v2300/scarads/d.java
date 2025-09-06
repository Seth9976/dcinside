package com.unity3d.scar.adapter.v2300.scarads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.unity3d.scar.adapter.common.g;

public class d extends b {
    class a extends AdListener {
        final d c;

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
            d.this.b.onAdClicked();
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
            d.this.b.onAdClosed();
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError0) {
            super.onAdFailedToLoad(loadAdError0);
            d.this.c.e();
            int v = loadAdError0.getCode();
            d.this.b.onAdFailedToLoad(v, loadAdError0.getMessage());
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
            d.this.b.onAdImpression();
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            d.this.b.onAdLoaded();
        }

        @Override  // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
            d.this.b.onAdOpened();
        }
    }

    private final g b;
    private final c c;
    private final AdListener d;

    public d(g g0, c c0) {
        this.d = new a(this);
        this.b = g0;
        this.c = c0;
    }

    public AdListener d() {
        return this.d;
    }
}

