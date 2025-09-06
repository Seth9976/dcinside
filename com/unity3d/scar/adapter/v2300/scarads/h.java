package com.unity3d.scar.adapter.v2300.scarads;

import P2.c;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.unity3d.scar.adapter.common.i;

public class h extends b {
    class a extends RewardedAdLoadCallback {
        final h c;

        @Override  // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(@NonNull LoadAdError loadAdError0) {
            super.onAdFailedToLoad(loadAdError0);
            h.this.c.onAdFailedToLoad(loadAdError0.getCode(), loadAdError0.toString());
        }

        public void onAdLoaded(@NonNull RewardedAd rewardedAd0) {
            super.onAdLoaded(rewardedAd0);
            h.this.c.onAdLoaded();
            rewardedAd0.setFullScreenContentCallback(h.this.f);
            h.this.b.d(rewardedAd0);
            c c0 = h.this.a;
            if(c0 != null) {
                c0.onAdLoaded();
            }
        }

        @Override  // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(@NonNull Object object0) {
            this.onAdLoaded(((RewardedAd)object0));
        }
    }

    class com.unity3d.scar.adapter.v2300.scarads.h.b implements OnUserEarnedRewardListener {
        final h a;

        @Override  // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(@NonNull RewardItem rewardItem0) {
            h.this.c.onUserEarnedReward();
        }
    }

    class com.unity3d.scar.adapter.v2300.scarads.h.c extends FullScreenContentCallback {
        final h c;

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            super.onAdClicked();
            h.this.c.onAdClicked();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            super.onAdDismissedFullScreenContent();
            h.this.c.onAdClosed();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(@NonNull AdError adError0) {
            super.onAdFailedToShowFullScreenContent(adError0);
            int v = adError0.getCode();
            h.this.c.onAdFailedToShow(v, adError0.toString());
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            super.onAdImpression();
            h.this.c.onAdImpression();
        }

        @Override  // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            super.onAdShowedFullScreenContent();
            h.this.c.onAdOpened();
        }
    }

    private final g b;
    private final i c;
    private final RewardedAdLoadCallback d;
    private final OnUserEarnedRewardListener e;
    private final FullScreenContentCallback f;

    public h(i i0, g g0) {
        this.d = new a(this);
        this.e = new com.unity3d.scar.adapter.v2300.scarads.h.b(this);
        this.f = new com.unity3d.scar.adapter.v2300.scarads.h.c(this);
        this.c = i0;
        this.b = g0;
    }

    public RewardedAdLoadCallback e() {
        return this.d;
    }

    public OnUserEarnedRewardListener f() {
        return this.e;
    }
}

