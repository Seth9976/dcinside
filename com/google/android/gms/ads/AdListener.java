package com.google.android.gms.ads;

import androidx.annotation.NonNull;

public abstract class AdListener {
    public void onAdClicked() {
    }

    public void onAdClosed() {
    }

    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError0) {
    }

    public void onAdImpression() {
    }

    public void onAdLoaded() {
    }

    public void onAdOpened() {
    }

    public void onAdSwipeGestureClicked() {
    }
}

