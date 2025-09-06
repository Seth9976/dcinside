package com.kakao.adfit.ads;

public interface AdListener {
    void onAdClicked();

    void onAdFailed(int arg1);

    void onAdLoaded();
}

